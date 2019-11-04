package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzc.zzc;

public final class zzh extends zzuq<zzh> {
    public zzl[] zzpe;
    public zzl[] zzpf;
    public zzc[] zzpg;

    public zzh() {
        this.zzpe = zzl.zzaa();
        this.zzpf = zzl.zzaa();
        this.zzpg = new zzc[0];
        this.zzbhb = null;
        this.zzbhl = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzh = (zzh) obj;
        if (!zzuu.equals(this.zzpe, zzh.zzpe) || !zzuu.equals(this.zzpf, zzh.zzpf) || !zzuu.equals(this.zzpg, zzh.zzpg)) {
            return false;
        }
        if (this.zzbhb == null || this.zzbhb.isEmpty()) {
            return zzh.zzbhb == null || zzh.zzbhb.isEmpty();
        } else {
            return this.zzbhb.equals(zzh.zzbhb);
        }
    }

    public final int hashCode() {
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + zzuu.hashCode(this.zzpe)) * 31) + zzuu.hashCode(this.zzpf)) * 31) + zzuu.hashCode(this.zzpg)) * 31;
        int hashCode2 = (this.zzbhb == null || this.zzbhb.isEmpty()) ? 0 : this.zzbhb.hashCode();
        return hashCode + hashCode2;
    }

    public final void zza(zzuo zzuo) {
        int i;
        zzl[] zzlArr;
        zzuw zzuw;
        zzl[] zzlArr2 = this.zzpe;
        int i2 = 0;
        if (zzlArr2 != null && zzlArr2.length > 0) {
            i = 0;
            while (true) {
                zzlArr = this.zzpe;
                if (i >= zzlArr.length) {
                    break;
                }
                zzuw = zzlArr[i];
                if (zzuw != null) {
                    zzuo.zza(1, zzuw);
                }
                i++;
            }
        }
        zzlArr2 = this.zzpf;
        if (zzlArr2 != null && zzlArr2.length > 0) {
            i = 0;
            while (true) {
                zzlArr = this.zzpf;
                if (i >= zzlArr.length) {
                    break;
                }
                zzuw = zzlArr[i];
                if (zzuw != null) {
                    zzuo.zza(2, zzuw);
                }
                i++;
            }
        }
        zzc[] zzcArr = this.zzpg;
        if (zzcArr != null && zzcArr.length > 0) {
            while (true) {
                zzcArr = this.zzpg;
                if (i2 >= zzcArr.length) {
                    break;
                }
                zzsk zzsk = zzcArr[i2];
                if (zzsk != null) {
                    zzuo.zze(3, zzsk);
                }
                i2++;
            }
        }
        super.zza(zzuo);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzy() {
        int i;
        zzl[] zzlArr;
        zzuw zzuw;
        int zzy = super.zzy();
        zzl[] zzlArr2 = this.zzpe;
        int i2 = 0;
        if (zzlArr2 != null && zzlArr2.length > 0) {
            i = zzy;
            zzy = 0;
            while (true) {
                zzlArr = this.zzpe;
                if (zzy >= zzlArr.length) {
                    break;
                }
                zzuw = zzlArr[zzy];
                if (zzuw != null) {
                    i += zzuo.zzb(1, zzuw);
                }
                zzy++;
            }
            zzy = i;
        }
        zzlArr2 = this.zzpf;
        if (zzlArr2 != null && zzlArr2.length > 0) {
            i = zzy;
            zzy = 0;
            while (true) {
                zzlArr = this.zzpf;
                if (zzy >= zzlArr.length) {
                    break;
                }
                zzuw = zzlArr[zzy];
                if (zzuw != null) {
                    i += zzuo.zzb(2, zzuw);
                }
                zzy++;
            }
            zzy = i;
        }
        zzc[] zzcArr = this.zzpg;
        if (zzcArr != null && zzcArr.length > 0) {
            while (true) {
                zzcArr = this.zzpg;
                if (i2 >= zzcArr.length) {
                    break;
                }
                zzsk zzsk = zzcArr[i2];
                if (zzsk != null) {
                    zzy += zzqj.zzc(3, zzsk);
                }
                i2++;
            }
        }
        return zzy;
    }
}
