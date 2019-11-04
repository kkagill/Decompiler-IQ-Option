package com.appsflyer;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

public class c {
    private static final ThreadFactory kP = new ThreadFactory() {
        public final Thread newThread(@NonNull final Runnable runnable) {
            return new Thread(new Runnable() {
                public final void run() {
                    if (VERSION.SDK_INT >= 14) {
                        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                    }
                    runnable.run();
                }

                static boolean g(Context context, String str) {
                    int checkSelfPermission = ContextCompat.checkSelfPermission(context, str);
                    StringBuilder stringBuilder = new StringBuilder("is Permission Available: ");
                    stringBuilder.append(str);
                    stringBuilder.append("; res: ");
                    stringBuilder.append(checkSelfPermission);
                    AFLogger.G(stringBuilder.toString());
                    return checkSelfPermission == 0;
                }
            });
        }
    };
    private static c kQ;
    private Executor kR;
    private ScheduledExecutorService kS;
    private ScheduledExecutorService kT;

    private c() {
    }

    public static c dd() {
        if (kQ == null) {
            kQ = new c();
        }
        return kQ;
    }

    public ScheduledExecutorService de() {
        if (this.kT == null) {
            this.kT = Executors.newSingleThreadScheduledExecutor();
        }
        return this.kT;
    }

    public Executor df() {
        Executor executor = this.kR;
        Object obj = (executor == null || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).isShutdown() || ((ThreadPoolExecutor) this.kR).isTerminated() || ((ThreadPoolExecutor) this.kR).isTerminating()))) ? 1 : null;
        if (obj != null) {
            if (VERSION.SDK_INT < 11) {
                return Executors.newSingleThreadExecutor();
            }
            this.kR = Executors.newFixedThreadPool(2, kP);
        }
        return this.kR;
    }

    /* Access modifiers changed, original: final */
    public final ScheduledThreadPoolExecutor dg() {
        ScheduledExecutorService scheduledExecutorService = this.kS;
        Object obj = (scheduledExecutorService == null || scheduledExecutorService.isShutdown() || this.kS.isTerminated()) ? 1 : null;
        if (obj != null) {
            this.kS = Executors.newScheduledThreadPool(2, kP);
        }
        return (ScheduledThreadPoolExecutor) this.kS;
    }

    /* Access modifiers changed, original: final */
    public final void dh() {
        try {
            a(this.kS);
            if (this.kR instanceof ThreadPoolExecutor) {
                a((ThreadPoolExecutor) this.kR);
            }
        } catch (Throwable th) {
            AFLogger.c("failed to stop Executors", th);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0020 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:10:?, code skipped:
            com.appsflyer.AFLogger.G("InterruptedException!!!");
     */
    /* JADX WARNING: Missing block: B:11:0x0031, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:13:0x0036, code skipped:
            if (r4.isTerminated() == false) goto L_0x0038;
     */
    /* JADX WARNING: Missing block: B:14:0x0038, code skipped:
            com.appsflyer.AFLogger.G(r0);
     */
    /* JADX WARNING: Missing block: B:15:0x003b, code skipped:
            r4.shutdownNow();
     */
    private static void a(java.util.concurrent.ExecutorService r4) {
        /*
        r0 = "killing non-finished tasks";
        r1 = "shut downing executor ...";
        com.appsflyer.AFLogger.G(r1);	 Catch:{ InterruptedException -> 0x0020 }
        r4.shutdown();	 Catch:{ InterruptedException -> 0x0020 }
        r1 = 10;
        r3 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x0020 }
        r4.awaitTermination(r1, r3);	 Catch:{ InterruptedException -> 0x0020 }
        r1 = r4.isTerminated();
        if (r1 != 0) goto L_0x001a;
    L_0x0017:
        com.appsflyer.AFLogger.G(r0);
    L_0x001a:
        r4.shutdownNow();
        return;
    L_0x001e:
        r1 = move-exception;
        goto L_0x0032;
    L_0x0020:
        r1 = "InterruptedException!!!";
        com.appsflyer.AFLogger.G(r1);	 Catch:{ all -> 0x001e }
        r1 = r4.isTerminated();
        if (r1 != 0) goto L_0x002e;
    L_0x002b:
        com.appsflyer.AFLogger.G(r0);
    L_0x002e:
        r4.shutdownNow();
        return;
    L_0x0032:
        r2 = r4.isTerminated();
        if (r2 != 0) goto L_0x003b;
    L_0x0038:
        com.appsflyer.AFLogger.G(r0);
    L_0x003b:
        r4.shutdownNow();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.c.a(java.util.concurrent.ExecutorService):void");
    }
}
