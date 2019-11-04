package com.google.common.util.concurrent;

import com.google.common.base.i;
import com.google.common.base.l;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: RateLimiter */
public abstract class z {
    private final a aaO;
    private volatile Object aaP;

    /* compiled from: RateLimiter */
    static abstract class a {
        public abstract void I(long j);

        public abstract long vK();

        protected a() {
        }

        public static a vL() {
            return new a() {
                final l Uh = l.qg();

                /* Access modifiers changed, original: protected */
                public long vK() {
                    return this.Uh.a(TimeUnit.MICROSECONDS);
                }

                /* Access modifiers changed, original: protected */
                public void I(long j) {
                    if (j > 0) {
                        ac.c(j, TimeUnit.MICROSECONDS);
                    }
                }
            };
        }
    }

    public abstract long H(long j);

    public abstract void a(double d, long j);

    public abstract long d(int i, long j);

    public abstract double vI();

    public static z a(double d, long j, TimeUnit timeUnit) {
        i.a(j >= 0, "warmupPeriod must not be negative: %s", j);
        return a(d, j, timeUnit, 3.0d, a.vL());
    }

    static z a(double d, long j, TimeUnit timeUnit, double d2, a aVar) {
        a aVar2 = new a(aVar, j, timeUnit, d2);
        aVar2.e(d);
        return aVar2;
    }

    private Object vH() {
        Object obj = this.aaP;
        if (obj == null) {
            synchronized (this) {
                obj = this.aaP;
                if (obj == null) {
                    obj = new Object();
                    this.aaP = obj;
                }
            }
        }
        return obj;
    }

    z(a aVar) {
        this.aaO = (a) i.checkNotNull(aVar);
    }

    public final void e(double d) {
        boolean z = d > 0.0d && !Double.isNaN(d);
        i.checkArgument(z, "rate must be positive");
        synchronized (vH()) {
            a(d, this.aaO.vK());
        }
    }

    public final double getRate() {
        double vI;
        synchronized (vH()) {
            vI = vI();
        }
        return vI;
    }

    public double vJ() {
        return cv(1);
    }

    public double cv(int i) {
        long cw = cw(i);
        this.aaO.I(cw);
        double d = (double) cw;
        Double.isNaN(d);
        d *= 1.0d;
        double toMicros = (double) TimeUnit.SECONDS.toMicros(1);
        Double.isNaN(toMicros);
        return d / toMicros;
    }

    /* Access modifiers changed, original: final */
    public final long cw(int i) {
        long c;
        cx(i);
        synchronized (vH()) {
            c = c(i, this.aaO.vK());
        }
        return c;
    }

    public boolean tryAcquire() {
        return tryAcquire(1, 0, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire(int i, long j, TimeUnit timeUnit) {
        j = Math.max(timeUnit.toMicros(j), 0);
        cx(i);
        synchronized (vH()) {
            long vK = this.aaO.vK();
            if (g(vK, j)) {
                long c = c(i, vK);
                this.aaO.I(c);
                return true;
            }
            return false;
        }
    }

    private boolean g(long j, long j2) {
        return H(j) - j2 <= j;
    }

    /* Access modifiers changed, original: final */
    public final long c(int i, long j) {
        return Math.max(d(i, j) - j, 0);
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", new Object[]{Double.valueOf(getRate())});
    }

    private static void cx(int i) {
        i.a(i > 0, "Requested permits (%s) must be positive", i);
    }
}
