package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.i;
import io.reactivex.internal.b.f;
import io.reactivex.j;

/* compiled from: MaybeJust */
public final class e<T> extends i<T> implements f<T> {
    final T value;

    public e(T t) {
        this.value = t;
    }

    /* Access modifiers changed, original: protected */
    public void b(j<? super T> jVar) {
        jVar.d(c.blo());
        jVar.onSuccess(this.value);
    }

    public T call() {
        return this.value;
    }
}
