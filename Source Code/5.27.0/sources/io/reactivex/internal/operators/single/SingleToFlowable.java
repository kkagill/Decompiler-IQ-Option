package io.reactivex.internal.operators.single;

import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.r;
import io.reactivex.t;
import org.a.c;

public final class SingleToFlowable<T> extends e<T> {
    final t<? extends T> source;

    static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements r<T> {
        private static final long serialVersionUID = 187782011903685568L;
        b upstream;

        SingleToFlowableObserver(c<? super T> cVar) {
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

        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }
    }

    public SingleToFlowable(t<? extends T> tVar) {
        this.source = tVar;
    }

    public void a(c<? super T> cVar) {
        this.source.a(new SingleToFlowableObserver(cVar));
    }
}
