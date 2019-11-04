package com.appsflyer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class m {
    private static m mc = new m();
    private Map<String, Object> lT = Collections.synchronizedMap(new HashMap());
    private String lw;
    private boolean md;
    private boolean me;
    private boolean mf = false;

    private m() {
    }

    public static m dw() {
        return mc;
    }

    public void set(String str, String str2) {
        this.lT.put(str, str2);
    }

    public void set(String str, int i) {
        this.lT.put(str, Integer.toString(i));
    }

    public void b(String str, long j) {
        this.lT.put(str, Long.toString(j));
    }

    public void c(String str, boolean z) {
        this.lT.put(str, Boolean.toString(z));
    }

    public String getString(String str) {
        return (String) this.lT.get(str);
    }

    public boolean getBoolean(String str, boolean z) {
        str = getString(str);
        if (str == null) {
            return z;
        }
        return Boolean.valueOf(str).booleanValue();
    }

    public int getInt(String str, int i) {
        str = getString(str);
        if (str == null) {
            return i;
        }
        return Integer.valueOf(str).intValue();
    }

    public long getLong(String str, long j) {
        str = getString(str);
        if (str == null) {
            return j;
        }
        return Long.valueOf(str).longValue();
    }

    public Object getObject(String str) {
        return this.lT.get(str);
    }

    /* Access modifiers changed, original: protected */
    public void dx() {
        this.md = true;
    }

    /* Access modifiers changed, original: protected */
    public boolean dy() {
        return this.me;
    }

    /* Access modifiers changed, original: protected */
    public void v(boolean z) {
        this.me = z;
    }

    /* Access modifiers changed, original: protected */
    public void dz() {
        this.me = true;
    }

    /* Access modifiers changed, original: protected */
    public void setReferrer(String str) {
        set("AF_REFERRER", str);
        this.lw = str;
    }

    public String u(Context context) {
        String str = this.lw;
        if (str != null) {
            return str;
        }
        str = "AF_REFERRER";
        if (getString(str) != null) {
            return getString(str);
        }
        if (context == null) {
            return null;
        }
        return j.p(context).getString("referrer", null);
    }

    public boolean dA() {
        return getBoolean("disableLogs", false);
    }

    public boolean dB() {
        return getBoolean("disableOtherSdk", false);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void b(SharedPreferences sharedPreferences) {
        String jSONObject = new JSONObject(this.lT).toString();
        Editor edit = sharedPreferences.edit();
        edit.putString("savedProperties", jSONObject);
        if (VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    public void v(Context context) {
        if (!this.mf) {
            String string = j.p(context).getString("savedProperties", null);
            if (string != null) {
                AFLogger.I("Loading properties..");
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        if (this.lT.get(str) == null) {
                            this.lT.put(str, jSONObject.getString(str));
                        }
                    }
                    this.mf = true;
                } catch (JSONException e) {
                    AFLogger.c("Failed loading properties", e);
                }
                StringBuilder stringBuilder = new StringBuilder("Done loading properties: ");
                stringBuilder.append(this.mf);
                AFLogger.I(stringBuilder.toString());
            }
        }
    }
}
