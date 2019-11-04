package com.google.android.gms.internal.clearcut;

public final class zzhb extends zzfu<zzhb> implements Cloneable {
    private static volatile zzhb[] zzbkd;
    private String value;
    private String zzbke;

    public zzhb() {
        String str = "";
        this.zzbke = str;
        this.value = str;
        this.zzrj = null;
        this.zzrs = -1;
    }

    public static zzhb[] zzge() {
        if (zzbkd == null) {
            synchronized (zzfy.zzrr) {
                if (zzbkd == null) {
                    zzbkd = new zzhb[0];
                }
            }
        }
        return zzbkd;
    }

    private final zzhb zzgf() {
        try {
            return (zzhb) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* synthetic */ Object clone() {
        return zzgf();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhb)) {
            return false;
        }
        zzhb zzhb = (zzhb) obj;
        String str = this.zzbke;
        if (str == null) {
            if (zzhb.zzbke != null) {
                return false;
            }
        } else if (!str.equals(zzhb.zzbke)) {
            return false;
        }
        str = this.value;
        if (str == null) {
            if (zzhb.value != null) {
                return false;
            }
        } else if (!str.equals(zzhb.value)) {
            return false;
        }
        return (this.zzrj == null || this.zzrj.isEmpty()) ? zzhb.zzrj == null || zzhb.zzrj.isEmpty() : this.zzrj.equals(zzhb.zzrj);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.zzbke;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.value;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        if (!(this.zzrj == null || this.zzrj.isEmpty())) {
            i = this.zzrj.hashCode();
        }
        return hashCode + i;
    }

    public final void zza(zzfs zzfs) {
        String str = this.zzbke;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            zzfs.zza(1, this.zzbke);
        }
        str = this.value;
        if (!(str == null || str.equals(str2))) {
            zzfs.zza(2, this.value);
        }
        super.zza(zzfs);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzen() {
        int zzen = super.zzen();
        String str = this.zzbke;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            zzen += zzfs.zzb(1, this.zzbke);
        }
        str = this.value;
        return (str == null || str.equals(str2)) ? zzen : zzen + zzfs.zzb(2, this.value);
    }

    public final /* synthetic */ zzfu zzeo() {
        return (zzhb) clone();
    }

    public final /* synthetic */ zzfz zzep() {
        return (zzhb) clone();
    }
}
