package com.google.common.collect;

import com.google.common.base.f;
import com.google.common.base.i;
import com.iqoption.dto.event.OtnEmissionExecuted;
import java.util.Arrays;

/* compiled from: ObjectCountHashMap */
class z<K> {
    private transient int[] Vt;
    transient long[] Vu;
    private transient float Vv;
    transient Object[] keys;
    transient int modCount;
    transient int size;
    private transient int threshold;
    transient int[] values;

    /* compiled from: ObjectCountHashMap */
    class a extends a<K> {
        int VD;
        final K key;

        a(int i) {
            this.key = z.this.keys[i];
            this.VD = i;
        }

        public K ur() {
            return this.key;
        }

        /* Access modifiers changed, original: 0000 */
        public void ss() {
            int i = this.VD;
            if (i == -1 || i >= z.this.size() || !f.equal(this.key, z.this.keys[this.VD])) {
                this.VD = z.this.indexOf(this.key);
            }
        }

        public int getCount() {
            ss();
            return this.VD == -1 ? 0 : z.this.values[this.VD];
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
    public int C(int i, int i2) {
        return i - 1;
    }

    z() {
        e(3, 1.0f);
    }

    z(int i) {
        this(i, 1.0f);
    }

    z(int i, float f) {
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
        this.values = new int[i];
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

    /* Access modifiers changed, original: 0000 */
    public int us() {
        return this.size == 0 ? -1 : 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int cl(int i) {
        i++;
        return i < this.size ? i : -1;
    }

    /* Access modifiers changed, original: 0000 */
    public int size() {
        return this.size;
    }

    /* Access modifiers changed, original: 0000 */
    public K cm(int i) {
        i.s(i, this.size);
        return this.keys[i];
    }

    /* Access modifiers changed, original: 0000 */
    public int cn(int i) {
        i.s(i, this.size);
        return this.values[i];
    }

    /* Access modifiers changed, original: 0000 */
    public void D(int i, int i2) {
        i.s(i, this.size);
        this.values[i] = i2;
    }

    /* Access modifiers changed, original: 0000 */
    public com.google.common.collect.x.a<K> co(int i) {
        i.s(i, this.size);
        return new a(i);
    }

    public int m(K k, int i) {
        g.c(i, OtnEmissionExecuted.COUNT);
        long[] jArr = this.Vu;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int aG = r.aG(k);
        int sm = sm() & aG;
        int i2 = this.size;
        int[] iArr2 = this.Vt;
        int i3 = iArr2[sm];
        if (i3 == -1) {
            iArr2[sm] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (D(j) == aG && f.equal(k, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                sm = E(j);
                if (sm == -1) {
                    jArr[i3] = a(j, i2);
                    break;
                }
                i3 = sm;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            int i5 = i2 + 1;
            bE(i5);
            a(i2, k, i, aG);
            this.size = i5;
            if (i2 >= this.threshold) {
                bG(this.Vt.length * 2);
            }
            this.modCount++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i, K k, int i2, int i3) {
        this.Vu[i] = (((long) i3) << 32) | 4294967295L;
        this.keys[i] = k;
        this.values[i] = i2;
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

    /* Access modifiers changed, original: 0000 */
    public int indexOf(Object obj) {
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

    public int get(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return 0;
        }
        return this.values[indexOf];
    }

    public int aX(Object obj) {
        return f(obj, r.aG(obj));
    }

    private int f(Object obj, int i) {
        int sm = sm() & i;
        int i2 = this.Vt[sm];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (D(this.Vu[i2]) == i && f.equal(obj, this.keys[i2])) {
                int i4 = this.values[i2];
                if (i3 == -1) {
                    this.Vt[sm] = E(this.Vu[i2]);
                } else {
                    long[] jArr = this.Vu;
                    jArr[i3] = a(jArr[i3], E(jArr[i2]));
                }
                bI(i2);
                this.size--;
                this.modCount++;
                return i4;
            }
            i3 = E(this.Vu[i2]);
            if (i3 == -1) {
                return 0;
            }
            int i5 = i3;
            i3 = i2;
            i2 = i5;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int cp(int i) {
        return f(this.keys[i], D(this.Vu[i]));
    }

    /* Access modifiers changed, original: 0000 */
    public void bI(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.keys;
            objArr[i] = objArr[size];
            int[] iArr = this.values;
            iArr[i] = iArr[size];
            objArr[size] = null;
            iArr[size] = 0;
            long[] jArr = this.Vu;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int D = D(j) & sm();
            int[] iArr2 = this.Vt;
            int i2 = iArr2[D];
            if (i2 == size) {
                iArr2[D] = i;
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
            this.values[i] = 0;
            this.Vu[i] = -1;
        }
    }

    public void clear() {
        this.modCount++;
        Arrays.fill(this.keys, 0, this.size, null);
        Arrays.fill(this.values, 0, this.size, 0);
        Arrays.fill(this.Vt, -1);
        Arrays.fill(this.Vu, -1);
        this.size = 0;
    }
}
