package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.i;
import io.reactivex.internal.b.b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import org.a.d;

/* compiled from: FlowableElementAtMaybe */
public final class h<T> extends i<T> implements b<T> {
    final e<T> eRc;
    final long index;

    /* compiled from: FlowableElementAtMaybe */
    static final class a<T> implements io.reactivex.disposables.b, io.reactivex.h<T> {
        long count;
        boolean done;
        final j<? super T> downstream;
        final long index;
        d upstream;

        a(j<? super T> jVar, long j) {
            this.downstream = jVar;
            this.index = j;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.d(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                long j = this.count;
                if (j == this.index) {
                    this.done = true;
                    this.upstream.cancel();
                    this.upstream = SubscriptionHelper.CANCELLED;
                    this.downstream.onSuccess(t);
                    return;
                }
                this.count = j + 1;
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.c.a.onError(th);
                return;
            }
            this.done = true;
            this.upstream = SubscriptionHelper.CANCELLED;
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.upstream = SubscriptionHelper.CANCELLED;
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        public void dispose() {
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
        }

        public boolean isDisposed() {
            return this.upstream == SubscriptionHelper.CANCELLED;
        }
    }

    public h(e<T> eVar, long j) {
        this.eRc = eVar;
        this.index = j;
    }

    /* Access modifiers changed, original: protected */
    public void b(j<? super T> jVar) {
        this.eRc.a(new a(jVar, this.index));
    }

    public e<T> blv() {
        return io.reactivex.c.a.k(new FlowableElementAt(this.eRc, this.index, null, false));
    }
}
