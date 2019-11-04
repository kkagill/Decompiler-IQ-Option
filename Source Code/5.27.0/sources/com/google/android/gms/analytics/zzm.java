package com.google.android.gms.analytics;

import android.util.Log;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.FutureTask;

final class zzm extends FutureTask<T> {
    private final /* synthetic */ zza zzsy;

    zzm(zza zza, Runnable runnable, Object obj) {
        this.zzsy = zza;
        super(runnable, obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final void setException(Throwable th) {
        UncaughtExceptionHandler zzb = zzk.this.zzsv;
        if (zzb != null) {
            zzb.uncaughtException(Thread.currentThread(), th);
        } else {
            String str = "GAv4";
            if (Log.isLoggable(str, 6)) {
                String valueOf = String.valueOf(th);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
                stringBuilder.append("MeasurementExecutor: job failed with ");
                stringBuilder.append(valueOf);
                Log.e(str, stringBuilder.toString());
            }
        }
        super.setException(th);
    }
}
