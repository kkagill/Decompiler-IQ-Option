package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.e;

/* compiled from: CompletableToFlowable */
public final class i<T> extends e<T> {
    final c source;

    public i(c cVar) {
        this.source = cVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(org.a.c<? super T> cVar) {
        this.source.a(new io.reactivex.internal.observers.c(cVar));
    }
}
