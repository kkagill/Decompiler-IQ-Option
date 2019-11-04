package com.google.android.gms.internal.gtm;

import java.util.List;

final class zzrx extends zzru {
    private zzrx() {
        super();
    }

    /* Access modifiers changed, original: final */
    public final <L> List<L> zza(Object obj, long j) {
        List<L> zzd = zzd(obj, j);
        if (zzd.zzmy()) {
            return zzd;
        }
        int size = zzd.size();
        Object zzaj = zzd.zzaj(size == 0 ? 10 : size << 1);
        zztx.zza(obj, j, zzaj);
        return zzaj;
    }

    /* Access modifiers changed, original: final */
    public final void zzb(Object obj, long j) {
        zzd(obj, j).zzmi();
    }

    /* Access modifiers changed, original: final */
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzrj zzd = zzd(obj, j);
        obj2 = zzd(obj2, j);
        int size = zzd.size();
        int size2 = obj2.size();
        if (size > 0 && size2 > 0) {
            if (!zzd.zzmy()) {
                zzd = zzd.zzaj(size2 + size);
            }
            zzd.addAll(obj2);
        }
        if (size > 0) {
            obj2 = zzd;
        }
        zztx.zza(obj, j, obj2);
    }

    private static <E> zzrj<E> zzd(Object obj, long j) {
        return (zzrj) zztx.zzp(obj, j);
    }
}
