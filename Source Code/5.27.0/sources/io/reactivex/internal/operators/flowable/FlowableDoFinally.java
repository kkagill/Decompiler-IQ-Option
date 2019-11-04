package io.reactivex.internal.operators.flowable;

import io.reactivex.b.a;
import io.reactivex.h;
import io.reactivex.internal.b.e;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.a.c;
import org.a.d;

public final class FlowableDoFinally<T> extends a<T, T> {
    final a onFinally;

    static final class DoFinallyConditionalSubscriber<T> extends BasicIntQueueSubscription<T> implements io.reactivex.internal.b.a<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.internal.b.a<? super T> downstream;
        final a onFinally;
        e<T> qs;
        boolean syncFused;
        d upstream;

        DoFinallyConditionalSubscriber(io.reactivex.internal.b.a<? super T> aVar, a aVar2) {
            this.downstream = aVar;
            this.onFinally = aVar2;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof e) {
                    this.qs = (e) dVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        public boolean cN(T t) {
            return this.downstream.cN(t);
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
            blG();
        }

        public void onComplete() {
            this.downstream.onComplete();
            blG();
        }

        public void cancel() {
            this.upstream.cancel();
            blG();
        }

        public void request(long j) {
            this.upstream.request(j);
        }

        public int requestFusion(int i) {
            e eVar = this.qs;
            if (eVar == null || (i & 4) != 0) {
                return 0;
            }
            i = eVar.requestFusion(i);
            if (i != 0) {
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                this.syncFused = z;
            }
            return i;
        }

        public void clear() {
            this.qs.clear();
        }

        public boolean isEmpty() {
            return this.qs.isEmpty();
        }

        public T poll() {
            Object poll = this.qs.poll();
            if (poll == null && this.syncFused) {
                blG();
            }
            return poll;
        }

        /* Access modifiers changed, original: 0000 */
        public void blG() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.ad(th);
                    io.reactivex.c.a.onError(th);
                }
            }
        }
    }

    static final class DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements h<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final c<? super T> downstream;
        final a onFinally;
        e<T> qs;
        boolean syncFused;
        d upstream;

        DoFinallySubscriber(c<? super T> cVar, a aVar) {
            this.downstream = cVar;
            this.onFinally = aVar;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof e) {
                    this.qs = (e) dVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
            blG();
        }

        public void onComplete() {
            this.downstream.onComplete();
            blG();
        }

        public void cancel() {
            this.upstream.cancel();
            blG();
        }

        public void request(long j) {
            this.upstream.request(j);
        }

        public int requestFusion(int i) {
            e eVar = this.qs;
            if (eVar == null || (i & 4) != 0) {
                return 0;
            }
            i = eVar.requestFusion(i);
            if (i != 0) {
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                this.syncFused = z;
            }
            return i;
        }

        public void clear() {
            this.qs.clear();
        }

        public boolean isEmpty() {
            return this.qs.isEmpty();
        }

        public T poll() {
            Object poll = this.qs.poll();
            if (poll == null && this.syncFused) {
                blG();
            }
            return poll;
        }

        /* Access modifiers changed, original: 0000 */
        public void blG() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.ad(th);
                    io.reactivex.c.a.onError(th);
                }
            }
        }
    }

    public FlowableDoFinally(io.reactivex.e<T> eVar, a aVar) {
        super(eVar);
        this.onFinally = aVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        if (cVar instanceof io.reactivex.internal.b.a) {
            this.eRc.a(new DoFinallyConditionalSubscriber((io.reactivex.internal.b.a) cVar, this.onFinally));
        } else {
            this.eRc.a(new DoFinallySubscriber(cVar, this.onFinally));
        }
    }
}
