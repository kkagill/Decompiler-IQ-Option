package com.google.android.gms.internal.firebase_messaging;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class zzp {
    private final ConcurrentHashMap<zzo, List<Throwable>> zzn = new ConcurrentHashMap(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> zzo = new ReferenceQueue();

    zzp() {
    }

    public final List<Throwable> zza(Throwable th, boolean z) {
        Object poll = this.zzo.poll();
        while (poll != null) {
            this.zzn.remove(poll);
            poll = this.zzo.poll();
        }
        List list = (List) this.zzn.get(new zzo(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List list2 = (List) this.zzn.putIfAbsent(new zzo(th, this.zzo), vector);
        return list2 == null ? vector : list2;
    }
}
