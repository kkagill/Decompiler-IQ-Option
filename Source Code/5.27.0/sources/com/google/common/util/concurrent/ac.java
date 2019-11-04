package com.google.common.util.concurrent;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: Uninterruptibles */
public final class ac {
    public static <V> V getUninterruptibly(Future<V> future) {
        Future future2;
        Object obj = null;
        while (true) {
            try {
                future2 = future2.get();
                break;
            } catch (InterruptedException unused) {
                obj = 1;
            } catch (Throwable th) {
                if (obj != null) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (obj != null) {
            Thread.currentThread().interrupt();
        }
        return future2;
    }

    public static void c(long j, TimeUnit timeUnit) {
        long nanoTime;
        Object obj = null;
        try {
            j = timeUnit.toNanos(j);
            nanoTime = System.nanoTime() + j;
            while (true) {
                TimeUnit.NANOSECONDS.sleep(j);
                break;
            }
            if (obj != null) {
                Thread.currentThread().interrupt();
            }
        } catch (InterruptedException unused) {
            obj = 1;
            j = nanoTime - System.nanoTime();
        } catch (Throwable th) {
            if (obj != null) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
