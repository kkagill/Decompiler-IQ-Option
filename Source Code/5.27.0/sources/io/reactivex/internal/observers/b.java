package io.reactivex.internal.observers;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.r;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ResumeSingleObserver */
public final class b<T> implements r<T> {
    final r<? super T> downstream;
    final AtomicReference<io.reactivex.disposables.b> parent;

    public b(AtomicReference<io.reactivex.disposables.b> atomicReference, r<? super T> rVar) {
        this.parent = atomicReference;
        this.downstream = rVar;
    }

    public void d(io.reactivex.disposables.b bVar) {
        DisposableHelper.replace(this.parent, bVar);
    }

    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }
}
