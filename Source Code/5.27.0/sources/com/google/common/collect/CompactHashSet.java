package com.google.common.collect;

import com.google.common.base.f;
import com.google.common.base.i;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    private transient int[] Vt;
    private transient long[] Vu;
    transient float Vv;
    transient Object[] elements;
    transient int modCount;
    private transient int size;
    private transient int threshold;

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
    public int u(int i, int i2) {
        return i - 1;
    }

    public static <E> CompactHashSet<E> bM(int i) {
        return new CompactHashSet(i);
    }

    CompactHashSet() {
        e(3, 1.0f);
    }

    CompactHashSet(int i) {
        e(i, 1.0f);
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
        this.elements = new Object[i];
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

    public boolean add(E e) {
        long[] jArr = this.Vu;
        Object[] objArr = this.elements;
        int aG = r.aG(e);
        int sm = sm() & aG;
        int i = this.size;
        int[] iArr = this.Vt;
        int i2 = iArr[sm];
        if (i2 == -1) {
            iArr[sm] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (D(j) == aG && f.equal(e, objArr[i2])) {
                    return false;
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
            a(i, (Object) e, aG);
            this.size = i3;
            if (i >= this.threshold) {
                bG(this.Vt.length * 2);
            }
            this.modCount++;
            return true;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i, E e, int i2) {
        this.Vu[i] = (((long) i2) << 32) | 4294967295L;
        this.elements[i] = e;
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
        this.elements = Arrays.copyOf(this.elements, i);
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

    public boolean contains(Object obj) {
        int aG = r.aG(obj);
        int i = this.Vt[sm() & aG];
        while (i != -1) {
            long j = this.Vu[i];
            if (D(j) == aG && f.equal(obj, this.elements[i])) {
                return true;
            }
            i = E(j);
        }
        return false;
    }

    public boolean remove(Object obj) {
        return h(obj, r.aG(obj));
    }

    private boolean h(Object obj, int i) {
        int sm = sm() & i;
        int i2 = this.Vt[sm];
        if (i2 == -1) {
            return false;
        }
        int i3 = -1;
        while (true) {
            if (D(this.Vu[i2]) == i && f.equal(obj, this.elements[i2])) {
                if (i3 == -1) {
                    this.Vt[sm] = E(this.Vu[i2]);
                } else {
                    long[] jArr = this.Vu;
                    jArr[i3] = a(jArr[i3], E(jArr[i2]));
                }
                bN(i2);
                this.size--;
                this.modCount++;
                return true;
            }
            i3 = E(this.Vu[i2]);
            if (i3 == -1) {
                return false;
            }
            int i4 = i3;
            i3 = i2;
            i2 = i4;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bN(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.elements;
            objArr[i] = objArr[size];
            objArr[size] = null;
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
            this.elements[i] = null;
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

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int VB = -1;
            int expectedModCount = CompactHashSet.this.modCount;
            int index = CompactHashSet.this.sn();

            public boolean hasNext() {
                return this.index >= 0;
            }

            public E next() {
                sf();
                if (hasNext()) {
                    this.VB = this.index;
                    Object[] objArr = CompactHashSet.this.elements;
                    int i = this.index;
                    E e = objArr[i];
                    this.index = CompactHashSet.this.bJ(i);
                    return e;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                sf();
                g.ai(this.VB >= 0);
                this.expectedModCount++;
                CompactHashSet compactHashSet = CompactHashSet.this;
                compactHashSet.h(compactHashSet.elements[this.VB], CompactHashSet.D(CompactHashSet.this.Vu[this.VB]));
                this.index = CompactHashSet.this.u(this.index, this.VB);
                this.VB = -1;
            }

            private void sf() {
                if (CompactHashSet.this.modCount != this.expectedModCount) {
                    throw new ConcurrentModificationException();
                }
            }
        };
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public Object[] toArray() {
        return Arrays.copyOf(this.elements, this.size);
    }

    public <T> T[] toArray(T[] tArr) {
        return y.a(this.elements, 0, this.size, tArr);
    }

    public void clear() {
        this.modCount++;
        Arrays.fill(this.elements, 0, this.size, null);
        Arrays.fill(this.Vt, -1);
        Arrays.fill(this.Vu, -1);
        this.size = 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.size);
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        e(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                add(objectInputStream.readObject());
            } else {
                return;
            }
        }
    }
}
