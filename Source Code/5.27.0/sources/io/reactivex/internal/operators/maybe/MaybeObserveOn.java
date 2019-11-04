package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.j;
import io.reactivex.k;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeObserveOn<T> extends a<T, T> {
    final o scheduler;

    static final class ObserveOnMaybeObserver<T> extends AtomicReference<b> implements b, j<T>, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final j<? super T> downstream;
        Throwable error;
        final o scheduler;
        T value;

        ObserveOnMaybeObserver(j<? super T> jVar, o oVar) {
            this.downstream = jVar;
            this.scheduler = oVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((b) get());
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

        public void onComplete() {
            DisposableHelper.replace(this, this.scheduler.m(this));
        }

        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.error = null;
                this.downstream.onError(th);
                return;
            }
            Object obj = this.value;
            if (obj != null) {
                this.value = null;
                this.downstream.onSuccess(obj);
                return;
            }
            this.downstream.onComplete();
        }
    }

    public MaybeObserveOn(k<T> kVar, o oVar) {
        super(kVar);
        this.scheduler = oVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(j<? super T> jVar) {
        this.eSe.a(new ObserveOnMaybeObserver(jVar, this.scheduler));
    }
}
