package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.j;
import io.reactivex.k;

/* compiled from: MaybeIgnoreElementCompletable */
public final class d<T> extends io.reactivex.a {
    final k<T> eSe;

    /* compiled from: MaybeIgnoreElementCompletable */
    static final class a<T> implements b, j<T> {
        final io.reactivex.b downstream;
        b upstream;

        a(io.reactivex.b bVar) {
            this.downstream = bVar;
        }

        public void d(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.d(this);
            }
        }

        public void onSuccess(T t) {
            this.upstream = DisposableHelper.DISPOSED;
            this.downstream.onComplete();
        }

        public void onError(Throwable th) {
            this.upstream = DisposableHelper.DISPOSED;
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.upstream = DisposableHelper.DISPOSED;
            this.downstream.onComplete();
        }

        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public void dispose() {
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
        }
    }

    public d(k<T> kVar) {
        this.eSe = kVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(io.reactivex.b bVar) {
        this.eSe.a(new a(bVar));
    }
}
