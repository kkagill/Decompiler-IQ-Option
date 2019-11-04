package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableSubscribeOn<T> extends a<T, T> {
    final boolean nonScheduledRequests;
    final o scheduler;

    static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements h<T>, Runnable, d {
        private static final long serialVersionUID = 8094547886072529208L;
        final c<? super T> downstream;
        final boolean nonScheduledRequests;
        final AtomicLong requested = new AtomicLong();
        b<T> source;
        final AtomicReference<d> upstream = new AtomicReference();
        final o.c worker;

        static final class a implements Runnable {
            final long eRW;
            final d upstream;

            a(d dVar, long j) {
                this.upstream = dVar;
                this.eRW = j;
            }

            public void run() {
                this.upstream.request(this.eRW);
            }
        }

        SubscribeOnSubscriber(c<? super T> cVar, o.c cVar2, b<T> bVar, boolean z) {
            this.downstream = cVar;
            this.worker = cVar2;
            this.source = bVar;
            this.nonScheduledRequests = z ^ 1;
        }

        public void run() {
            lazySet(Thread.currentThread());
            b bVar = this.source;
            this.source = null;
            bVar.subscribe(this);
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                long andSet = this.requested.getAndSet(0);
                if (andSet != 0) {
                    a(andSet, dVar);
                }
            }
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                d dVar = (d) this.upstream.get();
                if (dVar != null) {
                    a(j, dVar);
                    return;
                }
                io.reactivex.internal.util.b.a(this.requested, j);
                d dVar2 = (d) this.upstream.get();
                if (dVar2 != null) {
                    long andSet = this.requested.getAndSet(0);
                    if (andSet != 0) {
                        a(andSet, dVar2);
                    }
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void a(long j, d dVar) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                dVar.request(j);
            } else {
                this.worker.n(new a(dVar, j));
            }
        }

        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }
    }

    public FlowableSubscribeOn(e<T> eVar, o oVar, boolean z) {
        super(eVar);
        this.scheduler = oVar;
        this.nonScheduledRequests = z;
    }

    public void a(c<? super T> cVar) {
        o.c blk = this.scheduler.blk();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(cVar, blk, this.eRc, this.nonScheduledRequests);
        cVar.onSubscribe(subscribeOnSubscriber);
        blk.n(subscribeOnSubscriber);
    }
}
