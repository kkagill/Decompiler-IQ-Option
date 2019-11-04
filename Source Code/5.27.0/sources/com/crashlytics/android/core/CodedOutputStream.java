package com.crashlytics.android.core;

import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class CodedOutputStream implements Flushable {
    private final byte[] buffer;
    private final int limit;
    private int position = 0;
    private final OutputStream pt;

    static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public static int L(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    public static int N(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int m(float f) {
        return 4;
    }

    public static int m(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int y(boolean z) {
        return 1;
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.pt = outputStream;
        this.buffer = bArr;
        this.limit = bArr.length;
    }

    public static CodedOutputStream a(OutputStream outputStream) {
        return a(outputStream, 4096);
    }

    public static CodedOutputStream a(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    public void a(int i, float f) {
        h(i, 5);
        l(f);
    }

    public void a(int i, long j) {
        h(i, 0);
        j(j);
    }

    public void c(int i, boolean z) {
        h(i, 0);
        x(z);
    }

    public void a(int i, d dVar) {
        h(i, 2);
        a(dVar);
    }

    public void b(int i, int i2) {
        h(i, 0);
        B(i2);
    }

    public void c(int i, int i2) {
        h(i, 0);
        C(i2);
    }

    public void d(int i, int i2) {
        h(i, 0);
        D(i2);
    }

    public void l(float f) {
        M(Float.floatToRawIntBits(f));
    }

    public void j(long j) {
        l(j);
    }

    public void A(int i) {
        if (i >= 0) {
            K(i);
        } else {
            l((long) i);
        }
    }

    public void x(boolean z) {
        I(z);
    }

    public void a(d dVar) {
        K(dVar.size());
        c(dVar);
    }

    public void B(int i) {
        K(i);
    }

    public void C(int i) {
        A(i);
    }

    public void D(int i) {
        K(N(i));
    }

    public static int b(int i, float f) {
        return J(i) + m(f);
    }

    public static int b(int i, long j) {
        return J(i) + k(j);
    }

    public static int d(int i, boolean z) {
        return J(i) + y(z);
    }

    public static int b(int i, d dVar) {
        return J(i) + b(dVar);
    }

    public static int e(int i, int i2) {
        return J(i) + F(i2);
    }

    public static int f(int i, int i2) {
        return J(i) + G(i2);
    }

    public static int g(int i, int i2) {
        return J(i) + H(i2);
    }

    public static int k(long j) {
        return m(j);
    }

    public static int E(int i) {
        return i >= 0 ? L(i) : 10;
    }

    public static int b(d dVar) {
        return L(dVar.size()) + dVar.size();
    }

    public static int F(int i) {
        return L(i);
    }

    public static int G(int i) {
        return E(i);
    }

    public static int H(int i) {
        return L(N(i));
    }

    private void eG() {
        OutputStream outputStream = this.pt;
        if (outputStream != null) {
            outputStream.write(this.buffer, 0, this.position);
            this.position = 0;
            return;
        }
        throw new OutOfSpaceException();
    }

    public void flush() {
        if (this.pt != null) {
            eG();
        }
    }

    public void a(byte b) {
        if (this.position == this.limit) {
            eG();
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = b;
    }

    public void I(int i) {
        a((byte) i);
    }

    public void c(d dVar) {
        a(dVar, 0, dVar.size());
    }

    public void e(byte[] bArr) {
        d(bArr, 0, bArr.length);
    }

    public void d(byte[] bArr, int i, int i2) {
        int i3 = this.limit;
        int i4 = this.position;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.buffer, i4, i2);
            this.position += i2;
            return;
        }
        i3 -= i4;
        System.arraycopy(bArr, i, this.buffer, i4, i3);
        i += i3;
        i2 -= i3;
        this.position = this.limit;
        eG();
        if (i2 <= this.limit) {
            System.arraycopy(bArr, i, this.buffer, 0, i2);
            this.position = i2;
            return;
        }
        this.pt.write(bArr, i, i2);
    }

    public void a(d dVar, int i, int i2) {
        int i3 = this.limit;
        int i4 = this.position;
        if (i3 - i4 >= i2) {
            dVar.a(this.buffer, i, i4, i2);
            this.position += i2;
            return;
        }
        i3 -= i4;
        dVar.a(this.buffer, i, i4, i3);
        i += i3;
        i2 -= i3;
        this.position = this.limit;
        eG();
        if (i2 <= this.limit) {
            dVar.a(this.buffer, i, 0, i2);
            this.position = i2;
            return;
        }
        InputStream eE = dVar.eE();
        long j = (long) i;
        if (j == eE.skip(j)) {
            while (i2 > 0) {
                i = Math.min(i2, this.limit);
                i3 = eE.read(this.buffer, 0, i);
                if (i3 == i) {
                    this.pt.write(this.buffer, 0, i3);
                    i2 -= i3;
                } else {
                    throw new IllegalStateException("Read failed.");
                }
            }
            return;
        }
        throw new IllegalStateException("Skip failed.");
    }

    public void h(int i, int i2) {
        K(ay.i(i, i2));
    }

    public static int J(int i) {
        return L(ay.i(i, 0));
    }

    public void K(int i) {
        while ((i & -128) != 0) {
            I((i & 127) | 128);
            i >>>= 7;
        }
        I(i);
    }

    public void l(long j) {
        while ((-128 & j) != 0) {
            I((((int) j) & 127) | 128);
            j >>>= 7;
        }
        I((int) j);
    }

    public void M(int i) {
        I(i & 255);
        I((i >> 8) & 255);
        I((i >> 16) & 255);
        I((i >> 24) & 255);
    }
}
