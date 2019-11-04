package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.InputStream;
import java.util.ArrayList;

/* compiled from: CodedInputStream */
public final class e {
    private final byte[] buffer;
    private int bufferSize;
    private int fpK;
    private final boolean fpL;
    private int fpM;
    private int fpN;
    private boolean fpO;
    private int fpP;
    private int fpQ;
    private int fpR;
    private int fpS;
    private int fpT;
    private a fpU;
    private final InputStream input;

    /* compiled from: CodedInputStream */
    private interface a {
        void bKT();
    }

    public static long df(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int lU(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static e n(InputStream inputStream) {
        return new e(inputStream);
    }

    static e a(m mVar) {
        e eVar = new e(mVar);
        try {
            eVar.lV(mVar.size());
            return eVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int bKv() {
        if (bKR()) {
            this.fpN = 0;
            return 0;
        }
        this.fpN = bKK();
        if (WireFormat.mq(this.fpN) != 0) {
            return this.fpN;
        }
        throw InvalidProtocolBufferException.bLs();
    }

    public void lT(int i) {
        if (this.fpN != i) {
            throw InvalidProtocolBufferException.bLt();
        }
    }

    public boolean a(int i, CodedOutputStream codedOutputStream) {
        int mp = WireFormat.mp(i);
        long bKx;
        if (mp == 0) {
            bKx = bKx();
            codedOutputStream.K(i);
            codedOutputStream.j(bKx);
            return true;
        } else if (mp == 1) {
            bKx = bKO();
            codedOutputStream.K(i);
            codedOutputStream.dh(bKx);
            return true;
        } else if (mp == 2) {
            d bKD = bKD();
            codedOutputStream.K(i);
            codedOutputStream.b(bKD);
            return true;
        } else if (mp == 3) {
            codedOutputStream.K(i);
            b(codedOutputStream);
            i = WireFormat.i(WireFormat.mq(i), 4);
            lT(i);
            codedOutputStream.K(i);
            return true;
        } else if (mp == 4) {
            return false;
        } else {
            if (mp == 5) {
                mp = bKN();
                codedOutputStream.K(i);
                codedOutputStream.me(mp);
                return true;
            }
            throw InvalidProtocolBufferException.bLu();
        }
    }

    public void b(CodedOutputStream codedOutputStream) {
        int bKv;
        do {
            bKv = bKv();
            if (bKv == 0) {
                return;
            }
        } while (a(bKv, codedOutputStream));
    }

    public double readDouble() {
        return Double.longBitsToDouble(bKO());
    }

    public float readFloat() {
        return Float.intBitsToFloat(bKN());
    }

    public long bKw() {
        return bKL();
    }

    public long bKx() {
        return bKL();
    }

    public int bKy() {
        return bKK();
    }

    public long bKz() {
        return bKO();
    }

    public int bKA() {
        return bKN();
    }

    public boolean bKB() {
        return bKL() != 0;
    }

    public String readString() {
        int bKK = bKK();
        int i = this.bufferSize;
        int i2 = this.fpK;
        String str = "UTF-8";
        if (bKK <= i - i2 && bKK > 0) {
            String str2 = new String(this.buffer, i2, bKK, str);
            this.fpK += bKK;
            return str2;
        } else if (bKK == 0) {
            return "";
        } else {
            return new String(ma(bKK), str);
        }
    }

    public String bKC() {
        byte[] bArr;
        int bKK = bKK();
        int i = this.fpK;
        if (bKK <= this.bufferSize - i && bKK > 0) {
            bArr = this.buffer;
            this.fpK = i + bKK;
        } else if (bKK == 0) {
            return "";
        } else {
            bArr = ma(bKK);
            i = 0;
        }
        if (u.n(bArr, i, i + bKK)) {
            return new String(bArr, i, bKK, "UTF-8");
        }
        throw InvalidProtocolBufferException.bLx();
    }

    public void a(int i, kotlin.reflect.jvm.internal.impl.protobuf.n.a aVar, f fVar) {
        int i2 = this.fpR;
        if (i2 < this.fpS) {
            this.fpR = i2 + 1;
            aVar.f(this, fVar);
            lT(WireFormat.i(i, 4));
            this.fpR--;
            return;
        }
        throw InvalidProtocolBufferException.bLv();
    }

    public void a(kotlin.reflect.jvm.internal.impl.protobuf.n.a aVar, f fVar) {
        int bKK = bKK();
        if (this.fpR < this.fpS) {
            bKK = lV(bKK);
            this.fpR++;
            aVar.f(this, fVar);
            lT(0);
            this.fpR--;
            lW(bKK);
            return;
        }
        throw InvalidProtocolBufferException.bLv();
    }

    public <T extends n> T a(p<T> pVar, f fVar) {
        int bKK = bKK();
        if (this.fpR < this.fpS) {
            bKK = lV(bKK);
            this.fpR++;
            n nVar = (n) pVar.b(this, fVar);
            lT(0);
            this.fpR--;
            lW(bKK);
            return nVar;
        }
        throw InvalidProtocolBufferException.bLv();
    }

    public d bKD() {
        int bKK = bKK();
        int i = this.bufferSize;
        int i2 = this.fpK;
        if (bKK <= i - i2 && bKK > 0) {
            d cVar = (this.fpL && this.fpO) ? new c(this.buffer, i2, bKK) : d.l(this.buffer, this.fpK, bKK);
            this.fpK += bKK;
            return cVar;
        } else if (bKK == 0) {
            return d.fpH;
        } else {
            return new m(ma(bKK));
        }
    }

    public int bKE() {
        return bKK();
    }

    public int bKF() {
        return bKK();
    }

    public int bKG() {
        return bKN();
    }

    public long bKH() {
        return bKO();
    }

    public int bKI() {
        return lU(bKK());
    }

    public long bKJ() {
        return df(bKL());
    }

    /* JADX WARNING: Missing block: B:30:0x0079, code skipped:
            if (r2[r3] < (byte) 0) goto L_0x007b;
     */
    public int bKK() {
        /*
        r9 = this;
        r0 = r9.fpK;
        r1 = r9.bufferSize;
        if (r1 != r0) goto L_0x0008;
    L_0x0006:
        goto L_0x007b;
    L_0x0008:
        r2 = r9.buffer;
        r3 = r0 + 1;
        r0 = r2[r0];
        if (r0 < 0) goto L_0x0013;
    L_0x0010:
        r9.fpK = r3;
        return r0;
    L_0x0013:
        r1 = r1 - r3;
        r4 = 9;
        if (r1 >= r4) goto L_0x0019;
    L_0x0018:
        goto L_0x007b;
    L_0x0019:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 7;
        r0 = r0 ^ r3;
        r3 = (long) r0;
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 >= 0) goto L_0x002c;
    L_0x0027:
        r5 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
    L_0x0029:
        r3 = r3 ^ r5;
        r0 = (int) r3;
        goto L_0x0081;
    L_0x002c:
        r3 = r1 + 1;
        r1 = r2[r1];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        r7 = (long) r0;
        r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r1 < 0) goto L_0x003e;
    L_0x0038:
        r0 = 16256; // 0x3f80 float:2.278E-41 double:8.0315E-320;
        r0 = r0 ^ r7;
        r0 = (int) r0;
    L_0x003c:
        r1 = r3;
        goto L_0x0081;
    L_0x003e:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 21;
        r0 = r0 ^ r3;
        r3 = (long) r0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 >= 0) goto L_0x004e;
    L_0x004a:
        r5 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        goto L_0x0029;
    L_0x004e:
        r3 = r1 + 1;
        r1 = r2[r1];
        r4 = r1 << 28;
        r0 = r0 ^ r4;
        r4 = (long) r0;
        r6 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r4 = r4 ^ r6;
        r0 = (int) r4;
        if (r1 >= 0) goto L_0x003c;
    L_0x005d:
        r1 = r3 + 1;
        r3 = r2[r3];
        if (r3 >= 0) goto L_0x0081;
    L_0x0063:
        r3 = r1 + 1;
        r1 = r2[r1];
        if (r1 >= 0) goto L_0x003c;
    L_0x0069:
        r1 = r3 + 1;
        r3 = r2[r3];
        if (r3 >= 0) goto L_0x0081;
    L_0x006f:
        r3 = r1 + 1;
        r1 = r2[r1];
        if (r1 >= 0) goto L_0x003c;
    L_0x0075:
        r1 = r3 + 1;
        r2 = r2[r3];
        if (r2 >= 0) goto L_0x0081;
    L_0x007b:
        r0 = r9.bKM();
        r1 = (int) r0;
        return r1;
    L_0x0081:
        r9.fpK = r1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.e.bKK():int");
    }

    public static int a(int i, InputStream inputStream) {
        if ((i & 128) == 0) {
            return i;
        }
        int read;
        i &= 127;
        int i2 = 7;
        while (i2 < 32) {
            read = inputStream.read();
            if (read != -1) {
                i |= (read & 127) << i2;
                if ((read & 128) == 0) {
                    return i;
                }
                i2 += 7;
            } else {
                throw InvalidProtocolBufferException.bLp();
            }
        }
        while (i2 < 64) {
            read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.bLp();
            } else if ((read & 128) == 0) {
                return i;
            } else {
                i2 += 7;
            }
        }
        throw InvalidProtocolBufferException.bLr();
    }

    /* JADX WARNING: Missing block: B:35:0x00b4, code skipped:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
     */
    public long bKL() {
        /*
        r9 = this;
        r0 = r9.fpK;
        r1 = r9.bufferSize;
        if (r1 != r0) goto L_0x0008;
    L_0x0006:
        goto L_0x00b6;
    L_0x0008:
        r2 = r9.buffer;
        r3 = r0 + 1;
        r0 = r2[r0];
        if (r0 < 0) goto L_0x0014;
    L_0x0010:
        r9.fpK = r3;
        r0 = (long) r0;
        return r0;
    L_0x0014:
        r1 = r1 - r3;
        r4 = 9;
        if (r1 >= r4) goto L_0x001b;
    L_0x0019:
        goto L_0x00b6;
    L_0x001b:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 7;
        r0 = r0 ^ r3;
        r3 = (long) r0;
        r5 = 0;
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 >= 0) goto L_0x002e;
    L_0x0029:
        r5 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
    L_0x002b:
        r3 = r3 ^ r5;
        goto L_0x00bb;
    L_0x002e:
        r0 = r1 + 1;
        r1 = r2[r1];
        r1 = r1 << 14;
        r7 = (long) r1;
        r3 = r3 ^ r7;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 < 0) goto L_0x0040;
    L_0x003a:
        r1 = 16256; // 0x3f80 float:2.278E-41 double:8.0315E-320;
    L_0x003c:
        r3 = r3 ^ r1;
    L_0x003d:
        r1 = r0;
        goto L_0x00bb;
    L_0x0040:
        r1 = r0 + 1;
        r0 = r2[r0];
        r0 = r0 << 21;
        r7 = (long) r0;
        r3 = r3 ^ r7;
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 >= 0) goto L_0x0050;
    L_0x004c:
        r5 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        goto L_0x002b;
    L_0x0050:
        r0 = r1 + 1;
        r1 = r2[r1];
        r7 = (long) r1;
        r1 = 28;
        r7 = r7 << r1;
        r3 = r3 ^ r7;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 < 0) goto L_0x0061;
    L_0x005d:
        r1 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        goto L_0x003c;
    L_0x0061:
        r1 = r0 + 1;
        r0 = r2[r0];
        r7 = (long) r0;
        r0 = 35;
        r7 = r7 << r0;
        r3 = r3 ^ r7;
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 >= 0) goto L_0x0074;
    L_0x006e:
        r5 = -34093383808; // 0xfffffff80fe03f80 float:2.2112565E-29 double:NaN;
        goto L_0x002b;
    L_0x0074:
        r0 = r1 + 1;
        r1 = r2[r1];
        r7 = (long) r1;
        r1 = 42;
        r7 = r7 << r1;
        r3 = r3 ^ r7;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 < 0) goto L_0x0087;
    L_0x0081:
        r1 = 4363953127296; // 0x3f80fe03f80 float:2.2112565E-29 double:2.1560793202584E-311;
        goto L_0x003c;
    L_0x0087:
        r1 = r0 + 1;
        r0 = r2[r0];
        r7 = (long) r0;
        r0 = 49;
        r7 = r7 << r0;
        r3 = r3 ^ r7;
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 >= 0) goto L_0x009a;
    L_0x0094:
        r5 = -558586000294016; // 0xfffe03f80fe03f80 float:2.2112565E-29 double:NaN;
        goto L_0x002b;
    L_0x009a:
        r0 = r1 + 1;
        r1 = r2[r1];
        r7 = (long) r1;
        r1 = 56;
        r7 = r7 << r1;
        r3 = r3 ^ r7;
        r7 = 71499008037633920; // 0xfe03f80fe03f80 float:2.2112565E-29 double:6.838959413692434E-304;
        r3 = r3 ^ r7;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 >= 0) goto L_0x003d;
    L_0x00ad:
        r1 = r0 + 1;
        r0 = r2[r0];
        r7 = (long) r0;
        r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r0 >= 0) goto L_0x00bb;
    L_0x00b6:
        r0 = r9.bKM();
        return r0;
    L_0x00bb:
        r9.fpK = r1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.e.bKL():long");
    }

    /* Access modifiers changed, original: 0000 */
    public long bKM() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bKS = bKS();
            j |= ((long) (bKS & 127)) << i;
            if ((bKS & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.bLr();
    }

    public int bKN() {
        int i = this.fpK;
        if (this.bufferSize - i < 4) {
            lY(4);
            i = this.fpK;
        }
        byte[] bArr = this.buffer;
        this.fpK = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    public long bKO() {
        int i = this.fpK;
        if (this.bufferSize - i < 8) {
            lY(8);
            i = this.fpK;
        }
        byte[] bArr = this.buffer;
        this.fpK = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    private e(InputStream inputStream) {
        this.fpO = false;
        this.fpQ = Integer.MAX_VALUE;
        this.fpS = 64;
        this.fpT = 67108864;
        this.fpU = null;
        this.buffer = new byte[4096];
        this.bufferSize = 0;
        this.fpK = 0;
        this.fpP = 0;
        this.input = inputStream;
        this.fpL = false;
    }

    private e(m mVar) {
        this.fpO = false;
        this.fpQ = Integer.MAX_VALUE;
        this.fpS = 64;
        this.fpT = 67108864;
        this.fpU = null;
        this.buffer = mVar.bytes;
        this.fpK = mVar.bKj();
        this.bufferSize = this.fpK + mVar.size();
        this.fpP = -this.fpK;
        this.input = null;
        this.fpL = true;
    }

    public int lV(int i) {
        if (i >= 0) {
            i += this.fpP + this.fpK;
            int i2 = this.fpQ;
            if (i <= i2) {
                this.fpQ = i;
                bKP();
                return i2;
            }
            throw InvalidProtocolBufferException.bLp();
        }
        throw InvalidProtocolBufferException.bLq();
    }

    private void bKP() {
        this.bufferSize += this.fpM;
        int i = this.fpP;
        int i2 = this.bufferSize;
        i += i2;
        int i3 = this.fpQ;
        if (i > i3) {
            this.fpM = i - i3;
            this.bufferSize = i2 - this.fpM;
            return;
        }
        this.fpM = 0;
    }

    public void lW(int i) {
        this.fpQ = i;
        bKP();
    }

    public int bKQ() {
        int i = this.fpQ;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.fpP + this.fpK);
    }

    public boolean bKR() {
        return this.fpK == this.bufferSize && !lZ(1);
    }

    private void lX(int i) {
        if (this.bufferSize - this.fpK < i) {
            lY(i);
        }
    }

    private void lY(int i) {
        if (!lZ(i)) {
            throw InvalidProtocolBufferException.bLp();
        }
    }

    private boolean lZ(int i) {
        int i2 = this.fpK;
        StringBuilder stringBuilder;
        if (i2 + i <= this.bufferSize) {
            stringBuilder = new StringBuilder(77);
            stringBuilder.append("refillBuffer() called when ");
            stringBuilder.append(i);
            stringBuilder.append(" bytes were already available in buffer");
            throw new IllegalStateException(stringBuilder.toString());
        } else if ((this.fpP + i2) + i > this.fpQ) {
            return false;
        } else {
            a aVar = this.fpU;
            if (aVar != null) {
                aVar.bKT();
            }
            if (this.input != null) {
                i2 = this.fpK;
                if (i2 > 0) {
                    int i3 = this.bufferSize;
                    if (i3 > i2) {
                        byte[] bArr = this.buffer;
                        System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                    }
                    this.fpP += i2;
                    this.bufferSize -= i2;
                    this.fpK = 0;
                }
                InputStream inputStream = this.input;
                byte[] bArr2 = this.buffer;
                int i4 = this.bufferSize;
                i2 = inputStream.read(bArr2, i4, bArr2.length - i4);
                if (i2 == 0 || i2 < -1 || i2 > this.buffer.length) {
                    stringBuilder = new StringBuilder(102);
                    stringBuilder.append("InputStream#read(byte[]) returned invalid result: ");
                    stringBuilder.append(i2);
                    stringBuilder.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(stringBuilder.toString());
                } else if (i2 > 0) {
                    this.bufferSize += i2;
                    if ((this.fpP + i) - this.fpT <= 0) {
                        bKP();
                        return this.bufferSize >= i ? true : lZ(i);
                    }
                    throw InvalidProtocolBufferException.bLw();
                }
            }
            return false;
        }
    }

    public byte bKS() {
        if (this.fpK == this.bufferSize) {
            lY(1);
        }
        byte[] bArr = this.buffer;
        int i = this.fpK;
        this.fpK = i + 1;
        return bArr[i];
    }

    private byte[] ma(int i) {
        if (i > 0) {
            int i2 = this.fpP;
            int i3 = this.fpK;
            int i4 = (i2 + i3) + i;
            int i5 = this.fpQ;
            if (i4 > i5) {
                mb((i5 - i2) - i3);
                throw InvalidProtocolBufferException.bLp();
            } else if (i < 4096) {
                byte[] bArr = new byte[i];
                i4 = this.bufferSize - i3;
                System.arraycopy(this.buffer, i3, bArr, 0, i4);
                this.fpK = this.bufferSize;
                i -= i4;
                lX(i);
                System.arraycopy(this.buffer, 0, bArr, i4, i);
                this.fpK = i;
                return bArr;
            } else {
                int i6 = this.bufferSize;
                this.fpP = i2 + i6;
                this.fpK = 0;
                this.bufferSize = 0;
                i6 -= i3;
                i2 = i - i6;
                ArrayList<byte[]> arrayList = new ArrayList();
                while (i2 > 0) {
                    byte[] bArr2 = new byte[Math.min(i2, 4096)];
                    int i7 = 0;
                    while (i7 < bArr2.length) {
                        InputStream inputStream = this.input;
                        int read = inputStream == null ? -1 : inputStream.read(bArr2, i7, bArr2.length - i7);
                        if (read != -1) {
                            this.fpP += read;
                            i7 += read;
                        } else {
                            throw InvalidProtocolBufferException.bLp();
                        }
                    }
                    i2 -= bArr2.length;
                    arrayList.add(bArr2);
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(this.buffer, i3, bArr3, 0, i6);
                for (byte[] bArr4 : arrayList) {
                    System.arraycopy(bArr4, 0, bArr3, i6, bArr4.length);
                    i6 += bArr4.length;
                }
                return bArr3;
            }
        } else if (i == 0) {
            return h.EMPTY_BYTE_ARRAY;
        } else {
            throw InvalidProtocolBufferException.bLq();
        }
    }

    public void mb(int i) {
        int i2 = this.bufferSize;
        int i3 = this.fpK;
        if (i > i2 - i3 || i < 0) {
            mc(i);
        } else {
            this.fpK = i3 + i;
        }
    }

    private void mc(int i) {
        if (i >= 0) {
            int i2 = this.fpP;
            int i3 = this.fpK;
            int i4 = (i2 + i3) + i;
            int i5 = this.fpQ;
            if (i4 <= i5) {
                i2 = this.bufferSize;
                i3 = i2 - i3;
                this.fpK = i2;
                lY(1);
                while (true) {
                    i4 = i - i3;
                    i5 = this.bufferSize;
                    if (i4 > i5) {
                        i3 += i5;
                        this.fpK = i5;
                        lY(1);
                    } else {
                        this.fpK = i4;
                        return;
                    }
                }
            }
            mb((i5 - i2) - i3);
            throw InvalidProtocolBufferException.bLp();
        }
        throw InvalidProtocolBufferException.bLq();
    }
}
