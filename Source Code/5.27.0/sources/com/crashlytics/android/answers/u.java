package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.a.a;
import java.util.Random;

/* compiled from: RandomBackoff */
class u implements a {
    final a oF;
    final double oG;
    final Random random;

    public u(a aVar, double d) {
        this(aVar, d, new Random());
    }

    public u(a aVar, double d, Random random) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        } else if (aVar == null) {
            throw new NullPointerException("backoff must not be null");
        } else if (random != null) {
            this.oF = aVar;
            this.oG = d;
            this.random = random;
        } else {
            throw new NullPointerException("random must not be null");
        }
    }

    public long z(int i) {
        double ew = ew();
        double z = (double) this.oF.z(i);
        Double.isNaN(z);
        return (long) (ew * z);
    }

    /* Access modifiers changed, original: 0000 */
    public double ew() {
        double d = this.oG;
        double d2 = 1.0d - d;
        return d2 + (((d + 1.0d) - d2) * this.random.nextDouble());
    }
}
