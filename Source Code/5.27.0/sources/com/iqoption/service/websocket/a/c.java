package com.iqoption.service.websocket.a;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.common.util.concurrent.aa;
import com.google.gson.JsonObject;
import com.iqoption.mobbtech.connect.request.a.a.b;
import com.iqoption.util.w;
import java.util.Map;

/* compiled from: SendMessageIQBusRequest */
class c extends a {
    c(String str, Map<String, Object> map) {
        super("sendMessage", str, map, 15000);
    }

    c(b bVar, aa aaVar, String str, Map<String, Object> map) {
        super("sendMessage", bVar, aaVar, str, (Map) map, 15000);
    }

    c(b bVar, aa aaVar, String str, JsonObject jsonObject) {
        super("sendMessage", bVar, aaVar, str, jsonObject, 15000);
    }

    public JsonObject aTH() {
        String str;
        JsonObject jsonObject = new JsonObject();
        if (TextUtils.isEmpty(this.auN)) {
            str = this.bgx;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.auN);
            stringBuilder.append(".");
            stringBuilder.append(this.bgx);
            str = stringBuilder.toString();
        }
        jsonObject.addProperty(ConditionalUserProperty.NAME, str);
        jsonObject.addProperty("version", this.version);
        String str2 = "body";
        if (this.dIx != null) {
            jsonObject.add(str2, this.dIx);
        } else if (this.auM == null || this.auM.isEmpty()) {
            jsonObject.add(str2, new JsonObject());
        } else {
            jsonObject.add(str2, w.aWM().toJsonTree(this.auM));
        }
        return jsonObject;
    }
}
