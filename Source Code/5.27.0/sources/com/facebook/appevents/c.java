package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import com.facebook.f;
import com.facebook.g;
import com.facebook.g.b;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.j;
import com.facebook.internal.s;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: AppEventQueue */
class c {
    private static final String TAG = "com.facebook.appevents.c";
    private static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
    private static volatile b vg = new b();
    private static ScheduledFuture vh;
    private static final Runnable vi = new Runnable() {
        public void run() {
            c.vh = null;
            if (AppEventsLogger.iq() != FlushBehavior.EXPLICIT_ONLY) {
                c.b(FlushReason.TIMER);
            }
        }
    };

    c() {
    }

    public static void ik() {
        singleThreadExecutor.execute(new Runnable() {
            public void run() {
                d.b(c.vg);
                c.vg = new b();
            }
        });
    }

    public static void a(final FlushReason flushReason) {
        singleThreadExecutor.execute(new Runnable() {
            public void run() {
                c.b(flushReason);
            }
        });
    }

    public static void b(final AccessTokenAppIdPair accessTokenAppIdPair, final AppEvent appEvent) {
        singleThreadExecutor.execute(new Runnable() {
            public void run() {
                c.vg.a(accessTokenAppIdPair, appEvent);
                if (AppEventsLogger.iq() != FlushBehavior.EXPLICIT_ONLY && c.vg.ij() > 100) {
                    c.b(FlushReason.EVENT_THRESHOLD);
                } else if (c.vh == null) {
                    c.vh = c.singleThreadExecutor.schedule(c.vi, 15, TimeUnit.SECONDS);
                }
            }
        });
    }

    public static Set<AccessTokenAppIdPair> getKeySet() {
        return vg.keySet();
    }

    static void b(FlushReason flushReason) {
        vg.a(d.ip());
        try {
            f a = a(flushReason, vg);
            if (a != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", a.vA);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", a.vB);
                LocalBroadcastManager.getInstance(f.getApplicationContext()).sendBroadcast(intent);
            }
        } catch (Exception e) {
            Log.w(TAG, "Caught unexpected exception while flushing app events: ", e);
        }
    }

    private static f a(FlushReason flushReason, b bVar) {
        f fVar = new f();
        boolean M = f.M(f.getApplicationContext());
        ArrayList<g> arrayList = new ArrayList();
        for (AccessTokenAppIdPair accessTokenAppIdPair : bVar.keySet()) {
            g a = a(accessTokenAppIdPair, bVar.a(accessTokenAppIdPair), M, fVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        s.a(LoggingBehavior.APP_EVENTS, TAG, "Flushing %d events due to %s.", Integer.valueOf(fVar.vA), flushReason.toString());
        for (g hn : arrayList) {
            hn.hn();
        }
        return fVar;
    }

    private static g a(final AccessTokenAppIdPair accessTokenAppIdPair, final h hVar, boolean z, final f fVar) {
        boolean z2 = false;
        j g = FetchedAppSettingsManager.g(accessTokenAppIdPair.go(), false);
        final g a = g.a(null, String.format("%s/activities", new Object[]{r0}), null, null);
        Bundle parameters = a.getParameters();
        if (parameters == null) {
            parameters = new Bundle();
        }
        parameters.putString("access_token", accessTokenAppIdPair.ia());
        String it = g.it();
        if (it != null) {
            parameters.putString("device_token", it);
        }
        it = e.cZ();
        if (it != null) {
            parameters.putString("install_referrer", it);
        }
        a.setParameters(parameters);
        if (g != null) {
            z2 = g.jM();
        }
        int a2 = hVar.a(a, f.getApplicationContext(), z2, z);
        if (a2 == 0) {
            return null;
        }
        fVar.vA += a2;
        a.a(new b() {
            public void a(com.facebook.j jVar) {
                c.a(accessTokenAppIdPair, a, jVar, hVar, fVar);
            }
        });
        return a;
    }

    private static void a(final AccessTokenAppIdPair accessTokenAppIdPair, g gVar, com.facebook.j jVar, final h hVar, f fVar) {
        String str;
        FacebookRequestError hG = jVar.hG();
        FlushResult flushResult = FlushResult.SUCCESS;
        boolean z = true;
        if (hG == null) {
            str = "Success";
        } else if (hG.getErrorCode() == -1) {
            flushResult = FlushResult.NO_CONNECTIVITY;
            str = "Failed: No Connectivity";
        } else {
            str = String.format("Failed:\n  Response: %s\n  Error %s", new Object[]{jVar.toString(), hG.toString()});
            flushResult = FlushResult.SERVER_ERROR;
        }
        if (f.a(LoggingBehavior.APP_EVENTS)) {
            String jSONArray;
            try {
                jSONArray = new JSONArray((String) gVar.getTag()).toString(2);
            } catch (JSONException unused) {
                jSONArray = "<Can't encode events for debug logging>";
            }
            s.a(LoggingBehavior.APP_EVENTS, TAG, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", gVar.hi().toString(), str, jSONArray);
        }
        if (hG == null) {
            z = false;
        }
        hVar.D(z);
        if (flushResult == FlushResult.NO_CONNECTIVITY) {
            f.getExecutor().execute(new Runnable() {
                public void run() {
                    d.a(accessTokenAppIdPair, hVar);
                }
            });
        }
        if (flushResult != FlushResult.SUCCESS && fVar.vB != FlushResult.NO_CONNECTIVITY) {
            fVar.vB = flushResult;
        }
    }
}
