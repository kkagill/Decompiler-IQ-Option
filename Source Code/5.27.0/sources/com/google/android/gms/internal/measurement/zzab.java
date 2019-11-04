package com.google.android.gms.internal.measurement;

import android.os.Bundle;

final class zzab extends zzb {
    private final /* synthetic */ zzz zzaa;
    private final /* synthetic */ String zzau;
    private final /* synthetic */ String zzav;
    private final /* synthetic */ Bundle zzaw;

    zzab(zzz zzz, String str, String str2, Bundle bundle) {
        this.zzaa = zzz;
        this.zzau = str;
        this.zzav = str2;
        this.zzaw = bundle;
        super(zzz);
    }

    /* Access modifiers changed, original: final */
    public final void zzf() {
        this.zzaa.zzar.clearConditionalUserProperty(this.zzau, this.zzav, this.zzaw);
    }
}
