package com.iqoption.fragment.leftmenu;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.view.ViewAnimationUtils;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.x.R;

/* compiled from: LeftMenuAnimationHelper */
public class c {
    public static Animator a(LeftMenuFragment leftMenuFragment, int i) {
        if (leftMenuFragment == null || leftMenuFragment.diE == null) {
            return null;
        }
        Animator createCircularReveal;
        Resources resources = leftMenuFragment.getResources();
        RecyclerView recyclerView = leftMenuFragment.diE.cmH;
        FrameLayout frameLayout = leftMenuFragment.diE.cmG;
        recyclerView.clearAnimation();
        frameLayout.clearAnimation();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.dp24);
        float dimension = resources.getDimension(R.dimen.left_menu_width2);
        float dimension2 = resources.getDimension(R.dimen.left_menu_item_button_height);
        r5 = new PropertyValuesHolder[2];
        r5[0] = PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f, 1.0f});
        r5[1] = PropertyValuesHolder.ofFloat("translationY", new float[]{dimension2, 0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(recyclerView, r5);
        if (VERSION.SDK_INT >= 21) {
            createCircularReveal = ViewAnimationUtils.createCircularReveal(frameLayout, dimensionPixelOffset, dimensionPixelOffset, 0.0f, ((float) i) * 1.1f);
        } else {
            createCircularReveal = ObjectAnimator.ofFloat(frameLayout, "translationX", new float[]{-dimension, 0.0f});
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, createCircularReveal});
        animatorSet.setInterpolator(com.iqoption.view.a.a.c.egR);
        return animatorSet;
    }

    public static Animator b(LeftMenuFragment leftMenuFragment, int i) {
        if (leftMenuFragment == null || leftMenuFragment.diE == null) {
            return null;
        }
        Animator createCircularReveal;
        Resources resources = leftMenuFragment.getResources();
        RecyclerView recyclerView = leftMenuFragment.diE.cmH;
        FrameLayout frameLayout = leftMenuFragment.diE.cmG;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.dp24);
        float dimension = resources.getDimension(R.dimen.left_menu_width2);
        float dimension2 = resources.getDimension(R.dimen.left_menu_item_button_height);
        r5 = new PropertyValuesHolder[2];
        r5[0] = PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f, 0.0f});
        r5[1] = PropertyValuesHolder.ofFloat("translationY", new float[]{0.0f, dimension2});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(recyclerView, r5);
        if (VERSION.SDK_INT >= 21) {
            createCircularReveal = ViewAnimationUtils.createCircularReveal(frameLayout, dimensionPixelSize, dimensionPixelSize, ((float) i) * 1.1f, 0.0f);
        } else {
            createCircularReveal = ObjectAnimator.ofFloat(frameLayout, "translationX", new float[]{0.0f, -dimension});
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, createCircularReveal});
        animatorSet.setInterpolator(com.iqoption.view.a.a.c.egR);
        return animatorSet;
    }
}
