package io.reactivex.internal.schedulers;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements b, Runnable, Callable<Object> {
    static final Object eTv = new Object();
    static final Object eTw = new Object();
    static final Object eTx = new Object();
    static final Object eTy = new Object();
    private static final long serialVersionUID = -6120223772001106981L;
    final Runnable actual;

    public ScheduledRunnable(Runnable runnable, a aVar) {
        super(3);
        this.actual = runnable;
        lazySet(0, aVar);
    }

    public Object call() {
        run();
        return null;
    }

    public void run() {
        Object obj;
        lazySet(2, Thread.currentThread());
        try {
            this.actual.run();
        } catch (Throwable th) {
            lazySet(2, null);
            obj = get(0);
            if (!(obj == eTv || !compareAndSet(0, obj, eTy) || obj == null)) {
                ((a) obj).g(this);
            }
            while (true) {
                obj = get(1);
                if (obj == eTw || obj == eTx || compareAndSet(1, obj, eTy)) {
                }
            }
        }
        lazySet(2, null);
        obj = get(0);
        if (!(obj == eTv || !compareAndSet(0, obj, eTy) || obj == null)) {
            ((a) obj).g(this);
        }
        do {
            obj = get(1);
            if (obj == eTw || obj == eTx) {
                return;
            }
        } while (!compareAndSet(1, obj, eTy));
    }

    public void f(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != eTy) {
                if (obj == eTw) {
                    future.cancel(false);
                    return;
                } else if (obj == eTx) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public void dispose() {
        Object obj;
        boolean z;
        Object obj2;
        do {
            obj = get(1);
            if (obj == eTy || obj == eTw || obj == eTx) {
                break;
            }
            z = get(2) != Thread.currentThread();
        } while (!compareAndSet(1, obj, z ? eTx : eTw));
        if (obj != null) {
            ((Future) obj).cancel(z);
        }
        do {
            obj2 = get(0);
            if (obj2 != eTy) {
                obj = eTv;
                if (obj2 == obj || obj2 == null) {
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(0, obj2, obj));
        ((a) obj2).g(this);
    }

    public boolean isDisposed() {
        Object obj = get(0);
        if (obj == eTv || obj == eTy) {
            return true;
        }
        return false;
    }
}
