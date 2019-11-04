package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.firebase_messaging.zza;
import com.google.android.gms.internal.firebase_messaging.zzf;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;

public final class e {
    private static e acO;
    private final Context acP;
    private final ScheduledExecutorService acQ;
    private g acR = new g(this);
    private int acS = 1;

    public static synchronized e aD(Context context) {
        e eVar;
        synchronized (e.class) {
            if (acO == null) {
                acO = new e(context, zza.zza().zza(1, new NamedThreadFactory("MessengerIpcClient"), zzf.zze));
            }
            eVar = acO;
        }
        return eVar;
    }

    @VisibleForTesting
    private e(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.acQ = scheduledExecutorService;
        this.acP = context.getApplicationContext();
    }

    public final Task<Void> a(int i, Bundle bundle) {
        return a(new m(wA(), 2, bundle));
    }

    public final Task<Bundle> b(int i, Bundle bundle) {
        return a(new n(wA(), 1, bundle));
    }

    private final synchronized <T> Task<T> a(l<T> lVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(lVar);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 9);
            stringBuilder.append("Queueing ");
            stringBuilder.append(valueOf);
            Log.d("MessengerIpcClient", stringBuilder.toString());
        }
        if (!this.acR.b(lVar)) {
            this.acR = new g(this);
            this.acR.b(lVar);
        }
        return lVar.ade.getTask();
    }

    private final synchronized int wA() {
        int i;
        i = this.acS;
        this.acS = i + 1;
        return i;
    }
}
