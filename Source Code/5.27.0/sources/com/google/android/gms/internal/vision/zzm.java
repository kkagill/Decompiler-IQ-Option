package com.google.android.gms.internal.vision;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

public abstract class zzm<T> {
    private static String PREFIX = "com.google.android.gms.vision.dynamite";
    private final Object lock = new Object();
    private final String tag;
    private final String zzdh;
    private final String zzdi;
    private boolean zzdj = false;
    private T zzdk;
    private final Context zze;

    public zzm(Context context, String str, String str2) {
        this.zze = context;
        this.tag = str;
        String str3 = PREFIX;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str3).length() + 1) + String.valueOf(str2).length());
        stringBuilder.append(str3);
        stringBuilder.append(".");
        stringBuilder.append(str2);
        this.zzdh = stringBuilder.toString();
        this.zzdi = PREFIX;
    }

    public abstract T zza(DynamiteModule dynamiteModule, Context context);

    public abstract void zzm();

    public final boolean isOperational() {
        return zzq() != null;
    }

    public final void zzp() {
        synchronized (this.lock) {
            if (this.zzdk == null) {
                return;
            }
            try {
                zzm();
            } catch (RemoteException e) {
                Log.e(this.tag, "Could not finalize native handle", e);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0019 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0017 A:{ExcHandler: RemoteException (e android.os.RemoteException), Splitter:B:9:0x000c} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0017 A:{ExcHandler: RemoteException (e android.os.RemoteException), Splitter:B:9:0x000c} */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0017 A:{ExcHandler: RemoteException (e android.os.RemoteException), Splitter:B:9:0x000c} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:11:0x0017, code skipped:
            r1 = e;
     */
    /* JADX WARNING: Missing block: B:16:0x002b, code skipped:
            r2 = move-exception;
     */
    /* JADX WARNING: Missing block: B:18:?, code skipped:
            android.util.Log.e(r5.tag, "Error Loading module", r2);
     */
    public final T zzq() {
        /*
        r5 = this;
        r0 = r5.lock;
        monitor-enter(r0);
        r1 = r5.zzdk;	 Catch:{ all -> 0x006c }
        if (r1 == 0) goto L_0x000b;
    L_0x0007:
        r1 = r5.zzdk;	 Catch:{ all -> 0x006c }
        monitor-exit(r0);	 Catch:{ all -> 0x006c }
        return r1;
    L_0x000b:
        r1 = 0;
        r2 = r5.zze;	 Catch:{ LoadingException -> 0x0019, RemoteException -> 0x0017 }
        r3 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION;	 Catch:{ LoadingException -> 0x0019, RemoteException -> 0x0017 }
        r4 = r5.zzdh;	 Catch:{ LoadingException -> 0x0019, RemoteException -> 0x0017 }
        r1 = com.google.android.gms.dynamite.DynamiteModule.load(r2, r3, r4);	 Catch:{ LoadingException -> 0x0019, RemoteException -> 0x0017 }
        goto L_0x0033;
    L_0x0017:
        r1 = move-exception;
        goto L_0x003f;
    L_0x0019:
        r2 = r5.tag;	 Catch:{ LoadingException -> 0x003e, RemoteException -> 0x0017 }
        r3 = "Cannot load feature, fall back to load whole module.";
        android.util.Log.d(r2, r3);	 Catch:{ LoadingException -> 0x003e, RemoteException -> 0x0017 }
        r2 = r5.zze;	 Catch:{ LoadingException -> 0x002b, RemoteException -> 0x0017 }
        r3 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION;	 Catch:{ LoadingException -> 0x002b, RemoteException -> 0x0017 }
        r4 = r5.zzdi;	 Catch:{ LoadingException -> 0x002b, RemoteException -> 0x0017 }
        r1 = com.google.android.gms.dynamite.DynamiteModule.load(r2, r3, r4);	 Catch:{ LoadingException -> 0x002b, RemoteException -> 0x0017 }
        goto L_0x0033;
    L_0x002b:
        r2 = move-exception;
        r3 = r5.tag;	 Catch:{ LoadingException -> 0x003e, RemoteException -> 0x0017 }
        r4 = "Error Loading module";
        android.util.Log.e(r3, r4, r2);	 Catch:{ LoadingException -> 0x003e, RemoteException -> 0x0017 }
    L_0x0033:
        if (r1 == 0) goto L_0x0046;
    L_0x0035:
        r2 = r5.zze;	 Catch:{ LoadingException -> 0x003e, RemoteException -> 0x0017 }
        r1 = r5.zza(r1, r2);	 Catch:{ LoadingException -> 0x003e, RemoteException -> 0x0017 }
        r5.zzdk = r1;	 Catch:{ LoadingException -> 0x003e, RemoteException -> 0x0017 }
        goto L_0x0046;
    L_0x003e:
        r1 = move-exception;
    L_0x003f:
        r2 = r5.tag;	 Catch:{ all -> 0x006c }
        r3 = "Error creating remote native handle";
        android.util.Log.e(r2, r3, r1);	 Catch:{ all -> 0x006c }
    L_0x0046:
        r1 = r5.zzdj;	 Catch:{ all -> 0x006c }
        if (r1 != 0) goto L_0x0059;
    L_0x004a:
        r1 = r5.zzdk;	 Catch:{ all -> 0x006c }
        if (r1 != 0) goto L_0x0059;
    L_0x004e:
        r1 = r5.tag;	 Catch:{ all -> 0x006c }
        r2 = "Native handle not yet available. Reverting to no-op handle.";
        android.util.Log.w(r1, r2);	 Catch:{ all -> 0x006c }
        r1 = 1;
        r5.zzdj = r1;	 Catch:{ all -> 0x006c }
        goto L_0x0068;
    L_0x0059:
        r1 = r5.zzdj;	 Catch:{ all -> 0x006c }
        if (r1 == 0) goto L_0x0068;
    L_0x005d:
        r1 = r5.zzdk;	 Catch:{ all -> 0x006c }
        if (r1 == 0) goto L_0x0068;
    L_0x0061:
        r1 = r5.tag;	 Catch:{ all -> 0x006c }
        r2 = "Native handle is now available.";
        android.util.Log.w(r1, r2);	 Catch:{ all -> 0x006c }
    L_0x0068:
        r1 = r5.zzdk;	 Catch:{ all -> 0x006c }
        monitor-exit(r0);	 Catch:{ all -> 0x006c }
        return r1;
    L_0x006c:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x006c }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzm.zzq():java.lang.Object");
    }
}
