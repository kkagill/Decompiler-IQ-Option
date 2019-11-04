package com.iqoption.core.microservices.busapi.response;

import androidx.core.app.NotificationCompat;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Type;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001f\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, bng = {"Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicyJsonDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "parseStatus", "", "jsonObject", "Lcom/google/gson/JsonObject;", "key", "", "(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/Boolean;", "core_release"})
/* compiled from: PersonalDataPolicyJsonDeserializer.kt */
public final class PersonalDataPolicyJsonDeserializer implements JsonDeserializer<b> {
    /* renamed from: e */
    public b deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement != null) {
            if (!jsonElement.isJsonObject()) {
                jsonElement = null;
            }
            if (jsonElement != null) {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (asJsonObject != null) {
                    return new b(b(asJsonObject, "is_agreement_accepted"), b(asJsonObject, "is_email_accepted"), b(asJsonObject, "is_push_accepted"), b(asJsonObject, "is_call_accepted"), b(asJsonObject, "is_thirdparty_accepted"));
                }
            }
        }
        return new b();
    }

    private final Boolean b(JsonObject jsonObject, String str) {
        if (jsonObject.has(str)) {
            JsonElement jsonElement = jsonObject.getAsJsonObject(str).get(NotificationCompat.CATEGORY_STATUS);
            if (jsonElement != null && jsonElement.isJsonPrimitive()) {
                JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                kotlin.jvm.internal.i.e(asJsonPrimitive, "value.asJsonPrimitive");
                return Boolean.valueOf(asJsonPrimitive.getAsBoolean());
            }
        }
        return null;
    }
}
