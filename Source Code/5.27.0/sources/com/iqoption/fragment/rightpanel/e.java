package com.iqoption.fragment.rightpanel;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import com.iqoption.view.a.a.c;

/* compiled from: CrossfadeAnimator */
public final class e {
    private AnimatorSet ddI;
    private final View[] dmt;
    private final a dmu;
    private View dmv;
    private View dmw;

    /* compiled from: CrossfadeAnimator */
    public interface a {
        void a(AnimatorSet animatorSet);

        void i(View view, View view2);

        Animator j(View view, View view2);

        Animator k(View view, View view2);
    }

    /* compiled from: CrossfadeAnimator */
    public static class b implements a {
        private final int translationY;

        protected b(int i) {
            this.translationY = i;
        }

        public void i(View view, View view2) {
            view.setTranslationY((float) this.translationY);
            view.setAlpha(0.0f);
        }

        public void a(AnimatorSet animatorSet) {
            animatorSet.setInterpolator(c.egR);
        }

        public Animator j(View view, View view2) {
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
            return ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        }

        public Animator k(View view, View view2) {
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{(float) this.translationY});
            return ObjectAnimator.ofPropertyValuesHolder(view2, propertyValuesHolderArr);
        }
    }

    public e(int i, View... viewArr) {
        this(new b(i), viewArr);
    }

    public e(a aVar, View... viewArr) {
        this.dmt = viewArr;
        if (aVar == null) {
            aVar = new b(0);
        }
        this.dmu = aVar;
    }

    public boolean bE(View view) {
        return view.getVisibility() == 0 && view != this.dmw;
    }

    public void ak(View view) {
        AnimatorSet animatorSet = this.ddI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (bF(view)) {
            this.ddI = new AnimatorSet();
            this.dmv.setVisibility(0);
            this.dmu.i(this.dmv, this.dmw);
            Builder play = this.ddI.play(this.dmu.j(this.dmv, this.dmw));
            View view2 = this.dmw;
            if (view2 != null) {
                play.with(this.dmu.k(this.dmv, view2));
                this.ddI.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        e.this.dmw.setVisibility(8);
                    }
                });
            }
            this.dmu.a(this.ddI);
            this.ddI.start();
        }
    }

    private boolean bF(View view) {
        this.dmv = null;
        this.dmw = null;
        boolean z = false;
        for (View view2 : this.dmt) {
            if (view2 == view) {
                this.dmv = view2;
                z = true;
            } else if (view2.getVisibility() == 0) {
                this.dmw = view2;
            }
        }
        return z;
    }
}
