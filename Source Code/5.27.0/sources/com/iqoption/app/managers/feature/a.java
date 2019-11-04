package com.iqoption.app.managers.feature;

import androidx.annotation.Nullable;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.iqoption.core.util.u;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FeatureTools */
public final class a {
    public static boolean ef(String str) {
        return c.Iw().ej(str);
    }

    public static boolean eg(String str) {
        com.iqoption.core.microservices.features.a.a ei = c.Iw().ei(str);
        if (ei != null) {
            if ("enabled".equals(ei.getStatus())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static String eh(String str) {
        com.iqoption.core.microservices.features.a.a ei = c.Iw().ei(str);
        if (ei == null) {
            return null;
        }
        return ei.getStatus();
    }

    public static boolean Ih() {
        return c.Iw().ep("otn-token");
    }

    public static boolean Ii() {
        return c.Iw().ep("hide-emission") ^ 1;
    }

    public static boolean Ij() {
        return c.Iw().ep("otn-leaderboard");
    }

    public static Double bA(boolean z) {
        com.iqoption.core.microservices.features.a.a ei = c.Iw().ei("first-demo-deal");
        if (!(ei == null || ei.getStatus().equals("disabled"))) {
            JsonElement ady = ei.ady();
            if (ady.isJsonObject()) {
                JsonElement jsonElement = ady.getAsJsonObject().get(ei.getStatus());
                if (jsonElement != null && jsonElement.isJsonObject()) {
                    return Double.valueOf(jsonElement.getAsJsonObject().get(z ? "demo" : "notdemo").getAsDouble());
                }
            }
        }
        return null;
    }

    public static int Ik() {
        com.iqoption.core.microservices.features.a.a ei = c.Iw().ei("first-deal-forex");
        if (!(ei == null || ei.getStatus().equals("disabled"))) {
            JsonElement ady = ei.ady();
            if (ady.isJsonObject()) {
                JsonElement jsonElement = ady.getAsJsonObject().get(ei.getStatus());
                if (jsonElement != null && jsonElement.isJsonObject()) {
                    return jsonElement.getAsJsonObject().get("percent").getAsInt();
                }
            }
        }
        return -1;
    }

    public static Map<Long, Double> Il() {
        com.iqoption.core.microservices.features.a.a ei = c.Iw().ei("fx-min-deal-amount");
        HashMap hashMap = new HashMap();
        if (!(ei == null || ei.getStatus().equals("disabled"))) {
            JsonElement ady = ei.ady();
            if (ady.isJsonArray()) {
                JsonArray asJsonArray = ady.getAsJsonArray();
                for (int i = 0; i < asJsonArray.size(); i++) {
                    JsonObject asJsonObject = asJsonArray.get(i).getAsJsonObject();
                    Long d = u.d(asJsonObject.get("period"));
                    Double c = u.c(asJsonObject.get("min_deal_amount"));
                    if (!(d == null || c == null)) {
                        hashMap.put(Long.valueOf(d.longValue() * 1000), c);
                    }
                }
            }
        }
        return hashMap;
    }
}
