package com.iqoption.core.rx.backoff;

import java.util.Random;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/rx/backoff/RandomJitter;", "Lcom/iqoption/core/rx/backoff/Jitter;", "()V", "RANDOM", "Ljava/util/Random;", "get", "", "core_release"})
/* compiled from: Jitter.kt */
public final class e {
    public static final e bFC = new e();
    private static final Random bbx = new Random();

    private e() {
    }

    public long get() {
        long j = (long) 50;
        double nextDouble = bbx.nextDouble();
        double d = (double) 150;
        Double.isNaN(d);
        return j + ((long) (nextDouble % d));
    }
}
