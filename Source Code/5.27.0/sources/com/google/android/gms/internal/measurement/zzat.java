package com.google.android.gms.internal.measurement;

import android.os.Bundle;

final class zzat extends zzb {
    private final /* synthetic */ zzz zzaa;
    private final /* synthetic */ zzl zzat;
    private final /* synthetic */ Bundle zzbj;

    zzat(zzz zzz, Bundle bundle, zzl zzl) {
        this.zzaa = zzz;
        this.zzbj = bundle;
        this.zzat = zzl;
        super(zzz);
    }

    /* Access modifiers changed, original: final */
    public final void zzf() {
        this.zzaa.zzar.performAction(this.zzbj, this.zzat, this.timestamp);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzk() {
        this.zzat.zzb(null);
    }
}
