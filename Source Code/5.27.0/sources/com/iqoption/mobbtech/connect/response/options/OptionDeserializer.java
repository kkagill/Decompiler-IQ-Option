package com.iqoption.mobbtech.connect.response.options;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.dto.entity.position.PositionAndOrder;
import com.iqoption.util.w;
import java.lang.reflect.Type;

public class OptionDeserializer implements JsonDeserializer<c> {
    private static final String TAG = "com.iqoption.mobbtech.connect.response.options.OptionDeserializer";

    /* renamed from: q */
    public c deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            if (jsonElement.isJsonObject()) {
                return k(jsonElement.getAsJsonObject());
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private c k(JsonObject jsonObject) {
        if (jsonObject.has("orders")) {
            return (c) w.aWM().fromJson((JsonElement) jsonObject, PositionAndOrder.class);
        }
        if (jsonObject.has("instrument_id")) {
            return (c) w.aWM().fromJson((JsonElement) jsonObject, Position.class);
        }
        return (c) w.aWM().fromJson((JsonElement) jsonObject, c.class);
    }
}
