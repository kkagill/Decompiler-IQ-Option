package io.reactivex.internal.subscriptions;

import io.reactivex.internal.a.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

public class SubscriptionArbiter extends AtomicInteger implements d {
    private static final long serialVersionUID = -2189523197179400958L;
    d actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    final AtomicLong missedProduced = new AtomicLong();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicReference<d> missedSubscription = new AtomicReference();
    long requested;
    protected boolean unbounded;

    public SubscriptionArbiter(boolean z) {
        this.cancelOnReplace = z;
    }

    public final void a(d dVar) {
        if (this.cancelled) {
            dVar.cancel();
            return;
        }
        b.requireNonNull(dVar, "s is null");
        if (get() == 0 && compareAndSet(0, 1)) {
            d dVar2 = this.actual;
            if (dVar2 != null && this.cancelOnReplace) {
                dVar2.cancel();
            }
            this.actual = dVar;
            long j = this.requested;
            if (decrementAndGet() != 0) {
                blI();
            }
            if (j != 0) {
                dVar.request(j);
            }
            return;
        }
        dVar = (d) this.missedSubscription.getAndSet(dVar);
        if (dVar != null && this.cancelOnReplace) {
            dVar.cancel();
        }
        drain();
    }

    public final void request(long j) {
        if (SubscriptionHelper.validate(j) && !this.unbounded) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j2 = this.requested;
                if (j2 != Long.MAX_VALUE) {
                    j2 = io.reactivex.internal.util.b.z(j2, j);
                    this.requested = j2;
                    if (j2 == Long.MAX_VALUE) {
                        this.unbounded = true;
                    }
                }
                d dVar = this.actual;
                if (decrementAndGet() != 0) {
                    blI();
                }
                if (dVar != null) {
                    dVar.request(j);
                }
                return;
            }
            io.reactivex.internal.util.b.a(this.missedRequested, j);
            drain();
        }
    }

    public final void dc(long j) {
        if (!this.unbounded) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j2 = this.requested;
                if (j2 != Long.MAX_VALUE) {
                    j2 -= j;
                    j = 0;
                    if (j2 < 0) {
                        SubscriptionHelper.reportMoreProduced(j2);
                    } else {
                        j = j2;
                    }
                    this.requested = j;
                }
                if (decrementAndGet() != 0) {
                    blI();
                    return;
                }
                return;
            }
            io.reactivex.internal.util.b.a(this.missedProduced, j);
            drain();
        }
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            drain();
        }
    }

    /* Access modifiers changed, original: final */
    public final void drain() {
        if (getAndIncrement() == 0) {
            blI();
        }
    }

    /* Access modifiers changed, original: final */
    public final void blI() {
        d dVar = null;
        long j = 0;
        int i = 1;
        do {
            d dVar2 = (d) this.missedSubscription.get();
            if (dVar2 != null) {
                dVar2 = (d) this.missedSubscription.getAndSet(null);
            }
            long j2 = this.missedRequested.get();
            if (j2 != 0) {
                j2 = this.missedRequested.getAndSet(0);
            }
            long j3 = this.missedProduced.get();
            if (j3 != 0) {
                j3 = this.missedProduced.getAndSet(0);
            }
            d dVar3 = this.actual;
            if (this.cancelled) {
                if (dVar3 != null) {
                    dVar3.cancel();
                    this.actual = null;
                }
                if (dVar2 != null) {
                    dVar2.cancel();
                }
            } else {
                long j4 = this.requested;
                if (j4 != Long.MAX_VALUE) {
                    j4 = io.reactivex.internal.util.b.z(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j3 = j4 - j3;
                        if (j3 < 0) {
                            SubscriptionHelper.reportMoreProduced(j3);
                            j3 = 0;
                        }
                        j4 = j3;
                    }
                    this.requested = j4;
                }
                if (dVar2 != null) {
                    if (dVar3 != null && this.cancelOnReplace) {
                        dVar3.cancel();
                    }
                    this.actual = dVar2;
                    if (j4 != 0) {
                        j = io.reactivex.internal.util.b.z(j, j4);
                        dVar = dVar2;
                    }
                } else if (!(dVar3 == null || j2 == 0)) {
                    j = io.reactivex.internal.util.b.z(j, j2);
                    dVar = dVar3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            dVar.request(j);
        }
    }

    public final boolean bmA() {
        return this.unbounded;
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }
}
