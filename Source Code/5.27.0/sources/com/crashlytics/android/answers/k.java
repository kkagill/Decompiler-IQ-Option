package com.crashlytics.android.answers;

import io.fabric.sdk.android.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: BackgroundManager */
class k {
    private final List<a> gb = new ArrayList();
    boolean inBackground = true;
    private final ScheduledExecutorService oh;
    private volatile boolean oi = true;
    final AtomicReference<ScheduledFuture<?>> oj = new AtomicReference();

    /* compiled from: BackgroundManager */
    public interface a {
        void eo();
    }

    public k(ScheduledExecutorService scheduledExecutorService) {
        this.oh = scheduledExecutorService;
    }

    public void w(boolean z) {
        this.oi = z;
    }

    private void el() {
        for (a eo : this.gb) {
            eo.eo();
        }
    }

    public void a(a aVar) {
        this.gb.add(aVar);
    }

    public void em() {
        this.inBackground = false;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.oj.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public void en() {
        if (this.oi && !this.inBackground) {
            this.inBackground = true;
            try {
                this.oj.compareAndSet(null, this.oh.schedule(new Runnable() {
                    public void run() {
                        k.this.oj.set(null);
                        k.this.el();
                    }
                }, 5000, TimeUnit.MILLISECONDS));
            } catch (RejectedExecutionException e) {
                c.biX().d("Answers", "Failed to schedule background detector", e);
            }
        }
    }
}
