package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class ViewOverlayApi14 implements ViewOverlayImpl {
    protected OverlayViewGroup mOverlayViewGroup;

    static class OverlayViewGroup extends ViewGroup {
        static Method sInvalidateChildInParentFastMethod;
        ArrayList<Drawable> mDrawables = null;
        ViewGroup mHostView;
        View mRequestingView;
        ViewOverlayApi14 mViewOverlay;

        static class TouchInterceptor extends View {
            TouchInterceptor(Context context) {
                super(context);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* Access modifiers changed, original: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        static {
            try {
                sInvalidateChildInParentFastMethod = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        OverlayViewGroup(Context context, ViewGroup viewGroup, View view, ViewOverlayApi14 viewOverlayApi14) {
            super(context);
            this.mHostView = viewGroup;
            this.mRequestingView = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.mViewOverlay = viewOverlayApi14;
        }

        public void add(Drawable drawable) {
            if (this.mDrawables == null) {
                this.mDrawables = new ArrayList();
            }
            if (!this.mDrawables.contains(drawable)) {
                this.mDrawables.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        public void remove(Drawable drawable) {
            ArrayList arrayList = this.mDrawables;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
            }
        }

        /* Access modifiers changed, original: protected */
        public boolean verifyDrawable(@NonNull Drawable drawable) {
            if (!super.verifyDrawable(drawable)) {
                ArrayList arrayList = this.mDrawables;
                if (arrayList == null || !arrayList.contains(drawable)) {
                    return false;
                }
            }
            return true;
        }

        public void add(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.mHostView || viewGroup.getParent() == null || !ViewCompat.isAttachedToWindow(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.mHostView.getLocationOnScreen(iArr2);
                    ViewCompat.offsetLeftAndRight(view, iArr[0] - iArr2[0]);
                    ViewCompat.offsetTopAndBottom(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        public void remove(View view) {
            super.removeView(view);
            if (isEmpty()) {
                this.mHostView.removeView(this);
            }
        }

        public void clear() {
            removeAllViews();
            ArrayList arrayList = this.mDrawables;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean isEmpty() {
            if (getChildCount() == 0) {
                ArrayList arrayList = this.mDrawables;
                if (arrayList == null || arrayList.size() == 0) {
                    return true;
                }
            }
            return false;
        }

        public void invalidateDrawable(@NonNull Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* Access modifiers changed, original: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.mHostView.getLocationOnScreen(iArr);
            this.mRequestingView.getLocationOnScreen(iArr2);
            int i = 0;
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.mRequestingView.getWidth(), this.mRequestingView.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList arrayList = this.mDrawables;
            int size = arrayList == null ? 0 : arrayList.size();
            while (i < size) {
                ((Drawable) this.mDrawables.get(i)).draw(canvas);
                i++;
            }
        }

        private void getOffset(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.mHostView.getLocationOnScreen(iArr2);
            this.mRequestingView.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void invalidateChildFast(View view, Rect rect) {
            if (this.mHostView != null) {
                int left = view.getLeft();
                int top = view.getTop();
                int[] iArr = new int[2];
                getOffset(iArr);
                rect.offset(left + iArr[0], top + iArr[1]);
                this.mHostView.invalidate(rect);
            }
        }

        /* Access modifiers changed, original: protected */
        @RestrictTo({Scope.LIBRARY_GROUP})
        public ViewParent invalidateChildInParentFast(int i, int i2, Rect rect) {
            if ((this.mHostView instanceof ViewGroup) && sInvalidateChildInParentFastMethod != null) {
                try {
                    getOffset(new int[2]);
                    sInvalidateChildInParentFastMethod.invoke(this.mHostView, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), rect});
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            }
            return null;
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.mHostView != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.mHostView instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    getOffset(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }
    }

    ViewOverlayApi14(Context context, ViewGroup viewGroup, View view) {
        this.mOverlayViewGroup = new OverlayViewGroup(context, viewGroup, view, this);
    }

    static ViewGroup getContentView(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    static ViewOverlayApi14 createFrom(View view) {
        ViewGroup contentView = getContentView(view);
        if (contentView == null) {
            return null;
        }
        int childCount = contentView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = contentView.getChildAt(i);
            if (childAt instanceof OverlayViewGroup) {
                return ((OverlayViewGroup) childAt).mViewOverlay;
            }
        }
        return new ViewGroupOverlayApi14(contentView.getContext(), contentView, view);
    }

    /* Access modifiers changed, original: 0000 */
    public ViewGroup getOverlayView() {
        return this.mOverlayViewGroup;
    }

    public void add(@NonNull Drawable drawable) {
        this.mOverlayViewGroup.add(drawable);
    }

    public void clear() {
        this.mOverlayViewGroup.clear();
    }

    public void remove(@NonNull Drawable drawable) {
        this.mOverlayViewGroup.remove(drawable);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isEmpty() {
        return this.mOverlayViewGroup.isEmpty();
    }

    private ViewOverlayApi14() {
    }
}
