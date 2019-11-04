package io.reactivex.internal.operators.flowable;

import io.reactivex.b.g;
import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.processors.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableRepeatWhen<T> extends a<T, T> {
    final g<? super e<Object>, ? extends b<?>> eRQ;

    static final class WhenReceiver<T, U> extends AtomicInteger implements h<Object>, d {
        private static final long serialVersionUID = 2827772011130406689L;
        final AtomicLong requested = new AtomicLong();
        final b<T> source;
        WhenSourceSubscriber<T, U> subscriber;
        final AtomicReference<d> upstream = new AtomicReference();

        WhenReceiver(b<T> bVar) {
            this.source = bVar;
        }

        public void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
        }

        public void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                    this.source.subscribe(this.subscriber);
                    if (decrementAndGet() == 0) {
                    }
                }
            }
        }

        public void onError(Throwable th) {
            this.subscriber.cancel();
            this.subscriber.downstream.onError(th);
        }

        public void onComplete() {
            this.subscriber.cancel();
            this.subscriber.downstream.onComplete();
        }

        public void request(long j) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
        }
    }

    static abstract class WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements h<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        protected final c<? super T> downstream;
        protected final a<U> processor;
        private long produced;
        protected final d receiver;

        WhenSourceSubscriber(c<? super T> cVar, a<U> aVar, d dVar) {
            super(false);
            this.downstream = cVar;
            this.processor = aVar;
            this.receiver = dVar;
        }

        public final void onSubscribe(d dVar) {
            a(dVar);
        }

        public final void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        /* Access modifiers changed, original: protected|final */
        public final void cQ(U u) {
            a(EmptySubscription.INSTANCE);
            long j = this.produced;
            if (j != 0) {
                this.produced = 0;
                dc(j);
            }
            this.receiver.request(1);
            this.processor.onNext(u);
        }

        public final void cancel() {
            super.cancel();
            this.receiver.cancel();
        }
    }

    static final class RepeatWhenSubscriber<T> extends WhenSourceSubscriber<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        RepeatWhenSubscriber(c<? super T> cVar, a<Object> aVar, d dVar) {
            super(cVar, aVar, dVar);
        }

        public void onError(Throwable th) {
            this.receiver.cancel();
            this.downstream.onError(th);
        }

        public void onComplete() {
            cQ(Integer.valueOf(0));
        }
    }

    public FlowableRepeatWhen(e<T> eVar, g<? super e<Object>, ? extends b<?>> gVar) {
        super(eVar);
        this.eRQ = gVar;
    }

    public void a(c<? super T> cVar) {
        io.reactivex.e.a aVar = new io.reactivex.e.a(cVar);
        a bmJ = UnicastProcessor.jG(8).bmJ();
        try {
            b bVar = (b) io.reactivex.internal.a.b.requireNonNull(this.eRQ.apply(bmJ), "handler returned a null Publisher");
            WhenReceiver whenReceiver = new WhenReceiver(this.eRc);
            RepeatWhenSubscriber repeatWhenSubscriber = new RepeatWhenSubscriber(aVar, bmJ, whenReceiver);
            whenReceiver.subscriber = repeatWhenSubscriber;
            cVar.onSubscribe(repeatWhenSubscriber);
            bVar.subscribe(whenReceiver);
            whenReceiver.onNext(Integer.valueOf(0));
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
