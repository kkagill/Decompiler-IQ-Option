package io.reactivex.internal.operators.single;

import io.reactivex.b.g;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;

/* compiled from: SingleOnErrorReturn */
public final class k<T> extends p<T> {
    final t<? extends T> source;
    final T value;
    final g<? super Throwable, ? extends T> valueSupplier;

    /* compiled from: SingleOnErrorReturn */
    final class a implements r<T> {
        private final r<? super T> eRa;

        a(r<? super T> rVar) {
            this.eRa = rVar;
        }

        public void onError(Throwable th) {
            Object apply;
            if (k.this.valueSupplier != null) {
                try {
                    apply = k.this.valueSupplier.apply(th);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.ad(th2);
                    this.eRa.onError(new CompositeException(th, th2));
                    return;
                }
            }
            apply = k.this.value;
            if (apply == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.eRa.onError(nullPointerException);
                return;
            }
            this.eRa.onSuccess(apply);
        }

        public void d(b bVar) {
            this.eRa.d(bVar);
        }

        public void onSuccess(T t) {
            this.eRa.onSuccess(t);
        }
    }

    public k(t<? extends T> tVar, g<? super Throwable, ? extends T> gVar, T t) {
        this.source = tVar;
        this.valueSupplier = gVar;
        this.value = t;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        this.source.a(new a(rVar));
    }
}
