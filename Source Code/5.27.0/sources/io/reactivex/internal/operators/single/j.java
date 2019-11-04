package io.reactivex.internal.operators.single;

import io.reactivex.b.g;
import io.reactivex.disposables.b;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;

/* compiled from: SingleMap */
public final class j<T, R> extends p<R> {
    final g<? super T, ? extends R> mapper;
    final t<? extends T> source;

    /* compiled from: SingleMap */
    static final class a<T, R> implements r<T> {
        final r<? super R> eSu;
        final g<? super T, ? extends R> mapper;

        a(r<? super R> rVar, g<? super T, ? extends R> gVar) {
            this.eSu = rVar;
            this.mapper = gVar;
        }

        public void d(b bVar) {
            this.eSu.d(bVar);
        }

        public void onSuccess(T t) {
            try {
                this.eSu.onSuccess(io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                onError(th);
            }
        }

        public void onError(Throwable th) {
            this.eSu.onError(th);
        }
    }

    public j(t<? extends T> tVar, g<? super T, ? extends R> gVar) {
        this.source = tVar;
        this.mapper = gVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super R> rVar) {
        this.source.a(new a(rVar, this.mapper));
    }
}
