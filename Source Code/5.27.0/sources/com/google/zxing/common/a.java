package com.google.zxing.common;

import java.util.Arrays;

/* compiled from: BitArray */
public final class a implements Cloneable {
    private int[] agF;
    private int size;

    public a() {
        this.size = 0;
        this.agF = new int[1];
    }

    a(int[] iArr, int i) {
        this.agF = iArr;
        this.size = i;
    }

    public int getSize() {
        return this.size;
    }

    public int yF() {
        return (this.size + 7) / 8;
    }

    private void ensureCapacity(int i) {
        if (i > (this.agF.length << 5)) {
            int[] cO = cO(i);
            int[] iArr = this.agF;
            System.arraycopy(iArr, 0, cO, 0, iArr.length);
            this.agF = cO;
        }
    }

    public boolean get(int i) {
        return ((1 << (i & 31)) & this.agF[i / 32]) != 0;
    }

    public void au(boolean z) {
        ensureCapacity(this.size + 1);
        if (z) {
            int[] iArr = this.agF;
            int i = this.size;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.size++;
    }

    public void O(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        ensureCapacity(this.size + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            au(z);
            i2--;
        }
    }

    public void a(a aVar) {
        int i = aVar.size;
        ensureCapacity(this.size + i);
        for (int i2 = 0; i2 < i; i2++) {
            au(aVar.get(i2));
        }
    }

    public void b(a aVar) {
        if (this.size == aVar.size) {
            int i = 0;
            while (true) {
                int[] iArr = this.agF;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ aVar.agF[i];
                    i++;
                } else {
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Sizes don't match");
    }

    public void a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        i = 0;
        while (i < i3) {
            int i5 = i4;
            int i6 = 0;
            for (i4 = 0; i4 < 8; i4++) {
                if (get(i5)) {
                    i6 |= 1 << (7 - i4);
                }
                i5++;
            }
            bArr[i2 + i] = (byte) i6;
            i++;
            i4 = i5;
        }
    }

    private static int[] cO(int i) {
        return new int[((i + 31) / 32)];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.size == aVar.size && Arrays.equals(this.agF, aVar.agF)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.size * 31) + Arrays.hashCode(this.agF);
    }

    public String toString() {
        int i = this.size;
        StringBuilder stringBuilder = new StringBuilder((i + (i / 8)) + 1);
        for (i = 0; i < this.size; i++) {
            if ((i & 7) == 0) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(get(i) ? 'X' : '.');
        }
        return stringBuilder.toString();
    }

    /* renamed from: yG */
    public a clone() {
        return new a((int[]) this.agF.clone(), this.size);
    }
}
