package b.a.a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.b;
import org.slf4j.c;

/* compiled from: BitUtils */
public final class a {
    private static final b eGN = c.nE(a.class.getName());
    private static final Charset eJE = Charset.forName("ASCII");
    private final byte[] eJF;
    private int eJG;
    private final int size;

    public byte aS(int i, int i2) {
        byte b = (byte) ((((byte) (-1 << i)) & 255) >> i);
        i = 8 - (i2 + i);
        return i > 0 ? (byte) (((byte) (b >> i)) << i) : b;
    }

    public a(byte[] bArr) {
        this.eJF = new byte[bArr.length];
        System.arraycopy(bArr, 0, this.eJF, 0, bArr.length);
        this.size = bArr.length * 8;
    }

    public void iZ(int i) {
        this.eJG += i;
        if (this.eJG < 0) {
            this.eJG = 0;
        }
    }

    public boolean bii() {
        return jc(1) == 1;
    }

    public byte[] y(int i, boolean z) {
        byte[] bArr = new byte[((int) Math.ceil((double) (((float) i) / 8.0f)))];
        int i2 = this.eJG;
        int i3 = 0;
        if (i2 % 8 != 0) {
            i2 += i;
            while (true) {
                int i4 = this.eJG;
                if (i4 >= i2) {
                    break;
                }
                int i5 = i4 % 8;
                int i6 = i3 % 8;
                i4 = Math.min(i2 - i4, Math.min(8 - i5, 8 - i6));
                int aS = (byte) (this.eJF[this.eJG / 8] & aS(i5, i4));
                if (z || i % 8 == 0) {
                    aS = (byte) (i5 != 0 ? aS << Math.min(i5, 8 - i4) : (aS & 255) >> i6);
                }
                i5 = i3 / 8;
                bArr[i5] = (byte) (bArr[i5] | aS);
                this.eJG += i4;
                i3 += i4;
            }
            if (!(z || i % 8 == 0)) {
                bArr[bArr.length - 1] = (byte) (aS(((i2 - i) - 1) % 8, 8) & bArr[bArr.length - 1]);
            }
        } else {
            System.arraycopy(this.eJF, i2 / 8, bArr, 0, bArr.length);
            int i7 = i % 8;
            if (i7 == 0) {
                i7 = 8;
            }
            bArr[bArr.length - 1] = (byte) (aS(this.eJG % 8, i7) & bArr[bArr.length - 1]);
            this.eJG += i;
        }
        return bArr;
    }

    public Date h(int i, String str) {
        return a(i, str, false);
    }

    public Date a(int i, String str, boolean z) {
        String ja;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        if (z) {
            ja = ja(i);
        } else {
            ja = jd(i);
        }
        try {
            ja = simpleDateFormat.parse(ja);
            return ja;
        } catch (ParseException e) {
            b bVar = eGN;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Parsing date error. date:");
            stringBuilder.append(ja);
            stringBuilder.append(" pattern:");
            stringBuilder.append(str);
            bVar.g(stringBuilder.toString(), e);
            return null;
        }
    }

    public String ja(int i) {
        return b.U(y(i, true));
    }

    public long jb(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        int i2 = this.eJG + i;
        long j = 0;
        while (true) {
            int i3 = this.eJG;
            if (i3 < i2) {
                int i4 = i3 % 8;
                j = (j << Math.min(i, 8)) | (((((long) ((this.eJF[i3 / 8] & aS(i4, i)) & 255)) & 255) >>> Math.max(8 - (i4 + i), 0)) & 255);
                int i5 = 8 - i4;
                i -= i5;
                this.eJG = Math.min(this.eJG + i5, i2);
            } else {
                allocate.putLong(j);
                allocate.rewind();
                return allocate.getLong();
            }
        }
    }

    public int jc(int i) {
        return (int) jb(i);
    }

    public String jd(int i) {
        return a(i, eJE);
    }

    public String a(int i, Charset charset) {
        return new String(y(i, true), charset);
    }
}
