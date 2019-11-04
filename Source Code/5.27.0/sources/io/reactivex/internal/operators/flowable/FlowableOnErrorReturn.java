package io.reactivex.internal.operators.flowable;

import io.reactivex.b.g;
import io.reactivex.e;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.a;
import io.reactivex.internal.a.b;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import org.a.c;

public final class FlowableOnErrorReturn<T> extends a<T, T> {
    final g<? super Throwable, ? extends T> valueSupplier;

    static final class OnErrorReturnSubscriber<T> extends SinglePostCompleteSubscriber<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;
        final g<? super Throwable, ? extends T> valueSupplier;

        OnErrorReturnSubscriber(c<? super T> cVar, g<? super Throwable, ? extends T> gVar) {
            super(cVar);
            this.valueSupplier = gVar;
        }

        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        public void onError(Throwable th) {
            try {
                th = b.requireNonNull(this.valueSupplier.apply(th), "The valueSupplier returned a null value");
                complete(th);
            } catch (Throwable th2) {
                a.ad(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        public void onComplete() {
            this.downstream.onComplete();
        }
    }

    public FlowableOnErrorReturn(e<T> eVar, g<? super Throwable, ? extends T> gVar) {
        super(eVar);
        this.valueSupplier = gVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        this.eRc.a(new OnErrorReturnSubscriber(cVar, this.valueSupplier));
    }
}
