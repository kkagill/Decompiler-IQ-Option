package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.internal.a.b;

/* compiled from: AbstractFlowableWithUpstream */
abstract class a<T, R> extends e<R> {
    protected final e<T> eRc;

    a(e<T> eVar) {
        this.eRc = (e) b.requireNonNull(eVar, "source is null");
    }
}
