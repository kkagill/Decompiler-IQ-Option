package io.reactivex.internal.schedulers;

import io.reactivex.o;
import io.reactivex.o.c;
import java.util.concurrent.ThreadFactory;

/* compiled from: NewThreadScheduler */
public final class e extends o {
    private static final RxThreadFactory eSN = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    final ThreadFactory eNI;

    public e() {
        this(eSN);
    }

    public e(ThreadFactory threadFactory) {
        this.eNI = threadFactory;
    }

    public c blk() {
        return new f(this.eNI);
    }
}
