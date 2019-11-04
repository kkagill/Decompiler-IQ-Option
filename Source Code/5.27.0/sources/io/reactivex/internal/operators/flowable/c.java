package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.b.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.p;
import io.reactivex.r;
import java.util.concurrent.Callable;
import org.a.d;

/* compiled from: FlowableCollectSingle */
public final class c<T, U> extends p<U> implements b<U> {
    final io.reactivex.b.b<? super U, ? super T> collector;
    final e<T> eRc;
    final Callable<? extends U> eRn;

    /* compiled from: FlowableCollectSingle */
    static final class a<T, U> implements io.reactivex.disposables.b, h<T> {
        final io.reactivex.b.b<? super U, ? super T> collector;
        boolean done;
        final r<? super U> downstream;
        final U u;
        d upstream;

        a(r<? super U> rVar, U u, io.reactivex.b.b<? super U, ? super T> bVar) {
            this.downstream = rVar;
            this.collector = bVar;
            this.u = u;
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
                try {
                    this.collector.accept(this.u, t);
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
            this.upstream = SubscriptionHelper.CANCELLED;
            this.downstream.onError(th);
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.upstream = SubscriptionHelper.CANCELLED;
                this.downstream.onSuccess(this.u);
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

    public c(e<T> eVar, Callable<? extends U> callable, io.reactivex.b.b<? super U, ? super T> bVar) {
        this.eRc = eVar;
        this.eRn = callable;
        this.collector = bVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super U> rVar) {
        try {
            this.eRc.a(new a(rVar, io.reactivex.internal.a.b.requireNonNull(this.eRn.call(), "The initialSupplier returned a null value"), this.collector));
        } catch (Throwable th) {
            EmptyDisposable.error(th, (r) rVar);
        }
    }

    public e<U> blv() {
        return io.reactivex.c.a.k(new FlowableCollect(this.eRc, this.eRn, this.collector));
    }
}
