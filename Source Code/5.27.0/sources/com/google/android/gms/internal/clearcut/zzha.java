package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzge.zzd;
import com.google.android.gms.internal.clearcut.zzge.zzs;
import java.util.Arrays;

public final class zzha extends zzfu<zzha> implements Cloneable {
    private String tag;
    public long zzbjf = 0;
    public long zzbjg = 0;
    private long zzbjh = 0;
    public int zzbji;
    private String zzbjj;
    private int zzbjk;
    private boolean zzbjl;
    private zzhb[] zzbjm;
    private byte[] zzbjn;
    private zzd zzbjo;
    public byte[] zzbjp;
    private String zzbjq;
    private String zzbjr;
    private zzgy zzbjs;
    private String zzbjt;
    public long zzbju;
    private zzgz zzbjv;
    public byte[] zzbjw;
    private String zzbjx;
    private int zzbjy;
    private int[] zzbjz;
    private long zzbka;
    private zzs zzbkb;
    public boolean zzbkc;

    public zzha() {
        String str = "";
        this.tag = str;
        this.zzbji = 0;
        this.zzbjj = str;
        this.zzbjk = 0;
        this.zzbjl = false;
        this.zzbjm = zzhb.zzge();
        this.zzbjn = zzgb.zzse;
        this.zzbjo = null;
        this.zzbjp = zzgb.zzse;
        this.zzbjq = str;
        this.zzbjr = str;
        this.zzbjs = null;
        this.zzbjt = str;
        this.zzbju = 180000;
        this.zzbjv = null;
        this.zzbjw = zzgb.zzse;
        this.zzbjx = str;
        this.zzbjy = 0;
        this.zzbjz = zzgb.zzrx;
        this.zzbka = 0;
        this.zzbkb = null;
        this.zzbkc = false;
        this.zzrj = null;
        this.zzrs = -1;
    }

    private final zzha zzgd() {
        try {
            zzha zzha = (zzha) super.clone();
            zzhb[] zzhbArr = this.zzbjm;
            if (zzhbArr != null && zzhbArr.length > 0) {
                zzha.zzbjm = new zzhb[zzhbArr.length];
                int i = 0;
                while (true) {
                    zzhb[] zzhbArr2 = this.zzbjm;
                    if (i >= zzhbArr2.length) {
                        break;
                    }
                    if (zzhbArr2[i] != null) {
                        zzha.zzbjm[i] = (zzhb) zzhbArr2[i].clone();
                    }
                    i++;
                }
            }
            zzd zzd = this.zzbjo;
            if (zzd != null) {
                zzha.zzbjo = zzd;
            }
            zzgy zzgy = this.zzbjs;
            if (zzgy != null) {
                zzha.zzbjs = (zzgy) zzgy.clone();
            }
            zzgz zzgz = this.zzbjv;
            if (zzgz != null) {
                zzha.zzbjv = (zzgz) zzgz.clone();
            }
            int[] iArr = this.zzbjz;
            if (iArr != null && iArr.length > 0) {
                zzha.zzbjz = (int[]) iArr.clone();
            }
            zzs zzs = this.zzbkb;
            if (zzs != null) {
                zzha.zzbkb = zzs;
            }
            return zzha;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* synthetic */ Object clone() {
        return zzgd();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzha)) {
            return false;
        }
        zzha zzha = (zzha) obj;
        if (this.zzbjf != zzha.zzbjf || this.zzbjg != zzha.zzbjg) {
            return false;
        }
        String str = this.tag;
        if (str == null) {
            if (zzha.tag != null) {
                return false;
            }
        } else if (!str.equals(zzha.tag)) {
            return false;
        }
        if (this.zzbji != zzha.zzbji) {
            return false;
        }
        str = this.zzbjj;
        if (str == null) {
            if (zzha.zzbjj != null) {
                return false;
            }
        } else if (!str.equals(zzha.zzbjj)) {
            return false;
        }
        if (!zzfy.equals(this.zzbjm, zzha.zzbjm) || !Arrays.equals(this.zzbjn, zzha.zzbjn)) {
            return false;
        }
        zzd zzd = this.zzbjo;
        if (zzd == null) {
            if (zzha.zzbjo != null) {
                return false;
            }
        } else if (!zzd.equals(zzha.zzbjo)) {
            return false;
        }
        if (!Arrays.equals(this.zzbjp, zzha.zzbjp)) {
            return false;
        }
        str = this.zzbjq;
        if (str == null) {
            if (zzha.zzbjq != null) {
                return false;
            }
        } else if (!str.equals(zzha.zzbjq)) {
            return false;
        }
        str = this.zzbjr;
        if (str == null) {
            if (zzha.zzbjr != null) {
                return false;
            }
        } else if (!str.equals(zzha.zzbjr)) {
            return false;
        }
        zzgy zzgy = this.zzbjs;
        if (zzgy == null) {
            if (zzha.zzbjs != null) {
                return false;
            }
        } else if (!zzgy.equals(zzha.zzbjs)) {
            return false;
        }
        str = this.zzbjt;
        if (str == null) {
            if (zzha.zzbjt != null) {
                return false;
            }
        } else if (!str.equals(zzha.zzbjt)) {
            return false;
        }
        if (this.zzbju != zzha.zzbju) {
            return false;
        }
        zzgz zzgz = this.zzbjv;
        if (zzgz == null) {
            if (zzha.zzbjv != null) {
                return false;
            }
        } else if (!zzgz.equals(zzha.zzbjv)) {
            return false;
        }
        if (!Arrays.equals(this.zzbjw, zzha.zzbjw)) {
            return false;
        }
        str = this.zzbjx;
        if (str == null) {
            if (zzha.zzbjx != null) {
                return false;
            }
        } else if (!str.equals(zzha.zzbjx)) {
            return false;
        }
        if (!zzfy.equals(this.zzbjz, zzha.zzbjz)) {
            return false;
        }
        zzs zzs = this.zzbkb;
        if (zzs == null) {
            if (zzha.zzbkb != null) {
                return false;
            }
        } else if (!zzs.equals(zzha.zzbkb)) {
            return false;
        }
        return this.zzbkc != zzha.zzbkc ? false : (this.zzrj == null || this.zzrj.isEmpty()) ? zzha.zzrj == null || zzha.zzrj.isEmpty() : this.zzrj.equals(zzha.zzrj);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        long j = this.zzbjf;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.zzbjg;
        hashCode = ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) * 31;
        String str = this.tag;
        int i = 0;
        hashCode = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.zzbji) * 31;
        str = this.zzbjj;
        int hashCode2 = str == null ? 0 : str.hashCode();
        hashCode2 = 1237;
        hashCode = (((((((hashCode + hashCode2) * 31) * 31) + 1237) * 31) + zzfy.hashCode(this.zzbjm)) * 31) + Arrays.hashCode(this.zzbjn);
        zzd zzd = this.zzbjo;
        hashCode = ((((hashCode * 31) + (zzd == null ? 0 : zzd.hashCode())) * 31) + Arrays.hashCode(this.zzbjp)) * 31;
        String str2 = this.zzbjq;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.zzbjr;
        hashCode += str2 == null ? 0 : str2.hashCode();
        zzgy zzgy = this.zzbjs;
        hashCode = ((hashCode * 31) + (zzgy == null ? 0 : zzgy.hashCode())) * 31;
        str2 = this.zzbjt;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        long j2 = this.zzbju;
        hashCode += (int) (j2 ^ (j2 >>> 32));
        zzgz zzgz = this.zzbjv;
        hashCode = ((((hashCode * 31) + (zzgz == null ? 0 : zzgz.hashCode())) * 31) + Arrays.hashCode(this.zzbjw)) * 31;
        String str3 = this.zzbjx;
        hashCode = ((((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31) * 31) + zzfy.hashCode(this.zzbjz)) * 31;
        zzs zzs = this.zzbkb;
        hashCode = ((hashCode * 31) + (zzs == null ? 0 : zzs.hashCode())) * 31;
        if (this.zzbkc) {
            hashCode2 = 1231;
        }
        hashCode = (hashCode + hashCode2) * 31;
        if (!(this.zzrj == null || this.zzrj.isEmpty())) {
            i = this.zzrj.hashCode();
        }
        return hashCode + i;
    }

    public final void zza(zzfs zzfs) {
        int i;
        long j = this.zzbjf;
        if (j != 0) {
            zzfs.zzi(1, j);
        }
        String str = this.tag;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            zzfs.zza(2, this.tag);
        }
        zzhb[] zzhbArr = this.zzbjm;
        int i2 = 0;
        if (zzhbArr != null && zzhbArr.length > 0) {
            i = 0;
            while (true) {
                zzhb[] zzhbArr2 = this.zzbjm;
                if (i >= zzhbArr2.length) {
                    break;
                }
                zzfz zzfz = zzhbArr2[i];
                if (zzfz != null) {
                    zzfs.zza(3, zzfz);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.zzbjn, zzgb.zzse)) {
            zzfs.zza(4, this.zzbjn);
        }
        if (!Arrays.equals(this.zzbjp, zzgb.zzse)) {
            zzfs.zza(6, this.zzbjp);
        }
        zzfz zzfz2 = this.zzbjs;
        if (zzfz2 != null) {
            zzfs.zza(7, zzfz2);
        }
        str = this.zzbjq;
        if (!(str == null || str.equals(str2))) {
            zzfs.zza(8, this.zzbjq);
        }
        zzd zzd = this.zzbjo;
        if (zzd != null) {
            zzfs.zze(9, zzd);
        }
        i = this.zzbji;
        if (i != 0) {
            zzfs.zzc(11, i);
        }
        str = this.zzbjr;
        if (!(str == null || str.equals(str2))) {
            zzfs.zza(13, this.zzbjr);
        }
        str = this.zzbjt;
        if (!(str == null || str.equals(str2))) {
            zzfs.zza(14, this.zzbjt);
        }
        long j2 = this.zzbju;
        if (j2 != 180000) {
            zzfs.zzb(15, 0);
            zzfs.zzn(zzfs.zzj(j2));
        }
        zzfz2 = this.zzbjv;
        if (zzfz2 != null) {
            zzfs.zza(16, zzfz2);
        }
        j2 = this.zzbjg;
        if (j2 != 0) {
            zzfs.zzi(17, j2);
        }
        if (!Arrays.equals(this.zzbjw, zzgb.zzse)) {
            zzfs.zza(18, this.zzbjw);
        }
        int[] iArr = this.zzbjz;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                iArr = this.zzbjz;
                if (i2 >= iArr.length) {
                    break;
                }
                zzfs.zzc(20, iArr[i2]);
                i2++;
            }
        }
        zzs zzs = this.zzbkb;
        if (zzs != null) {
            zzfs.zze(23, zzs);
        }
        str = this.zzbjx;
        if (!(str == null || str.equals(str2))) {
            zzfs.zza(24, this.zzbjx);
        }
        boolean z = this.zzbkc;
        if (z) {
            zzfs.zzb(25, z);
        }
        str = this.zzbjj;
        if (!(str == null || str.equals(str2))) {
            zzfs.zza(26, this.zzbjj);
        }
        super.zza(zzfs);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzen() {
        int i;
        int zzen = super.zzen();
        long j = this.zzbjf;
        if (j != 0) {
            zzen += zzfs.zzd(1, j);
        }
        String str = this.tag;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            zzen += zzfs.zzb(2, this.tag);
        }
        zzhb[] zzhbArr = this.zzbjm;
        int i2 = 0;
        if (zzhbArr != null && zzhbArr.length > 0) {
            i = zzen;
            zzen = 0;
            while (true) {
                zzhb[] zzhbArr2 = this.zzbjm;
                if (zzen >= zzhbArr2.length) {
                    break;
                }
                zzfz zzfz = zzhbArr2[zzen];
                if (zzfz != null) {
                    i += zzfs.zzb(3, zzfz);
                }
                zzen++;
            }
            zzen = i;
        }
        if (!Arrays.equals(this.zzbjn, zzgb.zzse)) {
            zzen += zzfs.zzb(4, this.zzbjn);
        }
        if (!Arrays.equals(this.zzbjp, zzgb.zzse)) {
            zzen += zzfs.zzb(6, this.zzbjp);
        }
        zzfz zzfz2 = this.zzbjs;
        if (zzfz2 != null) {
            zzen += zzfs.zzb(7, zzfz2);
        }
        str = this.zzbjq;
        if (!(str == null || str.equals(str2))) {
            zzen += zzfs.zzb(8, this.zzbjq);
        }
        zzdo zzdo = this.zzbjo;
        if (zzdo != null) {
            zzen += zzbn.zzc(9, zzdo);
        }
        i = this.zzbji;
        if (i != 0) {
            zzen += zzfs.zzr(11) + zzfs.zzs(i);
        }
        str = this.zzbjr;
        if (!(str == null || str.equals(str2))) {
            zzen += zzfs.zzb(13, this.zzbjr);
        }
        str = this.zzbjt;
        if (!(str == null || str.equals(str2))) {
            zzen += zzfs.zzb(14, this.zzbjt);
        }
        long j2 = this.zzbju;
        if (j2 != 180000) {
            zzen += zzfs.zzr(15) + zzfs.zzo(zzfs.zzj(j2));
        }
        zzfz2 = this.zzbjv;
        if (zzfz2 != null) {
            zzen += zzfs.zzb(16, zzfz2);
        }
        j2 = this.zzbjg;
        if (j2 != 0) {
            zzen += zzfs.zzd(17, j2);
        }
        if (!Arrays.equals(this.zzbjw, zzgb.zzse)) {
            zzen += zzfs.zzb(18, this.zzbjw);
        }
        int[] iArr = this.zzbjz;
        if (iArr != null && iArr.length > 0) {
            int[] iArr2;
            i = 0;
            while (true) {
                iArr2 = this.zzbjz;
                if (i2 >= iArr2.length) {
                    break;
                }
                i += zzfs.zzs(iArr2[i2]);
                i2++;
            }
            zzen = (zzen + i) + (iArr2.length * 2);
        }
        zzdo = this.zzbkb;
        if (zzdo != null) {
            zzen += zzbn.zzc(23, zzdo);
        }
        str = this.zzbjx;
        if (!(str == null || str.equals(str2))) {
            zzen += zzfs.zzb(24, this.zzbjx);
        }
        if (this.zzbkc) {
            zzen += zzfs.zzr(25) + 1;
        }
        str = this.zzbjj;
        return (str == null || str.equals(str2)) ? zzen : zzen + zzfs.zzb(26, this.zzbjj);
    }

    public final /* synthetic */ zzfu zzeo() {
        return (zzha) clone();
    }

    public final /* synthetic */ zzfz zzep() {
        return (zzha) clone();
    }
}
