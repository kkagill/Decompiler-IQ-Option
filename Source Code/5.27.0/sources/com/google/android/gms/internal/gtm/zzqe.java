package com.google.android.gms.internal.gtm;

public abstract class zzqe {
    int zzawf;
    int zzawg;
    private int zzawh;
    zzqh zzawi;
    private boolean zzawj;

    public static zzqe zzd(byte[] bArr, int i, int i2) {
        return zza(bArr, i, i2, false);
    }

    public abstract double readDouble();

    public abstract float readFloat();

    public abstract String readString();

    public abstract <T extends zzsk> T zza(zzsu<T> zzsu, zzqp zzqp);

    public abstract void zzan(int i);

    public abstract boolean zzao(int i);

    public abstract int zzaq(int i);

    public abstract void zzar(int i);

    public abstract void zzas(int i);

    public abstract int zzni();

    public abstract long zznj();

    public abstract long zznk();

    public abstract int zznl();

    public abstract long zznm();

    public abstract int zznn();

    public abstract boolean zzno();

    public abstract String zznp();

    public abstract zzps zznq();

    public abstract int zznr();

    public abstract int zzns();

    public abstract int zznt();

    public abstract long zznu();

    public abstract int zznv();

    public abstract long zznw();

    public abstract long zznx();

    public abstract boolean zzny();

    public abstract int zznz();

    static zzqe zza(byte[] bArr, int i, int i2, boolean z) {
        zzqg zzqg = new zzqg(bArr, i, i2, false, null);
        try {
            zzqg.zzaq(i2);
            return zzqg;
        } catch (zzrk e) {
            throw new IllegalArgumentException(e);
        }
    }

    private zzqe() {
        this.zzawg = 100;
        this.zzawh = Integer.MAX_VALUE;
        this.zzawj = false;
    }

    public final int zzap(int i) {
        if (i >= 0) {
            int i2 = this.zzawg;
            this.zzawg = i;
            return i2;
        }
        StringBuilder stringBuilder = new StringBuilder(47);
        stringBuilder.append("Recursion limit cannot be negative: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* synthetic */ zzqe(zzqf zzqf) {
        this();
    }
}
