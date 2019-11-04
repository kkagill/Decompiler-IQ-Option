package io.reactivex.internal.operators.single;

import io.reactivex.exceptions.a;
import io.reactivex.internal.a.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.p;
import io.reactivex.r;
import java.util.concurrent.Callable;

/* compiled from: SingleError */
public final class g<T> extends p<T> {
    final Callable<? extends Throwable> eRE;

    public g(Callable<? extends Throwable> callable) {
        this.eRE = callable;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        Throwable th;
        try {
            th = (Throwable) b.requireNonNull(this.eRE.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            a.ad(th);
        }
        EmptyDisposable.error(th, (r) rVar);
    }
}
