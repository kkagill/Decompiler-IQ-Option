package io.reactivex.internal.operators.flowable;

import io.reactivex.b.g;
import io.reactivex.e;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.processors.a;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableRetryWhen<T> extends a<T, T> {
    final g<? super e<Throwable>, ? extends b<?>> eRQ;

    static final class RetryWhenSubscriber<T> extends WhenSourceSubscriber<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        RetryWhenSubscriber(c<? super T> cVar, a<Throwable> aVar, d dVar) {
            super(cVar, aVar, dVar);
        }

        public void onError(Throwable th) {
            cQ(th);
        }

        public void onComplete() {
            this.receiver.cancel();
            this.downstream.onComplete();
        }
    }

    public FlowableRetryWhen(e<T> eVar, g<? super e<Throwable>, ? extends b<?>> gVar) {
        super(eVar);
        this.eRQ = gVar;
    }

    public void a(c<? super T> cVar) {
        io.reactivex.e.a aVar = new io.reactivex.e.a(cVar);
        a bmJ = UnicastProcessor.jG(8).bmJ();
        try {
            b bVar = (b) io.reactivex.internal.a.b.requireNonNull(this.eRQ.apply(bmJ), "handler returned a null Publisher");
            WhenReceiver whenReceiver = new WhenReceiver(this.eRc);
            RetryWhenSubscriber retryWhenSubscriber = new RetryWhenSubscriber(aVar, bmJ, whenReceiver);
            whenReceiver.subscriber = retryWhenSubscriber;
            cVar.onSubscribe(retryWhenSubscriber);
            bVar.subscribe(whenReceiver);
            whenReceiver.onNext(Integer.valueOf(0));
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
