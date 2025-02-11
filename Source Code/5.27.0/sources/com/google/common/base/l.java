package com.google.common.base;

import java.util.concurrent.TimeUnit;

/* compiled from: Stopwatch */
public final class l {
    private boolean AB;
    private long Sp;
    private long Sq;
    private final p ticker = p.qn();

    /* compiled from: Stopwatch */
    /* renamed from: com.google.common.base.l$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Sr = new int[TimeUnit.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        static {
            /*
            r0 = java.util.concurrent.TimeUnit.values();
            r0 = r0.length;
            r0 = new int[r0];
            Sr = r0;
            r0 = Sr;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = Sr;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = java.util.concurrent.TimeUnit.MICROSECONDS;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = Sr;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = Sr;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = Sr;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = java.util.concurrent.TimeUnit.MINUTES;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = Sr;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = java.util.concurrent.TimeUnit.HOURS;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r0 = Sr;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = java.util.concurrent.TimeUnit.DAYS;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.l$AnonymousClass1.<clinit>():void");
        }
    }

    public static l qf() {
        return new l();
    }

    public static l qg() {
        return new l().qh();
    }

    l() {
    }

    public l qh() {
        i.checkState(this.AB ^ 1, "This stopwatch is already running.");
        this.AB = true;
        this.Sq = this.ticker.qm();
        return this;
    }

    private long qi() {
        return this.AB ? (this.ticker.qm() - this.Sq) + this.Sp : this.Sp;
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(qi(), TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long qi = qi();
        TimeUnit u = u(qi);
        double d = (double) qi;
        double convert = (double) TimeUnit.NANOSECONDS.convert(1, u);
        Double.isNaN(d);
        Double.isNaN(convert);
        d /= convert;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(h.c(d));
        stringBuilder.append(" ");
        stringBuilder.append(b(u));
        return stringBuilder.toString();
    }

    private static TimeUnit u(long j) {
        if (TimeUnit.DAYS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.DAYS;
        }
        if (TimeUnit.HOURS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.HOURS;
        }
        if (TimeUnit.MINUTES.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MINUTES;
        }
        if (TimeUnit.SECONDS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.SECONDS;
        }
        if (TimeUnit.MILLISECONDS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MILLISECONDS;
        }
        if (TimeUnit.MICROSECONDS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MICROSECONDS;
        }
        return TimeUnit.NANOSECONDS;
    }

    private static String b(TimeUnit timeUnit) {
        switch (AnonymousClass1.Sr[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }
}
