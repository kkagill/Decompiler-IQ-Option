package io.reactivex.internal.schedulers;

import io.reactivex.disposables.b;
import io.reactivex.internal.a.a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: InstantPeriodicTask */
final class c implements b, Callable<Void> {
    static final FutureTask<Void> eTh = new FutureTask(a.eQx, null);
    final ExecutorService cRG;
    final AtomicReference<Future<?>> eTf = new AtomicReference();
    final AtomicReference<Future<?>> eTg = new AtomicReference();
    Thread runner;
    final Runnable task;

    c(Runnable runnable, ExecutorService executorService) {
        this.task = runnable;
        this.cRG = executorService;
    }

    public Void call() {
        this.runner = Thread.currentThread();
        try {
            this.task.run();
            h(this.cRG.submit(this));
            this.runner = null;
        } catch (Throwable th) {
            this.runner = null;
            io.reactivex.c.a.onError(th);
        }
        return null;
    }

    public void dispose() {
        Future future = (Future) this.eTg.getAndSet(eTh);
        boolean z = true;
        if (!(future == null || future == eTh)) {
            future.cancel(this.runner != Thread.currentThread());
        }
        future = (Future) this.eTf.getAndSet(eTh);
        if (future != null && future != eTh) {
            if (this.runner == Thread.currentThread()) {
                z = false;
            }
            future.cancel(z);
        }
    }

    public boolean isDisposed() {
        return this.eTg.get() == eTh;
    }

    /* Access modifiers changed, original: 0000 */
    public void g(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) this.eTg.get();
            if (future2 == eTh) {
                future.cancel(this.runner != Thread.currentThread());
                return;
            }
        } while (!this.eTg.compareAndSet(future2, future));
    }

    /* Access modifiers changed, original: 0000 */
    public void h(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) this.eTf.get();
            if (future2 == eTh) {
                future.cancel(this.runner != Thread.currentThread());
                return;
            }
        } while (!this.eTf.compareAndSet(future2, future));
    }
}
