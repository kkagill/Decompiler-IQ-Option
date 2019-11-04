package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzbq.zza;

public final class zzbw extends zziq<zzbw> {
    public String zzcg;
    public Long zzzk;
    private Integer zzzl;
    public zza[] zzzm;
    public zzbx[] zzzn;
    public zzbv[] zzzo;
    private String zzzp;
    public Boolean zzzq;

    public zzbw() {
        this.zzzk = null;
        this.zzcg = null;
        this.zzzl = null;
        this.zzzm = new zza[0];
        this.zzzn = zzbx.zzrc();
        this.zzzo = zzbv.zzqx();
        this.zzzp = null;
        this.zzzq = null;
        this.zzaoo = null;
        this.zzaow = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbw)) {
            return false;
        }
        zzbw zzbw = (zzbw) obj;
        Long l = this.zzzk;
        if (l == null) {
            if (zzbw.zzzk != null) {
                return false;
            }
        } else if (!l.equals(zzbw.zzzk)) {
            return false;
        }
        String str = this.zzcg;
        if (str == null) {
            if (zzbw.zzcg != null) {
                return false;
            }
        } else if (!str.equals(zzbw.zzcg)) {
            return false;
        }
        Integer num = this.zzzl;
        if (num == null) {
            if (zzbw.zzzl != null) {
                return false;
            }
        } else if (!num.equals(zzbw.zzzl)) {
            return false;
        }
        if (!zziu.equals(this.zzzm, zzbw.zzzm) || !zziu.equals(this.zzzn, zzbw.zzzn) || !zziu.equals(this.zzzo, zzbw.zzzo)) {
            return false;
        }
        str = this.zzzp;
        if (str == null) {
            if (zzbw.zzzp != null) {
                return false;
            }
        } else if (!str.equals(zzbw.zzzp)) {
            return false;
        }
        Boolean bool = this.zzzq;
        if (bool == null) {
            if (zzbw.zzzq != null) {
                return false;
            }
        } else if (!bool.equals(zzbw.zzzq)) {
            return false;
        }
        if (this.zzaoo == null || this.zzaoo.isEmpty()) {
            return zzbw.zzaoo == null || zzbw.zzaoo.isEmpty();
        } else {
            return this.zzaoo.equals(zzbw.zzaoo);
        }
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Long l = this.zzzk;
        int i = 0;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.zzcg;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.zzzl;
        hashCode = (((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + zziu.hashCode(this.zzzm)) * 31) + zziu.hashCode(this.zzzn)) * 31) + zziu.hashCode(this.zzzo)) * 31;
        str = this.zzzp;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.zzzq;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        if (!(this.zzaoo == null || this.zzaoo.isEmpty())) {
            i = this.zzaoo.hashCode();
        }
        return hashCode + i;
    }

    public final void zza(zzio zzio) {
        int i;
        Long l = this.zzzk;
        int i2 = 0;
        if (l != null) {
            long longValue = l.longValue();
            zzio.zzb(1, 0);
            zzio.zzbz(longValue);
        }
        String str = this.zzcg;
        if (str != null) {
            zzio.zzb(2, str);
        }
        Integer num = this.zzzl;
        if (num != null) {
            zzio.zzc(3, num.intValue());
        }
        zza[] zzaArr = this.zzzm;
        if (zzaArr != null && zzaArr.length > 0) {
            i = 0;
            while (true) {
                zza[] zzaArr2 = this.zzzm;
                if (i >= zzaArr2.length) {
                    break;
                }
                zzgi zzgi = zzaArr2[i];
                if (zzgi != null) {
                    zzio.zze(4, zzgi);
                }
                i++;
            }
        }
        zzbx[] zzbxArr = this.zzzn;
        if (zzbxArr != null && zzbxArr.length > 0) {
            i = 0;
            while (true) {
                zzbx[] zzbxArr2 = this.zzzn;
                if (i >= zzbxArr2.length) {
                    break;
                }
                zziw zziw = zzbxArr2[i];
                if (zziw != null) {
                    zzio.zza(5, zziw);
                }
                i++;
            }
        }
        zzbv[] zzbvArr = this.zzzo;
        if (zzbvArr != null && zzbvArr.length > 0) {
            while (true) {
                zzbvArr = this.zzzo;
                if (i2 >= zzbvArr.length) {
                    break;
                }
                zziw zziw2 = zzbvArr[i2];
                if (zziw2 != null) {
                    zzio.zza(6, zziw2);
                }
                i2++;
            }
        }
        str = this.zzzp;
        if (str != null) {
            zzio.zzb(7, str);
        }
        Boolean bool = this.zzzq;
        if (bool != null) {
            zzio.zzb(8, bool.booleanValue());
        }
        super.zza(zzio);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzqy() {
        int zzbi;
        int zzqy = super.zzqy();
        Long l = this.zzzk;
        if (l != null) {
            long longValue = l.longValue();
            zzbi = zzio.zzbi(1);
            int i = (-128 & longValue) == 0 ? 1 : (-16384 & longValue) == 0 ? 2 : (-2097152 & longValue) == 0 ? 3 : (-268435456 & longValue) == 0 ? 4 : (-34359738368L & longValue) == 0 ? 5 : (-4398046511104L & longValue) == 0 ? 6 : (-562949953421312L & longValue) == 0 ? 7 : (-72057594037927936L & longValue) == 0 ? 8 : (longValue & Long.MIN_VALUE) == 0 ? 9 : 10;
            zzqy += zzbi + i;
        }
        String str = this.zzcg;
        if (str != null) {
            zzqy += zzio.zzc(2, str);
        }
        Integer num = this.zzzl;
        if (num != null) {
            zzqy += zzio.zzg(3, num.intValue());
        }
        zza[] zzaArr = this.zzzm;
        int i2 = 0;
        if (zzaArr != null && zzaArr.length > 0) {
            zzbi = zzqy;
            zzqy = 0;
            while (true) {
                zza[] zzaArr2 = this.zzzm;
                if (zzqy >= zzaArr2.length) {
                    break;
                }
                zzgi zzgi = zzaArr2[zzqy];
                if (zzgi != null) {
                    zzbi += zzee.zzc(4, zzgi);
                }
                zzqy++;
            }
            zzqy = zzbi;
        }
        zzbx[] zzbxArr = this.zzzn;
        if (zzbxArr != null && zzbxArr.length > 0) {
            zzbi = zzqy;
            zzqy = 0;
            while (true) {
                zzbx[] zzbxArr2 = this.zzzn;
                if (zzqy >= zzbxArr2.length) {
                    break;
                }
                zziw zziw = zzbxArr2[zzqy];
                if (zziw != null) {
                    zzbi += zzio.zzb(5, zziw);
                }
                zzqy++;
            }
            zzqy = zzbi;
        }
        zzbv[] zzbvArr = this.zzzo;
        if (zzbvArr != null && zzbvArr.length > 0) {
            while (true) {
                zzbvArr = this.zzzo;
                if (i2 >= zzbvArr.length) {
                    break;
                }
                zziw zziw2 = zzbvArr[i2];
                if (zziw2 != null) {
                    zzqy += zzio.zzb(6, zziw2);
                }
                i2++;
            }
        }
        str = this.zzzp;
        if (str != null) {
            zzqy += zzio.zzc(7, str);
        }
        Boolean bool = this.zzzq;
        if (bool == null) {
            return zzqy;
        }
        bool.booleanValue();
        return zzqy + (zzio.zzbi(8) + 1);
    }
}
