package com.google.android.gms.measurement.internal;

abstract class zzjh extends zzje {
    private boolean zzdh;

    zzjh(zzjg zzjg) {
        super(zzjg);
        this.zzkz.zzb(this);
    }

    public abstract boolean zzbk();

    /* Access modifiers changed, original: final */
    public final boolean isInitialized() {
        return this.zzdh;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzbi() {
        if (!isInitialized()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void initialize() {
        if (this.zzdh) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzbk();
        this.zzkz.zzjs();
        this.zzdh = true;
    }
}
