package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType;
import com.facebook.internal.aa;
import com.facebook.internal.r;
import com.facebook.internal.x;
import com.facebook.internal.z;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* compiled from: FacebookSdk */
public final class f {
    private static final String TAG = "com.facebook.f";
    private static volatile String applicationId;
    private static Executor executor;
    private static volatile String tA = "facebook.com";
    private static AtomicLong tB = new AtomicLong(65536);
    private static volatile boolean tC = false;
    private static boolean tD = false;
    private static r<File> tE;
    private static Context tF;
    private static int tG = 64206;
    private static final Object tH = new Object();
    private static String tI = x.kK();
    private static final BlockingQueue<Runnable> tJ = new LinkedBlockingQueue(10);
    private static final ThreadFactory tK = new ThreadFactory() {
        private final AtomicInteger tN = new AtomicInteger(0);

        public Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FacebookSdk #");
            stringBuilder.append(this.tN.incrementAndGet());
            return new Thread(runnable, stringBuilder.toString());
        }
    };
    private static Boolean tL;
    private static Boolean tM;
    private static final HashSet<LoggingBehavior> tw;
    private static volatile String tx;
    private static volatile String ty;
    private static volatile Boolean tz;

    /* compiled from: FacebookSdk */
    public interface a {
        void hg();
    }

    public static String gV() {
        return "5.0.1";
    }

    static {
        LoggingBehavior[] loggingBehaviorArr = new LoggingBehavior[1];
        LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
        Boolean valueOf = Boolean.valueOf(false);
        loggingBehaviorArr[0] = loggingBehavior;
        tw = new HashSet(Arrays.asList(loggingBehaviorArr));
        tL = valueOf;
        tM = valueOf;
    }

    @Deprecated
    public static synchronized void L(Context context) {
        synchronized (f.class) {
            a(context, null);
        }
    }

    /* JADX WARNING: Missing block: B:8:0x0011, code skipped:
            return;
     */
    @java.lang.Deprecated
    public static synchronized void a(final android.content.Context r3, final com.facebook.f.a r4) {
        /*
        r0 = com.facebook.f.class;
        monitor-enter(r0);
        r1 = tL;	 Catch:{ all -> 0x0088 }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x0088 }
        if (r1 == 0) goto L_0x0012;
    L_0x000b:
        if (r4 == 0) goto L_0x0010;
    L_0x000d:
        r4.hg();	 Catch:{ all -> 0x0088 }
    L_0x0010:
        monitor-exit(r0);
        return;
    L_0x0012:
        r1 = "applicationContext";
        com.facebook.internal.aa.b(r3, r1);	 Catch:{ all -> 0x0088 }
        r1 = 0;
        com.facebook.internal.aa.b(r3, r1);	 Catch:{ all -> 0x0088 }
        com.facebook.internal.aa.a(r3, r1);	 Catch:{ all -> 0x0088 }
        r1 = r3.getApplicationContext();	 Catch:{ all -> 0x0088 }
        tF = r1;	 Catch:{ all -> 0x0088 }
        r1 = tF;	 Catch:{ all -> 0x0088 }
        N(r1);	 Catch:{ all -> 0x0088 }
        r1 = applicationId;	 Catch:{ all -> 0x0088 }
        r1 = com.facebook.internal.z.aB(r1);	 Catch:{ all -> 0x0088 }
        if (r1 != 0) goto L_0x0080;
    L_0x0031:
        r1 = 1;
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ all -> 0x0088 }
        tL = r1;	 Catch:{ all -> 0x0088 }
        r1 = gY();	 Catch:{ all -> 0x0088 }
        if (r1 == 0) goto L_0x0041;
    L_0x003e:
        gR();	 Catch:{ all -> 0x0088 }
    L_0x0041:
        r1 = tF;	 Catch:{ all -> 0x0088 }
        r1 = r1 instanceof android.app.Application;	 Catch:{ all -> 0x0088 }
        if (r1 == 0) goto L_0x0056;
    L_0x0047:
        r1 = com.facebook.s.gZ();	 Catch:{ all -> 0x0088 }
        if (r1 == 0) goto L_0x0056;
    L_0x004d:
        r1 = tF;	 Catch:{ all -> 0x0088 }
        r1 = (android.app.Application) r1;	 Catch:{ all -> 0x0088 }
        r2 = applicationId;	 Catch:{ all -> 0x0088 }
        com.facebook.appevents.internal.a.a(r1, r2);	 Catch:{ all -> 0x0088 }
    L_0x0056:
        com.facebook.internal.FetchedAppSettingsManager.jV();	 Catch:{ all -> 0x0088 }
        com.facebook.internal.u.kz();	 Catch:{ all -> 0x0088 }
        r1 = tF;	 Catch:{ all -> 0x0088 }
        com.facebook.internal.b.W(r1);	 Catch:{ all -> 0x0088 }
        r1 = new com.facebook.internal.r;	 Catch:{ all -> 0x0088 }
        r2 = new com.facebook.f$2;	 Catch:{ all -> 0x0088 }
        r2.<init>();	 Catch:{ all -> 0x0088 }
        r1.<init>(r2);	 Catch:{ all -> 0x0088 }
        tE = r1;	 Catch:{ all -> 0x0088 }
        r1 = new java.util.concurrent.FutureTask;	 Catch:{ all -> 0x0088 }
        r2 = new com.facebook.f$3;	 Catch:{ all -> 0x0088 }
        r2.<init>(r4, r3);	 Catch:{ all -> 0x0088 }
        r1.<init>(r2);	 Catch:{ all -> 0x0088 }
        r3 = getExecutor();	 Catch:{ all -> 0x0088 }
        r3.execute(r1);	 Catch:{ all -> 0x0088 }
        monitor-exit(r0);
        return;
    L_0x0080:
        r3 = new com.facebook.FacebookException;	 Catch:{ all -> 0x0088 }
        r4 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.";
        r3.<init>(r4);	 Catch:{ all -> 0x0088 }
        throw r3;	 Catch:{ all -> 0x0088 }
    L_0x0088:
        r3 = move-exception;
        monitor-exit(r0);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.f.a(android.content.Context, com.facebook.f$a):void");
    }

    public static synchronized boolean isInitialized() {
        boolean booleanValue;
        synchronized (f.class) {
            booleanValue = tL.booleanValue();
        }
        return booleanValue;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static synchronized boolean gQ() {
        boolean booleanValue;
        synchronized (f.class) {
            booleanValue = tM.booleanValue();
        }
        return booleanValue;
    }

    public static void gR() {
        tM = Boolean.valueOf(true);
    }

    public static boolean a(LoggingBehavior loggingBehavior) {
        boolean z;
        synchronized (tw) {
            z = isDebugEnabled() && tw.contains(loggingBehavior);
        }
        return z;
    }

    public static boolean isDebugEnabled() {
        return tC;
    }

    public static boolean gS() {
        return tD;
    }

    public static Executor getExecutor() {
        synchronized (tH) {
            if (executor == null) {
                executor = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return executor;
    }

    public static String gT() {
        return tA;
    }

    public static Context getApplicationContext() {
        aa.kV();
        return tF;
    }

    public static String gU() {
        z.G(TAG, String.format("getGraphApiVersion: %s", new Object[]{tI}));
        return tI;
    }

    public static void q(Context context, final String str) {
        context = context.getApplicationContext();
        getExecutor().execute(new Runnable() {
            public void run() {
                f.r(context, str);
            }
        });
    }

    static void r(Context context, String str) {
        if (context == null || str == null) {
            throw new IllegalArgumentException("Both context and applicationId must be non-null");
        }
        try {
            com.facebook.internal.a U = com.facebook.internal.a.U(context);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("ping");
            String stringBuilder2 = stringBuilder.toString();
            long j = sharedPreferences.getLong(stringBuilder2, 0);
            g a = g.a(null, String.format("%s/activities", new Object[]{str}), AppEventsLoggerUtility.a(GraphAPIActivityType.MOBILE_INSTALL_EVENT, U, AppEventsLogger.P(context), M(context), context), null);
            if (j == 0) {
                a.hn();
                Editor edit = sharedPreferences.edit();
                edit.putLong(stringBuilder2, System.currentTimeMillis());
                edit.apply();
            }
        } catch (JSONException e) {
            throw new FacebookException("An error occurred while publishing install.", e);
        } catch (Exception e2) {
            z.a("Facebook-publish", e2);
        }
    }

    public static boolean M(Context context) {
        aa.kV();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static long gW() {
        aa.kV();
        return tB.get();
    }

    static void N(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                    if (applicationId == null) {
                        Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                                applicationId = str.substring(2);
                            } else {
                                applicationId = str;
                            }
                        } else if (obj instanceof Integer) {
                            throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (tx == null) {
                        tx = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                    }
                    if (ty == null) {
                        ty = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                    }
                    if (tG == 64206) {
                        tG = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                    }
                    if (tz == null) {
                        tz = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
        }
    }

    public static String go() {
        aa.kV();
        return applicationId;
    }

    public static String gX() {
        aa.kV();
        return ty;
    }

    public static boolean gY() {
        return s.gY();
    }

    public static boolean gZ() {
        return s.gZ();
    }

    public static boolean ha() {
        return s.ha();
    }

    public static boolean hb() {
        return s.hb();
    }

    public static File getCacheDir() {
        aa.kV();
        return (File) tE.getValue();
    }

    public static int hc() {
        aa.kV();
        return tG;
    }
}
