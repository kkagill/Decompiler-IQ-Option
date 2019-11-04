package com.google.android.gms.internal.vision;

public final class zzjp implements Cloneable {
    private static final zzjq zzadi = new zzjq();
    private int mSize;
    private boolean zzadj;
    private int[] zzadk;
    private zzjq[] zzadl;

    zzjp() {
        this(10);
    }

    private zzjp(int i) {
        this.zzadj = false;
        i = idealIntArraySize(i);
        this.zzadk = new int[i];
        this.zzadl = new zzjq[i];
        this.mSize = 0;
    }

    /* Access modifiers changed, original: final */
    public final zzjq zzbw(int i) {
        i = zzby(i);
        if (i >= 0) {
            zzjq[] zzjqArr = this.zzadl;
            if (zzjqArr[i] != zzadi) {
                return zzjqArr[i];
            }
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final void zza(int i, zzjq zzjq) {
        int zzby = zzby(i);
        if (zzby >= 0) {
            this.zzadl[zzby] = zzjq;
            return;
        }
        zzjq[] zzjqArr;
        int[] iArr;
        zzby ^= -1;
        if (zzby < this.mSize) {
            zzjqArr = this.zzadl;
            if (zzjqArr[zzby] == zzadi) {
                this.zzadk[zzby] = i;
                zzjqArr[zzby] = zzjq;
                return;
            }
        }
        int i2 = this.mSize;
        if (i2 >= this.zzadk.length) {
            i2 = idealIntArraySize(i2 + 1);
            iArr = new int[i2];
            zzjqArr = new zzjq[i2];
            int[] iArr2 = this.zzadk;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            zzjq[] zzjqArr2 = this.zzadl;
            System.arraycopy(zzjqArr2, 0, zzjqArr, 0, zzjqArr2.length);
            this.zzadk = iArr;
            this.zzadl = zzjqArr;
        }
        i2 = this.mSize;
        if (i2 - zzby != 0) {
            iArr = this.zzadk;
            int i3 = zzby + 1;
            System.arraycopy(iArr, zzby, iArr, i3, i2 - zzby);
            zzjqArr = this.zzadl;
            System.arraycopy(zzjqArr, zzby, zzjqArr, i3, this.mSize - zzby);
        }
        this.zzadk[zzby] = i;
        this.zzadl[zzby] = zzjq;
        this.mSize++;
    }

    /* Access modifiers changed, original: final */
    public final int size() {
        return this.mSize;
    }

    /* Access modifiers changed, original: final */
    public final zzjq zzbx(int i) {
        return this.zzadl[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjp)) {
            return false;
        }
        zzjp zzjp = (zzjp) obj;
        int i = this.mSize;
        if (i != zzjp.mSize) {
            return false;
        }
        Object obj2;
        int[] iArr = this.zzadk;
        int[] iArr2 = zzjp.zzadk;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                obj2 = null;
                break;
            }
        }
        obj2 = 1;
        if (obj2 != null) {
            zzjq[] zzjqArr = this.zzadl;
            zzjq[] zzjqArr2 = zzjp.zzadl;
            int i3 = this.mSize;
            for (int i4 = 0; i4 < i3; i4++) {
                if (!zzjqArr[i4].equals(zzjqArr2[i4])) {
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
            i = (((i * 31) + this.zzadk[i2]) * 31) + this.zzadl[i2].hashCode();
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

    private final int zzby(int i) {
        int i2 = this.mSize - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.zzadk[i4];
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
        zzjp zzjp = new zzjp(i);
        int i2 = 0;
        System.arraycopy(this.zzadk, 0, zzjp.zzadk, 0, i);
        while (i2 < i) {
            zzjq[] zzjqArr = this.zzadl;
            if (zzjqArr[i2] != null) {
                zzjp.zzadl[i2] = (zzjq) zzjqArr[i2].clone();
            }
            i2++;
        }
        zzjp.mSize = i;
        return zzjp;
    }
}
