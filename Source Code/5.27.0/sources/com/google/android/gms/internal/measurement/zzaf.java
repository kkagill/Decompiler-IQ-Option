package com.google.android.gms.internal.measurement;

final class zzaf extends zzb {
    private final /* synthetic */ zzz zzaa;
    private final /* synthetic */ boolean zzaz;

    zzaf(zzz zzz, boolean z) {
        this.zzaa = zzz;
        this.zzaz = z;
        super(zzz);
    }

    /* Access modifiers changed, original: final */
    public final void zzf() {
        this.zzaa.zzar.setMeasurementEnabled(this.zzaz, this.timestamp);
    }
}
