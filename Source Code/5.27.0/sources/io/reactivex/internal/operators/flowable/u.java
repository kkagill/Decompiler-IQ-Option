package io.reactivex.internal.operators.flowable;

import io.reactivex.b.c;
import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.a.b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.a.d;

/* compiled from: FlowableScan */
public final class u<T> extends a<T, T> {
    final c<T, T, T> accumulator;

    /* compiled from: FlowableScan */
    static final class a<T> implements h<T>, d {
        final c<T, T, T> accumulator;
        boolean done;
        final org.a.c<? super T> downstream;
        d upstream;
        T value;

        a(org.a.c<? super T> cVar, c<T, T, T> cVar2) {
            this.downstream = cVar;
            this.accumulator = cVar2;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                org.a.c cVar = this.downstream;
                Object obj = this.value;
                if (obj == null) {
                    this.value = t;
                    cVar.onNext(t);
                } else {
                    try {
                        Object requireNonNull = b.requireNonNull(this.accumulator.apply(obj, t), "The value returned by the accumulator is null");
                        this.value = requireNonNull;
                        cVar.onNext(requireNonNull);
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.ad(th);
                        this.upstream.cancel();
                        onError(th);
                    }
                }
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.c.a.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        public void request(long j) {
            this.upstream.request(j);
        }

        public void cancel() {
            this.upstream.cancel();
        }
    }

    public u(e<T> eVar, c<T, T, T> cVar) {
        super(eVar);
        this.accumulator = cVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(org.a.c<? super T> cVar) {
        this.eRc.a(new a(cVar, this.accumulator));
    }
}
