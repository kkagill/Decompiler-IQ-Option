package io.reactivex.internal.operators.flowable;

import io.reactivex.b.b;
import io.reactivex.e;
import io.reactivex.exceptions.a;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.Callable;
import org.a.c;
import org.a.d;

public final class FlowableCollect<T, U> extends a<T, U> {
    final b<? super U, ? super T> collector;
    final Callable<? extends U> eRn;

    static final class CollectSubscriber<T, U> extends DeferredScalarSubscription<U> implements h<T> {
        private static final long serialVersionUID = -3589550218733891694L;
        final b<? super U, ? super T> collector;
        boolean done;
        final U u;
        d upstream;

        CollectSubscriber(c<? super U> cVar, U u, b<? super U, ? super T> bVar) {
            super(cVar);
            this.collector = bVar;
            this.u = u;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                try {
                    this.collector.accept(this.u, t);
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
            this.done = true;
            this.downstream.onError(th);
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                complete(this.u);
            }
        }

        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }
    }

    public FlowableCollect(e<T> eVar, Callable<? extends U> callable, b<? super U, ? super T> bVar) {
        super(eVar);
        this.eRn = callable;
        this.collector = bVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super U> cVar) {
        try {
            this.eRc.a(new CollectSubscriber(cVar, io.reactivex.internal.a.b.requireNonNull(this.eRn.call(), "The initial value supplied is null"), this.collector));
        } catch (Throwable th) {
            EmptySubscription.error(th, cVar);
        }
    }
}
