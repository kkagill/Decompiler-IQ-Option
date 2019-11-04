package com.google.android.gms.internal.clearcut;

final class zzdb extends zzcy {
    private zzdb() {
        super();
    }

    private static <E> zzcn<E> zzc(Object obj, long j) {
        return (zzcn) zzfd.zzo(obj, j);
    }

    /* Access modifiers changed, original: final */
    public final void zza(Object obj, long j) {
        zzc(obj, j).zzv();
    }

    /* Access modifiers changed, original: final */
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzcn zzc = zzc(obj, j);
        obj2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = obj2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzu()) {
                zzc = zzc.zzi(size2 + size);
            }
            zzc.addAll(obj2);
        }
        if (size > 0) {
            obj2 = zzc;
        }
        zzfd.zza(obj, j, obj2);
    }
}
