package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import java.util.ArrayList;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: StateListAnimator */
public final class f {
    private final ArrayList<a> KV = new ArrayList();
    private a KX = null;
    ValueAnimator La = null;
    private final AnimatorListener Lb = new AnimatorListenerAdapter() {
        public void onAnimationEnd(Animator animator) {
            if (f.this.La == animator) {
                f.this.La = null;
            }
        }
    };

    /* compiled from: StateListAnimator */
    static class a {
        final int[] Ld;
        final ValueAnimator Le;

        a(int[] iArr, ValueAnimator valueAnimator) {
            this.Ld = iArr;
            this.Le = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        a aVar = new a(iArr, valueAnimator);
        valueAnimator.addListener(this.Lb);
        this.KV.add(aVar);
    }

    public void c(int[] iArr) {
        a aVar;
        int size = this.KV.size();
        for (int i = 0; i < size; i++) {
            aVar = (a) this.KV.get(i);
            if (StateSet.stateSetMatches(aVar.Ld, iArr)) {
                break;
            }
        }
        aVar = null;
        a aVar2 = this.KX;
        if (aVar != aVar2) {
            if (aVar2 != null) {
                cancel();
            }
            this.KX = aVar;
            if (aVar != null) {
                a(aVar);
            }
        }
    }

    private void a(a aVar) {
        this.La = aVar.Le;
        this.La.start();
    }

    private void cancel() {
        ValueAnimator valueAnimator = this.La;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.La = null;
        }
    }

    public void jumpToCurrentState() {
        ValueAnimator valueAnimator = this.La;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.La = null;
        }
    }
}
