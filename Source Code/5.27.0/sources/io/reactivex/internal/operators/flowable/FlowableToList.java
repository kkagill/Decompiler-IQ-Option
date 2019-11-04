package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.exceptions.a;
import io.reactivex.h;
import io.reactivex.internal.a.b;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.a.c;
import org.a.d;

public final class FlowableToList<T, U extends Collection<? super T>> extends a<T, U> {
    final Callable<U> eSc;

    static final class ToListSubscriber<T, U extends Collection<? super T>> extends DeferredScalarSubscription<U> implements h<T>, d {
        private static final long serialVersionUID = -8134157938864266736L;
        d upstream;

        ToListSubscriber(c<? super U> cVar, U u) {
            super(cVar);
            this.value = u;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public void onNext(T t) {
            Collection collection = (Collection) this.value;
            if (collection != null) {
                collection.add(t);
            }
        }

        public void onError(Throwable th) {
            this.value = null;
            this.downstream.onError(th);
        }

        public void onComplete() {
            complete(this.value);
        }

        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }
    }

    public FlowableToList(e<T> eVar, Callable<U> callable) {
        super(eVar);
        this.eSc = callable;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super U> cVar) {
        try {
            this.eRc.a(new ToListSubscriber(cVar, (Collection) b.requireNonNull(this.eSc.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            a.ad(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
