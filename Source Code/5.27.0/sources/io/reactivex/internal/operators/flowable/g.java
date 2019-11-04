package io.reactivex.internal.operators.flowable;

import io.reactivex.b.f;
import io.reactivex.b.k;
import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.a.c;
import org.a.d;

/* compiled from: FlowableDoOnLifecycle */
public final class g<T> extends a<T, T> {
    private final k eRB;
    private final io.reactivex.b.a eRC;
    private final f<? super d> onSubscribe;

    /* compiled from: FlowableDoOnLifecycle */
    static final class a<T> implements h<T>, d {
        final c<? super T> downstream;
        final k eRB;
        final io.reactivex.b.a eRC;
        final f<? super d> onSubscribe;
        d upstream;

        a(c<? super T> cVar, f<? super d> fVar, k kVar, io.reactivex.b.a aVar) {
            this.downstream = cVar;
            this.onSubscribe = fVar;
            this.eRC = aVar;
            this.eRB = kVar;
        }

        public void onSubscribe(d dVar) {
            try {
                this.onSubscribe.accept(dVar);
                if (SubscriptionHelper.validate(this.upstream, dVar)) {
                    this.upstream = dVar;
                    this.downstream.onSubscribe(this);
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                dVar.cancel();
                this.upstream = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th, this.downstream);
            }
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        public void onError(Throwable th) {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.downstream.onError(th);
            } else {
                io.reactivex.c.a.onError(th);
            }
        }

        public void onComplete() {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.downstream.onComplete();
            }
        }

        public void request(long j) {
            try {
                this.eRB.accept(j);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                io.reactivex.c.a.onError(th);
            }
            this.upstream.request(j);
        }

        public void cancel() {
            d dVar = this.upstream;
            if (dVar != SubscriptionHelper.CANCELLED) {
                this.upstream = SubscriptionHelper.CANCELLED;
                try {
                    this.eRC.run();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.ad(th);
                    io.reactivex.c.a.onError(th);
                }
                dVar.cancel();
            }
        }
    }

    public g(e<T> eVar, f<? super d> fVar, k kVar, io.reactivex.b.a aVar) {
        super(eVar);
        this.onSubscribe = fVar;
        this.eRB = kVar;
        this.eRC = aVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        this.eRc.a(new a(cVar, this.onSubscribe, this.eRB, this.eRC));
    }
}
