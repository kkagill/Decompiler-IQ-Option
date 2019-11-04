package com.google.android.gms.internal.vision;

public final class zzdh extends zzjn<zzdh> {
    public String version;
    public String zzod;

    public zzdh() {
        this.zzod = null;
        this.version = null;
        this.zzadp = -1;
    }

    public final void zza(zzjl zzjl) {
        String str = this.zzod;
        if (str != null) {
            zzjl.zza(1, str);
        }
        str = this.version;
        if (str != null) {
            zzjl.zza(2, str);
        }
        super.zza(zzjl);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzt() {
        int zzt = super.zzt();
        String str = this.zzod;
        if (str != null) {
            zzt += zzjl.zzb(1, str);
        }
        str = this.version;
        return str != null ? zzt + zzjl.zzb(2, str) : zzt;
    }
}
