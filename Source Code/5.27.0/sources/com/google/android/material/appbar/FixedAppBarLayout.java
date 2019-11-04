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
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.core.i.l;
import com.iqoption.core.i.m;
import java.lang.ref.WeakReference;
import java.util.List;

public class FixedAppBarLayout extends LinearLayout implements AttachedBehavior {
    private int EI;
    private int EJ;
    private int EK;
    private boolean EL;
    private int EM;
    private boolean EN;
    private int[] EO;
    private boolean mCollapsible;
    private WindowInsetsCompat mLastInsets;
    private List<b> mListeners;

    public static class a extends LayoutParams {
        int Ff = 1;
        Interpolator Fg;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.AppBarLayout_Layout);
            this.Ff = obtainStyledAttributes.getInt(m.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(m.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.Fg = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(m.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public a(int i, int i2) {
            super(i, i2);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        @RequiresApi(19)
        public a(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public int mF() {
            return this.Ff;
        }

        public Interpolator mG() {
            return this.Fg;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean mH() {
            int i = this.Ff;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    public interface b {
        void d(FixedAppBarLayout fixedAppBarLayout, int i);
    }

    public static class Behavior extends FixedHeaderBehavior<FixedAppBarLayout> {
        private int EV;
        private ValueAnimator EW;
        private int EX = -1;
        private boolean EY;
        private float EZ;
        private WeakReference<View> Fa;
        private a Fb;
        private boolean Fc;

        public static abstract class a {
            public abstract boolean d(@NonNull FixedAppBarLayout fixedAppBarLayout);
        }

        protected static class b extends AbsSavedState {
            public static final Creator<b> CREATOR = new ClassLoaderCreator<b>() {
                /* renamed from: b */
                public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }

                /* renamed from: O */
                public b createFromParcel(Parcel parcel) {
                    return new b(parcel, null);
                }

                /* renamed from: aw */
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

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FixedAppBarLayout fixedAppBarLayout, @NonNull View view, @NonNull View view2, int i, int i2) {
            boolean z = (i & 2) != 0 && fixedAppBarLayout.mA() && coordinatorLayout.getHeight() - view.getHeight() <= fixedAppBarLayout.getHeight();
            if (z) {
                ValueAnimator valueAnimator = this.EW;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.Fa = null;
            return z;
        }

        /* renamed from: a */
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FixedAppBarLayout fixedAppBarLayout, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
            if (i2 != 0) {
                int i4;
                int downNestedPreScrollRange;
                if (i2 < 0) {
                    int i5 = -fixedAppBarLayout.getTotalScrollRange();
                    i4 = i5;
                    downNestedPreScrollRange = fixedAppBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i4 = -fixedAppBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i4 != downNestedPreScrollRange) {
                    iArr[1] = b(coordinatorLayout, fixedAppBarLayout, i2, i4, downNestedPreScrollRange);
                }
            }
        }

        /* renamed from: a */
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FixedAppBarLayout fixedAppBarLayout, @NonNull View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                b(coordinatorLayout, fixedAppBarLayout, i4, -fixedAppBarLayout.getDownNestedScrollRange(), 0);
            }
        }

        /* renamed from: a */
        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FixedAppBarLayout fixedAppBarLayout, @NonNull View view, int i) {
            if (i == 0) {
                a(coordinatorLayout, fixedAppBarLayout);
            }
            this.Fa = new WeakReference(view);
        }

        /* renamed from: a */
        public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FixedAppBarLayout fixedAppBarLayout, @NonNull View view, float f, float f2) {
            Object obj = 1;
            int i = f != 0.0f ? 1 : f2 != 0.0f ? 2 : 0;
            if ((2 & i) == 0 || !fixedAppBarLayout.mA() || fixedAppBarLayout.getTop() + fixedAppBarLayout.getTotalScrollRange() == 0) {
                obj = null;
            }
            if (obj == null) {
                return false;
            }
            return a(coordinatorLayout, (View) fixedAppBarLayout, -s(fixedAppBarLayout), 0, -f2);
        }

        private void a(CoordinatorLayout coordinatorLayout, FixedAppBarLayout fixedAppBarLayout, int i, float f) {
            int round;
            int abs = Math.abs(mD() - i);
            f = Math.abs(f);
            if (f > 0.0f) {
                round = Math.round((((float) abs) / f) * 1000.0f) * 3;
            } else {
                round = (int) (((((float) abs) / ((float) fixedAppBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            a(coordinatorLayout, fixedAppBarLayout, i, round);
        }

        private void a(final CoordinatorLayout coordinatorLayout, final FixedAppBarLayout fixedAppBarLayout, int i, int i2) {
            if (!this.Fc) {
                if (mD() == i) {
                    ValueAnimator valueAnimator = this.EW;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        this.EW.cancel();
                    }
                    return;
                }
                ValueAnimator valueAnimator2 = this.EW;
                if (valueAnimator2 == null) {
                    this.EW = new ValueAnimator();
                    this.EW.setInterpolator(j.XO());
                    this.EW.addUpdateListener(new AnimatorUpdateListener() {
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Behavior.this.a(coordinatorLayout, fixedAppBarLayout, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                        }
                    });
                } else {
                    valueAnimator2.cancel();
                }
                this.EW.setDuration((long) Math.min(i2, 600));
                this.EW.setIntValues(new int[]{r0, i});
                this.EW.start();
            }
        }

        private int a(FixedAppBarLayout fixedAppBarLayout, int i) {
            int childCount = fixedAppBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = fixedAppBarLayout.getChildAt(i2);
                int i3 = -i;
                if (childAt.getTop() <= i3 && childAt.getBottom() >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        private void a(CoordinatorLayout coordinatorLayout, FixedAppBarLayout fixedAppBarLayout) {
            int mD = mD();
            int a = a(fixedAppBarLayout, mD);
            if (a >= 0) {
                View childAt = fixedAppBarLayout.getChildAt(a);
                int mF = ((a) childAt.getLayoutParams()).mF();
                if ((mF & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (a == fixedAppBarLayout.getChildCount() - 1) {
                        i2 += fixedAppBarLayout.getTopInset();
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
                    if (mD < (i2 + i) / 2) {
                        i = i2;
                    }
                    a(coordinatorLayout, fixedAppBarLayout, MathUtils.clamp(i, -fixedAppBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: a */
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, FixedAppBarLayout fixedAppBarLayout, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.LayoutParams) fixedAppBarLayout.getLayoutParams()).height != -2) {
                return super.onMeasureChild(coordinatorLayout, fixedAppBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.onMeasureChild(fixedAppBarLayout, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FixedAppBarLayout fixedAppBarLayout, int i) {
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, fixedAppBarLayout, i);
            int pendingAction = fixedAppBarLayout.getPendingAction();
            int i2 = this.EX;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = fixedAppBarLayout.getChildAt(i2);
                i2 = -childAt.getBottom();
                if (this.EY) {
                    pendingAction = ViewCompat.getMinimumHeight(childAt) + fixedAppBarLayout.getTopInset();
                } else {
                    pendingAction = Math.round(((float) childAt.getHeight()) * this.EZ);
                }
                a(coordinatorLayout, fixedAppBarLayout, i2 + pendingAction);
            } else if (pendingAction != 0) {
                Object obj = (pendingAction & 4) != 0 ? 1 : null;
                if ((pendingAction & 2) != 0) {
                    pendingAction = -fixedAppBarLayout.getUpNestedPreScrollRange();
                    if (obj != null) {
                        a(coordinatorLayout, fixedAppBarLayout, pendingAction, 0.0f);
                    } else {
                        a(coordinatorLayout, fixedAppBarLayout, pendingAction);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (obj != null) {
                        a(coordinatorLayout, fixedAppBarLayout, 0, 0.0f);
                    } else {
                        a(coordinatorLayout, fixedAppBarLayout, 0);
                    }
                }
            }
            fixedAppBarLayout.mC();
            this.EX = -1;
            au(MathUtils.clamp(mE(), -fixedAppBarLayout.getTotalScrollRange(), 0));
            a(coordinatorLayout, fixedAppBarLayout, mE(), 0, true);
            fixedAppBarLayout.as(mE());
            return onLayoutChild;
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public boolean u(FixedAppBarLayout fixedAppBarLayout) {
            a aVar = this.Fb;
            if (aVar != null) {
                return aVar.d(fixedAppBarLayout);
            }
            WeakReference weakReference = this.Fa;
            boolean z = true;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                    z = false;
                }
            }
            return z;
        }

        /* Access modifiers changed, original: protected */
        public void mK() {
            this.Fc = true;
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: b */
        public void a(CoordinatorLayout coordinatorLayout, FixedAppBarLayout fixedAppBarLayout) {
            this.Fc = false;
            a(coordinatorLayout, fixedAppBarLayout);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: b */
        public int t(FixedAppBarLayout fixedAppBarLayout) {
            return -fixedAppBarLayout.getDownNestedScrollRange();
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: c */
        public int s(FixedAppBarLayout fixedAppBarLayout) {
            return fixedAppBarLayout.getTotalScrollRange();
        }

        /* Access modifiers changed, original: 0000 */
        public int a(CoordinatorLayout coordinatorLayout, FixedAppBarLayout fixedAppBarLayout, int i, int i2, int i3) {
            int mD = mD();
            int i4 = 0;
            if (i2 == 0 || mD < i2 || mD > i3) {
                this.EV = 0;
            } else {
                int clamp = MathUtils.clamp(i, i2, i3);
                if (mD != clamp) {
                    i = fixedAppBarLayout.mz() ? b(fixedAppBarLayout, clamp) : clamp;
                    boolean au = au(i);
                    i4 = mD - clamp;
                    this.EV = clamp - i;
                    if (!au && fixedAppBarLayout.mz()) {
                        coordinatorLayout.dispatchDependentViewsChanged(fixedAppBarLayout);
                    }
                    fixedAppBarLayout.as(mE());
                    a(coordinatorLayout, fixedAppBarLayout, clamp, clamp < mD ? -1 : 1, false);
                }
            }
            return i4;
        }

        private int b(FixedAppBarLayout fixedAppBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = fixedAppBarLayout.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = fixedAppBarLayout.getChildAt(i3);
                a aVar = (a) childAt.getLayoutParams();
                Interpolator mG = aVar.mG();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else {
                    if (mG != null) {
                        childCount = aVar.mF();
                        if ((childCount & 1) != 0) {
                            i2 = 0 + ((childAt.getHeight() + aVar.topMargin) + aVar.bottomMargin);
                            if ((childCount & 2) != 0) {
                                i2 -= ViewCompat.getMinimumHeight(childAt);
                            }
                        }
                        if (ViewCompat.getFitsSystemWindows(childAt)) {
                            i2 -= fixedAppBarLayout.getTopInset();
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

        private void a(CoordinatorLayout coordinatorLayout, FixedAppBarLayout fixedAppBarLayout, int i, int i2, boolean z) {
            View c = c(fixedAppBarLayout, i);
            if (c != null) {
                int mF = ((a) c.getLayoutParams()).mF();
                boolean z2 = false;
                if ((mF & 1) != 0) {
                    int minimumHeight = ViewCompat.getMinimumHeight(c);
                    if (i2 <= 0 || (mF & 12) == 0 ? (mF & 2) == 0 || (-i) < (c.getBottom() - minimumHeight) - fixedAppBarLayout.getTopInset() : (-i) < (c.getBottom() - minimumHeight) - fixedAppBarLayout.getTopInset()) {
                        z2 = true;
                    }
                }
                boolean T = fixedAppBarLayout.T(z2);
                if (VERSION.SDK_INT < 11) {
                    return;
                }
                if (z || (T && c(coordinatorLayout, fixedAppBarLayout))) {
                    fixedAppBarLayout.jumpDrawablesToCurrentState();
                }
            }
        }

        private boolean c(CoordinatorLayout coordinatorLayout, FixedAppBarLayout fixedAppBarLayout) {
            List dependents = coordinatorLayout.getDependents(fixedAppBarLayout);
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

        private static View c(FixedAppBarLayout fixedAppBarLayout, int i) {
            i = Math.abs(i);
            int childCount = fixedAppBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = fixedAppBarLayout.getChildAt(i2);
                if (i >= childAt.getTop() && i <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* Access modifiers changed, original: 0000 */
        public int mD() {
            return mE() + this.EV;
        }

        /* renamed from: d */
        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, FixedAppBarLayout fixedAppBarLayout) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, fixedAppBarLayout);
            int mE = mE();
            int childCount = fixedAppBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = fixedAppBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + mE;
                if (childAt.getTop() + mE > 0 || bottom < 0) {
                    i++;
                } else {
                    b bVar = new b(onSaveInstanceState);
                    bVar.Ez = i;
                    if (bottom == ViewCompat.getMinimumHeight(childAt) + fixedAppBarLayout.getTopInset()) {
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
        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, FixedAppBarLayout fixedAppBarLayout, Parcelable parcelable) {
            if (parcelable instanceof b) {
                b bVar = (b) parcelable;
                super.onRestoreInstanceState(coordinatorLayout, fixedAppBarLayout, bVar.getSuperState());
                this.EX = bVar.Ez;
                this.EZ = bVar.EA;
                this.EY = bVar.EB;
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, fixedAppBarLayout, parcelable);
            this.EX = -1;
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
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.ScrollingViewBehavior_Layout);
            ax(obtainStyledAttributes.getDimensionPixelSize(m.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof FixedAppBarLayout;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            a(coordinatorLayout, view, view2);
            return false;
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            FixedAppBarLayout k = j(coordinatorLayout.getDependencies(view));
            if (k != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.Fu;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    k.b(false, z ^ 1);
                    return true;
                }
            }
            return false;
        }

        private void a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof Behavior) {
                ViewCompat.offsetTopAndBottom(view, (((view2.getBottom() - view.getTop()) + ((Behavior) behavior).EV) + mM()) - x(view2));
            }
        }

        /* Access modifiers changed, original: 0000 */
        public float v(View view) {
            if (view instanceof FixedAppBarLayout) {
                FixedAppBarLayout fixedAppBarLayout = (FixedAppBarLayout) view;
                int totalScrollRange = fixedAppBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = fixedAppBarLayout.getDownNestedPreScrollRange();
                int e = e(fixedAppBarLayout);
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

        private static int e(FixedAppBarLayout fixedAppBarLayout) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) fixedAppBarLayout.getLayoutParams()).getBehavior();
            return behavior instanceof Behavior ? ((Behavior) behavior).mD() : 0;
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: k */
        public FixedAppBarLayout j(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof FixedAppBarLayout) {
                    return (FixedAppBarLayout) view;
                }
            }
            return null;
        }

        /* Access modifiers changed, original: 0000 */
        public int w(View view) {
            if (view instanceof FixedAppBarLayout) {
                return ((FixedAppBarLayout) view).getTotalScrollRange();
            }
            return super.w(view);
        }
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @NonNull
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior() {
        return new Behavior();
    }

    public FixedAppBarLayout(Context context) {
        this(context, null);
    }

    public FixedAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.EI = -1;
        this.EJ = -1;
        this.EK = -1;
        this.EM = 0;
        setOrientation(1);
        c.Fz.al(context);
        if (VERSION.SDK_INT >= 21) {
            f.y(this);
            f.a(this, attributeSet, 0, l.Widget_Design_AppBarLayout);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.AppBarLayout, 0, l.Widget_Design_AppBarLayout);
        ViewCompat.setBackground(this, obtainStyledAttributes.getDrawable(m.AppBarLayout_android_background));
        if (obtainStyledAttributes.hasValue(m.AppBarLayout_expanded)) {
            a(obtainStyledAttributes.getBoolean(m.AppBarLayout_expanded, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && obtainStyledAttributes.hasValue(m.AppBarLayout_elevation)) {
            f.a(this, (float) obtainStyledAttributes.getDimensionPixelSize(m.AppBarLayout_elevation, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (obtainStyledAttributes.hasValue(m.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(obtainStyledAttributes.getBoolean(m.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (obtainStyledAttributes.hasValue(m.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(obtainStyledAttributes.getBoolean(m.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        obtainStyledAttributes.recycle();
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() {
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return FixedAppBarLayout.this.a(windowInsetsCompat);
            }
        });
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
        int i5 = 0;
        this.EL = false;
        i = getChildCount();
        while (i5 < i) {
            if (((a) getChildAt(i5).getLayoutParams()).mG() != null) {
                this.EL = true;
                break;
            }
            i5++;
        }
        mI();
    }

    private void mI() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (((a) getChildAt(i).getLayoutParams()).mH()) {
                z = true;
                break;
            }
        }
        S(z);
    }

    private void mx() {
        this.EI = -1;
        this.EJ = -1;
        this.EK = -1;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("FixedAppBarLayout is always vertical and does not support horizontal orientation");
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
        this.EM = i2 | i;
        requestLayout();
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: mJ */
    public a generateDefaultLayoutParams() {
        return new a(-1, -2);
    }

    /* renamed from: c */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: b */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (VERSION.SDK_INT >= 19 && (layoutParams instanceof LayoutParams)) {
            return new a((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new a((MarginLayoutParams) layoutParams);
        }
        return new a(layoutParams);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean mz() {
        return this.EL;
    }

    public final int getTotalScrollRange() {
        int i = this.EI;
        if (i != -1) {
            return i;
        }
        i = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = aVar.Ff;
            if ((i4 & 1) == 0) {
                break;
            }
            i2 += (measuredHeight + aVar.topMargin) + aVar.bottomMargin;
            if ((i4 & 2) != 0) {
                i2 -= ViewCompat.getMinimumHeight(childAt);
                break;
            }
        }
        i = Math.max(0, i2 - getTopInset());
        this.EI = i;
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
        int i = this.EJ;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = getChildCount() - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = aVar.Ff;
            if ((i3 & 5) == 5) {
                i2 += aVar.topMargin + aVar.bottomMargin;
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
        this.EJ = i;
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public int getDownNestedScrollRange() {
        int i = this.EK;
        if (i != -1) {
            return i;
        }
        i = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + (aVar.topMargin + aVar.bottomMargin);
            int i4 = aVar.Ff;
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
        this.EK = i;
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public void as(int i) {
        List list = this.mListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) this.mListeners.get(i2);
                if (bVar != null) {
                    bVar.d(this, i);
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
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
        if (this.EO == null) {
            this.EO = new int[2];
        }
        int[] iArr = this.EO;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.mCollapsible ? com.iqoption.core.i.a.state_collapsible : -com.iqoption.core.i.a.state_collapsible;
        int i2 = (this.mCollapsible && this.EN) ? com.iqoption.core.i.a.state_collapsed : -com.iqoption.core.i.a.state_collapsed;
        iArr[1] = i2;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    private boolean S(boolean z) {
        if (this.mCollapsible == z) {
            return false;
        }
        this.mCollapsible = z;
        refreshDrawableState();
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean T(boolean z) {
        if (this.EN == z) {
            return false;
        }
        this.EN = z;
        refreshDrawableState();
        return true;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            f.a(this, f);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int getPendingAction() {
        return this.EM;
    }

    /* Access modifiers changed, original: 0000 */
    public void mC() {
        this.EM = 0;
    }

    /* Access modifiers changed, original: final */
    @VisibleForTesting
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.mLastInsets;
        return windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
    }

    /* Access modifiers changed, original: 0000 */
    public WindowInsetsCompat a(WindowInsetsCompat windowInsetsCompat) {
        Object obj = ViewCompat.getFitsSystemWindows(this) ? windowInsetsCompat : null;
        if (!ObjectsCompat.equals(this.mLastInsets, obj)) {
            this.mLastInsets = obj;
            mx();
        }
        return windowInsetsCompat;
    }
}
