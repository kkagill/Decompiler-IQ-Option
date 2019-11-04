package com.pro100svitlo.creditCardNfcReader.iso7816emv;

import com.pro100svitlo.creditCardNfcReader.a.a;
import java.util.Arrays;

/* compiled from: TerminalTransactionQualifiers */
public class f {
    private byte[] data = new byte[4];

    public void fV(boolean z) {
        byte[] bArr = this.data;
        bArr[0] = a.a(bArr[0], 5, z);
    }

    public void fW(boolean z) {
        byte[] bArr = this.data;
        bArr[0] = a.a(bArr[0], 3, z);
    }

    public byte[] getBytes() {
        byte[] bArr = this.data;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
