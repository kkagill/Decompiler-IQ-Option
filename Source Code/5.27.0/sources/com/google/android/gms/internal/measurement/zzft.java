package com.google.android.gms.internal.measurement;

import java.util.List;

final class zzft extends zzfs {
    private zzft() {
        super();
    }

    /* Access modifiers changed, original: final */
    public final <L> List<L> zza(Object obj, long j) {
        List<L> zzc = zzc(obj, j);
        if (zzc.zzrx()) {
            return zzc;
        }
        int size = zzc.size();
        Object zzap = zzc.zzap(size == 0 ? 10 : size << 1);
        zzhv.zza(obj, j, zzap);
        return zzap;
    }

    /* Access modifiers changed, original: final */
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzry();
    }

    /* Access modifiers changed, original: final */
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzff zzc = zzc(obj, j);
        obj2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = obj2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzrx()) {
                zzc = zzc.zzap(size2 + size);
            }
            zzc.addAll(obj2);
        }
        if (size > 0) {
            obj2 = zzc;
        }
        zzhv.zza(obj, j, obj2);
    }

    private static <E> zzff<E> zzc(Object obj, long j) {
        return (zzff) zzhv.zzp(obj, j);
    }
}
