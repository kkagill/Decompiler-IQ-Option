package io.reactivex.internal.operators.single;

import io.reactivex.b.f;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;

/* compiled from: SingleDoOnError */
public final class c<T> extends p<T> {
    final f<? super Throwable> onError;
    final t<T> source;

    /* compiled from: SingleDoOnError */
    final class a implements r<T> {
        private final r<? super T> downstream;

        a(r<? super T> rVar) {
            this.downstream = rVar;
        }

        public void d(b bVar) {
            this.downstream.d(bVar);
        }

        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        public void onError(Throwable th) {
            try {
                c.this.onError.accept(th);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.ad(th2);
                th = new CompositeException(th, th2);
            }
            this.downstream.onError(th);
        }
    }

    public c(t<T> tVar, f<? super Throwable> fVar) {
        this.source = tVar;
        this.onError = fVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        this.source.a(new a(rVar));
    }
}
