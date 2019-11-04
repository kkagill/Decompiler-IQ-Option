package io.reactivex.internal.operators.flowable;

import io.reactivex.b.l;
import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.a.c;
import org.a.d;

/* compiled from: FlowableSkipWhile */
public final class x<T> extends a<T, T> {
    final l<? super T> eQS;

    /* compiled from: FlowableSkipWhile */
    static final class a<T> implements h<T>, d {
        final c<? super T> downstream;
        final l<? super T> eQS;
        boolean eRX;
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
            if (this.eRX) {
                this.downstream.onNext(t);
            } else {
                try {
                    if (this.eQS.test(t)) {
                        this.upstream.request(1);
                    } else {
                        this.eRX = true;
                        this.downstream.onNext(t);
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.ad(th);
                    this.upstream.cancel();
                    this.downstream.onError(th);
                }
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

    public x(e<T> eVar, l<? super T> lVar) {
        super(eVar);
        this.eQS = lVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        this.eRc.a(new a(cVar, this.eQS));
    }
}
