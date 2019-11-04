package io.reactivex.internal.operators.flowable;

import io.reactivex.b.g;
import io.reactivex.h;
import io.reactivex.internal.b.e;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.a.c;
import org.a.d;

public final class FlowableConcatMap<T, R> extends a<T, R> {
    final ErrorMode eRr;
    final g<? super T, ? extends org.a.b<? extends R>> mapper;
    final int prefetch;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] eRs = new int[ErrorMode.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = io.reactivex.internal.util.ErrorMode.values();
            r0 = r0.length;
            r0 = new int[r0];
            eRs = r0;
            r0 = eRs;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = io.reactivex.internal.util.ErrorMode.BOUNDARY;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = eRs;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = io.reactivex.internal.util.ErrorMode.END;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableConcatMap$AnonymousClass1.<clinit>():void");
        }
    }

    interface a<T> {
        void ae(Throwable th);

        void blB();

        void cO(T t);
    }

    static final class b<T> implements d {
        final c<? super T> downstream;
        boolean once;
        final T value;

        public void cancel() {
        }

        b(T t, c<? super T> cVar) {
            this.value = t;
            this.downstream = cVar;
        }

        public void request(long j) {
            if (j > 0 && !this.once) {
                this.once = true;
                c cVar = this.downstream;
                cVar.onNext(this.value);
                cVar.onComplete();
            }
        }
    }

    static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements h<T>, a<R>, d {
        private static final long serialVersionUID = -3511336836796789179L;
        volatile boolean active;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapInner<R> inner = new ConcatMapInner(this);
        final int limit;
        final g<? super T, ? extends org.a.b<? extends R>> mapper;
        final int prefetch;
        io.reactivex.internal.b.h<T> queue;
        int sourceMode;
        d upstream;

        public abstract void blA();

        public abstract void drain();

        BaseConcatMapSubscriber(g<? super T, ? extends org.a.b<? extends R>> gVar, int i) {
            this.mapper = gVar;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    int requestFusion = eVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = eVar;
                        this.done = true;
                        blA();
                        drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = eVar;
                        blA();
                        dVar.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                blA();
                dVar.request((long) this.prefetch);
            }
        }

        public final void onNext(T t) {
            if (this.sourceMode == 2 || this.queue.offer(t)) {
                drain();
                return;
            }
            this.upstream.cancel();
            onError(new IllegalStateException("Queue full?!"));
        }

        public final void onComplete() {
            this.done = true;
            drain();
        }

        public final void blB() {
            this.active = false;
            drain();
        }
    }

    static final class ConcatMapInner<R> extends SubscriptionArbiter implements h<R> {
        private static final long serialVersionUID = 897683679971470653L;
        final a<R> parent;
        long produced;

        ConcatMapInner(a<R> aVar) {
            super(false);
            this.parent = aVar;
        }

        public void onSubscribe(d dVar) {
            a(dVar);
        }

        public void onNext(R r) {
            this.produced++;
            this.parent.cO(r);
        }

        public void onError(Throwable th) {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0;
                dc(j);
            }
            this.parent.ae(th);
        }

        public void onComplete() {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0;
                dc(j);
            }
            this.parent.blB();
        }
    }

    static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        final c<? super R> downstream;
        final boolean veryEnd;

        ConcatMapDelayed(c<? super R> cVar, g<? super T, ? extends org.a.b<? extends R>> gVar, int i, boolean z) {
            super(gVar, i);
            this.downstream = cVar;
            this.veryEnd = z;
        }

        /* Access modifiers changed, original: 0000 */
        public void blA() {
            this.downstream.onSubscribe(this);
        }

        public void onError(Throwable th) {
            if (this.errors.ai(th)) {
                this.done = true;
                drain();
                return;
            }
            io.reactivex.c.a.onError(th);
        }

        public void cO(R r) {
            this.downstream.onNext(r);
        }

        public void ae(Throwable th) {
            if (this.errors.ai(th)) {
                if (!this.veryEnd) {
                    this.upstream.cancel();
                    this.done = true;
                }
                this.active = false;
                drain();
                return;
            }
            io.reactivex.c.a.onError(th);
        }

        public void request(long j) {
            this.inner.request(j);
        }

        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.inner.cancel();
                this.upstream.cancel();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void drain() {
            if (getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z = this.done;
                        if (!z || this.veryEnd || ((Throwable) this.errors.get()) == null) {
                            Throwable bmB;
                            try {
                                Object poll = this.queue.poll();
                                Object obj = poll == null ? 1 : null;
                                if (z && obj != null) {
                                    bmB = this.errors.bmB();
                                    if (bmB != null) {
                                        this.downstream.onError(bmB);
                                    } else {
                                        this.downstream.onComplete();
                                    }
                                    return;
                                } else if (obj == null) {
                                    try {
                                        org.a.b bVar = (org.a.b) io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(poll), "The mapper returned a null Publisher");
                                        if (this.sourceMode != 1) {
                                            int i = this.consumed + 1;
                                            if (i == this.limit) {
                                                this.consumed = 0;
                                                this.upstream.request((long) i);
                                            } else {
                                                this.consumed = i;
                                            }
                                        }
                                        if (bVar instanceof Callable) {
                                            try {
                                                Object call = ((Callable) bVar).call();
                                                if (call != null) {
                                                    if (this.inner.bmA()) {
                                                        this.downstream.onNext(call);
                                                    } else {
                                                        this.active = true;
                                                        this.inner.a(new b(call, this.inner));
                                                    }
                                                }
                                            } catch (Throwable bmB2) {
                                                io.reactivex.exceptions.a.ad(bmB2);
                                                this.upstream.cancel();
                                                this.errors.ai(bmB2);
                                                this.downstream.onError(this.errors.bmB());
                                                return;
                                            }
                                        }
                                        this.active = true;
                                        bVar.subscribe(this.inner);
                                    } catch (Throwable bmB22) {
                                        io.reactivex.exceptions.a.ad(bmB22);
                                        this.upstream.cancel();
                                        this.errors.ai(bmB22);
                                        this.downstream.onError(this.errors.bmB());
                                        return;
                                    }
                                }
                            } catch (Throwable bmB222) {
                                io.reactivex.exceptions.a.ad(bmB222);
                                this.upstream.cancel();
                                this.errors.ai(bmB222);
                                this.downstream.onError(this.errors.bmB());
                                return;
                            }
                        }
                        this.downstream.onError(this.errors.bmB());
                        return;
                    }
                    if (decrementAndGet() == 0) {
                    }
                }
            }
        }
    }

    static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        final c<? super R> downstream;
        final AtomicInteger wip = new AtomicInteger();

        ConcatMapImmediate(c<? super R> cVar, g<? super T, ? extends org.a.b<? extends R>> gVar, int i) {
            super(gVar, i);
            this.downstream = cVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void blA() {
            this.downstream.onSubscribe(this);
        }

        public void onError(Throwable th) {
            if (this.errors.ai(th)) {
                this.inner.cancel();
                if (getAndIncrement() == 0) {
                    this.downstream.onError(this.errors.bmB());
                    return;
                }
                return;
            }
            io.reactivex.c.a.onError(th);
        }

        public void cO(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(r);
                if (!compareAndSet(1, 0)) {
                    this.downstream.onError(this.errors.bmB());
                }
            }
        }

        public void ae(Throwable th) {
            if (this.errors.ai(th)) {
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.downstream.onError(this.errors.bmB());
                    return;
                }
                return;
            }
            io.reactivex.c.a.onError(th);
        }

        public void request(long j) {
            this.inner.request(j);
        }

        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.inner.cancel();
                this.upstream.cancel();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void drain() {
            if (this.wip.getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z = this.done;
                        try {
                            Object poll = this.queue.poll();
                            Object obj = poll == null ? 1 : null;
                            if (z && obj != null) {
                                this.downstream.onComplete();
                                return;
                            } else if (obj == null) {
                                try {
                                    org.a.b bVar = (org.a.b) io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(poll), "The mapper returned a null Publisher");
                                    if (this.sourceMode != 1) {
                                        int i = this.consumed + 1;
                                        if (i == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request((long) i);
                                        } else {
                                            this.consumed = i;
                                        }
                                    }
                                    if (bVar instanceof Callable) {
                                        try {
                                            Object call = ((Callable) bVar).call();
                                            if (call != null) {
                                                if (!this.inner.bmA()) {
                                                    this.active = true;
                                                    this.inner.a(new b(call, this.inner));
                                                } else if (get() == 0 && compareAndSet(0, 1)) {
                                                    this.downstream.onNext(call);
                                                    if (!compareAndSet(1, 0)) {
                                                        this.downstream.onError(this.errors.bmB());
                                                        return;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            io.reactivex.exceptions.a.ad(th);
                                            this.upstream.cancel();
                                            this.errors.ai(th);
                                            this.downstream.onError(this.errors.bmB());
                                            return;
                                        }
                                    }
                                    this.active = true;
                                    bVar.subscribe(this.inner);
                                } catch (Throwable th2) {
                                    io.reactivex.exceptions.a.ad(th2);
                                    this.upstream.cancel();
                                    this.errors.ai(th2);
                                    this.downstream.onError(this.errors.bmB());
                                    return;
                                }
                            }
                        } catch (Throwable th22) {
                            io.reactivex.exceptions.a.ad(th22);
                            this.upstream.cancel();
                            this.errors.ai(th22);
                            this.downstream.onError(this.errors.bmB());
                            return;
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                    }
                }
            }
        }
    }

    public FlowableConcatMap(io.reactivex.e<T> eVar, g<? super T, ? extends org.a.b<? extends R>> gVar, int i, ErrorMode errorMode) {
        super(eVar);
        this.mapper = gVar;
        this.prefetch = i;
        this.eRr = errorMode;
    }

    public static <T, R> c<T> a(c<? super R> cVar, g<? super T, ? extends org.a.b<? extends R>> gVar, int i, ErrorMode errorMode) {
        int i2 = AnonymousClass1.eRs[errorMode.ordinal()];
        if (i2 == 1) {
            return new ConcatMapDelayed(cVar, gVar, i, false);
        }
        if (i2 != 2) {
            return new ConcatMapImmediate(cVar, gVar, i);
        }
        return new ConcatMapDelayed(cVar, gVar, i, true);
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super R> cVar) {
        if (!t.a(this.eRc, cVar, this.mapper)) {
            this.eRc.subscribe(a(cVar, this.mapper, this.prefetch, this.eRr));
        }
    }
}
