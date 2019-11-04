package com.google.android.gms.internal.vision;

import java.util.List;

final class zzgs extends zzgp {
    private zzgs() {
        super();
    }

    /* Access modifiers changed, original: final */
    public final <L> List<L> zza(Object obj, long j) {
        List<L> zzd = zzd(obj, j);
        if (zzd.zzch()) {
            return zzd;
        }
        int size = zzd.size();
        Object zzah = zzd.zzah(size == 0 ? 10 : size << 1);
        zziu.zza(obj, j, zzah);
        return zzah;
    }

    /* Access modifiers changed, original: final */
    public final void zzb(Object obj, long j) {
        zzd(obj, j).zzci();
    }

    /* Access modifiers changed, original: final */
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzge zzd = zzd(obj, j);
        obj2 = zzd(obj2, j);
        int size = zzd.size();
        int size2 = obj2.size();
        if (size > 0 && size2 > 0) {
            if (!zzd.zzch()) {
                zzd = zzd.zzah(size2 + size);
            }
            zzd.addAll(obj2);
        }
        if (size > 0) {
            obj2 = zzd;
        }
        zziu.zza(obj, j, obj2);
    }

    private static <E> zzge<E> zzd(Object obj, long j) {
        return (zzge) zziu.zzp(obj, j);
    }
}
