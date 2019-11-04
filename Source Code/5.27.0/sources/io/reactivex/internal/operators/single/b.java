package io.reactivex.internal.operators.single;

import io.reactivex.b.f;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;

/* compiled from: SingleDoAfterSuccess */
public final class b<T> extends p<T> {
    final f<? super T> eSp;
    final t<T> source;

    /* compiled from: SingleDoAfterSuccess */
    static final class a<T> implements io.reactivex.disposables.b, r<T> {
        final r<? super T> downstream;
        final f<? super T> eSp;
        io.reactivex.disposables.b upstream;

        a(r<? super T> rVar, f<? super T> fVar) {
            this.downstream = rVar;
            this.eSp = fVar;
        }

        public void d(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.d(this);
            }
        }

        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
            try {
                this.eSp.accept(t);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                io.reactivex.c.a.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void dispose() {
            this.upstream.dispose();
        }

        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }
    }

    public b(t<T> tVar, f<? super T> fVar) {
        this.source = tVar;
        this.eSp = fVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        this.source.a(new a(rVar, this.eSp));
    }
}
