package com.iqoption.dto;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import org.json.JSONObject;

public class SupportSubject {
    public int id;
    public String name;

    public SupportSubject(JSONObject jSONObject) {
        this.id = jSONObject.getInt("id");
        this.name = jSONObject.getString(ConditionalUserProperty.NAME);
    }

    public String toString() {
        return this.name;
    }
}
