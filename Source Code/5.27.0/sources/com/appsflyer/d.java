package com.appsflyer;

import android.os.Build.VERSION;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class d {
    public static JSONObject b(Map<String, ?> map) {
        if (VERSION.SDK_INT >= 19) {
            return new JSONObject(map);
        }
        return c(map);
    }

    public static JSONObject c(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), Q(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private static Object Q(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (!((obj instanceof JSONArray) || (obj instanceof JSONObject))) {
            if (obj.equals(JSONObject.NULL)) {
                return obj;
            }
            try {
                if (obj instanceof Collection) {
                    JSONArray jSONArray = new JSONArray();
                    for (Object Q : (Collection) obj) {
                        jSONArray.put(Q(Q));
                    }
                    return jSONArray;
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; i < length; i++) {
                        jSONArray2.put(Q(Array.get(obj, i)));
                    }
                    return jSONArray2;
                } else if (obj instanceof Map) {
                    return c((Map) obj);
                } else {
                    if (!((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String))) {
                        obj = obj.toString();
                    }
                    return obj;
                }
            } catch (Exception unused) {
                obj = JSONObject.NULL;
            }
        }
        return obj;
    }
}
