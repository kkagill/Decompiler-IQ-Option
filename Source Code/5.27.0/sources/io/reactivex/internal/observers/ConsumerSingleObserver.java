package io.reactivex.internal.observers;

import io.reactivex.b.f;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.r;
import java.util.concurrent.atomic.AtomicReference;

public final class ConsumerSingleObserver<T> extends AtomicReference<b> implements b, r<T> {
    private static final long serialVersionUID = -7012088219455310787L;
    final f<? super Throwable> onError;
    final f<? super T> onSuccess;

    public ConsumerSingleObserver(f<? super T> fVar, f<? super Throwable> fVar2) {
        this.onSuccess = fVar;
        this.onError = fVar2;
    }

    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            a.ad(th2);
            io.reactivex.c.a.onError(new CompositeException(th, th2));
        }
    }

    public void d(b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }

    public void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            a.ad(th);
            io.reactivex.c.a.onError(th);
        }
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }
}
