package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.internal.b.f;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import org.a.c;

/* compiled from: FlowableJust */
public final class q<T> extends e<T> implements f<T> {
    private final T value;

    public q(T t) {
        this.value = t;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        cVar.onSubscribe(new ScalarSubscription(cVar, this.value));
    }

    public T call() {
        return this.value;
    }
}
