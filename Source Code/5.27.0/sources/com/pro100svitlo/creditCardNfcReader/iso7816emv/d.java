package com.pro100svitlo.creditCardNfcReader.iso7816emv;

/* compiled from: TLV */
public class d {
    private ITag eGA;
    private byte[] eGB;
    private byte[] eGC;
    private int length;

    public d(ITag iTag, int i, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || i != bArr2.length) {
            throw new IllegalArgumentException("length != bytes.length");
        }
        this.eGA = iTag;
        this.eGB = bArr;
        this.eGC = bArr2;
        this.length = i;
    }

    public ITag bgy() {
        return this.eGA;
    }

    public byte[] bgz() {
        return this.eGC;
    }
}
