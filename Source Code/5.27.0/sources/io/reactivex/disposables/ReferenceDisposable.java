package io.reactivex.disposables;

import io.reactivex.internal.a.b;
import java.util.concurrent.atomic.AtomicReference;

abstract class ReferenceDisposable<T> extends AtomicReference<T> implements b {
    private static final long serialVersionUID = 6537757548749041217L;

    public abstract void cK(T t);

    ReferenceDisposable(T t) {
        super(b.requireNonNull(t, "value is null"));
    }

    public final void dispose() {
        if (get() != null) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                cK(andSet);
            }
        }
    }

    public final boolean isDisposed() {
        return get() == null;
    }
}
