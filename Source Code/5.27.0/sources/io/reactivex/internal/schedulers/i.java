package io.reactivex.internal.schedulers;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.o;
import io.reactivex.o.c;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleScheduler */
public final class i extends o {
    static final RxThreadFactory eTG = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    static final ScheduledExecutorService eTH = Executors.newScheduledThreadPool(0);
    final ThreadFactory eNI;
    final AtomicReference<ScheduledExecutorService> eTF;

    /* compiled from: SingleScheduler */
    static final class a extends c {
        volatile boolean eQm;
        final io.reactivex.disposables.a eTc = new io.reactivex.disposables.a();
        final ScheduledExecutorService executor;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.executor = scheduledExecutorService;
        }

        public b c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.eQm) {
                return EmptyDisposable.INSTANCE;
            }
            Future submit;
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(io.reactivex.c.a.q(runnable), this.eTc);
            this.eTc.e(scheduledRunnable);
            if (j <= 0) {
                try {
                    submit = this.executor.submit(scheduledRunnable);
                } catch (RejectedExecutionException e) {
                    dispose();
                    io.reactivex.c.a.onError(e);
                    return EmptyDisposable.INSTANCE;
                }
            }
            submit = this.executor.schedule(scheduledRunnable, j, timeUnit);
            scheduledRunnable.f(submit);
            return scheduledRunnable;
        }

        public void dispose() {
            if (!this.eQm) {
                this.eQm = true;
                this.eTc.dispose();
            }
        }

        public boolean isDisposed() {
            return this.eQm;
        }
    }

    static {
        eTH.shutdown();
    }

    public i() {
        this(eTG);
    }

    public i(ThreadFactory threadFactory) {
        this.eTF = new AtomicReference();
        this.eNI = threadFactory;
        this.eTF.lazySet(b(threadFactory));
    }

    static ScheduledExecutorService b(ThreadFactory threadFactory) {
        return h.a(threadFactory);
    }

    public void start() {
        ScheduledExecutorService scheduledExecutorService = null;
        ScheduledExecutorService scheduledExecutorService2;
        do {
            scheduledExecutorService2 = (ScheduledExecutorService) this.eTF.get();
            if (scheduledExecutorService2 != eTH) {
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                return;
            } else if (scheduledExecutorService == null) {
                scheduledExecutorService = b(this.eNI);
            }
        } while (!this.eTF.compareAndSet(scheduledExecutorService2, scheduledExecutorService));
    }

    public c blk() {
        return new a((ScheduledExecutorService) this.eTF.get());
    }

    public b b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future submit;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(io.reactivex.c.a.q(runnable));
        if (j <= 0) {
            try {
                submit = ((ScheduledExecutorService) this.eTF.get()).submit(scheduledDirectTask);
            } catch (RejectedExecutionException e) {
                io.reactivex.c.a.onError(e);
                return EmptyDisposable.INSTANCE;
            }
        }
        submit = ((ScheduledExecutorService) this.eTF.get()).schedule(scheduledDirectTask, j, timeUnit);
        scheduledDirectTask.f(submit);
        return scheduledDirectTask;
    }

    public b c(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable = io.reactivex.c.a.q(runnable);
        if (j2 <= 0) {
            Future submit;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.eTF.get();
            c cVar = new c(runnable, scheduledExecutorService);
            if (j <= 0) {
                try {
                    submit = scheduledExecutorService.submit(cVar);
                } catch (RejectedExecutionException e) {
                    io.reactivex.c.a.onError(e);
                    return EmptyDisposable.INSTANCE;
                }
            }
            submit = scheduledExecutorService.schedule(cVar, j, timeUnit);
            cVar.g(submit);
            return cVar;
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
        try {
            scheduledDirectPeriodicTask.f(((ScheduledExecutorService) this.eTF.get()).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            io.reactivex.c.a.onError(e2);
            return EmptyDisposable.INSTANCE;
        }
    }
}
