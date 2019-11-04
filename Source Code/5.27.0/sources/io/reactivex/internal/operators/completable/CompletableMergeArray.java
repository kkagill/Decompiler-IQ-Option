package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.b;
import io.reactivex.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class CompletableMergeArray extends a {
    final c[] eQR;

    static final class InnerCompletableObserver extends AtomicInteger implements b {
        private static final long serialVersionUID = -8360547806504310570L;
        final b downstream;
        final AtomicBoolean once;
        final io.reactivex.disposables.a set;

        InnerCompletableObserver(b bVar, AtomicBoolean atomicBoolean, io.reactivex.disposables.a aVar, int i) {
            this.downstream = bVar;
            this.once = atomicBoolean;
            this.set = aVar;
            lazySet(i);
        }

        public void d(io.reactivex.disposables.b bVar) {
            this.set.e(bVar);
        }

        public void onError(Throwable th) {
            this.set.dispose();
            if (this.once.compareAndSet(false, true)) {
                this.downstream.onError(th);
            } else {
                io.reactivex.c.a.onError(th);
            }
        }

        public void onComplete() {
            if (decrementAndGet() == 0 && this.once.compareAndSet(false, true)) {
                this.downstream.onComplete();
            }
        }
    }

    public CompletableMergeArray(c[] cVarArr) {
        this.eQR = cVarArr;
    }

    public void b(b bVar) {
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        InnerCompletableObserver innerCompletableObserver = new InnerCompletableObserver(bVar, new AtomicBoolean(), aVar, this.eQR.length + 1);
        bVar.d(aVar);
        c[] cVarArr = this.eQR;
        int length = cVarArr.length;
        int i = 0;
        while (i < length) {
            c cVar = cVarArr[i];
            if (!aVar.isDisposed()) {
                if (cVar == null) {
                    aVar.dispose();
                    innerCompletableObserver.onError(new NullPointerException("A completable source is null"));
                    return;
                }
                cVar.a(innerCompletableObserver);
                i++;
            } else {
                return;
            }
        }
        innerCompletableObserver.onComplete();
    }
}
