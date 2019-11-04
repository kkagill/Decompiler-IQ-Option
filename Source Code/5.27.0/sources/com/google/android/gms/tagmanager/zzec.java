package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
final class zzec implements zzfw {
    private final /* synthetic */ zzeb zzaik;

    zzec(zzeb zzeb) {
        this.zzaik = zzeb;
    }

    public final void zza(zzbw zzbw) {
        this.zzaik.zze(zzbw.zzih());
    }

    public final void zzb(zzbw zzbw) {
        this.zzaik.zze(zzbw.zzih());
        long zzih = zzbw.zzih();
        StringBuilder stringBuilder = new StringBuilder(57);
        stringBuilder.append("Permanent failure dispatching hitId: ");
        stringBuilder.append(zzih);
        zzdi.zzab(stringBuilder.toString());
    }

    public final void zzc(zzbw zzbw) {
        long zzii = zzbw.zzii();
        if (zzii == 0) {
            this.zzaik.zzb(zzbw.zzih(), this.zzaik.zzsd.currentTimeMillis());
            return;
        }
        if (zzii + 14400000 < this.zzaik.zzsd.currentTimeMillis()) {
            this.zzaik.zze(zzbw.zzih());
            zzii = zzbw.zzih();
            StringBuilder stringBuilder = new StringBuilder(47);
            stringBuilder.append("Giving up on failed hitId: ");
            stringBuilder.append(zzii);
            zzdi.zzab(stringBuilder.toString());
        }
    }
}
