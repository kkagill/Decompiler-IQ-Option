package com.iqoption.mobbtech.connect.response;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map.Entry;

public class ProfileSaveDataResponseDeserializer implements JsonDeserializer<h> {
    private static final String TAG = "com.iqoption.mobbtech.connect.response.ProfileSaveDataResponseDeserializer";

    /* renamed from: o */
    public h deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            jsonElement = jsonElement.getAsJsonObject();
            boolean asBoolean = jsonElement.get("isSuccessful").getAsBoolean();
            JsonElement jsonElement2 = jsonElement.get("message");
            if (jsonElement2.isJsonArray()) {
                return (h) new Gson().fromJson(jsonElement, h.class);
            }
            h hVar = new h();
            hVar.isSuccessful = Boolean.valueOf(asBoolean);
            hVar.message = new ArrayList();
            for (Entry value : jsonElement2.getAsJsonObject().entrySet()) {
                hVar.message.add(((JsonElement) value.getValue()).getAsString());
            }
            return hVar;
        } catch (Exception unused) {
            return new h();
        }
    }
}
