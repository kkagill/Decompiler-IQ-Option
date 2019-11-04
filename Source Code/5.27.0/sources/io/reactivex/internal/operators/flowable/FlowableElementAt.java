package io.reactivex.internal.operators.flowable;

import io.reactivex.c.a;
import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import org.a.c;
import org.a.d;

public final class FlowableElementAt<T> extends a<T, T> {
    final T defaultValue;
    final boolean errorOnFewer;
    final long index;

    static final class ElementAtSubscriber<T> extends DeferredScalarSubscription<T> implements h<T> {
        private static final long serialVersionUID = 4066607327284737757L;
        long count;
        final T defaultValue;
        boolean done;
        final boolean errorOnFewer;
        final long index;
        d upstream;

        ElementAtSubscriber(c<? super T> cVar, long j, T t, boolean z) {
            super(cVar);
            this.index = j;
            this.defaultValue = t;
            this.errorOnFewer = z;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                long j = this.count;
                if (j == this.index) {
                    this.done = true;
                    this.upstream.cancel();
                    complete(t);
                    return;
                }
                this.count = j + 1;
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                a.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                Object obj = this.defaultValue;
                if (obj != null) {
                    complete(obj);
                } else if (this.errorOnFewer) {
                    this.downstream.onError(new NoSuchElementException());
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }
    }

    public FlowableElementAt(e<T> eVar, long j, T t, boolean z) {
        super(eVar);
        this.index = j;
        this.defaultValue = t;
        this.errorOnFewer = z;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        this.eRc.a(new ElementAtSubscriber(cVar, this.index, this.defaultValue, this.errorOnFewer));
    }
}
