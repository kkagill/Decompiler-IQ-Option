package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import com.google.android.material.a.a;

public class HideBottomViewOnScrollBehavior<V extends View> extends Behavior<V> {
    private int FL = 2;
    private ViewPropertyAnimator FN;
    private int height = 0;

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.height = v.getMeasuredHeight();
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (this.FL != 1 && i2 > 0) {
            A(v);
        } else if (this.FL != 2 && i2 < 0) {
            z(v);
        }
    }

    /* Access modifiers changed, original: protected */
    public void z(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.FN;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.FL = 2;
        a(v, 0, 225, a.DL);
    }

    /* Access modifiers changed, original: protected */
    public void A(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.FN;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.FL = 1;
        a(v, this.height, 175, a.DI);
    }

    private void a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.FN = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.FN = null;
            }
        });
    }
}
