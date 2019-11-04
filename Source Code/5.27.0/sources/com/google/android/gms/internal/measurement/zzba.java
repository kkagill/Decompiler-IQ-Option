package com.google.android.gms.internal.measurement;

import android.os.Bundle;

final class zzba extends zzb {
    private final /* synthetic */ zzz zzaa;
    private final /* synthetic */ Bundle zzbj;

    zzba(zzz zzz, Bundle bundle) {
        this.zzaa = zzz;
        this.zzbj = bundle;
        super(zzz);
    }

    /* Access modifiers changed, original: final */
    public final void zzf() {
        this.zzaa.zzar.setConditionalUserProperty(this.zzbj, this.timestamp);
    }
}
