package com.iqoption.activity.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.iqoption.view.a.a.c;
import com.iqoption.x.R;

/* compiled from: TraderoomAnimationHelper */
public class a {
    private static final String TAG = "com.iqoption.activity.a.a";

    public static Animator d(View view, View view2) {
        float dimension = view.getResources().getDimension(R.dimen.right_panel_width);
        view2.setAlpha(0.0f);
        view2.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{dimension});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.setInterpolator(c.egR);
        return animatorSet;
    }

    public static Animator e(View view, final View view2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f});
        ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.0f}).addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                view2.setVisibility(8);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, r1});
        animatorSet.setInterpolator(c.egR);
        return animatorSet;
    }
}
