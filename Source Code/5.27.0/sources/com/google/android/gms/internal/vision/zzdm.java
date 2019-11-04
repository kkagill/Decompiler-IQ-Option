package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcz.zzd.zzb;

public final class zzdm extends zzjn<zzdm> {
    private static volatile zzdm[] zzoo;
    public String name;
    private String zzop;
    private String[] zzoq;
    private zzb zzor;
    public String zzos;
    public Long zzot;
    public Long zzou;
    public zzdt[] zzov;

    public static zzdm[] zzcb() {
        if (zzoo == null) {
            synchronized (zzjr.zzado) {
                if (zzoo == null) {
                    zzoo = new zzdm[0];
                }
            }
        }
        return zzoo;
    }

    public zzdm() {
        this.name = null;
        this.zzop = null;
        this.zzoq = zzjw.zzady;
        this.zzos = null;
        this.zzot = null;
        this.zzou = null;
        this.zzov = zzdt.zzcd();
        this.zzadp = -1;
    }

    public final void zza(zzjl zzjl) {
        String str = this.name;
        if (str != null) {
            zzjl.zza(1, str);
        }
        str = this.zzop;
        if (str != null) {
            zzjl.zza(2, str);
        }
        String[] strArr = this.zzoq;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.zzoq;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i2];
                if (str2 != null) {
                    zzjl.zza(3, str2);
                }
                i2++;
            }
        }
        zzb zzb = this.zzor;
        if (!(zzb == null || zzb == null)) {
            zzjl.zze(4, zzb.zzr());
        }
        str = this.zzos;
        if (str != null) {
            zzjl.zza(5, str);
        }
        Long l = this.zzot;
        if (l != null) {
            zzjl.zzi(6, l.longValue());
        }
        l = this.zzou;
        if (l != null) {
            zzjl.zzi(7, l.longValue());
        }
        zzdt[] zzdtArr = this.zzov;
        if (zzdtArr != null && zzdtArr.length > 0) {
            while (true) {
                zzdtArr = this.zzov;
                if (i >= zzdtArr.length) {
                    break;
                }
                zzjt zzjt = zzdtArr[i];
                if (zzjt != null) {
                    zzjl.zza(8, zzjt);
                }
                i++;
            }
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
        str = this.zzop;
        if (str != null) {
            zzt += zzjl.zzb(2, str);
        }
        String[] strArr = this.zzoq;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.zzoq;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i2];
                if (str2 != null) {
                    i4++;
                    i3 += zzjl.zzn(str2);
                }
                i2++;
            }
            zzt = (zzt + i3) + (i4 * 1);
        }
        zzb zzb = this.zzor;
        if (!(zzb == null || zzb == null)) {
            zzt += zzjl.zzi(4, zzb.zzr());
        }
        str = this.zzos;
        if (str != null) {
            zzt += zzjl.zzb(5, str);
        }
        Long l = this.zzot;
        if (l != null) {
            zzt += zzjl.zzd(6, l.longValue());
        }
        l = this.zzou;
        if (l != null) {
            zzt += zzjl.zzd(7, l.longValue());
        }
        zzdt[] zzdtArr = this.zzov;
        if (zzdtArr != null && zzdtArr.length > 0) {
            while (true) {
                zzdtArr = this.zzov;
                if (i >= zzdtArr.length) {
                    break;
                }
                zzjt zzjt = zzdtArr[i];
                if (zzjt != null) {
                    zzt += zzjl.zzb(8, zzjt);
                }
                i++;
            }
        }
        return zzt;
    }
}
