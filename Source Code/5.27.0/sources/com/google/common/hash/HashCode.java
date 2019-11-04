package com.google.common.hash;

import com.google.common.base.i;
import java.io.Serializable;

public abstract class HashCode {
    private static final char[] Yr = "0123456789abcdef".toCharArray();

    private static final class BytesHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final byte[] bytes;

        BytesHashCode(byte[] bArr) {
            this.bytes = (byte[]) i.checkNotNull(bArr);
        }

        public int uP() {
            return this.bytes.length * 8;
        }

        public byte[] uS() {
            return (byte[]) this.bytes.clone();
        }

        public int uQ() {
            i.b(this.bytes.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", this.bytes.length);
            byte[] bArr = this.bytes;
            return ((bArr[3] & 255) << 24) | ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) | ((bArr[2] & 255) << 16));
        }

        public long uR() {
            i.b(this.bytes.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", this.bytes.length);
            return uU();
        }

        public long uU() {
            long j = (long) (this.bytes[0] & 255);
            for (int i = 1; i < Math.min(this.bytes.length, 8); i++) {
                j |= (((long) this.bytes[i]) & 255) << (i * 8);
            }
            return j;
        }

        /* Access modifiers changed, original: 0000 */
        public byte[] uT() {
            return this.bytes;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(HashCode hashCode) {
            if (this.bytes.length != hashCode.uT().length) {
                return false;
            }
            int i = 0;
            int i2 = 1;
            while (true) {
                byte[] bArr = this.bytes;
                if (i >= bArr.length) {
                    return i2;
                }
                i2 &= bArr[i] == hashCode.uT()[i] ? 1 : 0;
                i++;
            }
        }
    }

    public abstract boolean a(HashCode hashCode);

    public abstract int uP();

    public abstract int uQ();

    public abstract long uR();

    public abstract byte[] uS();

    HashCode() {
    }

    /* Access modifiers changed, original: 0000 */
    public byte[] uT() {
        return uS();
    }

    static HashCode h(byte[] bArr) {
        return new BytesHashCode(bArr);
    }

    public static HashCode bS(String str) {
        boolean z = true;
        i.a(str.length() >= 2, "input string (%s) must have at least 2 characters", (Object) str);
        if (str.length() % 2 != 0) {
            z = false;
        }
        i.a(z, "input string (%s) must have an even number of characters", (Object) str);
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < str.length(); i += 2) {
            bArr[i / 2] = (byte) ((g(str.charAt(i)) << 4) + g(str.charAt(i + 1)));
        }
        return h(bArr);
    }

    private static int g(char c) {
        if (c >= '0' && c <= '9') {
            return c - 48;
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 97) + 10;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal hexadecimal character: ");
        stringBuilder.append(c);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HashCode)) {
            return false;
        }
        HashCode hashCode = (HashCode) obj;
        if (uP() == hashCode.uP() && a(hashCode)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (uP() >= 32) {
            return uQ();
        }
        byte[] uT = uT();
        int i = uT[0] & 255;
        for (int i2 = 1; i2 < uT.length; i2++) {
            i |= (uT[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] uT = uT();
        StringBuilder stringBuilder = new StringBuilder(uT.length * 2);
        for (byte b : uT) {
            stringBuilder.append(Yr[(b >> 4) & 15]);
            stringBuilder.append(Yr[b & 15]);
        }
        return stringBuilder.toString();
    }
}
