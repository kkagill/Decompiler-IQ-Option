package io.reactivex.internal.operators.single;

import io.reactivex.b.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;

/* compiled from: SingleDoOnEvent */
public final class d<T> extends p<T> {
    final b<? super T, ? super Throwable> eSr;
    final t<T> source;

    /* compiled from: SingleDoOnEvent */
    final class a implements r<T> {
        private final r<? super T> downstream;

        a(r<? super T> rVar) {
            this.downstream = rVar;
        }

        public void d(io.reactivex.disposables.b bVar) {
            this.downstream.d(bVar);
        }

        public void onSuccess(T t) {
            try {
                d.this.eSr.accept(t, null);
                this.downstream.onSuccess(t);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                this.downstream.onError(th);
            }
        }

        public void onError(Throwable th) {
            try {
                d.this.eSr.accept(null, th);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.ad(th2);
                th = new CompositeException(th, th2);
            }
            this.downstream.onError(th);
        }
    }

    public d(t<T> tVar, b<? super T, ? super Throwable> bVar) {
        this.source = tVar;
        this.eSr = bVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        this.source.a(new a(rVar));
    }
}
