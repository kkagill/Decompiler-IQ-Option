package com.google.android.gms.internal.measurement;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.measurement.internal.zzgn;

final class zzaz extends zzb {
    private final /* synthetic */ zzz zzaa;
    private final /* synthetic */ zzgn zzbk;

    zzaz(zzz zzz, zzgn zzgn) {
        this.zzaa = zzz;
        this.zzbk = zzgn;
        super(zzz);
    }

    /* Access modifiers changed, original: final */
    public final void zzf() {
        Pair pair;
        for (int i = 0; i < this.zzaa.zzaf.size(); i++) {
            if (this.zzbk.equals(((Pair) this.zzaa.zzaf.get(i)).first)) {
                pair = (Pair) this.zzaa.zzaf.get(i);
                break;
            }
        }
        pair = null;
        if (pair == null) {
            Log.w(this.zzaa.zzu, "OnEventListener had not been registered.");
            return;
        }
        this.zzaa.zzar.unregisterOnMeasurementEventListener((zzq) pair.second);
        this.zzaa.zzaf.remove(pair);
    }
}
