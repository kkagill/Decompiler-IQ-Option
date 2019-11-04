package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.j;
import io.reactivex.k;
import org.a.c;

public final class MaybeToFlowable<T> extends e<T> {
    final k<T> eSe;

    static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements j<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        b upstream;

        MaybeToFlowableSubscriber(c<? super T> cVar) {
            super(cVar);
        }

        public void d(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            complete(t);
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.downstream.onComplete();
        }

        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }
    }

    public MaybeToFlowable(k<T> kVar) {
        this.eSe = kVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        this.eSe.a(new MaybeToFlowableSubscriber(cVar));
    }
}
