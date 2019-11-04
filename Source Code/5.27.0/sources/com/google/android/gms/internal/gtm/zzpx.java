package com.google.android.gms.internal.gtm;

final class zzpx extends zzqc {
    private final int zzawb;
    private final int zzawc;

    zzpx(byte[] bArr, int i, int i2) {
        super(bArr);
        zzps.zzb(i, i + i2, bArr.length);
        this.zzawb = i;
        this.zzawc = i2;
    }

    public final byte zzak(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.zzawe[this.zzawb + i];
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
    public final byte zzal(int i) {
        return this.zzawe[this.zzawb + i];
    }

    public final int size() {
        return this.zzawc;
    }

    /* Access modifiers changed, original: protected|final */
    public final int zznf() {
        return this.zzawb;
    }
}
