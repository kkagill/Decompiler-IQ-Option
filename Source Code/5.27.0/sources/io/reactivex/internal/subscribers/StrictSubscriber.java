package io.reactivex.internal.subscribers;

import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public class StrictSubscriber<T> extends AtomicInteger implements h<T>, d {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final c<? super T> downstream;
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicBoolean once = new AtomicBoolean();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<d> upstream = new AtomicReference();

    public StrictSubscriber(c<? super T> cVar) {
        this.downstream = cVar;
    }

    public void request(long j) {
        if (j <= 0) {
            cancel();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("§3.9 violated: positive request amount required but it was ");
            stringBuilder.append(j);
            onError(new IllegalArgumentException(stringBuilder.toString()));
            return;
        }
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
    }

    public void cancel() {
        if (!this.done) {
            SubscriptionHelper.cancel(this.upstream);
        }
    }

    public void onSubscribe(d dVar) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
            return;
        }
        dVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public void onNext(T t) {
        io.reactivex.internal.util.d.a(this.downstream, (Object) t, (AtomicInteger) this, this.error);
    }

    public void onError(Throwable th) {
        this.done = true;
        io.reactivex.internal.util.d.a(this.downstream, th, (AtomicInteger) this, this.error);
    }

    public void onComplete() {
        this.done = true;
        io.reactivex.internal.util.d.a(this.downstream, this, this.error);
    }
}
