package com.google.android.gms.common.config;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashSet;

@KeepForSdk
public abstract class GservicesValue<T> {
    private static final Object sLock = new Object();
    private static zza zzbm = null;
    private static int zzbn = 0;
    private static Context zzbo;
    private static HashSet<String> zzbp;
    protected final String mKey;
    protected final T zzbq;
    private T zzbr = null;

    private interface zza {
        Long getLong(String str, Long l);

        String getString(String str, String str2);

        Boolean zza(String str, Boolean bool);

        Float zza(String str, Float f);

        Integer zza(String str, Integer num);
    }

    @KeepForSdk
    public static boolean isInitialized() {
        synchronized (sLock) {
        }
        return false;
    }

    public abstract T zzd(String str);

    private static boolean zzi() {
        synchronized (sLock) {
        }
        return false;
    }

    protected GservicesValue(String str, T t) {
        this.mKey = str;
        this.zzbq = t;
    }

    @KeepForSdk
    @VisibleForTesting
    public void override(T t) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.zzbr = t;
        synchronized (sLock) {
            zzi();
        }
    }

    @KeepForSdk
    @VisibleForTesting
    public void resetOverride() {
        this.zzbr = null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0022 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:18|19|20|21|22|23|24|25) */
    /* JADX WARNING: Missing block: B:19:?, code skipped:
            r1 = android.os.Binder.clearCallingIdentity();
     */
    /* JADX WARNING: Missing block: B:21:?, code skipped:
            r3 = zzd(r4.mKey);
     */
    /* JADX WARNING: Missing block: B:23:?, code skipped:
            android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Missing block: B:24:0x002f, code skipped:
            android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Missing block: B:25:0x0032, code skipped:
            return r3;
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Missing block: B:30:0x0038, code skipped:
            android.os.StrictMode.setThreadPolicy(r0);
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    public final T get() {
        /*
        r4 = this;
        r0 = r4.zzbr;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r0 = android.os.StrictMode.allowThreadDiskReads();
        r1 = sLock;
        monitor-enter(r1);
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
        r2 = sLock;
        monitor-enter(r2);
        r1 = 0;
        zzbp = r1;	 Catch:{ all -> 0x003c }
        zzbo = r1;	 Catch:{ all -> 0x003c }
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
        r1 = r4.mKey;	 Catch:{ SecurityException -> 0x0022 }
        r1 = r4.zzd(r1);	 Catch:{ SecurityException -> 0x0022 }
        android.os.StrictMode.setThreadPolicy(r0);
        return r1;
    L_0x0020:
        r1 = move-exception;
        goto L_0x0038;
    L_0x0022:
        r1 = android.os.Binder.clearCallingIdentity();	 Catch:{ all -> 0x0020 }
        r3 = r4.mKey;	 Catch:{ all -> 0x0033 }
        r3 = r4.zzd(r3);	 Catch:{ all -> 0x0033 }
        android.os.Binder.restoreCallingIdentity(r1);	 Catch:{ all -> 0x0020 }
        android.os.StrictMode.setThreadPolicy(r0);
        return r3;
    L_0x0033:
        r3 = move-exception;
        android.os.Binder.restoreCallingIdentity(r1);	 Catch:{ all -> 0x0020 }
        throw r3;	 Catch:{ all -> 0x0020 }
    L_0x0038:
        android.os.StrictMode.setThreadPolicy(r0);
        throw r1;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
        throw r0;
    L_0x003f:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.config.GservicesValue.get():java.lang.Object");
    }

    @KeepForSdk
    @Deprecated
    public final T getBinderSafe() {
        return get();
    }

    @KeepForSdk
    public static GservicesValue<Boolean> value(String str, boolean z) {
        return new zza(str, Boolean.valueOf(z));
    }

    @KeepForSdk
    public static GservicesValue<Long> value(String str, Long l) {
        return new zzb(str, l);
    }

    @KeepForSdk
    public static GservicesValue<Integer> value(String str, Integer num) {
        return new zzc(str, num);
    }

    @KeepForSdk
    public static GservicesValue<Float> value(String str, Float f) {
        return new zzd(str, f);
    }

    @KeepForSdk
    public static GservicesValue<String> value(String str, String str2) {
        return new zze(str, str2);
    }
}
