package com.pro100svitlo.creditCardNfcReader.iso7816emv;

import java.util.Arrays;

/* compiled from: ByteArrayWrapper */
public final class a {
    private final byte[] data;
    private final int eCj;

    private a(byte[] bArr) {
        this.data = bArr;
        this.eCj = Arrays.hashCode(bArr);
    }

    public static a C(byte[] bArr) {
        if (bArr != null) {
            return new a(bArr);
        }
        throw new NullPointerException();
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(this.data, ((a) obj).data);
        }
        return false;
    }

    public int hashCode() {
        return this.eCj;
    }
}
