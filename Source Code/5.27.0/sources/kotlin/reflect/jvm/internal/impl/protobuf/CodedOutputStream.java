package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public final class CodedOutputStream {
    private final byte[] buffer;
    private int fpV = 0;
    private final int limit;
    private int position;
    private final OutputStream pt;

    public static class OutOfSpaceException extends IOException {
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

    public static int W(double d) {
        return 8;
    }

    public static int dl(long j) {
        return 8;
    }

    public static int dm(long j) {
        return 8;
    }

    public static long dp(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int m(float f) {
        return 4;
    }

    public static int m(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    static int md(int i) {
        return i > 4096 ? 4096 : i;
    }

    public static int mg(int i) {
        return 4;
    }

    public static int mh(int i) {
        return 4;
    }

    public static int y(boolean z) {
        return 1;
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.pt = outputStream;
        this.buffer = bArr;
        this.position = 0;
        this.limit = bArr.length;
    }

    public static CodedOutputStream b(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    public void e(int i, double d) {
        h(i, 1);
        V(d);
    }

    public void a(int i, float f) {
        h(i, 5);
        l(f);
    }

    public void bk(int i, int i2) {
        h(i, 0);
        A(i2);
    }

    public void c(int i, boolean z) {
        h(i, 0);
        x(z);
    }

    public void a(int i, n nVar) {
        h(i, 3);
        c(nVar);
        h(i, 4);
    }

    public void b(int i, n nVar) {
        h(i, 2);
        d(nVar);
    }

    public void a(int i, d dVar) {
        h(i, 2);
        b(dVar);
    }

    public void b(int i, int i2) {
        h(i, 0);
        B(i2);
    }

    public void c(int i, int i2) {
        h(i, 0);
        C(i2);
    }

    public void y(int i, long j) {
        h(i, 0);
        dj(j);
    }

    public void c(int i, n nVar) {
        h(1, 3);
        b(2, i);
        b(3, nVar);
        h(1, 4);
    }

    public void V(double d) {
        m3do(Double.doubleToRawLongBits(d));
    }

    public void l(float f) {
        M(Float.floatToRawIntBits(f));
    }

    public void j(long j) {
        l(j);
    }

    public void dg(long j) {
        l(j);
    }

    public void A(int i) {
        if (i >= 0) {
            K(i);
        } else {
            l((long) i);
        }
    }

    public void dh(long j) {
        m3do(j);
    }

    public void me(int i) {
        M(i);
    }

    public void x(boolean z) {
        I(z);
    }

    public void my(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        K(bytes.length);
        e(bytes);
    }

    public void c(n nVar) {
        nVar.a(this);
    }

    public void d(n nVar) {
        K(nVar.bzk());
        nVar.a(this);
    }

    public void b(d dVar) {
        K(dVar.size());
        d(dVar);
    }

    public void ab(byte[] bArr) {
        K(bArr.length);
        e(bArr);
    }

    public void B(int i) {
        K(i);
    }

    public void C(int i) {
        A(i);
    }

    public void mf(int i) {
        M(i);
    }

    public void di(long j) {
        m3do(j);
    }

    public void D(int i) {
        K(N(i));
    }

    public void dj(long j) {
        l(dp(j));
    }

    public static int f(int i, double d) {
        return J(i) + W(d);
    }

    public static int b(int i, float f) {
        return J(i) + m(f);
    }

    public static int bl(int i, int i2) {
        return J(i) + E(i2);
    }

    public static int d(int i, boolean z) {
        return J(i) + y(z);
    }

    public static int d(int i, n nVar) {
        return J(i) + f(nVar);
    }

    public static int b(int i, d dVar) {
        return J(i) + c(dVar);
    }

    public static int f(int i, int i2) {
        return J(i) + G(i2);
    }

    public static int z(int i, long j) {
        return J(i) + dn(j);
    }

    public static int k(long j) {
        return m(j);
    }

    public static int dk(long j) {
        return m(j);
    }

    public static int E(int i) {
        return i >= 0 ? L(i) : 10;
    }

    public static int mz(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return L(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public static int e(n nVar) {
        return nVar.bzk();
    }

    public static int f(n nVar) {
        int bzk = nVar.bzk();
        return L(bzk) + bzk;
    }

    public static int a(j jVar) {
        int bzk = jVar.bzk();
        return L(bzk) + bzk;
    }

    public static int c(d dVar) {
        return L(dVar.size()) + dVar.size();
    }

    public static int ac(byte[] bArr) {
        return L(bArr.length) + bArr.length;
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

    public static int dn(long j) {
        return m(dp(j));
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
        this.fpV++;
    }

    public void I(int i) {
        a((byte) i);
    }

    public void d(d dVar) {
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
            this.fpV += i2;
            return;
        }
        i3 -= i4;
        System.arraycopy(bArr, i, this.buffer, i4, i3);
        i += i3;
        i2 -= i3;
        this.position = this.limit;
        this.fpV += i3;
        eG();
        if (i2 <= this.limit) {
            System.arraycopy(bArr, i, this.buffer, 0, i2);
            this.position = i2;
        } else {
            this.pt.write(bArr, i, i2);
        }
        this.fpV += i2;
    }

    public void a(d dVar, int i, int i2) {
        int i3 = this.limit;
        int i4 = this.position;
        if (i3 - i4 >= i2) {
            dVar.a(this.buffer, i, i4, i2);
            this.position += i2;
            this.fpV += i2;
            return;
        }
        i3 -= i4;
        dVar.a(this.buffer, i, i4, i3);
        i += i3;
        i2 -= i3;
        this.position = this.limit;
        this.fpV += i3;
        eG();
        if (i2 <= this.limit) {
            dVar.a(this.buffer, i, 0, i2);
            this.position = i2;
        } else {
            dVar.a(this.pt, i, i2);
        }
        this.fpV += i2;
    }

    public void h(int i, int i2) {
        K(WireFormat.i(i, i2));
    }

    public static int J(int i) {
        return L(WireFormat.i(i, 0));
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

    /* renamed from: do */
    public void m3do(long j) {
        I(((int) j) & 255);
        I(((int) (j >> 8)) & 255);
        I(((int) (j >> 16)) & 255);
        I(((int) (j >> 24)) & 255);
        I(((int) (j >> 32)) & 255);
        I(((int) (j >> 40)) & 255);
        I(((int) (j >> 48)) & 255);
        I(((int) (j >> 56)) & 255);
    }
}
