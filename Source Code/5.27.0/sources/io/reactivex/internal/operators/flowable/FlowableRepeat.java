package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableRepeat<T> extends a<T, T> {
    final long count;

    static final class RepeatSubscriber<T> extends AtomicInteger implements h<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final c<? super T> downstream;
        long produced;
        long remaining;
        final SubscriptionArbiter sa;
        final b<? extends T> source;

        RepeatSubscriber(c<? super T> cVar, long j, SubscriptionArbiter subscriptionArbiter, b<? extends T> bVar) {
            this.downstream = cVar;
            this.sa = subscriptionArbiter;
            this.source = bVar;
            this.remaining = j;
        }

        public void onSubscribe(d dVar) {
            this.sa.a(dVar);
        }

        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onComplete() {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j != 0) {
                blT();
            } else {
                this.downstream.onComplete();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void blT() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.sa.isCancelled()) {
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0;
                        this.sa.dc(j);
                    }
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }
    }

    public FlowableRepeat(e<T> eVar, long j) {
        super(eVar);
        this.count = j;
    }

    public void a(c<? super T> cVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        cVar.onSubscribe(subscriptionArbiter);
        long j = this.count;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j - 1;
        }
        new RepeatSubscriber(cVar, j2, subscriptionArbiter, this.eRc).blT();
    }
}
