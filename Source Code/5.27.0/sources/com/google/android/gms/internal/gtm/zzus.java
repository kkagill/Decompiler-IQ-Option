package com.google.android.gms.internal.gtm;

public final class zzus implements Cloneable {
    private static final zzut zzbhe = new zzut();
    private int mSize;
    private boolean zzbhf;
    private int[] zzbhg;
    private zzut[] zzbhh;

    zzus() {
        this(10);
    }

    private zzus(int i) {
        this.zzbhf = false;
        i = idealIntArraySize(i);
        this.zzbhg = new int[i];
        this.zzbhh = new zzut[i];
        this.mSize = 0;
    }

    /* Access modifiers changed, original: final */
    public final zzut zzcd(int i) {
        i = zzcf(i);
        if (i >= 0) {
            zzut[] zzutArr = this.zzbhh;
            if (zzutArr[i] != zzbhe) {
                return zzutArr[i];
            }
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final void zza(int i, zzut zzut) {
        int zzcf = zzcf(i);
        if (zzcf >= 0) {
            this.zzbhh[zzcf] = zzut;
            return;
        }
        zzut[] zzutArr;
        int[] iArr;
        zzcf ^= -1;
        if (zzcf < this.mSize) {
            zzutArr = this.zzbhh;
            if (zzutArr[zzcf] == zzbhe) {
                this.zzbhg[zzcf] = i;
                zzutArr[zzcf] = zzut;
                return;
            }
        }
        int i2 = this.mSize;
        if (i2 >= this.zzbhg.length) {
            i2 = idealIntArraySize(i2 + 1);
            iArr = new int[i2];
            zzutArr = new zzut[i2];
            int[] iArr2 = this.zzbhg;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            zzut[] zzutArr2 = this.zzbhh;
            System.arraycopy(zzutArr2, 0, zzutArr, 0, zzutArr2.length);
            this.zzbhg = iArr;
            this.zzbhh = zzutArr;
        }
        i2 = this.mSize;
        if (i2 - zzcf != 0) {
            iArr = this.zzbhg;
            int i3 = zzcf + 1;
            System.arraycopy(iArr, zzcf, iArr, i3, i2 - zzcf);
            zzutArr = this.zzbhh;
            System.arraycopy(zzutArr, zzcf, zzutArr, i3, this.mSize - zzcf);
        }
        this.zzbhg[zzcf] = i;
        this.zzbhh[zzcf] = zzut;
        this.mSize++;
    }

    /* Access modifiers changed, original: final */
    public final int size() {
        return this.mSize;
    }

    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    /* Access modifiers changed, original: final */
    public final zzut zzce(int i) {
        return this.zzbhh[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzus)) {
            return false;
        }
        zzus zzus = (zzus) obj;
        int i = this.mSize;
        if (i != zzus.mSize) {
            return false;
        }
        Object obj2;
        int[] iArr = this.zzbhg;
        int[] iArr2 = zzus.zzbhg;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                obj2 = null;
                break;
            }
        }
        obj2 = 1;
        if (obj2 != null) {
            zzut[] zzutArr = this.zzbhh;
            zzut[] zzutArr2 = zzus.zzbhh;
            int i3 = this.mSize;
            for (int i4 = 0; i4 < i3; i4++) {
                if (!zzutArr[i4].equals(zzutArr2[i4])) {
                    obj = null;
                    break;
                }
            }
            obj = 1;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.mSize; i2++) {
            i = (((i * 31) + this.zzbhg[i2]) * 31) + this.zzbhh[i2].hashCode();
        }
        return i;
    }

    private static int idealIntArraySize(int i) {
        i <<= 2;
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                i = i3;
                break;
            }
        }
        return i / 4;
    }

    private final int zzcf(int i) {
        int i2 = this.mSize - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.zzbhg[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    public final /* synthetic */ Object clone() {
        int i = this.mSize;
        zzus zzus = new zzus(i);
        int i2 = 0;
        System.arraycopy(this.zzbhg, 0, zzus.zzbhg, 0, i);
        while (i2 < i) {
            zzut[] zzutArr = this.zzbhh;
            if (zzutArr[i2] != null) {
                zzus.zzbhh[i2] = (zzut) zzutArr[i2].clone();
            }
            i2++;
        }
        zzus.mSize = i;
        return zzus;
    }
}
