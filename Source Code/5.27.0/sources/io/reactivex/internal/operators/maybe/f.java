package io.reactivex.internal.operators.maybe;

import io.reactivex.b.g;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.j;
import io.reactivex.k;

/* compiled from: MaybeMap */
public final class f<T, R> extends a<T, R> {
    final g<? super T, ? extends R> mapper;

    /* compiled from: MaybeMap */
    static final class a<T, R> implements b, j<T> {
        final j<? super R> downstream;
        final g<? super T, ? extends R> mapper;
        b upstream;

        a(j<? super R> jVar, g<? super T, ? extends R> gVar) {
            this.downstream = jVar;
            this.mapper = gVar;
        }

        public void dispose() {
            b bVar = this.upstream;
            this.upstream = DisposableHelper.DISPOSED;
            bVar.dispose();
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
            try {
                this.downstream.onSuccess(io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(t), "The mapper returned a null item"));
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                this.downstream.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.downstream.onComplete();
        }
    }

    public f(k<T> kVar, g<? super T, ? extends R> gVar) {
        super(kVar);
        this.mapper = gVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(j<? super R> jVar) {
        this.eSe.a(new a(jVar, this.mapper));
    }
}
