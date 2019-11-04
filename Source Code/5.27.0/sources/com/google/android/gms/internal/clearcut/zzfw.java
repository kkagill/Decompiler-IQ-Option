package com.google.android.gms.internal.clearcut;

public final class zzfw implements Cloneable {
    private static final zzfx zzrl = new zzfx();
    private int mSize;
    private boolean zzrm;
    private int[] zzrn;
    private zzfx[] zzro;

    zzfw() {
        this(10);
    }

    private zzfw(int i) {
        this.zzrm = false;
        i <<= 2;
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                i = i3;
                break;
            }
        }
        i /= 4;
        this.zzrn = new int[i];
        this.zzro = new zzfx[i];
        this.mSize = 0;
    }

    public final /* synthetic */ Object clone() {
        int i = this.mSize;
        zzfw zzfw = new zzfw(i);
        int i2 = 0;
        System.arraycopy(this.zzrn, 0, zzfw.zzrn, 0, i);
        while (i2 < i) {
            zzfx[] zzfxArr = this.zzro;
            if (zzfxArr[i2] != null) {
                zzfw.zzro[i2] = (zzfx) zzfxArr[i2].clone();
            }
            i2++;
        }
        zzfw.mSize = i;
        return zzfw;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfw)) {
            return false;
        }
        zzfw zzfw = (zzfw) obj;
        int i = this.mSize;
        if (i != zzfw.mSize) {
            return false;
        }
        Object obj2;
        int[] iArr = this.zzrn;
        int[] iArr2 = zzfw.zzrn;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                obj2 = null;
                break;
            }
        }
        obj2 = 1;
        if (obj2 != null) {
            zzfx[] zzfxArr = this.zzro;
            zzfx[] zzfxArr2 = zzfw.zzro;
            int i3 = this.mSize;
            for (int i4 = 0; i4 < i3; i4++) {
                if (!zzfxArr[i4].equals(zzfxArr2[i4])) {
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
            i = (((i * 31) + this.zzrn[i2]) * 31) + this.zzro[i2].hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    /* Access modifiers changed, original: final */
    public final int size() {
        return this.mSize;
    }

    /* Access modifiers changed, original: final */
    public final zzfx zzaq(int i) {
        return this.zzro[i];
    }
}
