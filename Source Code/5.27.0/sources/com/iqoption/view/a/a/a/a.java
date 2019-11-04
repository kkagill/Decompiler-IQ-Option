package com.iqoption.view.a.a.a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* compiled from: BuilderAnimationListener */
public class a implements AnimatorListener, AnimationListener {
    private b egS;
    private b egT;
    private int mEndVisibility = -1;
    private int mStartVisibility = -1;
    private final View mView;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public a(View view) {
        this.mView = view;
    }

    public a fr(boolean z) {
        this.mEndVisibility = z;
        return this;
    }

    public a fs(boolean z) {
        this.mStartVisibility = z;
        return this;
    }

    public a a(b bVar) {
        this.egS = bVar;
        return this;
    }

    public a b(b bVar) {
        this.egT = bVar;
        return this;
    }

    public static a cf(View view) {
        return new a(view).fr(false);
    }

    public static a cg(View view) {
        return new a(view).fs(true);
    }

    public static a c(b bVar) {
        return new a(null).a(bVar);
    }

    public static a d(b bVar) {
        return new a(null).b(bVar);
    }

    private void onAnimationStart() {
        int i = this.mStartVisibility;
        if (i >= 0) {
            View view = this.mView;
            if (view != null) {
                view.setVisibility(i == 1 ? 0 : 8);
            }
        }
        b bVar = this.egT;
        if (bVar != null) {
            bVar.execute();
        }
    }

    private void onAnimationEnd() {
        int i = this.mEndVisibility;
        if (i >= 0) {
            View view = this.mView;
            if (view != null) {
                view.setVisibility(i == 1 ? 0 : 8);
            }
        }
        b bVar = this.egS;
        if (bVar != null) {
            bVar.execute();
        }
    }

    public void onAnimationStart(Animator animator) {
        onAnimationStart();
    }

    public void onAnimationEnd(Animator animator) {
        onAnimationEnd();
    }

    public void onAnimationStart(Animation animation) {
        onAnimationStart();
    }

    public void onAnimationEnd(Animation animation) {
        View view = this.mView;
        if (view != null) {
            view.clearAnimation();
        }
        onAnimationEnd();
    }
}
