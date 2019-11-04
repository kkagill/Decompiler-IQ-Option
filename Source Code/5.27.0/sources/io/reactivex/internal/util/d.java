package io.reactivex.internal.util;

import io.reactivex.c.a;
import java.util.concurrent.atomic.AtomicInteger;
import org.a.c;

/* compiled from: HalfSerializer */
public final class d {
    public static <T> void a(c<? super T> cVar, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            cVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable bmB = atomicThrowable.bmB();
                if (bmB != null) {
                    cVar.onError(bmB);
                } else {
                    cVar.onComplete();
                }
            }
        }
    }

    public static void a(c<?> cVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.ai(th)) {
            a.onError(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            cVar.onError(atomicThrowable.bmB());
        }
    }

    public static void a(c<?> cVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable bmB = atomicThrowable.bmB();
            if (bmB != null) {
                cVar.onError(bmB);
            } else {
                cVar.onComplete();
            }
        }
    }
}
