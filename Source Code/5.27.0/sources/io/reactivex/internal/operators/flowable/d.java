package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.o;
import java.util.concurrent.TimeUnit;
import org.a.c;

/* compiled from: FlowableDelay */
public final class d<T> extends a<T, T> {
    final long delay;
    final boolean delayError;
    final o scheduler;
    final TimeUnit unit;

    /* compiled from: FlowableDelay */
    static final class a<T> implements h<T>, org.a.d {
        final long delay;
        final boolean delayError;
        final org.a.c<? super T> downstream;
        final io.reactivex.o.c eQl;
        final TimeUnit unit;
        org.a.d upstream;

        /* compiled from: FlowableDelay */
        final class a implements Runnable {
            a() {
            }

            public void run() {
                try {
                    a.this.downstream.onComplete();
                } finally {
                    a.this.eQl.dispose();
                }
            }
        }

        /* compiled from: FlowableDelay */
        final class b implements Runnable {
            private final Throwable bgz;

            b(Throwable th) {
                this.bgz = th;
            }

            public void run() {
                try {
                    a.this.downstream.onError(this.bgz);
                } finally {
                    a.this.eQl.dispose();
                }
            }
        }

        /* compiled from: FlowableDelay */
        final class c implements Runnable {
            private final T eRw;

            c(T t) {
                this.eRw = t;
            }

            public void run() {
                a.this.downstream.onNext(this.eRw);
            }
        }

        a(org.a.c<? super T> cVar, long j, TimeUnit timeUnit, io.reactivex.o.c cVar2, boolean z) {
            this.downstream = cVar;
            this.delay = j;
            this.unit = timeUnit;
            this.eQl = cVar2;
            this.delayError = z;
        }

        public void onSubscribe(org.a.d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.eQl.c(new c(t), this.delay, this.unit);
        }

        public void onError(Throwable th) {
            this.eQl.c(new b(th), this.delayError ? this.delay : 0, this.unit);
        }

        public void onComplete() {
            this.eQl.c(new a(), this.delay, this.unit);
        }

        public void request(long j) {
            this.upstream.request(j);
        }

        public void cancel() {
            this.upstream.cancel();
            this.eQl.dispose();
        }
    }

    public d(e<T> eVar, long j, TimeUnit timeUnit, o oVar, boolean z) {
        super(eVar);
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = oVar;
        this.delayError = z;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        c cVar2;
        if (this.delayError) {
            cVar2 = cVar;
        } else {
            cVar2 = new io.reactivex.e.a(cVar);
        }
        this.eRc.a(new a(cVar2, this.delay, this.unit, this.scheduler.blk(), this.delayError));
    }
}
