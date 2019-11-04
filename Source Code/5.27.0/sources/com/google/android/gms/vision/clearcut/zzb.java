package com.google.android.gms.vision.clearcut;

public final class zzb {
    private final Object lock = new Object();
    private final long zzbu = Math.round(30000.0d);
    private long zzbv = Long.MIN_VALUE;

    public zzb(double d) {
    }

    public final boolean tryAcquire() {
        synchronized (this.lock) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.zzbv + this.zzbu > currentTimeMillis) {
                return false;
            }
            this.zzbv = currentTimeMillis;
            return true;
        }
    }
}
