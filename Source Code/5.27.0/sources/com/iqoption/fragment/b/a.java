package com.iqoption.fragment.b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.iqoption.core.util.b;
import com.iqoption.util.ak;
import com.iqoption.view.a.a.c;

/* compiled from: BaseBottomSheet */
public abstract class a extends b {
    private float offset;

    /* Access modifiers changed, original: protected */
    public void Y(float f) {
    }

    /* Access modifiers changed, original: protected */
    public void aBJ() {
    }

    /* Access modifiers changed, original: protected */
    public boolean aBK() {
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean amB() {
        return true;
    }

    public abstract View atP();

    public abstract View atQ();

    /* Access modifiers changed, original: protected */
    public void gc(int i) {
    }

    public final long getAnimationDuration() {
        return 300;
    }

    public final void att() {
        View atP = atP();
        View atQ = atQ();
        atP.setTranslationY((float) atP.getHeight());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(atP, View.TRANSLATION_Y, new float[]{0.0f});
        atQ.setAlpha(0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(atQ, View.ALPHA, new float[]{1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        b.a(animatorSet, getAnimationDuration());
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.setInterpolator(c.bhT);
        animatorSet.start();
    }

    public final void atu() {
        View atP = atP();
        View atQ = atQ();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(atP, View.TRANSLATION_Y, new float[]{(float) atP.getHeight()});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(atQ, View.ALPHA, new float[]{0.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        b.a(animatorSet, getAnimationDuration());
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.setInterpolator(c.bhU);
        animatorSet.start();
    }

    public final boolean onClose() {
        getFragmentManager().popBackStack();
        aBJ();
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void F(float f) {
        this.offset = f;
        Y(f);
    }

    public final void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        view = atP();
        atQ().setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                a.this.onClose();
            }
        });
        BottomSheetBehavior E = BottomSheetBehavior.E(view);
        E.a(new com.google.android.material.bottomsheet.BottomSheetBehavior.a() {
            public void b(@NonNull View view, int i) {
                a.this.gc(i);
                if (i == 5) {
                    a.this.onClose();
                }
            }

            public void d(@NonNull View view, float f) {
                a.this.F(f);
            }
        });
        E.X(amB());
        E.aE(atR());
        E.W(aBK());
    }

    /* Access modifiers changed, original: protected */
    public int atR() {
        View atP = atP();
        ak.ca(atP);
        return atP.getMeasuredHeight();
    }
}
