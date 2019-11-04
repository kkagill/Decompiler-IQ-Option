package com.airbnb.lottie.d;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: BaseLottieAnimator */
public abstract class a extends ValueAnimator {
    private final Set<AnimatorUpdateListener> jT = new CopyOnWriteArraySet();
    private final Set<AnimatorListener> jU = new CopyOnWriteArraySet();

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void addUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        this.jT.add(animatorUpdateListener);
    }

    public void removeUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        this.jT.remove(animatorUpdateListener);
    }

    public void removeAllUpdateListeners() {
        this.jT.clear();
    }

    public void addListener(AnimatorListener animatorListener) {
        this.jU.add(animatorListener);
    }

    public void removeListener(AnimatorListener animatorListener) {
        this.jU.remove(animatorListener);
    }

    public void removeAllListeners() {
        this.jU.clear();
    }

    /* Access modifiers changed, original: 0000 */
    public void r(boolean z) {
        for (AnimatorListener animatorListener : this.jU) {
            if (VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cG() {
        for (AnimatorListener onAnimationRepeat : this.jU) {
            onAnimationRepeat.onAnimationRepeat(this);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void s(boolean z) {
        for (AnimatorListener animatorListener : this.jU) {
            if (VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cH() {
        for (AnimatorListener onAnimationCancel : this.jU) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cI() {
        for (AnimatorUpdateListener onAnimationUpdate : this.jT) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }
}
