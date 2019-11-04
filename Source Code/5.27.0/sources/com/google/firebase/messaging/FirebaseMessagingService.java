package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.WorkerThread;
import com.google.firebase.iid.ad;
import com.google.firebase.iid.x;
import java.util.ArrayDeque;
import java.util.Queue;

public class FirebaseMessagingService extends ad {
    private static final Queue<String> aeq = new ArrayDeque(10);

    @WorkerThread
    public void a(c cVar) {
    }

    @WorkerThread
    public void b(String str, Exception exception) {
    }

    @WorkerThread
    public void cj(String str) {
    }

    @WorkerThread
    public void ck(String str) {
    }

    @WorkerThread
    public void wT() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Intent h(Intent intent) {
        return x.wJ().wK();
    }

    public final boolean zzc(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (b.n(intent)) {
            b.k(intent);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARNING: Missing block: B:54:0x00f4, code skipped:
            if (r1.equals(r5) != false) goto L_0x0102;
     */
    public final void i(android.content.Intent r12) {
        /*
        r11 = this;
        r0 = r12.getAction();
        r1 = "com.google.android.c2dm.intent.RECEIVE";
        r1 = r1.equals(r0);
        r2 = "FirebaseMessaging";
        if (r1 != 0) goto L_0x005a;
    L_0x000e:
        r1 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0017;
    L_0x0016:
        goto L_0x005a;
    L_0x0017:
        r1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0029;
    L_0x001f:
        r0 = com.google.firebase.messaging.b.n(r12);
        if (r0 == 0) goto L_0x0059;
    L_0x0025:
        com.google.firebase.messaging.b.l(r12);
        return;
    L_0x0029:
        r1 = "com.google.firebase.messaging.NEW_TOKEN";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x003c;
    L_0x0031:
        r0 = "token";
        r12 = r12.getStringExtra(r0);
        r11.ck(r12);
        return;
    L_0x003c:
        r0 = "Unknown intent action: ";
        r12 = r12.getAction();
        r12 = java.lang.String.valueOf(r12);
        r1 = r12.length();
        if (r1 == 0) goto L_0x0051;
    L_0x004c:
        r12 = r0.concat(r12);
        goto L_0x0056;
    L_0x0051:
        r12 = new java.lang.String;
        r12.<init>(r0);
    L_0x0056:
        android.util.Log.d(r2, r12);
    L_0x0059:
        return;
    L_0x005a:
        r0 = "google.message_id";
        r1 = r12.getStringExtra(r0);
        r3 = android.text.TextUtils.isEmpty(r1);
        r4 = 2;
        if (r3 == 0) goto L_0x006d;
    L_0x0067:
        r3 = 0;
        r3 = com.google.android.gms.tasks.Tasks.forResult(r3);
        goto L_0x007d;
    L_0x006d:
        r3 = new android.os.Bundle;
        r3.<init>();
        r3.putString(r0, r1);
        r5 = com.google.firebase.iid.e.aD(r11);
        r3 = r5.a(r4, r3);
    L_0x007d:
        r5 = android.text.TextUtils.isEmpty(r1);
        r6 = 1;
        r7 = 3;
        r8 = 0;
        if (r5 == 0) goto L_0x0088;
    L_0x0086:
        r1 = 0;
        goto L_0x00c6;
    L_0x0088:
        r5 = aeq;
        r5 = r5.contains(r1);
        if (r5 == 0) goto L_0x00b1;
    L_0x0090:
        r5 = android.util.Log.isLoggable(r2, r7);
        if (r5 == 0) goto L_0x00af;
    L_0x0096:
        r5 = "Received duplicate message: ";
        r1 = java.lang.String.valueOf(r1);
        r9 = r1.length();
        if (r9 == 0) goto L_0x00a7;
    L_0x00a2:
        r1 = r5.concat(r1);
        goto L_0x00ac;
    L_0x00a7:
        r1 = new java.lang.String;
        r1.<init>(r5);
    L_0x00ac:
        android.util.Log.d(r2, r1);
    L_0x00af:
        r1 = 1;
        goto L_0x00c6;
    L_0x00b1:
        r5 = aeq;
        r5 = r5.size();
        r9 = 10;
        if (r5 < r9) goto L_0x00c0;
    L_0x00bb:
        r5 = aeq;
        r5.remove();
    L_0x00c0:
        r5 = aeq;
        r5.add(r1);
        goto L_0x0086;
    L_0x00c6:
        if (r1 != 0) goto L_0x0199;
    L_0x00c8:
        r1 = "message_type";
        r1 = r12.getStringExtra(r1);
        r5 = "gcm";
        if (r1 != 0) goto L_0x00d3;
    L_0x00d2:
        r1 = r5;
    L_0x00d3:
        r9 = -1;
        r10 = r1.hashCode();
        switch(r10) {
            case -2062414158: goto L_0x00f7;
            case 102161: goto L_0x00f0;
            case 814694033: goto L_0x00e6;
            case 814800675: goto L_0x00dc;
            default: goto L_0x00db;
        };
    L_0x00db:
        goto L_0x0101;
    L_0x00dc:
        r5 = "send_event";
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0101;
    L_0x00e4:
        r8 = 2;
        goto L_0x0102;
    L_0x00e6:
        r5 = "send_error";
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0101;
    L_0x00ee:
        r8 = 3;
        goto L_0x0102;
    L_0x00f0:
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0101;
    L_0x00f6:
        goto L_0x0102;
    L_0x00f7:
        r5 = "deleted_messages";
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0101;
    L_0x00ff:
        r8 = 1;
        goto L_0x0102;
    L_0x0101:
        r8 = -1;
    L_0x0102:
        if (r8 == 0) goto L_0x014d;
    L_0x0104:
        if (r8 == r6) goto L_0x0149;
    L_0x0106:
        if (r8 == r4) goto L_0x0141;
    L_0x0108:
        if (r8 == r7) goto L_0x0126;
    L_0x010a:
        r12 = "Received message with unknown type: ";
        r0 = java.lang.String.valueOf(r1);
        r1 = r0.length();
        if (r1 == 0) goto L_0x011b;
    L_0x0116:
        r12 = r12.concat(r0);
        goto L_0x0121;
    L_0x011b:
        r0 = new java.lang.String;
        r0.<init>(r12);
        r12 = r0;
    L_0x0121:
        android.util.Log.w(r2, r12);
        goto L_0x0199;
    L_0x0126:
        r0 = r12.getStringExtra(r0);
        if (r0 != 0) goto L_0x0132;
    L_0x012c:
        r0 = "message_id";
        r0 = r12.getStringExtra(r0);
    L_0x0132:
        r1 = new com.google.firebase.messaging.SendException;
        r4 = "error";
        r12 = r12.getStringExtra(r4);
        r1.<init>(r12);
        r11.b(r0, r1);
        goto L_0x0199;
    L_0x0141:
        r12 = r12.getStringExtra(r0);
        r11.cj(r12);
        goto L_0x0199;
    L_0x0149:
        r11.wT();
        goto L_0x0199;
    L_0x014d:
        r0 = com.google.firebase.messaging.b.n(r12);
        if (r0 == 0) goto L_0x0156;
    L_0x0153:
        com.google.firebase.messaging.b.j(r12);
    L_0x0156:
        r0 = r12.getExtras();
        if (r0 != 0) goto L_0x0161;
    L_0x015c:
        r0 = new android.os.Bundle;
        r0.<init>();
    L_0x0161:
        r1 = "androidx.contentpager.content.wakelockid";
        r0.remove(r1);
        r1 = com.google.firebase.messaging.e.B(r0);
        if (r1 == 0) goto L_0x0191;
    L_0x016c:
        r1 = java.util.concurrent.Executors.newSingleThreadExecutor();
        r4 = new com.google.firebase.messaging.f;
        r4.<init>(r11, r0, r1);
        r4 = r4.wY();	 Catch:{ all -> 0x018c }
        if (r4 == 0) goto L_0x017f;
    L_0x017b:
        r1.shutdown();
        goto L_0x0199;
    L_0x017f:
        r1.shutdown();
        r1 = com.google.firebase.messaging.b.n(r12);
        if (r1 == 0) goto L_0x0191;
    L_0x0188:
        com.google.firebase.messaging.b.m(r12);
        goto L_0x0191;
    L_0x018c:
        r12 = move-exception;
        r1.shutdown();
        throw r12;
    L_0x0191:
        r12 = new com.google.firebase.messaging.c;
        r12.<init>(r0);
        r11.a(r12);
    L_0x0199:
        r0 = 1;
        r12 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ ExecutionException -> 0x01a5, InterruptedException -> 0x01a3, InterruptedException | ExecutionException | TimeoutException -> 0x01a1 }
        com.google.android.gms.tasks.Tasks.await(r3, r0, r12);	 Catch:{ ExecutionException -> 0x01a5, InterruptedException -> 0x01a3, InterruptedException | ExecutionException | TimeoutException -> 0x01a1 }
        return;
    L_0x01a1:
        r12 = move-exception;
        goto L_0x01a6;
    L_0x01a3:
        r12 = move-exception;
        goto L_0x01a6;
    L_0x01a5:
        r12 = move-exception;
    L_0x01a6:
        r12 = java.lang.String.valueOf(r12);
        r0 = java.lang.String.valueOf(r12);
        r0 = r0.length();
        r0 = r0 + 20;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "Message ack failed: ";
        r1.append(r0);
        r1.append(r12);
        r12 = r1.toString();
        android.util.Log.w(r2, r12);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.i(android.content.Intent):void");
    }
}
