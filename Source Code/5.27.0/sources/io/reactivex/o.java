package io.reactivex;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.f;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;

/* compiled from: Scheduler */
public abstract class o {
    static final long eQj = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* compiled from: Scheduler */
    static final class a implements io.reactivex.disposables.b, Runnable {
        final Runnable eQk;
        final c eQl;
        Thread runner;

        a(Runnable runnable, c cVar) {
            this.eQk = runnable;
            this.eQl = cVar;
        }

        public void run() {
            this.runner = Thread.currentThread();
            try {
                this.eQk.run();
            } finally {
                dispose();
                this.runner = null;
            }
        }

        public void dispose() {
            if (this.runner == Thread.currentThread()) {
                c cVar = this.eQl;
                if (cVar instanceof f) {
                    ((f) cVar).shutdown();
                    return;
                }
            }
            this.eQl.dispose();
        }

        public boolean isDisposed() {
            return this.eQl.isDisposed();
        }
    }

    /* compiled from: Scheduler */
    static final class b implements io.reactivex.disposables.b, Runnable {
        volatile boolean eQm;
        final Runnable run;
        final c worker;

        b(Runnable runnable, c cVar) {
            this.run = runnable;
            this.worker = cVar;
        }

        public void run() {
            if (!this.eQm) {
                try {
                    this.run.run();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.ad(th);
                    this.worker.dispose();
                    RuntimeException aj = ExceptionHelper.aj(th);
                }
            }
        }

        public void dispose() {
            this.eQm = true;
            this.worker.dispose();
        }

        public boolean isDisposed() {
            return this.eQm;
        }
    }

    /* compiled from: Scheduler */
    public static abstract class c implements io.reactivex.disposables.b {

        /* compiled from: Scheduler */
        final class a implements Runnable {
            long count;
            final Runnable eQk;
            final SequentialDisposable eQn;
            final long eQo;
            long eQp;
            long eQq;

            a(long j, Runnable runnable, long j2, SequentialDisposable sequentialDisposable, long j3) {
                this.eQk = runnable;
                this.eQn = sequentialDisposable;
                this.eQo = j3;
                this.eQp = j2;
                this.eQq = j;
            }

            public void run() {
                this.eQk.run();
                if (!this.eQn.isDisposed()) {
                    long c = c.this.c(TimeUnit.NANOSECONDS);
                    long j = o.eQj + c;
                    long j2 = this.eQp;
                    if (j < j2 || c >= (j2 + this.eQo) + o.eQj) {
                        j = this.eQo;
                        j2 = c + j;
                        long j3 = this.count + 1;
                        this.count = j3;
                        this.eQq = j2 - (j * j3);
                        j = j2;
                    } else {
                        j = this.eQq;
                        j2 = this.count + 1;
                        this.count = j2;
                        j += j2 * this.eQo;
                    }
                    this.eQp = c;
                    this.eQn.j(c.this.c(this, j - c, TimeUnit.NANOSECONDS));
                }
            }
        }

        public abstract io.reactivex.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit);

        public io.reactivex.disposables.b n(Runnable runnable) {
            return c(runnable, 0, TimeUnit.NANOSECONDS);
        }

        public io.reactivex.disposables.b d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable q = io.reactivex.c.a.q(runnable);
            long toNanos = timeUnit2.toNanos(j2);
            long c = c(TimeUnit.NANOSECONDS);
            SequentialDisposable sequentialDisposable3 = sequentialDisposable;
            a aVar = r0;
            a aVar2 = new a(c + timeUnit2.toNanos(j3), q, c, sequentialDisposable2, toNanos);
            io.reactivex.disposables.b c2 = c(aVar, j3, timeUnit2);
            if (c2 == EmptyDisposable.INSTANCE) {
                return c2;
            }
            sequentialDisposable3.j(c2);
            return sequentialDisposable2;
        }

        public long c(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
    }

    public abstract c blk();

    public void start() {
    }

    public io.reactivex.disposables.b m(Runnable runnable) {
        return b(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public io.reactivex.disposables.b b(Runnable runnable, long j, TimeUnit timeUnit) {
        c blk = blk();
        a aVar = new a(io.reactivex.c.a.q(runnable), blk);
        blk.c(aVar, j, timeUnit);
        return aVar;
    }

    public io.reactivex.disposables.b c(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        c blk = blk();
        b bVar = new b(io.reactivex.c.a.q(runnable), blk);
        io.reactivex.disposables.b d = blk.d(bVar, j, j2, timeUnit);
        return d == EmptyDisposable.INSTANCE ? d : bVar;
    }
}
