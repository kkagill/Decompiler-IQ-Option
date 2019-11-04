package com.google.android.gms.internal.measurement;

abstract class zzhp<T, B> {
    zzhp() {
    }

    public abstract void zza(B b, int i, long j);

    public abstract void zza(B b, int i, zzdp zzdp);

    public abstract void zza(B b, int i, T t);

    public abstract void zza(T t, zzim zzim);

    public abstract boolean zza(zzgy zzgy);

    public abstract void zzb(B b, int i, long j);

    public abstract void zzc(B b, int i, int i2);

    public abstract void zzc(T t, zzim zzim);

    public abstract void zze(Object obj, T t);

    public abstract void zzf(Object obj, B b);

    public abstract T zzg(T t, T t2);

    public abstract void zzj(Object obj);

    public abstract T zzp(B b);

    public abstract int zzt(T t);

    public abstract B zzwp();

    public abstract T zzx(Object obj);

    public abstract B zzy(Object obj);

    public abstract int zzz(T t);

    /* Access modifiers changed, original: final */
    public final boolean zza(B b, zzgy zzgy) {
        int tag = zzgy.getTag();
        int i = tag >>> 3;
        tag &= 7;
        if (tag == 0) {
            zza((Object) b, i, zzgy.zzsi());
            return true;
        } else if (tag == 1) {
            zzb(b, i, zzgy.zzsk());
            return true;
        } else if (tag == 2) {
            zza((Object) b, i, zzgy.zzso());
            return true;
        } else if (tag == 3) {
            Object zzwp = zzwp();
            int i2 = 4 | (i << 3);
            while (zzgy.zzsy() != Integer.MAX_VALUE) {
                if (!zza(zzwp, zzgy)) {
                    break;
                }
            }
            if (i2 == zzgy.getTag()) {
                zza((Object) b, i, zzp(zzwp));
                return true;
            }
            throw zzfi.zzux();
        } else if (tag == 4) {
            return false;
        } else {
            if (tag == 5) {
                zzc(b, i, zzgy.zzsl());
                return true;
            }
            throw zzfi.zzuy();
        }
    }
}
