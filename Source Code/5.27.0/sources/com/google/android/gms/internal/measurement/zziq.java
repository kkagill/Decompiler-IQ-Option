package com.google.android.gms.internal.measurement;

public abstract class zziq<M extends zziq<M>> extends zziw {
    protected zzis zzaoo;

    /* Access modifiers changed, original: protected */
    public int zzqy() {
        if (this.zzaoo == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzaoo.size(); i2++) {
            i += this.zzaoo.zzcm(i2).zzqy();
        }
        return i;
    }

    public void zza(zzio zzio) {
        if (this.zzaoo != null) {
            for (int i = 0; i < this.zzaoo.size(); i++) {
                this.zzaoo.zzcm(i).zza(zzio);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zza(zzil zzil, int i) {
        int position = zzil.getPosition();
        if (!zzil.zzau(i)) {
            return false;
        }
        int i2 = i >>> 3;
        zziy zziy = new zziy(i, zzil.zzt(position, zzil.getPosition() - position));
        zzir zzir = null;
        zzis zzis = this.zzaoo;
        if (zzis == null) {
            this.zzaoo = new zzis();
        } else {
            zzir = zzis.zzcl(i2);
        }
        if (zzir == null) {
            zzir = new zzir();
            this.zzaoo.zza(i2, zzir);
        }
        zzir.zza(zziy);
        return true;
    }

    public final /* synthetic */ zziw zzxb() {
        return (zziq) clone();
    }

    public /* synthetic */ Object clone() {
        zziq zziq = (zziq) super.clone();
        zziu.zza(this, zziq);
        return zziq;
    }
}
