package io.reactivex.internal.schedulers;

import io.reactivex.c.a;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.o.c;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: NewThreadWorker */
public class f extends c implements b {
    volatile boolean eQm;
    private final ScheduledExecutorService executor;

    public f(ThreadFactory threadFactory) {
        this.executor = h.a(threadFactory);
    }

    public b n(Runnable runnable) {
        return c(runnable, 0, null);
    }

    public b c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.eQm) {
            return EmptyDisposable.INSTANCE;
        }
        return a(runnable, j, timeUnit, null);
    }

    public b b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future submit;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(a.q(runnable));
        if (j <= 0) {
            try {
                submit = this.executor.submit(scheduledDirectTask);
            } catch (RejectedExecutionException e) {
                a.onError(e);
                return EmptyDisposable.INSTANCE;
            }
        }
        submit = this.executor.schedule(scheduledDirectTask, j, timeUnit);
        scheduledDirectTask.f(submit);
        return scheduledDirectTask;
    }

    public b c(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable = a.q(runnable);
        if (j2 <= 0) {
            Future submit;
            c cVar = new c(runnable, this.executor);
            if (j <= 0) {
                try {
                    submit = this.executor.submit(cVar);
                } catch (RejectedExecutionException e) {
                    a.onError(e);
                    return EmptyDisposable.INSTANCE;
                }
            }
            submit = this.executor.schedule(cVar, j, timeUnit);
            cVar.g(submit);
            return cVar;
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
        try {
            scheduledDirectPeriodicTask.f(this.executor.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            a.onError(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    public ScheduledRunnable a(Runnable runnable, long j, TimeUnit timeUnit, io.reactivex.internal.disposables.a aVar) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(a.q(runnable), aVar);
        if (aVar != null && !aVar.e(scheduledRunnable)) {
            return scheduledRunnable;
        }
        Future submit;
        if (j <= 0) {
            try {
                submit = this.executor.submit(scheduledRunnable);
            } catch (RejectedExecutionException e) {
                if (aVar != null) {
                    aVar.f(scheduledRunnable);
                }
                a.onError(e);
            }
        } else {
            submit = this.executor.schedule(scheduledRunnable, j, timeUnit);
        }
        scheduledRunnable.f(submit);
        return scheduledRunnable;
    }

    public void dispose() {
        if (!this.eQm) {
            this.eQm = true;
            this.executor.shutdownNow();
        }
    }

    public void shutdown() {
        if (!this.eQm) {
            this.eQm = true;
            this.executor.shutdown();
        }
    }

    public boolean isDisposed() {
        return this.eQm;
    }
}
