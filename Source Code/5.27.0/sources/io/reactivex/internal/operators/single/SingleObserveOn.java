package io.reactivex.internal.operators.single;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.o;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleObserveOn<T> extends p<T> {
    final o scheduler;
    final t<T> source;

    static final class ObserveOnSingleObserver<T> extends AtomicReference<b> implements b, r<T>, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        final r<? super T> downstream;
        Throwable error;
        final o scheduler;
        T value;

        ObserveOnSingleObserver(r<? super T> rVar, o oVar) {
            this.downstream = rVar;
            this.scheduler = oVar;
        }

        public void d(b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.downstream.d(this);
            }
        }

        public void onSuccess(T t) {
            this.value = t;
            DisposableHelper.replace(this, this.scheduler.m(this));
        }

        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.m(this));
        }

        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onSuccess(this.value);
            }
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((b) get());
        }
    }

    public SingleObserveOn(t<T> tVar, o oVar) {
        this.source = tVar;
        this.scheduler = oVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        this.source.a(new ObserveOnSingleObserver(rVar, this.scheduler));
    }
}
