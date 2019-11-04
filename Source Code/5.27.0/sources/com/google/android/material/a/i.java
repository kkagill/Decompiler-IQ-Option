package com.google.android.material.a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: MotionTiming */
public class i {
    @Nullable
    private TimeInterpolator DY = null;
    private long delay = 0;
    private long duration = 300;
    private int repeatCount = 0;
    private int repeatMode = 1;

    public i(long j, long j2) {
        this.delay = j;
        this.duration = j2;
    }

    public i(long j, long j2, @NonNull TimeInterpolator timeInterpolator) {
        this.delay = j;
        this.duration = j2;
        this.DY = timeInterpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(mv());
        animator.setDuration(getDuration());
        animator.setInterpolator(getInterpolator());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(getRepeatCount());
            valueAnimator.setRepeatMode(getRepeatMode());
        }
    }

    public long mv() {
        return this.delay;
    }

    public long getDuration() {
        return this.duration;
    }

    public TimeInterpolator getInterpolator() {
        TimeInterpolator timeInterpolator = this.DY;
        return timeInterpolator != null ? timeInterpolator : a.DH;
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public int getRepeatMode() {
        return this.repeatMode;
    }

    static i a(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), b(valueAnimator));
        iVar.repeatCount = valueAnimator.getRepeatCount();
        iVar.repeatMode = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return a.DH;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.DI;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            interpolator = a.DL;
        }
        return interpolator;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (mv() == iVar.mv() && getDuration() == iVar.getDuration() && getRepeatCount() == iVar.getRepeatCount() && getRepeatMode() == iVar.getRepeatMode()) {
            return getInterpolator().getClass().equals(iVar.getInterpolator().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (mv() ^ (mv() >>> 32))) * 31) + ((int) (getDuration() ^ (getDuration() >>> 32)))) * 31) + getInterpolator().getClass().hashCode()) * 31) + getRepeatCount()) * 31) + getRepeatMode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(10);
        stringBuilder.append(getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" delay: ");
        stringBuilder.append(mv());
        stringBuilder.append(" duration: ");
        stringBuilder.append(getDuration());
        stringBuilder.append(" interpolator: ");
        stringBuilder.append(getInterpolator().getClass());
        stringBuilder.append(" repeatCount: ");
        stringBuilder.append(getRepeatCount());
        stringBuilder.append(" repeatMode: ");
        stringBuilder.append(getRepeatMode());
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
