package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class zzhb implements zzha {
    zzhb() {
    }

    public final Map<?, ?> zzj(Object obj) {
        return (zzgz) obj;
    }

    public final zzgy<?, ?> zzo(Object obj) {
        throw new NoSuchMethodError();
    }

    public final Map<?, ?> zzk(Object obj) {
        return (zzgz) obj;
    }

    public final boolean zzl(Object obj) {
        return !((zzgz) obj).isMutable();
    }

    public final Object zzm(Object obj) {
        ((zzgz) obj).zzci();
        return obj;
    }

    public final Object zzn(Object obj) {
        return zzgz.zzfy().zzfz();
    }

    public final Object zzb(Object obj, Object obj2) {
        obj = (zzgz) obj;
        zzgz zzgz = (zzgz) obj2;
        if (!zzgz.isEmpty()) {
            if (!obj.isMutable()) {
                obj = obj.zzfz();
            }
            obj.zza(zzgz);
        }
        return obj;
    }

    public final int zzb(int i, Object obj, Object obj2) {
        zzgz zzgz = (zzgz) obj;
        if (zzgz.isEmpty()) {
            return 0;
        }
        Iterator it = zzgz.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
