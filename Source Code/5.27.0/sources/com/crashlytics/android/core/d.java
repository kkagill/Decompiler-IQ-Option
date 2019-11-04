package com.crashlytics.android.core;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: ByteString */
final class d {
    public static final d pm = new d(new byte[0]);
    private final byte[] bytes;
    private volatile int hash = 0;

    private d(byte[] bArr) {
        this.bytes = bArr;
    }

    public int size() {
        return this.bytes.length;
    }

    public static d c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new d(bArr2);
    }

    public static d ar(String str) {
        try {
            return new d(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        byte[] bArr = this.bytes;
        int length = bArr.length;
        byte[] bArr2 = dVar.bytes;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int i2 = r1;
            for (byte b : this.bytes) {
                i2 = (i2 * 31) + b;
            }
            i = i2 == 0 ? 1 : i2;
            this.hash = i;
        }
        return i;
    }

    public InputStream eE() {
        return new ByteArrayInputStream(this.bytes);
    }
}
