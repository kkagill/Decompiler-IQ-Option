package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;

class zzbi extends zzbh {
    protected final byte[] zzfp;

    zzbi(byte[] bArr) {
        this.zzfp = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbb) || size() != ((zzbb) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzbi)) {
            return obj.equals(this);
        }
        zzbi zzbi = (zzbi) obj;
        int zzab = zzab();
        int zzab2 = zzbi.zzab();
        return (zzab == 0 || zzab2 == 0 || zzab == zzab2) ? zza(zzbi, 0, size()) : false;
    }

    public int size() {
        return this.zzfp.length;
    }

    /* Access modifiers changed, original: protected|final */
    public final int zza(int i, int i2, int i3) {
        return zzci.zza(i, this.zzfp, zzac(), i3);
    }

    public final zzbb zza(int i, int i2) {
        i = zzbb.zzb(0, i2, size());
        return i == 0 ? zzbb.zzfi : new zzbe(this.zzfp, zzac(), i);
    }

    /* Access modifiers changed, original: protected|final */
    public final String zza(Charset charset) {
        return new String(this.zzfp, zzac(), size(), charset);
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzba zzba) {
        zzba.zza(this.zzfp, zzac(), size());
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(zzbb zzbb, int i, int i2) {
        StringBuilder stringBuilder;
        int size;
        if (i2 > zzbb.size()) {
            i = size();
            stringBuilder = new StringBuilder(40);
            stringBuilder.append("Length too large: ");
            stringBuilder.append(i2);
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 > zzbb.size()) {
            size = zzbb.size();
            stringBuilder = new StringBuilder(59);
            stringBuilder.append("Ran off end of other: 0, ");
            stringBuilder.append(i2);
            stringBuilder.append(", ");
            stringBuilder.append(size);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (!(zzbb instanceof zzbi)) {
            return zzbb.zza(0, i2).equals(zza(0, i2));
        } else {
            zzbi zzbi = (zzbi) zzbb;
            byte[] bArr = this.zzfp;
            byte[] bArr2 = zzbi.zzfp;
            int zzac = zzac() + i2;
            i2 = zzac();
            size = zzbi.zzac();
            while (i2 < zzac) {
                if (bArr[i2] != bArr2[size]) {
                    return false;
                }
                i2++;
                size++;
            }
            return true;
        }
    }

    public final boolean zzaa() {
        int zzac = zzac();
        return zzff.zze(this.zzfp, zzac, size() + zzac);
    }

    /* Access modifiers changed, original: protected */
    public int zzac() {
        return 0;
    }

    public byte zzj(int i) {
        return this.zzfp[i];
    }
}
