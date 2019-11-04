package com.google.android.gms.internal.gtm;

public final class zzj extends zzuq<zzj> {
    private static volatile zzj[] zzqg;
    public String name;
    private zzl zzqh;
    public zzh zzqi;

    public static zzj[] zzz() {
        if (zzqg == null) {
            synchronized (zzuu.zzbhk) {
                if (zzqg == null) {
                    zzqg = new zzj[0];
                }
            }
        }
        return zzqg;
    }

    public zzj() {
        this.name = "";
        this.zzqh = null;
        this.zzqi = null;
        this.zzbhb = null;
        this.zzbhl = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        String str = this.name;
        if (str == null) {
            if (zzj.name != null) {
                return false;
            }
        } else if (!str.equals(zzj.name)) {
            return false;
        }
        zzl zzl = this.zzqh;
        if (zzl == null) {
            if (zzj.zzqh != null) {
                return false;
            }
        } else if (!zzl.equals(zzj.zzqh)) {
            return false;
        }
        zzh zzh = this.zzqi;
        if (zzh == null) {
            if (zzj.zzqi != null) {
                return false;
            }
        } else if (!zzh.equals(zzj.zzqi)) {
            return false;
        }
        if (this.zzbhb == null || this.zzbhb.isEmpty()) {
            return zzj.zzbhb == null || zzj.zzbhb.isEmpty();
        } else {
            return this.zzbhb.equals(zzj.zzbhb);
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.name;
        int i2 = 0;
        hashCode += str == null ? 0 : str.hashCode();
        zzl zzl = this.zzqh;
        hashCode *= 31;
        if (zzl == null) {
            i = 0;
        } else {
            i = zzl.hashCode();
        }
        hashCode += i;
        zzh zzh = this.zzqi;
        hashCode *= 31;
        if (zzh == null) {
            i = 0;
        } else {
            i = zzh.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        if (!(this.zzbhb == null || this.zzbhb.isEmpty())) {
            i2 = this.zzbhb.hashCode();
        }
        return hashCode + i2;
    }

    public final void zza(zzuo zzuo) {
        String str = this.name;
        if (!(str == null || str.equals(""))) {
            zzuo.zza(1, this.name);
        }
        zzuw zzuw = this.zzqh;
        if (zzuw != null) {
            zzuo.zza(2, zzuw);
        }
        zzuw = this.zzqi;
        if (zzuw != null) {
            zzuo.zza(3, zzuw);
        }
        super.zza(zzuo);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzy() {
        int zzy = super.zzy();
        String str = this.name;
        if (!(str == null || str.equals(""))) {
            zzy += zzuo.zzb(1, this.name);
        }
        zzuw zzuw = this.zzqh;
        if (zzuw != null) {
            zzy += zzuo.zzb(2, zzuw);
        }
        zzuw = this.zzqi;
        return zzuw != null ? zzy + zzuo.zzb(3, zzuw) : zzy;
    }
}
