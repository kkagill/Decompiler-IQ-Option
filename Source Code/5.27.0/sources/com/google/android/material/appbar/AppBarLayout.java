package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.DefaultBehavior;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.a.j;
import com.google.android.material.a.k;
import com.google.android.material.internal.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@DefaultBehavior(Behavior.class)
public class AppBarLayout extends LinearLayout {
    private int Ec;
    private int Ed;
    private int Ee;
    private boolean Ef;
    private int Eg;
    private WindowInsetsCompat Eh;
    private boolean Ei;
    private boolean Ej;
    private boolean Ek;
    private boolean El;
    private int[] Em;
    private List<a> gb;

    public interface a<T extends AppBarLayout> {
        void onOffsetChanged(T t, int i);
    }

    public static class b extends LayoutParams {
        int ED = 1;
        Interpolator EF;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.AppBarLayout_Layout);
            this.ED = obtainStyledAttributes.getInt(k.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(k.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.EF = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public b(int i, int i2) {
            super(i, i2);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        @RequiresApi(19)
        public b(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public void av(int i) {
            this.ED = i;
        }

        public int mF() {
            return this.ED;
        }

        public Interpolator mG() {
            return this.EF;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean mH() {
            int i = this.ED;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    public interface c extends a<AppBarLayout> {
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends a<T> {
        private int Eo;
        private int Ep;
        private ValueAnimator Eq;
        private int Er = -1;
        private boolean Es;
        private float Et;
        private WeakReference<View> Eu;
        private a Ev;

        public static abstract class a<T extends AppBarLayout> {
            public abstract boolean d(@NonNull T t);
        }

        protected static class b extends AbsSavedState {
            public static final Creator<b> CREATOR = new ClassLoaderCreator<b>() {
                /* renamed from: a */
                public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }

                /* renamed from: N */
                public b createFromParcel(Parcel parcel) {
                    return new b(parcel, null);
                }

                /* renamed from: at */
                public b[] newArray(int i) {
                    return new b[i];
                }
            };
            float EA;
            boolean EB;
            int Ez;

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.Ez = parcel.readInt();
                this.EA = parcel.readFloat();
                this.EB = parcel.readByte() != (byte) 0;
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.Ez);
                parcel.writeFloat(this.EA);
                parcel.writeByte((byte) this.EB);
            }
        }

        private static boolean j(int i, int i2) {
            return (i & i2) == i2;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            boolean z = (i & 2) != 0 && (t.mB() || a(coordinatorLayout, (AppBarLayout) t, view));
            if (z) {
                ValueAnimator valueAnimator = this.Eq;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.Eu = null;
            this.Ep = i2;
            return z;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.mA() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: a */
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            if (i2 != 0) {
                int i4;
                int downNestedPreScrollRange;
                if (i2 < 0) {
                    i = -t.getTotalScrollRange();
                    i4 = i;
                    downNestedPreScrollRange = t.getDownNestedPreScrollRange() + i;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i4 != downNestedPreScrollRange) {
                    iArr[1] = b(coordinatorLayout, t, i2, i4, downNestedPreScrollRange);
                    a(i2, (AppBarLayout) t, view, i3);
                }
            }
        }

        /* renamed from: a */
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                b(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
                a(i4, (AppBarLayout) t, view, i5);
            }
            if (t.mB()) {
                t.R(view.getScrollY() > 0);
            }
        }

        private void a(int i, T t, View view, int i2) {
            if (i2 == 1) {
                i2 = mD();
                if ((i < 0 && i2 == 0) || (i > 0 && i2 == (-t.getDownNestedScrollRange()))) {
                    ViewCompat.stopNestedScroll(view, 1);
                }
            }
        }

        /* renamed from: a */
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.Ep == 0 || i == 1) {
                a(coordinatorLayout, (AppBarLayout) t);
            }
            this.Eu = new WeakReference(view);
        }

        private void a(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int round;
            int abs = Math.abs(mD() - i);
            f = Math.abs(f);
            if (f > 0.0f) {
                round = Math.round((((float) abs) / f) * 1000.0f) * 3;
            } else {
                round = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            a(coordinatorLayout, (AppBarLayout) t, i, round);
        }

        private void a(final CoordinatorLayout coordinatorLayout, final T t, int i, int i2) {
            if (mD() == i) {
                ValueAnimator valueAnimator = this.Eq;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.Eq.cancel();
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.Eq;
            if (valueAnimator2 == null) {
                this.Eq = new ValueAnimator();
                this.Eq.setInterpolator(com.google.android.material.a.a.DN);
                this.Eq.addUpdateListener(new AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseBehavior.this.a(coordinatorLayout, t, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.Eq.setDuration((long) Math.min(i2, 600));
            this.Eq.setIntValues(new int[]{r0, i});
            this.Eq.start();
        }

        private int a(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                b bVar = (b) childAt.getLayoutParams();
                if (j(bVar.mF(), 32)) {
                    top -= bVar.topMargin;
                    bottom += bVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        private void a(CoordinatorLayout coordinatorLayout, T t) {
            int mD = mD();
            int a = a((AppBarLayout) t, mD);
            if (a >= 0) {
                View childAt = t.getChildAt(a);
                b bVar = (b) childAt.getLayoutParams();
                int mF = bVar.mF();
                if ((mF & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (a == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (j(mF, 2)) {
                        i2 += ViewCompat.getMinimumHeight(childAt);
                    } else if (j(mF, 5)) {
                        int minimumHeight = ViewCompat.getMinimumHeight(childAt) + i2;
                        if (mD < minimumHeight) {
                            i = minimumHeight;
                        } else {
                            i2 = minimumHeight;
                        }
                    }
                    if (j(mF, 32)) {
                        i += bVar.topMargin;
                        i2 -= bVar.bottomMargin;
                    }
                    if (mD < (i2 + i) / 2) {
                        i = i2;
                    }
                    a(coordinatorLayout, (AppBarLayout) t, MathUtils.clamp(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: a */
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.LayoutParams) t.getLayoutParams()).height != -2) {
                return super.onMeasureChild(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.onMeasureChild(t, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.Er;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                i2 = -childAt.getBottom();
                if (this.Es) {
                    pendingAction = ViewCompat.getMinimumHeight(childAt) + t.getTopInset();
                } else {
                    pendingAction = Math.round(((float) childAt.getHeight()) * this.Et);
                }
                a(coordinatorLayout, t, i2 + pendingAction);
            } else if (pendingAction != 0) {
                Object obj = (pendingAction & 4) != 0 ? 1 : null;
                if ((pendingAction & 2) != 0) {
                    pendingAction = -t.getUpNestedPreScrollRange();
                    if (obj != null) {
                        a(coordinatorLayout, (AppBarLayout) t, pendingAction, 0.0f);
                    } else {
                        a(coordinatorLayout, t, pendingAction);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (obj != null) {
                        a(coordinatorLayout, (AppBarLayout) t, 0, 0.0f);
                    } else {
                        a(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mC();
            this.Er = -1;
            au(MathUtils.clamp(mE(), -t.getTotalScrollRange(), 0));
            a(coordinatorLayout, (AppBarLayout) t, mE(), 0, true);
            t.as(mE());
            return onLayoutChild;
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public boolean u(T t) {
            a aVar = this.Ev;
            if (aVar != null) {
                return aVar.d(t);
            }
            WeakReference weakReference = this.Eu;
            boolean z = true;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                    z = false;
                }
            }
            return z;
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: b */
        public void a(CoordinatorLayout coordinatorLayout, T t) {
            a(coordinatorLayout, (AppBarLayout) t);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: b */
        public int t(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: c */
        public int s(T t) {
            return t.getTotalScrollRange();
        }

        /* Access modifiers changed, original: 0000 */
        public int a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int mD = mD();
            int i4 = 0;
            if (i2 == 0 || mD < i2 || mD > i3) {
                this.Eo = 0;
            } else {
                int clamp = MathUtils.clamp(i, i2, i3);
                if (mD != clamp) {
                    i = t.mz() ? b((AppBarLayout) t, clamp) : clamp;
                    boolean au = au(i);
                    i4 = mD - clamp;
                    this.Eo = clamp - i;
                    if (!au && t.mz()) {
                        coordinatorLayout.dispatchDependentViewsChanged(t);
                    }
                    t.as(mE());
                    a(coordinatorLayout, (AppBarLayout) t, clamp, clamp < mD ? -1 : 1, false);
                }
            }
            return i4;
        }

        private int b(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = t.getChildAt(i3);
                b bVar = (b) childAt.getLayoutParams();
                Interpolator mG = bVar.mG();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else {
                    if (mG != null) {
                        childCount = bVar.mF();
                        if ((childCount & 1) != 0) {
                            i2 = 0 + ((childAt.getHeight() + bVar.topMargin) + bVar.bottomMargin);
                            if ((childCount & 2) != 0) {
                                i2 -= ViewCompat.getMinimumHeight(childAt);
                            }
                        }
                        if (ViewCompat.getFitsSystemWindows(childAt)) {
                            i2 -= t.getTopInset();
                        }
                        if (i2 > 0) {
                            float f = (float) i2;
                            return Integer.signum(i) * (childAt.getTop() + Math.round(f * mG.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                        }
                    }
                    return i;
                }
            }
            return i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:33:? A:{SYNTHETIC, RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
        private void a(androidx.coordinatorlayout.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
            r5 = this;
            r0 = c(r7, r8);
            if (r0 == 0) goto L_0x006e;
        L_0x0006:
            r1 = r0.getLayoutParams();
            r1 = (com.google.android.material.appbar.AppBarLayout.b) r1;
            r1 = r1.mF();
            r2 = r1 & 1;
            r3 = 1;
            r4 = 0;
            if (r2 == 0) goto L_0x0041;
        L_0x0016:
            r2 = androidx.core.view.ViewCompat.getMinimumHeight(r0);
            if (r9 <= 0) goto L_0x002f;
        L_0x001c:
            r9 = r1 & 12;
            if (r9 == 0) goto L_0x002f;
        L_0x0020:
            r8 = -r8;
            r9 = r0.getBottom();
            r9 = r9 - r2;
            r0 = r7.getTopInset();
            r9 = r9 - r0;
            if (r8 < r9) goto L_0x0041;
        L_0x002d:
            r8 = 1;
            goto L_0x0042;
        L_0x002f:
            r9 = r1 & 2;
            if (r9 == 0) goto L_0x0041;
        L_0x0033:
            r8 = -r8;
            r9 = r0.getBottom();
            r9 = r9 - r2;
            r0 = r7.getTopInset();
            r9 = r9 - r0;
            if (r8 < r9) goto L_0x0041;
        L_0x0040:
            goto L_0x002d;
        L_0x0041:
            r8 = 0;
        L_0x0042:
            r9 = r7.mB();
            if (r9 == 0) goto L_0x0057;
        L_0x0048:
            r9 = r5.a(r6);
            if (r9 == 0) goto L_0x0057;
        L_0x004e:
            r8 = r9.getScrollY();
            if (r8 <= 0) goto L_0x0056;
        L_0x0054:
            r8 = 1;
            goto L_0x0057;
        L_0x0056:
            r8 = 0;
        L_0x0057:
            r8 = r7.R(r8);
            r9 = android.os.Build.VERSION.SDK_INT;
            r0 = 11;
            if (r9 < r0) goto L_0x006e;
        L_0x0061:
            if (r10 != 0) goto L_0x006b;
        L_0x0063:
            if (r8 == 0) goto L_0x006e;
        L_0x0065:
            r6 = r5.c(r6, r7);
            if (r6 == 0) goto L_0x006e;
        L_0x006b:
            r7.jumpDrawablesToCurrentState();
        L_0x006e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        private boolean c(CoordinatorLayout coordinatorLayout, T t) {
            List dependents = coordinatorLayout.getDependents(t);
            int size = dependents.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) ((View) dependents.get(i)).getLayoutParams()).getBehavior();
                if (behavior instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) behavior).mN() != 0) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }

        private static View c(AppBarLayout appBarLayout, int i) {
            i = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (i >= childAt.getTop() && i <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        @Nullable
        private View a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt instanceof NestedScrollingChild) {
                    return childAt;
                }
            }
            return null;
        }

        /* Access modifiers changed, original: 0000 */
        public int mD() {
            return mE() + this.Eo;
        }

        /* renamed from: d */
        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, t);
            int mE = mE();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + mE;
                if (childAt.getTop() + mE > 0 || bottom < 0) {
                    i++;
                } else {
                    b bVar = new b(onSaveInstanceState);
                    bVar.Ez = i;
                    if (bottom == ViewCompat.getMinimumHeight(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    bVar.EB = z;
                    bVar.EA = ((float) bottom) / ((float) childAt.getHeight());
                    return bVar;
                }
            }
            return onSaveInstanceState;
        }

        /* renamed from: a */
        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof b) {
                b bVar = (b) parcelable;
                super.onRestoreInstanceState(coordinatorLayout, t, bVar.getSuperState());
                this.Er = bVar.Ez;
                this.Et = bVar.EA;
                this.Es = bVar.EB;
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, t, parcelable);
            this.Er = -1;
        }
    }

    public static class ScrollingViewBehavior extends b {
        public /* bridge */ /* synthetic */ boolean au(int i) {
            return super.au(i);
        }

        public /* bridge */ /* synthetic */ int mE() {
            return super.mE();
        }

        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ScrollingViewBehavior_Layout);
            ax(obtainStyledAttributes.getDimensionPixelSize(k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            b(view, view2);
            c(view, view2);
            return false;
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout i = j(coordinatorLayout.getDependencies(view));
            if (i != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.Fu;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    i.b(false, z ^ 1);
                    return true;
                }
            }
            return false;
        }

        private void b(View view, View view2) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                ViewCompat.offsetTopAndBottom(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).Eo) + mM()) - x(view2));
            }
        }

        /* Access modifiers changed, original: 0000 */
        public float v(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int e = e(appBarLayout);
                if (downNestedPreScrollRange != 0 && totalScrollRange + e <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                totalScrollRange -= downNestedPreScrollRange;
                if (totalScrollRange != 0) {
                    return (((float) e) / ((float) totalScrollRange)) + 1.0f;
                }
            }
            return 0.0f;
        }

        private static int e(AppBarLayout appBarLayout) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
            return behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).mD() : 0;
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: i */
        public AppBarLayout j(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* Access modifiers changed, original: 0000 */
        public int w(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.w(view);
        }

        private void c(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mB()) {
                    appBarLayout.R(view.getScrollY() > 0);
                }
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        }

        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
        }

        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        public /* bridge */ /* synthetic */ boolean au(int i) {
            return super.au(i);
        }

        public /* bridge */ /* synthetic */ Parcelable d(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, appBarLayout);
        }

        public /* bridge */ /* synthetic */ int mE() {
            return super.mE();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Ec = -1;
        this.Ed = -1;
        this.Ee = -1;
        this.Eg = 0;
        setOrientation(1);
        if (VERSION.SDK_INT >= 21) {
            f.y(this);
            f.a(this, attributeSet, 0, j.Widget_Design_AppBarLayout);
        }
        TypedArray a = g.a(context, attributeSet, k.AppBarLayout, 0, j.Widget_Design_AppBarLayout, new int[0]);
        ViewCompat.setBackground(this, a.getDrawable(k.AppBarLayout_android_background));
        if (a.hasValue(k.AppBarLayout_expanded)) {
            a(a.getBoolean(k.AppBarLayout_expanded, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && a.hasValue(k.AppBarLayout_elevation)) {
            f.a(this, (float) a.getDimensionPixelSize(k.AppBarLayout_elevation, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (a.hasValue(k.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(a.getBoolean(k.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (a.hasValue(k.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(a.getBoolean(k.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.El = a.getBoolean(k.AppBarLayout_liftOnScroll, false);
        a.recycle();
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() {
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return AppBarLayout.this.a(windowInsetsCompat);
            }
        });
    }

    public void a(a aVar) {
        if (this.gb == null) {
            this.gb = new ArrayList();
        }
        if (aVar != null && !this.gb.contains(aVar)) {
            this.gb.add(aVar);
        }
    }

    public void a(c cVar) {
        a((a) cVar);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mx();
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mx();
        z = false;
        this.Ef = false;
        i = getChildCount();
        for (i2 = 0; i2 < i; i2++) {
            if (((b) getChildAt(i2).getLayoutParams()).mG() != null) {
                this.Ef = true;
                break;
            }
        }
        if (!this.Ei) {
            if (this.El || mw()) {
                z = true;
            }
            Q(z);
        }
    }

    private boolean mw() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((b) getChildAt(i).getLayoutParams()).mH()) {
                return true;
            }
        }
        return false;
    }

    private void mx() {
        this.Ec = -1;
        this.Ed = -1;
        this.Ee = -1;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setExpanded(boolean z) {
        b(z, ViewCompat.isLaidOut(this));
    }

    public void b(boolean z, boolean z2) {
        a(z, z2, true);
    }

    private void a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.Eg = i2 | i;
        requestLayout();
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: my */
    public b generateDefaultLayoutParams() {
        return new b(-1, -2);
    }

    /* renamed from: b */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (VERSION.SDK_INT >= 19 && (layoutParams instanceof LayoutParams)) {
            return new b((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new b((MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean mz() {
        return this.Ef;
    }

    public final int getTotalScrollRange() {
        int i = this.Ec;
        if (i != -1) {
            return i;
        }
        i = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            b bVar = (b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = bVar.ED;
            if ((i4 & 1) == 0) {
                break;
            }
            i2 += (measuredHeight + bVar.topMargin) + bVar.bottomMargin;
            if ((i4 & 2) != 0) {
                i2 -= ViewCompat.getMinimumHeight(childAt);
                break;
            }
        }
        i = Math.max(0, i2 - getTopInset());
        this.Ec = i;
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean mA() {
        return getTotalScrollRange() != 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* Access modifiers changed, original: 0000 */
    public int getDownNestedPreScrollRange() {
        int i = this.Ed;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = getChildCount() - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            b bVar = (b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = bVar.ED;
            if ((i3 & 5) == 5) {
                i2 += bVar.topMargin + bVar.bottomMargin;
                if ((i3 & 8) != 0) {
                    i2 += ViewCompat.getMinimumHeight(childAt);
                } else {
                    int minimumHeight;
                    if ((i3 & 2) != 0) {
                        minimumHeight = ViewCompat.getMinimumHeight(childAt);
                    } else {
                        minimumHeight = getTopInset();
                    }
                    i2 += measuredHeight - minimumHeight;
                }
            } else if (i2 > 0) {
                break;
            }
        }
        i = Math.max(0, i2);
        this.Ed = i;
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public int getDownNestedScrollRange() {
        int i = this.Ee;
        if (i != -1) {
            return i;
        }
        i = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            b bVar = (b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + (bVar.topMargin + bVar.bottomMargin);
            int i4 = bVar.ED;
            if ((i4 & 1) == 0) {
                break;
            }
            i2 += measuredHeight;
            if ((i4 & 2) != 0) {
                i2 -= ViewCompat.getMinimumHeight(childAt) + getTopInset();
                break;
            }
        }
        i = Math.max(0, i2);
        this.Ee = i;
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public void as(int i) {
        List list = this.gb;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) this.gb.get(i2);
                if (aVar != null) {
                    aVar.onOffsetChanged(this, i);
                }
            }
        }
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight == 0) {
            minimumHeight = getChildCount();
            minimumHeight = minimumHeight >= 1 ? ViewCompat.getMinimumHeight(getChildAt(minimumHeight - 1)) : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    /* Access modifiers changed, original: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.Em == null) {
            this.Em = new int[4];
        }
        int[] iArr = this.Em;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.Ej ? com.google.android.material.a.b.state_liftable : -com.google.android.material.a.b.state_liftable;
        int i2 = (this.Ej && this.Ek) ? com.google.android.material.a.b.state_lifted : -com.google.android.material.a.b.state_lifted;
        iArr[1] = i2;
        iArr[2] = this.Ej ? com.google.android.material.a.b.state_collapsible : -com.google.android.material.a.b.state_collapsible;
        i2 = (this.Ej && this.Ek) ? com.google.android.material.a.b.state_collapsed : -com.google.android.material.a.b.state_collapsed;
        iArr[3] = i2;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    private boolean Q(boolean z) {
        if (this.Ej == z) {
            return false;
        }
        this.Ej = z;
        refreshDrawableState();
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean R(boolean z) {
        if (this.Ek == z) {
            return false;
        }
        this.Ek = z;
        refreshDrawableState();
        return true;
    }

    public void setLiftOnScroll(boolean z) {
        this.El = z;
    }

    public boolean mB() {
        return this.El;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            f.a(this, f);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int getPendingAction() {
        return this.Eg;
    }

    /* Access modifiers changed, original: 0000 */
    public void mC() {
        this.Eg = 0;
    }

    /* Access modifiers changed, original: final */
    @VisibleForTesting
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.Eh;
        return windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
    }

    /* Access modifiers changed, original: 0000 */
    public WindowInsetsCompat a(WindowInsetsCompat windowInsetsCompat) {
        Object obj = ViewCompat.getFitsSystemWindows(this) ? windowInsetsCompat : null;
        if (!ObjectsCompat.equals(this.Eh, obj)) {
            this.Eh = obj;
            mx();
        }
        return windowInsetsCompat;
    }
}
