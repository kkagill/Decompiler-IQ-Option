package io.reactivex.internal.operators.single;

import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.a;
import io.reactivex.p;
import io.reactivex.r;
import java.util.concurrent.Callable;

/* compiled from: SingleFromCallable */
public final class h<T> extends p<T> {
    final Callable<? extends T> callable;

    public h(Callable<? extends T> callable) {
        this.callable = callable;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        b bln = c.bln();
        rVar.d(bln);
        if (!bln.isDisposed()) {
            try {
                Object requireNonNull = io.reactivex.internal.a.b.requireNonNull(this.callable.call(), "The callable returned a null value");
                if (!bln.isDisposed()) {
                    rVar.onSuccess(requireNonNull);
                }
            } catch (Throwable th) {
                a.ad(th);
                if (bln.isDisposed()) {
                    io.reactivex.c.a.onError(th);
                } else {
                    rVar.onError(th);
                }
            }
        }
    }
}
