package com.iqoption.mobbtech.connect.response.options;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.iqoption.util.w;
import java.lang.reflect.Type;

public final class OpenOptionGroupSerializer implements JsonSerializer<b> {
    private static final String TAG = "com.iqoption.mobbtech.connect.response.options.OpenOptionGroupSerializer";

    /* renamed from: a */
    public JsonElement serialize(b bVar, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonElement toJsonTree = w.aWM().toJsonTree(bVar);
        try {
            JsonElement toJsonTree2 = w.aWM().toJsonTree(bVar.aPX());
            if (toJsonTree2 != null) {
                toJsonTree.getAsJsonObject().add("options", toJsonTree2);
            }
        } catch (Exception unused) {
        }
        return toJsonTree;
    }
}
