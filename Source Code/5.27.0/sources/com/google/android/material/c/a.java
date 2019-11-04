package com.google.android.material.c;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.c.d.b;
import com.google.android.material.c.d.d;

/* compiled from: CircularRevealCompat */
public final class a {
    public static Animator a(d dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, b.Ib, com.google.android.material.c.d.a.Ia, new d[]{new d(f, f2, f3)});
        if (VERSION.SDK_INT < 21) {
            return ofObject;
        }
        d revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.radius, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    public static AnimatorListener a(final d dVar) {
        return new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                dVar.nj();
            }

            public void onAnimationEnd(Animator animator) {
                dVar.nk();
            }
        };
    }
}
