package io.reactivex.internal.operators.completable;

import io.reactivex.b;
import io.reactivex.r;
import io.reactivex.t;

/* compiled from: CompletableFromSingle */
public final class e<T> extends io.reactivex.a {
    final t<T> eQP;

    /* compiled from: CompletableFromSingle */
    static final class a<T> implements r<T> {
        final b eQQ;

        a(b bVar) {
            this.eQQ = bVar;
        }

        public void onError(Throwable th) {
            this.eQQ.onError(th);
        }

        public void d(io.reactivex.disposables.b bVar) {
            this.eQQ.d(bVar);
        }

        public void onSuccess(T t) {
            this.eQQ.onComplete();
        }
    }

    public e(t<T> tVar) {
        this.eQP = tVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(b bVar) {
        this.eQP.a(new a(bVar));
    }
}
