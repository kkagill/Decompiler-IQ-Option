package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzfq extends zzdj<String> implements zzfp, RandomAccess {
    private static final zzfq zzajq;
    private static final zzfp zzajr = zzajq;
    private final List<Object> zzajs;

    public zzfq() {
        this(10);
    }

    public zzfq(int i) {
        this(new ArrayList(i));
    }

    private zzfq(ArrayList<Object> arrayList) {
        this.zzajs = arrayList;
    }

    public final int size() {
        return this.zzajs.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        Collection collection2;
        zzrz();
        if (collection2 instanceof zzfp) {
            collection2 = ((zzfp) collection2).zzvf();
        }
        boolean addAll = this.zzajs.addAll(i, collection2);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zzrz();
        this.zzajs.clear();
        this.modCount++;
    }

    public final void zzc(zzdp zzdp) {
        zzrz();
        this.zzajs.add(zzdp);
        this.modCount++;
    }

    public final Object zzbw(int i) {
        return this.zzajs.get(i);
    }

    private static String zzl(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdp) {
            return ((zzdp) obj).zzsa();
        }
        return zzez.zzi((byte[]) obj);
    }

    public final List<?> zzvf() {
        return Collections.unmodifiableList(this.zzajs);
    }

    public final zzfp zzvg() {
        return zzrx() ? new zzhu(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        zzrz();
        return zzl(this.zzajs.set(i, str));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean zzrx() {
        return super.zzrx();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        zzrz();
        this.zzajs.add(i, str);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ zzff zzap(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzajs);
            return new zzfq(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzajs.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        String zzsa;
        if (obj instanceof zzdp) {
            zzdp zzdp = (zzdp) obj;
            zzsa = zzdp.zzsa();
            if (zzdp.zzsb()) {
                this.zzajs.set(i, zzsa);
            }
            return zzsa;
        }
        byte[] bArr = (byte[]) obj;
        zzsa = zzez.zzi(bArr);
        if (zzez.zzh(bArr)) {
            this.zzajs.set(i, zzsa);
        }
        return zzsa;
    }

    static {
        zzfq zzfq = new zzfq();
        zzajq = zzfq;
        zzfq.zzry();
    }
}
