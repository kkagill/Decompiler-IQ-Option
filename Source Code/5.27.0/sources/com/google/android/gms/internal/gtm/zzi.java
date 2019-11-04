package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzc.zza;
import com.google.android.gms.internal.gtm.zzc.zzb;
import com.google.android.gms.internal.gtm.zzc.zzd;
import com.google.android.gms.internal.gtm.zzc.zze;

public final class zzi extends zzuq<zzi> {
    public String version;
    private String[] zzph = zzuz.zzbhu;
    public String[] zzpi = zzuz.zzbhu;
    public zzl[] zzpj = zzl.zzaa();
    public zzd[] zzpk = new zzd[0];
    public zzb[] zzpl = new zzb[0];
    public zzb[] zzpm = new zzb[0];
    public zzb[] zzpn = new zzb[0];
    public zze[] zzpo = new zze[0];
    private String zzpp;
    private String zzpq;
    private String zzpr;
    private zza zzps;
    private float zzpt;
    private boolean zzpu;
    private String[] zzpv;
    public int zzpw;

    public zzi() {
        String str = "";
        this.zzpp = str;
        this.zzpq = str;
        this.zzpr = "0";
        this.version = str;
        this.zzps = null;
        this.zzpt = 0.0f;
        this.zzpu = false;
        this.zzpv = zzuz.zzbhu;
        this.zzpw = 0;
        this.zzbhb = null;
        this.zzbhl = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zzi = (zzi) obj;
        if (!zzuu.equals(this.zzph, zzi.zzph) || !zzuu.equals(this.zzpi, zzi.zzpi) || !zzuu.equals(this.zzpj, zzi.zzpj) || !zzuu.equals(this.zzpk, zzi.zzpk) || !zzuu.equals(this.zzpl, zzi.zzpl) || !zzuu.equals(this.zzpm, zzi.zzpm) || !zzuu.equals(this.zzpn, zzi.zzpn) || !zzuu.equals(this.zzpo, zzi.zzpo)) {
            return false;
        }
        String str = this.zzpp;
        if (str == null) {
            if (zzi.zzpp != null) {
                return false;
            }
        } else if (!str.equals(zzi.zzpp)) {
            return false;
        }
        str = this.zzpq;
        if (str == null) {
            if (zzi.zzpq != null) {
                return false;
            }
        } else if (!str.equals(zzi.zzpq)) {
            return false;
        }
        str = this.zzpr;
        if (str == null) {
            if (zzi.zzpr != null) {
                return false;
            }
        } else if (!str.equals(zzi.zzpr)) {
            return false;
        }
        str = this.version;
        if (str == null) {
            if (zzi.version != null) {
                return false;
            }
        } else if (!str.equals(zzi.version)) {
            return false;
        }
        zza zza = this.zzps;
        if (zza == null) {
            if (zzi.zzps != null) {
                return false;
            }
        } else if (!zza.equals(zzi.zzps)) {
            return false;
        }
        if (Float.floatToIntBits(this.zzpt) != Float.floatToIntBits(zzi.zzpt) || this.zzpu != zzi.zzpu || !zzuu.equals(this.zzpv, zzi.zzpv) || this.zzpw != zzi.zzpw) {
            return false;
        }
        if (this.zzbhb == null || this.zzbhb.isEmpty()) {
            return zzi.zzbhb == null || zzi.zzbhb.isEmpty();
        } else {
            return this.zzbhb.equals(zzi.zzbhb);
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((((((getClass().getName().hashCode() + 527) * 31) + zzuu.hashCode(this.zzph)) * 31) + zzuu.hashCode(this.zzpi)) * 31) + zzuu.hashCode(this.zzpj)) * 31) + zzuu.hashCode(this.zzpk)) * 31) + zzuu.hashCode(this.zzpl)) * 31) + zzuu.hashCode(this.zzpm)) * 31) + zzuu.hashCode(this.zzpn)) * 31) + zzuu.hashCode(this.zzpo)) * 31;
        String str = this.zzpp;
        int i2 = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.zzpq;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.zzpr;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.version;
        hashCode += str == null ? 0 : str.hashCode();
        zza zza = this.zzps;
        hashCode *= 31;
        if (zza == null) {
            i = 0;
        } else {
            i = zza.hashCode();
        }
        hashCode = (((((((((hashCode + i) * 31) + Float.floatToIntBits(this.zzpt)) * 31) + (this.zzpu ? 1231 : 1237)) * 31) + zzuu.hashCode(this.zzpv)) * 31) + this.zzpw) * 31;
        if (!(this.zzbhb == null || this.zzbhb.isEmpty())) {
            i2 = this.zzbhb.hashCode();
        }
        return hashCode + i2;
    }

    public final void zza(zzuo zzuo) {
        int i;
        String[] strArr;
        String str;
        zzsk zzsk;
        zzb[] zzbArr;
        zzsk zzsk2;
        String[] strArr2 = this.zzpi;
        int i2 = 0;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.zzpi;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    zzuo.zza(1, str);
                }
                i++;
            }
        }
        zzl[] zzlArr = this.zzpj;
        if (zzlArr != null && zzlArr.length > 0) {
            i = 0;
            while (true) {
                zzl[] zzlArr2 = this.zzpj;
                if (i >= zzlArr2.length) {
                    break;
                }
                zzuw zzuw = zzlArr2[i];
                if (zzuw != null) {
                    zzuo.zza(2, zzuw);
                }
                i++;
            }
        }
        zzd[] zzdArr = this.zzpk;
        if (zzdArr != null && zzdArr.length > 0) {
            i = 0;
            while (true) {
                zzd[] zzdArr2 = this.zzpk;
                if (i >= zzdArr2.length) {
                    break;
                }
                zzsk = zzdArr2[i];
                if (zzsk != null) {
                    zzuo.zze(3, zzsk);
                }
                i++;
            }
        }
        zzb[] zzbArr2 = this.zzpl;
        if (zzbArr2 != null && zzbArr2.length > 0) {
            i = 0;
            while (true) {
                zzb[] zzbArr3 = this.zzpl;
                if (i >= zzbArr3.length) {
                    break;
                }
                zzsk = zzbArr3[i];
                if (zzsk != null) {
                    zzuo.zze(4, zzsk);
                }
                i++;
            }
        }
        zzbArr2 = this.zzpm;
        if (zzbArr2 != null && zzbArr2.length > 0) {
            i = 0;
            while (true) {
                zzbArr = this.zzpm;
                if (i >= zzbArr.length) {
                    break;
                }
                zzsk2 = zzbArr[i];
                if (zzsk2 != null) {
                    zzuo.zze(5, zzsk2);
                }
                i++;
            }
        }
        zzbArr2 = this.zzpn;
        if (zzbArr2 != null && zzbArr2.length > 0) {
            i = 0;
            while (true) {
                zzbArr = this.zzpn;
                if (i >= zzbArr.length) {
                    break;
                }
                zzsk2 = zzbArr[i];
                if (zzsk2 != null) {
                    zzuo.zze(6, zzsk2);
                }
                i++;
            }
        }
        zze[] zzeArr = this.zzpo;
        if (zzeArr != null && zzeArr.length > 0) {
            i = 0;
            while (true) {
                zze[] zzeArr2 = this.zzpo;
                if (i >= zzeArr2.length) {
                    break;
                }
                zzsk2 = zzeArr2[i];
                if (zzsk2 != null) {
                    zzuo.zze(7, zzsk2);
                }
                i++;
            }
        }
        String str2 = this.zzpp;
        String str3 = "";
        if (!(str2 == null || str2.equals(str3))) {
            zzuo.zza(9, this.zzpp);
        }
        str2 = this.zzpq;
        if (!(str2 == null || str2.equals(str3))) {
            zzuo.zza(10, this.zzpq);
        }
        str2 = this.zzpr;
        if (!(str2 == null || str2.equals("0"))) {
            zzuo.zza(12, this.zzpr);
        }
        str2 = this.version;
        if (!(str2 == null || str2.equals(str3))) {
            zzuo.zza(13, this.version);
        }
        zzsk zzsk3 = this.zzps;
        if (zzsk3 != null) {
            zzuo.zze(14, zzsk3);
        }
        if (Float.floatToIntBits(this.zzpt) != Float.floatToIntBits(0.0f)) {
            float f = this.zzpt;
            zzuo.zzd(15, 5);
            zzuo.zzcc(Float.floatToIntBits(f));
        }
        strArr2 = this.zzpv;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.zzpv;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    zzuo.zza(16, str);
                }
                i++;
            }
        }
        i = this.zzpw;
        if (i != 0) {
            zzuo.zze(17, i);
        }
        boolean z = this.zzpu;
        if (z) {
            zzuo.zzb(18, z);
        }
        strArr2 = this.zzph;
        if (strArr2 != null && strArr2.length > 0) {
            while (true) {
                strArr2 = this.zzph;
                if (i2 >= strArr2.length) {
                    break;
                }
                str2 = strArr2[i2];
                if (str2 != null) {
                    zzuo.zza(19, str2);
                }
                i2++;
            }
        }
        super.zza(zzuo);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzy() {
        int i;
        int i2;
        String[] strArr;
        String str;
        zzb[] zzbArr;
        zzsk zzsk;
        int zzy = super.zzy();
        String[] strArr2 = this.zzpi;
        int i3 = 0;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            int i4 = 0;
            i2 = 0;
            while (true) {
                strArr = this.zzpi;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    i2++;
                    i4 += zzuo.zzda(str);
                }
                i++;
            }
            zzy = (zzy + i4) + (i2 * 1);
        }
        zzl[] zzlArr = this.zzpj;
        if (zzlArr != null && zzlArr.length > 0) {
            i = zzy;
            zzy = 0;
            while (true) {
                zzl[] zzlArr2 = this.zzpj;
                if (zzy >= zzlArr2.length) {
                    break;
                }
                zzuw zzuw = zzlArr2[zzy];
                if (zzuw != null) {
                    i += zzuo.zzb(2, zzuw);
                }
                zzy++;
            }
            zzy = i;
        }
        zzd[] zzdArr = this.zzpk;
        if (zzdArr != null && zzdArr.length > 0) {
            i = zzy;
            zzy = 0;
            while (true) {
                zzd[] zzdArr2 = this.zzpk;
                if (zzy >= zzdArr2.length) {
                    break;
                }
                zzsk zzsk2 = zzdArr2[zzy];
                if (zzsk2 != null) {
                    i += zzqj.zzc(3, zzsk2);
                }
                zzy++;
            }
            zzy = i;
        }
        zzb[] zzbArr2 = this.zzpl;
        if (zzbArr2 != null && zzbArr2.length > 0) {
            i = zzy;
            zzy = 0;
            while (true) {
                zzbArr = this.zzpl;
                if (zzy >= zzbArr.length) {
                    break;
                }
                zzsk = zzbArr[zzy];
                if (zzsk != null) {
                    i += zzqj.zzc(4, zzsk);
                }
                zzy++;
            }
            zzy = i;
        }
        zzbArr2 = this.zzpm;
        if (zzbArr2 != null && zzbArr2.length > 0) {
            i = zzy;
            zzy = 0;
            while (true) {
                zzbArr = this.zzpm;
                if (zzy >= zzbArr.length) {
                    break;
                }
                zzsk = zzbArr[zzy];
                if (zzsk != null) {
                    i += zzqj.zzc(5, zzsk);
                }
                zzy++;
            }
            zzy = i;
        }
        zzbArr2 = this.zzpn;
        if (zzbArr2 != null && zzbArr2.length > 0) {
            i = zzy;
            zzy = 0;
            while (true) {
                zzbArr = this.zzpn;
                if (zzy >= zzbArr.length) {
                    break;
                }
                zzsk = zzbArr[zzy];
                if (zzsk != null) {
                    i += zzqj.zzc(6, zzsk);
                }
                zzy++;
            }
            zzy = i;
        }
        zze[] zzeArr = this.zzpo;
        if (zzeArr != null && zzeArr.length > 0) {
            i = zzy;
            zzy = 0;
            while (true) {
                zze[] zzeArr2 = this.zzpo;
                if (zzy >= zzeArr2.length) {
                    break;
                }
                zzsk = zzeArr2[zzy];
                if (zzsk != null) {
                    i += zzqj.zzc(7, zzsk);
                }
                zzy++;
            }
            zzy = i;
        }
        String str2 = this.zzpp;
        str = "";
        if (!(str2 == null || str2.equals(str))) {
            zzy += zzuo.zzb(9, this.zzpp);
        }
        str2 = this.zzpq;
        if (!(str2 == null || str2.equals(str))) {
            zzy += zzuo.zzb(10, this.zzpq);
        }
        str2 = this.zzpr;
        if (!(str2 == null || str2.equals("0"))) {
            zzy += zzuo.zzb(12, this.zzpr);
        }
        str2 = this.version;
        if (!(str2 == null || str2.equals(str))) {
            zzy += zzuo.zzb(13, this.version);
        }
        zzsk zzsk3 = this.zzps;
        if (zzsk3 != null) {
            zzy += zzqj.zzc(14, zzsk3);
        }
        if (Float.floatToIntBits(this.zzpt) != Float.floatToIntBits(0.0f)) {
            zzy += zzuo.zzbb(15) + 4;
        }
        strArr2 = this.zzpv;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            i2 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr3 = this.zzpv;
                if (i >= strArr3.length) {
                    break;
                }
                String str3 = strArr3[i];
                if (str3 != null) {
                    i5++;
                    i2 += zzuo.zzda(str3);
                }
                i++;
            }
            zzy = (zzy + i2) + (i5 * 2);
        }
        i = this.zzpw;
        if (i != 0) {
            zzy += zzuo.zzi(17, i);
        }
        if (this.zzpu) {
            zzy += zzuo.zzbb(18) + 1;
        }
        strArr2 = this.zzph;
        if (strArr2 == null || strArr2.length <= 0) {
            return zzy;
        }
        i = 0;
        i2 = 0;
        while (true) {
            strArr = this.zzph;
            if (i3 >= strArr.length) {
                return (zzy + i) + (i2 * 2);
            }
            str = strArr[i3];
            if (str != null) {
                i2++;
                i += zzuo.zzda(str);
            }
            i3++;
        }
    }
}
