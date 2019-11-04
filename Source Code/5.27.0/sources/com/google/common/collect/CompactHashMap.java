package com.google.common.collect;

import com.google.common.base.f;
import com.google.common.base.i;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    private transient int[] Vt;
    transient long[] Vu;
    transient float Vv;
    private transient Set<K> Vw;
    private transient Set<Entry<K, V>> Vx;
    private transient Collection<V> Vy;
    transient Object[] keys;
    transient int modCount;
    private transient int size;
    private transient int threshold;
    transient Object[] values;

    class a extends AbstractSet<Entry<K, V>> {
        a() {
        }

        public int size() {
            return CompactHashMap.this.size;
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public Iterator<Entry<K, V>> iterator() {
            return CompactHashMap.this.sp();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = CompactHashMap.this.indexOf(entry.getKey());
            if (a == -1 || !f.equal(CompactHashMap.this.values[a], entry.getValue())) {
                return false;
            }
            return true;
        }

        public boolean remove(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                int a = CompactHashMap.this.indexOf(entry.getKey());
                if (a != -1 && f.equal(CompactHashMap.this.values[a], entry.getValue())) {
                    CompactHashMap.this.bH(a);
                    return true;
                }
            }
            return false;
        }
    }

    private abstract class b<T> implements Iterator<T> {
        int VB;
        int currentIndex;
        int expectedModCount;

        public abstract T bK(int i);

        private b() {
            this.expectedModCount = CompactHashMap.this.modCount;
            this.currentIndex = CompactHashMap.this.sn();
            this.VB = -1;
        }

        /* synthetic */ b(CompactHashMap compactHashMap, AnonymousClass1 anonymousClass1) {
            this();
        }

        public boolean hasNext() {
            return this.currentIndex >= 0;
        }

        public T next() {
            sf();
            if (hasNext()) {
                int i = this.currentIndex;
                this.VB = i;
                Object bK = bK(i);
                this.currentIndex = CompactHashMap.this.bJ(this.currentIndex);
                return bK;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            sf();
            g.ai(this.VB >= 0);
            this.expectedModCount++;
            CompactHashMap.this.bH(this.VB);
            this.currentIndex = CompactHashMap.this.u(this.currentIndex, this.VB);
            this.VB = -1;
        }

        private void sf() {
            if (CompactHashMap.this.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    class c extends AbstractSet<K> {
        c() {
        }

        public int size() {
            return CompactHashMap.this.size;
        }

        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        public boolean remove(Object obj) {
            int a = CompactHashMap.this.indexOf(obj);
            if (a == -1) {
                return false;
            }
            CompactHashMap.this.bH(a);
            return true;
        }

        public Iterator<K> iterator() {
            return CompactHashMap.this.so();
        }

        public void clear() {
            CompactHashMap.this.clear();
        }
    }

    class e extends AbstractCollection<V> {
        e() {
        }

        public int size() {
            return CompactHashMap.this.size;
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public Iterator<V> iterator() {
            return CompactHashMap.this.sr();
        }
    }

    final class d extends b<K, V> {
        private int VD;
        private final K key;

        d(int i) {
            this.key = CompactHashMap.this.keys[i];
            this.VD = i;
        }

        public K getKey() {
            return this.key;
        }

        private void ss() {
            int i = this.VD;
            if (i == -1 || i >= CompactHashMap.this.size() || !f.equal(this.key, CompactHashMap.this.keys[this.VD])) {
                this.VD = CompactHashMap.this.indexOf(this.key);
            }
        }

        public V getValue() {
            ss();
            return this.VD == -1 ? null : CompactHashMap.this.values[this.VD];
        }

        public V setValue(V v) {
            ss();
            if (this.VD == -1) {
                CompactHashMap.this.put(this.key, v);
                return null;
            }
            V v2 = CompactHashMap.this.values[this.VD];
            CompactHashMap.this.values[this.VD] = v;
            return v2;
        }
    }

    private static int D(long j) {
        return (int) (j >>> 32);
    }

    private static int E(long j) {
        return (int) j;
    }

    private static long a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* Access modifiers changed, original: 0000 */
    public void bD(int i) {
    }

    /* Access modifiers changed, original: 0000 */
    public int u(int i, int i2) {
        return i - 1;
    }

    public static <K, V> CompactHashMap<K, V> sl() {
        return new CompactHashMap();
    }

    public static <K, V> CompactHashMap<K, V> bA(int i) {
        return new CompactHashMap(i);
    }

    CompactHashMap() {
        e(3, 1.0f);
    }

    CompactHashMap(int i) {
        this(i, 1.0f);
    }

    CompactHashMap(int i, float f) {
        e(i, f);
    }

    /* Access modifiers changed, original: 0000 */
    public void e(int i, float f) {
        boolean z = false;
        i.checkArgument(i >= 0, "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z = true;
        }
        i.checkArgument(z, "Illegal load factor");
        int a = r.a(i, (double) f);
        this.Vt = bB(a);
        this.Vv = f;
        this.keys = new Object[i];
        this.values = new Object[i];
        this.Vu = bC(i);
        this.threshold = Math.max(1, (int) (((float) a) * f));
    }

    private static int[] bB(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static long[] bC(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    private int sm() {
        return this.Vt.length - 1;
    }

    public V put(K k, V v) {
        long[] jArr = this.Vu;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int aG = r.aG(k);
        int sm = sm() & aG;
        int i = this.size;
        int[] iArr = this.Vt;
        int i2 = iArr[sm];
        if (i2 == -1) {
            iArr[sm] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (D(j) == aG && f.equal(k, objArr[i2])) {
                    V v2 = objArr2[i2];
                    objArr2[i2] = v;
                    bD(i2);
                    return v2;
                }
                sm = E(j);
                if (sm == -1) {
                    jArr[i2] = a(j, i);
                    break;
                }
                i2 = sm;
            }
        }
        if (i != Integer.MAX_VALUE) {
            int i3 = i + 1;
            bE(i3);
            a(i, k, v, aG);
            this.size = i3;
            if (i >= this.threshold) {
                bG(this.Vt.length * 2);
            }
            this.modCount++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i, K k, V v, int i2) {
        this.Vu[i] = (((long) i2) << 32) | 4294967295L;
        this.keys[i] = k;
        this.values[i] = v;
    }

    private void bE(int i) {
        int length = this.Vu.length;
        if (i > length) {
            i = Math.max(1, length >>> 1) + length;
            if (i < 0) {
                i = Integer.MAX_VALUE;
            }
            if (i != length) {
                bF(i);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bF(int i) {
        this.keys = Arrays.copyOf(this.keys, i);
        this.values = Arrays.copyOf(this.values, i);
        long[] jArr = this.Vu;
        int length = jArr.length;
        jArr = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArr, length, i, -1);
        }
        this.Vu = jArr;
    }

    private void bG(int i) {
        if (this.Vt.length >= 1073741824) {
            this.threshold = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.Vv)) + 1;
        int[] bB = bB(i);
        long[] jArr = this.Vu;
        int length = bB.length - 1;
        for (int i3 = 0; i3 < this.size; i3++) {
            int D = D(jArr[i3]);
            int i4 = D & length;
            int i5 = bB[i4];
            bB[i4] = i3;
            jArr[i3] = (((long) D) << 32) | (4294967295L & ((long) i5));
        }
        this.threshold = i2;
        this.Vt = bB;
    }

    private int indexOf(Object obj) {
        int aG = r.aG(obj);
        int i = this.Vt[sm() & aG];
        while (i != -1) {
            long j = this.Vu[i];
            if (D(j) == aG && f.equal(obj, this.keys[i])) {
                return i;
            }
            i = E(j);
        }
        return -1;
    }

    public boolean containsKey(Object obj) {
        return indexOf(obj) != -1;
    }

    public V get(Object obj) {
        int indexOf = indexOf(obj);
        bD(indexOf);
        if (indexOf == -1) {
            return null;
        }
        return this.values[indexOf];
    }

    public V remove(Object obj) {
        return d(obj, r.aG(obj));
    }

    private V d(Object obj, int i) {
        int sm = sm() & i;
        int i2 = this.Vt[sm];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (D(this.Vu[i2]) == i && f.equal(obj, this.keys[i2])) {
                V v = this.values[i2];
                if (i3 == -1) {
                    this.Vt[sm] = E(this.Vu[i2]);
                } else {
                    long[] jArr = this.Vu;
                    jArr[i3] = a(jArr[i3], E(jArr[i2]));
                }
                bI(i2);
                this.size--;
                this.modCount++;
                return v;
            }
            i3 = E(this.Vu[i2]);
            if (i3 == -1) {
                return null;
            }
            int i4 = i3;
            i3 = i2;
            i2 = i4;
        }
    }

    private V bH(int i) {
        return d(this.keys[i], D(this.Vu[i]));
    }

    /* Access modifiers changed, original: 0000 */
    public void bI(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.keys;
            objArr[i] = objArr[size];
            Object[] objArr2 = this.values;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.Vu;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int D = D(j) & sm();
            int[] iArr = this.Vt;
            int i2 = iArr[D];
            if (i2 == size) {
                iArr[D] = i;
                return;
            }
            while (true) {
                j = this.Vu[i2];
                D = E(j);
                if (D == size) {
                    this.Vu[i2] = a(j, i);
                    return;
                }
                i2 = D;
            }
        } else {
            this.keys[i] = null;
            this.values[i] = null;
            this.Vu[i] = -1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int sn() {
        return isEmpty() ? -1 : 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int bJ(int i) {
        i++;
        return i < this.size ? i : -1;
    }

    public Set<K> keySet() {
        Set<K> set = this.Vw;
        if (set != null) {
            return set;
        }
        Set rJ = rJ();
        this.Vw = rJ;
        return rJ;
    }

    /* Access modifiers changed, original: 0000 */
    public Set<K> rJ() {
        return new c();
    }

    /* Access modifiers changed, original: 0000 */
    public Iterator<K> so() {
        return new b<K>() {
            /* Access modifiers changed, original: 0000 */
            public K bK(int i) {
                return CompactHashMap.this.keys[i];
            }
        };
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.Vx;
        if (set != null) {
            return set;
        }
        Set rN = rN();
        this.Vx = rN;
        return rN;
    }

    /* Access modifiers changed, original: 0000 */
    public Set<Entry<K, V>> rN() {
        return new a();
    }

    /* Access modifiers changed, original: 0000 */
    public Iterator<Entry<K, V>> sp() {
        return new b<Entry<K, V>>() {
            /* Access modifiers changed, original: 0000 */
            /* renamed from: bL */
            public Entry<K, V> bK(int i) {
                return new d(i);
            }
        };
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean containsValue(Object obj) {
        for (int i = 0; i < this.size; i++) {
            if (f.equal(obj, this.values[i])) {
                return true;
            }
        }
        return false;
    }

    public Collection<V> values() {
        Collection<V> collection = this.Vy;
        if (collection != null) {
            return collection;
        }
        Collection sq = sq();
        this.Vy = sq;
        return sq;
    }

    /* Access modifiers changed, original: 0000 */
    public Collection<V> sq() {
        return new e();
    }

    /* Access modifiers changed, original: 0000 */
    public Iterator<V> sr() {
        return new b<V>() {
            /* Access modifiers changed, original: 0000 */
            public V bK(int i) {
                return CompactHashMap.this.values[i];
            }
        };
    }

    public void clear() {
        this.modCount++;
        Arrays.fill(this.keys, 0, this.size, null);
        Arrays.fill(this.values, 0, this.size, null);
        Arrays.fill(this.Vt, -1);
        Arrays.fill(this.Vu, -1);
        this.size = 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.size);
        for (int i = 0; i < this.size; i++) {
            objectOutputStream.writeObject(this.keys[i]);
            objectOutputStream.writeObject(this.values[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        e(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            } else {
                return;
            }
        }
    }
}
