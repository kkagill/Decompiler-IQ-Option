package com.appsflyer;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

final class ah extends s {
    private static List<String> nD = Arrays.asList(new String[]{"onelink.me", "onelnk.com", "app.aflink.com"});
    private String lc;
    private a nE;

    interface a {
        void H(String str);

        void g(Map<String, String> map);
    }

    ah(Uri uri, j jVar) {
        super(jVar);
        if (!TextUtils.isEmpty(uri.getHost()) && !TextUtils.isEmpty(uri.getPath())) {
            Object obj = null;
            for (String contains : nD) {
                if (uri.getHost().contains(contains)) {
                    obj = 1;
                }
            }
            String[] split = uri.getPath().split("/");
            if (obj != null && split.length == 3) {
                this.kZ = split[1];
                this.lc = split[2];
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(@NonNull a aVar) {
        this.nE = aVar;
    }

    /* Access modifiers changed, original: final */
    public final boolean dL() {
        return (TextUtils.isEmpty(this.kZ) || TextUtils.isEmpty(this.lc)) ? false : true;
    }

    /* Access modifiers changed, original: final */
    public final void a(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestMethod("GET");
    }

    /* Access modifiers changed, original: final */
    public final String dl() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(t.Y("https://%sonelink.%s/shortlink-sdk/v1"));
        stringBuilder.append("/");
        stringBuilder.append(this.kZ);
        stringBuilder.append("?id=");
        stringBuilder.append(this.lc);
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    public final void H(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                hashMap.put(str2, jSONObject.optString(str2));
            }
            this.nE.g(hashMap);
        } catch (JSONException e) {
            this.nE.H("Can't parse one link data");
            AFLogger.c("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    /* Access modifiers changed, original: final */
    public final void di() {
        this.nE.H("Can't get one link data");
    }
}
