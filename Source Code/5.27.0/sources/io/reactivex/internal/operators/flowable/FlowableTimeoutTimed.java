package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.o;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

public final class FlowableTimeoutTimed<T> extends a<T, T> {
    final org.a.b<? extends T> eRZ;
    final o scheduler;
    final long timeout;
    final TimeUnit unit;

    interface b {
        void cW(long j);
    }

    static final class c implements Runnable {
        final b eSb;
        final long idx;

        c(long j, b bVar) {
            this.idx = j;
            this.eSb = bVar;
        }

        public void run() {
            this.eSb.cW(this.idx);
        }
    }

    static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements h<T>, b {
        private static final long serialVersionUID = 3764492702657003550L;
        long consumed;
        final org.a.c<? super T> downstream;
        org.a.b<? extends T> fallback;
        final AtomicLong index = new AtomicLong();
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<d> upstream = new AtomicReference();
        final io.reactivex.o.c worker;

        TimeoutFallbackSubscriber(org.a.c<? super T> cVar, long j, TimeUnit timeUnit, io.reactivex.o.c cVar2, org.a.b<? extends T> bVar) {
            super(true);
            this.downstream = cVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar2;
            this.fallback = bVar;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                a(dVar);
            }
        }

        public void onNext(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.index.compareAndSet(j, j2)) {
                    ((io.reactivex.disposables.b) this.task.get()).dispose();
                    this.consumed++;
                    this.downstream.onNext(t);
                    cV(j2);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void cV(long j) {
            this.task.j(this.worker.c(new c(j, this), this.timeout, this.unit));
        }

        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            io.reactivex.c.a.onError(th);
        }

        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        public void cW(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                j = this.consumed;
                if (j != 0) {
                    dc(j);
                }
                org.a.b bVar = this.fallback;
                this.fallback = null;
                bVar.subscribe(new a(this.downstream, this));
                this.worker.dispose();
            }
        }

        public void cancel() {
            super.cancel();
            this.worker.dispose();
        }
    }

    static final class TimeoutSubscriber<T> extends AtomicLong implements h<T>, b, d {
        private static final long serialVersionUID = 3764492702657003550L;
        final org.a.c<? super T> downstream;
        final AtomicLong requested = new AtomicLong();
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<d> upstream = new AtomicReference();
        final io.reactivex.o.c worker;

        TimeoutSubscriber(org.a.c<? super T> cVar, long j, TimeUnit timeUnit, io.reactivex.o.c cVar2) {
            this.downstream = cVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar2;
        }

        public void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
        }

        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((io.reactivex.disposables.b) this.task.get()).dispose();
                    this.downstream.onNext(t);
                    cV(j2);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void cV(long j) {
            this.task.j(this.worker.c(new c(j, this), this.timeout, this.unit));
        }

        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            io.reactivex.c.a.onError(th);
        }

        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        public void cW(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(new TimeoutException(ExceptionHelper.o(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        public void request(long j) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }
    }

    static final class a<T> implements h<T> {
        final org.a.c<? super T> downstream;
        final SubscriptionArbiter eSa;

        a(org.a.c<? super T> cVar, SubscriptionArbiter subscriptionArbiter) {
            this.downstream = cVar;
            this.eSa = subscriptionArbiter;
        }

        public void onSubscribe(d dVar) {
            this.eSa.a(dVar);
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.downstream.onComplete();
        }
    }

    public FlowableTimeoutTimed(e<T> eVar, long j, TimeUnit timeUnit, o oVar, org.a.b<? extends T> bVar) {
        super(eVar);
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = oVar;
        this.eRZ = bVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(org.a.c<? super T> cVar) {
        h timeoutSubscriber;
        if (this.eRZ == null) {
            timeoutSubscriber = new TimeoutSubscriber(cVar, this.timeout, this.unit, this.scheduler.blk());
            cVar.onSubscribe(timeoutSubscriber);
            timeoutSubscriber.cV(0);
            this.eRc.a(timeoutSubscriber);
            return;
        }
        timeoutSubscriber = new TimeoutFallbackSubscriber(cVar, this.timeout, this.unit, this.scheduler.blk(), this.eRZ);
        cVar.onSubscribe(timeoutSubscriber);
        timeoutSubscriber.cV(0);
        this.eRc.a(timeoutSubscriber);
    }
}
