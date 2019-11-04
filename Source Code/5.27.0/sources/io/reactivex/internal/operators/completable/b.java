package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.disposables.c;

/* compiled from: CompletableFromAction */
public final class b extends a {
    final io.reactivex.b.a eQN;

    public b(io.reactivex.b.a aVar) {
        this.eQN = aVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(io.reactivex.b bVar) {
        io.reactivex.disposables.b bln = c.bln();
        bVar.d(bln);
        try {
            this.eQN.run();
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
