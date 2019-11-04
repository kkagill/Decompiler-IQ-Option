package io.reactivex.internal.operators.flowable;

import io.reactivex.b.l;
import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.a.c;
import org.a.d;

/* compiled from: FlowableTakeUntilPredicate */
public final class y<T> extends a<T, T> {
    final l<? super T> eQS;

    /* compiled from: FlowableTakeUntilPredicate */
    static final class a<T> implements h<T>, d {
        boolean done;
        final c<? super T> downstream;
        final l<? super T> eQS;
        d upstream;

        a(c<? super T> cVar, l<? super T> lVar) {
            this.downstream = cVar;
            this.eQS = lVar;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                this.downstream.onNext(t);
                try {
                    if (this.eQS.test(t)) {
                        this.done = true;
                        this.upstream.cancel();
                        this.downstream.onComplete();
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.ad(th);
                    this.upstream.cancel();
                    onError(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.c.a.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        public void request(long j) {
            this.upstream.request(j);
        }

        public void cancel() {
            this.upstream.cancel();
        }
    }

    public y(e<T> eVar, l<? super T> lVar) {
        super(eVar);
        this.eQS = lVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        this.eRc.a(new a(cVar, this.eQS));
    }
}
