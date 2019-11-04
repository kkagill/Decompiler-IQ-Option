package com.iqoption.fragment.rightpanel;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.iqoption.view.a.a.c;
import com.iqoption.x.R;

/* compiled from: SelectAnimator */
final class r {
    private final View dmv;
    private final View dmw;
    private AnimatorSet dpF;
    private AnimatorSet dpG;
    private final float dpH;

    public r(View view, View view2) {
        this.dmv = view;
        this.dmw = view2;
        this.dpH = view.getContext().getResources().getDimension(R.dimen.dp27);
    }

    public void select() {
        AnimatorSet animatorSet = this.dpF;
        if (animatorSet == null) {
            this.dpF = new AnimatorSet();
            this.dpF.setInterpolator(c.egR);
            animatorSet = this.dpF;
            Animator[] animatorArr = new Animator[2];
            animatorArr[0] = ObjectAnimator.ofFloat(this.dmw, View.ALPHA, new float[]{0.0f});
            animatorArr[1] = ObjectAnimator.ofFloat(this.dmv, View.TRANSLATION_X, new float[]{-this.dpH});
            animatorSet.playTogether(animatorArr);
        } else {
            animatorSet.cancel();
        }
        animatorSet = this.dpG;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.dpF.start();
    }

    public void aHN() {
        AnimatorSet animatorSet = this.dpG;
        if (animatorSet == null) {
            this.dpG = new AnimatorSet();
            this.dpG.setInterpolator(c.egR);
            animatorSet = this.dpG;
            Animator[] animatorArr = new Animator[2];
            animatorArr[0] = ObjectAnimator.ofFloat(this.dmw, View.ALPHA, new float[]{1.0f});
            animatorArr[1] = ObjectAnimator.ofFloat(this.dmv, View.TRANSLATION_X, new float[]{0.0f});
            animatorSet.playTogether(animatorArr);
        } else {
            animatorSet.cancel();
        }
        animatorSet = this.dpF;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.dpG.start();
    }
}
