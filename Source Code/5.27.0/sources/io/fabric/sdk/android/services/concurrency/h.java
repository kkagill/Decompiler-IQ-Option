package io.fabric.sdk.android.services.concurrency;

import android.annotation.TargetApi;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PriorityThreadPoolExecutor */
public class h extends ThreadPoolExecutor {
    private static final int CORE_POOL_SIZE;
    private static final int MAXIMUM_POOL_SIZE;
    private static final int eNH = Runtime.getRuntime().availableProcessors();

    /* compiled from: PriorityThreadPoolExecutor */
    protected static final class a implements ThreadFactory {
        private final int eOf;

        public a(int i) {
            this.eOf = i;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(this.eOf);
            thread.setName("Queue");
            return thread;
        }
    }

    static {
        int i = eNH;
        CORE_POOL_SIZE = i + 1;
        MAXIMUM_POOL_SIZE = (i * 2) + 1;
    }

    <T extends Runnable & a & i & f> h(int i, int i2, long j, TimeUnit timeUnit, DependencyPriorityBlockingQueue<T> dependencyPriorityBlockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, dependencyPriorityBlockingQueue, threadFactory);
        prestartAllCoreThreads();
    }

    public static <T extends Runnable & a & i & f> h aY(int i, int i2) {
        return new h(i, i2, 1, TimeUnit.SECONDS, new DependencyPriorityBlockingQueue(), new a(10));
    }

    public static h bjW() {
        return aY(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE);
    }

    /* Access modifiers changed, original: protected */
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new e(runnable, t);
    }

    /* Access modifiers changed, original: protected */
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new e(callable);
    }

    @TargetApi(9)
    public void execute(Runnable runnable) {
        if (g.cA(runnable)) {
            super.execute(runnable);
        } else {
            super.execute(newTaskFor(runnable, null));
        }
    }

    /* Access modifiers changed, original: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        i iVar = (i) runnable;
        iVar.gn(true);
        iVar.Y(th);
        getQueue().bjU();
        super.afterExecute(runnable, th);
    }

    /* renamed from: bjX */
    public DependencyPriorityBlockingQueue getQueue() {
        return (DependencyPriorityBlockingQueue) super.getQueue();
    }
}
