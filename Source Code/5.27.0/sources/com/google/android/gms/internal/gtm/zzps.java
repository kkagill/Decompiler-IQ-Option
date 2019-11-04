package com.google.android.gms.internal.gtm;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class zzps implements Serializable, Iterable<Byte> {
    public static final zzps zzavx = new zzqc(zzre.zzbbh);
    private static final zzpy zzavy = (zzpp.zzna() ? new zzqd() : new zzpw());
    private static final Comparator<zzps> zzavz = new zzpu();
    private int zzavn = 0;

    zzps() {
    }

    private static int zza(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract int size();

    public abstract int zza(int i, int i2, int i3);

    public abstract String zza(Charset charset);

    public abstract void zza(zzpr zzpr);

    public abstract byte zzak(int i);

    public abstract byte zzal(int i);

    public abstract zzps zzc(int i, int i2);

    public abstract boolean zznd();

    public static zzps zzb(byte[] bArr, int i, int i2) {
        zzb(i, i + i2, bArr.length);
        return new zzqc(zzavy.zzc(bArr, i, i2));
    }

    static zzps zzf(byte[] bArr) {
        return new zzqc(bArr);
    }

    public static zzps zzcy(String str) {
        return new zzqc(str.getBytes(zzre.UTF_8));
    }

    public final String zznc() {
        return size() == 0 ? "" : zza(zzre.UTF_8);
    }

    public final int hashCode() {
        int i = this.zzavn;
        if (i == 0) {
            i = size();
            i = zza(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.zzavn = i;
        }
        return i;
    }

    static zzqa zzam(int i) {
        return new zzqa(i, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzne() {
        return this.zzavn;
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
        return new zzpt(this);
    }
}
