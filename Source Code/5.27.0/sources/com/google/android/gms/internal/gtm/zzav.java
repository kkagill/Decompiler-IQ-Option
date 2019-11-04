package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzav implements ServiceConnection {
    final /* synthetic */ zzat zzxe;
    private volatile zzce zzxf;
    private volatile boolean zzxg;

    protected zzav(zzat zzat) {
        this.zzxe = zzat;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x005e */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|(1:15)) */
    /* JADX WARNING: Missing block: B:17:0x0075, code skipped:
            return r0;
     */
    public final com.google.android.gms.internal.gtm.zzce zzdq() {
        /*
        r6 = this;
        com.google.android.gms.analytics.zzk.zzav();
        r0 = new android.content.Intent;
        r1 = "com.google.android.gms.analytics.service.START";
        r0.<init>(r1);
        r1 = new android.content.ComponentName;
        r2 = "com.google.android.gms";
        r3 = "com.google.android.gms.analytics.service.AnalyticsService";
        r1.<init>(r2, r3);
        r0.setComponent(r1);
        r1 = r6.zzxe;
        r1 = r1.getContext();
        r2 = r1.getPackageName();
        r3 = "app_package_name";
        r0.putExtra(r3, r2);
        r2 = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
        monitor-enter(r6);
        r3 = 0;
        r6.zzxf = r3;	 Catch:{ all -> 0x0076 }
        r4 = 1;
        r6.zzxg = r4;	 Catch:{ all -> 0x0076 }
        r4 = r6.zzxe;	 Catch:{ all -> 0x0076 }
        r4 = r4.zzxa;	 Catch:{ all -> 0x0076 }
        r5 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r0 = r2.bindService(r1, r0, r4, r5);	 Catch:{ all -> 0x0076 }
        r1 = r6.zzxe;	 Catch:{ all -> 0x0076 }
        r2 = "Bind to service requested";
        r4 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x0076 }
        r1.zza(r2, r4);	 Catch:{ all -> 0x0076 }
        r1 = 0;
        if (r0 != 0) goto L_0x004e;
    L_0x004a:
        r6.zzxg = r1;	 Catch:{ all -> 0x0076 }
        monitor-exit(r6);	 Catch:{ all -> 0x0076 }
        return r3;
    L_0x004e:
        r0 = com.google.android.gms.internal.gtm.zzby.zzaak;	 Catch:{ InterruptedException -> 0x005e }
        r0 = r0.get();	 Catch:{ InterruptedException -> 0x005e }
        r0 = (java.lang.Long) r0;	 Catch:{ InterruptedException -> 0x005e }
        r4 = r0.longValue();	 Catch:{ InterruptedException -> 0x005e }
        r6.wait(r4);	 Catch:{ InterruptedException -> 0x005e }
        goto L_0x0065;
    L_0x005e:
        r0 = r6.zzxe;	 Catch:{ all -> 0x0076 }
        r2 = "Wait for service connect was interrupted";
        r0.zzt(r2);	 Catch:{ all -> 0x0076 }
    L_0x0065:
        r6.zzxg = r1;	 Catch:{ all -> 0x0076 }
        r0 = r6.zzxf;	 Catch:{ all -> 0x0076 }
        r6.zzxf = r3;	 Catch:{ all -> 0x0076 }
        if (r0 != 0) goto L_0x0074;
    L_0x006d:
        r1 = r6.zzxe;	 Catch:{ all -> 0x0076 }
        r2 = "Successfully bound to service but never got onServiceConnected callback";
        r1.zzu(r2);	 Catch:{ all -> 0x0076 }
    L_0x0074:
        monitor-exit(r6);	 Catch:{ all -> 0x0076 }
        return r0;
    L_0x0076:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0076 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzav.zzdq():com.google.android.gms.internal.gtm.zzce");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0083 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004a */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:10|11|12|(2:(1:15)(3:16|(1:18)(1:19)|20)|21)(1:22)|(2:26|27)(3:28|29|(1:31)(1:32))|33|34|35|36) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Missing block: B:24:?, code skipped:
            r2.zzxe.zzu("Service connect failed to get IAnalyticsService");
     */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
        r2 = this;
        r3 = "AnalyticsServiceConnection.onServiceConnected";
        com.google.android.gms.common.internal.Preconditions.checkMainThread(r3);
        monitor-enter(r2);
        if (r4 != 0) goto L_0x0017;
    L_0x0008:
        r3 = r2.zzxe;	 Catch:{ all -> 0x0014 }
        r4 = "Service connected with null binder";
        r3.zzu(r4);	 Catch:{ all -> 0x0014 }
        r2.notifyAll();	 Catch:{ all -> 0x008c }
        monitor-exit(r2);	 Catch:{ all -> 0x008c }
        return;
    L_0x0014:
        r3 = move-exception;
        goto L_0x0088;
    L_0x0017:
        r3 = 0;
        r0 = r4.getInterfaceDescriptor();	 Catch:{ RemoteException -> 0x004a }
        r1 = "com.google.android.gms.analytics.internal.IAnalyticsService";
        r1 = r1.equals(r0);	 Catch:{ RemoteException -> 0x004a }
        if (r1 == 0) goto L_0x0042;
    L_0x0024:
        if (r4 != 0) goto L_0x0027;
    L_0x0026:
        goto L_0x003a;
    L_0x0027:
        r0 = "com.google.android.gms.analytics.internal.IAnalyticsService";
        r0 = r4.queryLocalInterface(r0);	 Catch:{ RemoteException -> 0x004a }
        r1 = r0 instanceof com.google.android.gms.internal.gtm.zzce;	 Catch:{ RemoteException -> 0x004a }
        if (r1 == 0) goto L_0x0034;
    L_0x0031:
        r0 = (com.google.android.gms.internal.gtm.zzce) r0;	 Catch:{ RemoteException -> 0x004a }
        goto L_0x0039;
    L_0x0034:
        r0 = new com.google.android.gms.internal.gtm.zzcf;	 Catch:{ RemoteException -> 0x004a }
        r0.<init>(r4);	 Catch:{ RemoteException -> 0x004a }
    L_0x0039:
        r3 = r0;
    L_0x003a:
        r4 = r2.zzxe;	 Catch:{ RemoteException -> 0x004a }
        r0 = "Bound to IAnalyticsService interface";
        r4.zzq(r0);	 Catch:{ RemoteException -> 0x004a }
        goto L_0x0051;
    L_0x0042:
        r4 = r2.zzxe;	 Catch:{ RemoteException -> 0x004a }
        r1 = "Got binder with a wrong descriptor";
        r4.zze(r1, r0);	 Catch:{ RemoteException -> 0x004a }
        goto L_0x0051;
    L_0x004a:
        r4 = r2.zzxe;	 Catch:{ all -> 0x0014 }
        r0 = "Service connect failed to get IAnalyticsService";
        r4.zzu(r0);	 Catch:{ all -> 0x0014 }
    L_0x0051:
        if (r3 != 0) goto L_0x0067;
    L_0x0053:
        r3 = com.google.android.gms.common.stats.ConnectionTracker.getInstance();	 Catch:{ IllegalArgumentException -> 0x0083 }
        r4 = r2.zzxe;	 Catch:{ IllegalArgumentException -> 0x0083 }
        r4 = r4.getContext();	 Catch:{ IllegalArgumentException -> 0x0083 }
        r0 = r2.zzxe;	 Catch:{ IllegalArgumentException -> 0x0083 }
        r0 = r0.zzxa;	 Catch:{ IllegalArgumentException -> 0x0083 }
        r3.unbindService(r4, r0);	 Catch:{ IllegalArgumentException -> 0x0083 }
        goto L_0x0083;
    L_0x0067:
        r4 = r2.zzxg;	 Catch:{ all -> 0x0014 }
        if (r4 != 0) goto L_0x0081;
    L_0x006b:
        r4 = r2.zzxe;	 Catch:{ all -> 0x0014 }
        r0 = "onServiceConnected received after the timeout limit";
        r4.zzt(r0);	 Catch:{ all -> 0x0014 }
        r4 = r2.zzxe;	 Catch:{ all -> 0x0014 }
        r4 = r4.zzcq();	 Catch:{ all -> 0x0014 }
        r0 = new com.google.android.gms.internal.gtm.zzaw;	 Catch:{ all -> 0x0014 }
        r0.<init>(r2, r3);	 Catch:{ all -> 0x0014 }
        r4.zza(r0);	 Catch:{ all -> 0x0014 }
        goto L_0x0083;
    L_0x0081:
        r2.zzxf = r3;	 Catch:{ all -> 0x0014 }
    L_0x0083:
        r2.notifyAll();	 Catch:{ all -> 0x008c }
        monitor-exit(r2);	 Catch:{ all -> 0x008c }
        return;
    L_0x0088:
        r2.notifyAll();	 Catch:{ all -> 0x008c }
        throw r3;	 Catch:{ all -> 0x008c }
    L_0x008c:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x008c }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzav.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("AnalyticsServiceConnection.onServiceDisconnected");
        this.zzxe.zzcq().zza(new zzax(this, componentName));
    }
}
