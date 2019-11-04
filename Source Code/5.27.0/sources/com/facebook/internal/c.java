package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: BundleJSONConverter */
public class c {
    private static final Map<Class<?>, a> xF = new HashMap();

    /* compiled from: BundleJSONConverter */
    public interface a {
        void a(Bundle bundle, String str, Object obj);
    }

    static {
        xF.put(Boolean.class, new a() {
            public void a(Bundle bundle, String str, Object obj) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            }
        });
        xF.put(Integer.class, new a() {
            public void a(Bundle bundle, String str, Object obj) {
                bundle.putInt(str, ((Integer) obj).intValue());
            }
        });
        xF.put(Long.class, new a() {
            public void a(Bundle bundle, String str, Object obj) {
                bundle.putLong(str, ((Long) obj).longValue());
            }
        });
        xF.put(Double.class, new a() {
            public void a(Bundle bundle, String str, Object obj) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            }
        });
        xF.put(String.class, new a() {
            public void a(Bundle bundle, String str, Object obj) {
                bundle.putString(str, (String) obj);
            }
        });
        xF.put(String[].class, new a() {
            public void a(Bundle bundle, String str, Object obj) {
                throw new IllegalArgumentException("Unexpected type from JSON");
            }
        });
        xF.put(JSONArray.class, new a() {
            public void a(Bundle bundle, String str, Object obj) {
                JSONArray jSONArray = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() == 0) {
                    bundle.putStringArrayList(str, arrayList);
                    return;
                }
                int i = 0;
                while (i < jSONArray.length()) {
                    Object obj2 = jSONArray.get(i);
                    if (obj2 instanceof String) {
                        arrayList.add((String) obj2);
                        i++;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected type in an array: ");
                        stringBuilder.append(obj2.getClass());
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                bundle.putStringArrayList(str, arrayList);
            }
        });
    }

    public static Bundle g(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if (obj != null) {
                if (obj != JSONObject.NULL) {
                    if (obj instanceof JSONObject) {
                        bundle.putBundle(str, g((JSONObject) obj));
                    } else {
                        a aVar = (a) xF.get(obj.getClass());
                        if (aVar != null) {
                            aVar.a(bundle, str, obj);
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unsupported type: ");
                            stringBuilder.append(obj.getClass());
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                }
            }
        }
        return bundle;
    }
}
