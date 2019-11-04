package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.exceptions.a;
import io.reactivex.internal.a.b;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Callable;
import org.a.c;

/* compiled from: FlowableFromCallable */
public final class m<T> extends e<T> implements Callable<T> {
    final Callable<? extends T> callable;

    public m(Callable<? extends T> callable) {
        this.callable = callable;
    }

    public void a(c<? super T> cVar) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(cVar);
        cVar.onSubscribe(deferredScalarSubscription);
        c cVar2;
        try {
            cVar2 = b.requireNonNull(this.callable.call(), "The callable returned a null value");
            deferredScalarSubscription.complete(cVar2);
        } catch (Throwable th) {
            a.ad(th);
            if (deferredScalarSubscription.isCancelled()) {
                io.reactivex.c.a.onError(th);
            } else {
                cVar2.onError(th);
            }
        }
    }

    public T call() {
        return b.requireNonNull(this.callable.call(), "The callable returned a null value");
    }
}
