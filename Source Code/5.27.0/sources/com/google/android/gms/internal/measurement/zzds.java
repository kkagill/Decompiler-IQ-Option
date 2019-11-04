package com.google.android.gms.internal.measurement;

final class zzds extends zzdz {
    private final int zzadl;
    private final int zzadm;

    zzds(byte[] bArr, int i, int i2) {
        super(bArr);
        zzdp.zzb(i, i + i2, bArr.length);
        this.zzadl = i;
        this.zzadm = i2;
    }

    public final byte zzaq(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.zzado[this.zzadl + i];
        }
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(22);
            stringBuilder.append("Index < 0: ");
            stringBuilder.append(i);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder(40);
        stringBuilder2.append("Index > length: ");
        stringBuilder2.append(i);
        stringBuilder2.append(", ");
        stringBuilder2.append(size);
        throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
    }

    /* Access modifiers changed, original: final */
    public final byte zzar(int i) {
        return this.zzado[this.zzadl + i];
    }

    public final int size() {
        return this.zzadm;
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzsd() {
        return this.zzadl;
    }
}
