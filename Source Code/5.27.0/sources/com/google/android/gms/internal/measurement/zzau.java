package com.google.android.gms.internal.measurement;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.measurement.internal.zzgn;

final class zzau extends zzb {
    private final /* synthetic */ zzz zzaa;
    private final /* synthetic */ zzgn zzbk;

    zzau(zzz zzz, zzgn zzgn) {
        this.zzaa = zzz;
        this.zzbk = zzgn;
        super(zzz);
    }

    /* Access modifiers changed, original: final */
    public final void zzf() {
        for (int i = 0; i < this.zzaa.zzaf.size(); i++) {
            if (this.zzbk.equals(((Pair) this.zzaa.zzaf.get(i)).first)) {
                Log.w(this.zzaa.zzu, "OnEventListener already registered.");
                return;
            }
        }
        zzd zzd = new zzd(this.zzbk);
        this.zzaa.zzaf.add(new Pair(this.zzbk, zzd));
        this.zzaa.zzar.registerOnMeasurementEventListener(zzd);
    }
}
