package com.google.zxing.qrcode.a;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: ByteMatrix */
public final class b {
    private final byte[][] aix;
    private final int height;
    private final int width;

    public b(int i, int i2) {
        this.aix = (byte[][]) Array.newInstance(byte.class, new int[]{i2, i});
        this.width = i;
        this.height = i2;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public byte Y(int i, int i2) {
        return this.aix[i2][i];
    }

    public byte[][] zA() {
        return this.aix;
    }

    public void set(int i, int i2, int i3) {
        this.aix[i2][i] = (byte) i3;
    }

    public void set(int i, int i2, boolean z) {
        this.aix[i2][i] = (byte) z;
    }

    public void b(byte b) {
        for (byte[] fill : this.aix) {
            Arrays.fill(fill, b);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(((this.width * 2) * this.height) + 2);
        for (int i = 0; i < this.height; i++) {
            byte[] bArr = this.aix[i];
            for (int i2 = 0; i2 < this.width; i2++) {
                byte b = bArr[i2];
                if (b == (byte) 0) {
                    stringBuilder.append(" 0");
                } else if (b != (byte) 1) {
                    stringBuilder.append("  ");
                } else {
                    stringBuilder.append(" 1");
                }
            }
            stringBuilder.append(10);
        }
        return stringBuilder.toString();
    }
}
