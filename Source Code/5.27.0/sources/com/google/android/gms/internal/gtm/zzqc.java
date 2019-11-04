package com.google.android.gms.internal.gtm;

import java.nio.charset.Charset;

class zzqc extends zzqb {
    protected final byte[] zzawe;

    zzqc(byte[] bArr) {
        if (bArr != null) {
            this.zzawe = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected */
    public int zznf() {
        return 0;
    }

    public byte zzak(int i) {
        return this.zzawe[i];
    }

    /* Access modifiers changed, original: 0000 */
    public byte zzal(int i) {
        return this.zzawe[i];
    }

    public int size() {
        return this.zzawe.length;
    }

    public final zzps zzc(int i, int i2) {
        i = zzps.zzb(0, i2, size());
        if (i == 0) {
            return zzps.zzavx;
        }
        return new zzpx(this.zzawe, zznf(), i);
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzpr zzpr) {
        zzpr.zza(this.zzawe, zznf(), size());
    }

    /* Access modifiers changed, original: protected|final */
    public final String zza(Charset charset) {
        return new String(this.zzawe, zznf(), size(), charset);
    }

    public final boolean zznd() {
        int zznf = zznf();
        return zztz.zzf(this.zzawe, zznf, size() + zznf);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzps) || size() != ((zzps) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzqc)) {
            return obj.equals(this);
        }
        zzqc zzqc = (zzqc) obj;
        int zzne = zzne();
        int zzne2 = zzqc.zzne();
        if (zzne == 0 || zzne2 == 0 || zzne == zzne2) {
            return zza(zzqc, 0, size());
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(zzps zzps, int i, int i2) {
        StringBuilder stringBuilder;
        if (i2 > zzps.size()) {
            i = size();
            stringBuilder = new StringBuilder(40);
            stringBuilder.append("Length too large: ");
            stringBuilder.append(i2);
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 > zzps.size()) {
            int size = zzps.size();
            stringBuilder = new StringBuilder(59);
            stringBuilder.append("Ran off end of other: 0, ");
            stringBuilder.append(i2);
            stringBuilder.append(", ");
            stringBuilder.append(size);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (!(zzps instanceof zzqc)) {
            return zzps.zzc(0, i2).equals(zzc(0, i2));
        } else {
            zzqc zzqc = (zzqc) zzps;
            if (zztx.zza(this.zzawe, zznf(), zzqc.zzawe, zzqc.zznf(), i2) == -1) {
                return true;
            }
            return false;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int zza(int i, int i2, int i3) {
        return zzre.zza(i, this.zzawe, zznf(), i3);
    }
}
