package io.reactivex.internal.observers;

import io.reactivex.b;
import io.reactivex.internal.disposables.DisposableHelper;
import org.a.d;

/* compiled from: SubscriberCompletableObserver */
public final class c<T> implements b, d {
    final org.a.c<? super T> subscriber;
    io.reactivex.disposables.b upstream;

    public void request(long j) {
    }

    public c(org.a.c<? super T> cVar) {
        this.subscriber = cVar;
    }

    public void onComplete() {
        this.subscriber.onComplete();
    }

    public void onError(Throwable th) {
        this.subscriber.onError(th);
    }

    public void d(io.reactivex.disposables.b bVar) {
        if (DisposableHelper.validate(this.upstream, bVar)) {
            this.upstream = bVar;
            this.subscriber.onSubscribe(this);
        }
    }

    public void cancel() {
        this.upstream.dispose();
    }
}
