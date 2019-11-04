package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.a;
import io.reactivex.i;
import io.reactivex.j;
import java.util.concurrent.Callable;

/* compiled from: MaybeFromCallable */
public final class c<T> extends i<T> implements Callable<T> {
    final Callable<? extends T> callable;

    public c(Callable<? extends T> callable) {
        this.callable = callable;
    }

    /* Access modifiers changed, original: protected */
    public void b(j<? super T> jVar) {
        b bln = io.reactivex.disposables.c.bln();
        jVar.d(bln);
        if (!bln.isDisposed()) {
            try {
                Object call = this.callable.call();
                if (!bln.isDisposed()) {
                    if (call == null) {
                        jVar.onComplete();
                    } else {
                        jVar.onSuccess(call);
                    }
                }
            } catch (Throwable th) {
                a.ad(th);
                if (bln.isDisposed()) {
                    io.reactivex.c.a.onError(th);
                } else {
                    jVar.onError(th);
                }
            }
        }
    }

    public T call() {
        return this.callable.call();
    }
}
