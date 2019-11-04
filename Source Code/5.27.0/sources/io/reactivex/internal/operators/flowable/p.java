package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import org.a.b;
import org.a.c;

/* compiled from: FlowableFromPublisher */
public final class p<T> extends e<T> {
    final b<? extends T> eRK;

    public p(b<? extends T> bVar) {
        this.eRK = bVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        this.eRK.subscribe(cVar);
    }
}
