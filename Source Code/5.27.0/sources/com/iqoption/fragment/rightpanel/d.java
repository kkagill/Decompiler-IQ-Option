package com.iqoption.fragment.rightpanel;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import com.iqoption.fragment.rightpanel.e.a;
import com.iqoption.view.a.a.c;

/* compiled from: CrossFadeAnimatorProvider */
public class d implements a {
    private final View aGn;

    public d(View view) {
        this.aGn = view;
    }

    public void i(View view, View view2) {
        if (view == this.aGn) {
            view.setAlpha(0.0f);
            view.setTranslationY((float) view.getHeight());
        }
    }

    public void a(AnimatorSet animatorSet) {
        animatorSet.setInterpolator(c.egR);
    }

    public Animator j(View view, View view2) {
        PropertyValuesHolder[] propertyValuesHolderArr;
        if (view == this.aGn) {
            propertyValuesHolderArr = new PropertyValuesHolder[2];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
            Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
            ofPropertyValuesHolder.setInterpolator(c.bhT);
            return ofPropertyValuesHolder;
        }
        propertyValuesHolderArr = new PropertyValuesHolder[3];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f});
        propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f});
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        ofPropertyValuesHolder2.setInterpolator(c.egR);
        return ofPropertyValuesHolder2;
    }

    public Animator k(View view, View view2) {
        PropertyValuesHolder[] propertyValuesHolderArr;
        if (view2 == this.aGn) {
            propertyValuesHolderArr = new PropertyValuesHolder[2];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{(float) view2.getHeight()});
            Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, propertyValuesHolderArr);
            ofPropertyValuesHolder.setInterpolator(c.bhU);
            return ofPropertyValuesHolder;
        }
        propertyValuesHolderArr = new PropertyValuesHolder[3];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.95f});
        propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.95f});
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view2, propertyValuesHolderArr);
        ofPropertyValuesHolder2.setInterpolator(c.egR);
        return ofPropertyValuesHolder2;
    }
}
