package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.b.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.p;
import io.reactivex.r;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.a.d;

/* compiled from: FlowableToListSingle */
public final class z<T, U extends Collection<? super T>> extends p<U> implements b<U> {
    final e<T> eRc;
    final Callable<U> eSc;

    /* compiled from: FlowableToListSingle */
    static final class a<T, U extends Collection<? super T>> implements io.reactivex.disposables.b, h<T> {
        final r<? super U> downstream;
        U eSd;
        d upstream;

        a(r<? super U> rVar, U u) {
            this.downstream = rVar;
            this.eSd = u;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.d(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public void onNext(T t) {
            this.eSd.add(t);
        }

        public void onError(Throwable th) {
            this.eSd = null;
            this.upstream = SubscriptionHelper.CANCELLED;
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.upstream = SubscriptionHelper.CANCELLED;
            this.downstream.onSuccess(this.eSd);
        }

        public void dispose() {
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
        }

        public boolean isDisposed() {
            return this.upstream == SubscriptionHelper.CANCELLED;
        }
    }

    public z(e<T> eVar) {
        this(eVar, ArrayListSupplier.asCallable());
    }

    public z(e<T> eVar, Callable<U> callable) {
        this.eRc = eVar;
        this.eSc = callable;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super U> rVar) {
        try {
            this.eRc.a(new a(rVar, (Collection) io.reactivex.internal.a.b.requireNonNull(this.eSc.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            EmptyDisposable.error(th, (r) rVar);
        }
    }

    public e<U> blv() {
        return io.reactivex.c.a.k(new FlowableToList(this.eRc, this.eSc));
    }
}
