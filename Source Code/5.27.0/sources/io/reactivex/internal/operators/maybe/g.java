package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.j;
import io.reactivex.k;
import io.reactivex.p;
import io.reactivex.r;
import java.util.NoSuchElementException;

/* compiled from: MaybeToSingle */
public final class g<T> extends p<T> {
    final T defaultValue;
    final k<T> eSe;

    /* compiled from: MaybeToSingle */
    static final class a<T> implements b, j<T> {
        final T defaultValue;
        final r<? super T> downstream;
        b upstream;

        a(r<? super T> rVar, T t) {
            this.downstream = rVar;
            this.defaultValue = t;
        }

        public void dispose() {
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
        }

        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public void d(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.d(this);
            }
        }

        public void onSuccess(T t) {
            this.upstream = DisposableHelper.DISPOSED;
            this.downstream.onSuccess(t);
        }

        public void onError(Throwable th) {
            this.upstream = DisposableHelper.DISPOSED;
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.upstream = DisposableHelper.DISPOSED;
            Object obj = this.defaultValue;
            if (obj != null) {
                this.downstream.onSuccess(obj);
            } else {
                this.downstream.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }
    }

    public g(k<T> kVar, T t) {
        this.eSe = kVar;
        this.defaultValue = t;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        this.eSe.a(new a(rVar, this.defaultValue));
    }
}
