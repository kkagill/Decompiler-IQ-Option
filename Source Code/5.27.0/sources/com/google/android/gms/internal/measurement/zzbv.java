package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzbk.zza;
import com.google.android.gms.internal.measurement.zzbk.zzd;

public final class zzbv extends zziq<zzbv> {
    private static volatile zzbv[] zzze;
    public Integer zzzf;
    public zzd[] zzzg;
    public zza[] zzzh;
    private Boolean zzzi;
    private Boolean zzzj;

    public static zzbv[] zzqx() {
        if (zzze == null) {
            synchronized (zziu.zzaov) {
                if (zzze == null) {
                    zzze = new zzbv[0];
                }
            }
        }
        return zzze;
    }

    public zzbv() {
        this.zzzf = null;
        this.zzzg = new zzd[0];
        this.zzzh = new zza[0];
        this.zzzi = null;
        this.zzzj = null;
        this.zzaoo = null;
        this.zzaow = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbv)) {
            return false;
        }
        zzbv zzbv = (zzbv) obj;
        Integer num = this.zzzf;
        if (num == null) {
            if (zzbv.zzzf != null) {
                return false;
            }
        } else if (!num.equals(zzbv.zzzf)) {
            return false;
        }
        if (!zziu.equals(this.zzzg, zzbv.zzzg) || !zziu.equals(this.zzzh, zzbv.zzzh)) {
            return false;
        }
        Boolean bool = this.zzzi;
        if (bool == null) {
            if (zzbv.zzzi != null) {
                return false;
            }
        } else if (!bool.equals(zzbv.zzzi)) {
            return false;
        }
        bool = this.zzzj;
        if (bool == null) {
            if (zzbv.zzzj != null) {
                return false;
            }
        } else if (!bool.equals(zzbv.zzzj)) {
            return false;
        }
        if (this.zzaoo == null || this.zzaoo.isEmpty()) {
            return zzbv.zzaoo == null || zzbv.zzaoo.isEmpty();
        } else {
            return this.zzaoo.equals(zzbv.zzaoo);
        }
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.zzzf;
        int i = 0;
        hashCode = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + zziu.hashCode(this.zzzg)) * 31) + zziu.hashCode(this.zzzh)) * 31;
        Boolean bool = this.zzzi;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.zzzj;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        if (!(this.zzaoo == null || this.zzaoo.isEmpty())) {
            i = this.zzaoo.hashCode();
        }
        return hashCode + i;
    }

    public final void zza(zzio zzio) {
        Integer num = this.zzzf;
        if (num != null) {
            zzio.zzc(1, num.intValue());
        }
        zzd[] zzdArr = this.zzzg;
        int i = 0;
        if (zzdArr != null && zzdArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzd[] zzdArr2 = this.zzzg;
                if (i2 >= zzdArr2.length) {
                    break;
                }
                zzgi zzgi = zzdArr2[i2];
                if (zzgi != null) {
                    zzio.zze(2, zzgi);
                }
                i2++;
            }
        }
        zza[] zzaArr = this.zzzh;
        if (zzaArr != null && zzaArr.length > 0) {
            while (true) {
                zzaArr = this.zzzh;
                if (i >= zzaArr.length) {
                    break;
                }
                zzgi zzgi2 = zzaArr[i];
                if (zzgi2 != null) {
                    zzio.zze(3, zzgi2);
                }
                i++;
            }
        }
        Boolean bool = this.zzzi;
        if (bool != null) {
            zzio.zzb(4, bool.booleanValue());
        }
        bool = this.zzzj;
        if (bool != null) {
            zzio.zzb(5, bool.booleanValue());
        }
        super.zza(zzio);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzqy() {
        int zzqy = super.zzqy();
        Integer num = this.zzzf;
        if (num != null) {
            zzqy += zzio.zzg(1, num.intValue());
        }
        zzd[] zzdArr = this.zzzg;
        int i = 0;
        if (zzdArr != null && zzdArr.length > 0) {
            int i2 = zzqy;
            zzqy = 0;
            while (true) {
                zzd[] zzdArr2 = this.zzzg;
                if (zzqy >= zzdArr2.length) {
                    break;
                }
                zzgi zzgi = zzdArr2[zzqy];
                if (zzgi != null) {
                    i2 += zzee.zzc(2, zzgi);
                }
                zzqy++;
            }
            zzqy = i2;
        }
        zza[] zzaArr = this.zzzh;
        if (zzaArr != null && zzaArr.length > 0) {
            while (true) {
                zzaArr = this.zzzh;
                if (i >= zzaArr.length) {
                    break;
                }
                zzgi zzgi2 = zzaArr[i];
                if (zzgi2 != null) {
                    zzqy += zzee.zzc(3, zzgi2);
                }
                i++;
            }
        }
        Boolean bool = this.zzzi;
        if (bool != null) {
            bool.booleanValue();
            zzqy += zzio.zzbi(4) + 1;
        }
        bool = this.zzzj;
        if (bool == null) {
            return zzqy;
        }
        bool.booleanValue();
        return zzqy + (zzio.zzbi(5) + 1);
    }
}
