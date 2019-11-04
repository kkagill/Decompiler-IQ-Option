package com.google.android.gms.internal.measurement;

final class zzad extends zzb {
    private final /* synthetic */ String val$id;
    private final /* synthetic */ zzz zzaa;

    zzad(zzz zzz, String str) {
        this.zzaa = zzz;
        this.val$id = str;
        super(zzz);
    }

    /* Access modifiers changed, original: final */
    public final void zzf() {
        this.zzaa.zzar.setUserId(this.val$id, this.timestamp);
    }
}
