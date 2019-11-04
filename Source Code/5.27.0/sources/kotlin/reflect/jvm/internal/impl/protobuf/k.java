package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList */
public class k extends AbstractList<String> implements RandomAccess, l {
    public static final l fqy = new k().bLA();
    private final List<Object> aEg;

    public k() {
        this.aEg = new ArrayList();
    }

    public k(l lVar) {
        this.aEg = new ArrayList(lVar.size());
        addAll(lVar);
    }

    public String get(int i) {
        Object obj = this.aEg.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        String bKm;
        if (obj instanceof d) {
            d dVar = (d) obj;
            bKm = dVar.bKm();
            if (dVar.bKn()) {
                this.aEg.set(i, bKm);
            }
            return bKm;
        }
        byte[] bArr = (byte[]) obj;
        bKm = h.ae(bArr);
        if (h.ad(bArr)) {
            this.aEg.set(i, bKm);
        }
        return bKm;
    }

    public int size() {
        return this.aEg.size();
    }

    /* renamed from: j */
    public String set(int i, String str) {
        return dN(this.aEg.set(i, str));
    }

    /* renamed from: k */
    public void add(int i, String str) {
        this.aEg.add(i, str);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        Collection collection2;
        if (collection2 instanceof l) {
            collection2 = ((l) collection2).bLz();
        }
        boolean addAll = this.aEg.addAll(i, collection2);
        this.modCount++;
        return addAll;
    }

    /* renamed from: mi */
    public String remove(int i) {
        Object remove = this.aEg.remove(i);
        this.modCount++;
        return dN(remove);
    }

    public void clear() {
        this.aEg.clear();
        this.modCount++;
    }

    public void f(d dVar) {
        this.aEg.add(dVar);
        this.modCount++;
    }

    public d mj(int i) {
        d dVar = this.aEg.get(i);
        d dO = dO(dVar);
        if (dO != dVar) {
            this.aEg.set(i, dO);
        }
        return dO;
    }

    private static String dN(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            return ((d) obj).bKm();
        }
        return h.ae((byte[]) obj);
    }

    private static d dO(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj instanceof String) {
            return d.mx((String) obj);
        }
        return d.aa((byte[]) obj);
    }

    public List<?> bLz() {
        return Collections.unmodifiableList(this.aEg);
    }

    public l bLA() {
        return new t(this);
    }
}
