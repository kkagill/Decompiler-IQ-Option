package com.pro100svitlo.creditCardNfcReader.iso7816emv;

/* compiled from: TagAndLength */
public class e {
    private ITag eGA;
    private int length;

    public e(ITag iTag, int i) {
        this.eGA = iTag;
        this.length = i;
    }

    public ITag bgy() {
        return this.eGA;
    }

    public int getLength() {
        return this.length;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.eGA.toString());
        stringBuilder.append(" length: ");
        stringBuilder.append(this.length);
        return stringBuilder.toString();
    }
}
