package com.google.android.gms.internal.vision;

abstract class zzio<T, B> {
    zzio() {
    }

    public abstract void zza(B b, int i, long j);

    public abstract void zza(B b, int i, zzeo zzeo);

    public abstract void zza(B b, int i, T t);

    public abstract void zza(T t, zzjj zzjj);

    public abstract boolean zza(zzhv zzhv);

    public abstract void zzb(B b, int i, long j);

    public abstract void zzc(B b, int i, int i2);

    public abstract void zzc(T t, zzjj zzjj);

    public abstract void zze(Object obj);

    public abstract void zze(Object obj, T t);

    public abstract void zzf(Object obj, B b);

    public abstract T zzg(T t, T t2);

    public abstract B zzhd();

    public abstract T zzm(B b);

    public abstract int zzp(T t);

    public abstract T zzt(Object obj);

    public abstract B zzu(Object obj);

    public abstract int zzv(T t);

    /* Access modifiers changed, original: final */
    public final boolean zza(B b, zzhv zzhv) {
        int tag = zzhv.getTag();
        int i = tag >>> 3;
        tag &= 7;
        if (tag == 0) {
            zza((Object) b, i, zzhv.zzcq());
            return true;
        } else if (tag == 1) {
            zzb(b, i, zzhv.zzcs());
            return true;
        } else if (tag == 2) {
            zza((Object) b, i, zzhv.zzcw());
            return true;
        } else if (tag == 3) {
            Object zzhd = zzhd();
            int i2 = 4 | (i << 3);
            while (zzhv.zzcn() != Integer.MAX_VALUE) {
                if (!zza(zzhd, zzhv)) {
                    break;
                }
            }
            if (i2 == zzhv.getTag()) {
                zza((Object) b, i, zzm(zzhd));
                return true;
            }
            throw zzgf.zzfl();
        } else if (tag == 4) {
            return false;
        } else {
            if (tag == 5) {
                zzc(b, i, zzhv.zzct());
                return true;
            }
            throw zzgf.zzfm();
        }
    }
}
