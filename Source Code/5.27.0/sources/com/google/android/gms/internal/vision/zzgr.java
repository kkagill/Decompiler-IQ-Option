package com.google.android.gms.internal.vision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzgr extends zzgp {
    private static final Class<?> zzyp = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzgr() {
        super();
    }

    /* Access modifiers changed, original: final */
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* Access modifiers changed, original: final */
    public final void zzb(Object obj, long j) {
        Object zzfu;
        List list = (List) zziu.zzp(obj, j);
        if (list instanceof zzgo) {
            zzfu = ((zzgo) list).zzfu();
        } else if (!zzyp.isAssignableFrom(list.getClass())) {
            if ((list instanceof zzhr) && (list instanceof zzge)) {
                zzge zzge = (zzge) list;
                if (zzge.zzch()) {
                    zzge.zzci();
                }
                return;
            }
            zzfu = Collections.unmodifiableList(list);
        } else {
            return;
        }
        zziu.zza(obj, j, zzfu);
    }

    private static <L> List<L> zza(Object obj, long j, int i) {
        List<L> zzc = zzc(obj, j);
        Object zzgn;
        if (zzc.isEmpty()) {
            if (zzc instanceof zzgo) {
                zzgn = new zzgn(i);
            } else if ((zzc instanceof zzhr) && (zzc instanceof zzge)) {
                zzgn = ((zzge) zzc).zzah(i);
            } else {
                zzgn = new ArrayList(i);
            }
            zziu.zza(obj, j, zzgn);
            return zzgn;
        }
        ArrayList arrayList;
        if (zzyp.isAssignableFrom(zzc.getClass())) {
            arrayList = new ArrayList(zzc.size() + i);
            arrayList.addAll(zzc);
            zziu.zza(obj, j, (Object) arrayList);
        } else if (zzc instanceof zzir) {
            Object arrayList2 = new zzgn(zzc.size() + i);
            arrayList2.addAll((zzir) zzc);
            zziu.zza(obj, j, arrayList2);
        } else if (!(zzc instanceof zzhr) || !(zzc instanceof zzge)) {
            return zzc;
        } else {
            zzge zzge = (zzge) zzc;
            if (zzge.zzch()) {
                return zzc;
            }
            zzgn = zzge.zzah(zzc.size() + i);
            zziu.zza(obj, j, zzgn);
            return zzgn;
        }
        return arrayList2;
    }

    /* Access modifiers changed, original: final */
    public final <E> void zza(Object obj, Object obj2, long j) {
        obj2 = zzc(obj2, j);
        List zza = zza(obj, j, obj2.size());
        int size = zza.size();
        int size2 = obj2.size();
        if (size > 0 && size2 > 0) {
            zza.addAll(obj2);
        }
        if (size > 0) {
            obj2 = zza;
        }
        zziu.zza(obj, j, obj2);
    }

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zziu.zzp(obj, j);
    }
}
