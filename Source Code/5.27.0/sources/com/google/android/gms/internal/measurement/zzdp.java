package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class zzdp implements Serializable, Iterable<Byte> {
    public static final zzdp zzadh = new zzdz(zzez.zzair);
    private static final zzdv zzadi = (zzdi.zzrv() ? new zzdy() : new zzdt());
    private static final Comparator<zzdp> zzadk = new zzdr();
    private int zzadj = 0;

    zzdp() {
    }

    private static int zza(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract int size();

    public abstract int zza(int i, int i2, int i3);

    public abstract zzdp zza(int i, int i2);

    public abstract String zza(Charset charset);

    public abstract void zza(zzdm zzdm);

    public abstract byte zzaq(int i);

    public abstract byte zzar(int i);

    public abstract boolean zzsb();

    public static zzdp zzb(byte[] bArr, int i, int i2) {
        zzb(i, i + i2, bArr.length);
        return new zzdz(zzadi.zzc(bArr, i, i2));
    }

    static zzdp zze(byte[] bArr) {
        return new zzdz(bArr);
    }

    public static zzdp zzdq(String str) {
        return new zzdz(str.getBytes(zzez.UTF_8));
    }

    public final String zzsa() {
        return size() == 0 ? "" : zza(zzez.UTF_8);
    }

    public final int hashCode() {
        int i = this.zzadj;
        if (i == 0) {
            i = size();
            i = zza(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.zzadj = i;
        }
        return i;
    }

    static zzdx zzas(int i) {
        return new zzdx(i, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzsc() {
        return this.zzadj;
    }

    static int zzb(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((((i | i2) | i4) | (i3 - i2)) >= 0) {
            return i4;
        }
        StringBuilder stringBuilder;
        if (i < 0) {
            StringBuilder stringBuilder2 = new StringBuilder(32);
            stringBuilder2.append("Beginning index: ");
            stringBuilder2.append(i);
            stringBuilder2.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder2.toString());
        } else if (i2 < i) {
            stringBuilder = new StringBuilder(66);
            stringBuilder.append("Beginning index larger than ending index: ");
            stringBuilder.append(i);
            stringBuilder.append(", ");
            stringBuilder.append(i2);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else {
            stringBuilder = new StringBuilder(37);
            stringBuilder.append("End index: ");
            stringBuilder.append(i2);
            stringBuilder.append(" >= ");
            stringBuilder.append(i3);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public /* synthetic */ Iterator iterator() {
        return new zzdo(this);
    }
}
