package io.reactivex.internal.operators.single;

import io.reactivex.internal.a.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;
import java.util.concurrent.Callable;

/* compiled from: SingleDefer */
public final class a<T> extends p<T> {
    final Callable<? extends t<? extends T>> eSn;

    public a(Callable<? extends t<? extends T>> callable) {
        this.eSn = callable;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        try {
            ((t) b.requireNonNull(this.eSn.call(), "The singleSupplier returned a null SingleSource")).a(rVar);
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            EmptyDisposable.error(th, (r) rVar);
        }
    }
}
