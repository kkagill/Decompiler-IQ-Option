package io.reactivex.internal.operators.flowable;

import io.reactivex.b.g;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.a;
import io.reactivex.h;
import io.reactivex.internal.b.e;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableFlatMap<T, U> extends a<T, U> {
    final int bufferSize;
    final boolean delayErrors;
    final g<? super T, ? extends b<? extends U>> mapper;
    final int maxConcurrency;

    static final class InnerSubscriber<T, U> extends AtomicReference<d> implements io.reactivex.disposables.b, h<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long id;
        final int limit = (this.bufferSize >> 2);
        final MergeSubscriber<T, U> parent;
        long produced;
        volatile io.reactivex.internal.b.h<U> queue;

        InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j) {
            this.id = j;
            this.parent = mergeSubscriber;
            this.bufferSize = mergeSubscriber.bufferSize;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this, dVar)) {
                if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    int requestFusion = eVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = eVar;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = eVar;
                    }
                }
                dVar.request((long) this.bufferSize);
            }
        }

        public void onNext(U u) {
            if (this.fusionMode != 2) {
                this.parent.a((Object) u, this);
            } else {
                this.parent.drain();
            }
        }

        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.a(this, th);
        }

        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        /* Access modifiers changed, original: 0000 */
        public void cS(long j) {
            if (this.fusionMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= ((long) this.limit)) {
                    this.produced = 0;
                    ((d) get()).request(j2);
                    return;
                }
                this.produced = j2;
            }
        }

        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }
    }

    static final class MergeSubscriber<T, U> extends AtomicInteger implements h<T>, d {
        static final InnerSubscriber<?, ?>[] eRG = new InnerSubscriber[0];
        static final InnerSubscriber<?, ?>[] eRH = new InnerSubscriber[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final c<? super U> downstream;
        final AtomicThrowable errs = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final g<? super T, ? extends b<? extends U>> mapper;
        final int maxConcurrency;
        volatile io.reactivex.internal.b.g<U> queue;
        final AtomicLong requested = new AtomicLong();
        int scalarEmitted;
        final int scalarLimit;
        final AtomicReference<InnerSubscriber<?, ?>[]> subscribers = new AtomicReference();
        long uniqueId;
        d upstream;

        MergeSubscriber(c<? super U> cVar, g<? super T, ? extends b<? extends U>> gVar, boolean z, int i, int i2) {
            this.downstream = cVar;
            this.mapper = gVar;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            this.scalarLimit = Math.max(1, i >> 1);
            this.subscribers.lazySet(eRG);
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (!this.cancelled) {
                    int i = this.maxConcurrency;
                    if (i == Integer.MAX_VALUE) {
                        dVar.request(Long.MAX_VALUE);
                    } else {
                        dVar.request((long) i);
                    }
                }
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                try {
                    b bVar = (b) io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(t), "The mapper returned a null Publisher");
                    if (bVar instanceof Callable) {
                        try {
                            Object call = ((Callable) bVar).call();
                            if (call != null) {
                                cP(call);
                            } else if (!(this.maxConcurrency == Integer.MAX_VALUE || this.cancelled)) {
                                int i = this.scalarEmitted + 1;
                                this.scalarEmitted = i;
                                int i2 = this.scalarLimit;
                                if (i == i2) {
                                    this.scalarEmitted = 0;
                                    this.upstream.request((long) i2);
                                }
                            }
                        } catch (Throwable th) {
                            a.ad(th);
                            this.errs.ai(th);
                            drain();
                            return;
                        }
                    }
                    long j = this.uniqueId;
                    this.uniqueId = 1 + j;
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this, j);
                    if (a(innerSubscriber)) {
                        bVar.subscribe(innerSubscriber);
                    }
                } catch (Throwable th2) {
                    a.ad(th2);
                    this.upstream.cancel();
                    onError(th2);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
                if (innerSubscriberArr == eRH) {
                    innerSubscriber.dispose();
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new InnerSubscriber[(length + 1)];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        /* Access modifiers changed, original: 0000 */
        public void b(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber[] innerSubscriberArr;
            Object obj;
            do {
                innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length != 0) {
                    int i = -1;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (innerSubscriberArr[i2] == innerSubscriber) {
                            i = i2;
                            break;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = eRG;
                        } else {
                            Object obj2 = new InnerSubscriber[(length - 1)];
                            System.arraycopy(innerSubscriberArr, 0, obj2, 0, i);
                            System.arraycopy(innerSubscriberArr, i + 1, obj2, i, (length - i) - 1);
                            obj = obj2;
                        }
                    } else {
                        return;
                    }
                }
                return;
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, obj));
        }

        /* Access modifiers changed, original: 0000 */
        public io.reactivex.internal.b.h<U> blH() {
            io.reactivex.internal.b.h<U> hVar = this.queue;
            if (hVar == null) {
                int i = this.maxConcurrency;
                if (i == Integer.MAX_VALUE) {
                    hVar = new io.reactivex.internal.queue.a(this.bufferSize);
                } else {
                    hVar = new SpscArrayQueue(i);
                }
                this.queue = hVar;
            }
            return hVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void cP(U u) {
            String str = "Scalar queue full?!";
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.requested.get();
                io.reactivex.internal.b.h hVar = this.queue;
                if (j == 0 || !(hVar == null || hVar.isEmpty())) {
                    if (hVar == null) {
                        hVar = blH();
                    }
                    if (!hVar.offer(u)) {
                        onError(new IllegalStateException(str));
                        return;
                    }
                }
                this.downstream.onNext(u);
                if (j != Long.MAX_VALUE) {
                    this.requested.decrementAndGet();
                }
                if (!(this.maxConcurrency == Integer.MAX_VALUE || this.cancelled)) {
                    int i = this.scalarEmitted + 1;
                    this.scalarEmitted = i;
                    int i2 = this.scalarLimit;
                    if (i == i2) {
                        this.scalarEmitted = 0;
                        this.upstream.request((long) i2);
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!blH().offer(u)) {
                onError(new IllegalStateException(str));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            blI();
        }

        /* Access modifiers changed, original: 0000 */
        public io.reactivex.internal.b.h<U> c(InnerSubscriber<T, U> innerSubscriber) {
            io.reactivex.internal.b.h<U> hVar = innerSubscriber.queue;
            if (hVar != null) {
                return hVar;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.bufferSize);
            innerSubscriber.queue = spscArrayQueue;
            return spscArrayQueue;
        }

        /* Access modifiers changed, original: 0000 */
        public void a(U u, InnerSubscriber<T, U> innerSubscriber) {
            String str = "Inner queue full?!";
            io.reactivex.internal.b.h hVar;
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.requested.get();
                hVar = innerSubscriber.queue;
                if (j == 0 || !(hVar == null || hVar.isEmpty())) {
                    if (hVar == null) {
                        hVar = c(innerSubscriber);
                    }
                    if (!hVar.offer(u)) {
                        onError(new MissingBackpressureException(str));
                        return;
                    }
                }
                this.downstream.onNext(u);
                if (j != Long.MAX_VALUE) {
                    this.requested.decrementAndGet();
                }
                innerSubscriber.cS(1);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            hVar = innerSubscriber.queue;
            if (hVar == null) {
                hVar = new SpscArrayQueue(this.bufferSize);
                innerSubscriber.queue = hVar;
            }
            if (!hVar.offer(u)) {
                onError(new MissingBackpressureException(str));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            blI();
        }

        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.c.a.onError(th);
                return;
            }
            if (this.errs.ai(th)) {
                this.done = true;
                drain();
            } else {
                io.reactivex.c.a.onError(th);
            }
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.b.a(this.requested, j);
                drain();
            }
        }

        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                blL();
                if (getAndIncrement() == 0) {
                    io.reactivex.internal.b.g gVar = this.queue;
                    if (gVar != null) {
                        gVar.clear();
                    }
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void drain() {
            if (getAndIncrement() == 0) {
                blI();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void blI() {
            c cVar = this.downstream;
            int i = 1;
            while (!blJ()) {
                long j;
                io.reactivex.internal.b.g gVar = this.queue;
                long j2 = this.requested.get();
                Object obj = j2 == Long.MAX_VALUE ? 1 : null;
                long j3 = 0;
                if (gVar != null) {
                    j = 0;
                    while (true) {
                        long j4 = 0;
                        Object obj2 = null;
                        while (j2 != 0) {
                            Object poll = gVar.poll();
                            if (!blJ()) {
                                if (poll == null) {
                                    obj2 = poll;
                                    break;
                                }
                                cVar.onNext(poll);
                                j++;
                                j4++;
                                j2--;
                                obj2 = poll;
                            } else {
                                return;
                            }
                        }
                        if (j4 != 0) {
                            if (obj != null) {
                                j2 = Long.MAX_VALUE;
                            } else {
                                j2 = this.requested.addAndGet(-j4);
                            }
                        }
                        if (j2 == 0 || r18 == null) {
                            break;
                        }
                    }
                } else {
                    j = 0;
                }
                boolean z = this.done;
                io.reactivex.internal.b.g gVar2 = this.queue;
                InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
                int length = innerSubscriberArr.length;
                Throwable bmB;
                if (z && ((gVar2 == null || gVar2.isEmpty()) && length == 0)) {
                    bmB = this.errs.bmB();
                    if (bmB != ExceptionHelper.eTR) {
                        if (bmB == null) {
                            cVar.onComplete();
                        } else {
                            cVar.onError(bmB);
                        }
                    }
                    return;
                }
                int i2;
                long j5;
                Object obj3;
                if (length != 0) {
                    InnerSubscriber[] innerSubscriberArr2;
                    i2 = i;
                    j5 = this.lastId;
                    int i3 = this.lastIndex;
                    if (length <= i3 || innerSubscriberArr[i3].id != j5) {
                        if (length <= i3) {
                            i3 = 0;
                        }
                        int i4 = i3;
                        for (i3 = 0; i3 < length && innerSubscriberArr[i4].id != j5; i3++) {
                            i4++;
                            if (i4 == length) {
                                i4 = 0;
                            }
                        }
                        this.lastIndex = i4;
                        this.lastId = innerSubscriberArr[i4].id;
                        i3 = i4;
                    }
                    i = i3;
                    obj3 = null;
                    int i5 = 0;
                    while (i5 < length) {
                        if (!blJ()) {
                            InnerSubscriber innerSubscriber = innerSubscriberArr[i];
                            Object obj4 = null;
                            while (!blJ()) {
                                int i6;
                                io.reactivex.internal.b.h hVar = innerSubscriber.queue;
                                if (hVar == null) {
                                    innerSubscriberArr2 = innerSubscriberArr;
                                    i6 = length;
                                } else {
                                    i6 = length;
                                    Object obj5 = obj4;
                                    innerSubscriberArr2 = innerSubscriberArr;
                                    long j6 = j3;
                                    while (j2 != j3) {
                                        try {
                                            Object poll2 = hVar.poll();
                                            if (poll2 == null) {
                                                obj5 = poll2;
                                                j3 = 0;
                                                break;
                                            }
                                            cVar.onNext(poll2);
                                            if (!blJ()) {
                                                j2--;
                                                j6++;
                                                obj5 = poll2;
                                                j3 = 0;
                                            } else {
                                                return;
                                            }
                                        } catch (Throwable bmB2) {
                                            Throwable th = bmB2;
                                            a.ad(th);
                                            innerSubscriber.dispose();
                                            this.errs.ai(th);
                                            if (!this.delayErrors) {
                                                this.upstream.cancel();
                                            }
                                            if (!blJ()) {
                                                b(innerSubscriber);
                                                i5++;
                                                obj3 = 1;
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                    if (j6 != j3) {
                                        j2 = obj == null ? this.requested.addAndGet(-j6) : Long.MAX_VALUE;
                                        innerSubscriber.cS(j6);
                                        j6 = 0;
                                    } else {
                                        j6 = j3;
                                    }
                                    if (!(j2 == j6 || obj5 == null)) {
                                        innerSubscriberArr = innerSubscriberArr2;
                                        length = i6;
                                        obj4 = obj5;
                                        j3 = 0;
                                    }
                                }
                                boolean z2 = innerSubscriber.done;
                                io.reactivex.internal.b.h hVar2 = innerSubscriber.queue;
                                if (z2 && (hVar2 == null || hVar2.isEmpty())) {
                                    b(innerSubscriber);
                                    if (!blJ()) {
                                        j++;
                                        obj3 = 1;
                                    } else {
                                        return;
                                    }
                                }
                                if (j2 == 0) {
                                    break;
                                }
                                length = i + 1;
                                i = length == i6 ? 0 : length;
                                i5++;
                                innerSubscriberArr = innerSubscriberArr2;
                                length = i6;
                                j3 = 0;
                            }
                            return;
                        }
                        return;
                    }
                    innerSubscriberArr2 = innerSubscriberArr;
                    this.lastIndex = i;
                    this.lastId = innerSubscriberArr2[i].id;
                    j5 = j;
                    j2 = 0;
                } else {
                    i2 = i;
                    j2 = 0;
                    j5 = j;
                    obj3 = null;
                }
                if (!(j5 == j2 || this.cancelled)) {
                    this.upstream.request(j5);
                }
                if (obj3 != null) {
                    i = i2;
                } else {
                    i = addAndGet(-i2);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean blJ() {
            if (this.cancelled) {
                blK();
                return true;
            } else if (this.delayErrors || this.errs.get() == null) {
                return false;
            } else {
                blK();
                Throwable bmB = this.errs.bmB();
                if (bmB != ExceptionHelper.eTR) {
                    this.downstream.onError(bmB);
                }
                return true;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void blK() {
            io.reactivex.internal.b.g gVar = this.queue;
            if (gVar != null) {
                gVar.clear();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void blL() {
            InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
            InnerSubscriber[] innerSubscriberArr2 = eRH;
            if (innerSubscriberArr != innerSubscriberArr2) {
                innerSubscriberArr = (InnerSubscriber[]) this.subscribers.getAndSet(innerSubscriberArr2);
                if (innerSubscriberArr != eRH) {
                    for (InnerSubscriber dispose : innerSubscriberArr) {
                        dispose.dispose();
                    }
                    Throwable bmB = this.errs.bmB();
                    if (bmB != null && bmB != ExceptionHelper.eTR) {
                        io.reactivex.c.a.onError(bmB);
                    }
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void a(InnerSubscriber<T, U> innerSubscriber, Throwable th) {
            if (this.errs.ai(th)) {
                innerSubscriber.done = true;
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    for (InnerSubscriber dispose : (InnerSubscriber[]) this.subscribers.getAndSet(eRH)) {
                        dispose.dispose();
                    }
                }
                drain();
                return;
            }
            io.reactivex.c.a.onError(th);
        }
    }

    public FlowableFlatMap(io.reactivex.e<T> eVar, g<? super T, ? extends b<? extends U>> gVar, boolean z, int i, int i2) {
        super(eVar);
        this.mapper = gVar;
        this.delayErrors = z;
        this.maxConcurrency = i;
        this.bufferSize = i2;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super U> cVar) {
        if (!t.a(this.eRc, cVar, this.mapper)) {
            this.eRc.a(a(cVar, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
        }
    }

    public static <T, U> h<T> a(c<? super U> cVar, g<? super T, ? extends b<? extends U>> gVar, boolean z, int i, int i2) {
        return new MergeSubscriber(cVar, gVar, z, i, i2);
    }
}
