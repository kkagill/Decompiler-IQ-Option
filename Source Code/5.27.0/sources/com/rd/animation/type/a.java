package com.rd.animation.type;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: BaseAnimation */
public abstract class a<T extends Animator> {
    protected T animator;
    protected long eHN = 350;
    protected com.rd.animation.a.b.a eHq;

    @NonNull
    public abstract T aYl();

    public abstract a am(float f);

    public a(@Nullable com.rd.animation.a.b.a aVar) {
        this.eHq = aVar;
        this.animator = aYl();
    }

    public a cJ(long j) {
        this.eHN = j;
        Animator animator = this.animator;
        if (animator instanceof ValueAnimator) {
            animator.setDuration(this.eHN);
        }
        return this;
    }

    public void start() {
        Animator animator = this.animator;
        if (animator != null && !animator.isRunning()) {
            this.animator.start();
        }
    }

    public void end() {
        Animator animator = this.animator;
        if (animator != null && animator.isStarted()) {
            this.animator.end();
        }
    }
}
