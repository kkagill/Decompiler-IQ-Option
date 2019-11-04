package com.facebook.appevents.internal;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.g;
import com.facebook.f;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.aa;
import com.facebook.internal.i;
import com.facebook.internal.j;
import com.google.android.gms.plus.PlusShare;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AutomaticAnalyticsLogger */
public class c {
    private static final String TAG = "com.facebook.appevents.internal.c";
    private static final g wS = new g(f.getApplicationContext());

    /* compiled from: AutomaticAnalyticsLogger */
    private static class a {
        BigDecimal wU;
        Currency wV;
        Bundle wW;

        a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.wU = bigDecimal;
            this.wV = currency;
            this.wW = bundle;
        }
    }

    public static void jj() {
        Object applicationContext = f.getApplicationContext();
        String go = f.go();
        boolean gZ = f.gZ();
        aa.b(applicationContext, "context");
        if (!gZ) {
            return;
        }
        if (applicationContext instanceof Application) {
            AppEventsLogger.b((Application) applicationContext, go);
        } else {
            Log.w(TAG, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
        }
    }

    public static void c(String str, long j) {
        Object applicationContext = f.getApplicationContext();
        String go = f.go();
        aa.b(applicationContext, "context");
        j g = FetchedAppSettingsManager.g(go, false);
        if (g != null && g.jO() && j > 0) {
            g gVar = new g(applicationContext);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            gVar.a("fb_aa_time_spent_on_view", (double) j, bundle);
        }
    }

    public static void z(String str, String str2) {
        if (jk()) {
            a A = A(str, str2);
            if (A != null) {
                wS.a(A.wU, A.wV, A.wW);
            }
        }
    }

    public static void a(SubscriptionType subscriptionType, String str, String str2, Map<String, String> map) {
        if (jk()) {
            String str3;
            boolean a = i.a("app_events_if_auto_log_subs", f.go(), false);
            switch (subscriptionType) {
                case SUBSCRIBE:
                    if (a) {
                        str3 = "Subscribe";
                        break;
                    } else {
                        z(str, str2);
                        return;
                    }
                case START_TRIAL:
                    if (a) {
                        str3 = "StartTrial";
                        break;
                    } else {
                        z(str, str2);
                        return;
                    }
                case RESTORE:
                    str3 = "SubscriptionRestore";
                    break;
                case CANCEL:
                    str3 = "SubscriptionCancel";
                    break;
                case HEARTBEAT:
                    str3 = "SubscriptionHeartbeat";
                    break;
                case EXPIRE:
                    str3 = "SubscriptionExpire";
                    break;
                default:
                    return;
            }
            a a2 = a(str, str2, map);
            if (a2 != null) {
                wS.a(str3, a2.wU, a2.wV, a2.wW);
            }
        }
    }

    public static boolean jk() {
        j bg = FetchedAppSettingsManager.bg(f.go());
        return bg != null && f.gZ() && bg.jQ();
    }

    @Nullable
    private static a A(String str, String str2) {
        return a(str, str2, new HashMap());
    }

    @Nullable
    private static a a(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (optString.equals("subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                if (!optString2.isEmpty()) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (String optString3 : map.keySet()) {
                bundle.putCharSequence(optString3, (CharSequence) map.get(optString3));
            }
            double d = (double) jSONObject2.getLong("price_amount_micros");
            Double.isNaN(d);
            return new a(new BigDecimal(d / 1000000.0d), Currency.getInstance(jSONObject2.getString("price_currency_code")), bundle);
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing in-app subscription data.", e);
            return null;
        }
    }
}
