package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.o;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: IoScheduler */
public final class d extends o {
    static final RxThreadFactory eTi;
    static final RxThreadFactory eTj;
    private static final long eTk = Long.getLong("rx2.io-keep-alive-time", 60).longValue();
    private static final TimeUnit eTl = TimeUnit.SECONDS;
    static final c eTm = new c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
    static final a eTn = new a(0, null, eTi);
    final ThreadFactory eNI;
    final AtomicReference<a> eSQ;

    /* compiled from: IoScheduler */
    static final class a implements Runnable {
        private final ThreadFactory eNI;
        private final long eTo;
        private final ConcurrentLinkedQueue<c> eTp;
        final io.reactivex.disposables.a eTq;
        private final ScheduledExecutorService eTr;
        private final Future<?> eTs;

        a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            Future scheduleWithFixedDelay;
            this.eTo = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.eTp = new ConcurrentLinkedQueue();
            this.eTq = new io.reactivex.disposables.a();
            this.eNI = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, d.eTj);
                long j2 = this.eTo;
                scheduleWithFixedDelay = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduleWithFixedDelay = null;
            }
            this.eTr = scheduledExecutorService;
            this.eTs = scheduleWithFixedDelay;
        }

        public void run() {
            bmp();
        }

        /* Access modifiers changed, original: 0000 */
        public c bmo() {
            if (this.eTq.isDisposed()) {
                return d.eTm;
            }
            c cVar;
            while (!this.eTp.isEmpty()) {
                cVar = (c) this.eTp.poll();
                if (cVar != null) {
                    return cVar;
                }
            }
            cVar = new c(this.eNI);
            this.eTq.e(cVar);
            return cVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void a(c cVar) {
            cVar.da(bmq() + this.eTo);
            this.eTp.offer(cVar);
        }

        /* Access modifiers changed, original: 0000 */
        public void bmp() {
            if (!this.eTp.isEmpty()) {
                long bmq = bmq();
                Iterator it = this.eTp.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.abj() > bmq) {
                        return;
                    }
                    if (this.eTp.remove(cVar)) {
                        this.eTq.f(cVar);
                    }
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public long bmq() {
            return System.nanoTime();
        }

        /* Access modifiers changed, original: 0000 */
        public void shutdown() {
            this.eTq.dispose();
            Future future = this.eTs;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.eTr;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    /* compiled from: IoScheduler */
    static final class b extends io.reactivex.o.c {
        private final io.reactivex.disposables.a eTc;
        private final a eTt;
        private final c eTu;
        final AtomicBoolean once = new AtomicBoolean();

        b(a aVar) {
            this.eTt = aVar;
            this.eTc = new io.reactivex.disposables.a();
            this.eTu = aVar.bmo();
        }

        public void dispose() {
            if (this.once.compareAndSet(false, true)) {
                this.eTc.dispose();
                this.eTt.a(this.eTu);
            }
        }

        public boolean isDisposed() {
            return this.once.get();
        }

        public io.reactivex.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.eTc.isDisposed()) {
                return EmptyDisposable.INSTANCE;
            }
            return this.eTu.a(runnable, j, timeUnit, this.eTc);
        }
    }

    /* compiled from: IoScheduler */
    static final class c extends f {
        private long bpd = 0;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        public long abj() {
            return this.bpd;
        }

        public void da(long j) {
            this.bpd = j;
        }
    }

    static {
        eTm.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        eTi = new RxThreadFactory("RxCachedThreadScheduler", max);
        eTj = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        eTn.shutdown();
    }

    public d() {
        this(eTi);
    }

    public d(ThreadFactory threadFactory) {
        this.eNI = threadFactory;
        this.eSQ = new AtomicReference(eTn);
        start();
    }

    public void start() {
        a aVar = new a(eTk, eTl, this.eNI);
        if (!this.eSQ.compareAndSet(eTn, aVar)) {
            aVar.shutdown();
        }
    }

    public io.reactivex.o.c blk() {
        return new b((a) this.eSQ.get());
    }
}
