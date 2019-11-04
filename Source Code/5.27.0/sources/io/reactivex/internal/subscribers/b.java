package io.reactivex.internal.subscribers;

import io.reactivex.c.a;
import io.reactivex.h;
import io.reactivex.internal.b.e;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.a.c;
import org.a.d;

/* compiled from: BasicFuseableSubscriber */
public abstract class b<T, R> implements h<T>, e<R> {
    protected boolean done;
    protected final c<? super R> downstream;
    protected e<T> qs;
    protected int sourceMode;
    protected d upstream;

    /* Access modifiers changed, original: protected */
    public boolean bms() {
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void bmt() {
    }

    public b(c<? super R> cVar) {
        this.downstream = cVar;
    }

    public final void onSubscribe(d dVar) {
        if (SubscriptionHelper.validate(this.upstream, dVar)) {
            this.upstream = dVar;
            if (dVar instanceof e) {
                this.qs = (e) dVar;
            }
            if (bms()) {
                this.downstream.onSubscribe(this);
                bmt();
            }
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            a.onError(th);
            return;
        }
        this.done = true;
        this.downstream.onError(th);
    }

    /* Access modifiers changed, original: protected|final */
    public final void U(Throwable th) {
        io.reactivex.exceptions.a.ad(th);
        this.upstream.cancel();
        onError(th);
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            this.downstream.onComplete();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int jC(int i) {
        e eVar = this.qs;
        if (eVar == null || (i & 4) != 0) {
            return 0;
        }
        i = eVar.requestFusion(i);
        if (i != 0) {
            this.sourceMode = i;
        }
        return i;
    }

    public void request(long j) {
        this.upstream.request(j);
    }

    public void cancel() {
        this.upstream.cancel();
    }

    public boolean isEmpty() {
        return this.qs.isEmpty();
    }

    public void clear() {
        this.qs.clear();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
