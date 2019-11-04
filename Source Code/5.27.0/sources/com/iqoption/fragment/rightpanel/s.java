package com.iqoption.fragment.rightpanel;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.iqoption.view.a.a.c;
import com.iqoption.x.R;

/* compiled from: StateAnimator */
final class s {
    private AnimatorSet ddI;
    private final View dpI;
    private final View dpJ;
    private final View dpK;
    int mState = 0;
    private final float translationX;

    public s(View view, View view2, View view3) {
        this.dpI = view;
        this.dpJ = view2;
        this.dpK = view3;
        this.translationX = view.getContext().getResources().getDimension(R.dimen.dp54);
    }

    public s(View view, View view2, View view3, float f) {
        this.dpI = view;
        this.dpJ = view2;
        this.dpK = view3;
        this.translationX = f;
    }

    public void gh(int i) {
        if (this.mState != i) {
            this.mState = i;
            AnimatorSet animatorSet = this.ddI;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.ddI = new AnimatorSet();
            this.ddI.setInterpolator(c.egR);
            i = this.mState;
            Animator[] animatorArr;
            if (i == 0) {
                animatorSet = this.ddI;
                animatorArr = new Animator[3];
                animatorArr[0] = ObjectAnimator.ofFloat(this.dpI, View.ALPHA, new float[]{1.0f});
                animatorArr[1] = ObjectAnimator.ofFloat(this.dpJ, View.TRANSLATION_X, new float[]{0.0f});
                animatorArr[2] = ObjectAnimator.ofFloat(this.dpK, View.ALPHA, new float[]{0.0f});
                animatorSet.playTogether(animatorArr);
                this.ddI.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        s.this.dpK.setVisibility(8);
                    }
                });
            } else if (i == 1) {
                animatorSet = this.ddI;
                Animator[] animatorArr2 = new Animator[3];
                animatorArr2[0] = ObjectAnimator.ofFloat(this.dpI, View.ALPHA, new float[]{0.0f});
                animatorArr2[1] = ObjectAnimator.ofFloat(this.dpJ, View.TRANSLATION_X, new float[]{-(this.translationX / 2.0f)});
                animatorArr2[2] = ObjectAnimator.ofFloat(this.dpK, View.ALPHA, new float[]{0.0f});
                animatorSet.playTogether(animatorArr2);
                this.ddI.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        s.this.dpK.setVisibility(8);
                    }
                });
            } else if (i == 2) {
                animatorSet = this.ddI;
                animatorArr = new Animator[3];
                animatorArr[0] = ObjectAnimator.ofFloat(this.dpI, View.ALPHA, new float[]{0.0f});
                animatorArr[1] = ObjectAnimator.ofFloat(this.dpJ, View.TRANSLATION_X, new float[]{-this.translationX});
                animatorArr[2] = ObjectAnimator.ofFloat(this.dpK, View.ALPHA, new float[]{1.0f});
                animatorSet.playTogether(animatorArr);
                this.ddI.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationStart(Animator animator) {
                        s.this.dpK.setVisibility(0);
                    }
                });
            }
            this.ddI.start();
        }
    }
}
