package io.reactivex.internal.subscribers;

import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;
import java.util.concurrent.atomic.AtomicLong;
import org.a.c;
import org.a.d;

public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements h<T>, d {
    private static final long serialVersionUID = 7917814472626990048L;
    protected final c<? super R> downstream;
    protected long produced;
    protected d upstream;
    protected R value;

    /* Access modifiers changed, original: protected */
    public void cV(R r) {
    }

    public SinglePostCompleteSubscriber(c<? super R> cVar) {
        this.downstream = cVar;
    }

    public void onSubscribe(d dVar) {
        if (SubscriptionHelper.validate(this.upstream, dVar)) {
            this.upstream = dVar;
            this.downstream.onSubscribe(this);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void complete(R r) {
        long j = this.produced;
        if (j != 0) {
            b.c(this, j);
        }
        while (true) {
            j = get();
            if ((j & Long.MIN_VALUE) != 0) {
                cV(r);
                return;
            } else if ((j & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.downstream.onNext(r);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r;
                if (!compareAndSet(0, Long.MIN_VALUE)) {
                    this.value = null;
                } else {
                    return;
                }
            }
        }
    }

    public final void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            long j2;
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.downstream.onNext(this.value);
                        this.downstream.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, b.z(j2, j)));
            this.upstream.request(j);
        }
    }

    public void cancel() {
        this.upstream.cancel();
    }
}
