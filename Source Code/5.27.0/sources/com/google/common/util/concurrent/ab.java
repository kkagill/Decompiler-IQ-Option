package com.google.common.util.concurrent;

import com.google.common.c.c;
import java.util.concurrent.TimeUnit;

/* compiled from: SmoothRateLimiter */
abstract class ab extends z {
    double aaQ;
    double aaR;
    double aaS;
    private long aaT;

    /* compiled from: SmoothRateLimiter */
    static final class a extends ab {
        private final long aaU;
        private double aaV;
        private double aaW;
        private double aaX;

        a(a aVar, long j, TimeUnit timeUnit, double d) {
            super(aVar);
            this.aaU = timeUnit.toMicros(j);
            this.aaX = d;
        }

        /* Access modifiers changed, original: 0000 */
        public void a(double d, double d2) {
            d = this.aaR;
            double d3 = this.aaX * d2;
            long j = this.aaU;
            double d4 = (double) j;
            Double.isNaN(d4);
            this.aaW = (d4 * 0.5d) / d2;
            d4 = this.aaW;
            double d5 = (double) j;
            Double.isNaN(d5);
            this.aaR = d4 + ((d5 * 2.0d) / (d2 + d3));
            this.aaV = (d3 - d2) / (this.aaR - this.aaW);
            if (d == Double.POSITIVE_INFINITY) {
                this.aaQ = 0.0d;
            } else {
                this.aaQ = d == 0.0d ? this.aaR : (this.aaQ * this.aaR) / d;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public long b(double d, double d2) {
            long f;
            d -= this.aaW;
            if (d > 0.0d) {
                double min = Math.min(d, d2);
                f = (long) (((f(d) + f(d - min)) * min) / 2.0d);
                d2 -= min;
            } else {
                f = 0;
            }
            return f + ((long) (this.aaS * d2));
        }

        private double f(double d) {
            return this.aaS + (d * this.aaV);
        }

        /* Access modifiers changed, original: 0000 */
        public double vN() {
            double d = (double) this.aaU;
            double d2 = this.aaR;
            Double.isNaN(d);
            return d / d2;
        }
    }

    public abstract void a(double d, double d2);

    public abstract long b(double d, double d2);

    public abstract double vN();

    private ab(a aVar) {
        super(aVar);
        this.aaT = 0;
    }

    /* Access modifiers changed, original: final */
    public final void a(double d, long j) {
        J(j);
        double toMicros = (double) TimeUnit.SECONDS.toMicros(1);
        Double.isNaN(toMicros);
        toMicros /= d;
        this.aaS = toMicros;
        a(d, toMicros);
    }

    /* Access modifiers changed, original: final */
    public final double vI() {
        double toMicros = (double) TimeUnit.SECONDS.toMicros(1);
        double d = this.aaS;
        Double.isNaN(toMicros);
        return toMicros / d;
    }

    /* Access modifiers changed, original: final */
    public final long H(long j) {
        return this.aaT;
    }

    /* Access modifiers changed, original: final */
    public final long d(int i, long j) {
        J(j);
        j = this.aaT;
        double d = (double) i;
        double min = Math.min(d, this.aaQ);
        Double.isNaN(d);
        this.aaT = c.f(this.aaT, b(this.aaQ, min) + ((long) ((d - min) * this.aaS)));
        this.aaQ -= min;
        return j;
    }

    /* Access modifiers changed, original: 0000 */
    public void J(long j) {
        long j2 = this.aaT;
        if (j > j2) {
            double d = (double) (j - j2);
            double vN = vN();
            Double.isNaN(d);
            this.aaQ = Math.min(this.aaR, this.aaQ + (d / vN));
            this.aaT = j;
        }
    }
}
