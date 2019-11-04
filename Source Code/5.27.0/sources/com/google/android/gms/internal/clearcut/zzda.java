package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzda extends zzcy {
    private static final Class<?> zzlv = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzda() {
        super();
    }

    private static <E> List<E> zzb(Object obj, long j) {
        return (List) zzfd.zzo(obj, j);
    }

    /* Access modifiers changed, original: final */
    public final void zza(Object obj, long j) {
        Object zzbu;
        List list = (List) zzfd.zzo(obj, j);
        if (list instanceof zzcx) {
            zzbu = ((zzcx) list).zzbu();
        } else if (!zzlv.isAssignableFrom(list.getClass())) {
            zzbu = Collections.unmodifiableList(list);
        } else {
            return;
        }
        zzfd.zza(obj, j, zzbu);
    }

    /* Access modifiers changed, original: final */
    public final <E> void zza(Object obj, Object obj2, long j) {
        obj2 = zzb(obj2, j);
        int size = obj2.size();
        List zzb = zzb(obj, j);
        if (zzb.isEmpty()) {
            zzb = zzb instanceof zzcx ? new zzcw(size) : new ArrayList(size);
            zzfd.zza(obj, j, (Object) zzb);
        } else {
            List arrayList;
            if (zzlv.isAssignableFrom(zzb.getClass())) {
                arrayList = new ArrayList(zzb.size() + size);
                arrayList.addAll(zzb);
            } else if (zzb instanceof zzfa) {
                arrayList = new zzcw(zzb.size() + size);
                arrayList.addAll((zzfa) zzb);
            }
            zzfd.zza(obj, j, (Object) arrayList);
            zzb = arrayList;
        }
        size = zzb.size();
        int size2 = obj2.size();
        if (size > 0 && size2 > 0) {
            zzb.addAll(obj2);
        }
        if (size > 0) {
            obj2 = zzb;
        }
        zzfd.zza(obj, j, obj2);
    }
}
