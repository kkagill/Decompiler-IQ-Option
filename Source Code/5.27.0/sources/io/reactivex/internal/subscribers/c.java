package io.reactivex.internal.subscribers;

import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import org.a.d;

/* compiled from: BlockingBaseSubscriber */
public abstract class c<T> extends CountDownLatch implements h<T> {
    volatile boolean cancelled;
    Throwable error;
    d upstream;
    T value;

    public c() {
        super(1);
    }

    public final void onSubscribe(d dVar) {
        if (SubscriptionHelper.validate(this.upstream, dVar)) {
            this.upstream = dVar;
            if (!this.cancelled) {
                dVar.request(Long.MAX_VALUE);
                if (this.cancelled) {
                    this.upstream = SubscriptionHelper.CANCELLED;
                    dVar.cancel();
                }
            }
        }
    }

    public final void onComplete() {
        countDown();
    }

    public final T ble() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.c.bmC();
                await();
            } catch (InterruptedException e) {
                d dVar = this.upstream;
                this.upstream = SubscriptionHelper.CANCELLED;
                if (dVar != null) {
                    dVar.cancel();
                }
                throw ExceptionHelper.aj(e);
            }
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw ExceptionHelper.aj(th);
    }
}
