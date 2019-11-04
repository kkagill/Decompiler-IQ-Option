package com.google.common.collect;

import com.google.common.base.i;
import com.google.common.primitives.c;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class ConcurrentHashMultiset<E> extends d<E> implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient ConcurrentMap<E, AtomicInteger> VH;

    private static class b {
        static final a<ConcurrentHashMultiset> VP = ac.b(ConcurrentHashMultiset.class, "countMap");
    }

    private class a extends b {
        private a() {
            super();
        }

        /* synthetic */ a(ConcurrentHashMultiset concurrentHashMultiset, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: sz */
        public ConcurrentHashMultiset<E> sj() {
            return ConcurrentHashMultiset.this;
        }

        public Object[] toArray() {
            return snapshot().toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return snapshot().toArray(tArr);
        }

        private List<com.google.common.collect.x.a<E>> snapshot() {
            Collection cb = Lists.cb(size());
            t.a(cb, iterator());
            return cb;
        }
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ /* synthetic */ Set sh() {
        return super.sh();
    }

    public static <E> ConcurrentHashMultiset<E> st() {
        return new ConcurrentHashMultiset(new ConcurrentHashMap());
    }

    ConcurrentHashMultiset(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        i.a(concurrentMap.isEmpty(), "the backing map (%s) must be empty", (Object) concurrentMap);
        this.VH = concurrentMap;
    }

    public int count(Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) Maps.a(this.VH, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    public int size() {
        long j = 0;
        for (AtomicInteger atomicInteger : this.VH.values()) {
            j += (long) atomicInteger.get();
        }
        return c.G(j);
    }

    public Object[] toArray() {
        return snapshot().toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return snapshot().toArray(tArr);
    }

    private List<E> snapshot() {
        ArrayList cb = Lists.cb(size());
        for (com.google.common.collect.x.a aVar : entrySet()) {
            Object ur = aVar.ur();
            for (int count = aVar.getCount(); count > 0; count--) {
                cb.add(ur);
            }
        }
        return cb;
    }

    /* JADX WARNING: Missing block: B:19:0x005a, code skipped:
            r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Missing block: B:20:0x0065, code skipped:
            if (r4.VH.putIfAbsent(r5, r2) == null) goto L_0x006f;
     */
    public int e(E r5, int r6) {
        /*
        r4 = this;
        com.google.common.base.i.checkNotNull(r5);
        if (r6 != 0) goto L_0x000a;
    L_0x0005:
        r5 = r4.count(r5);
        return r5;
    L_0x000a:
        r0 = "occurences";
        com.google.common.collect.g.c(r6, r0);
    L_0x000f:
        r0 = r4.VH;
        r0 = com.google.common.collect.Maps.a(r0, r5);
        r0 = (java.util.concurrent.atomic.AtomicInteger) r0;
        r1 = 0;
        if (r0 != 0) goto L_0x002a;
    L_0x001a:
        r0 = r4.VH;
        r2 = new java.util.concurrent.atomic.AtomicInteger;
        r2.<init>(r6);
        r0 = r0.putIfAbsent(r5, r2);
        r0 = (java.util.concurrent.atomic.AtomicInteger) r0;
        if (r0 != 0) goto L_0x002a;
    L_0x0029:
        return r1;
    L_0x002a:
        r2 = r0.get();
        if (r2 == 0) goto L_0x005a;
    L_0x0030:
        r3 = com.google.common.c.b.H(r2, r6);	 Catch:{ ArithmeticException -> 0x003b }
        r3 = r0.compareAndSet(r2, r3);	 Catch:{ ArithmeticException -> 0x003b }
        if (r3 == 0) goto L_0x002a;
    L_0x003a:
        return r2;
    L_0x003b:
        r5 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Overflow adding ";
        r0.append(r1);
        r0.append(r6);
        r6 = " occurrences to a count of ";
        r0.append(r6);
        r0.append(r2);
        r6 = r0.toString();
        r5.<init>(r6);
        throw r5;
    L_0x005a:
        r2 = new java.util.concurrent.atomic.AtomicInteger;
        r2.<init>(r6);
        r3 = r4.VH;
        r3 = r3.putIfAbsent(r5, r2);
        if (r3 == 0) goto L_0x006f;
    L_0x0067:
        r3 = r4.VH;
        r0 = r3.replace(r5, r0, r2);
        if (r0 == 0) goto L_0x000f;
    L_0x006f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentHashMultiset.e(java.lang.Object, int):int");
    }

    public int f(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        g.c(i, "occurences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.a(this.VH, obj);
        if (atomicInteger == null) {
            return 0;
        }
        int i2;
        int max;
        do {
            i2 = atomicInteger.get();
            if (i2 == 0) {
                return 0;
            }
            max = Math.max(0, i2 - i);
        } while (!atomicInteger.compareAndSet(i2, max));
        if (max == 0) {
            this.VH.remove(obj, atomicInteger);
        }
        return i2;
    }

    /* JADX WARNING: Missing block: B:10:0x002c, code skipped:
            if (r6 != 0) goto L_0x002f;
     */
    /* JADX WARNING: Missing block: B:11:0x002e, code skipped:
            return 0;
     */
    /* JADX WARNING: Missing block: B:12:0x002f, code skipped:
            r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Missing block: B:13:0x003a, code skipped:
            if (r4.VH.putIfAbsent(r5, r2) == null) goto L_0x0044;
     */
    public int g(E r5, int r6) {
        /*
        r4 = this;
        com.google.common.base.i.checkNotNull(r5);
        r0 = "count";
        com.google.common.collect.g.b(r6, r0);
    L_0x0008:
        r0 = r4.VH;
        r0 = com.google.common.collect.Maps.a(r0, r5);
        r0 = (java.util.concurrent.atomic.AtomicInteger) r0;
        r1 = 0;
        if (r0 != 0) goto L_0x0026;
    L_0x0013:
        if (r6 != 0) goto L_0x0016;
    L_0x0015:
        return r1;
    L_0x0016:
        r0 = r4.VH;
        r2 = new java.util.concurrent.atomic.AtomicInteger;
        r2.<init>(r6);
        r0 = r0.putIfAbsent(r5, r2);
        r0 = (java.util.concurrent.atomic.AtomicInteger) r0;
        if (r0 != 0) goto L_0x0026;
    L_0x0025:
        return r1;
    L_0x0026:
        r2 = r0.get();
        if (r2 != 0) goto L_0x0045;
    L_0x002c:
        if (r6 != 0) goto L_0x002f;
    L_0x002e:
        return r1;
    L_0x002f:
        r2 = new java.util.concurrent.atomic.AtomicInteger;
        r2.<init>(r6);
        r3 = r4.VH;
        r3 = r3.putIfAbsent(r5, r2);
        if (r3 == 0) goto L_0x0044;
    L_0x003c:
        r3 = r4.VH;
        r0 = r3.replace(r5, r0, r2);
        if (r0 == 0) goto L_0x0008;
    L_0x0044:
        return r1;
    L_0x0045:
        r3 = r0.compareAndSet(r2, r6);
        if (r3 == 0) goto L_0x0026;
    L_0x004b:
        if (r6 != 0) goto L_0x0052;
    L_0x004d:
        r6 = r4.VH;
        r6.remove(r5, r0);
    L_0x0052:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentHashMultiset.g(java.lang.Object, int):int");
    }

    public boolean a(E e, int i, int i2) {
        i.checkNotNull(e);
        g.b(i, "oldCount");
        g.b(i2, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.a(this.VH, e);
        boolean z = false;
        if (atomicInteger != null) {
            int i3 = atomicInteger.get();
            if (i3 == i) {
                if (i3 == 0) {
                    if (i2 == 0) {
                        this.VH.remove(e, atomicInteger);
                        return true;
                    }
                    AtomicInteger atomicInteger2 = new AtomicInteger(i2);
                    if (this.VH.putIfAbsent(e, atomicInteger2) == null || this.VH.replace(e, atomicInteger, atomicInteger2)) {
                        z = true;
                    }
                    return z;
                } else if (atomicInteger.compareAndSet(i3, i2)) {
                    if (i2 == 0) {
                        this.VH.remove(e, atomicInteger);
                    }
                    return true;
                }
            }
            return false;
        } else if (i != 0) {
            return false;
        } else {
            if (i2 == 0) {
                return true;
            }
            if (this.VH.putIfAbsent(e, new AtomicInteger(i2)) == null) {
                z = true;
            }
            return z;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Set<E> si() {
        final Set keySet = this.VH.keySet();
        return new p<E>() {
            /* Access modifiers changed, original: protected */
            /* renamed from: su */
            public Set<E> sv() {
                return keySet;
            }

            public boolean contains(Object obj) {
                return obj != null && h.a(keySet, obj);
            }

            public boolean containsAll(Collection<?> collection) {
                return k(collection);
            }

            public boolean remove(Object obj) {
                return obj != null && h.b(keySet, obj);
            }

            public boolean removeAll(Collection<?> collection) {
                return l(collection);
            }
        };
    }

    /* Access modifiers changed, original: 0000 */
    public Iterator<E> sc() {
        throw new AssertionError("should never be called");
    }

    @Deprecated
    public Set<com.google.common.collect.x.a<E>> rN() {
        return new a(this, null);
    }

    /* Access modifiers changed, original: 0000 */
    public int se() {
        return this.VH.size();
    }

    public boolean isEmpty() {
        return this.VH.isEmpty();
    }

    /* Access modifiers changed, original: 0000 */
    public Iterator<com.google.common.collect.x.a<E>> sd() {
        final AnonymousClass2 anonymousClass2 = new AbstractIterator<com.google.common.collect.x.a<E>>() {
            private final Iterator<Entry<E, AtomicInteger>> VL = ConcurrentHashMultiset.this.VH.entrySet().iterator();

            /* Access modifiers changed, original: protected */
            /* renamed from: sw */
            public com.google.common.collect.x.a<E> pO() {
                while (this.VL.hasNext()) {
                    Entry entry = (Entry) this.VL.next();
                    int i = ((AtomicInteger) entry.getValue()).get();
                    if (i != 0) {
                        return Multisets.k(entry.getKey(), i);
                    }
                }
                return (com.google.common.collect.x.a) pP();
            }
        };
        return new l<com.google.common.collect.x.a<E>>() {
            private com.google.common.collect.x.a<E> VM;

            /* Access modifiers changed, original: protected */
            /* renamed from: sx */
            public Iterator<com.google.common.collect.x.a<E>> qK() {
                return anonymousClass2;
            }

            /* renamed from: sy */
            public com.google.common.collect.x.a<E> next() {
                this.VM = (com.google.common.collect.x.a) super.next();
                return this.VM;
            }

            public void remove() {
                g.ai(this.VM != null);
                ConcurrentHashMultiset.this.g(this.VM.ur(), 0);
                this.VM = null;
            }
        };
    }

    public Iterator<E> iterator() {
        return Multisets.b(this);
    }

    public void clear() {
        this.VH.clear();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.VH);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        b.VP.set((Object) this, (ConcurrentMap) objectInputStream.readObject());
    }
}
