package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;

class zzex extends zzew {
    protected final byte[] zzse;

    zzex(byte[] bArr) {
        if (bArr != null) {
            this.zzse = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected */
    public int zzdn() {
        return 0;
    }

    public byte zzai(int i) {
        return this.zzse[i];
    }

    public int size() {
        return this.zzse.length;
    }

    public final zzeo zzc(int i, int i2) {
        i = zzeo.zzb(0, i2, size());
        if (i == 0) {
            return zzeo.zzrx;
        }
        return new zzes(this.zzse, zzdn(), i);
    }

    /* Access modifiers changed, original: protected */
    public void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzse, 0, bArr, 0, i3);
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzen zzen) {
        zzen.zza(this.zzse, zzdn(), size());
    }

    /* Access modifiers changed, original: protected|final */
    public final String zza(Charset charset) {
        return new String(this.zzse, zzdn(), size(), charset);
    }

    public final boolean zzdl() {
        int zzdn = zzdn();
        return zziw.zzg(this.zzse, zzdn, size() + zzdn);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzeo) || size() != ((zzeo) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzex)) {
            return obj.equals(this);
        }
        zzex zzex = (zzex) obj;
        int zzdm = zzdm();
        int zzdm2 = zzex.zzdm();
        if (zzdm == 0 || zzdm2 == 0 || zzdm == zzdm2) {
            return zza(zzex, 0, size());
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(zzeo zzeo, int i, int i2) {
        StringBuilder stringBuilder;
        int size;
        if (i2 > zzeo.size()) {
            i = size();
            stringBuilder = new StringBuilder(40);
            stringBuilder.append("Length too large: ");
            stringBuilder.append(i2);
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 > zzeo.size()) {
            size = zzeo.size();
            stringBuilder = new StringBuilder(59);
            stringBuilder.append("Ran off end of other: 0, ");
            stringBuilder.append(i2);
            stringBuilder.append(", ");
            stringBuilder.append(size);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (!(zzeo instanceof zzex)) {
            return zzeo.zzc(0, i2).equals(zzc(0, i2));
        } else {
            zzex zzex = (zzex) zzeo;
            byte[] bArr = this.zzse;
            byte[] bArr2 = zzex.zzse;
            int zzdn = zzdn() + i2;
            i2 = zzdn();
            size = zzex.zzdn();
            while (i2 < zzdn) {
                if (bArr[i2] != bArr2[size]) {
                    return false;
                }
                i2++;
                size++;
            }
            return true;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int zza(int i, int i2, int i3) {
        return zzga.zza(i, this.zzse, zzdn(), i3);
    }
}
