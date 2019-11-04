package com.iqoption.app.managers;

import android.content.Context;
import com.facebook.appevents.AppEventsLogger;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.app.IQApp;
import com.iqoption.app.d;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.mobbtech.connect.request.a.a.a;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: TaggingManager */
public class k {
    private static String ave;

    private static String dZ(int i) {
        switch (i) {
            case Integer.MIN_VALUE:
                return "twofactor authorization enabled";
            case 2:
                return "interested in special offer";
            case 4:
                return "registered as real";
            case 8:
                return "started tutorial video";
            case 16:
                return "watched tutorial video";
            case 32:
                return "changed chart type";
            case 64:
                return "added technical analysis";
            case 128:
                return "switched to top asset";
            case 256:
                return "tried to change asset";
            case 512:
                return "visited deposit page";
            case 1024:
                return "visited withdrawal page";
            case 2048:
                return "visited education";
            case 4096:
                return "visited tutorial";
            case 8192:
                return "visited faq";
            case 16384:
                return "visited about company";
            case 32768:
                return "changed deal amount manualy";
            case 65536:
                return "used historical prices";
            case 131072:
                return "watched enemy deals";
            case 262144:
                return "shared deal result";
            case 524288:
                return "refreshed demo";
            case 1048576:
                return "native_oneclick_visited";
            case 2097152:
                return "native_oneclick_payed";
            case 4194304:
                return "compact_closeddealpopup_used";
            case 8388608:
                return "tradeindicators_preset_added";
            case 16777216:
                return "open video tutorial";
            case 33554432:
                return "watched one video tutorial";
            case 67108864:
                return "watched all video tutorial";
            case 134217728:
                return "email confirmed";
            case 268435456:
                return "phone confirmed";
            case 536870912:
                return "unlock password added";
            case 1073741824:
                return "touch id enabled";
            default:
                return "";
        }
    }

    private static String ea(int i) {
        return i != 2 ? "" : "sell option used";
    }

    public static boolean d(Context context, int i) {
        return b("tagging_state", context, i);
    }

    private static void e(Context context, int i) {
        c("tagging_state", context, i);
    }

    public static synchronized void f(Context context, int i) {
        synchronized (k.class) {
            if (d(context, i)) {
                return;
            }
            e(context, i);
            D(context, dZ(i));
        }
    }

    public static void aR(Context context) {
        String str = ave;
        if (str != null) {
            D(context, str);
            ave = null;
        }
    }

    private static boolean g(Context context, int i) {
        return b("tagging_state2", context, i);
    }

    private static void h(Context context, int i) {
        c("tagging_state2", context, i);
    }

    public static synchronized void i(Context context, int i) {
        synchronized (k.class) {
            if (g(context, i)) {
                return;
            }
            h(context, i);
            D(context, ea(i));
        }
    }

    private static boolean b(String str, Context context, int i) {
        return (d.aP(context).dL(str) & i) == i;
    }

    private static void c(String str, Context context, int i) {
        d aP = d.aP(context);
        aP.r(str, i | aP.dL(str));
    }

    private static void D(Context context, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(4));
        hashMap.put(ConditionalUserProperty.NAME, str);
        str = IQApp.Ev().Vb();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        str = "api/tag/add";
        stringBuilder.append(str);
        new a(RequestManager.b(stringBuilder.toString(), hashMap, context), null, str).aPG();
    }

    public static synchronized void j(Context context, int i) {
        synchronized (k.class) {
            if (d(context, i)) {
                return;
            }
            f(context, i);
            aS(context);
        }
    }

    private static synchronized void aS(Context context) {
        synchronized (k.class) {
            d aP = d.aP(context);
            long FO = aP.FO();
            long currentTimeMillis = System.currentTimeMillis() - FO;
            int FQ = aP.FQ() + 1;
            aP.dQ(FQ);
            if (FO > 0 && currentTimeMillis <= TimeUnit.HOURS.toMillis(24)) {
                if (FQ == 1) {
                    AppEventsLogger.O(IQApp.Eu()).aO("fb_mobile_add_payment_info");
                } else if (FQ == 2) {
                    AppEventsLogger.O(IQApp.Eu()).aO("fb_mobile_add_to_cart");
                } else if (FQ == 3) {
                    AppEventsLogger.O(IQApp.Eu()).aO("fb_mobile_add_to_wishlist");
                } else if (FQ == 4) {
                    AppEventsLogger.O(IQApp.Eu()).aO("fb_mobile_tutorial_completion");
                } else if (FQ == 5) {
                    AppEventsLogger.O(IQApp.Eu()).aO("fb_mobile_initiated_checkout");
                }
            }
        }
    }
}
