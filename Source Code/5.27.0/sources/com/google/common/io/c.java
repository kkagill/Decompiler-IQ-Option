package com.google.common.io;

import com.google.common.base.i;
import com.google.common.c.b;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/* compiled from: ByteStreams */
public final class c {
    private static final OutputStream Yu = new OutputStream() {
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        public void write(int i) {
        }

        public void write(byte[] bArr) {
            i.checkNotNull(bArr);
        }

        public void write(byte[] bArr, int i, int i2) {
            i.checkNotNull(bArr);
        }
    };

    static byte[] uY() {
        return new byte[8192];
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) {
        i.checkNotNull(inputStream);
        i.checkNotNull(outputStream);
        byte[] uY = uY();
        long j = 0;
        while (true) {
            int read = inputStream.read(uY);
            if (read == -1) {
                return j;
            }
            outputStream.write(uY, 0, read);
            j += (long) read;
        }
    }

    private static byte[] a(InputStream inputStream, Deque<byte[]> deque, int i) {
        int i2 = 8192;
        while (i < 2147483639) {
            byte[] bArr = new byte[Math.min(i2, 2147483639 - i)];
            deque.add(bArr);
            int i3 = 0;
            while (i3 < bArr.length) {
                int read = inputStream.read(bArr, i3, bArr.length - i3);
                if (read == -1) {
                    return a((Deque) deque, i);
                }
                i3 += read;
                i += read;
            }
            i2 = b.J(i2, 2);
        }
        if (inputStream.read() == -1) {
            return a((Deque) deque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] a(Deque<byte[]> deque, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) deque.removeFirst();
            int min = Math.min(i2, bArr2.length);
            System.arraycopy(bArr2, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }

    public static byte[] toByteArray(InputStream inputStream) {
        i.checkNotNull(inputStream);
        return a(inputStream, new ArrayDeque(20), 0);
    }

    static byte[] a(InputStream inputStream, long j) {
        i.a(j >= 0, "expectedSize (%s) must be non-negative", j);
        if (j <= 2147483639) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = i;
            while (i2 > 0) {
                int i3 = i - i2;
                int read = inputStream.read(bArr, i3, i2);
                if (read == -1) {
                    return Arrays.copyOf(bArr, i3);
                }
                i2 -= read;
            }
            if (inputStream.read() == -1) {
                return bArr;
            }
            ArrayDeque arrayDeque = new ArrayDeque(22);
            arrayDeque.add(bArr);
            arrayDeque.add(new byte[]{(byte) i});
            return a(inputStream, arrayDeque, bArr.length + 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(j);
        stringBuilder.append(" bytes is too large to fit in a byte array");
        throw new OutOfMemoryError(stringBuilder.toString());
    }
}
