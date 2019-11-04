package io.reactivex.internal.operators.single;

import io.reactivex.c.a;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.o;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleTimeout<T> extends p<T> {
    final t<? extends T> other;
    final o scheduler;
    final t<T> source;
    final long timeout;
    final TimeUnit unit;

    static final class TimeoutMainObserver<T> extends AtomicReference<b> implements b, r<T>, Runnable {
        private static final long serialVersionUID = 37497744973048446L;
        final r<? super T> downstream;
        final TimeoutFallbackObserver<T> fallback;
        t<? extends T> other;
        final AtomicReference<b> task = new AtomicReference();
        final long timeout;
        final TimeUnit unit;

        static final class TimeoutFallbackObserver<T> extends AtomicReference<b> implements r<T> {
            private static final long serialVersionUID = 2071387740092105509L;
            final r<? super T> downstream;

            TimeoutFallbackObserver(r<? super T> rVar) {
                this.downstream = rVar;
            }

            public void d(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            public void onSuccess(T t) {
                this.downstream.onSuccess(t);
            }

            public void onError(Throwable th) {
                this.downstream.onError(th);
            }
        }

        TimeoutMainObserver(r<? super T> rVar, t<? extends T> tVar, long j, TimeUnit timeUnit) {
            this.downstream = rVar;
            this.other = tVar;
            this.timeout = j;
            this.unit = timeUnit;
            if (tVar != null) {
                this.fallback = new TimeoutFallbackObserver(rVar);
            } else {
                this.fallback = null;
            }
        }

        public void run() {
            b bVar = (b) get();
            if (bVar != DisposableHelper.DISPOSED && compareAndSet(bVar, DisposableHelper.DISPOSED)) {
                if (bVar != null) {
                    bVar.dispose();
                }
                t tVar = this.other;
                if (tVar == null) {
                    this.downstream.onError(new TimeoutException(ExceptionHelper.o(this.timeout, this.unit)));
                    return;
                }
                this.other = null;
                tVar.a(this.fallback);
            }
        }

        public void d(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        public void onSuccess(T t) {
            b bVar = (b) get();
            if (bVar != DisposableHelper.DISPOSED && compareAndSet(bVar, DisposableHelper.DISPOSED)) {
                DisposableHelper.dispose(this.task);
                this.downstream.onSuccess(t);
            }
        }

        public void onError(Throwable th) {
            b bVar = (b) get();
            if (bVar == DisposableHelper.DISPOSED || !compareAndSet(bVar, DisposableHelper.DISPOSED)) {
                a.onError(th);
                return;
            }
            DisposableHelper.dispose(this.task);
            this.downstream.onError(th);
        }

        public void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.task);
            TimeoutFallbackObserver timeoutFallbackObserver = this.fallback;
            if (timeoutFallbackObserver != null) {
                DisposableHelper.dispose(timeoutFallbackObserver);
            }
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((b) get());
        }
    }

    public SingleTimeout(t<T> tVar, long j, TimeUnit timeUnit, o oVar, t<? extends T> tVar2) {
        this.source = tVar;
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = oVar;
        this.other = tVar2;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        TimeoutMainObserver timeoutMainObserver = new TimeoutMainObserver(rVar, this.other, this.timeout, this.unit);
        rVar.d(timeoutMainObserver);
        DisposableHelper.replace(timeoutMainObserver.task, this.scheduler.b(timeoutMainObserver, this.timeout, this.unit));
        this.source.a(timeoutMainObserver);
    }
}
