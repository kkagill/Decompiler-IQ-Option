package io.reactivex.internal.operators.maybe;

import io.reactivex.b.a;
import io.reactivex.b.f;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeCallbackObserver<T> extends AtomicReference<b> implements b, j<T> {
    private static final long serialVersionUID = -6076952298809384986L;
    final a onComplete;
    final f<? super Throwable> onError;
    final f<? super T> onSuccess;

    public MaybeCallbackObserver(f<? super T> fVar, f<? super Throwable> fVar2, a aVar) {
        this.onSuccess = fVar;
        this.onError = fVar2;
        this.onComplete = aVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((b) get());
    }

    public void d(b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }

    public void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            io.reactivex.c.a.onError(th);
        }
    }

    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.ad(th2);
            io.reactivex.c.a.onError(new CompositeException(th, th2));
        }
    }

    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            io.reactivex.c.a.onError(th);
        }
    }
}
