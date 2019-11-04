package io.reactivex.internal.operators.completable;

import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.a.b;
import org.a.d;

/* compiled from: CompletableFromPublisher */
public final class c<T> extends io.reactivex.a {
    final b<T> eQO;

    /* compiled from: CompletableFromPublisher */
    static final class a<T> implements io.reactivex.disposables.b, h<T> {
        final io.reactivex.b downstream;
        d upstream;

        public void onNext(T t) {
        }

        a(io.reactivex.b bVar) {
            this.downstream = bVar;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.d(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.downstream.onComplete();
        }

        public void dispose() {
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
        }

        public boolean isDisposed() {
            return this.upstream == SubscriptionHelper.CANCELLED;
        }
    }

    public c(b<T> bVar) {
        this.eQO = bVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(io.reactivex.b bVar) {
        this.eQO.subscribe(new a(bVar));
    }
}
