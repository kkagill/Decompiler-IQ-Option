package com.iqoption.core.ui.widget.coordinatorlayout.behavior;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper.Callback;
import com.google.common.collect.Lists;
import com.iqoption.core.i.d;
import com.iqoption.core.i.m;
import java.lang.ref.WeakReference;
import java.util.List;

public class BottomSheetBehavior<V extends View> extends Behavior<V> {
    private float bMI;
    private int bMJ;
    private boolean bMK;
    private int bML;
    int bMM;
    int bMN;
    boolean bMO;
    private boolean bMP;
    ViewDragHelper bMQ;
    private boolean bMR;
    private int bMS;
    private boolean bMT;
    int bMU;
    WeakReference<V> bMV;
    private List<WeakReference<View>> bMW;
    private a bMX;
    private int bMY;
    boolean bMZ;
    private final Callback bNa = new Callback() {
        public boolean tryCaptureView(@NonNull View view, int i) {
            boolean z = true;
            if (BottomSheetBehavior.this.mState == 1 || BottomSheetBehavior.this.bMZ) {
                return false;
            }
            if (BottomSheetBehavior.this.mState == 3 && BottomSheetBehavior.this.mActivePointerId == i && BottomSheetBehavior.this.amA()) {
                return false;
            }
            if (BottomSheetBehavior.this.bMV == null || BottomSheetBehavior.this.bMV.get() != view) {
                z = false;
            }
            return z;
        }

        public void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.aG(i2);
        }

        public void onViewDragStateChanged(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.aF(1);
            }
        }

        public void onViewReleased(@NonNull View view, float f, float f2) {
            int i;
            int i2 = 3;
            if (f2 < 0.0f) {
                i = BottomSheetBehavior.this.bMM;
            } else if (BottomSheetBehavior.this.bMO && BottomSheetBehavior.this.c(view, f2)) {
                i = BottomSheetBehavior.this.bMU;
                i2 = 5;
            } else {
                int top;
                if (f2 == 0.0f) {
                    top = view.getTop();
                    if (Math.abs(top - BottomSheetBehavior.this.bMM) < Math.abs(top - BottomSheetBehavior.this.bMN)) {
                        i = BottomSheetBehavior.this.bMM;
                    } else {
                        top = BottomSheetBehavior.this.bMN;
                    }
                } else {
                    top = BottomSheetBehavior.this.bMN;
                }
                i = top;
                i2 = 4;
            }
            if (BottomSheetBehavior.this.bMQ.settleCapturedViewAt(view.getLeft(), i)) {
                BottomSheetBehavior.this.aF(2);
                ViewCompat.postOnAnimation(view, new c(view, i2));
                return;
            }
            BottomSheetBehavior.this.aF(i2);
        }

        public int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return MathUtils.clamp(i, BottomSheetBehavior.this.bMM, BottomSheetBehavior.this.bMO ? BottomSheetBehavior.this.bMU : BottomSheetBehavior.this.bMN);
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return view.getLeft();
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            int i;
            int i2;
            if (BottomSheetBehavior.this.bMO) {
                i = BottomSheetBehavior.this.bMU;
                i2 = BottomSheetBehavior.this.bMM;
            } else {
                i = BottomSheetBehavior.this.bMN;
                i2 = BottomSheetBehavior.this.bMM;
            }
            return i - i2;
        }
    };
    int mActivePointerId;
    int mState = 4;
    private VelocityTracker mVelocityTracker;

    public static abstract class a {
        public abstract void b(@NonNull View view, int i);

        public abstract void d(@NonNull View view, float f);
    }

    private class c implements Runnable {
        private final int bNc;
        private final View mView;

        c(View view, int i) {
            this.mView = view;
            this.bNc = i;
        }

        public void run() {
            if (BottomSheetBehavior.this.bMQ == null || !BottomSheetBehavior.this.bMQ.continueSettling(true)) {
                BottomSheetBehavior.this.aF(this.bNc);
            } else {
                ViewCompat.postOnAnimation(this.mView, this);
            }
        }
    }

    protected static class b extends AbsSavedState {
        public static final Creator<b> CREATOR = new ClassLoaderCreator<b>() {
            /* renamed from: h */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: ab */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            /* renamed from: fj */
            public b[] newArray(int i) {
                return new b[i];
            }
        };
        final int state;

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public b(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }
    }

    private boolean R(@NonNull View view) {
        List list = this.bMW;
        if (!(list == null || list.isEmpty())) {
            int size = this.bMW.size();
            for (int i = 0; i < size; i++) {
                if (((WeakReference) this.bMW.get(i)).get() == view) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean amA() {
        List list = this.bMW;
        if (!(list == null || list.isEmpty())) {
            int size = this.bMW.size();
            for (int i = 0; i < size; i++) {
                View view = (View) ((WeakReference) this.bMW.get(i)).get();
                if (view != null && view.canScrollVertically(-1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(m.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || peekValue.data != -1) {
            aE(obtainStyledAttributes.getDimensionPixelSize(m.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            aE(peekValue.data);
        }
        W(obtainStyledAttributes.getBoolean(m.BottomSheetBehavior_Layout_behavior_hideable, false));
        X(obtainStyledAttributes.getBoolean(m.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.bMI = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new b(super.onSaveInstanceState(coordinatorLayout, v), this.mState);
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, bVar.getSuperState());
        if (bVar.state == 1 || bVar.state == 2) {
            this.mState = 4;
        } else {
            this.mState = bVar.state;
        }
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v)) {
            ViewCompat.setFitsSystemWindows(v, true);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.bMU = coordinatorLayout.getHeight();
        if (this.bMK) {
            if (this.bML == 0) {
                this.bML = coordinatorLayout.getResources().getDimensionPixelSize(d.design_bottom_sheet_peek_height_min);
            }
            i = Math.max(this.bML, this.bMU - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i = this.bMJ;
        }
        this.bMM = Math.max(0, this.bMU - v.getHeight());
        this.bMN = Math.max(this.bMU - i, this.bMM);
        i = this.mState;
        if (i == 3) {
            ViewCompat.offsetTopAndBottom(v, this.bMM);
        } else if (this.bMO && i == 5) {
            ViewCompat.offsetTopAndBottom(v, this.bMU);
        } else {
            i = this.mState;
            if (i == 4) {
                ViewCompat.offsetTopAndBottom(v, this.bMN);
            } else if (i == 1 || i == 2) {
                ViewCompat.offsetTopAndBottom(v, top - v.getTop());
            }
        }
        if (this.bMQ == null) {
            this.bMQ = ViewDragHelper.create(coordinatorLayout, this.bNa);
        }
        this.bMV = new WeakReference(v);
        List list = this.bMW;
        if (list == null) {
            this.bMW = Lists.newArrayList();
        } else {
            list.clear();
        }
        a(this.bMW, (View) v);
        return true;
    }

    private boolean a(CoordinatorLayout coordinatorLayout, int i, int i2) {
        int size = this.bMW.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) ((WeakReference) this.bMW.get(i3)).get();
            if (view != null && coordinatorLayout.isPointInChildBounds(view, i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = false;
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                reset();
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.bMY = (int) motionEvent.getY();
                if (a(coordinatorLayout, x, this.bMY)) {
                    this.mActivePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.bMZ = true;
                }
                boolean z2 = this.mActivePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.bMY);
                this.bMR = z2;
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.bMZ = false;
                this.mActivePointerId = -1;
                if (this.bMR) {
                    this.bMR = false;
                    return false;
                }
            }
            if (!this.bMR && this.bMQ.shouldInterceptTouchEvent(motionEvent)) {
                return true;
            }
            if (!(actionMasked != 2 || this.bMR || this.mState == 1 || a(coordinatorLayout, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.bMY) - motionEvent.getY()) <= ((float) this.bMQ.getTouchSlop()))) {
                z = true;
            }
            return z;
        }
        this.bMR = true;
        return false;
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.mState == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.bMQ;
        if (viewDragHelper != null) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        if (actionMasked == 2 && !this.bMR && Math.abs(((float) this.bMY) - motionEvent.getY()) > ((float) this.bMQ.getTouchSlop())) {
            this.bMQ.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return this.bMR ^ 1;
    }

    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
        this.bMS = 0;
        this.bMT = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr) {
        if (R(view)) {
            int top = v.getTop();
            i = top - i2;
            int i3;
            if (i2 > 0) {
                i3 = this.bMM;
                if (i < i3) {
                    iArr[1] = top - i3;
                    ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                    aF(3);
                } else {
                    iArr[1] = i2;
                    ViewCompat.offsetTopAndBottom(v, -i2);
                    aF(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                i3 = this.bMN;
                if (i <= i3 || this.bMO) {
                    iArr[1] = i2;
                    ViewCompat.offsetTopAndBottom(v, -i2);
                    aF(1);
                } else {
                    iArr[1] = top - i3;
                    ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                    aF(4);
                }
            }
            aG(v.getTop());
            this.bMS = i2;
            this.bMT = true;
        }
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i = 3;
        if (v.getTop() == this.bMM) {
            aF(3);
            return;
        }
        if (R(view) && this.bMT) {
            int i2;
            if (this.bMS > 0) {
                i2 = this.bMM;
            } else if (this.bMO && c(v, getYVelocity())) {
                i2 = this.bMU;
                i = 5;
            } else {
                if (this.bMS == 0) {
                    i2 = v.getTop();
                    if (Math.abs(i2 - this.bMM) < Math.abs(i2 - this.bMN)) {
                        i2 = this.bMM;
                    } else {
                        i2 = this.bMN;
                    }
                } else {
                    i2 = this.bMN;
                }
                i = 4;
            }
            if (this.bMQ.smoothSlideViewTo(v, v.getLeft(), i2)) {
                aF(2);
                ViewCompat.postOnAnimation(v, new c(v, i));
            } else {
                aF(i);
            }
            this.bMT = false;
        }
    }

    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
        return R(view) && (this.mState != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    public final void aE(int r4) {
        /*
        r3 = this;
        r0 = 1;
        r1 = 0;
        r2 = -1;
        if (r4 != r2) goto L_0x000c;
    L_0x0005:
        r4 = r3.bMK;
        if (r4 != 0) goto L_0x0015;
    L_0x0009:
        r3.bMK = r0;
        goto L_0x0024;
    L_0x000c:
        r2 = r3.bMK;
        if (r2 != 0) goto L_0x0017;
    L_0x0010:
        r2 = r3.bMJ;
        if (r2 == r4) goto L_0x0015;
    L_0x0014:
        goto L_0x0017;
    L_0x0015:
        r0 = 0;
        goto L_0x0024;
    L_0x0017:
        r3.bMK = r1;
        r1 = java.lang.Math.max(r1, r4);
        r3.bMJ = r1;
        r1 = r3.bMU;
        r1 = r1 - r4;
        r3.bMN = r1;
    L_0x0024:
        if (r0 == 0) goto L_0x003a;
    L_0x0026:
        r4 = r3.mState;
        r0 = 4;
        if (r4 != r0) goto L_0x003a;
    L_0x002b:
        r4 = r3.bMV;
        if (r4 == 0) goto L_0x003a;
    L_0x002f:
        r4 = r4.get();
        r4 = (android.view.View) r4;
        if (r4 == 0) goto L_0x003a;
    L_0x0037:
        r4.requestLayout();
    L_0x003a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ui.widget.coordinatorlayout.behavior.BottomSheetBehavior.aE(int):void");
    }

    public void W(boolean z) {
        this.bMO = z;
    }

    public void X(boolean z) {
        this.bMP = z;
    }

    public boolean amB() {
        return this.bMP;
    }

    public void a(a aVar) {
        this.bMX = aVar;
    }

    public final void setState(final int i) {
        if (i != this.mState) {
            WeakReference weakReference = this.bMV;
            if (weakReference == null) {
                if (i == 4 || i == 3 || (this.bMO && i == 5)) {
                    this.mState = i;
                }
                return;
            }
            final View view = (View) weakReference.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(view)) {
                    view.post(new Runnable() {
                        public void run() {
                            BottomSheetBehavior.this.a(view, i);
                        }
                    });
                } else {
                    a(view, i);
                }
            }
        }
    }

    public final int getState() {
        return this.mState;
    }

    /* Access modifiers changed, original: 0000 */
    public void aF(int i) {
        if (this.mState != i) {
            this.mState = i;
            View view = (View) this.bMV.get();
            if (view != null) {
                a aVar = this.bMX;
                if (aVar != null) {
                    aVar.b(view, i);
                }
            }
        }
    }

    private void reset() {
        this.mActivePointerId = -1;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean c(View view, float f) {
        boolean z = true;
        if (this.bMP) {
            return true;
        }
        if (view.getTop() < this.bMN) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.bMN)) / ((float) this.bMJ) <= 0.5f) {
            z = false;
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    @VisibleForTesting
    public void a(List<WeakReference<View>> list, View view) {
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            list.add(new WeakReference(view));
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a((List) list, viewGroup.getChildAt(i));
            }
        }
    }

    private float getYVelocity() {
        this.mVelocityTracker.computeCurrentVelocity(1000, this.bMI);
        return this.mVelocityTracker.getYVelocity(this.mActivePointerId);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.bMN;
        } else if (i == 3) {
            i2 = this.bMM;
        } else if (this.bMO && i == 5) {
            i2 = this.bMU;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal state argument: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (this.bMQ.smoothSlideViewTo(view, view.getLeft(), i2)) {
            aF(2);
            ViewCompat.postOnAnimation(view, new c(view, i));
            return;
        }
        aF(i);
    }

    /* Access modifiers changed, original: 0000 */
    public void aG(int i) {
        View view = (View) this.bMV.get();
        if (view != null) {
            a aVar = this.bMX;
            if (aVar != null) {
                int i2 = this.bMN;
                if (i > i2) {
                    aVar.d(view, ((float) (i2 - i)) / ((float) (this.bMU - i2)));
                } else {
                    aVar.d(view, ((float) (i2 - i)) / ((float) (i2 - this.bMM)));
                }
            }
        }
    }

    public static <V extends View> BottomSheetBehavior<V> ax(V v) {
        LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }
}
