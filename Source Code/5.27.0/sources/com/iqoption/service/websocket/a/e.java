package com.iqoption.service.websocket.a;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.common.util.concurrent.aa;
import com.google.gson.JsonObject;
import com.iqoption.core.ext.d;
import com.iqoption.mobbtech.connect.request.a.a.b;
import com.iqoption.util.w;
import java.util.Map;

/* compiled from: UnSubscribeMessageIQBusRequest */
class e extends a {
    e(String str, Map<String, Object> map) {
        super("unsubscribeMessage", str, map, 15000);
    }

    e(b bVar, aa aaVar, String str, Map<String, Object> map) {
        super("unsubscribeMessage", bVar, aaVar, str, (Map) map, 15000);
    }

    public JsonObject aTH() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(ConditionalUserProperty.NAME, this.bgx);
        jsonObject.addProperty("version", this.version);
        if (!TextUtils.isEmpty(this.auN)) {
            jsonObject.addProperty("microserviceName", this.auN);
        }
        if (!(this.auM == null || this.auM.isEmpty())) {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.add("routingFilters", d.b(this.auM, w.aWM()));
            jsonObject.add("params", jsonObject2);
        }
        return jsonObject;
    }
}
