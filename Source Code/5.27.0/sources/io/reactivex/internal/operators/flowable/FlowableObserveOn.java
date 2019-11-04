package io.reactivex.internal.operators.flowable;

import io.reactivex.c.a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.h;
import io.reactivex.internal.b.e;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;
import io.reactivex.o;
import io.reactivex.o.c;
import java.util.concurrent.atomic.AtomicLong;
import org.a.d;

public final class FlowableObserveOn<T> extends a<T, T> {
    final boolean delayError;
    final int prefetch;
    final o scheduler;

    static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements h<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final int limit;
        boolean outputFused;
        final int prefetch;
        long produced;
        io.reactivex.internal.b.h<T> queue;
        final AtomicLong requested = new AtomicLong();
        int sourceMode;
        d upstream;
        final c worker;

        public abstract void blP();

        public abstract void blQ();

        public abstract void blR();

        BaseObserveOnSubscriber(c cVar, boolean z, int i) {
            this.worker = cVar;
            this.delayError = z;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode == 2) {
                    blO();
                    return;
                }
                if (!this.queue.offer(t)) {
                    this.upstream.cancel();
                    this.error = new MissingBackpressureException("Queue is full?!");
                    this.done = true;
                }
                blO();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                a.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            blO();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                blO();
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                b.a(this.requested, j);
                blO();
            }
        }

        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                this.worker.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        /* Access modifiers changed, original: final */
        public final void blO() {
            if (getAndIncrement() == 0) {
                this.worker.n(this);
            }
        }

        public final void run() {
            if (this.outputFused) {
                blP();
            } else if (this.sourceMode == 1) {
                blQ();
            } else {
                blR();
            }
        }

        /* Access modifiers changed, original: final */
        public final boolean a(boolean z, boolean z2, org.a.c<?> cVar) {
            if (this.cancelled) {
                clear();
                return true;
            }
            if (z) {
                Throwable th;
                if (!this.delayError) {
                    th = this.error;
                    if (th != null) {
                        this.cancelled = true;
                        clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return true;
                    } else if (z2) {
                        this.cancelled = true;
                        cVar.onComplete();
                        this.worker.dispose();
                        return true;
                    }
                } else if (z2) {
                    this.cancelled = true;
                    th = this.error;
                    if (th != null) {
                        cVar.onError(th);
                    } else {
                        cVar.onComplete();
                    }
                    this.worker.dispose();
                    return true;
                }
            }
            return false;
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public final void clear() {
            this.queue.clear();
        }

        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }
    }

    static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = 644624475404284533L;
        long consumed;
        final io.reactivex.internal.b.a<? super T> downstream;

        ObserveOnConditionalSubscriber(io.reactivex.internal.b.a<? super T> aVar, c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.downstream = aVar;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    int requestFusion = eVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = eVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = eVar;
                        this.downstream.onSubscribe(this);
                        dVar.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                dVar.request((long) this.prefetch);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void blQ() {
            io.reactivex.internal.b.a aVar = this.downstream;
            io.reactivex.internal.b.h hVar = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        Object poll = hVar.poll();
                        if (!this.cancelled) {
                            if (poll == null) {
                                this.cancelled = true;
                                aVar.onComplete();
                                this.worker.dispose();
                                return;
                            } else if (aVar.cN(poll)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.ad(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        aVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (hVar.isEmpty()) {
                        this.cancelled = true;
                        aVar.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void blR() {
            io.reactivex.internal.b.a aVar = this.downstream;
            io.reactivex.internal.b.h hVar = this.queue;
            long j = this.produced;
            long j2 = this.consumed;
            int i = 1;
            while (true) {
                long j3 = this.requested.get();
                while (j != j3) {
                    boolean z = this.done;
                    try {
                        Object poll = hVar.poll();
                        boolean z2 = poll == null;
                        if (!a(z, z2, aVar)) {
                            if (z2) {
                                break;
                            }
                            if (aVar.cN(poll)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.limit)) {
                                this.upstream.request(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.ad(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        hVar.clear();
                        aVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j != j3 || !a(this.done, hVar.isEmpty(), aVar)) {
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        this.consumed = j2;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void blP() {
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public T poll() {
            Object poll = this.queue.poll();
            if (!(poll == null || this.sourceMode == 1)) {
                long j = this.consumed + 1;
                if (j == ((long) this.limit)) {
                    this.consumed = 0;
                    this.upstream.request(j);
                } else {
                    this.consumed = j;
                }
            }
            return poll;
        }
    }

    static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> implements h<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final org.a.c<? super T> downstream;

        ObserveOnSubscriber(org.a.c<? super T> cVar, c cVar2, boolean z, int i) {
            super(cVar2, z, i);
            this.downstream = cVar;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    int requestFusion = eVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = eVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = eVar;
                        this.downstream.onSubscribe(this);
                        dVar.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                dVar.request((long) this.prefetch);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void blQ() {
            org.a.c cVar = this.downstream;
            io.reactivex.internal.b.h hVar = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        Object poll = hVar.poll();
                        if (!this.cancelled) {
                            if (poll == null) {
                                this.cancelled = true;
                                cVar.onComplete();
                                this.worker.dispose();
                                return;
                            }
                            cVar.onNext(poll);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.ad(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (hVar.isEmpty()) {
                        this.cancelled = true;
                        cVar.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void blR() {
            org.a.c cVar = this.downstream;
            io.reactivex.internal.b.h hVar = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    boolean z = this.done;
                    try {
                        Object poll = hVar.poll();
                        boolean z2 = poll == null;
                        if (!a(z, z2, cVar)) {
                            if (z2) {
                                break;
                            }
                            cVar.onNext(poll);
                            j++;
                            if (j == ((long) this.limit)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.requested.addAndGet(-j);
                                }
                                this.upstream.request(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.ad(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        hVar.clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j != j2 || !a(this.done, hVar.isEmpty(), cVar)) {
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void blP() {
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public T poll() {
            Object poll = this.queue.poll();
            if (!(poll == null || this.sourceMode == 1)) {
                long j = this.produced + 1;
                if (j == ((long) this.limit)) {
                    this.produced = 0;
                    this.upstream.request(j);
                } else {
                    this.produced = j;
                }
            }
            return poll;
        }
    }

    public FlowableObserveOn(io.reactivex.e<T> eVar, o oVar, boolean z, int i) {
        super(eVar);
        this.scheduler = oVar;
        this.delayError = z;
        this.prefetch = i;
    }

    public void a(org.a.c<? super T> cVar) {
        c blk = this.scheduler.blk();
        if (cVar instanceof io.reactivex.internal.b.a) {
            this.eRc.a(new ObserveOnConditionalSubscriber((io.reactivex.internal.b.a) cVar, blk, this.delayError, this.prefetch));
        } else {
            this.eRc.a(new ObserveOnSubscriber(cVar, blk, this.delayError, this.prefetch));
        }
    }
}
