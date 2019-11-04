package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class zzeo implements Serializable, Iterable<Byte> {
    public static final zzeo zzrx = new zzex(zzga.zzxn);
    private static final zzet zzry = (zzeg.zzck() ? new zzey() : new zzer());
    private static final Comparator<zzeo> zzrz = new zzeq();
    private int zzlv = 0;

    zzeo() {
    }

    private static int zza(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract int size();

    public abstract int zza(int i, int i2, int i3);

    public abstract String zza(Charset charset);

    public abstract void zza(zzen zzen);

    public abstract void zza(byte[] bArr, int i, int i2, int i3);

    public abstract byte zzai(int i);

    public abstract zzeo zzc(int i, int i2);

    public abstract boolean zzdl();

    public static zzeo zzb(byte[] bArr, int i, int i2) {
        zzb(i, i + i2, bArr.length);
        return new zzex(zzry.zzd(bArr, i, i2));
    }

    static zzeo zze(byte[] bArr) {
        return new zzex(bArr);
    }

    static zzeo zzc(byte[] bArr, int i, int i2) {
        return new zzes(bArr, i, i2);
    }

    public static zzeo zzl(String str) {
        return new zzex(str.getBytes(zzga.UTF_8));
    }

    public final String zzdk() {
        return size() == 0 ? "" : zza(zzga.UTF_8);
    }

    public final int hashCode() {
        int i = this.zzlv;
        if (i == 0) {
            i = size();
            i = zza(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.zzlv = i;
        }
        return i;
    }

    static zzev zzaj(int i) {
        return new zzev(i, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzdm() {
        return this.zzlv;
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
        return new zzep(this);
    }
}
