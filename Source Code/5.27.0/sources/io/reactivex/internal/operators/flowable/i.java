package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.b.b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.p;
import io.reactivex.r;
import java.util.NoSuchElementException;
import org.a.d;

/* compiled from: FlowableElementAtSingle */
public final class i<T> extends p<T> implements b<T> {
    final T defaultValue;
    final e<T> eRc;
    final long index;

    /* compiled from: FlowableElementAtSingle */
    static final class a<T> implements io.reactivex.disposables.b, h<T> {
        long count;
        final T defaultValue;
        boolean done;
        final r<? super T> downstream;
        final long index;
        d upstream;

        a(r<? super T> rVar, long j, T t) {
            this.downstream = rVar;
            this.index = j;
            this.defaultValue = t;
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
                Object obj = this.defaultValue;
                if (obj != null) {
                    this.downstream.onSuccess(obj);
                } else {
                    this.downstream.onError(new NoSuchElementException());
                }
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

    public i(e<T> eVar, long j, T t) {
        this.eRc = eVar;
        this.index = j;
        this.defaultValue = t;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        this.eRc.a(new a(rVar, this.index, this.defaultValue));
    }

    public e<T> blv() {
        return io.reactivex.c.a.k(new FlowableElementAt(this.eRc, this.index, this.defaultValue, true));
    }
}
