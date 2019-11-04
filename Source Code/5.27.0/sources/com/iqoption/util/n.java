package com.iqoption.util;

import com.iqoption.core.c.a;

/* compiled from: DelayedCommand */
public final class n {
    private final Runnable bQD;
    private boolean bQE;

    public n(Runnable runnable) {
        this.bQD = new -$$Lambda$n$BPm3rNkkl59m-BMMits5pvrUvEk(this, runnable);
    }

    private /* synthetic */ void f(Runnable runnable) {
        this.bQE = false;
        runnable.run();
    }

    public void bm(long j) {
        if (!this.bQE) {
            a.biN.postDelayed(this.bQD, j);
            this.bQE = true;
        }
    }

    public void cancel() {
        if (this.bQE) {
            a.biN.removeCallbacks(this.bQD);
            this.bQE = false;
        }
    }
}
