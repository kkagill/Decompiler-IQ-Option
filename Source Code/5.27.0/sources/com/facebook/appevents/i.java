package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserDataStore */
public class i {
    private static final String TAG = "i";
    private static SharedPreferences sA;
    private static ConcurrentHashMap<String, String> vH;
    private static AtomicBoolean vI = new AtomicBoolean(false);

    static void ib() {
        if (!vI.get()) {
            ie();
        }
    }

    static String iz() {
        if (!vI.get()) {
            Log.w(TAG, "initStore should have been called before calling setUserID");
            ie();
        }
        return l(vH);
    }

    private static synchronized void ie() {
        synchronized (i.class) {
            if (vI.get()) {
                return;
            }
            sA = PreferenceManager.getDefaultSharedPreferences(f.getApplicationContext());
            vH = new ConcurrentHashMap(aS(sA.getString("com.facebook.appevents.UserDataStore.userData", "")));
            vI.set(true);
        }
    }

    private static String l(Map<String, String> map) {
        String str = "";
        if (map.isEmpty()) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str2 : map.keySet()) {
                jSONObject.put(str2, map.get(str2));
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    private static Map<String, String> aS(String str) {
        if (str.isEmpty()) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                hashMap.put(str2, jSONObject.getString(str2));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }
}
