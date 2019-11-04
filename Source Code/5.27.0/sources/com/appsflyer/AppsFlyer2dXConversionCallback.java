package com.appsflyer;

import androidx.core.app.NotificationCompat;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyer2dXConversionCallback implements h {
    public native void onAppOpenAttributionNative(Object obj);

    public native void onAttributionFailureNative(Object obj);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    public void d(Map<String, String> map) {
        onInstallConversionDataLoadedNative(map);
    }

    public void L(String str) {
        k("onAttributionFailure", str);
    }

    public void e(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    public void M(String str) {
        k("onInstallConversionFailure", str);
    }

    private void k(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, "failure");
            jSONObject.put("data", str2);
            int i = -1;
            int hashCode = str.hashCode();
            if (hashCode != -1390007222) {
                if (hashCode == 1050716216) {
                    if (str.equals("onInstallConversionFailure")) {
                        i = 0;
                    }
                }
            } else if (str.equals("onAttributionFailure")) {
                i = 1;
            }
            if (i != 0) {
                if (i == 1) {
                    onAttributionFailureNative(jSONObject);
                }
                return;
            }
            onInstallConversionFailureNative(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
