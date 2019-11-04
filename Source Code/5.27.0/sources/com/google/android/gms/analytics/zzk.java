package com.google.android.gms.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Process;
import android.util.DisplayMetrics;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzcz;
import com.google.android.gms.internal.gtm.zzq;
import com.google.android.gms.internal.gtm.zzv;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"StaticFieldLeak"})
@VisibleForTesting
public final class zzk {
    private static volatile zzk zzsq;
    private final Context zzrm;
    private final List<zzn> zzsr = new CopyOnWriteArrayList();
    private final zze zzss = new zze();
    private final zza zzst = new zza();
    private volatile zzq zzsu;
    private UncaughtExceptionHandler zzsv;

    class zza extends ThreadPoolExecutor {
        public zza() {
            super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
            setThreadFactory(new zzb());
            allowCoreThreadTimeOut(true);
        }

        /* Access modifiers changed, original: protected|final */
        public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return new zzm(this, runnable, t);
        }
    }

    static class zzb implements ThreadFactory {
        private static final AtomicInteger zzsz = new AtomicInteger();

        private zzb() {
        }

        public final Thread newThread(Runnable runnable) {
            int incrementAndGet = zzsz.incrementAndGet();
            StringBuilder stringBuilder = new StringBuilder(23);
            stringBuilder.append("measurement-");
            stringBuilder.append(incrementAndGet);
            return new zzc(runnable, stringBuilder.toString());
        }

        /* synthetic */ zzb(zzl zzl) {
            this();
        }
    }

    static class zzc extends Thread {
        zzc(Runnable runnable, String str) {
            super(runnable, str);
        }

        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    @VisibleForTesting
    private zzk(Context context) {
        context = context.getApplicationContext();
        Preconditions.checkNotNull(context);
        this.zzrm = context;
    }

    public static zzk zzb(Context context) {
        Preconditions.checkNotNull(context);
        if (zzsq == null) {
            synchronized (zzk.class) {
                if (zzsq == null) {
                    zzsq = new zzk(context);
                }
            }
        }
        return zzsq;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:15|16|(1:18)(1:19)|20) */
    /* JADX WARNING: Missing block: B:16:?, code skipped:
            r1 = "GAv4";
            r4 = "Error retrieving package info: appName set to ";
            r5 = java.lang.String.valueOf(r2);
     */
    /* JADX WARNING: Missing block: B:17:0x0052, code skipped:
            if (r5.length() != 0) goto L_0x0054;
     */
    /* JADX WARNING: Missing block: B:18:0x0054, code skipped:
            r4 = r4.concat(r5);
     */
    /* JADX WARNING: Missing block: B:19:0x0059, code skipped:
            r4 = new java.lang.String(r4);
     */
    /* JADX WARNING: Missing block: B:20:0x005f, code skipped:
            android.util.Log.e(r1, r4);
     */
    public final com.google.android.gms.internal.gtm.zzq zzat() {
        /*
        r7 = this;
        r0 = r7.zzsu;
        if (r0 != 0) goto L_0x006f;
    L_0x0004:
        monitor-enter(r7);
        r0 = r7.zzsu;	 Catch:{ all -> 0x006c }
        if (r0 != 0) goto L_0x006a;
    L_0x0009:
        r0 = new com.google.android.gms.internal.gtm.zzq;	 Catch:{ all -> 0x006c }
        r0.<init>();	 Catch:{ all -> 0x006c }
        r1 = r7.zzrm;	 Catch:{ all -> 0x006c }
        r1 = r1.getPackageManager();	 Catch:{ all -> 0x006c }
        r2 = r7.zzrm;	 Catch:{ all -> 0x006c }
        r2 = r2.getPackageName();	 Catch:{ all -> 0x006c }
        r0.setAppId(r2);	 Catch:{ all -> 0x006c }
        r3 = r1.getInstallerPackageName(r2);	 Catch:{ all -> 0x006c }
        r0.setAppInstallerId(r3);	 Catch:{ all -> 0x006c }
        r3 = 0;
        r4 = r7.zzrm;	 Catch:{ NameNotFoundException -> 0x0046 }
        r4 = r4.getPackageName();	 Catch:{ NameNotFoundException -> 0x0046 }
        r5 = 0;
        r4 = r1.getPackageInfo(r4, r5);	 Catch:{ NameNotFoundException -> 0x0046 }
        if (r4 == 0) goto L_0x0062;
    L_0x0032:
        r5 = r4.applicationInfo;	 Catch:{ NameNotFoundException -> 0x0046 }
        r1 = r1.getApplicationLabel(r5);	 Catch:{ NameNotFoundException -> 0x0046 }
        r5 = android.text.TextUtils.isEmpty(r1);	 Catch:{ NameNotFoundException -> 0x0046 }
        if (r5 != 0) goto L_0x0043;
    L_0x003e:
        r1 = r1.toString();	 Catch:{ NameNotFoundException -> 0x0046 }
        r2 = r1;
    L_0x0043:
        r3 = r4.versionName;	 Catch:{ NameNotFoundException -> 0x0046 }
        goto L_0x0062;
    L_0x0046:
        r1 = "GAv4";
        r4 = "Error retrieving package info: appName set to ";
        r5 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x006c }
        r6 = r5.length();	 Catch:{ all -> 0x006c }
        if (r6 == 0) goto L_0x0059;
    L_0x0054:
        r4 = r4.concat(r5);	 Catch:{ all -> 0x006c }
        goto L_0x005f;
    L_0x0059:
        r5 = new java.lang.String;	 Catch:{ all -> 0x006c }
        r5.<init>(r4);	 Catch:{ all -> 0x006c }
        r4 = r5;
    L_0x005f:
        android.util.Log.e(r1, r4);	 Catch:{ all -> 0x006c }
    L_0x0062:
        r0.setAppName(r2);	 Catch:{ all -> 0x006c }
        r0.setAppVersion(r3);	 Catch:{ all -> 0x006c }
        r7.zzsu = r0;	 Catch:{ all -> 0x006c }
    L_0x006a:
        monitor-exit(r7);	 Catch:{ all -> 0x006c }
        goto L_0x006f;
    L_0x006c:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x006c }
        throw r0;
    L_0x006f:
        r0 = r7.zzsu;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.zzk.zzat():com.google.android.gms.internal.gtm.zzq");
    }

    public final zzv zzau() {
        DisplayMetrics displayMetrics = this.zzrm.getResources().getDisplayMetrics();
        zzv zzv = new zzv();
        zzv.setLanguage(zzcz.zza(Locale.getDefault()));
        zzv.zzul = displayMetrics.widthPixels;
        zzv.zzum = displayMetrics.heightPixels;
        return zzv;
    }

    /* Access modifiers changed, original: final */
    public final void zze(zzg zzg) {
        if (zzg.zzaq()) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        } else if (zzg.zzan()) {
            throw new IllegalStateException("Measurement can only be submitted once");
        } else {
            zzg = zzg.zzai();
            zzg.zzao();
            this.zzst.execute(new zzl(this, zzg));
        }
    }

    public final Context getContext() {
        return this.zzrm;
    }

    public static void zzav() {
        if (!(Thread.currentThread() instanceof zzc)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final void zza(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzsv = uncaughtExceptionHandler;
    }

    public final <V> Future<V> zza(Callable<V> callable) {
        Preconditions.checkNotNull(callable);
        if (!(Thread.currentThread() instanceof zzc)) {
            return this.zzst.submit(callable);
        }
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    public final void zza(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        this.zzst.submit(runnable);
    }

    private static void zzb(zzg zzg) {
        Preconditions.checkNotMainThread("deliver should be called from worker thread");
        Preconditions.checkArgument(zzg.zzan(), "Measurement must be submitted");
        List<zzo> zzak = zzg.zzak();
        if (!zzak.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (zzo zzo : zzak) {
                Uri zzae = zzo.zzae();
                if (!hashSet.contains(zzae)) {
                    hashSet.add(zzae);
                    zzo.zzb(zzg);
                }
            }
        }
    }
}
