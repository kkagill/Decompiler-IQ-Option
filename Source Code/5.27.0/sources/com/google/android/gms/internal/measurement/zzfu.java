package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzfu extends zzfs {
    private static final Class<?> zzajv = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzfu() {
        super();
    }

    /* Access modifiers changed, original: final */
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* Access modifiers changed, original: final */
    public final void zzb(Object obj, long j) {
        Object zzvg;
        List list = (List) zzhv.zzp(obj, j);
        if (list instanceof zzfp) {
            zzvg = ((zzfp) list).zzvg();
        } else if (!zzajv.isAssignableFrom(list.getClass())) {
            if ((list instanceof zzgu) && (list instanceof zzff)) {
                zzff zzff = (zzff) list;
                if (zzff.zzrx()) {
                    zzff.zzry();
                }
                return;
            }
            zzvg = Collections.unmodifiableList(list);
        } else {
            return;
        }
        zzhv.zza(obj, j, zzvg);
    }

    private static <L> List<L> zza(Object obj, long j, int i) {
        List<L> zzd = zzd(obj, j);
        Object zzfq;
        if (zzd.isEmpty()) {
            if (zzd instanceof zzfp) {
                zzfq = new zzfq(i);
            } else if ((zzd instanceof zzgu) && (zzd instanceof zzff)) {
                zzfq = ((zzff) zzd).zzap(i);
            } else {
                zzfq = new ArrayList(i);
            }
            zzhv.zza(obj, j, zzfq);
            return zzfq;
        }
        ArrayList arrayList;
        if (zzajv.isAssignableFrom(zzd.getClass())) {
            arrayList = new ArrayList(zzd.size() + i);
            arrayList.addAll(zzd);
            zzhv.zza(obj, j, (Object) arrayList);
        } else if (zzd instanceof zzhu) {
            Object arrayList2 = new zzfq(zzd.size() + i);
            arrayList2.addAll((zzhu) zzd);
            zzhv.zza(obj, j, arrayList2);
        } else if (!(zzd instanceof zzgu) || !(zzd instanceof zzff)) {
            return zzd;
        } else {
            zzff zzff = (zzff) zzd;
            if (zzff.zzrx()) {
                return zzd;
            }
            zzfq = zzff.zzap(zzd.size() + i);
            zzhv.zza(obj, j, zzfq);
            return zzfq;
        }
        return arrayList2;
    }

    /* Access modifiers changed, original: final */
    public final <E> void zza(Object obj, Object obj2, long j) {
        obj2 = zzd(obj2, j);
        List zza = zza(obj, j, obj2.size());
        int size = zza.size();
        int size2 = obj2.size();
        if (size > 0 && size2 > 0) {
            zza.addAll(obj2);
        }
        if (size > 0) {
            obj2 = zza;
        }
        zzhv.zza(obj, j, obj2);
    }

    private static <E> List<E> zzd(Object obj, long j) {
        return (List) zzhv.zzp(obj, j);
    }
}
