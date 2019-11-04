package com.facebook.appevents.internal;

import android.os.Bundle;
import androidx.work.PeriodicWorkRequest;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import com.facebook.appevents.g;
import com.facebook.internal.s;
import java.util.Locale;

/* compiled from: SessionLogger */
class h {
    private static final String TAG = "com.facebook.appevents.internal.h";
    private static final long[] xp = new long[]{PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    h() {
    }

    public static void a(String str, i iVar, String str2) {
        String iVar2 = iVar != null ? iVar.toString() : "Unclassified";
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", iVar2);
        g gVar = new g(str, str2, null);
        gVar.logEvent("fb_mobile_activate_app", bundle);
        if (g.iq() != FlushBehavior.EXPLICIT_ONLY) {
            gVar.flush();
        }
    }

    public static void a(String str, g gVar, String str2) {
        Long valueOf = Long.valueOf(gVar.ju() - gVar.jr().longValue());
        long longValue = valueOf.longValue();
        Long valueOf2 = Long.valueOf(0);
        if (longValue < 0) {
            jy();
            valueOf = valueOf2;
        }
        Long valueOf3 = Long.valueOf(gVar.jv());
        if (valueOf3.longValue() < 0) {
            jy();
            valueOf3 = valueOf2;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", gVar.js());
        bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(q(valueOf.longValue()))}));
        i jw = gVar.jw();
        bundle.putString("fb_mobile_launch_source", jw != null ? jw.toString() : "Unclassified");
        bundle.putLong("_logTime", gVar.jr().longValue() / 1000);
        g gVar2 = new g(str, str2, null);
        double longValue2 = (double) valueOf3.longValue();
        Double.isNaN(longValue2);
        gVar2.a("fb_mobile_deactivate_app", longValue2 / 1000.0d, bundle);
    }

    private static void jy() {
        s.a(LoggingBehavior.APP_EVENTS, TAG, "Clock skew detected");
    }

    private static int q(long j) {
        int i = 0;
        while (true) {
            long[] jArr = xp;
            if (i >= jArr.length || jArr[i] >= j) {
                return i;
            }
            i++;
        }
        return i;
    }
}
