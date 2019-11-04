package com.google.android.gms.internal.vision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzgn extends zzef<String> implements zzgo, RandomAccess {
    private static final zzgn zzyk;
    private static final zzgo zzyl = zzyk;
    private final List<Object> zzym;

    public zzgn() {
        this(10);
    }

    public zzgn(int i) {
        this(new ArrayList(i));
    }

    private zzgn(ArrayList<Object> arrayList) {
        this.zzym = arrayList;
    }

    public final int size() {
        return this.zzym.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        Collection collection2;
        zzcj();
        if (collection2 instanceof zzgo) {
            collection2 = ((zzgo) collection2).zzft();
        }
        boolean addAll = this.zzym.addAll(i, collection2);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zzcj();
        this.zzym.clear();
        this.modCount++;
    }

    public final void zzc(zzeo zzeo) {
        zzcj();
        this.zzym.add(zzeo);
        this.modCount++;
    }

    public final Object getRaw(int i) {
        return this.zzym.get(i);
    }

    private static String zzh(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzeo) {
            return ((zzeo) obj).zzdk();
        }
        return zzga.zzj((byte[]) obj);
    }

    public final List<?> zzft() {
        return Collections.unmodifiableList(this.zzym);
    }

    public final zzgo zzfu() {
        return zzch() ? new zzir(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        zzcj();
        return zzh(this.zzym.set(i, str));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean zzch() {
        return super.zzch();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        zzcj();
        this.zzym.add(i, str);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ zzge zzah(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzym);
            return new zzgn(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzym.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        String zzdk;
        if (obj instanceof zzeo) {
            zzeo zzeo = (zzeo) obj;
            zzdk = zzeo.zzdk();
            if (zzeo.zzdl()) {
                this.zzym.set(i, zzdk);
            }
            return zzdk;
        }
        byte[] bArr = (byte[]) obj;
        zzdk = zzga.zzj(bArr);
        if (zzga.zzi(bArr)) {
            this.zzym.set(i, zzdk);
        }
        return zzdk;
    }

    static {
        zzgn zzgn = new zzgn();
        zzyk = zzgn;
        zzgn.zzci();
    }
}
