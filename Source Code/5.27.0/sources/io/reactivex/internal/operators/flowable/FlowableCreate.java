package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureStrategy;
import io.reactivex.c.a;
import io.reactivex.e;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.f;
import io.reactivex.g;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class FlowableCreate<T> extends e<T> {
    final g<T> eRt;
    final BackpressureStrategy eRu;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] eQi = new int[BackpressureStrategy.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = io.reactivex.BackpressureStrategy.values();
            r0 = r0.length;
            r0 = new int[r0];
            eQi = r0;
            r0 = eQi;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = io.reactivex.BackpressureStrategy.MISSING;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = eQi;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = io.reactivex.BackpressureStrategy.ERROR;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = eQi;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = io.reactivex.BackpressureStrategy.DROP;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = eQi;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = io.reactivex.BackpressureStrategy.LATEST;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableCreate$AnonymousClass1.<clinit>():void");
        }
    }

    static abstract class BaseEmitter<T> extends AtomicLong implements f<T>, d {
        private static final long serialVersionUID = 7326289992464377023L;
        final c<? super T> downstream;
        final SequentialDisposable serial = new SequentialDisposable();

        /* Access modifiers changed, original: 0000 */
        public void blC() {
        }

        /* Access modifiers changed, original: 0000 */
        public void blD() {
        }

        BaseEmitter(c<? super T> cVar) {
            this.downstream = cVar;
        }

        /* Access modifiers changed, original: protected */
        public void complete() {
            if (!isCancelled()) {
                try {
                    this.downstream.onComplete();
                } finally {
                    this.serial.dispose();
                }
            }
        }

        public final void onError(Throwable th) {
            if (!af(th)) {
                a.onError(th);
            }
        }

        public boolean af(Throwable th) {
            return ag(th);
        }

        /* Access modifiers changed, original: protected */
        public boolean ag(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.downstream.onError(th);
                return true;
            } finally {
                this.serial.dispose();
            }
        }

        public final void cancel() {
            this.serial.dispose();
            blC();
        }

        public final boolean isCancelled() {
            return this.serial.isDisposed();
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                b.a(this, j);
                blD();
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }
    }

    static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;
        final io.reactivex.internal.queue.a<T> queue;
        final AtomicInteger wip = new AtomicInteger();

        BufferAsyncEmitter(c<? super T> cVar, int i) {
            super(cVar);
            this.queue = new io.reactivex.internal.queue.a(i);
        }

        public void onNext(T t) {
            if (!(this.done || isCancelled())) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.queue.offer(t);
                    drain();
                }
            }
        }

        public boolean af(Throwable th) {
            if (this.done || isCancelled()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.error = th;
            this.done = true;
            drain();
            return true;
        }

        /* Access modifiers changed, original: 0000 */
        public void blD() {
            drain();
        }

        /* Access modifiers changed, original: 0000 */
        public void blC() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void drain() {
            if (this.wip.getAndIncrement() == 0) {
                c cVar = this.downstream;
                io.reactivex.internal.queue.a aVar = this.queue;
                int i = 1;
                do {
                    Throwable th;
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (isCancelled()) {
                            aVar.clear();
                            return;
                        }
                        boolean z = this.done;
                        Object poll = aVar.poll();
                        Object obj = poll == null ? 1 : null;
                        if (z && obj != null) {
                            th = this.error;
                            if (th != null) {
                                ag(th);
                            } else {
                                complete();
                            }
                            return;
                        } else if (obj != null) {
                            break;
                        } else {
                            cVar.onNext(poll);
                            j2++;
                        }
                    }
                    if (j2 == j) {
                        if (isCancelled()) {
                            aVar.clear();
                            return;
                        }
                        boolean z2 = this.done;
                        boolean isEmpty = aVar.isEmpty();
                        if (z2 && isEmpty) {
                            th = this.error;
                            if (th != null) {
                                ag(th);
                            } else {
                                complete();
                            }
                            return;
                        }
                    }
                    if (j2 != 0) {
                        b.c(this, j2);
                    }
                    i = this.wip.addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;
        final AtomicReference<T> queue = new AtomicReference();
        final AtomicInteger wip = new AtomicInteger();

        LatestAsyncEmitter(c<? super T> cVar) {
            super(cVar);
        }

        public void onNext(T t) {
            if (!(this.done || isCancelled())) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.queue.set(t);
                    drain();
                }
            }
        }

        public boolean af(Throwable th) {
            if (this.done || isCancelled()) {
                return false;
            }
            if (th == null) {
                onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.error = th;
            this.done = true;
            drain();
            return true;
        }

        /* Access modifiers changed, original: 0000 */
        public void blD() {
            drain();
        }

        /* Access modifiers changed, original: 0000 */
        public void blC() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void drain() {
            if (this.wip.getAndIncrement() == 0) {
                c cVar = this.downstream;
                AtomicReference atomicReference = this.queue;
                int i = 1;
                do {
                    Object obj;
                    Throwable th;
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        obj = null;
                        if (j2 == j) {
                            break;
                        } else if (isCancelled()) {
                            atomicReference.lazySet(null);
                            return;
                        } else {
                            boolean z = this.done;
                            Object andSet = atomicReference.getAndSet(null);
                            Object obj2 = andSet == null ? 1 : null;
                            if (z && obj2 != null) {
                                th = this.error;
                                if (th != null) {
                                    ag(th);
                                } else {
                                    complete();
                                }
                                return;
                            } else if (obj2 != null) {
                                break;
                            } else {
                                cVar.onNext(andSet);
                                j2++;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (isCancelled()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z2 = this.done;
                        if (atomicReference.get() == null) {
                            obj = 1;
                        }
                        if (z2 && obj != null) {
                            th = this.error;
                            if (th != null) {
                                ag(th);
                            } else {
                                complete();
                            }
                            return;
                        }
                    }
                    if (j2 != 0) {
                        b.c(this, j2);
                    }
                    i = this.wip.addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    static final class MissingEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        MissingEmitter(c<? super T> cVar) {
            super(cVar);
        }

        public void onNext(T t) {
            if (!isCancelled()) {
                if (t != null) {
                    this.downstream.onNext(t);
                    long j;
                    do {
                        j = get();
                        if (j == 0) {
                            break;
                        }
                    } while (!compareAndSet(j, j - 1));
                    return;
                }
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
        }
    }

    static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public abstract void blE();

        NoOverflowBaseAsyncEmitter(c<? super T> cVar) {
            super(cVar);
        }

        public final void onNext(T t) {
            if (!isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                if (get() != 0) {
                    this.downstream.onNext(t);
                    b.c(this, 1);
                } else {
                    blE();
                }
            }
        }
    }

    static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        /* Access modifiers changed, original: 0000 */
        public void blE() {
        }

        DropAsyncEmitter(c<? super T> cVar) {
            super(cVar);
        }
    }

    static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        ErrorAsyncEmitter(c<? super T> cVar) {
            super(cVar);
        }

        /* Access modifiers changed, original: 0000 */
        public void blE() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    public FlowableCreate(g<T> gVar, BackpressureStrategy backpressureStrategy) {
        this.eRt = gVar;
        this.eRu = backpressureStrategy;
    }

    public void a(c<? super T> cVar) {
        d missingEmitter;
        int i = AnonymousClass1.eQi[this.eRu.ordinal()];
        if (i == 1) {
            missingEmitter = new MissingEmitter(cVar);
        } else if (i == 2) {
            missingEmitter = new ErrorAsyncEmitter(cVar);
        } else if (i == 3) {
            missingEmitter = new DropAsyncEmitter(cVar);
        } else if (i != 4) {
            missingEmitter = new BufferAsyncEmitter(cVar, e.bkP());
        } else {
            missingEmitter = new LatestAsyncEmitter(cVar);
        }
        cVar.onSubscribe(missingEmitter);
        try {
            this.eRt.a(missingEmitter);
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            missingEmitter.onError(th);
        }
    }
}
