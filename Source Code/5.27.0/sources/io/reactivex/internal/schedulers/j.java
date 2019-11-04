package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.o;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: TrampolineScheduler */
public final class j extends o {
    private static final j eTI = new j();

    /* compiled from: TrampolineScheduler */
    static final class a implements Runnable {
        private final c eTJ;
        private final long eTK;
        private final Runnable run;

        a(Runnable runnable, c cVar, long j) {
            this.run = runnable;
            this.eTJ = cVar;
            this.eTK = j;
        }

        public void run() {
            if (!this.eTJ.eQm) {
                long c = this.eTJ.c(TimeUnit.MILLISECONDS);
                long j = this.eTK;
                if (j > c) {
                    try {
                        Thread.sleep(j - c);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        io.reactivex.c.a.onError(e);
                        return;
                    }
                }
                if (!this.eTJ.eQm) {
                    this.run.run();
                }
            }
        }
    }

    /* compiled from: TrampolineScheduler */
    static final class b implements Comparable<b> {
        final int count;
        volatile boolean eQm;
        final long eTK;
        final Runnable run;

        b(Runnable runnable, Long l, int i) {
            this.run = runnable;
            this.eTK = l.longValue();
            this.count = i;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            int compare = io.reactivex.internal.a.b.compare(this.eTK, bVar.eTK);
            return compare == 0 ? io.reactivex.internal.a.b.compare(this.count, bVar.count) : compare;
        }
    }

    /* compiled from: TrampolineScheduler */
    static final class c extends io.reactivex.o.c implements io.reactivex.disposables.b {
        volatile boolean eQm;
        final PriorityBlockingQueue<b> eTL = new PriorityBlockingQueue();
        final AtomicInteger tN = new AtomicInteger();
        private final AtomicInteger wip = new AtomicInteger();

        /* compiled from: TrampolineScheduler */
        final class a implements Runnable {
            final b eTM;

            a(b bVar) {
                this.eTM = bVar;
            }

            public void run() {
                this.eTM.eQm = true;
                c.this.eTL.remove(this.eTM);
            }
        }

        c() {
        }

        public io.reactivex.disposables.b n(Runnable runnable) {
            return c(runnable, c(TimeUnit.MILLISECONDS));
        }

        public io.reactivex.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
            long c = c(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return c(new a(runnable, this, c), c);
        }

        /* Access modifiers changed, original: 0000 */
        public io.reactivex.disposables.b c(Runnable runnable, long j) {
            if (this.eQm) {
                return EmptyDisposable.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j), this.tN.incrementAndGet());
            this.eTL.add(bVar);
            if (this.wip.getAndIncrement() != 0) {
                return io.reactivex.disposables.c.o(new a(bVar));
            }
            int i = 1;
            while (!this.eQm) {
                b bVar2 = (b) this.eTL.poll();
                if (bVar2 == null) {
                    i = this.wip.addAndGet(-i);
                    if (i == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!bVar2.eQm) {
                    bVar2.run.run();
                }
            }
            this.eTL.clear();
            return EmptyDisposable.INSTANCE;
        }

        public void dispose() {
            this.eQm = true;
        }

        public boolean isDisposed() {
            return this.eQm;
        }
    }

    public static j bmr() {
        return eTI;
    }

    public io.reactivex.o.c blk() {
        return new c();
    }

    j() {
    }

    public io.reactivex.disposables.b m(Runnable runnable) {
        io.reactivex.c.a.q(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    public io.reactivex.disposables.b b(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            io.reactivex.c.a.q(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            io.reactivex.c.a.onError(e);
        }
        return EmptyDisposable.INSTANCE;
    }
}
