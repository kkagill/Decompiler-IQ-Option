package io.reactivex.disposables;

import io.reactivex.internal.a.a;
import io.reactivex.internal.a.b;
import io.reactivex.internal.disposables.EmptyDisposable;

/* compiled from: Disposables */
public final class c {
    public static b o(Runnable runnable) {
        b.requireNonNull(runnable, "run is null");
        return new RunnableDisposable(runnable);
    }

    public static b bln() {
        return o(a.eQx);
    }

    public static b blo() {
        return EmptyDisposable.INSTANCE;
    }
}
