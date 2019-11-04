package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.g;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.j;
import com.facebook.internal.z;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserSettingsManager */
final class s {
    private static final String TAG = "com.facebook.s";
    private static AtomicBoolean isInitialized = new AtomicBoolean(false);
    private static a uS = new a(true, "com.facebook.sdk.AutoInitEnabled");
    private static a uT = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    private static a uU = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    private static a uV = new a(false, "auto_event_setup_enabled");
    private static SharedPreferences uW;
    private static Editor uX;

    /* compiled from: UserSettingsManager */
    private static class a {
        String key;
        Boolean uZ;
        boolean va;
        long vb;

        a(boolean z, String str) {
            this.va = z;
            this.key = str;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean getValue() {
            Boolean bool = this.uZ;
            return bool == null ? this.va : bool.booleanValue();
        }
    }

    s() {
    }

    public static void hT() {
        if (f.isInitialized() && isInitialized.compareAndSet(false, true)) {
            uW = f.getApplicationContext().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            uX = uW.edit();
            a(uT, uU, uS);
            hU();
            hV();
            hW();
        }
    }

    private static void a(a... aVarArr) {
        for (a aVar : aVarArr) {
            if (aVar == uV) {
                hU();
            } else if (aVar.uZ == null) {
                b(aVar);
                if (aVar.uZ == null) {
                    c(aVar);
                }
            } else {
                a(aVar);
            }
        }
    }

    private static void hU() {
        b(uV);
        final long currentTimeMillis = System.currentTimeMillis();
        if (uV.uZ == null || currentTimeMillis - uV.vb >= 604800000) {
            a aVar = uV;
            aVar.uZ = null;
            aVar.vb = 0;
            f.getExecutor().execute(new Runnable() {
                public void run() {
                    if (s.uU.getValue()) {
                        j g = FetchedAppSettingsManager.g(f.go(), false);
                        if (g != null && g.jR()) {
                            com.facebook.internal.a U = com.facebook.internal.a.U(f.getApplicationContext());
                            String jE = (U == null || U.jE() == null) ? null : U.jE();
                            if (jE != null) {
                                Bundle bundle = new Bundle();
                                bundle.putString("advertiser_id", U.jE());
                                String str = "auto_event_setup_enabled";
                                bundle.putString("fields", str);
                                g a = g.a(null, f.go(), null);
                                a.C(true);
                                a.setParameters(bundle);
                                JSONObject hH = a.hn().hH();
                                if (hH != null) {
                                    s.uV.uZ = Boolean.valueOf(hH.optBoolean(str, false));
                                    s.uV.vb = currentTimeMillis;
                                    s.a(s.uV);
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    private static void a(a aVar) {
        hX();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ConditionalUserProperty.VALUE, aVar.uZ);
            jSONObject.put("last_timestamp", aVar.vb);
            uX.putString(aVar.key, jSONObject.toString()).commit();
            hW();
        } catch (JSONException e) {
            z.a(TAG, e);
        }
    }

    private static void b(a aVar) {
        hX();
        try {
            String string = uW.getString(aVar.key, "");
            if (!string.isEmpty()) {
                JSONObject jSONObject = new JSONObject(string);
                aVar.uZ = Boolean.valueOf(jSONObject.getBoolean(ConditionalUserProperty.VALUE));
                aVar.vb = jSONObject.getLong("last_timestamp");
            }
        } catch (JSONException e) {
            z.a(TAG, e);
        }
    }

    private static void c(a aVar) {
        hX();
        try {
            Context applicationContext = f.getApplicationContext();
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey(aVar.key)) {
                aVar.uZ = Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.key, aVar.va));
            }
        } catch (NameNotFoundException e) {
            z.a(TAG, e);
        }
    }

    private static void hV() {
        try {
            Context applicationContext = f.getApplicationContext();
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w(TAG, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(TAG, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!hb()) {
                    Log.w(TAG, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                }
            }
        } catch (NameNotFoundException unused) {
        }
    }

    private static void hW() {
        if (isInitialized.get() && f.isInitialized()) {
            Context applicationContext = f.getApplicationContext();
            int i = 0;
            int value = (((uS.getValue() << 0) | 0) | (uT.getValue() << 1)) | (uU.getValue() << 2);
            String str = "com.facebook.sdk.USER_SETTINGS_BITMASK";
            int i2 = uW.getInt(str, 0);
            if (i2 != value) {
                int i3;
                g gVar;
                Bundle bundle;
                uX.putInt(str, value).commit();
                try {
                    ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                        String[] strArr = new String[]{"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled"};
                        boolean[] zArr = new boolean[]{true, true, true};
                        int i4 = 0;
                        int i5 = 0;
                        i3 = 0;
                        while (i4 < strArr.length) {
                            try {
                                i5 |= (applicationInfo.metaData.containsKey(strArr[i4]) ? 1 : 0) << i4;
                                i3 |= applicationInfo.metaData.getBoolean(strArr[i4], zArr[i4]) << i4;
                                i4++;
                            } catch (NameNotFoundException unused) {
                            }
                        }
                        i = i5;
                        gVar = new g(applicationContext);
                        bundle = new Bundle();
                        bundle.putInt("usage", i);
                        bundle.putInt("initial", i3);
                        bundle.putInt("previous", i2);
                        bundle.putInt("current", value);
                        gVar.d("fb_sdk_settings_changed", bundle);
                    }
                } catch (NameNotFoundException unused2) {
                }
                i3 = 0;
                gVar = new g(applicationContext);
                bundle = new Bundle();
                bundle.putInt("usage", i);
                bundle.putInt("initial", i3);
                bundle.putInt("previous", i2);
                bundle.putInt("current", value);
                gVar.d("fb_sdk_settings_changed", bundle);
            }
        }
    }

    private static void hX() {
        if (!isInitialized.get()) {
            throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
        }
    }

    public static boolean gY() {
        hT();
        return uS.getValue();
    }

    public static boolean gZ() {
        hT();
        return uT.getValue();
    }

    public static boolean hb() {
        hT();
        return uU.getValue();
    }

    public static boolean ha() {
        hT();
        return uV.getValue();
    }
}
