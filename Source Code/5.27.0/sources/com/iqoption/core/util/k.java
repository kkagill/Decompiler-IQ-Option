package com.iqoption.core.util;

import com.iqoption.core.c.a;

/* compiled from: DelayedCommand */
public final class k {
    private final Runnable bQD;
    private boolean bQE;

    public k(Runnable runnable) {
        this.bQD = new -$$Lambda$k$w08w2waZv3CV5bwk3STpuPMEDL8(this, runnable);
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

    public void execute() {
        this.bQD.run();
    }
}
