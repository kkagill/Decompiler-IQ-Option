package com.jumio.analytics;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Map;
import org.json.JSONObject;

public class Payload<T> {
    private MetaInfo mMetaInfo;
    private T mValue;

    public Payload(T t, MetaInfo metaInfo) {
        this.mValue = t;
        this.mMetaInfo = metaInfo;
    }

    public MetaInfo getMetaInfo() {
        return this.mMetaInfo;
    }

    public T getValue() {
        return this.mValue;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        Object obj = this.mValue;
        boolean z = obj instanceof Map;
        String str = ConditionalUserProperty.VALUE;
        if (z) {
            jSONObject.put(str, new JSONObject((Map) obj));
        } else {
            jSONObject.put(str, obj);
        }
        MetaInfo metaInfo = this.mMetaInfo;
        if (metaInfo != null && metaInfo.size() > 0) {
            jSONObject.put("metainfo", new JSONObject(this.mMetaInfo));
        }
        return jSONObject;
    }
}
