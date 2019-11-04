package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.b;
import io.reactivex.disposables.c;

/* compiled from: CompletableFromRunnable */
public final class d extends a {
    final Runnable runnable;

    public d(Runnable runnable) {
        this.runnable = runnable;
    }

    /* Access modifiers changed, original: protected */
    public void b(b bVar) {
        io.reactivex.disposables.b bln = c.bln();
        bVar.d(bln);
        try {
            this.runnable.run();
            if (!bln.isDisposed()) {
                bVar.onComplete();
            }
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            if (bln.isDisposed()) {
                io.reactivex.c.a.onError(th);
            } else {
                bVar.onError(th);
            }
        }
    }
}
