package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.o;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class FlowableTimer extends e<Long> {
    final long delay;
    final o scheduler;
    final TimeUnit unit;

    static final class TimerSubscriber extends AtomicReference<b> implements Runnable, d {
        private static final long serialVersionUID = -2809475196591179431L;
        final c<? super Long> downstream;
        volatile boolean requested;

        TimerSubscriber(c<? super Long> cVar) {
            this.downstream = cVar;
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                this.requested = true;
            }
        }

        public void cancel() {
            DisposableHelper.dispose(this);
        }

        public void run() {
            if (get() == DisposableHelper.DISPOSED) {
                return;
            }
            if (this.requested) {
                this.downstream.onNext(Long.valueOf(0));
                lazySet(EmptyDisposable.INSTANCE);
                this.downstream.onComplete();
                return;
            }
            lazySet(EmptyDisposable.INSTANCE);
            this.downstream.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
        }

        public void k(b bVar) {
            DisposableHelper.trySet(this, bVar);
        }
    }

    public FlowableTimer(long j, TimeUnit timeUnit, o oVar) {
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = oVar;
    }

    public void a(c<? super Long> cVar) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(cVar);
        cVar.onSubscribe(timerSubscriber);
        timerSubscriber.k(this.scheduler.b(timerSubscriber, this.delay, this.unit));
    }
}
