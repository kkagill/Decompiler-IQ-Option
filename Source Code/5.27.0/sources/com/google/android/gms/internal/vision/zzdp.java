package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcz.zzg;

public final class zzdp extends zzjn<zzdp> {
    public zzdq zzpi;
    private zzg zzpj;
    public zzdm[] zzpk;

    public zzdp() {
        this.zzpi = null;
        this.zzpk = zzdm.zzcb();
        this.zzadp = -1;
    }

    public final void zza(zzjl zzjl) {
        zzjt zzjt = this.zzpi;
        if (zzjt != null) {
            zzjl.zza(1, zzjt);
        }
        zzhf zzhf = this.zzpj;
        if (zzhf != null) {
            zzjl.zze(2, zzhf);
        }
        zzdm[] zzdmArr = this.zzpk;
        if (zzdmArr != null && zzdmArr.length > 0) {
            int i = 0;
            while (true) {
                zzdm[] zzdmArr2 = this.zzpk;
                if (i >= zzdmArr2.length) {
                    break;
                }
                zzjt zzjt2 = zzdmArr2[i];
                if (zzjt2 != null) {
                    zzjl.zza(3, zzjt2);
                }
                i++;
            }
        }
        super.zza(zzjl);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzt() {
        int zzt = super.zzt();
        zzjt zzjt = this.zzpi;
        if (zzjt != null) {
            zzt += zzjl.zzb(1, zzjt);
        }
        zzhf zzhf = this.zzpj;
        if (zzhf != null) {
            zzt += zzfe.zzc(2, zzhf);
        }
        zzdm[] zzdmArr = this.zzpk;
        if (zzdmArr != null && zzdmArr.length > 0) {
            int i = 0;
            while (true) {
                zzdm[] zzdmArr2 = this.zzpk;
                if (i >= zzdmArr2.length) {
                    break;
                }
                zzjt zzjt2 = zzdmArr2[i];
                if (zzjt2 != null) {
                    zzt += zzjl.zzb(3, zzjt2);
                }
                i++;
            }
        }
        return zzt;
    }
}
