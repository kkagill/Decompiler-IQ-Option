package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.b.b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.p;
import io.reactivex.r;
import java.util.NoSuchElementException;
import org.a.d;

/* compiled from: FlowableSingleSingle */
public final class v<T> extends p<T> implements b<T> {
    final T defaultValue;
    final e<T> eRc;

    /* compiled from: FlowableSingleSingle */
    static final class a<T> implements io.reactivex.disposables.b, h<T> {
        final T defaultValue;
        boolean done;
        final r<? super T> downstream;
        d upstream;
        T value;

        a(r<? super T> rVar, T t) {
            this.downstream = rVar;
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
                if (this.value != null) {
                    this.done = true;
                    this.upstream.cancel();
                    this.upstream = SubscriptionHelper.CANCELLED;
                    this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.value = t;
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
            if (!this.done) {
                this.done = true;
                this.upstream = SubscriptionHelper.CANCELLED;
                Object obj = this.value;
                this.value = null;
                if (obj == null) {
                    obj = this.defaultValue;
                }
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

    public v(e<T> eVar, T t) {
        this.eRc = eVar;
        this.defaultValue = t;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        this.eRc.a(new a(rVar, this.defaultValue));
    }

    public e<T> blv() {
        return io.reactivex.c.a.k(new FlowableSingle(this.eRc, this.defaultValue, true));
    }
}
