package com.google.android.gms.internal.vision;

final class zzes extends zzex {
    private final int zzsb;
    private final int zzsc;

    zzes(byte[] bArr, int i, int i2) {
        super(bArr);
        zzeo.zzb(i, i + i2, bArr.length);
        this.zzsb = i;
        this.zzsc = i2;
    }

    public final byte zzai(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.zzse[this.zzsb + i];
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

    public final int size() {
        return this.zzsc;
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzdn() {
        return this.zzsb;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzse, zzdn(), bArr, 0, i3);
    }
}
