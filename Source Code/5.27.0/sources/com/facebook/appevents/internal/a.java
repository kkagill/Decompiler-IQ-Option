package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.b;
import com.facebook.appevents.codeless.d;
import com.facebook.appevents.codeless.e;
import com.facebook.f;
import com.facebook.g;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.j;
import com.facebook.internal.s;
import com.facebook.internal.z;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ActivityLifecycleTracker */
public class a {
    private static final String TAG = "com.facebook.appevents.internal.a";
    private static String appId;
    private static SensorManager sensorManager;
    private static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
    private static volatile ScheduledFuture wA;
    private static final Object wB = new Object();
    private static AtomicInteger wC = new AtomicInteger(0);
    private static volatile g wD;
    private static AtomicBoolean wE = new AtomicBoolean(false);
    private static long wF;
    private static final b wG = new b();
    private static final e wH = new e();
    private static d wI;
    @Nullable
    private static String wJ = null;
    private static Boolean wK;
    private static volatile Boolean wL;
    private static int wM = 0;

    static /* synthetic */ int iU() {
        int i = wM;
        wM = i + 1;
        return i;
    }

    static /* synthetic */ int iV() {
        int i = wM;
        wM = i - 1;
        return i;
    }

    static {
        Boolean valueOf = Boolean.valueOf(false);
        wK = valueOf;
        wL = valueOf;
    }

    public static void a(Application application, String str) {
        if (wE.compareAndSet(false, true)) {
            appId = str;
            application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    s.a(LoggingBehavior.APP_EVENTS, a.TAG, "onActivityCreated");
                    b.jg();
                    a.e(activity);
                }

                public void onActivityStarted(Activity activity) {
                    a.iU();
                    s.a(LoggingBehavior.APP_EVENTS, a.TAG, "onActivityStarted");
                }

                public void onActivityResumed(Activity activity) {
                    s.a(LoggingBehavior.APP_EVENTS, a.TAG, "onActivityResumed");
                    b.jg();
                    a.onActivityResumed(activity);
                }

                public void onActivityPaused(Activity activity) {
                    s.a(LoggingBehavior.APP_EVENTS, a.TAG, "onActivityPaused");
                    b.jg();
                    a.onActivityPaused(activity);
                }

                public void onActivityStopped(Activity activity) {
                    s.a(LoggingBehavior.APP_EVENTS, a.TAG, "onActivityStopped");
                    AppEventsLogger.ir();
                    a.iV();
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    s.a(LoggingBehavior.APP_EVENTS, a.TAG, "onActivitySaveInstanceState");
                }

                public void onActivityDestroyed(Activity activity) {
                    s.a(LoggingBehavior.APP_EVENTS, a.TAG, "onActivityDestroyed");
                }
            });
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static boolean isInBackground() {
        return wM == 0;
    }

    public static UUID iP() {
        return wD != null ? wD.getSessionId() : null;
    }

    public static void e(Activity activity) {
        singleThreadExecutor.execute(new Runnable() {
            public void run() {
                if (a.wD == null) {
                    a.wD = g.jp();
                }
            }
        });
    }

    public static void onActivityResumed(Activity activity) {
        wC.incrementAndGet();
        iR();
        final long currentTimeMillis = System.currentTimeMillis();
        wF = currentTimeMillis;
        final String ab = z.ab(activity);
        wG.add(activity);
        singleThreadExecutor.execute(new Runnable() {
            public void run() {
                if (a.wD == null) {
                    a.wD = new g(Long.valueOf(currentTimeMillis), null);
                    h.a(ab, null, a.appId);
                } else if (a.wD.jr() != null) {
                    long longValue = currentTimeMillis - a.wD.jr().longValue();
                    if (longValue > ((long) (a.iQ() * 1000))) {
                        h.a(ab, a.wD, a.appId);
                        h.a(ab, null, a.appId);
                        a.wD = new g(Long.valueOf(currentTimeMillis), null);
                    } else if (longValue > 1000) {
                        a.wD.jt();
                    }
                }
                a.wD.a(Long.valueOf(currentTimeMillis));
                a.wD.jx();
            }
        });
        Context applicationContext = activity.getApplicationContext();
        final String go = f.go();
        final j bg = FetchedAppSettingsManager.bg(go);
        if (bg != null && bg.jR()) {
            sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
            SensorManager sensorManager = sensorManager;
            if (sensorManager != null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                wI = new d(activity);
                wH.a(new com.facebook.appevents.codeless.e.a() {
                    public void iI() {
                        j jVar = bg;
                        Object obj = 1;
                        Object obj2 = (jVar == null || !jVar.jR()) ? null : 1;
                        if (!f.ha()) {
                            obj = null;
                        }
                        if (obj2 != null && obj != null) {
                            a.aV(go);
                        }
                    }
                });
                sensorManager.registerListener(wH, defaultSensor, 2);
                if (bg != null && bg.jR()) {
                    wI.iF();
                }
            }
        }
    }

    private static void onActivityPaused(Activity activity) {
        if (wC.decrementAndGet() < 0) {
            wC.set(0);
            Log.w(TAG, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        iR();
        final long currentTimeMillis = System.currentTimeMillis();
        final String ab = z.ab(activity);
        wG.d(activity);
        singleThreadExecutor.execute(new Runnable() {
            public void run() {
                if (a.wD == null) {
                    a.wD = new g(Long.valueOf(currentTimeMillis), null);
                }
                a.wD.a(Long.valueOf(currentTimeMillis));
                if (a.wC.get() <= 0) {
                    AnonymousClass1 anonymousClass1 = new Runnable() {
                        public void run() {
                            if (a.wC.get() <= 0) {
                                h.a(ab, a.wD, a.appId);
                                g.jq();
                                a.wD = null;
                            }
                            synchronized (a.wB) {
                                a.wA = null;
                            }
                        }
                    };
                    synchronized (a.wB) {
                        a.wA = a.singleThreadExecutor.schedule(anonymousClass1, (long) a.iQ(), TimeUnit.SECONDS);
                    }
                }
                long jc = a.wF;
                long j = 0;
                if (jc > 0) {
                    j = (currentTimeMillis - jc) / 1000;
                }
                c.c(ab, j);
                a.wD.jx();
            }
        });
        d dVar = wI;
        if (dVar != null) {
            dVar.iG();
        }
        SensorManager sensorManager = sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(wH);
        }
    }

    private static int iQ() {
        j bg = FetchedAppSettingsManager.bg(f.go());
        if (bg == null) {
            return d.jl();
        }
        return bg.iQ();
    }

    private static void iR() {
        synchronized (wB) {
            if (wA != null) {
                wA.cancel(false);
            }
            wA = null;
        }
    }

    public static void aV(final String str) {
        if (!wL.booleanValue()) {
            wL = Boolean.valueOf(true);
            f.getExecutor().execute(new Runnable() {
                public void run() {
                    boolean z = true;
                    g a = g.a(null, String.format(Locale.US, "%s/app_indexing_session", new Object[]{str}), null, null);
                    Bundle parameters = a.getParameters();
                    if (parameters == null) {
                        parameters = new Bundle();
                    }
                    com.facebook.internal.a U = com.facebook.internal.a.U(f.getApplicationContext());
                    JSONArray jSONArray = new JSONArray();
                    String str = "";
                    jSONArray.put(Build.MODEL != null ? Build.MODEL : str);
                    if (U == null || U.jE() == null) {
                        jSONArray.put(str);
                    } else {
                        jSONArray.put(U.jE());
                    }
                    Object obj = "0";
                    jSONArray.put(obj);
                    if (b.jh()) {
                        obj = "1";
                    }
                    jSONArray.put(obj);
                    Locale kR = z.kR();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(kR.getLanguage());
                    stringBuilder.append("_");
                    stringBuilder.append(kR.getCountry());
                    jSONArray.put(stringBuilder.toString());
                    String jSONArray2 = jSONArray.toString();
                    parameters.putString("device_session_id", a.iS());
                    parameters.putString("extinfo", jSONArray2);
                    a.setParameters(parameters);
                    if (a != null) {
                        JSONObject hH = a.hn().hH();
                        if (hH == null || !hH.optBoolean("is_app_indexing_enabled", false)) {
                            z = false;
                        }
                        a.wK = Boolean.valueOf(z);
                        if (a.wK.booleanValue()) {
                            a.wI.iF();
                        } else {
                            a.wJ = null;
                        }
                    }
                    a.wL = Boolean.valueOf(false);
                }
            });
        }
    }

    public static String iS() {
        if (wJ == null) {
            wJ = UUID.randomUUID().toString();
        }
        return wJ;
    }

    public static boolean iT() {
        return wK.booleanValue();
    }

    public static void c(Boolean bool) {
        wK = bool;
    }
}
