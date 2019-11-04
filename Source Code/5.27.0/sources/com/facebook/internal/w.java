package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: ProfileInformationCache */
class w {
    private static final ConcurrentHashMap<String, JSONObject> zG = new ConcurrentHashMap();

    public static JSONObject bn(String str) {
        return (JSONObject) zG.get(str);
    }

    public static void e(String str, JSONObject jSONObject) {
        zG.put(str, jSONObject);
    }
}
