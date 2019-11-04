package io.reactivex.internal.operators.maybe;

import io.reactivex.i;
import io.reactivex.internal.b.f;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.j;

/* compiled from: MaybeEmpty */
public final class b extends i<Object> implements f<Object> {
    public static final b eSf = new b();

    public Object call() {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public void b(j<? super Object> jVar) {
        EmptyDisposable.complete((j) jVar);
    }
}
