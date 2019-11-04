package com.google.android.gms.internal.vision;

public final class zzds extends zzjn<zzds> {
    private static volatile zzds[] zzpu;
    public Integer zzpv;
    public Integer zzpw;

    public static zzds[] zzcc() {
        if (zzpu == null) {
            synchronized (zzjr.zzado) {
                if (zzpu == null) {
                    zzpu = new zzds[0];
                }
            }
        }
        return zzpu;
    }

    public zzds() {
        this.zzpv = null;
        this.zzpw = null;
        this.zzadp = -1;
    }

    public final void zza(zzjl zzjl) {
        Integer num = this.zzpv;
        if (num != null) {
            zzjl.zze(1, num.intValue());
        }
        num = this.zzpw;
        if (num != null) {
            zzjl.zze(2, num.intValue());
        }
        super.zza(zzjl);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzt() {
        int zzt = super.zzt();
        Integer num = this.zzpv;
        if (num != null) {
            zzt += zzjl.zzi(1, num.intValue());
        }
        num = this.zzpw;
        return num != null ? zzt + zzjl.zzi(2, num.intValue()) : zzt;
    }
}
