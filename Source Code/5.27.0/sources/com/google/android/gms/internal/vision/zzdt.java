package com.google.android.gms.internal.vision;

public final class zzdt extends zzjn<zzdt> {
    private static volatile zzdt[] zzpx;
    public zzdk zzpy;
    public Integer zzpz;
    public zzdo zzqa;
    private zzdj zzqb;

    public static zzdt[] zzcd() {
        if (zzpx == null) {
            synchronized (zzjr.zzado) {
                if (zzpx == null) {
                    zzpx = new zzdt[0];
                }
            }
        }
        return zzpx;
    }

    public zzdt() {
        this.zzpy = null;
        this.zzpz = null;
        this.zzqa = null;
        this.zzqb = null;
        this.zzadp = -1;
    }

    public final void zza(zzjl zzjl) {
        zzjt zzjt = this.zzpy;
        if (zzjt != null) {
            zzjl.zza(1, zzjt);
        }
        Integer num = this.zzpz;
        if (num != null) {
            zzjl.zze(2, num.intValue());
        }
        zzjt = this.zzqa;
        if (zzjt != null) {
            zzjl.zza(16, zzjt);
        }
        zzjt = this.zzqb;
        if (zzjt != null) {
            zzjl.zza(17, zzjt);
        }
        super.zza(zzjl);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzt() {
        int zzt = super.zzt();
        zzjt zzjt = this.zzpy;
        if (zzjt != null) {
            zzt += zzjl.zzb(1, zzjt);
        }
        Integer num = this.zzpz;
        if (num != null) {
            zzt += zzjl.zzi(2, num.intValue());
        }
        zzjt = this.zzqa;
        if (zzjt != null) {
            zzt += zzjl.zzb(16, zzjt);
        }
        zzjt = this.zzqb;
        return zzjt != null ? zzt + zzjl.zzb(17, zzjt) : zzt;
    }
}
