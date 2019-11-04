package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* compiled from: DefaultPlacement */
public class e {
    private final CharSequence agY;
    private final int agZ;
    private final int aha;
    private final byte[] ahb;

    public e(CharSequence charSequence, int i, int i2) {
        this.agY = charSequence;
        this.aha = i;
        this.agZ = i2;
        this.ahb = new byte[(i * i2)];
        Arrays.fill(this.ahb, (byte) -1);
    }

    public final boolean U(int i, int i2) {
        return this.ahb[(i2 * this.aha) + i] == (byte) 1;
    }

    private void c(int i, int i2, boolean z) {
        this.ahb[(i2 * this.aha) + i] = (byte) z;
    }

    private boolean V(int i, int i2) {
        return this.ahb[(i2 * this.aha) + i] < (byte) 0;
    }

    public final void yO() {
        int i;
        int i2;
        int i3 = 4;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i3 == this.agZ && r2 == 0) {
                i = i5 + 1;
                cV(i5);
                i5 = i;
            }
            if (i3 == this.agZ - 2 && r2 == 0 && this.aha % 4 != 0) {
                i = i5 + 1;
                cW(i5);
                i5 = i;
            }
            if (i3 == this.agZ - 2 && r2 == 0 && this.aha % 8 == 4) {
                i = i5 + 1;
                cX(i5);
                i5 = i;
            }
            if (i3 == this.agZ + 4 && r2 == 2 && this.aha % 8 == 0) {
                i = i5 + 1;
                cY(i5);
                i5 = i;
            }
            do {
                if (i3 < this.agZ && i4 >= 0 && V(i4, i3)) {
                    i = i5 + 1;
                    i(i3, i4, i5);
                    i5 = i;
                }
                i3 -= 2;
                i4 += 2;
                if (i3 < 0) {
                    break;
                }
            } while (i4 < this.aha);
            i3++;
            i4 += 3;
            do {
                if (i3 >= 0 && i4 < this.aha && V(i4, i3)) {
                    i = i5 + 1;
                    i(i3, i4, i5);
                    i5 = i;
                }
                i3 += 2;
                i4 -= 2;
                if (i3 >= this.agZ) {
                    break;
                }
            } while (i4 >= 0);
            i3 += 3;
            i4++;
            i = this.agZ;
            if (i3 >= i) {
                i2 = this.aha;
                if (i4 >= i2) {
                    break;
                }
            }
        }
        if (V(i2 - 1, i - 1)) {
            c(this.aha - 1, this.agZ - 1, true);
            c(this.aha - 2, this.agZ - 2, true);
        }
    }

    private void e(int i, int i2, int i3, int i4) {
        int i5;
        if (i < 0) {
            i5 = this.agZ;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            i5 = this.aha;
            i2 += i5;
            i += 4 - ((i5 + 4) % 8);
        }
        boolean z = true;
        if ((this.agY.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        c(i2, i, z);
    }

    private void i(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        e(i4, i5, i3, 1);
        int i6 = i2 - 1;
        e(i4, i6, i3, 2);
        i4 = i - 1;
        e(i4, i5, i3, 3);
        e(i4, i6, i3, 4);
        e(i4, i2, i3, 5);
        e(i, i5, i3, 6);
        e(i, i6, i3, 7);
        e(i, i2, i3, 8);
    }

    private void cV(int i) {
        e(this.agZ - 1, 0, i, 1);
        e(this.agZ - 1, 1, i, 2);
        e(this.agZ - 1, 2, i, 3);
        e(0, this.aha - 2, i, 4);
        e(0, this.aha - 1, i, 5);
        e(1, this.aha - 1, i, 6);
        e(2, this.aha - 1, i, 7);
        e(3, this.aha - 1, i, 8);
    }

    private void cW(int i) {
        e(this.agZ - 3, 0, i, 1);
        e(this.agZ - 2, 0, i, 2);
        e(this.agZ - 1, 0, i, 3);
        e(0, this.aha - 4, i, 4);
        e(0, this.aha - 3, i, 5);
        e(0, this.aha - 2, i, 6);
        e(0, this.aha - 1, i, 7);
        e(1, this.aha - 1, i, 8);
    }

    private void cX(int i) {
        e(this.agZ - 3, 0, i, 1);
        e(this.agZ - 2, 0, i, 2);
        e(this.agZ - 1, 0, i, 3);
        e(0, this.aha - 2, i, 4);
        e(0, this.aha - 1, i, 5);
        e(1, this.aha - 1, i, 6);
        e(2, this.aha - 1, i, 7);
        e(3, this.aha - 1, i, 8);
    }

    private void cY(int i) {
        e(this.agZ - 1, 0, i, 1);
        e(this.agZ - 1, this.aha - 1, i, 2);
        e(0, this.aha - 3, i, 3);
        e(0, this.aha - 2, i, 4);
        e(0, this.aha - 1, i, 5);
        e(1, this.aha - 3, i, 6);
        e(1, this.aha - 2, i, 7);
        e(1, this.aha - 1, i, 8);
    }
}
