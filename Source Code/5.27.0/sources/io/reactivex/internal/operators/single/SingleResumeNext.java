package io.reactivex.internal.operators.single;

import io.reactivex.b.g;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleResumeNext<T> extends p<T> {
    final g<? super Throwable, ? extends t<? extends T>> nextFunction;
    final t<? extends T> source;

    static final class ResumeMainSingleObserver<T> extends AtomicReference<b> implements b, r<T> {
        private static final long serialVersionUID = -5314538511045349925L;
        final r<? super T> downstream;
        final g<? super Throwable, ? extends t<? extends T>> nextFunction;

        ResumeMainSingleObserver(r<? super T> rVar, g<? super Throwable, ? extends t<? extends T>> gVar) {
            this.downstream = rVar;
            this.nextFunction = gVar;
        }

        public void d(b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.downstream.d(this);
            }
        }

        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        public void onError(Throwable th) {
            try {
                ((t) io.reactivex.internal.a.b.requireNonNull(this.nextFunction.apply(th), "The nextFunction returned a null SingleSource.")).a(new io.reactivex.internal.observers.b(this, this.downstream));
            } catch (Throwable th2) {
                a.ad(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((b) get());
        }
    }

    public SingleResumeNext(t<? extends T> tVar, g<? super Throwable, ? extends t<? extends T>> gVar) {
        this.source = tVar;
        this.nextFunction = gVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        this.source.a(new ResumeMainSingleObserver(rVar, this.nextFunction));
    }
}
