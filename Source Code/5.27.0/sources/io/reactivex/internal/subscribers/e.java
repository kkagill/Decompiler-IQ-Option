package io.reactivex.internal.subscribers;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.g;
import org.a.c;

/* compiled from: QueueDrainSubscriber */
public abstract class e<T, U, V> extends i implements h<T>, g<U, V> {
    protected volatile boolean cancelled;
    protected volatile boolean done;
    protected final c<? super V> downstream;
    protected Throwable error;
    protected final io.reactivex.internal.b.g<U> queue;

    public boolean a(c<? super V> cVar, U u) {
        return false;
    }

    public e(c<? super V> cVar, io.reactivex.internal.b.g<U> gVar) {
        this.downstream = cVar;
        this.queue = gVar;
    }

    public final boolean bmu() {
        return this.cancelled;
    }

    public final boolean bmv() {
        return this.done;
    }

    public final boolean bmw() {
        return this.wip.getAndIncrement() == 0;
    }

    public final boolean bmx() {
        return this.wip.get() == 0 && this.wip.compareAndSet(0, 1);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(U u, boolean z, b bVar) {
        c cVar = this.downstream;
        io.reactivex.internal.b.g gVar = this.queue;
        if (bmx()) {
            long j = this.requested.get();
            if (j != 0) {
                if (a(cVar, u) && j != Long.MAX_VALUE) {
                    cU(1);
                }
                if (jD(-1) == 0) {
                    return;
                }
            }
            bVar.dispose();
            cVar.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
            return;
        }
        gVar.offer(u);
        if (!bmw()) {
            return;
        }
        io.reactivex.internal.util.h.a(gVar, cVar, z, bVar, this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(U u, boolean z, b bVar) {
        c cVar = this.downstream;
        io.reactivex.internal.b.g gVar = this.queue;
        if (bmx()) {
            long j = this.requested.get();
            if (j == 0) {
                this.cancelled = true;
                bVar.dispose();
                cVar.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else if (gVar.isEmpty()) {
                if (a(cVar, u) && j != Long.MAX_VALUE) {
                    cU(1);
                }
                if (jD(-1) == 0) {
                    return;
                }
            } else {
                gVar.offer(u);
            }
        } else {
            gVar.offer(u);
            if (!bmw()) {
                return;
            }
        }
        io.reactivex.internal.util.h.a(gVar, cVar, z, bVar, this);
    }

    public final Throwable bmy() {
        return this.error;
    }

    public final int jD(int i) {
        return this.wip.addAndGet(i);
    }

    public final long bmz() {
        return this.requested.get();
    }

    public final long cU(long j) {
        return this.requested.addAndGet(-j);
    }

    public final void db(long j) {
        if (SubscriptionHelper.validate(j)) {
            io.reactivex.internal.util.b.a(this.requested, j);
        }
    }
}
