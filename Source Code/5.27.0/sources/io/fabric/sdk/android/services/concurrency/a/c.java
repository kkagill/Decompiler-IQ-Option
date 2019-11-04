package io.fabric.sdk.android.services.concurrency.a;

/* compiled from: ExponentialBackoff */
public class c implements a {
    private final long eOh;
    private final int eOi;

    public c(long j, int i) {
        this.eOh = j;
        this.eOi = i;
    }

    public long z(int i) {
        double d = (double) this.eOh;
        double pow = Math.pow((double) this.eOi, (double) i);
        Double.isNaN(d);
        return (long) (d * pow);
    }
}
