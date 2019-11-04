package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class aj implements ServiceConnection {
    private final Context acP;
    private final Intent adV;
    private final ScheduledExecutorService adW;
    private final Queue<af> adX;
    private ah adY;
    @GuardedBy("this")
    private boolean zzal;

    public aj(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @VisibleForTesting
    private aj(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.adX = new ArrayDeque();
        this.zzal = false;
        this.acP = context.getApplicationContext();
        this.adV = new Intent(str).setPackage(this.acP.getPackageName());
        this.adW = scheduledExecutorService;
    }

    public final synchronized void a(Intent intent, PendingResult pendingResult) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
        }
        this.adX.add(new af(intent, pendingResult, this.adW));
        zzf();
    }

    /* JADX WARNING: Missing block: B:40:0x00a8, code skipped:
            return;
     */
    private final synchronized void zzf() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = "EnhancedIntentService";
        r1 = 3;
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00ab }
        if (r0 == 0) goto L_0x0011;
    L_0x000a:
        r0 = "EnhancedIntentService";
        r2 = "flush queue called";
        android.util.Log.d(r0, r2);	 Catch:{ all -> 0x00ab }
    L_0x0011:
        r0 = r6.adX;	 Catch:{ all -> 0x00ab }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00ab }
        if (r0 != 0) goto L_0x00a9;
    L_0x0019:
        r0 = "EnhancedIntentService";
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00ab }
        if (r0 == 0) goto L_0x0028;
    L_0x0021:
        r0 = "EnhancedIntentService";
        r2 = "found intent to be delivered";
        android.util.Log.d(r0, r2);	 Catch:{ all -> 0x00ab }
    L_0x0028:
        r0 = r6.adY;	 Catch:{ all -> 0x00ab }
        if (r0 == 0) goto L_0x0051;
    L_0x002c:
        r0 = r6.adY;	 Catch:{ all -> 0x00ab }
        r0 = r0.isBinderAlive();	 Catch:{ all -> 0x00ab }
        if (r0 == 0) goto L_0x0051;
    L_0x0034:
        r0 = "EnhancedIntentService";
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00ab }
        if (r0 == 0) goto L_0x0043;
    L_0x003c:
        r0 = "EnhancedIntentService";
        r2 = "binder is alive, sending the intent.";
        android.util.Log.d(r0, r2);	 Catch:{ all -> 0x00ab }
    L_0x0043:
        r0 = r6.adX;	 Catch:{ all -> 0x00ab }
        r0 = r0.poll();	 Catch:{ all -> 0x00ab }
        r0 = (com.google.firebase.iid.af) r0;	 Catch:{ all -> 0x00ab }
        r2 = r6.adY;	 Catch:{ all -> 0x00ab }
        r2.a(r0);	 Catch:{ all -> 0x00ab }
        goto L_0x0011;
    L_0x0051:
        r0 = "EnhancedIntentService";
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00ab }
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x007a;
    L_0x005b:
        r0 = "EnhancedIntentService";
        r3 = r6.zzal;	 Catch:{ all -> 0x00ab }
        if (r3 != 0) goto L_0x0063;
    L_0x0061:
        r3 = 1;
        goto L_0x0064;
    L_0x0063:
        r3 = 0;
    L_0x0064:
        r4 = 39;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ab }
        r5.<init>(r4);	 Catch:{ all -> 0x00ab }
        r4 = "binder is dead. start connection? ";
        r5.append(r4);	 Catch:{ all -> 0x00ab }
        r5.append(r3);	 Catch:{ all -> 0x00ab }
        r3 = r5.toString();	 Catch:{ all -> 0x00ab }
        android.util.Log.d(r0, r3);	 Catch:{ all -> 0x00ab }
    L_0x007a:
        r0 = r6.zzal;	 Catch:{ all -> 0x00ab }
        if (r0 != 0) goto L_0x00a7;
    L_0x007e:
        r6.zzal = r2;	 Catch:{ all -> 0x00ab }
        r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance();	 Catch:{ SecurityException -> 0x009a }
        r2 = r6.acP;	 Catch:{ SecurityException -> 0x009a }
        r3 = r6.adV;	 Catch:{ SecurityException -> 0x009a }
        r4 = 65;
        r0 = r0.bindService(r2, r3, r6, r4);	 Catch:{ SecurityException -> 0x009a }
        if (r0 == 0) goto L_0x0092;
    L_0x0090:
        monitor-exit(r6);
        return;
    L_0x0092:
        r0 = "EnhancedIntentService";
        r2 = "binding to the service failed";
        android.util.Log.e(r0, r2);	 Catch:{ SecurityException -> 0x009a }
        goto L_0x00a2;
    L_0x009a:
        r0 = move-exception;
        r2 = "EnhancedIntentService";
        r3 = "Exception while binding the service";
        android.util.Log.e(r2, r3, r0);	 Catch:{ all -> 0x00ab }
    L_0x00a2:
        r6.zzal = r1;	 Catch:{ all -> 0x00ab }
        r6.wQ();	 Catch:{ all -> 0x00ab }
    L_0x00a7:
        monitor-exit(r6);
        return;
    L_0x00a9:
        monitor-exit(r6);
        return;
    L_0x00ab:
        r0 = move-exception;
        monitor-exit(r6);
        goto L_0x00af;
    L_0x00ae:
        throw r0;
    L_0x00af:
        goto L_0x00ae;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.aj.zzf():void");
    }

    @GuardedBy("this")
    private final void wQ() {
        while (!this.adX.isEmpty()) {
            ((af) this.adX.poll()).finish();
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
            stringBuilder.append("onServiceConnected: ");
            stringBuilder.append(valueOf);
            Log.d("EnhancedIntentService", stringBuilder.toString());
        }
        this.zzal = false;
        if (iBinder instanceof ah) {
            this.adY = (ah) iBinder;
            zzf();
            return;
        }
        String valueOf2 = String.valueOf(iBinder);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
        stringBuilder2.append("Invalid service connection: ");
        stringBuilder2.append(valueOf2);
        Log.e("EnhancedIntentService", stringBuilder2.toString());
        wQ();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        String str = "EnhancedIntentService";
        if (Log.isLoggable(str, 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
            stringBuilder.append("onServiceDisconnected: ");
            stringBuilder.append(valueOf);
            Log.d(str, stringBuilder.toString());
        }
        zzf();
    }
}
