package io.reactivex.internal.subscribers;

import io.reactivex.c.a;

/* compiled from: BlockingFirstSubscriber */
public final class d<T> extends c<T> {
    public void onNext(T t) {
        if (this.value == null) {
            this.value = t;
            this.upstream.cancel();
            countDown();
        }
    }

    public void onError(Throwable th) {
        if (this.value == null) {
            this.error = th;
        } else {
            a.onError(th);
        }
        countDown();
    }
}
