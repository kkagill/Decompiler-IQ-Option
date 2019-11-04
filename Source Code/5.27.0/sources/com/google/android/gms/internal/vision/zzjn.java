package com.google.android.gms.internal.vision;

public abstract class zzjn<M extends zzjn<M>> extends zzjt {
    protected zzjp zzadg;

    /* Access modifiers changed, original: protected */
    public int zzt() {
        if (this.zzadg == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzadg.size(); i2++) {
            i += this.zzadg.zzbx(i2).zzt();
        }
        return i;
    }

    public void zza(zzjl zzjl) {
        if (this.zzadg != null) {
            for (int i = 0; i < this.zzadg.size(); i++) {
                this.zzadg.zzbx(i).zza(zzjl);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zza(zzjk zzjk, int i) {
        int position = zzjk.getPosition();
        if (!zzjk.zzal(i)) {
            return false;
        }
        int i2 = i >>> 3;
        zzjv zzjv = new zzjv(i, zzjk.zzv(position, zzjk.getPosition() - position));
        zzjq zzjq = null;
        zzjp zzjp = this.zzadg;
        if (zzjp == null) {
            this.zzadg = new zzjp();
        } else {
            zzjq = zzjp.zzbw(i2);
        }
        if (zzjq == null) {
            zzjq = new zzjq();
            this.zzadg.zza(i2, zzjq);
        }
        zzjq.zza(zzjv);
        return true;
    }

    public final /* synthetic */ zzjt zzhr() {
        return (zzjn) clone();
    }

    public /* synthetic */ Object clone() {
        zzjn zzjn = (zzjn) super.clone();
        zzjr.zza(this, zzjn);
        return zzjn;
    }
}
