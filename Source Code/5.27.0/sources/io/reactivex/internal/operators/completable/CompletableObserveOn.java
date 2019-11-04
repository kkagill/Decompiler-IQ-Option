package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableObserveOn extends a {
    final o scheduler;
    final c source;

    static final class ObserveOnCompletableObserver extends AtomicReference<b> implements io.reactivex.b, b, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final io.reactivex.b downstream;
        Throwable error;
        final o scheduler;

        ObserveOnCompletableObserver(io.reactivex.b bVar, o oVar) {
            this.downstream = bVar;
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
            this.downstream.onComplete();
        }
    }

    public CompletableObserveOn(c cVar, o oVar) {
        this.source = cVar;
        this.scheduler = oVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(io.reactivex.b bVar) {
        this.source.a(new ObserveOnCompletableObserver(bVar, this.scheduler));
    }
}
