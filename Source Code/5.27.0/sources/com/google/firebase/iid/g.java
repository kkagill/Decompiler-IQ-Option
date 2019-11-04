package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.firebase_messaging.zze;
import java.util.ArrayDeque;
import java.util.Queue;

final class g implements ServiceConnection {
    final Messenger acU;
    j acV;
    final Queue<l<?>> acW;
    final SparseArray<l<?>> acX;
    final /* synthetic */ e acY;
    int state;

    private g(e eVar) {
        this.acY = eVar;
        this.state = 0;
        this.acU = new Messenger(new zze(Looper.getMainLooper(), new f(this)));
        this.acW = new ArrayDeque();
        this.acX = new SparseArray();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:14:0x002f, code skipped:
            return false;
     */
    /* JADX WARNING: Missing block: B:36:0x0096, code skipped:
            return true;
     */
    public final synchronized boolean b(com.google.firebase.iid.l r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.state;	 Catch:{ all -> 0x0097 }
        r1 = 2;
        r2 = 0;
        r3 = 1;
        if (r0 == 0) goto L_0x0041;
    L_0x0008:
        if (r0 == r3) goto L_0x003a;
    L_0x000a:
        if (r0 == r1) goto L_0x0030;
    L_0x000c:
        r6 = 3;
        if (r0 == r6) goto L_0x002e;
    L_0x000f:
        r6 = 4;
        if (r0 != r6) goto L_0x0013;
    L_0x0012:
        goto L_0x002e;
    L_0x0013:
        r6 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0097 }
        r0 = r5.state;	 Catch:{ all -> 0x0097 }
        r1 = 26;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0097 }
        r2.<init>(r1);	 Catch:{ all -> 0x0097 }
        r1 = "Unknown state: ";
        r2.append(r1);	 Catch:{ all -> 0x0097 }
        r2.append(r0);	 Catch:{ all -> 0x0097 }
        r0 = r2.toString();	 Catch:{ all -> 0x0097 }
        r6.<init>(r0);	 Catch:{ all -> 0x0097 }
        throw r6;	 Catch:{ all -> 0x0097 }
    L_0x002e:
        monitor-exit(r5);
        return r2;
    L_0x0030:
        r0 = r5.acW;	 Catch:{ all -> 0x0097 }
        r0.add(r6);	 Catch:{ all -> 0x0097 }
        r5.wB();	 Catch:{ all -> 0x0097 }
        monitor-exit(r5);
        return r3;
    L_0x003a:
        r0 = r5.acW;	 Catch:{ all -> 0x0097 }
        r0.add(r6);	 Catch:{ all -> 0x0097 }
        monitor-exit(r5);
        return r3;
    L_0x0041:
        r0 = r5.acW;	 Catch:{ all -> 0x0097 }
        r0.add(r6);	 Catch:{ all -> 0x0097 }
        r6 = r5.state;	 Catch:{ all -> 0x0097 }
        if (r6 != 0) goto L_0x004c;
    L_0x004a:
        r6 = 1;
        goto L_0x004d;
    L_0x004c:
        r6 = 0;
    L_0x004d:
        com.google.android.gms.common.internal.Preconditions.checkState(r6);	 Catch:{ all -> 0x0097 }
        r6 = "MessengerIpcClient";
        r6 = android.util.Log.isLoggable(r6, r1);	 Catch:{ all -> 0x0097 }
        if (r6 == 0) goto L_0x005f;
    L_0x0058:
        r6 = "MessengerIpcClient";
        r0 = "Starting bind to GmsCore";
        android.util.Log.v(r6, r0);	 Catch:{ all -> 0x0097 }
    L_0x005f:
        r5.state = r3;	 Catch:{ all -> 0x0097 }
        r6 = new android.content.Intent;	 Catch:{ all -> 0x0097 }
        r0 = "com.google.android.c2dm.intent.REGISTER";
        r6.<init>(r0);	 Catch:{ all -> 0x0097 }
        r0 = "com.google.android.gms";
        r6.setPackage(r0);	 Catch:{ all -> 0x0097 }
        r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance();	 Catch:{ all -> 0x0097 }
        r1 = r5.acY;	 Catch:{ all -> 0x0097 }
        r1 = r1.acP;	 Catch:{ all -> 0x0097 }
        r6 = r0.bindService(r1, r6, r5, r3);	 Catch:{ all -> 0x0097 }
        if (r6 != 0) goto L_0x0083;
    L_0x007d:
        r6 = "Unable to bind to service";
        r5.zza(r2, r6);	 Catch:{ all -> 0x0097 }
        goto L_0x0095;
    L_0x0083:
        r6 = r5.acY;	 Catch:{ all -> 0x0097 }
        r6 = r6.acQ;	 Catch:{ all -> 0x0097 }
        r0 = new com.google.firebase.iid.i;	 Catch:{ all -> 0x0097 }
        r0.<init>(r5);	 Catch:{ all -> 0x0097 }
        r1 = 30;
        r4 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0097 }
        r6.schedule(r0, r1, r4);	 Catch:{ all -> 0x0097 }
    L_0x0095:
        monitor-exit(r5);
        return r3;
    L_0x0097:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.g.b(com.google.firebase.iid.l):boolean");
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:12:0x0052, code skipped:
            r5 = r5.getData();
     */
    /* JADX WARNING: Missing block: B:13:0x005e, code skipped:
            if (r5.getBoolean("unsupported", false) == false) goto L_0x006c;
     */
    /* JADX WARNING: Missing block: B:14:0x0060, code skipped:
            r1.a(new com.google.firebase.iid.zzam(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Missing block: B:15:0x006c, code skipped:
            r1.zzb(r5);
     */
    /* JADX WARNING: Missing block: B:16:0x006f, code skipped:
            return true;
     */
    public final boolean a(android.os.Message r5) {
        /*
        r4 = this;
        r0 = r5.arg1;
        r1 = "MessengerIpcClient";
        r2 = 3;
        r1 = android.util.Log.isLoggable(r1, r2);
        if (r1 == 0) goto L_0x0023;
    L_0x000b:
        r1 = 41;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r1 = "Received response to request: ";
        r2.append(r1);
        r2.append(r0);
        r1 = r2.toString();
        r2 = "MessengerIpcClient";
        android.util.Log.d(r2, r1);
    L_0x0023:
        monitor-enter(r4);
        r1 = r4.acX;	 Catch:{ all -> 0x0070 }
        r1 = r1.get(r0);	 Catch:{ all -> 0x0070 }
        r1 = (com.google.firebase.iid.l) r1;	 Catch:{ all -> 0x0070 }
        r2 = 1;
        if (r1 != 0) goto L_0x0049;
    L_0x002f:
        r5 = "MessengerIpcClient";
        r1 = 50;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0070 }
        r3.<init>(r1);	 Catch:{ all -> 0x0070 }
        r1 = "Received response for unknown request: ";
        r3.append(r1);	 Catch:{ all -> 0x0070 }
        r3.append(r0);	 Catch:{ all -> 0x0070 }
        r0 = r3.toString();	 Catch:{ all -> 0x0070 }
        android.util.Log.w(r5, r0);	 Catch:{ all -> 0x0070 }
        monitor-exit(r4);	 Catch:{ all -> 0x0070 }
        return r2;
    L_0x0049:
        r3 = r4.acX;	 Catch:{ all -> 0x0070 }
        r3.remove(r0);	 Catch:{ all -> 0x0070 }
        r4.wC();	 Catch:{ all -> 0x0070 }
        monitor-exit(r4);	 Catch:{ all -> 0x0070 }
        r5 = r5.getData();
        r0 = 0;
        r3 = "unsupported";
        r0 = r5.getBoolean(r3, r0);
        if (r0 == 0) goto L_0x006c;
    L_0x0060:
        r5 = new com.google.firebase.iid.zzam;
        r0 = 4;
        r3 = "Not supported by GmsCore";
        r5.<init>(r0, r3);
        r1.a(r5);
        goto L_0x006f;
    L_0x006c:
        r1.zzb(r5);
    L_0x006f:
        return r2;
    L_0x0070:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0070 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.g.a(android.os.Message):boolean");
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            zza(0, "Null service connection");
            return;
        }
        try {
            this.acV = new j(iBinder);
            this.state = 2;
            wB();
        } catch (RemoteException e) {
            zza(0, e.getMessage());
        }
    }

    private final void wB() {
        this.acY.acQ.execute(new h(this));
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        zza(2, "Service disconnected");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void zza(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str2 = "MessengerIpcClient";
            String str3 = "Disconnected: ";
            String valueOf = String.valueOf(str);
            Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        int i2 = this.state;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.state = 4;
            ConnectionTracker.getInstance().unbindService(this.acY.acP, this);
            zzam zzam = new zzam(i, str);
            for (l a : this.acW) {
                a.a(zzam);
            }
            this.acW.clear();
            for (i = 0; i < this.acX.size(); i++) {
                ((l) this.acX.valueAt(i)).a(zzam);
            }
            this.acX.clear();
        } else if (i2 == 3) {
            this.state = 4;
        } else if (i2 != 4) {
            int i3 = this.state;
            StringBuilder stringBuilder = new StringBuilder(26);
            stringBuilder.append("Unknown state: ");
            stringBuilder.append(i3);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void wC() {
        if (this.state == 2 && this.acW.isEmpty() && this.acX.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.state = 3;
            ConnectionTracker.getInstance().unbindService(this.acY.acP, this);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void wD() {
        if (this.state == 1) {
            zza(1, "Timed out while binding");
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void zza(int i) {
        l lVar = (l) this.acX.get(i);
        if (lVar != null) {
            StringBuilder stringBuilder = new StringBuilder(31);
            stringBuilder.append("Timing out request: ");
            stringBuilder.append(i);
            Log.w("MessengerIpcClient", stringBuilder.toString());
            this.acX.remove(i);
            lVar.a(new zzam(3, "Timed out waiting for response"));
            wC();
        }
    }
}
