package com.google.android.gms.internal.gtm;

abstract class zztr<T, B> {
    zztr() {
    }

    public abstract void zza(B b, int i, long j);

    public abstract void zza(B b, int i, zzps zzps);

    public abstract void zza(B b, int i, T t);

    public abstract void zza(T t, zzum zzum);

    public abstract boolean zza(zzsy zzsy);

    public abstract T zzaa(B b);

    public abstract int zzad(T t);

    public abstract T zzag(Object obj);

    public abstract B zzah(Object obj);

    public abstract int zzai(T t);

    public abstract void zzb(B b, int i, long j);

    public abstract void zzc(B b, int i, int i2);

    public abstract void zzc(T t, zzum zzum);

    public abstract void zzf(Object obj, T t);

    public abstract void zzg(Object obj, B b);

    public abstract T zzh(T t, T t2);

    public abstract B zzri();

    public abstract void zzt(Object obj);

    /* Access modifiers changed, original: final */
    public final boolean zza(B b, zzsy zzsy) {
        int tag = zzsy.getTag();
        int i = tag >>> 3;
        tag &= 7;
        if (tag == 0) {
            zza((Object) b, i, zzsy.zznk());
            return true;
        } else if (tag == 1) {
            zzb(b, i, zzsy.zznm());
            return true;
        } else if (tag == 2) {
            zza((Object) b, i, zzsy.zznq());
            return true;
        } else if (tag == 3) {
            Object zzri = zzri();
            int i2 = 4 | (i << 3);
            while (zzsy.zzog() != Integer.MAX_VALUE) {
                if (!zza(zzri, zzsy)) {
                    break;
                }
            }
            if (i2 == zzsy.getTag()) {
                zza((Object) b, i, zzaa(zzri));
                return true;
            }
            throw zzrk.zzps();
        } else if (tag == 4) {
            return false;
        } else {
            if (tag == 5) {
                zzc(b, i, zzsy.zznn());
                return true;
            }
            throw zzrk.zzpt();
        }
    }
}
