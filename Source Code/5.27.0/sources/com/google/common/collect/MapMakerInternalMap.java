package com.google.common.collect;

import com.google.common.base.Equivalence;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

class MapMakerInternalMap<K, V, E extends g<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements Serializable, ConcurrentMap<K, V> {
    static final t<Object, Object, c> WW = new t<Object, Object, c>() {
        public t<Object, Object, c> a(ReferenceQueue<Object> referenceQueue, c cVar) {
            return this;
        }

        public void clear() {
        }

        public Object get() {
            return null;
        }

        /* renamed from: tM */
        public c tN() {
            return null;
        }
    };
    private static final long serialVersionUID = 5;
    final transient int To;
    final transient int Tp;
    transient Set<K> Tx;
    transient Collection<V> Ty;
    transient Set<Entry<K, V>> Tz;
    final transient Segment<K, V, E, S>[] WU;
    final transient h<K, V, E, S> WV;
    final int concurrencyLevel;
    final Equivalence<Object> keyEquivalence;

    static abstract class Segment<K, V, E extends g<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {
        volatile int count;
        final MapMakerInternalMap<K, V, E, S> map;
        final int maxSegmentSize;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        volatile AtomicReferenceArray<E> table;
        int threshold;

        public abstract S tT();

        /* Access modifiers changed, original: 0000 */
        public void tU() {
        }

        /* Access modifiers changed, original: 0000 */
        public void tV() {
        }

        Segment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i, int i2) {
            this.map = mapMakerInternalMap;
            this.maxSegmentSize = i2;
            a(bv(i));
        }

        /* Access modifiers changed, original: 0000 */
        public void a(E e, V v) {
            this.map.WV.a(tT(), (g) e, (Object) v);
        }

        /* Access modifiers changed, original: 0000 */
        public E a(E e, E e2) {
            return this.map.WV.a(tT(), (g) e, (g) e2);
        }

        /* Access modifiers changed, original: 0000 */
        public AtomicReferenceArray<E> bv(int i) {
            return new AtomicReferenceArray(i);
        }

        /* Access modifiers changed, original: 0000 */
        public void a(AtomicReferenceArray<E> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            int i = this.threshold;
            if (i == this.maxSegmentSize) {
                this.threshold = i + 1;
            }
            this.table = atomicReferenceArray;
        }

        /* Access modifiers changed, original: 0000 */
        public void ro() {
            if (tryLock()) {
                try {
                    tU();
                } finally {
                    unlock();
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void a(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference poll = referenceQueue.poll();
                if (poll != null) {
                    this.map.a((g) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* Access modifiers changed, original: 0000 */
        public void b(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference poll = referenceQueue.poll();
                if (poll != null) {
                    this.map.a((t) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* Access modifiers changed, original: 0000 */
        public <T> void c(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        /* Access modifiers changed, original: 0000 */
        public E cg(int i) {
            AtomicReferenceArray atomicReferenceArray = this.table;
            return (g) atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* Access modifiers changed, original: 0000 */
        public E i(Object obj, int i) {
            if (this.count != 0) {
                for (g cg = cg(i); cg != null; cg = cg.tO()) {
                    if (cg.getHash() == i) {
                        Object key = cg.getKey();
                        if (key == null) {
                            ro();
                        } else if (this.map.keyEquivalence.e(obj, key)) {
                            return cg;
                        }
                    }
                }
            }
            return null;
        }

        /* Access modifiers changed, original: 0000 */
        public E j(Object obj, int i) {
            return i(obj, i);
        }

        /* Access modifiers changed, original: 0000 */
        public V get(Object obj, int i) {
            try {
                g j = j(obj, i);
                if (j == null) {
                    return null;
                }
                obj = j.getValue();
                if (obj == null) {
                    ro();
                }
                ry();
                return obj;
            } finally {
                ry();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean c(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    g j = j(obj, i);
                    if (!(j == null || j.getValue() == null)) {
                        z = true;
                    }
                    ry();
                    return z;
                }
                ry();
                return false;
            } catch (Throwable th) {
                ry();
            }
        }

        /* Access modifiers changed, original: 0000 */
        /* JADX WARNING: Missing block: B:13:0x003e, code skipped:
            r9 = r4.getValue();
     */
        /* JADX WARNING: Missing block: B:14:0x0042, code skipped:
            if (r9 != null) goto L_0x0055;
     */
        /* JADX WARNING: Missing block: B:15:0x0044, code skipped:
            r8.modCount++;
            a(r4, (java.lang.Object) r11);
            r8.count = r8.count;
     */
        /* JADX WARNING: Missing block: B:17:0x0055, code skipped:
            if (r12 == false) goto L_0x005b;
     */
        /* JADX WARNING: Missing block: B:18:0x0057, code skipped:
            unlock();
     */
        /* JADX WARNING: Missing block: B:19:0x005a, code skipped:
            return r9;
     */
        /* JADX WARNING: Missing block: B:21:?, code skipped:
            r8.modCount++;
            a(r4, (java.lang.Object) r11);
     */
        /* JADX WARNING: Missing block: B:22:0x0064, code skipped:
            unlock();
     */
        /* JADX WARNING: Missing block: B:23:0x0067, code skipped:
            return r9;
     */
        public V a(K r9, int r10, V r11, boolean r12) {
            /*
            r8 = this;
            r8.lock();
            r8.tW();	 Catch:{ all -> 0x008b }
            r0 = r8.count;	 Catch:{ all -> 0x008b }
            r0 = r0 + 1;
            r1 = r8.threshold;	 Catch:{ all -> 0x008b }
            if (r0 <= r1) goto L_0x0015;
        L_0x000e:
            r8.rx();	 Catch:{ all -> 0x008b }
            r0 = r8.count;	 Catch:{ all -> 0x008b }
            r0 = r0 + 1;
        L_0x0015:
            r1 = r8.table;	 Catch:{ all -> 0x008b }
            r2 = r1.length();	 Catch:{ all -> 0x008b }
            r2 = r2 + -1;
            r2 = r2 & r10;
            r3 = r1.get(r2);	 Catch:{ all -> 0x008b }
            r3 = (com.google.common.collect.MapMakerInternalMap.g) r3;	 Catch:{ all -> 0x008b }
            r4 = r3;
        L_0x0025:
            r5 = 0;
            if (r4 == 0) goto L_0x006d;
        L_0x0028:
            r6 = r4.getKey();	 Catch:{ all -> 0x008b }
            r7 = r4.getHash();	 Catch:{ all -> 0x008b }
            if (r7 != r10) goto L_0x0068;
        L_0x0032:
            if (r6 == 0) goto L_0x0068;
        L_0x0034:
            r7 = r8.map;	 Catch:{ all -> 0x008b }
            r7 = r7.keyEquivalence;	 Catch:{ all -> 0x008b }
            r6 = r7.e(r9, r6);	 Catch:{ all -> 0x008b }
            if (r6 == 0) goto L_0x0068;
        L_0x003e:
            r9 = r4.getValue();	 Catch:{ all -> 0x008b }
            if (r9 != 0) goto L_0x0055;
        L_0x0044:
            r9 = r8.modCount;	 Catch:{ all -> 0x008b }
            r9 = r9 + 1;
            r8.modCount = r9;	 Catch:{ all -> 0x008b }
            r8.a(r4, r11);	 Catch:{ all -> 0x008b }
            r9 = r8.count;	 Catch:{ all -> 0x008b }
            r8.count = r9;	 Catch:{ all -> 0x008b }
            r8.unlock();
            return r5;
        L_0x0055:
            if (r12 == 0) goto L_0x005b;
        L_0x0057:
            r8.unlock();
            return r9;
        L_0x005b:
            r10 = r8.modCount;	 Catch:{ all -> 0x008b }
            r10 = r10 + 1;
            r8.modCount = r10;	 Catch:{ all -> 0x008b }
            r8.a(r4, r11);	 Catch:{ all -> 0x008b }
            r8.unlock();
            return r9;
        L_0x0068:
            r4 = r4.tO();	 Catch:{ all -> 0x008b }
            goto L_0x0025;
        L_0x006d:
            r12 = r8.modCount;	 Catch:{ all -> 0x008b }
            r12 = r12 + 1;
            r8.modCount = r12;	 Catch:{ all -> 0x008b }
            r12 = r8.map;	 Catch:{ all -> 0x008b }
            r12 = r12.WV;	 Catch:{ all -> 0x008b }
            r4 = r8.tT();	 Catch:{ all -> 0x008b }
            r9 = r12.a(r4, r9, r10, r3);	 Catch:{ all -> 0x008b }
            r8.a(r9, r11);	 Catch:{ all -> 0x008b }
            r1.set(r2, r9);	 Catch:{ all -> 0x008b }
            r8.count = r0;	 Catch:{ all -> 0x008b }
            r8.unlock();
            return r5;
        L_0x008b:
            r9 = move-exception;
            r8.unlock();
            goto L_0x0091;
        L_0x0090:
            throw r9;
        L_0x0091:
            goto L_0x0090;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap$Segment.a(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        /* Access modifiers changed, original: 0000 */
        public void rx() {
            AtomicReferenceArray atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.count;
                AtomicReferenceArray bv = bv(length << 1);
                this.threshold = (bv.length() * 3) / 4;
                int length2 = bv.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    g gVar = (g) atomicReferenceArray.get(i2);
                    if (gVar != null) {
                        g tO = gVar.tO();
                        int hash = gVar.getHash() & length2;
                        if (tO == null) {
                            bv.set(hash, gVar);
                        } else {
                            g gVar2 = gVar;
                            while (tO != null) {
                                int hash2 = tO.getHash() & length2;
                                if (hash2 != hash) {
                                    gVar2 = tO;
                                    hash = hash2;
                                }
                                tO = tO.tO();
                            }
                            bv.set(hash, gVar2);
                            while (gVar != gVar2) {
                                int hash3 = gVar.getHash() & length2;
                                g a = a(gVar, (g) bv.get(hash3));
                                if (a != null) {
                                    bv.set(hash3, a);
                                } else {
                                    i--;
                                }
                                gVar = gVar.tO();
                            }
                        }
                    }
                }
                this.table = bv;
                this.count = i;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(K k, int i, V v, V v2) {
            lock();
            try {
                tW();
                AtomicReferenceArray atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                g gVar = (g) atomicReferenceArray.get(length);
                for (g gVar2 = gVar; gVar2 != null; gVar2 = gVar2.tO()) {
                    Object key = gVar2.getKey();
                    if (gVar2.getHash() == i && key != null && this.map.keyEquivalence.e(k, key)) {
                        Object value = gVar2.getValue();
                        if (value == null) {
                            if (d(gVar2)) {
                                int i2 = this.count;
                                this.modCount++;
                                i = this.count - 1;
                                atomicReferenceArray.set(length, b(gVar, gVar2));
                                this.count = i;
                            }
                            unlock();
                            return false;
                        } else if (this.map.tL().e(v, value)) {
                            this.modCount++;
                            a(gVar2, (Object) v2);
                            unlock();
                            return true;
                        } else {
                            unlock();
                            return false;
                        }
                    }
                }
                unlock();
                return false;
            } catch (Throwable th) {
                unlock();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public V a(K k, int i, V v) {
            lock();
            try {
                tW();
                AtomicReferenceArray atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                g gVar = (g) atomicReferenceArray.get(length);
                for (g gVar2 = gVar; gVar2 != null; gVar2 = gVar2.tO()) {
                    Object key = gVar2.getKey();
                    if (gVar2.getHash() == i && key != null && this.map.keyEquivalence.e(k, key)) {
                        Object value = gVar2.getValue();
                        if (value == null) {
                            if (d(gVar2)) {
                                int i2 = this.count;
                                this.modCount++;
                                i = this.count - 1;
                                atomicReferenceArray.set(length, b(gVar, gVar2));
                                this.count = i;
                            }
                            unlock();
                            return null;
                        }
                        this.modCount++;
                        a(gVar2, (Object) v);
                        unlock();
                        return value;
                    }
                }
                unlock();
                return null;
            } catch (Throwable th) {
                unlock();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public V d(Object obj, int i) {
            lock();
            try {
                tW();
                int i2 = this.count;
                AtomicReferenceArray atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                g gVar = (g) atomicReferenceArray.get(length);
                for (g gVar2 = gVar; gVar2 != null; gVar2 = gVar2.tO()) {
                    Object key = gVar2.getKey();
                    if (gVar2.getHash() == i && key != null && this.map.keyEquivalence.e(obj, key)) {
                        V value = gVar2.getValue();
                        if (value == null) {
                            if (!d(gVar2)) {
                                unlock();
                                return null;
                            }
                        }
                        this.modCount++;
                        g b = b(gVar, gVar2);
                        int i3 = this.count - 1;
                        atomicReferenceArray.set(length, b);
                        this.count = i3;
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* Access modifiers changed, original: 0000 */
        /* JADX WARNING: Missing block: B:11:0x003f, code skipped:
            if (r8.map.tL().e(r11, r4.getValue()) == false) goto L_0x0043;
     */
        /* JADX WARNING: Missing block: B:12:0x0041, code skipped:
            r5 = true;
     */
        /* JADX WARNING: Missing block: B:14:0x0047, code skipped:
            if (d(r4) == false) goto L_0x005e;
     */
        /* JADX WARNING: Missing block: B:15:0x0049, code skipped:
            r8.modCount++;
            r10 = r8.count - 1;
            r0.set(r1, b(r3, r4));
            r8.count = r10;
     */
        /* JADX WARNING: Missing block: B:17:0x005e, code skipped:
            unlock();
     */
        /* JADX WARNING: Missing block: B:18:0x0061, code skipped:
            return r5;
     */
        public boolean b(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
            r8 = this;
            r8.lock();
            r8.tW();	 Catch:{ all -> 0x006b }
            r0 = r8.count;	 Catch:{ all -> 0x006b }
            r0 = r8.table;	 Catch:{ all -> 0x006b }
            r1 = r0.length();	 Catch:{ all -> 0x006b }
            r2 = 1;
            r1 = r1 - r2;
            r1 = r1 & r10;
            r3 = r0.get(r1);	 Catch:{ all -> 0x006b }
            r3 = (com.google.common.collect.MapMakerInternalMap.g) r3;	 Catch:{ all -> 0x006b }
            r4 = r3;
        L_0x0018:
            r5 = 0;
            if (r4 == 0) goto L_0x0067;
        L_0x001b:
            r6 = r4.getKey();	 Catch:{ all -> 0x006b }
            r7 = r4.getHash();	 Catch:{ all -> 0x006b }
            if (r7 != r10) goto L_0x0062;
        L_0x0025:
            if (r6 == 0) goto L_0x0062;
        L_0x0027:
            r7 = r8.map;	 Catch:{ all -> 0x006b }
            r7 = r7.keyEquivalence;	 Catch:{ all -> 0x006b }
            r6 = r7.e(r9, r6);	 Catch:{ all -> 0x006b }
            if (r6 == 0) goto L_0x0062;
        L_0x0031:
            r9 = r4.getValue();	 Catch:{ all -> 0x006b }
            r10 = r8.map;	 Catch:{ all -> 0x006b }
            r10 = r10.tL();	 Catch:{ all -> 0x006b }
            r9 = r10.e(r11, r9);	 Catch:{ all -> 0x006b }
            if (r9 == 0) goto L_0x0043;
        L_0x0041:
            r5 = 1;
            goto L_0x0049;
        L_0x0043:
            r9 = d(r4);	 Catch:{ all -> 0x006b }
            if (r9 == 0) goto L_0x005e;
        L_0x0049:
            r9 = r8.modCount;	 Catch:{ all -> 0x006b }
            r9 = r9 + r2;
            r8.modCount = r9;	 Catch:{ all -> 0x006b }
            r9 = r8.b(r3, r4);	 Catch:{ all -> 0x006b }
            r10 = r8.count;	 Catch:{ all -> 0x006b }
            r10 = r10 - r2;
            r0.set(r1, r9);	 Catch:{ all -> 0x006b }
            r8.count = r10;	 Catch:{ all -> 0x006b }
            r8.unlock();
            return r5;
        L_0x005e:
            r8.unlock();
            return r5;
        L_0x0062:
            r4 = r4.tO();	 Catch:{ all -> 0x006b }
            goto L_0x0018;
        L_0x0067:
            r8.unlock();
            return r5;
        L_0x006b:
            r9 = move-exception;
            r8.unlock();
            goto L_0x0071;
        L_0x0070:
            throw r9;
        L_0x0071:
            goto L_0x0070;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap$Segment.b(java.lang.Object, int, java.lang.Object):boolean");
        }

        /* Access modifiers changed, original: 0000 */
        public void clear() {
            if (this.count != 0) {
                lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    tV();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public E b(E e, E e2) {
            int i = this.count;
            g tO = e2.tO();
            g e3;
            while (e3 != e2) {
                g a = a(e3, tO);
                if (a != null) {
                    tO = a;
                } else {
                    i--;
                }
                e3 = e3.tO();
            }
            this.count = i;
            return tO;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(E e, int i) {
            lock();
            try {
                int i2 = this.count;
                AtomicReferenceArray atomicReferenceArray = this.table;
                boolean z = true;
                i &= atomicReferenceArray.length() - z;
                E e2 = (g) atomicReferenceArray.get(i);
                for (E e3 = e2; e3 != null; e3 = e3.tO()) {
                    if (e3 == e) {
                        this.modCount += z;
                        g b = b(e2, e3);
                        int i3 = this.count - z;
                        atomicReferenceArray.set(i, b);
                        this.count = i3;
                        return z;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(K k, int i, t<K, V, E> tVar) {
            lock();
            try {
                int i2 = this.count;
                AtomicReferenceArray atomicReferenceArray = this.table;
                boolean z = true;
                int length = (atomicReferenceArray.length() - z) & i;
                g gVar = (g) atomicReferenceArray.get(length);
                g gVar2 = gVar;
                while (gVar2 != null) {
                    Object key = gVar2.getKey();
                    if (gVar2.getHash() != i || key == null || !this.map.keyEquivalence.e(k, key)) {
                        gVar2 = gVar2.tO();
                    } else if (((s) gVar2).ub() == tVar) {
                        this.modCount += z;
                        i = this.count - z;
                        atomicReferenceArray.set(length, b(gVar, gVar2));
                        this.count = i;
                        return z;
                    } else {
                        unlock();
                        return false;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        static <K, V, E extends g<K, V, E>> boolean d(E e) {
            return e.getValue() == null;
        }

        /* Access modifiers changed, original: 0000 */
        public V b(E e) {
            if (e.getKey() == null) {
                ro();
                return null;
            }
            Object value = e.getValue();
            if (value != null) {
                return value;
            }
            ro();
            return null;
        }

        /* Access modifiers changed, original: 0000 */
        public void ry() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                tX();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void tW() {
            tY();
        }

        /* Access modifiers changed, original: 0000 */
        public void tX() {
            tY();
        }

        /* Access modifiers changed, original: 0000 */
        public void tY() {
            if (tryLock()) {
                try {
                    tU();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }
    }

    enum Strength {
        STRONG {
            /* Access modifiers changed, original: 0000 */
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.pT();
            }
        },
        WEAK {
            /* Access modifiers changed, original: 0000 */
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.pU();
            }
        };

        public abstract Equivalence<Object> defaultEquivalence();
    }

    abstract class f<T> implements Iterator<T> {
        int TU;
        int TX = -1;
        AtomicReferenceArray<E> Ua;
        Segment<K, V, E, S> Xa;
        E Xb;
        v Xc;
        v Xd;

        f() {
            this.TU = MapMakerInternalMap.this.WU.length - 1;
            advance();
        }

        /* Access modifiers changed, original: final */
        public final void advance() {
            this.Xc = null;
            if (!rj() && !rk()) {
                while (this.TU >= 0) {
                    Segment[] segmentArr = MapMakerInternalMap.this.WU;
                    int i = this.TU;
                    this.TU = i - 1;
                    this.Xa = segmentArr[i];
                    if (this.Xa.count != 0) {
                        this.Ua = this.Xa.table;
                        this.TX = this.Ua.length() - 1;
                        if (rk()) {
                            break;
                        }
                    }
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean rj() {
            g gVar = this.Xb;
            if (gVar != null) {
                while (true) {
                    this.Xb = gVar.tO();
                    gVar = this.Xb;
                    if (gVar == null) {
                        break;
                    } else if (c(gVar)) {
                        return true;
                    } else {
                        gVar = this.Xb;
                    }
                }
            }
            return false;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean rk() {
            while (true) {
                int i = this.TX;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray atomicReferenceArray = this.Ua;
                this.TX = i - 1;
                g gVar = (g) atomicReferenceArray.get(i);
                this.Xb = gVar;
                if (gVar == null || !(c(this.Xb) || rj())) {
                }
            }
            return true;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean c(E e) {
            try {
                boolean z;
                Object key = e.getKey();
                Object b = MapMakerInternalMap.this.b(e);
                if (b != null) {
                    this.Xc = new v(key, b);
                    z = true;
                } else {
                    z = false;
                }
                this.Xa.ry();
                return z;
            } catch (Throwable th) {
                this.Xa.ry();
            }
        }

        public boolean hasNext() {
            return this.Xc != null;
        }

        /* Access modifiers changed, original: 0000 */
        public v tQ() {
            v vVar = this.Xc;
            if (vVar != null) {
                this.Xd = vVar;
                advance();
                return this.Xd;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            g.ai(this.Xd != null);
            MapMakerInternalMap.this.remove(this.Xd.getKey());
            this.Xd = null;
        }
    }

    interface g<K, V, E extends g<K, V, E>> {
        int getHash();

        K getKey();

        V getValue();

        E tO();
    }

    interface h<K, V, E extends g<K, V, E>, S extends Segment<K, V, E, S>> {
        S a(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i, int i2);

        E a(S s, E e, E e2);

        E a(S s, K k, int i, E e);

        void a(S s, E e, V v);

        Strength tR();

        Strength tS();
    }

    private static abstract class k<E> extends AbstractSet<E> {
        private k() {
        }

        /* synthetic */ k(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Object[] toArray() {
            return MapMakerInternalMap.f(this).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return MapMakerInternalMap.f(this).toArray(tArr);
        }
    }

    final class p extends AbstractCollection<V> {
        p() {
        }

        public Iterator<V> iterator() {
            return new o();
        }

        public int size() {
            return MapMakerInternalMap.this.size();
        }

        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        public Object[] toArray() {
            return MapMakerInternalMap.f(this).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return MapMakerInternalMap.f(this).toArray(tArr);
        }
    }

    interface t<K, V, E extends g<K, V, E>> {
        t<K, V, E> a(ReferenceQueue<V> referenceQueue, E e);

        void clear();

        V get();

        E tN();
    }

    static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, l<K, V>, StrongKeyStrongValueSegment<K, V>> {
        /* Access modifiers changed, original: 0000 */
        /* renamed from: ua */
        public StrongKeyStrongValueSegment<K, V> tT() {
            return this;
        }

        StrongKeyStrongValueSegment(MapMakerInternalMap<K, V, l<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }
    }

    static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, m<K, V>, StrongKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<V> queueForValues = new ReferenceQueue();

        /* Access modifiers changed, original: 0000 */
        /* renamed from: ud */
        public StrongKeyWeakValueSegment<K, V> tT() {
            return this;
        }

        StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, m<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        /* Access modifiers changed, original: 0000 */
        public void tU() {
            b(this.queueForValues);
        }

        /* Access modifiers changed, original: 0000 */
        public void tV() {
            c(this.queueForValues);
        }
    }

    static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, q<K, V>, WeakKeyStrongValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys = new ReferenceQueue();

        /* Access modifiers changed, original: 0000 */
        /* renamed from: uf */
        public WeakKeyStrongValueSegment<K, V> tT() {
            return this;
        }

        WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, q<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        /* Access modifiers changed, original: 0000 */
        public void tU() {
            a(this.queueForKeys);
        }

        /* Access modifiers changed, original: 0000 */
        public void tV() {
            c(this.queueForKeys);
        }
    }

    static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, r<K, V>, WeakKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys = new ReferenceQueue();
        private final ReferenceQueue<V> queueForValues = new ReferenceQueue();

        /* Access modifiers changed, original: 0000 */
        /* renamed from: uh */
        public WeakKeyWeakValueSegment<K, V> tT() {
            return this;
        }

        WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, r<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        /* Access modifiers changed, original: 0000 */
        public void tU() {
            a(this.queueForKeys);
            b(this.queueForValues);
        }

        /* Access modifiers changed, original: 0000 */
        public void tV() {
            c(this.queueForKeys);
        }
    }

    static abstract class a<K, V, E extends g<K, V, E>> implements g<K, V, E> {
        final E WY;
        final int hash;
        final K key;

        a(K k, int i, E e) {
            this.key = k;
            this.hash = i;
            this.WY = e;
        }

        public K getKey() {
            return this.key;
        }

        public int getHash() {
            return this.hash;
        }

        public E tO() {
            return this.WY;
        }
    }

    static abstract class b<K, V, E extends g<K, V, E>> extends WeakReference<K> implements g<K, V, E> {
        final E WY;
        final int hash;

        b(ReferenceQueue<K> referenceQueue, K k, int i, E e) {
            super(k, referenceQueue);
            this.hash = i;
            this.WY = e;
        }

        public K getKey() {
            return get();
        }

        public int getHash() {
            return this.hash;
        }

        public E tO() {
            return this.WY;
        }
    }

    static final class c implements g<Object, Object, c> {
        private c() {
            throw new AssertionError();
        }

        /* renamed from: tP */
        public c tO() {
            throw new AssertionError();
        }

        public int getHash() {
            throw new AssertionError();
        }

        public Object getKey() {
            throw new AssertionError();
        }

        public Object getValue() {
            throw new AssertionError();
        }
    }

    final class d extends f<Entry<K, V>> {
        d() {
            super();
        }

        public Entry<K, V> next() {
            return tQ();
        }
    }

    final class e extends k<Entry<K, V>> {
        e() {
            super();
        }

        public Iterator<Entry<K, V>> iterator() {
            return new d();
        }

        public boolean contains(Object obj) {
            boolean z = false;
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null) {
                return false;
            }
            key = MapMakerInternalMap.this.get(key);
            if (key != null && MapMakerInternalMap.this.tL().e(entry.getValue(), key)) {
                z = true;
            }
            return z;
        }

        public boolean remove(Object obj) {
            boolean z = false;
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key != null && MapMakerInternalMap.this.remove(key, entry.getValue())) {
                z = true;
            }
            return z;
        }

        public int size() {
            return MapMakerInternalMap.this.size();
        }

        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public void clear() {
            MapMakerInternalMap.this.clear();
        }
    }

    final class i extends f<K> {
        i() {
            super();
        }

        public K next() {
            return tQ().getKey();
        }
    }

    final class j extends k<K> {
        j() {
            super();
        }

        public Iterator<K> iterator() {
            return new i();
        }

        public int size() {
            return MapMakerInternalMap.this.size();
        }

        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        public boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        public void clear() {
            MapMakerInternalMap.this.clear();
        }
    }

    interface n extends g {
    }

    final class o extends f<V> {
        o() {
            super();
        }

        public V next() {
            return tQ().getValue();
        }
    }

    interface s<K, V, E extends g<K, V, E>> extends g<K, V, E> {
        t<K, V, E> ub();
    }

    static final class u<K, V, E extends g<K, V, E>> extends WeakReference<V> implements t<K, V, E> {
        final E Xj;

        u(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.Xj = e;
        }

        public E tN() {
            return this.Xj;
        }

        public t<K, V, E> a(ReferenceQueue<V> referenceQueue, E e) {
            return new u(referenceQueue, get(), e);
        }
    }

    final class v extends b<K, V> {
        final K key;
        V value;

        v(K k, V v) {
            this.key = k;
            this.value = v;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (this.key.equals(entry.getKey()) && this.value.equals(entry.getValue())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.key.hashCode() ^ this.value.hashCode();
        }

        public V setValue(V v) {
            Object put = MapMakerInternalMap.this.put(this.key, v);
            this.value = v;
            return put;
        }
    }

    static final class l<K, V> extends a<K, V, l<K, V>> implements n<K, V, l<K, V>> {
        private volatile V value = null;

        static final class a<K, V> implements h<K, V, l<K, V>, StrongKeyStrongValueSegment<K, V>> {
            private static final a<?, ?> Xe = new a();

            a() {
            }

            static <K, V> a<K, V> tZ() {
                return Xe;
            }

            public Strength tR() {
                return Strength.STRONG;
            }

            public Strength tS() {
                return Strength.STRONG;
            }

            /* renamed from: b */
            public StrongKeyStrongValueSegment<K, V> a(MapMakerInternalMap<K, V, l<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyStrongValueSegment(mapMakerInternalMap, i, i2);
            }

            public l<K, V> a(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, l<K, V> lVar, l<K, V> lVar2) {
                return lVar.a(lVar2);
            }

            public void a(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, l<K, V> lVar, V v) {
                lVar.setValue(v);
            }

            public l<K, V> a(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, K k, int i, l<K, V> lVar) {
                return new l(k, i, lVar);
            }
        }

        l(K k, int i, l<K, V> lVar) {
            super(k, i, lVar);
        }

        public V getValue() {
            return this.value;
        }

        /* Access modifiers changed, original: 0000 */
        public void setValue(V v) {
            this.value = v;
        }

        /* Access modifiers changed, original: 0000 */
        public l<K, V> a(l<K, V> lVar) {
            l lVar2 = new l(this.key, this.hash, lVar);
            lVar2.value = this.value;
            return lVar2;
        }
    }

    static final class m<K, V> extends a<K, V, m<K, V>> implements s<K, V, m<K, V>> {
        private volatile t<K, V, m<K, V>> Xf = MapMakerInternalMap.tK();

        static final class a<K, V> implements h<K, V, m<K, V>, StrongKeyWeakValueSegment<K, V>> {
            private static final a<?, ?> Xg = new a();

            a() {
            }

            static <K, V> a<K, V> uc() {
                return Xg;
            }

            public Strength tR() {
                return Strength.STRONG;
            }

            public Strength tS() {
                return Strength.WEAK;
            }

            /* renamed from: c */
            public StrongKeyWeakValueSegment<K, V> a(MapMakerInternalMap<K, V, m<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyWeakValueSegment(mapMakerInternalMap, i, i2);
            }

            public m<K, V> a(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, m<K, V> mVar, m<K, V> mVar2) {
                if (Segment.d(mVar)) {
                    return null;
                }
                return mVar.a(strongKeyWeakValueSegment.queueForValues, (m) mVar2);
            }

            public void a(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, m<K, V> mVar, V v) {
                mVar.a((Object) v, strongKeyWeakValueSegment.queueForValues);
            }

            public m<K, V> a(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, K k, int i, m<K, V> mVar) {
                return new m(k, i, mVar);
            }
        }

        m(K k, int i, m<K, V> mVar) {
            super(k, i, mVar);
        }

        public V getValue() {
            return this.Xf.get();
        }

        /* Access modifiers changed, original: 0000 */
        public void a(V v, ReferenceQueue<V> referenceQueue) {
            t tVar = this.Xf;
            this.Xf = new u(referenceQueue, v, this);
            tVar.clear();
        }

        /* Access modifiers changed, original: 0000 */
        public m<K, V> a(ReferenceQueue<V> referenceQueue, m<K, V> mVar) {
            m mVar2 = new m(this.key, this.hash, mVar);
            mVar2.Xf = this.Xf.a(referenceQueue, mVar2);
            return mVar2;
        }

        public t<K, V, m<K, V>> ub() {
            return this.Xf;
        }
    }

    static final class q<K, V> extends b<K, V, q<K, V>> implements n<K, V, q<K, V>> {
        private volatile V value = null;

        static final class a<K, V> implements h<K, V, q<K, V>, WeakKeyStrongValueSegment<K, V>> {
            private static final a<?, ?> Xh = new a();

            a() {
            }

            static <K, V> a<K, V> ue() {
                return Xh;
            }

            public Strength tR() {
                return Strength.WEAK;
            }

            public Strength tS() {
                return Strength.STRONG;
            }

            /* renamed from: d */
            public WeakKeyStrongValueSegment<K, V> a(MapMakerInternalMap<K, V, q<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyStrongValueSegment(mapMakerInternalMap, i, i2);
            }

            public q<K, V> a(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, q<K, V> qVar, q<K, V> qVar2) {
                if (qVar.getKey() == null) {
                    return null;
                }
                return qVar.a(weakKeyStrongValueSegment.queueForKeys, qVar2);
            }

            public void a(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, q<K, V> qVar, V v) {
                qVar.setValue(v);
            }

            public q<K, V> a(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, K k, int i, q<K, V> qVar) {
                return new q(weakKeyStrongValueSegment.queueForKeys, k, i, qVar);
            }
        }

        q(ReferenceQueue<K> referenceQueue, K k, int i, q<K, V> qVar) {
            super(referenceQueue, k, i, qVar);
        }

        public V getValue() {
            return this.value;
        }

        /* Access modifiers changed, original: 0000 */
        public void setValue(V v) {
            this.value = v;
        }

        /* Access modifiers changed, original: 0000 */
        public q<K, V> a(ReferenceQueue<K> referenceQueue, q<K, V> qVar) {
            q qVar2 = new q(referenceQueue, getKey(), this.hash, qVar);
            qVar2.setValue(this.value);
            return qVar2;
        }
    }

    static final class r<K, V> extends b<K, V, r<K, V>> implements s<K, V, r<K, V>> {
        private volatile t<K, V, r<K, V>> Xf = MapMakerInternalMap.tK();

        static final class a<K, V> implements h<K, V, r<K, V>, WeakKeyWeakValueSegment<K, V>> {
            private static final a<?, ?> Xi = new a();

            a() {
            }

            static <K, V> a<K, V> ug() {
                return Xi;
            }

            public Strength tR() {
                return Strength.WEAK;
            }

            public Strength tS() {
                return Strength.WEAK;
            }

            /* renamed from: e */
            public WeakKeyWeakValueSegment<K, V> a(MapMakerInternalMap<K, V, r<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyWeakValueSegment(mapMakerInternalMap, i, i2);
            }

            public r<K, V> a(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, r<K, V> rVar, r<K, V> rVar2) {
                if (rVar.getKey() == null || Segment.d(rVar)) {
                    return null;
                }
                return rVar.a(weakKeyWeakValueSegment.queueForKeys, weakKeyWeakValueSegment.queueForValues, rVar2);
            }

            public void a(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, r<K, V> rVar, V v) {
                rVar.a(v, weakKeyWeakValueSegment.queueForValues);
            }

            public r<K, V> a(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, K k, int i, r<K, V> rVar) {
                return new r(weakKeyWeakValueSegment.queueForKeys, k, i, rVar);
            }
        }

        r(ReferenceQueue<K> referenceQueue, K k, int i, r<K, V> rVar) {
            super(referenceQueue, k, i, rVar);
        }

        public V getValue() {
            return this.Xf.get();
        }

        /* Access modifiers changed, original: 0000 */
        public r<K, V> a(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, r<K, V> rVar) {
            r rVar2 = new r(referenceQueue, getKey(), this.hash, rVar);
            rVar2.Xf = this.Xf.a(referenceQueue2, rVar2);
            return rVar2;
        }

        /* Access modifiers changed, original: 0000 */
        public void a(V v, ReferenceQueue<V> referenceQueue) {
            t tVar = this.Xf;
            this.Xf = new u(referenceQueue, v, this);
            tVar.clear();
        }

        public t<K, V, r<K, V>> ub() {
            return this.Xf;
        }
    }

    static abstract class AbstractSerializationProxy<K, V> extends k<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        transient ConcurrentMap<K, V> WX;
        final int concurrencyLevel;
        final Equivalence<Object> keyEquivalence;
        final Strength keyStrength;
        final Equivalence<Object> valueEquivalence;
        final Strength valueStrength;

        AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.concurrencyLevel = i;
            this.WX = concurrentMap;
        }

        /* Access modifiers changed, original: protected */
        /* renamed from: sE */
        public ConcurrentMap<K, V> sF() {
            return this.WX;
        }

        /* Access modifiers changed, original: 0000 */
        public void a(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeInt(this.WX.size());
            for (Entry entry : this.WX.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }

        /* Access modifiers changed, original: 0000 */
        public v a(ObjectInputStream objectInputStream) {
            return new v().cc(objectInputStream.readInt()).a(this.keyStrength).b(this.valueStrength).c(this.keyEquivalence).cd(this.concurrencyLevel);
        }

        /* Access modifiers changed, original: 0000 */
        public void b(ObjectInputStream objectInputStream) {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject != null) {
                    this.WX.put(readObject, objectInputStream.readObject());
                } else {
                    return;
                }
            }
        }
    }

    private static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        SerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(strength, strength2, equivalence, equivalence2, i, concurrentMap);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            a(objectOutputStream);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.WX = a(objectInputStream).tJ();
            b(objectInputStream);
        }

        private Object readResolve() {
            return this.WX;
        }
    }

    static int bs(int i) {
        i += (i << 15) ^ -12931;
        i ^= i >>> 10;
        i += i << 3;
        i ^= i >>> 6;
        i += (i << 2) + (i << 14);
        return i ^ (i >>> 16);
    }

    private MapMakerInternalMap(v vVar, h<K, V, E, S> hVar) {
        this.concurrencyLevel = Math.min(vVar.qu(), 65536);
        this.keyEquivalence = vVar.qr();
        this.WV = hVar;
        int min = Math.min(vVar.qt(), 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.concurrencyLevel) {
            i4++;
            i3 <<= 1;
        }
        this.Tp = 32 - i4;
        this.To = i3 - 1;
        this.WU = cf(i3);
        i4 = min / i3;
        if (i3 * i4 < min) {
            i4++;
        }
        while (i2 < i4) {
            i2 <<= 1;
        }
        while (true) {
            Segment[] segmentArr = this.WU;
            if (i < segmentArr.length) {
                segmentArr[i] = B(i2, -1);
                i++;
            } else {
                return;
            }
        }
    }

    static <K, V> MapMakerInternalMap<K, V, ? extends g<K, V, ?>, ?> a(v vVar) {
        if (vVar.tH() == Strength.STRONG && vVar.tI() == Strength.STRONG) {
            return new MapMakerInternalMap(vVar, a.tZ());
        }
        if (vVar.tH() == Strength.STRONG && vVar.tI() == Strength.WEAK) {
            return new MapMakerInternalMap(vVar, a.uc());
        }
        if (vVar.tH() == Strength.WEAK && vVar.tI() == Strength.STRONG) {
            return new MapMakerInternalMap(vVar, a.ue());
        }
        if (vVar.tH() == Strength.WEAK && vVar.tI() == Strength.WEAK) {
            return new MapMakerInternalMap(vVar, a.ug());
        }
        throw new AssertionError();
    }

    static <K, V, E extends g<K, V, E>> t<K, V, E> tK() {
        return WW;
    }

    /* Access modifiers changed, original: 0000 */
    public int af(Object obj) {
        return bs(this.keyEquivalence.af(obj));
    }

    /* Access modifiers changed, original: 0000 */
    public void a(t<K, V, E> tVar) {
        g tN = tVar.tN();
        int hash = tN.getHash();
        ce(hash).a(tN.getKey(), hash, (t) tVar);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(E e) {
        int hash = e.getHash();
        ce(hash).a((g) e, hash);
    }

    /* Access modifiers changed, original: 0000 */
    public Segment<K, V, E, S> ce(int i) {
        return this.WU[(i >>> this.Tp) & this.To];
    }

    /* Access modifiers changed, original: 0000 */
    public Segment<K, V, E, S> B(int i, int i2) {
        return this.WV.a(this, i, i2);
    }

    /* Access modifiers changed, original: 0000 */
    public V b(E e) {
        if (e.getKey() == null) {
            return null;
        }
        Object value = e.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    /* Access modifiers changed, original: final */
    public final Segment<K, V, E, S>[] cf(int i) {
        return new Segment[i];
    }

    /* Access modifiers changed, original: 0000 */
    public Equivalence<Object> tL() {
        return this.WV.tS().defaultEquivalence();
    }

    public boolean isEmpty() {
        int i;
        Segment[] segmentArr = this.WU;
        long j = 0;
        for (i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].count != 0) {
                return false;
            }
            j += (long) segmentArr[i].modCount;
        }
        if (j != 0) {
            for (i = 0; i < segmentArr.length; i++) {
                if (segmentArr[i].count != 0) {
                    return false;
                }
                j -= (long) segmentArr[i].modCount;
            }
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        long j = 0;
        for (Segment segment : this.WU) {
            j += (long) segment.count;
        }
        return com.google.common.primitives.c.G(j);
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int af = af(obj);
        return ce(af).get(obj, af);
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int af = af(obj);
        return ce(af).c(obj, af);
    }

    public boolean containsValue(Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        Segment[] segmentArr = this.WU;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            for (Segment segment : segmentArr) {
                int i2 = segment.count;
                AtomicReferenceArray atomicReferenceArray = segment.table;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (g gVar = (g) atomicReferenceArray.get(i3); gVar != null; gVar = gVar.tO()) {
                        Object b = segment.b(gVar);
                        if (b != null && tL().e(obj2, b)) {
                            return true;
                        }
                    }
                }
                j2 += (long) segment.modCount;
            }
            if (j2 == j) {
                break;
            }
            i++;
            j = j2;
        }
        return false;
    }

    public V put(K k, V v) {
        com.google.common.base.i.checkNotNull(k);
        com.google.common.base.i.checkNotNull(v);
        int af = af(k);
        return ce(af).a((Object) k, af, (Object) v, false);
    }

    public V putIfAbsent(K k, V v) {
        com.google.common.base.i.checkNotNull(k);
        com.google.common.base.i.checkNotNull(v);
        int af = af(k);
        return ce(af).a((Object) k, af, (Object) v, true);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int af = af(obj);
        return ce(af).d(obj, af);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int af = af(obj);
        return ce(af).b(obj, af, obj2);
    }

    public boolean replace(K k, V v, V v2) {
        com.google.common.base.i.checkNotNull(k);
        com.google.common.base.i.checkNotNull(v2);
        if (v == null) {
            return false;
        }
        int af = af(k);
        return ce(af).a((Object) k, af, (Object) v, (Object) v2);
    }

    public V replace(K k, V v) {
        com.google.common.base.i.checkNotNull(k);
        com.google.common.base.i.checkNotNull(v);
        int af = af(k);
        return ce(af).a((Object) k, af, (Object) v);
    }

    public void clear() {
        for (Segment clear : this.WU) {
            clear.clear();
        }
    }

    public Set<K> keySet() {
        Set<K> set = this.Tx;
        if (set != null) {
            return set;
        }
        j jVar = new j();
        this.Tx = jVar;
        return jVar;
    }

    public Collection<V> values() {
        Collection<V> collection = this.Ty;
        if (collection != null) {
            return collection;
        }
        p pVar = new p();
        this.Ty = pVar;
        return pVar;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.Tz;
        if (set != null) {
            return set;
        }
        e eVar = new e();
        this.Tz = eVar;
        return eVar;
    }

    private static <E> ArrayList<E> f(Collection<E> collection) {
        Collection arrayList = new ArrayList(collection.size());
        t.a(arrayList, collection.iterator());
        return arrayList;
    }

    /* Access modifiers changed, original: 0000 */
    public Object writeReplace() {
        return new SerializationProxy(this.WV.tR(), this.WV.tS(), this.keyEquivalence, this.WV.tS().defaultEquivalence(), this.concurrencyLevel, this);
    }
}
