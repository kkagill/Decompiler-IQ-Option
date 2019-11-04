package io.reactivex.internal.operators.completable;

import io.reactivex.b;
import io.reactivex.c;
import io.reactivex.p;
import io.reactivex.r;
import java.util.concurrent.Callable;

/* compiled from: CompletableToSingle */
public final class j<T> extends p<T> {
    final Callable<? extends T> eQY;
    final T eQZ;
    final c source;

    /* compiled from: CompletableToSingle */
    final class a implements b {
        private final r<? super T> eRa;

        a(r<? super T> rVar) {
            this.eRa = rVar;
        }

        public void onComplete() {
            Object call;
            if (j.this.eQY != null) {
                try {
                    call = j.this.eQY.call();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.ad(th);
                    this.eRa.onError(th);
                    return;
                }
            }
            call = j.this.eQZ;
            if (call == null) {
                this.eRa.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.eRa.onSuccess(call);
            }
        }

        public void onError(Throwable th) {
            this.eRa.onError(th);
        }

        public void d(io.reactivex.disposables.b bVar) {
            this.eRa.d(bVar);
        }
    }

    public j(c cVar, Callable<? extends T> callable, T t) {
        this.source = cVar;
        this.eQZ = t;
        this.eQY = callable;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        this.source.a(new a(rVar));
    }
}
