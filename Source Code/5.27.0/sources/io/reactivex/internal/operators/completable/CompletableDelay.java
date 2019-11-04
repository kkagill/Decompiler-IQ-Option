package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.o;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableDelay extends a {
    final long delay;
    final boolean delayError;
    final o scheduler;
    final c source;
    final TimeUnit unit;

    static final class Delay extends AtomicReference<b> implements io.reactivex.b, b, Runnable {
        private static final long serialVersionUID = 465972761105851022L;
        final long delay;
        final boolean delayError;
        final io.reactivex.b downstream;
        Throwable error;
        final o scheduler;
        final TimeUnit unit;

        Delay(io.reactivex.b bVar, long j, TimeUnit timeUnit, o oVar, boolean z) {
            this.downstream = bVar;
            this.delay = j;
            this.unit = timeUnit;
            this.scheduler = oVar;
            this.delayError = z;
        }

        public void d(b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.downstream.d(this);
            }
        }

        public void onComplete() {
            DisposableHelper.replace(this, this.scheduler.b(this, this.delay, this.unit));
        }

        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.b(this, this.delayError ? this.delay : 0, this.unit));
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((b) get());
        }

        public void run() {
            Throwable th = this.error;
            this.error = null;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    public CompletableDelay(c cVar, long j, TimeUnit timeUnit, o oVar, boolean z) {
        this.source = cVar;
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = oVar;
        this.delayError = z;
    }

    /* Access modifiers changed, original: protected */
    public void b(io.reactivex.b bVar) {
        this.source.a(new Delay(bVar, this.delay, this.unit, this.scheduler, this.delayError));
    }
}
