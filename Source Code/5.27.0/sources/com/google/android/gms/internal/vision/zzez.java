package com.google.android.gms.internal.vision;

public abstract class zzez {
    int zzsf;
    int zzsg;
    private int zzsh;
    zzfc zzsi;
    private boolean zzsj;

    public static int zzaq(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long zzd(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static zzez zzf(byte[] bArr) {
        return zza(bArr, 0, bArr.length, false);
    }

    public abstract double readDouble();

    public abstract float readFloat();

    public abstract String readString();

    public abstract <T extends zzhf> T zza(zzhq<T> zzhq, zzfk zzfk);

    public abstract void zzak(int i);

    public abstract boolean zzal(int i);

    public abstract int zzan(int i);

    public abstract void zzao(int i);

    public abstract void zzap(int i);

    public abstract boolean zzcm();

    public abstract long zzcp();

    public abstract long zzcq();

    public abstract int zzcr();

    public abstract long zzcs();

    public abstract int zzct();

    public abstract boolean zzcu();

    public abstract String zzcv();

    public abstract zzeo zzcw();

    public abstract int zzcx();

    public abstract int zzcy();

    public abstract int zzcz();

    public abstract long zzda();

    public abstract int zzdb();

    public abstract long zzdc();

    public abstract int zzdq();

    public abstract long zzdr();

    public abstract int zzds();

    public static zzez zze(byte[] bArr, int i, int i2) {
        return zza(bArr, i, i2, false);
    }

    private static zzez zza(byte[] bArr, int i, int i2, boolean z) {
        zzfb zzfb = new zzfb(bArr, i, i2, false, null);
        try {
            zzfb.zzan(i2);
            return zzfb;
        } catch (zzgf e) {
            throw new IllegalArgumentException(e);
        }
    }

    private zzez() {
        this.zzsg = 100;
        this.zzsh = Integer.MAX_VALUE;
        this.zzsj = false;
    }

    public final int zzam(int i) {
        if (i >= 0) {
            int i2 = this.zzsg;
            this.zzsg = i;
            return i2;
        }
        StringBuilder stringBuilder = new StringBuilder(47);
        stringBuilder.append("Recursion limit cannot be negative: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* synthetic */ zzez(zzfa zzfa) {
        this();
    }
}
