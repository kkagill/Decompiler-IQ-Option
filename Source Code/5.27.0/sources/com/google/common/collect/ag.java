package com.google.common.collect;

import com.google.common.base.i;
import com.google.common.c.b;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: TopKSelector */
final class ag<T> {
    private final T[] XQ;
    private T XR;
    private int bufferSize;
    private final Comparator<? super T> comparator;
    private final int k;

    public static <T> ag<T> a(int i, Comparator<? super T> comparator) {
        return new ag(comparator, i);
    }

    private ag(Comparator<? super T> comparator, int i) {
        this.comparator = (Comparator) i.checkNotNull(comparator, "comparator");
        this.k = i;
        i.a(i >= 0, "k must be nonnegative, was %s", i);
        this.XQ = new Object[(i * 2)];
        this.bufferSize = 0;
        this.XR = null;
    }

    public void ba(T t) {
        int i = this.k;
        if (i != 0) {
            int i2 = this.bufferSize;
            Object[] objArr;
            if (i2 == 0) {
                this.XQ[0] = t;
                this.XR = t;
                this.bufferSize = 1;
            } else if (i2 < i) {
                objArr = this.XQ;
                this.bufferSize = i2 + 1;
                objArr[i2] = t;
                if (this.comparator.compare(t, this.XR) > 0) {
                    this.XR = t;
                }
            } else if (this.comparator.compare(t, this.XR) < 0) {
                objArr = this.XQ;
                i2 = this.bufferSize;
                this.bufferSize = i2 + 1;
                objArr[i2] = t;
                if (this.bufferSize == this.k * 2) {
                    kd();
                }
            }
        }
    }

    private void kd() {
        int i = (this.k * 2) - 1;
        int a = b.a(i + 0, RoundingMode.CEILING) * 3;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < i) {
            int h = h(i2, i, ((i2 + i) + 1) >>> 1);
            int i5 = this.k;
            if (h <= i5) {
                if (h >= i5) {
                    break;
                }
                i2 = Math.max(h, i2 + 1);
                i4 = h;
            } else {
                i = h - 1;
            }
            i3++;
            if (i3 >= a) {
                Arrays.sort(this.XQ, i2, i, this.comparator);
                break;
            }
        }
        this.bufferSize = this.k;
        this.XR = this.XQ[i4];
        while (true) {
            i4++;
            if (i4 >= this.k) {
                return;
            }
            if (this.comparator.compare(this.XQ[i4], this.XR) > 0) {
                this.XR = this.XQ[i4];
            }
        }
    }

    private int h(int i, int i2, int i3) {
        Object[] objArr = this.XQ;
        Object obj = objArr[i3];
        objArr[i3] = objArr[i2];
        i3 = i;
        while (i < i2) {
            if (this.comparator.compare(this.XQ[i], obj) < 0) {
                F(i3, i);
                i3++;
            }
            i++;
        }
        Object[] objArr2 = this.XQ;
        objArr2[i2] = objArr2[i3];
        objArr2[i3] = obj;
        return i3;
    }

    private void F(int i, int i2) {
        Object[] objArr = this.XQ;
        Object obj = objArr[i];
        objArr[i] = objArr[i2];
        objArr[i2] = obj;
    }

    public void v(Iterator<? extends T> it) {
        while (it.hasNext()) {
            ba(it.next());
        }
    }

    public List<T> uC() {
        Arrays.sort(this.XQ, 0, this.bufferSize, this.comparator);
        int i = this.bufferSize;
        int i2 = this.k;
        if (i > i2) {
            Object[] objArr = this.XQ;
            Arrays.fill(objArr, i2, objArr.length, null);
            i = this.k;
            this.bufferSize = i;
            this.XR = this.XQ[i - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(this.XQ, this.bufferSize)));
    }
}
