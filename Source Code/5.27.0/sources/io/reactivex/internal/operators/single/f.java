package io.reactivex.internal.operators.single;

import io.reactivex.disposables.b;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;

/* compiled from: SingleDoOnSuccess */
public final class f<T> extends p<T> {
    final io.reactivex.b.f<? super T> onSuccess;
    final t<T> source;

    /* compiled from: SingleDoOnSuccess */
    final class a implements r<T> {
        final r<? super T> downstream;

        a(r<? super T> rVar) {
            this.downstream = rVar;
        }

        public void d(b bVar) {
            this.downstream.d(bVar);
        }

        public void onSuccess(T t) {
            try {
                f.this.onSuccess.accept(t);
                this.downstream.onSuccess(t);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                this.downstream.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }
    }

    public f(t<T> tVar, io.reactivex.b.f<? super T> fVar) {
        this.source = tVar;
        this.onSuccess = fVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        this.source.a(new a(rVar));
    }
}
