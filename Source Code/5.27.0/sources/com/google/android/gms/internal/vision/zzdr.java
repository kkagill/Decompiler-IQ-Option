package com.google.android.gms.internal.vision;

public final class zzdr extends zzjn<zzdr> {
    public String name;
    public String zzon;
    public Long zzpq;
    public zzdh zzpr;
    public zzdn zzps;
    private zzdi zzpt;

    public zzdr() {
        this.name = null;
        this.zzpq = null;
        this.zzpr = null;
        this.zzon = null;
        this.zzps = null;
        this.zzpt = null;
        this.zzadp = -1;
    }

    public final void zza(zzjl zzjl) {
        String str = this.name;
        if (str != null) {
            zzjl.zza(1, str);
        }
        Long l = this.zzpq;
        if (l != null) {
            zzjl.zzi(2, l.longValue());
        }
        zzjt zzjt = this.zzpr;
        if (zzjt != null) {
            zzjl.zza(3, zzjt);
        }
        str = this.zzon;
        if (str != null) {
            zzjl.zza(6, str);
        }
        zzjt = this.zzps;
        if (zzjt != null) {
            zzjl.zza(16, zzjt);
        }
        zzjt = this.zzpt;
        if (zzjt != null) {
            zzjl.zza(17, zzjt);
        }
        super.zza(zzjl);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzt() {
        int zzt = super.zzt();
        String str = this.name;
        if (str != null) {
            zzt += zzjl.zzb(1, str);
        }
        Long l = this.zzpq;
        if (l != null) {
            zzt += zzjl.zzd(2, l.longValue());
        }
        zzjt zzjt = this.zzpr;
        if (zzjt != null) {
            zzt += zzjl.zzb(3, zzjt);
        }
        str = this.zzon;
        if (str != null) {
            zzt += zzjl.zzb(6, str);
        }
        zzjt = this.zzps;
        if (zzjt != null) {
            zzt += zzjl.zzb(16, zzjt);
        }
        zzjt = this.zzpt;
        return zzjt != null ? zzt + zzjl.zzb(17, zzjt) : zzt;
    }
}
