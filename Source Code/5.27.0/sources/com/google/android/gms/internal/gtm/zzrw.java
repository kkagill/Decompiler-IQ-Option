package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzrw extends zzru {
    private static final Class<?> zzbcj = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzrw() {
        super();
    }

    /* Access modifiers changed, original: final */
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* Access modifiers changed, original: final */
    public final void zzb(Object obj, long j) {
        Object zzqb;
        List list = (List) zztx.zzp(obj, j);
        if (list instanceof zzrt) {
            zzqb = ((zzrt) list).zzqb();
        } else if (!zzbcj.isAssignableFrom(list.getClass())) {
            if ((list instanceof zzsv) && (list instanceof zzrj)) {
                zzrj zzrj = (zzrj) list;
                if (zzrj.zzmy()) {
                    zzrj.zzmi();
                }
                return;
            }
            zzqb = Collections.unmodifiableList(list);
        } else {
            return;
        }
        zztx.zza(obj, j, zzqb);
    }

    private static <L> List<L> zza(Object obj, long j, int i) {
        List<L> zzc = zzc(obj, j);
        Object zzrs;
        if (zzc.isEmpty()) {
            if (zzc instanceof zzrt) {
                zzrs = new zzrs(i);
            } else if ((zzc instanceof zzsv) && (zzc instanceof zzrj)) {
                zzrs = ((zzrj) zzc).zzaj(i);
            } else {
                zzrs = new ArrayList(i);
            }
            zztx.zza(obj, j, zzrs);
            return zzrs;
        }
        ArrayList arrayList;
        if (zzbcj.isAssignableFrom(zzc.getClass())) {
            arrayList = new ArrayList(zzc.size() + i);
            arrayList.addAll(zzc);
            zztx.zza(obj, j, (Object) arrayList);
        } else if (zzc instanceof zztu) {
            Object arrayList2 = new zzrs(zzc.size() + i);
            arrayList2.addAll((zztu) zzc);
            zztx.zza(obj, j, arrayList2);
        } else if (!(zzc instanceof zzsv) || !(zzc instanceof zzrj)) {
            return zzc;
        } else {
            zzrj zzrj = (zzrj) zzc;
            if (zzrj.zzmy()) {
                return zzc;
            }
            zzrs = zzrj.zzaj(zzc.size() + i);
            zztx.zza(obj, j, zzrs);
            return zzrs;
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
        zztx.zza(obj, j, obj2);
    }

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zztx.zzp(obj, j);
    }
}
