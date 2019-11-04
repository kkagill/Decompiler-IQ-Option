package com.google.android.gms.internal.gtm;

public final class zzk extends zzuq<zzk> {
    public zzj[] zzqj;
    public zzi zzqk;
    public String zzql;

    public zzk() {
        this.zzqj = zzj.zzz();
        this.zzqk = null;
        this.zzql = "";
        this.zzbhb = null;
        this.zzbhl = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzk)) {
            return false;
        }
        zzk zzk = (zzk) obj;
        if (!zzuu.equals(this.zzqj, zzk.zzqj)) {
            return false;
        }
        zzi zzi = this.zzqk;
        if (zzi == null) {
            if (zzk.zzqk != null) {
                return false;
            }
        } else if (!zzi.equals(zzk.zzqk)) {
            return false;
        }
        String str = this.zzql;
        if (str == null) {
            if (zzk.zzql != null) {
                return false;
            }
        } else if (!str.equals(zzk.zzql)) {
            return false;
        }
        if (this.zzbhb == null || this.zzbhb.isEmpty()) {
            return zzk.zzbhb == null || zzk.zzbhb.isEmpty();
        } else {
            return this.zzbhb.equals(zzk.zzbhb);
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + zzuu.hashCode(this.zzqj);
        zzi zzi = this.zzqk;
        hashCode *= 31;
        int i2 = 0;
        if (zzi == null) {
            i = 0;
        } else {
            i = zzi.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        String str = this.zzql;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        if (!(this.zzbhb == null || this.zzbhb.isEmpty())) {
            i2 = this.zzbhb.hashCode();
        }
        return hashCode + i2;
    }

    public final void zza(zzuo zzuo) {
        zzj[] zzjArr = this.zzqj;
        if (zzjArr != null && zzjArr.length > 0) {
            int i = 0;
            while (true) {
                zzj[] zzjArr2 = this.zzqj;
                if (i >= zzjArr2.length) {
                    break;
                }
                zzuw zzuw = zzjArr2[i];
                if (zzuw != null) {
                    zzuo.zza(1, zzuw);
                }
                i++;
            }
        }
        zzuw zzuw2 = this.zzqk;
        if (zzuw2 != null) {
            zzuo.zza(2, zzuw2);
        }
        String str = this.zzql;
        if (!(str == null || str.equals(""))) {
            zzuo.zza(3, this.zzql);
        }
        super.zza(zzuo);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzy() {
        int zzy = super.zzy();
        zzj[] zzjArr = this.zzqj;
        if (zzjArr != null && zzjArr.length > 0) {
            int i = 0;
            while (true) {
                zzj[] zzjArr2 = this.zzqj;
                if (i >= zzjArr2.length) {
                    break;
                }
                zzuw zzuw = zzjArr2[i];
                if (zzuw != null) {
                    zzy += zzuo.zzb(1, zzuw);
                }
                i++;
            }
        }
        zzuw zzuw2 = this.zzqk;
        if (zzuw2 != null) {
            zzy += zzuo.zzb(2, zzuw2);
        }
        String str = this.zzql;
        return (str == null || str.equals("")) ? zzy : zzy + zzuo.zzb(3, this.zzql);
    }
}
