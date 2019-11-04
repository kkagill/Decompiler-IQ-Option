package io.reactivex.internal.schedulers;

import io.reactivex.disposables.b;
import io.reactivex.internal.a.a;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements b {
    protected static final FutureTask<Void> eSK = new FutureTask(a.eQx, null);
    protected static final FutureTask<Void> eSL = new FutureTask(a.eQx, null);
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable runnable;
    protected Thread runner;

    AbstractDirectTask(Runnable runnable) {
        this.runnable = runnable;
    }

    public final void dispose() {
        Future future = (Future) get();
        if (future != eSK) {
            Future future2 = eSL;
            if (future != future2 && compareAndSet(future, future2) && future != null) {
                future.cancel(this.runner != Thread.currentThread());
            }
        }
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == eSK || future == eSL;
    }

    public final void f(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != eSK) {
                if (future2 == eSL) {
                    future.cancel(this.runner != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
