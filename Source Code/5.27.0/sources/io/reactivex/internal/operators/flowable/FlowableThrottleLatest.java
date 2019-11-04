package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;
import io.reactivex.o;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class FlowableThrottleLatest<T> extends a<T, T> {
    final boolean emitLast;
    final o scheduler;
    final long timeout;
    final TimeUnit unit;

    static final class ThrottleLatestSubscriber<T> extends AtomicInteger implements h<T>, Runnable, d {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final c<? super T> downstream;
        final boolean emitLast;
        long emitted;
        Throwable error;
        final AtomicReference<T> latest = new AtomicReference();
        final AtomicLong requested = new AtomicLong();
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final TimeUnit unit;
        d upstream;
        final o.c worker;

        ThrottleLatestSubscriber(c<? super T> cVar, long j, TimeUnit timeUnit, o.c cVar2, boolean z) {
            this.downstream = cVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar2;
            this.emitLast = z;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public void onNext(T t) {
            this.latest.set(t);
            drain();
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                b.a(this.requested, j);
            }
        }

        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.latest.lazySet(null);
            }
        }

        public void run() {
            this.timerFired = true;
            drain();
        }

        /* Access modifiers changed, original: 0000 */
        public void drain() {
            if (getAndIncrement() == 0) {
                AtomicReference atomicReference = this.latest;
                AtomicLong atomicLong = this.requested;
                c cVar = this.downstream;
                int i = 1;
                while (!this.cancelled) {
                    boolean z = this.done;
                    if (!z || this.error == null) {
                        Object obj = atomicReference.get() == null ? 1 : null;
                        if (z) {
                            if (obj == null && this.emitLast) {
                                Object andSet = atomicReference.getAndSet(null);
                                long j = this.emitted;
                                if (j != atomicLong.get()) {
                                    this.emitted = j + 1;
                                    cVar.onNext(andSet);
                                    cVar.onComplete();
                                } else {
                                    cVar.onError(new MissingBackpressureException("Could not emit final value due to lack of requests"));
                                }
                            } else {
                                atomicReference.lazySet(null);
                                cVar.onComplete();
                            }
                            this.worker.dispose();
                            return;
                        }
                        if (obj != null) {
                            if (this.timerFired) {
                                this.timerRunning = false;
                                this.timerFired = false;
                            }
                        } else if (!this.timerRunning || this.timerFired) {
                            Object andSet2 = atomicReference.getAndSet(null);
                            long j2 = this.emitted;
                            if (j2 != atomicLong.get()) {
                                cVar.onNext(andSet2);
                                this.emitted = j2 + 1;
                                this.timerFired = false;
                                this.timerRunning = true;
                                this.worker.c(this, this.timeout, this.unit);
                            } else {
                                this.upstream.cancel();
                                cVar.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                                this.worker.dispose();
                                return;
                            }
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        atomicReference.lazySet(null);
                        cVar.onError(this.error);
                        this.worker.dispose();
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }
    }

    public FlowableThrottleLatest(e<T> eVar, long j, TimeUnit timeUnit, o oVar, boolean z) {
        super(eVar);
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = oVar;
        this.emitLast = z;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        this.eRc.a(new ThrottleLatestSubscriber(cVar, this.timeout, this.unit, this.scheduler.blk(), this.emitLast));
    }
}
