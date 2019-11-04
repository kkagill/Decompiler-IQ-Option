package com.google.android.gms.internal.measurement;

import com.google.android.gms.measurement.internal.zzgk;

final class zzal extends zzb {
    private final /* synthetic */ zzz zzaa;
    private final /* synthetic */ zzgk zzbc;

    zzal(zzz zzz, zzgk zzgk) {
        this.zzaa = zzz;
        this.zzbc = zzgk;
        super(zzz);
    }

    /* Access modifiers changed, original: final */
    public final void zzf() {
        this.zzaa.zzar.setEventInterceptor(new zza(this.zzbc));
    }
}
