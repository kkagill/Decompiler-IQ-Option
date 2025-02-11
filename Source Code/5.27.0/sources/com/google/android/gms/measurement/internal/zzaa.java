package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzh;

abstract class zzaa {
    private static volatile Handler handler;
    private final zzgh zzev;
    private final Runnable zzew;
    private volatile long zzex;

    zzaa(zzgh zzgh) {
        Preconditions.checkNotNull(zzgh);
        this.zzev = zzgh;
        this.zzew = new zzad(this, zzgh);
    }

    public abstract void run();

    public final void zzv(long j) {
        cancel();
        if (j >= 0) {
            this.zzex = this.zzev.zzx().currentTimeMillis();
            if (!getHandler().postDelayed(this.zzew, j)) {
                this.zzev.zzab().zzgk().zza("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean zzcp() {
        return this.zzex != 0;
    }

    /* Access modifiers changed, original: final */
    public final void cancel() {
        this.zzex = 0;
        getHandler().removeCallbacks(this.zzew);
    }

    private final Handler getHandler() {
        if (handler != null) {
            return handler;
        }
        Handler handler;
        synchronized (zzaa.class) {
            if (handler == null) {
                handler = new zzh(this.zzev.getContext().getMainLooper());
            }
            handler = handler;
        }
        return handler;
    }
}
