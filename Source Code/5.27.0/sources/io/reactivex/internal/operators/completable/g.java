package io.reactivex.internal.operators.completable;

import io.reactivex.b;
import io.reactivex.b.l;
import io.reactivex.c;
import io.reactivex.exceptions.CompositeException;

/* compiled from: CompletableOnErrorComplete */
public final class g extends io.reactivex.a {
    final l<? super Throwable> eQS;
    final c source;

    /* compiled from: CompletableOnErrorComplete */
    final class a implements b {
        private final b downstream;

        a(b bVar) {
            this.downstream = bVar;
        }

        public void onComplete() {
            this.downstream.onComplete();
        }

        public void onError(Throwable th) {
            try {
                if (g.this.eQS.test(th)) {
                    this.downstream.onComplete();
                } else {
                    this.downstream.onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.ad(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        public void d(io.reactivex.disposables.b bVar) {
            this.downstream.d(bVar);
        }
    }

    public g(c cVar, l<? super Throwable> lVar) {
        this.source = cVar;
        this.eQS = lVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(b bVar) {
        this.source.a(new a(bVar));
    }
}
