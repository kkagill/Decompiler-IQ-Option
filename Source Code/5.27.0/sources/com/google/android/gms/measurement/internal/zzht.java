package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zzht implements Runnable {
    private final /* synthetic */ zzhq zzqz;
    private final /* synthetic */ boolean zzra;
    private final /* synthetic */ zzhr zzrb;
    private final /* synthetic */ zzhr zzrc;

    zzht(zzhq zzhq, boolean z, zzhr zzhr, zzhr zzhr2) {
        this.zzqz = zzhq;
        this.zzra = z;
        this.zzrb = zzhr;
        this.zzrc = zzhr2;
    }

    public final void run() {
        zzhq zzhq;
        Object obj = null;
        Object obj2;
        if (this.zzqz.zzad().zzz(this.zzqz.zzr().zzag())) {
            obj2 = (!this.zzra || this.zzqz.zzqo == null) ? null : 1;
            if (obj2 != null) {
                zzhq zzhq2 = this.zzqz;
                zzhq2.zza(zzhq2.zzqo, true);
            }
        } else {
            if (this.zzra && this.zzqz.zzqo != null) {
                zzhq = this.zzqz;
                zzhq.zza(zzhq.zzqo, true);
            }
            obj2 = null;
        }
        zzhr zzhr = this.zzrb;
        if (!(zzhr != null && zzhr.zzqw == this.zzrc.zzqw && zzjs.zzs(this.zzrb.zzqv, this.zzrc.zzqv) && zzjs.zzs(this.zzrb.zzqu, this.zzrc.zzqu))) {
            obj = 1;
        }
        if (obj != null) {
            Bundle bundle = new Bundle();
            zzhq.zza(this.zzrc, bundle, true);
            zzhr zzhr2 = this.zzrb;
            if (zzhr2 != null) {
                if (zzhr2.zzqu != null) {
                    bundle.putString("_pn", this.zzrb.zzqu);
                }
                bundle.putString("_pc", this.zzrb.zzqv);
                bundle.putLong("_pi", this.zzrb.zzqw);
            }
            if (this.zzqz.zzad().zzz(this.zzqz.zzr().zzag()) && obj2 != null) {
                long zzjb = this.zzqz.zzv().zzjb();
                if (zzjb > 0) {
                    this.zzqz.zzz().zzb(bundle, zzjb);
                }
            }
            this.zzqz.zzq().zza("auto", "_vs", bundle);
        }
        zzhq = this.zzqz;
        zzhq.zzqo = this.zzrc;
        zzhq.zzs().zza(this.zzrc);
    }
}
