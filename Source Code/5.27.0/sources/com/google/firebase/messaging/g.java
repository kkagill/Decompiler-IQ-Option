package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_messaging.zzk;
import com.google.android.gms.internal.firebase_messaging.zzn;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;

final class g implements Closeable {
    @Nullable
    private Task<Bitmap> aeG;
    @Nullable
    private volatile InputStream aeH;
    private final URL url;

    @Nullable
    public static g co(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new g(new URL(str));
        } catch (MalformedURLException unused) {
            String str2 = "Not downloading image, bad URL: ";
            str = String.valueOf(str);
            Log.w("FirebaseMessaging", str.length() != 0 ? str2.concat(str) : new String(str2));
            return null;
        }
    }

    private g(URL url) {
        this.url = url;
    }

    public final void a(Executor executor) {
        this.aeG = Tasks.call(executor, new h(this));
    }

    public final Task<Bitmap> getTask() {
        return (Task) Preconditions.checkNotNull(this.aeG);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x00a7=Splitter:B:28:0x00a7, B:12:0x006b=Splitter:B:12:0x006b} */
    public final android.graphics.Bitmap wZ() {
        /*
        r9 = this;
        r0 = r9.url;
        r0 = java.lang.String.valueOf(r0);
        r1 = java.lang.String.valueOf(r0);
        r1 = r1.length();
        r1 = r1 + 22;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r1 = "Starting download of: ";
        r2.append(r1);
        r2.append(r0);
        r0 = r2.toString();
        r1 = "FirebaseMessaging";
        android.util.Log.i(r1, r0);
        r0 = r9.url;	 Catch:{ IOException -> 0x00b6 }
        r0 = r0.openConnection();	 Catch:{ IOException -> 0x00b6 }
        r0 = r0.getInputStream();	 Catch:{ IOException -> 0x00b6 }
        r2 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r4 = 0;
        r2 = com.google.android.gms.internal.firebase_messaging.zzj.zza(r0, r2);	 Catch:{ Throwable -> 0x00ad }
        r9.aeH = r0;	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r3 = android.graphics.BitmapFactory.decodeStream(r2);	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        if (r3 == 0) goto L_0x0074;
    L_0x0040:
        r5 = 3;
        r5 = android.util.Log.isLoggable(r1, r5);	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        if (r5 == 0) goto L_0x006b;
    L_0x0047:
        r5 = r9.url;	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r6 = java.lang.String.valueOf(r5);	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r6 = r6.length();	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r6 = r6 + 31;
        r7 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r7.<init>(r6);	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r6 = "Successfully downloaded image: ";
        r7.append(r6);	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r7.append(r5);	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r5 = r7.toString();	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        android.util.Log.d(r1, r5);	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
    L_0x006b:
        a(r4, r2);	 Catch:{ Throwable -> 0x00ad }
        if (r0 == 0) goto L_0x0073;
    L_0x0070:
        a(r4, r0);	 Catch:{ IOException -> 0x00b6 }
    L_0x0073:
        return r3;
    L_0x0074:
        r3 = r9.url;	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r5 = java.lang.String.valueOf(r3);	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r5 = r5.length();	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r5 = r5 + 24;
        r6 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r6.<init>(r5);	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r5 = "Failed to decode image: ";
        r6.append(r5);	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r6.append(r3);	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r3 = r6.toString();	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        android.util.Log.w(r1, r3);	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r5 = new java.io.IOException;	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        r5.<init>(r3);	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
        throw r5;	 Catch:{ Throwable -> 0x00a1, all -> 0x009e }
    L_0x009e:
        r3 = move-exception;
        r5 = r4;
        goto L_0x00a7;
    L_0x00a1:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x00a3 }
    L_0x00a3:
        r5 = move-exception;
        r8 = r5;
        r5 = r3;
        r3 = r8;
    L_0x00a7:
        a(r5, r2);	 Catch:{ Throwable -> 0x00ad }
        throw r3;	 Catch:{ Throwable -> 0x00ad }
    L_0x00ab:
        r2 = move-exception;
        goto L_0x00b0;
    L_0x00ad:
        r2 = move-exception;
        r4 = r2;
        throw r4;	 Catch:{ all -> 0x00ab }
    L_0x00b0:
        if (r0 == 0) goto L_0x00b5;
    L_0x00b2:
        a(r4, r0);	 Catch:{ IOException -> 0x00b6 }
    L_0x00b5:
        throw r2;	 Catch:{ IOException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        r2 = r9.url;
        r2 = java.lang.String.valueOf(r2);
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r3 = r3 + 26;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "Failed to download image: ";
        r4.append(r3);
        r4.append(r2);
        r2 = r4.toString();
        android.util.Log.w(r1, r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.g.wZ():android.graphics.Bitmap");
    }

    public final void close() {
        zzk.zza(this.aeH);
    }

    private static /* synthetic */ void a(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
                return;
            } catch (Throwable th2) {
                zzn.zza(th, th2);
                return;
            }
        }
        inputStream.close();
    }
}
