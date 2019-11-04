package com.facebook.appevents;

import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.b;
import com.facebook.internal.s;
import com.facebook.internal.z;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;

class AppEvent implements Serializable {
    private static final long serialVersionUID = 1;
    private static final HashSet<String> ve = new HashSet();
    private final String checksum;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final JSONObject jsonObject;
    private final String name;

    static class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;

        private Object readResolve() {
            return new AppEvent(this.jsonString, this.isImplicit, this.inBackground, null);
        }
    }

    static class SerializationProxyV2 implements Serializable {
        private static final long serialVersionUID = 20160803001L;
        private final String checksum;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;

        private SerializationProxyV2(String str, boolean z, boolean z2, String str2) {
            this.jsonString = str;
            this.isImplicit = z;
            this.inBackground = z2;
            this.checksum = str2;
        }

        private Object readResolve() {
            return new AppEvent(this.jsonString, this.isImplicit, this.inBackground, this.checksum);
        }
    }

    public AppEvent(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, @Nullable UUID uuid) {
        this.jsonObject = a(str, str2, d, bundle, z, z2, uuid);
        this.isImplicit = z;
        this.inBackground = z2;
        this.name = str2;
        this.checksum = ii();
    }

    public String getName() {
        return this.name;
    }

    private AppEvent(String str, boolean z, boolean z2, String str2) {
        this.jsonObject = new JSONObject(str);
        this.isImplicit = z;
        this.name = this.jsonObject.optString("_eventName");
        this.checksum = str2;
        this.inBackground = z2;
    }

    public boolean ig() {
        return this.isImplicit;
    }

    public JSONObject hH() {
        return this.jsonObject;
    }

    public boolean ih() {
        if (this.checksum == null) {
            return true;
        }
        return ii().equals(this.checksum);
    }

    private static void aM(String str) {
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[]{str, Integer.valueOf(40)}));
        }
        boolean contains;
        synchronized (ve) {
            contains = ve.contains(str);
        }
        if (!contains) {
            if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
                synchronized (ve) {
                    ve.add(str);
                }
                return;
            }
            throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[]{str}));
        }
    }

    private static JSONObject a(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, @Nullable UUID uuid) {
        aM(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_eventName", str2);
        jSONObject.put("_eventName_md5", aN(str2));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        str = "1";
        if (z) {
            jSONObject.put("_implicitlyLogged", str);
        }
        if (z2) {
            jSONObject.put("_inBackground", str);
        }
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                aM(str3);
                Object obj = bundle.get(str3);
                if ((obj instanceof String) || (obj instanceof Number)) {
                    jSONObject.put(str3, obj.toString());
                } else {
                    throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[]{obj, str3}));
                }
            }
        }
        if (!z) {
            s.a(LoggingBehavior.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    private Object writeReplace() {
        return new SerializationProxyV2(this.jsonObject.toString(), this.isImplicit, this.inBackground, this.checksum);
    }

    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", new Object[]{this.jsonObject.optString("_eventName"), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()});
    }

    private String ii() {
        if (VERSION.SDK_INT > 19) {
            return aN(this.jsonObject.toString());
        }
        ArrayList arrayList = new ArrayList();
        Iterator keys = this.jsonObject.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        Collections.sort(arrayList);
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            stringBuilder.append(str);
            stringBuilder.append(" = ");
            stringBuilder.append(this.jsonObject.optString(str));
            stringBuilder.append(10);
        }
        return aN(stringBuilder.toString());
    }

    private static String aN(String str) {
        String str2 = "Failed to generate checksum: ";
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes("UTF-8");
            instance.update(bytes, 0, bytes.length);
            return b.f(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            z.a(str2, e);
            return "0";
        } catch (UnsupportedEncodingException e2) {
            z.a(str2, e2);
            return "1";
        }
    }
}
