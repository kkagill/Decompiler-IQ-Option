package com.google.android.gms.internal.vision;

public final class zzdk extends zzjn<zzdk> {
    public zzds[] zzoh;

    public zzdk() {
        this.zzoh = zzds.zzcc();
        this.zzadp = -1;
    }

    public final void zza(zzjl zzjl) {
        zzds[] zzdsArr = this.zzoh;
        if (zzdsArr != null && zzdsArr.length > 0) {
            int i = 0;
            while (true) {
                zzds[] zzdsArr2 = this.zzoh;
                if (i >= zzdsArr2.length) {
                    break;
                }
                zzjt zzjt = zzdsArr2[i];
                if (zzjt != null) {
                    zzjl.zza(1, zzjt);
                }
                i++;
            }
        }
        super.zza(zzjl);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzt() {
        int zzt = super.zzt();
        zzds[] zzdsArr = this.zzoh;
        if (zzdsArr != null && zzdsArr.length > 0) {
            int i = 0;
            while (true) {
                zzds[] zzdsArr2 = this.zzoh;
                if (i >= zzdsArr2.length) {
                    break;
                }
                zzjt zzjt = zzdsArr2[i];
                if (zzjt != null) {
                    zzt += zzjl.zzb(1, zzjt);
                }
                i++;
            }
        }
        return zzt;
    }
}
