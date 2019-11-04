package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.i.c;
import java.util.ArrayList;
import java.util.List;

public class BottomAppBar extends Toolbar implements AttachedBehavior {
    private final int Gf;
    private final c Gg;
    private final a Gh;
    @Nullable
    private Animator Gi;
    @Nullable
    private Animator Gj;
    @Nullable
    private Animator Gk;
    private boolean Gl;
    private boolean Gm;
    AnimatorListenerAdapter Gn;
    private int fabAlignmentMode;

    static class a extends AbsSavedState {
        public static final Creator<a> CREATOR = new ClassLoaderCreator<a>() {
            /* renamed from: c */
            public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            /* renamed from: P */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            /* renamed from: aD */
            public a[] newArray(int i) {
                return new a[i];
            }
        };
        boolean Gm;
        int fabAlignmentMode;

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.fabAlignmentMode = parcel.readInt();
            this.Gm = parcel.readInt() != 0;
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.fabAlignmentMode);
            parcel.writeInt(this.Gm);
        }
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        private final Rect Gs = new Rect();

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private boolean a(FloatingActionButton floatingActionButton, BottomAppBar bottomAppBar) {
            ((LayoutParams) floatingActionButton.getLayoutParams()).anchorGravity = 17;
            bottomAppBar.a(floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            FloatingActionButton c = bottomAppBar.mQ();
            if (c != null) {
                a(c, bottomAppBar);
                c.c(this.Gs);
                bottomAppBar.setFabDiameter(this.Gs.height());
            }
            if (!bottomAppBar.mT()) {
                bottomAppBar.mU();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: a */
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, @NonNull View view, @NonNull View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        /* Access modifiers changed, original: protected */
        /* renamed from: g */
        public void z(BottomAppBar bottomAppBar) {
            super.z(bottomAppBar);
            FloatingActionButton c = bottomAppBar.mQ();
            if (c != null) {
                c.clearAnimation();
                c.animate().translationY(bottomAppBar.getFabTranslationY()).setInterpolator(com.google.android.material.a.a.DL).setDuration(225);
            }
        }

        /* Access modifiers changed, original: protected */
        /* renamed from: h */
        public void A(BottomAppBar bottomAppBar) {
            super.A(bottomAppBar);
            FloatingActionButton c = bottomAppBar.mQ();
            if (c != null) {
                c.b(this.Gs);
                float measuredHeight = (float) (c.getMeasuredHeight() - this.Gs.height());
                c.clearAnimation();
                c.animate().translationY(((float) (-c.getPaddingBottom())) + measuredHeight).setInterpolator(com.google.android.material.a.a.DI).setDuration(175);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public int getFabAlignmentMode() {
        return this.fabAlignmentMode;
    }

    public void setFabAlignmentMode(int i) {
        aB(i);
        e(i, this.Gm);
        this.fabAlignmentMode = i;
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        DrawableCompat.setTintList(this.Gg, colorStateList);
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        return this.Gg.oc();
    }

    public float getFabCradleMargin() {
        return this.Gh.getFabCradleMargin();
    }

    public void setFabCradleMargin(@Dimension float f) {
        if (f != getFabCradleMargin()) {
            this.Gh.setFabCradleMargin(f);
            this.Gg.invalidateSelf();
        }
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return this.Gh.getFabCradleRoundedCornerRadius();
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            this.Gh.setFabCradleRoundedCornerRadius(f);
            this.Gg.invalidateSelf();
        }
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return this.Gh.getCradleVerticalOffset();
    }

    public void setCradleVerticalOffset(@Dimension float f) {
        if (f != getCradleVerticalOffset()) {
            this.Gh.setCradleVerticalOffset(f);
            this.Gg.invalidateSelf();
        }
    }

    public boolean getHideOnScroll() {
        return this.Gl;
    }

    public void setHideOnScroll(boolean z) {
        this.Gl = z;
    }

    /* Access modifiers changed, original: 0000 */
    public void setFabDiameter(@Px int i) {
        float f = (float) i;
        if (f != this.Gh.mW()) {
            this.Gh.q(f);
            this.Gg.invalidateSelf();
        }
    }

    private void aB(int i) {
        if (this.fabAlignmentMode != i && ViewCompat.isLaidOut(this)) {
            Animator animator = this.Gj;
            if (animator != null) {
                animator.cancel();
            }
            List arrayList = new ArrayList();
            a(i, arrayList);
            b(i, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.Gj = animatorSet;
            this.Gj.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.Gj = null;
                }
            });
            this.Gj.start();
        }
    }

    private void a(int i, List<Animator> list) {
        if (this.Gm) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.Gh.mV(), (float) aC(i)});
            ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BottomAppBar.this.Gh.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    BottomAppBar.this.Gg.invalidateSelf();
                }
            });
            ofFloat.setDuration(300);
            list.add(ofFloat);
        }
    }

    @Nullable
    private FloatingActionButton mQ() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if (view instanceof FloatingActionButton) {
                return (FloatingActionButton) view;
            }
        }
        return null;
    }

    private boolean mR() {
        FloatingActionButton mQ = mQ();
        return mQ != null && mQ.nt();
    }

    private void b(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mQ(), "translationX", new float[]{(float) aC(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    private void e(int i, boolean z) {
        if (ViewCompat.isLaidOut(this)) {
            Animator animator = this.Gk;
            if (animator != null) {
                animator.cancel();
            }
            List arrayList = new ArrayList();
            if (!mR()) {
                i = 0;
                z = false;
            }
            a(i, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.Gk = animatorSet;
            this.Gk.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.Gk = null;
                }
            });
            this.Gk.start();
        }
    }

    private void a(final int i, final boolean z, List<Animator> list) {
        final ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            String str = "alpha";
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{1.0f});
            if ((this.Gm || (z && mR())) && (this.fabAlignmentMode == 1 || i == 1)) {
                ObjectAnimator.ofFloat(actionMenuView, str, new float[]{0.0f}).addListener(new AnimatorListenerAdapter() {
                    public boolean cancelled;

                    public void onAnimationCancel(Animator animator) {
                        this.cancelled = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        if (!this.cancelled) {
                            BottomAppBar.this.a(actionMenuView, i, z);
                        }
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{r3, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    private float U(boolean z) {
        FloatingActionButton mQ = mQ();
        if (mQ == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        mQ.b(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) mQ.getMeasuredHeight();
        }
        float height2 = (float) (mQ.getHeight() - rect.bottom);
        float f = ((-getCradleVerticalOffset()) + (height / 2.0f)) + height2;
        float height3 = ((float) (mQ.getHeight() - rect.height())) - ((float) mQ.getPaddingBottom());
        height2 = (float) (-getMeasuredHeight());
        if (z) {
            height3 = f;
        }
        return height2 + height3;
    }

    private float getFabTranslationY() {
        return U(this.Gm);
    }

    private int aC(int i) {
        int i2 = 1;
        Object obj = ViewCompat.getLayoutDirection(this) == 1 ? 1 : null;
        if (i != 1) {
            return 0;
        }
        i = (getMeasuredWidth() / 2) - this.Gf;
        if (obj != null) {
            i2 = -1;
        }
        return i * i2;
    }

    private float getFabTranslationX() {
        return (float) aC(this.fabAlignmentMode);
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private void a(ActionMenuView actionMenuView, int i, boolean z) {
        Object obj = ViewCompat.getLayoutDirection(this) == 1 ? 1 : null;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            Object obj2 = ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == GravityCompat.START) ? 1 : null;
            if (obj2 != null) {
                i2 = Math.max(i2, obj != null ? childAt.getLeft() : childAt.getRight());
            }
        }
        float right = (i == 1 && z) ? (float) (i2 - (obj != null ? actionMenuView.getRight() : actionMenuView.getLeft())) : 0.0f;
        actionMenuView.setTranslationX(right);
    }

    private void mS() {
        Animator animator = this.Gi;
        if (animator != null) {
            animator.cancel();
        }
        animator = this.Gk;
        if (animator != null) {
            animator.cancel();
        }
        animator = this.Gj;
        if (animator != null) {
            animator.cancel();
        }
    }

    private boolean mT() {
        Animator animator = this.Gi;
        if (animator == null || !animator.isRunning()) {
            animator = this.Gk;
            if (animator == null || !animator.isRunning()) {
                animator = this.Gj;
                if (animator == null || !animator.isRunning()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mS();
        mU();
    }

    private void mU() {
        this.Gh.p(getFabTranslationX());
        FloatingActionButton mQ = mQ();
        c cVar = this.Gg;
        float f = (this.Gm && mR()) ? 1.0f : 0.0f;
        cVar.D(f);
        if (mQ != null) {
            mQ.setTranslationY(getFabTranslationY());
            mQ.setTranslationX(getFabTranslationX());
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (mR()) {
                a(actionMenuView, this.fabAlignmentMode, this.Gm);
            } else {
                a(actionMenuView, 0, false);
            }
        }
    }

    private void a(@NonNull FloatingActionButton floatingActionButton) {
        b(floatingActionButton);
        floatingActionButton.e(this.Gn);
        floatingActionButton.c(this.Gn);
    }

    private void b(@NonNull FloatingActionButton floatingActionButton) {
        floatingActionButton.f(this.Gn);
        floatingActionButton.d(this.Gn);
    }

    @NonNull
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    /* Access modifiers changed, original: protected */
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.fabAlignmentMode = this.fabAlignmentMode;
        aVar.Gm = this.Gm;
        return aVar;
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            super.onRestoreInstanceState(aVar.getSuperState());
            this.fabAlignmentMode = aVar.fabAlignmentMode;
            this.Gm = aVar.Gm;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }
}
