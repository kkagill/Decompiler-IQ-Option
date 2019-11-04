package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType;
import com.facebook.g;
import com.facebook.internal.a;
import com.facebook.internal.z;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SessionEventsState */
class h {
    private List<AppEvent> vC = new ArrayList();
    private List<AppEvent> vD = new ArrayList();
    private int vE;
    private a vF;
    private final int vG = 1000;
    private String vw;

    public h(a aVar, String str) {
        this.vF = aVar;
        this.vw = str;
    }

    public synchronized void a(AppEvent appEvent) {
        if (this.vC.size() + this.vD.size() >= 1000) {
            this.vE++;
        } else {
            this.vC.add(appEvent);
        }
    }

    public synchronized int ix() {
        return this.vC.size();
    }

    public synchronized void D(boolean z) {
        if (z) {
            this.vC.addAll(this.vD);
        }
        this.vD.clear();
        this.vE = 0;
    }

    public int a(g gVar, Context context, boolean z, boolean z2) {
        synchronized (this) {
            int i = this.vE;
            this.vD.addAll(this.vC);
            this.vC.clear();
            JSONArray jSONArray = new JSONArray();
            for (AppEvent appEvent : this.vD) {
                if (!appEvent.ih()) {
                    z.G("Event with invalid checksum: %s", appEvent.toString());
                } else if (z || !appEvent.ig()) {
                    jSONArray.put(appEvent.hH());
                }
            }
            if (jSONArray.length() == 0) {
                return 0;
            }
            a(gVar, context, i, jSONArray, z2);
            return jSONArray.length();
        }
    }

    public synchronized List<AppEvent> iy() {
        List list;
        list = this.vC;
        this.vC = new ArrayList();
        return list;
    }

    private void a(g gVar, Context context, int i, JSONArray jSONArray, boolean z) {
        JSONObject a;
        try {
            a = AppEventsLoggerUtility.a(GraphAPIActivityType.CUSTOM_APP_EVENTS, this.vF, this.vw, z, context);
            if (this.vE > 0) {
                a.put("num_skipped_events", i);
            }
        } catch (JSONException unused) {
            a = new JSONObject();
        }
        gVar.d(a);
        Bundle parameters = gVar.getParameters();
        if (parameters == null) {
            parameters = new Bundle();
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2 != null) {
            parameters.putString("custom_events", jSONArray2);
            gVar.setTag(jSONArray2);
        }
        gVar.setParameters(parameters);
    }
}
