package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.appevents.internal.c;
import com.facebook.appevents.internal.d;
import com.facebook.appevents.internal.e;
import com.facebook.f;
import com.facebook.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class FetchedAppSettingsManager {
    private static final String TAG = "FetchedAppSettingsManager";
    private static final String[] ys = new String[]{"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "gdpv4_chrome_custom_tabs_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url"};
    private static final Map<String, j> yt = new ConcurrentHashMap();
    private static final AtomicReference<FetchAppSettingState> yu = new AtomicReference(FetchAppSettingState.NOT_LOADED);
    private static final ConcurrentLinkedQueue<a> yv = new ConcurrentLinkedQueue();
    private static boolean yw = false;
    private static boolean yx = false;
    @Nullable
    private static JSONArray yy = null;

    enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    public interface a {
        void a(j jVar);

        void onError();
    }

    public static void jV() {
        final Context applicationContext = f.getApplicationContext();
        final String go = f.go();
        if (z.aB(go)) {
            yu.set(FetchAppSettingState.ERROR);
            jW();
        } else if (yt.containsKey(go)) {
            yu.set(FetchAppSettingState.SUCCESS);
            jW();
        } else {
            Object obj = (yu.compareAndSet(FetchAppSettingState.NOT_LOADED, FetchAppSettingState.LOADING) || yu.compareAndSet(FetchAppSettingState.ERROR, FetchAppSettingState.LOADING)) ? 1 : null;
            if (obj == null) {
                jW();
                return;
            }
            final String format = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[]{go});
            f.getExecutor().execute(new Runnable() {
                public void run() {
                    SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                    j jVar = null;
                    String string = sharedPreferences.getString(format, null);
                    if (!z.aB(string)) {
                        JSONObject jSONObject;
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException e) {
                            z.a("FacebookSDK", e);
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            jVar = FetchedAppSettingsManager.c(go, jSONObject);
                        }
                    }
                    JSONObject bf = FetchedAppSettingsManager.bh(go);
                    if (bf != null) {
                        FetchedAppSettingsManager.c(go, bf);
                        sharedPreferences.edit().putString(format, bf.toString()).apply();
                    }
                    if (jVar != null) {
                        string = jVar.jT();
                        if (!(FetchedAppSettingsManager.yw || string == null || string.length() <= 0)) {
                            FetchedAppSettingsManager.yw = true;
                            Log.w(FetchedAppSettingsManager.TAG, string);
                        }
                    }
                    i.f(go, true);
                    c.jj();
                    e.update();
                    FetchedAppSettingsManager.yu.set(FetchedAppSettingsManager.yt.containsKey(go) ? FetchAppSettingState.SUCCESS : FetchAppSettingState.ERROR);
                    FetchedAppSettingsManager.jW();
                }
            });
        }
    }

    @Nullable
    public static j bg(String str) {
        return str != null ? (j) yt.get(str) : null;
    }

    /* JADX WARNING: Missing block: B:24:0x0070, code skipped:
            return;
     */
    private static synchronized void jW() {
        /*
        r0 = com.facebook.internal.FetchedAppSettingsManager.class;
        monitor-enter(r0);
        r1 = yu;	 Catch:{ all -> 0x0071 }
        r1 = r1.get();	 Catch:{ all -> 0x0071 }
        r1 = (com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState) r1;	 Catch:{ all -> 0x0071 }
        r2 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.NOT_LOADED;	 Catch:{ all -> 0x0071 }
        r2 = r2.equals(r1);	 Catch:{ all -> 0x0071 }
        if (r2 != 0) goto L_0x006f;
    L_0x0013:
        r2 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.LOADING;	 Catch:{ all -> 0x0071 }
        r2 = r2.equals(r1);	 Catch:{ all -> 0x0071 }
        if (r2 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x006f;
    L_0x001c:
        r2 = com.facebook.f.go();	 Catch:{ all -> 0x0071 }
        r3 = yt;	 Catch:{ all -> 0x0071 }
        r2 = r3.get(r2);	 Catch:{ all -> 0x0071 }
        r2 = (com.facebook.internal.j) r2;	 Catch:{ all -> 0x0071 }
        r3 = new android.os.Handler;	 Catch:{ all -> 0x0071 }
        r4 = android.os.Looper.getMainLooper();	 Catch:{ all -> 0x0071 }
        r3.<init>(r4);	 Catch:{ all -> 0x0071 }
        r4 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.ERROR;	 Catch:{ all -> 0x0071 }
        r1 = r4.equals(r1);	 Catch:{ all -> 0x0071 }
        if (r1 == 0) goto L_0x0054;
    L_0x0039:
        r1 = yv;	 Catch:{ all -> 0x0071 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0071 }
        if (r1 != 0) goto L_0x0052;
    L_0x0041:
        r1 = yv;	 Catch:{ all -> 0x0071 }
        r1 = r1.poll();	 Catch:{ all -> 0x0071 }
        r1 = (com.facebook.internal.FetchedAppSettingsManager.a) r1;	 Catch:{ all -> 0x0071 }
        r2 = new com.facebook.internal.FetchedAppSettingsManager$2;	 Catch:{ all -> 0x0071 }
        r2.<init>(r1);	 Catch:{ all -> 0x0071 }
        r3.post(r2);	 Catch:{ all -> 0x0071 }
        goto L_0x0039;
    L_0x0052:
        monitor-exit(r0);
        return;
    L_0x0054:
        r1 = yv;	 Catch:{ all -> 0x0071 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0071 }
        if (r1 != 0) goto L_0x006d;
    L_0x005c:
        r1 = yv;	 Catch:{ all -> 0x0071 }
        r1 = r1.poll();	 Catch:{ all -> 0x0071 }
        r1 = (com.facebook.internal.FetchedAppSettingsManager.a) r1;	 Catch:{ all -> 0x0071 }
        r4 = new com.facebook.internal.FetchedAppSettingsManager$3;	 Catch:{ all -> 0x0071 }
        r4.<init>(r1, r2);	 Catch:{ all -> 0x0071 }
        r3.post(r4);	 Catch:{ all -> 0x0071 }
        goto L_0x0054;
    L_0x006d:
        monitor-exit(r0);
        return;
    L_0x006f:
        monitor-exit(r0);
        return;
    L_0x0071:
        r1 = move-exception;
        monitor-exit(r0);
        goto L_0x0075;
    L_0x0074:
        throw r1;
    L_0x0075:
        goto L_0x0074;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FetchedAppSettingsManager.jW():void");
    }

    @Nullable
    public static j g(String str, boolean z) {
        if (!z && yt.containsKey(str)) {
            return (j) yt.get(str);
        }
        JSONObject bh = bh(str);
        if (bh == null) {
            return null;
        }
        j c = c(str, bh);
        if (str.equals(f.go())) {
            yu.set(FetchAppSettingState.SUCCESS);
            jW();
        }
        return c;
    }

    private static j c(String str, JSONObject jSONObject) {
        f jI;
        JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("android_sdk_error_categories");
        if (optJSONArray == null) {
            jI = f.jI();
        } else {
            jI = f.d(optJSONArray);
        }
        f fVar = jI;
        int optInt = jSONObject2.optInt("app_events_feature_bitmask", 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        boolean z4 = (optInt & 256) != 0;
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("auto_event_mapping_android");
        yy = optJSONArray2;
        if (yy != null && q.ks()) {
            com.facebook.appevents.codeless.internal.c.aU(optJSONArray2.toString());
        }
        j jVar = r2;
        j jVar2 = new j(jSONObject2.optBoolean("supports_implicit_sdk_logging", false), jSONObject2.optString("gdpv4_nux_content", ""), jSONObject2.optBoolean("gdpv4_nux_enabled", false), jSONObject2.optBoolean("gdpv4_chrome_custom_tabs_enabled", false), jSONObject2.optInt("app_events_session_timeout", d.jl()), SmartLoginOption.parseOptions(jSONObject2.optLong("seamless_login")), j(jSONObject2.optJSONObject("android_dialog_configs")), z, fVar, jSONObject2.optString("smart_login_bookmark_icon_url"), jSONObject2.optString("smart_login_menu_icon_url"), z2, z3, optJSONArray2, jSONObject2.optString("sdk_update_message"), z4);
        jVar2 = jVar;
        yt.put(str, jVar2);
        return jVar2;
    }

    private static JSONObject bh(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(ys))));
        g a = g.a(null, str, null);
        a.C(true);
        a.setParameters(bundle);
        return a.hn().hH();
    }

    private static Map<String, Map<String, com.facebook.internal.j.a>> j(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    com.facebook.internal.j.a i2 = com.facebook.internal.j.a.i(optJSONArray.optJSONObject(i));
                    if (i2 != null) {
                        String jU = i2.jU();
                        Map map = (Map) hashMap.get(jU);
                        if (map == null) {
                            map = new HashMap();
                            hashMap.put(jU, map);
                        }
                        map.put(i2.getFeatureName(), i2);
                    }
                }
            }
        }
        return hashMap;
    }
}
