package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.firebase_messaging.zza;
import com.google.android.gms.internal.firebase_messaging.zzb;
import com.google.android.gms.internal.firebase_messaging.zzf;
import java.util.concurrent.ExecutorService;

public abstract class ad extends Service {
    @VisibleForTesting
    final ExecutorService adL;
    private Binder adM;
    private final Object lock;
    private int zzv;
    private int zzw;

    public ad() {
        zzb zza = zza.zza();
        String valueOf = String.valueOf(getClass().getSimpleName());
        String str = "Firebase-";
        this.adL = zza.zza(new NamedThreadFactory(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)), zzf.zze);
        this.lock = new Object();
        this.zzw = 0;
    }

    /* Access modifiers changed, original: protected */
    public Intent h(Intent intent) {
        return intent;
    }

    public abstract void i(Intent intent);

    public boolean zzc(Intent intent) {
        return false;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.adM == null) {
            this.adM = new ah(this);
        }
        return this.adM;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.zzv = i2;
            this.zzw++;
        }
        Intent h = h(intent);
        if (h == null) {
            zza(intent);
            return 2;
        } else if (zzc(h)) {
            zza(intent);
            return 2;
        } else {
            this.adL.execute(new ab(this, h, intent));
            return 3;
        }
    }

    private final void zza(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            this.zzw--;
            if (this.zzw == 0) {
                stopSelfResult(this.zzv);
            }
        }
    }
}
