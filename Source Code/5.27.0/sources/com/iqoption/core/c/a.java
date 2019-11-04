package com.iqoption.core.c;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.w;
import com.google.common.util.concurrent.x;
import com.iqoption.core.d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: Schedulers */
public final class a {
    private static final int biK = Runtime.getRuntime().availableProcessors();
    public static final w biL = x.a(new a(biK));
    public static w biM = x.a(new a(biK));
    public static final b biN = new b(Looper.getMainLooper());

    /* compiled from: Schedulers */
    private static class a extends ScheduledThreadPoolExecutor {
        a(int i) {
            super(i);
        }

        /* Access modifiers changed, original: protected */
        public void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th == null && (runnable instanceof Future)) {
                Future future = (Future) runnable;
                try {
                    if (future.isDone()) {
                        future.get();
                    }
                } catch (CancellationException | ExecutionException e) {
                    th = e.getCause();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            if (th != null && !d.Un().Ds() && !(th instanceof CancellationException)) {
                com.iqoption.i.b.N(th);
            }
        }
    }

    /* compiled from: Schedulers */
    public static final class b extends Handler implements Executor {
        b(Looper looper) {
            super(looper);
        }

        public void execute(@NonNull Runnable runnable) {
            post(runnable);
        }
    }

    public static void Yc() {
        biM.shutdownNow();
        biM = x.a(new a(biK));
    }
}
