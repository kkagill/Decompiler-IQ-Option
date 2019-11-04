package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzek implements Iterator<Entry<K, V>> {
    private int pos;
    private Iterator<Entry<K, V>> zzor;
    private final /* synthetic */ zzei zzos;

    private zzek(zzei zzei) {
        this.zzos = zzei;
        this.pos = this.zzos.zzom.size();
    }

    /* synthetic */ zzek(zzei zzei, zzej zzej) {
        this(zzei);
    }

    private final Iterator<Entry<K, V>> zzdw() {
        if (this.zzor == null) {
            this.zzor = this.zzos.zzop.entrySet().iterator();
        }
        return this.zzor;
    }

    public final boolean hasNext() {
        int i = this.pos;
        return (i > 0 && i <= this.zzos.zzom.size()) || zzdw().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object next;
        if (zzdw().hasNext()) {
            next = zzdw().next();
        } else {
            List zzb = this.zzos.zzom;
            int i = this.pos - 1;
            this.pos = i;
            next = zzb.get(i);
        }
        return (Entry) next;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
