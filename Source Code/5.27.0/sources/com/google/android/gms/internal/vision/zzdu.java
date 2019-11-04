package com.google.android.gms.internal.vision;

public final class zzdu extends zzjn<zzdu> {
    private zzdl zzqc;
    public zzdr zzqd;
    public zzdp zzqe;
    private Integer zzqf;

    public zzdu() {
        this.zzqc = null;
        this.zzqd = null;
        this.zzqe = null;
        this.zzqf = null;
        this.zzadp = -1;
    }

    public final void zza(zzjl zzjl) {
        zzjt zzjt = this.zzqc;
        if (zzjt != null) {
            zzjl.zza(1, zzjt);
        }
        zzjt = this.zzqd;
        if (zzjt != null) {
            zzjl.zza(2, zzjt);
        }
        zzjt = this.zzqe;
        if (zzjt != null) {
            zzjl.zza(3, zzjt);
        }
        Integer num = this.zzqf;
        if (num != null) {
            zzjl.zze(4, num.intValue());
        }
        super.zza(zzjl);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzt() {
        int zzt = super.zzt();
        zzjt zzjt = this.zzqc;
        if (zzjt != null) {
            zzt += zzjl.zzb(1, zzjt);
        }
        zzjt = this.zzqd;
        if (zzjt != null) {
            zzt += zzjl.zzb(2, zzjt);
        }
        zzjt = this.zzqe;
        if (zzjt != null) {
            zzt += zzjl.zzb(3, zzjt);
        }
        Integer num = this.zzqf;
        return num != null ? zzt + zzjl.zzi(4, num.intValue()) : zzt;
    }
}
