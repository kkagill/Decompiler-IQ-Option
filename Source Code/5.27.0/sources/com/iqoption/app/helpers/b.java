package com.iqoption.app.helpers;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.iqoption.app.managers.feature.c;
import com.iqoption.core.microservices.features.a.a;

/* compiled from: HighFrequencyHelper */
public final class b {
    private static a atw = c.Iw().ei("hi-freq");
    private static JsonObject atx;
    private static Integer subType;

    public static boolean isEnabled() {
        a aVar = atw;
        return (aVar == null || aVar.getStatus().equalsIgnoreCase("disabled")) ? false : true;
    }

    public static int GK() {
        if (!isEnabled()) {
            return 1;
        }
        if (subType == null) {
            GL();
            JsonObject jsonObject = atx;
            if (jsonObject == null) {
                subType = Integer.valueOf(1);
            } else {
                subType = Integer.valueOf(jsonObject.get("subtype").getAsInt());
            }
        }
        return subType.intValue();
    }

    private static void GL() {
        JsonElement ady = atw.ady();
        if (ady.isJsonObject()) {
            ady = ady.getAsJsonObject().get(atw.getStatus());
            if (ady.isJsonObject()) {
                atx = ady.getAsJsonObject();
            }
        }
    }
}
