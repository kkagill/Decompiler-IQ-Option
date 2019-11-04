package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Executor;

final class f {
    private final Context acP;
    private final Bundle adf;
    private final Executor aeE;
    private final e aeF;

    public f(Context context, Bundle bundle, Executor executor) {
        this.aeE = executor;
        this.acP = context;
        this.adf = bundle;
        this.aeF = new e(context, context.getPackageName());
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061 A:{RETURN} */
    public final boolean wY() {
        /*
        r10 = this;
        r0 = r10.adf;
        r1 = "gcm.n.noui";
        r0 = com.google.firebase.messaging.e.d(r0, r1);
        r1 = "1";
        r0 = r1.equals(r0);
        r1 = 1;
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        return r1;
    L_0x0012:
        r0 = r10.acP;
        r2 = "keyguard";
        r0 = r0.getSystemService(r2);
        r0 = (android.app.KeyguardManager) r0;
        r0 = r0.inKeyguardRestrictedInputMode();
        r2 = 0;
        if (r0 != 0) goto L_0x005e;
    L_0x0023:
        r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop();
        if (r0 != 0) goto L_0x002e;
    L_0x0029:
        r3 = 10;
        android.os.SystemClock.sleep(r3);
    L_0x002e:
        r0 = android.os.Process.myPid();
        r3 = r10.acP;
        r4 = "activity";
        r3 = r3.getSystemService(r4);
        r3 = (android.app.ActivityManager) r3;
        r3 = r3.getRunningAppProcesses();
        if (r3 == 0) goto L_0x005e;
    L_0x0042:
        r3 = r3.iterator();
    L_0x0046:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x005e;
    L_0x004c:
        r4 = r3.next();
        r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4;
        r5 = r4.pid;
        if (r5 != r0) goto L_0x0046;
    L_0x0056:
        r0 = r4.importance;
        r3 = 100;
        if (r0 != r3) goto L_0x005e;
    L_0x005c:
        r0 = 1;
        goto L_0x005f;
    L_0x005e:
        r0 = 0;
    L_0x005f:
        if (r0 == 0) goto L_0x0062;
    L_0x0061:
        return r2;
    L_0x0062:
        r0 = r10.adf;
        r3 = "gcm.n.image";
        r0 = com.google.firebase.messaging.e.d(r0, r3);
        r0 = com.google.firebase.messaging.g.co(r0);
        if (r0 == 0) goto L_0x0075;
    L_0x0070:
        r3 = r10.aeE;
        r0.a(r3);
    L_0x0075:
        r3 = r10.aeF;
        r4 = r10.adf;
        r3 = r3.z(r4);
        r4 = r3.aeB;
        r5 = "FirebaseMessaging";
        if (r0 == 0) goto L_0x00c0;
    L_0x0083:
        r6 = r0.getTask();	 Catch:{ ExecutionException -> 0x00bf, InterruptedException -> 0x00af, TimeoutException -> 0x00a6 }
        r7 = 5;
        r9 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ ExecutionException -> 0x00bf, InterruptedException -> 0x00af, TimeoutException -> 0x00a6 }
        r6 = com.google.android.gms.tasks.Tasks.await(r6, r7, r9);	 Catch:{ ExecutionException -> 0x00bf, InterruptedException -> 0x00af, TimeoutException -> 0x00a6 }
        r6 = (android.graphics.Bitmap) r6;	 Catch:{ ExecutionException -> 0x00bf, InterruptedException -> 0x00af, TimeoutException -> 0x00a6 }
        r4.setLargeIcon(r6);	 Catch:{ ExecutionException -> 0x00bf, InterruptedException -> 0x00af, TimeoutException -> 0x00a6 }
        r7 = new androidx.core.app.NotificationCompat$BigPictureStyle;	 Catch:{ ExecutionException -> 0x00bf, InterruptedException -> 0x00af, TimeoutException -> 0x00a6 }
        r7.<init>();	 Catch:{ ExecutionException -> 0x00bf, InterruptedException -> 0x00af, TimeoutException -> 0x00a6 }
        r6 = r7.bigPicture(r6);	 Catch:{ ExecutionException -> 0x00bf, InterruptedException -> 0x00af, TimeoutException -> 0x00a6 }
        r7 = 0;
        r6 = r6.bigLargeIcon(r7);	 Catch:{ ExecutionException -> 0x00bf, InterruptedException -> 0x00af, TimeoutException -> 0x00a6 }
        r4.setStyle(r6);	 Catch:{ ExecutionException -> 0x00bf, InterruptedException -> 0x00af, TimeoutException -> 0x00a6 }
        goto L_0x00c0;
    L_0x00a6:
        r4 = "Failed to download image in time, showing notification without it";
        android.util.Log.w(r5, r4);
        r0.close();
        goto L_0x00c0;
    L_0x00af:
        r4 = "Interrupted while downloading image, showing notification without it";
        android.util.Log.w(r5, r4);
        r0.close();
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        goto L_0x00c0;
    L_0x00c0:
        r0 = 3;
        r0 = android.util.Log.isLoggable(r5, r0);
        if (r0 == 0) goto L_0x00cc;
    L_0x00c7:
        r0 = "Showing notification";
        android.util.Log.d(r5, r0);
    L_0x00cc:
        r0 = r10.acP;
        r4 = "notification";
        r0 = r0.getSystemService(r4);
        r0 = (android.app.NotificationManager) r0;
        r4 = r3.tag;
        r3 = r3.aeB;
        r3 = r3.build();
        r0.notify(r4, r2, r3);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.f.wY():boolean");
    }
}
