package com.google.zxing.common;

import java.util.Arrays;

/* compiled from: BitMatrix */
public final class b implements Cloneable {
    private final int[] agF;
    private final int agG;
    private final int height;
    private final int width;

    public b(int i) {
        this(i, i);
    }

    public b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.width = i;
        this.height = i2;
        this.agG = (i + 31) / 32;
        this.agF = new int[(this.agG * i2)];
    }

    private b(int i, int i2, int i3, int[] iArr) {
        this.width = i;
        this.height = i2;
        this.agG = i3;
        this.agF = iArr;
    }

    public boolean P(int i, int i2) {
        return ((this.agF[(i2 * this.agG) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public void set(int i, int i2) {
        i2 = (i2 * this.agG) + (i / 32);
        int[] iArr = this.agF;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public void clear() {
        int length = this.agF.length;
        for (int i = 0; i < length; i++) {
            this.agF[i] = 0;
        }
    }

    public void d(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            i3 += i;
            i4 += i2;
            if (i4 > this.height || i3 > this.width) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i4) {
                int i5 = this.agG * i2;
                for (int i6 = i; i6 < i3; i6++) {
                    int[] iArr = this.agF;
                    int i7 = (i6 / 32) + i5;
                    iArr[i7] = iArr[i7] | (1 << (i6 & 31));
                }
                i2++;
            }
        }
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.width == bVar.width && this.height == bVar.height && this.agG == bVar.agG && Arrays.equals(this.agF, bVar.agF)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.width;
        return (((((((i * 31) + i) * 31) + this.height) * 31) + this.agG) * 31) + Arrays.hashCode(this.agF);
    }

    public String toString() {
        return U("X ", "  ");
    }

    public String U(String str, String str2) {
        return j(str, str2, "\n");
    }

    private String j(String str, String str2, String str3) {
        StringBuilder stringBuilder = new StringBuilder(this.height * (this.width + 1));
        for (int i = 0; i < this.height; i++) {
            for (int i2 = 0; i2 < this.width; i2++) {
                stringBuilder.append(P(i2, i) ? str : str2);
            }
            stringBuilder.append(str3);
        }
        return stringBuilder.toString();
    }

    /* renamed from: yH */
    public b clone() {
        return new b(this.width, this.height, this.agG, (int[]) this.agF.clone());
    }
}
