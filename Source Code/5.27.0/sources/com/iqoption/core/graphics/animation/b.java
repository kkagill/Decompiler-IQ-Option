package com.iqoption.core.graphics.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/graphics/animation/CancelCompleteAnimatorListener;", "Landroid/animation/AnimatorListenerAdapter;", "()V", "isCancelled", "", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "isReverse", "onAnimationStart", "onCancelled", "onCompleted", "core_release"})
/* compiled from: CancelCompleteAnimatorListener.kt */
public class b extends AnimatorListenerAdapter {
    private boolean ze;

    public void b(Animator animator) {
    }

    public void c(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.ze = false;
    }

    public void onAnimationStart(Animator animator, boolean z) {
        super.onAnimationStart(animator, z);
        this.ze = false;
    }

    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.ze = true;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.ze) {
            c(animator);
        } else {
            b(animator);
        }
    }

    public void onAnimationEnd(Animator animator, boolean z) {
        super.onAnimationEnd(animator, z);
        if (this.ze) {
            c(animator);
        } else {
            b(animator);
        }
    }
}
