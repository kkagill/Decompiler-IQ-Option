package com.google.android.gms.internal.gtm;

public final class zzop extends zzuq<zzop> {
    public long zzaux;
    public zzk zzauy;
    public zzi zzqk;

    public zzop() {
        this.zzaux = 0;
        this.zzqk = null;
        this.zzauy = null;
        this.zzbhb = null;
        this.zzbhl = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzop)) {
            return false;
        }
        zzop zzop = (zzop) obj;
        if (this.zzaux != zzop.zzaux) {
            return false;
        }
        zzi zzi = this.zzqk;
        if (zzi == null) {
            if (zzop.zzqk != null) {
                return false;
            }
        } else if (!zzi.equals(zzop.zzqk)) {
            return false;
        }
        zzk zzk = this.zzauy;
        if (zzk == null) {
            if (zzop.zzauy != null) {
                return false;
            }
        } else if (!zzk.equals(zzop.zzauy)) {
            return false;
        }
        if (this.zzbhb == null || this.zzbhb.isEmpty()) {
            return zzop.zzbhb == null || zzop.zzbhb.isEmpty();
        } else {
            return this.zzbhb.equals(zzop.zzbhb);
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        long j = this.zzaux;
        hashCode += (int) (j ^ (j >>> 32));
        zzi zzi = this.zzqk;
        hashCode *= 31;
        int i2 = 0;
        if (zzi == null) {
            i = 0;
        } else {
            i = zzi.hashCode();
        }
        hashCode += i;
        zzk zzk = this.zzauy;
        hashCode *= 31;
        if (zzk == null) {
            i = 0;
        } else {
            i = zzk.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        if (!(this.zzbhb == null || this.zzbhb.isEmpty())) {
            i2 = this.zzbhb.hashCode();
        }
        return hashCode + i2;
    }

    public final void zza(zzuo zzuo) {
        zzuo.zzi(1, this.zzaux);
        zzuw zzuw = this.zzqk;
        if (zzuw != null) {
            zzuo.zza(2, zzuw);
        }
        zzuw = this.zzauy;
        if (zzuw != null) {
            zzuo.zza(3, zzuw);
        }
        super.zza(zzuo);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzy() {
        int zzy = super.zzy() + zzuo.zzd(1, this.zzaux);
        zzuw zzuw = this.zzqk;
        if (zzuw != null) {
            zzy += zzuo.zzb(2, zzuw);
        }
        zzuw = this.zzauy;
        return zzuw != null ? zzy + zzuo.zzb(3, zzuw) : zzy;
    }
}
