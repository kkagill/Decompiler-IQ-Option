package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import com.facebook.appevents.internal.a;
import com.facebook.f;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.aa;
import com.facebook.internal.i;
import com.facebook.internal.s;
import com.facebook.internal.z;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* compiled from: AppEventsLoggerImpl */
class e {
    private static final String TAG = "com.facebook.appevents.e";
    private static ScheduledThreadPoolExecutor vt;
    private static FlushBehavior vu = FlushBehavior.AUTO;
    private static Object vv = new Object();
    private static String vw;
    private static boolean vx;
    private static String vy;
    private final String vr;
    private final AccessTokenAppIdPair vs;

    static void b(Application application, String str) {
        if (f.isInitialized()) {
            a.ib();
            i.ib();
            if (str == null) {
                str = f.go();
            }
            f.q(application, str);
            a.a(application, str);
            return;
        }
        throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
    }

    static void s(final Context context, String str) {
        if (f.gZ()) {
            final e eVar = new e(context, str, null);
            vt.execute(new Runnable() {
                public void run() {
                    Bundle bundle = new Bundle();
                    String[] strArr = new String[]{"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                    String[] strArr2 = new String[]{"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                    if (strArr.length == strArr2.length) {
                        int i = 0;
                        for (int i2 = 0; i2 < strArr.length; i2++) {
                            String str = strArr[i2];
                            String str2 = strArr2[i2];
                            try {
                                Class.forName(str);
                                bundle.putInt(str2, 1);
                                i |= 1 << i2;
                            } catch (ClassNotFoundException unused) {
                            }
                        }
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                        String str3 = "kitsBitmask";
                        if (sharedPreferences.getInt(str3, 0) != i) {
                            sharedPreferences.edit().putInt(str3, i).apply();
                            eVar.a("fb_sdk_initialize", null, bundle);
                            return;
                        }
                        return;
                    }
                    throw new FacebookException("Number of class names and key names should match");
                }
            });
        }
    }

    static FlushBehavior iq() {
        FlushBehavior flushBehavior;
        synchronized (vv) {
            flushBehavior = vu;
        }
        return flushBehavior;
    }

    /* Access modifiers changed, original: 0000 */
    public void aO(String str) {
        logEvent(str, null);
    }

    /* Access modifiers changed, original: 0000 */
    public void logEvent(String str, Bundle bundle) {
        a(str, null, bundle, false, a.iP());
    }

    /* Access modifiers changed, original: 0000 */
    public void a(String str, double d, Bundle bundle) {
        a(str, Double.valueOf(d), bundle, false, a.iP());
    }

    /* Access modifiers changed, original: 0000 */
    public void a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        a(bigDecimal, currency, bundle, true);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (bigDecimal == null) {
            aQ("purchaseAmount cannot be null");
        } else if (currency == null) {
            aQ("currency cannot be null");
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            a("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, a.iP());
            iv();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void flush() {
        c.a(FlushReason.EXPLICIT);
    }

    static void ir() {
        c.ik();
    }

    static String it() {
        String str;
        synchronized (vv) {
            str = vy;
        }
        return str;
    }

    static void aP(String str) {
        SharedPreferences sharedPreferences = f.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
        if (str != null) {
            sharedPreferences.edit().putString("install_referrer", str).apply();
        }
    }

    @Nullable
    static String cZ() {
        return f.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
    }

    e(Context context, String str, com.facebook.a aVar) {
        this(z.ab(context), str, aVar);
    }

    e(String str, String str2, com.facebook.a aVar) {
        aa.kV();
        this.vr = str;
        if (aVar == null) {
            aVar = com.facebook.a.ge();
        }
        if (com.facebook.a.gf() && (str2 == null || str2.equals(aVar.go()))) {
            this.vs = new AccessTokenAppIdPair(aVar);
        } else {
            if (str2 == null) {
                str2 = z.Z(f.getApplicationContext());
            }
            this.vs = new AccessTokenAppIdPair(null, str2);
        }
        iu();
    }

    private static void iu() {
        synchronized (vv) {
            if (vt != null) {
                return;
            }
            vt = new ScheduledThreadPoolExecutor(1);
            vt.scheduleAtFixedRate(new Runnable() {
                public void run() {
                    HashSet<String> hashSet = new HashSet();
                    for (AccessTokenAppIdPair go : c.getKeySet()) {
                        hashSet.add(go.go());
                    }
                    for (String g : hashSet) {
                        FetchedAppSettingsManager.g(g, true);
                    }
                }
            }, 0, 86400, TimeUnit.SECONDS);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(String str, Double d, Bundle bundle) {
        a(str, d, bundle, true, a.iP());
    }

    /* Access modifiers changed, original: 0000 */
    public void a(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (bigDecimal == null || currency == null) {
            z.G(TAG, "purchaseAmount and currency cannot be null");
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putString("fb_currency", currency.getCurrencyCode());
        a(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, a.iP());
    }

    /* Access modifiers changed, original: 0000 */
    public void a(String str, Double d, Bundle bundle, boolean z, @Nullable UUID uuid) {
        String str2 = "AppEvents";
        if (i.a("app_events_killswitch", f.go(), false)) {
            s.a(LoggingBehavior.APP_EVENTS, str2, "KillSwitch is enabled and fail to log app event: %s", str);
            return;
        }
        try {
            a(new AppEvent(this.vr, str, d, bundle, z, a.isInBackground(), uuid), this.vs);
        } catch (JSONException e) {
            s.a(LoggingBehavior.APP_EVENTS, str2, "JSON encoding for app event failed: '%s'", e.toString());
        } catch (FacebookException e2) {
            s.a(LoggingBehavior.APP_EVENTS, str2, "Invalid app event: %s", e2.toString());
        }
    }

    private static void a(AppEvent appEvent, AccessTokenAppIdPair accessTokenAppIdPair) {
        c.b(accessTokenAppIdPair, appEvent);
        if (!appEvent.ig() && !vx) {
            if (appEvent.getName().equals("fb_mobile_activate_app")) {
                vx = true;
            } else {
                s.a(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }
    }

    static void iv() {
        if (iq() != FlushBehavior.EXPLICIT_ONLY) {
            c.a(FlushReason.EAGER_FLUSHING_EVENT);
        }
    }

    private static void aQ(String str) {
        s.a(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", str);
    }

    static Executor iw() {
        if (vt == null) {
            iu();
        }
        return vt;
    }

    static String P(Context context) {
        if (vw == null) {
            synchronized (vv) {
                if (vw == null) {
                    vw = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (vw == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("XZ");
                        stringBuilder.append(UUID.randomUUID().toString());
                        vw = stringBuilder.toString();
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", vw).apply();
                    }
                }
            }
        }
        return vw;
    }
}
