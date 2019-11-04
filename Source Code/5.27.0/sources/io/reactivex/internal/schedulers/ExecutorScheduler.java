package io.reactivex.internal.schedulers;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.o;
import io.reactivex.o.c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ExecutorScheduler extends o {
    static final o eSY = io.reactivex.d.a.bmO();
    final boolean eSX;
    final Executor executor;

    final class a implements Runnable {
        private final DelayedRunnable eSZ;

        a(DelayedRunnable delayedRunnable) {
            this.eSZ = delayedRunnable;
        }

        public void run() {
            this.eSZ.direct.j(ExecutorScheduler.this.m(this.eSZ));
        }
    }

    static final class DelayedRunnable extends AtomicReference<Runnable> implements b, Runnable {
        private static final long serialVersionUID = -4101336210206799084L;
        final SequentialDisposable direct = new SequentialDisposable();
        final SequentialDisposable timed = new SequentialDisposable();

        DelayedRunnable(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    Object obj = null;
                    lazySet(null);
                    this.timed.lazySet(DisposableHelper.DISPOSED);
                    this.direct.lazySet(DisposableHelper.DISPOSED);
                }
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }

        public void dispose() {
            if (getAndSet(null) != null) {
                this.timed.dispose();
                this.direct.dispose();
            }
        }
    }

    public static final class ExecutorWorker extends c implements Runnable {
        volatile boolean eQm;
        final boolean eSX;
        final MpscLinkedQueue<Runnable> eTb;
        final io.reactivex.disposables.a eTc = new io.reactivex.disposables.a();
        final Executor executor;
        final AtomicInteger wip = new AtomicInteger();

        final class a implements Runnable {
            private final Runnable eQk;
            private final SequentialDisposable eTd;

            a(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.eTd = sequentialDisposable;
                this.eQk = runnable;
            }

            public void run() {
                this.eTd.j(ExecutorWorker.this.n(this.eQk));
            }
        }

        static final class BooleanRunnable extends AtomicBoolean implements b, Runnable {
            private static final long serialVersionUID = -2421395018820541164L;
            final Runnable actual;

            BooleanRunnable(Runnable runnable) {
                this.actual = runnable;
            }

            public void run() {
                if (!get()) {
                    try {
                        this.actual.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }

            public void dispose() {
                lazySet(true);
            }

            public boolean isDisposed() {
                return get();
            }
        }

        static final class InterruptibleRunnable extends AtomicInteger implements b, Runnable {
            private static final long serialVersionUID = -3603436687413320876L;
            final Runnable run;
            final io.reactivex.internal.disposables.a tasks;
            volatile Thread thread;

            InterruptibleRunnable(Runnable runnable, io.reactivex.internal.disposables.a aVar) {
                this.run = runnable;
                this.tasks = aVar;
            }

            public void run() {
                if (get() == 0) {
                    this.thread = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.run.run();
                            this.thread = null;
                            if (compareAndSet(1, 2)) {
                                cleanup();
                                return;
                            }
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        } catch (Throwable th) {
                            this.thread = null;
                            if (compareAndSet(1, 2)) {
                                cleanup();
                            } else {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            }
                        }
                    } else {
                        this.thread = null;
                    }
                }
            }

            public void dispose() {
                while (true) {
                    int i = get();
                    if (i < 2) {
                        if (i == 0) {
                            if (compareAndSet(0, 4)) {
                                cleanup();
                                return;
                            }
                        } else if (compareAndSet(1, 3)) {
                            Thread thread = this.thread;
                            if (thread != null) {
                                thread.interrupt();
                                this.thread = null;
                            }
                            set(4);
                            cleanup();
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }

            /* Access modifiers changed, original: 0000 */
            public void cleanup() {
                io.reactivex.internal.disposables.a aVar = this.tasks;
                if (aVar != null) {
                    aVar.g(this);
                }
            }

            public boolean isDisposed() {
                return get() >= 2;
            }
        }

        public ExecutorWorker(Executor executor, boolean z) {
            this.executor = executor;
            this.eTb = new MpscLinkedQueue();
            this.eSX = z;
        }

        public b n(Runnable runnable) {
            if (this.eQm) {
                return EmptyDisposable.INSTANCE;
            }
            Object interruptibleRunnable;
            runnable = io.reactivex.c.a.q(runnable);
            if (this.eSX) {
                interruptibleRunnable = new InterruptibleRunnable(runnable, this.eTc);
                this.eTc.e(interruptibleRunnable);
            } else {
                interruptibleRunnable = new BooleanRunnable(runnable);
            }
            this.eTb.offer(interruptibleRunnable);
            if (this.wip.getAndIncrement() == 0) {
                try {
                    this.executor.execute(this);
                } catch (RejectedExecutionException e) {
                    this.eQm = true;
                    this.eTb.clear();
                    io.reactivex.c.a.onError(e);
                    return EmptyDisposable.INSTANCE;
                }
            }
            return interruptibleRunnable;
        }

        public b c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return n(runnable);
            }
            if (this.eQm) {
                return EmptyDisposable.INSTANCE;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new a(sequentialDisposable2, io.reactivex.c.a.q(runnable)), this.eTc);
            this.eTc.e(scheduledRunnable);
            Executor executor = this.executor;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.f(((ScheduledExecutorService) executor).schedule(scheduledRunnable, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.eQm = true;
                    io.reactivex.c.a.onError(e);
                    return EmptyDisposable.INSTANCE;
                }
            }
            scheduledRunnable.f(new b(ExecutorScheduler.eSY.b(scheduledRunnable, j, timeUnit)));
            sequentialDisposable.j(scheduledRunnable);
            return sequentialDisposable2;
        }

        public void dispose() {
            if (!this.eQm) {
                this.eQm = true;
                this.eTc.dispose();
                if (this.wip.getAndIncrement() == 0) {
                    this.eTb.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.eQm;
        }

        /* JADX WARNING: Missing block: B:8:0x0015, code skipped:
            if (r3.eQm == false) goto L_0x001b;
     */
        /* JADX WARNING: Missing block: B:9:0x0017, code skipped:
            r0.clear();
     */
        /* JADX WARNING: Missing block: B:10:0x001a, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:11:0x001b, code skipped:
            r1 = r3.wip.addAndGet(-r1);
     */
        /* JADX WARNING: Missing block: B:12:0x0022, code skipped:
            if (r1 != 0) goto L_0x0003;
     */
        /* JADX WARNING: Missing block: B:13:0x0024, code skipped:
            return;
     */
        public void run() {
            /*
            r3 = this;
            r0 = r3.eTb;
            r1 = 1;
        L_0x0003:
            r2 = r3.eQm;
            if (r2 == 0) goto L_0x000b;
        L_0x0007:
            r0.clear();
            return;
        L_0x000b:
            r2 = r0.poll();
            r2 = (java.lang.Runnable) r2;
            if (r2 != 0) goto L_0x0025;
        L_0x0013:
            r2 = r3.eQm;
            if (r2 == 0) goto L_0x001b;
        L_0x0017:
            r0.clear();
            return;
        L_0x001b:
            r2 = r3.wip;
            r1 = -r1;
            r1 = r2.addAndGet(r1);
            if (r1 != 0) goto L_0x0003;
        L_0x0024:
            return;
        L_0x0025:
            r2.run();
            r2 = r3.eQm;
            if (r2 == 0) goto L_0x000b;
        L_0x002c:
            r0.clear();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker.run():void");
        }
    }

    public ExecutorScheduler(Executor executor, boolean z) {
        this.executor = executor;
        this.eSX = z;
    }

    public c blk() {
        return new ExecutorWorker(this.executor, this.eSX);
    }

    public b m(Runnable runnable) {
        runnable = io.reactivex.c.a.q(runnable);
        try {
            if (this.executor instanceof ExecutorService) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
                scheduledDirectTask.f(((ExecutorService) this.executor).submit(scheduledDirectTask));
                return scheduledDirectTask;
            } else if (this.eSX) {
                InterruptibleRunnable interruptibleRunnable = new InterruptibleRunnable(runnable, null);
                this.executor.execute(interruptibleRunnable);
                return interruptibleRunnable;
            } else {
                BooleanRunnable booleanRunnable = new BooleanRunnable(runnable);
                this.executor.execute(booleanRunnable);
                return booleanRunnable;
            }
        } catch (RejectedExecutionException e) {
            io.reactivex.c.a.onError(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    public b b(Runnable runnable, long j, TimeUnit timeUnit) {
        runnable = io.reactivex.c.a.q(runnable);
        if (this.executor instanceof ScheduledExecutorService) {
            try {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
                scheduledDirectTask.f(((ScheduledExecutorService) this.executor).schedule(scheduledDirectTask, j, timeUnit));
                return scheduledDirectTask;
            } catch (RejectedExecutionException e) {
                io.reactivex.c.a.onError(e);
                return EmptyDisposable.INSTANCE;
            }
        }
        DelayedRunnable delayedRunnable = new DelayedRunnable(runnable);
        delayedRunnable.timed.j(eSY.b(new a(delayedRunnable), j, timeUnit));
        return delayedRunnable;
    }

    public b c(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.executor instanceof ScheduledExecutorService)) {
            return super.c(runnable, j, j2, timeUnit);
        }
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(io.reactivex.c.a.q(runnable));
            scheduledDirectPeriodicTask.f(((ScheduledExecutorService) this.executor).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e) {
            io.reactivex.c.a.onError(e);
            return EmptyDisposable.INSTANCE;
        }
    }
}
