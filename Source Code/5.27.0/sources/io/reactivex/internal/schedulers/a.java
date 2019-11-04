package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.o;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ComputationScheduler */
public final class a extends o {
    static final b eSM = new b(0, eSN);
    static final RxThreadFactory eSN = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
    static final int eSO = bb(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());
    static final c eSP = new c(new RxThreadFactory("RxComputationShutdown"));
    final ThreadFactory eNI;
    final AtomicReference<b> eSQ;

    /* compiled from: ComputationScheduler */
    static final class b {
        long eRW;
        final int eSV;
        final c[] eSW;

        b(int i, ThreadFactory threadFactory) {
            this.eSV = i;
            this.eSW = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.eSW[i2] = new c(threadFactory);
            }
        }

        public c bmn() {
            int i = this.eSV;
            if (i == 0) {
                return a.eSP;
            }
            c[] cVarArr = this.eSW;
            long j = this.eRW;
            this.eRW = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        public void shutdown() {
            for (c dispose : this.eSW) {
                dispose.dispose();
            }
        }
    }

    /* compiled from: ComputationScheduler */
    static final class a extends io.reactivex.o.c {
        volatile boolean eQm;
        private final io.reactivex.internal.disposables.b eSR = new io.reactivex.internal.disposables.b();
        private final io.reactivex.disposables.a eSS = new io.reactivex.disposables.a();
        private final io.reactivex.internal.disposables.b eST = new io.reactivex.internal.disposables.b();
        private final c eSU;

        a(c cVar) {
            this.eSU = cVar;
            this.eST.e(this.eSR);
            this.eST.e(this.eSS);
        }

        public void dispose() {
            if (!this.eQm) {
                this.eQm = true;
                this.eST.dispose();
            }
        }

        public boolean isDisposed() {
            return this.eQm;
        }

        public io.reactivex.disposables.b n(Runnable runnable) {
            if (this.eQm) {
                return EmptyDisposable.INSTANCE;
            }
            return this.eSU.a(runnable, 0, TimeUnit.MILLISECONDS, this.eSR);
        }

        public io.reactivex.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.eQm) {
                return EmptyDisposable.INSTANCE;
            }
            return this.eSU.a(runnable, j, timeUnit, this.eSS);
        }
    }

    /* compiled from: ComputationScheduler */
    static final class c extends f {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static int bb(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    static {
        eSP.dispose();
        eSM.shutdown();
    }

    public a() {
        this(eSN);
    }

    public a(ThreadFactory threadFactory) {
        this.eNI = threadFactory;
        this.eSQ = new AtomicReference(eSM);
        start();
    }

    public io.reactivex.o.c blk() {
        return new a(((b) this.eSQ.get()).bmn());
    }

    public io.reactivex.disposables.b b(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((b) this.eSQ.get()).bmn().b(runnable, j, timeUnit);
    }

    public io.reactivex.disposables.b c(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((b) this.eSQ.get()).bmn().c(runnable, j, j2, timeUnit);
    }

    public void start() {
        b bVar = new b(eSO, this.eNI);
        if (!this.eSQ.compareAndSet(eSM, bVar)) {
            bVar.shutdown();
        }
    }
}
