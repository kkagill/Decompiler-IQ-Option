package com.iqoption.mobbtech.connect.response.options;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.iqoption.util.w;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

public final class OpenOptionGroupDeserializer implements JsonDeserializer<b> {
    private static final String TAG = "com.iqoption.mobbtech.connect.response.options.OpenOptionGroupDeserializer";

    /* renamed from: p */
    public b deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        String str = "options";
        b bVar = (b) w.aWM().fromJson(jsonElement, type);
        try {
            if (jsonElement.getAsJsonObject().has(str)) {
                jsonElement = jsonElement.getAsJsonObject().get(str);
                if (jsonElement.isJsonArray()) {
                    bVar.A(h(jsonElement.getAsJsonArray()));
                }
            }
        } catch (Exception unused) {
        }
        return bVar;
    }

    private Collection<c> h(JsonArray jsonArray) {
        return (Collection) w.aWL().fromJson((JsonElement) jsonArray, new TypeToken<List<c>>() {
        }.getType());
    }
}
