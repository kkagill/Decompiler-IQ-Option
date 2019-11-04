package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.j;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.o;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class FlowableInterval extends e<Long> {
    final long initialDelay;
    final long period;
    final o scheduler;
    final TimeUnit unit;

    static final class IntervalSubscriber extends AtomicLong implements Runnable, d {
        private static final long serialVersionUID = -2809475196591179431L;
        long count;
        final c<? super Long> downstream;
        final AtomicReference<b> resource = new AtomicReference();

        IntervalSubscriber(c<? super Long> cVar) {
            this.downstream = cVar;
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.b.a(this, j);
            }
        }

        public void cancel() {
            DisposableHelper.dispose(this.resource);
        }

        public void run() {
            if (this.resource.get() == DisposableHelper.DISPOSED) {
                return;
            }
            c cVar;
            if (get() != 0) {
                cVar = this.downstream;
                long j = this.count;
                this.count = j + 1;
                cVar.onNext(Long.valueOf(j));
                io.reactivex.internal.util.b.c(this, 1);
                return;
            }
            cVar = this.downstream;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't deliver value ");
            stringBuilder.append(this.count);
            stringBuilder.append(" due to lack of requests");
            cVar.onError(new MissingBackpressureException(stringBuilder.toString()));
            DisposableHelper.dispose(this.resource);
        }

        public void k(b bVar) {
            DisposableHelper.setOnce(this.resource, bVar);
        }
    }

    public FlowableInterval(long j, long j2, TimeUnit timeUnit, o oVar) {
        this.initialDelay = j;
        this.period = j2;
        this.unit = timeUnit;
        this.scheduler = oVar;
    }

    public void a(c<? super Long> cVar) {
        IntervalSubscriber intervalSubscriber = new IntervalSubscriber(cVar);
        cVar.onSubscribe(intervalSubscriber);
        o oVar = this.scheduler;
        if (oVar instanceof j) {
            o.c blk = oVar.blk();
            intervalSubscriber.k(blk);
            blk.d(intervalSubscriber, this.initialDelay, this.period, this.unit);
            return;
        }
        intervalSubscriber.k(oVar.c(intervalSubscriber, this.initialDelay, this.period, this.unit));
    }
}
