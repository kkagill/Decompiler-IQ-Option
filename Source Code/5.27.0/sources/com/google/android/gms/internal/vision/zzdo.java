package com.google.android.gms.internal.vision;

public final class zzdo extends zzjn<zzdo> {
    public Float zzpc;
    public Float zzpd;
    public Float zzpe;
    public Float zzpf;
    public Float zzpg;
    public Float zzph;

    public zzdo() {
        this.zzpc = null;
        this.zzpd = null;
        this.zzpe = null;
        this.zzpf = null;
        this.zzpg = null;
        this.zzph = null;
        this.zzadp = -1;
    }

    public final void zza(zzjl zzjl) {
        Float f = this.zzpc;
        if (f != null) {
            zzjl.zza(1, f.floatValue());
        }
        f = this.zzpd;
        if (f != null) {
            zzjl.zza(2, f.floatValue());
        }
        f = this.zzpe;
        if (f != null) {
            zzjl.zza(3, f.floatValue());
        }
        f = this.zzpf;
        if (f != null) {
            zzjl.zza(4, f.floatValue());
        }
        f = this.zzpg;
        if (f != null) {
            zzjl.zza(5, f.floatValue());
        }
        f = this.zzph;
        if (f != null) {
            zzjl.zza(6, f.floatValue());
        }
        super.zza(zzjl);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzt() {
        int zzt = super.zzt();
        Float f = this.zzpc;
        if (f != null) {
            f.floatValue();
            zzt += zzjl.zzav(1) + 4;
        }
        f = this.zzpd;
        if (f != null) {
            f.floatValue();
            zzt += zzjl.zzav(2) + 4;
        }
        f = this.zzpe;
        if (f != null) {
            f.floatValue();
            zzt += zzjl.zzav(3) + 4;
        }
        f = this.zzpf;
        if (f != null) {
            f.floatValue();
            zzt += zzjl.zzav(4) + 4;
        }
        f = this.zzpg;
        if (f != null) {
            f.floatValue();
            zzt += zzjl.zzav(5) + 4;
        }
        f = this.zzph;
        if (f == null) {
            return zzt;
        }
        f.floatValue();
        return zzt + (zzjl.zzav(6) + 4);
    }
}
