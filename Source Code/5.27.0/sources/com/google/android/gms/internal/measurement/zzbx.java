package com.google.android.gms.internal.measurement;

public final class zzbx extends zziq<zzbx> {
    private static volatile zzbx[] zzzr;
    public String name;
    public Boolean zzzs;
    public Boolean zzzt;
    public Integer zzzu;

    public static zzbx[] zzrc() {
        if (zzzr == null) {
            synchronized (zziu.zzaov) {
                if (zzzr == null) {
                    zzzr = new zzbx[0];
                }
            }
        }
        return zzzr;
    }

    public zzbx() {
        this.name = null;
        this.zzzs = null;
        this.zzzt = null;
        this.zzzu = null;
        this.zzaoo = null;
        this.zzaow = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        zzbx zzbx = (zzbx) obj;
        String str = this.name;
        if (str == null) {
            if (zzbx.name != null) {
                return false;
            }
        } else if (!str.equals(zzbx.name)) {
            return false;
        }
        Boolean bool = this.zzzs;
        if (bool == null) {
            if (zzbx.zzzs != null) {
                return false;
            }
        } else if (!bool.equals(zzbx.zzzs)) {
            return false;
        }
        bool = this.zzzt;
        if (bool == null) {
            if (zzbx.zzzt != null) {
                return false;
            }
        } else if (!bool.equals(zzbx.zzzt)) {
            return false;
        }
        Integer num = this.zzzu;
        if (num == null) {
            if (zzbx.zzzu != null) {
                return false;
            }
        } else if (!num.equals(zzbx.zzzu)) {
            return false;
        }
        if (this.zzaoo == null || this.zzaoo.isEmpty()) {
            return zzbx.zzaoo == null || zzbx.zzaoo.isEmpty();
        } else {
            return this.zzaoo.equals(zzbx.zzaoo);
        }
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.name;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.zzzs;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.zzzt;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.zzzu;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        if (!(this.zzaoo == null || this.zzaoo.isEmpty())) {
            i = this.zzaoo.hashCode();
        }
        return hashCode + i;
    }

    public final void zza(zzio zzio) {
        String str = this.name;
        if (str != null) {
            zzio.zzb(1, str);
        }
        Boolean bool = this.zzzs;
        if (bool != null) {
            zzio.zzb(2, bool.booleanValue());
        }
        bool = this.zzzt;
        if (bool != null) {
            zzio.zzb(3, bool.booleanValue());
        }
        Integer num = this.zzzu;
        if (num != null) {
            zzio.zzc(4, num.intValue());
        }
        super.zza(zzio);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzqy() {
        int zzqy = super.zzqy();
        String str = this.name;
        if (str != null) {
            zzqy += zzio.zzc(1, str);
        }
        Boolean bool = this.zzzs;
        if (bool != null) {
            bool.booleanValue();
            zzqy += zzio.zzbi(2) + 1;
        }
        bool = this.zzzt;
        if (bool != null) {
            bool.booleanValue();
            zzqy += zzio.zzbi(3) + 1;
        }
        Integer num = this.zzzu;
        return num != null ? zzqy + zzio.zzg(4, num.intValue()) : zzqy;
    }
}
