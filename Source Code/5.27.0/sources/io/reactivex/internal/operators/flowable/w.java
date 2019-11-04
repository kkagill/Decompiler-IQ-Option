package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.a.c;
import org.a.d;

/* compiled from: FlowableSkip */
public final class w<T> extends a<T, T> {
    final long eRW;

    /* compiled from: FlowableSkip */
    static final class a<T> implements h<T>, d {
        final c<? super T> downstream;
        long remaining;
        d upstream;

        a(c<? super T> cVar, long j) {
            this.downstream = cVar;
            this.remaining = j;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                long j = this.remaining;
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(j);
            }
        }

        public void onNext(T t) {
            long j = this.remaining;
            if (j != 0) {
                this.remaining = j - 1;
            } else {
                this.downstream.onNext(t);
            }
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.downstream.onComplete();
        }

        public void request(long j) {
            this.upstream.request(j);
        }

        public void cancel() {
            this.upstream.cancel();
        }
    }

    public w(e<T> eVar, long j) {
        super(eVar);
        this.eRW = j;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        this.eRc.a(new a(cVar, this.eRW));
    }
}
