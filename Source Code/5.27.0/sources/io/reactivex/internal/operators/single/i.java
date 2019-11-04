package io.reactivex.internal.operators.single;

import io.reactivex.disposables.c;
import io.reactivex.p;
import io.reactivex.r;

/* compiled from: SingleJust */
public final class i<T> extends p<T> {
    final T value;

    public i(T t) {
        this.value = t;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        rVar.d(c.blo());
        rVar.onSuccess(this.value);
    }
}
