package com.facebook.appevents.codeless.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ParameterComponent */
public final class a {
    public final String name;
    public final String value;
    public final List<PathComponent> wr;
    public final String wu;

    public a(JSONObject jSONObject) {
        this.name = jSONObject.getString(ConditionalUserProperty.NAME);
        this.value = jSONObject.optString(ConditionalUserProperty.VALUE);
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new PathComponent(optJSONArray.getJSONObject(i)));
            }
        }
        this.wr = arrayList;
        this.wu = jSONObject.optString("path_type", "absolute");
    }
}
