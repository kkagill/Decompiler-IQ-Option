package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

class zzdz extends zzdw {
    protected final byte[] zzado;

    zzdz(byte[] bArr) {
        if (bArr != null) {
            this.zzado = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected */
    public int zzsd() {
        return 0;
    }

    public byte zzaq(int i) {
        return this.zzado[i];
    }

    /* Access modifiers changed, original: 0000 */
    public byte zzar(int i) {
        return this.zzado[i];
    }

    public int size() {
        return this.zzado.length;
    }

    public final zzdp zza(int i, int i2) {
        i = zzdp.zzb(0, i2, size());
        if (i == 0) {
            return zzdp.zzadh;
        }
        return new zzds(this.zzado, zzsd(), i);
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzdm zzdm) {
        zzdm.zza(this.zzado, zzsd(), size());
    }

    /* Access modifiers changed, original: protected|final */
    public final String zza(Charset charset) {
        return new String(this.zzado, zzsd(), size(), charset);
    }

    public final boolean zzsb() {
        int zzsd = zzsd();
        return zzhy.zzf(this.zzado, zzsd, size() + zzsd);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdp) || size() != ((zzdp) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzdz)) {
            return obj.equals(this);
        }
        zzdz zzdz = (zzdz) obj;
        int zzsc = zzsc();
        int zzsc2 = zzdz.zzsc();
        if (zzsc == 0 || zzsc2 == 0 || zzsc == zzsc2) {
            return zza(zzdz, 0, size());
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(zzdp zzdp, int i, int i2) {
        StringBuilder stringBuilder;
        int size;
        if (i2 > zzdp.size()) {
            i = size();
            stringBuilder = new StringBuilder(40);
            stringBuilder.append("Length too large: ");
            stringBuilder.append(i2);
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 > zzdp.size()) {
            size = zzdp.size();
            stringBuilder = new StringBuilder(59);
            stringBuilder.append("Ran off end of other: 0, ");
            stringBuilder.append(i2);
            stringBuilder.append(", ");
            stringBuilder.append(size);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (!(zzdp instanceof zzdz)) {
            return zzdp.zza(0, i2).equals(zza(0, i2));
        } else {
            zzdz zzdz = (zzdz) zzdp;
            byte[] bArr = this.zzado;
            byte[] bArr2 = zzdz.zzado;
            int zzsd = zzsd() + i2;
            i2 = zzsd();
            size = zzdz.zzsd();
            while (i2 < zzsd) {
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
        return zzez.zza(i, this.zzado, zzsd(), i3);
    }
}
