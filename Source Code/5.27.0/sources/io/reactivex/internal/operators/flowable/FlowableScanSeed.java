package io.reactivex.internal.operators.flowable;

import io.reactivex.b.c;
import io.reactivex.e;
import io.reactivex.exceptions.a;
import io.reactivex.h;
import io.reactivex.internal.a.b;
import io.reactivex.internal.b.g;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.a.d;

public final class FlowableScanSeed<T, R> extends a<T, R> {
    final c<R, ? super T, R> accumulator;
    final Callable<R> eRV;

    static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements h<T>, d {
        private static final long serialVersionUID = -1776795561228106469L;
        final c<R, ? super T, R> accumulator;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final org.a.c<? super R> downstream;
        Throwable error;
        final int limit;
        final int prefetch;
        final g<R> queue;
        final AtomicLong requested = new AtomicLong();
        d upstream;
        R value;

        ScanSeedSubscriber(org.a.c<? super R> cVar, c<R, ? super T, R> cVar2, R r, int i) {
            this.downstream = cVar;
            this.accumulator = cVar2;
            this.value = r;
            this.prefetch = i;
            this.limit = i - (i >> 2);
            this.queue = new SpscArrayQueue(i);
            this.queue.offer(r);
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request((long) (this.prefetch - 1));
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                try {
                    Object requireNonNull = b.requireNonNull(this.accumulator.apply(this.value, t), "The accumulator returned a null value");
                    this.value = requireNonNull;
                    this.queue.offer(requireNonNull);
                    drain();
                } catch (Throwable th) {
                    a.ad(th);
                    this.upstream.cancel();
                    onError(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.c.a.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.b.a(this.requested, j);
                drain();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void drain() {
            if (getAndIncrement() == 0) {
                org.a.c cVar = this.downstream;
                g gVar = this.queue;
                int i = this.limit;
                int i2 = this.consumed;
                int i3 = 1;
                do {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.cancelled) {
                            gVar.clear();
                            return;
                        }
                        boolean z = this.done;
                        if (z) {
                            Throwable th = this.error;
                            if (th != null) {
                                gVar.clear();
                                cVar.onError(th);
                                return;
                            }
                        }
                        Object poll = gVar.poll();
                        Object obj = poll == null ? 1 : null;
                        if (z && obj != null) {
                            cVar.onComplete();
                            return;
                        } else if (obj != null) {
                            break;
                        } else {
                            cVar.onNext(poll);
                            j2++;
                            i2++;
                            if (i2 == i) {
                                this.upstream.request((long) i);
                                i2 = 0;
                            }
                        }
                    }
                    if (j2 == j && this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            gVar.clear();
                            cVar.onError(th2);
                            return;
                        } else if (gVar.isEmpty()) {
                            cVar.onComplete();
                            return;
                        }
                    }
                    if (j2 != 0) {
                        io.reactivex.internal.util.b.c(this.requested, j2);
                    }
                    this.consumed = i2;
                    i3 = addAndGet(-i3);
                } while (i3 != 0);
            }
        }
    }

    public FlowableScanSeed(e<T> eVar, Callable<R> callable, c<R, ? super T, R> cVar) {
        super(eVar);
        this.accumulator = cVar;
        this.eRV = callable;
    }

    /* Access modifiers changed, original: protected */
    public void a(org.a.c<? super R> cVar) {
        try {
            this.eRc.a(new ScanSeedSubscriber(cVar, this.accumulator, b.requireNonNull(this.eRV.call(), "The seed supplied is null"), e.bkP()));
        } catch (Throwable th) {
            a.ad(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
