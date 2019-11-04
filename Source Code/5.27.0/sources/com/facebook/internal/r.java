package com.facebook.internal;

import com.facebook.f;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* compiled from: LockOnGetVariable */
public class r<T> {
    private T value;
    private CountDownLatch zn = new CountDownLatch(1);

    public r(final Callable<T> callable) {
        f.getExecutor().execute(new FutureTask(new Callable<Void>() {
            public Void call() {
                try {
                    r.this.value = callable.call();
                    return null;
                } finally {
                    r.this.zn.countDown();
                }
            }
        }));
    }

    public T getValue() {
        kt();
        return this.value;
    }

    private void kt() {
        CountDownLatch countDownLatch = this.zn;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }
}
