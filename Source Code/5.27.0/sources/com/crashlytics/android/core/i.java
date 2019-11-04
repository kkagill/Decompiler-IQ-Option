package com.crashlytics.android.core;

import android.os.Looper;
import io.fabric.sdk.android.c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: CrashlyticsBackgroundWorker */
class i {
    private final ExecutorService executorService;

    public i(ExecutorService executorService) {
        this.executorService = executorService;
    }

    /* Access modifiers changed, original: 0000 */
    public <T> T b(Callable<T> callable) {
        String str = "CrashlyticsCore";
        try {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                return this.executorService.submit(callable).get(4, TimeUnit.SECONDS);
            }
            return this.executorService.submit(callable).get();
        } catch (RejectedExecutionException unused) {
            c.biX().d(str, "Executor is shut down because we're handling a fatal crash.");
            return null;
        } catch (Exception e) {
            c.biX().e(str, "Failed to execute task.", e);
            return null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Future<?> submit(final Runnable runnable) {
        try {
            return this.executorService.submit(new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        c.biX().e("CrashlyticsCore", "Failed to execute task.", e);
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            c.biX().d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public <T> Future<T> submit(final Callable<T> callable) {
        try {
            return this.executorService.submit(new Callable<T>() {
                public T call() {
                    try {
                        return callable.call();
                    } catch (Exception e) {
                        c.biX().e("CrashlyticsCore", "Failed to execute task.", e);
                        return null;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            c.biX().d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }
}
