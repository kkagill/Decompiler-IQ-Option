package com.iqoption.mobbtech.connect.request.a.a;

import androidx.core.util.Pair;
import com.google.common.util.concurrent.t;
import com.google.gson.stream.JsonReader;
import com.iqoption.mobbtech.connect.response.g;
import com.iqoption.util.w;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JSONRequestTask */
public class a extends c<g> {
    public a(Request request, com.iqoption.mobbtech.connect.a.a aVar, String str) {
        super(null, request, aVar, str);
    }

    public static t<g> a(Request request, com.iqoption.mobbtech.connect.a.a aVar, String str) {
        return new a(request, aVar, str).aPF();
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: jm */
    public g iY(String str) {
        g gVar;
        if (str.startsWith("{")) {
            JSONObject jSONObject = new JSONObject(str);
            this.success = jSONObject.optBoolean("isSuccessful", false);
            if (this.success) {
                gVar = new g(jSONObject);
                gVar.setTag(this.dIs.url().toString());
            } else {
                gVar = null;
            }
            return gVar;
        }
        gVar = new g(new JSONObject().put("data", new JSONArray(str)));
        gVar.setTag(this.dIs.url().toString());
        this.success = true;
        return gVar;
    }

    /* Access modifiers changed, original: protected */
    public Pair<g, String> am(JsonReader jsonReader) {
        String jsonElement = w.aWN().parse(jsonReader).toString();
        return new Pair(iY(jsonElement), jsonElement);
    }
}
