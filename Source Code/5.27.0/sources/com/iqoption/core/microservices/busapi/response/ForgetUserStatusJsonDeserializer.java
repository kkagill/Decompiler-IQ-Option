package com.iqoption.core.microservices.busapi.response;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/microservices/busapi/response/ForgetUserStatusJsonDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/iqoption/core/microservices/busapi/response/ForgetUserStatus;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "core_release"})
/* compiled from: ForgetUserStatusJsonDeserializer.kt */
public final class ForgetUserStatusJsonDeserializer implements JsonDeserializer<ForgetUserStatus> {
    /* renamed from: d */
    public ForgetUserStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement != null) {
            String asString = jsonElement.getAsString();
            if (asString != null) {
                Enum enumR = ForgetUserStatus.UNKNOWN;
                for (ForgetUserStatus forgetUserStatus : ForgetUserStatus.values()) {
                    if (kotlin.jvm.internal.i.y(forgetUserStatus.getServerValue(), asString)) {
                        break;
                    }
                }
                ForgetUserStatus forgetUserStatus2 = null;
                Enum enumR2 = forgetUserStatus2;
                if (enumR2 == null) {
                    enumR2 = enumR;
                }
                ForgetUserStatus forgetUserStatus3 = (ForgetUserStatus) enumR2;
                if (forgetUserStatus3 != null) {
                    return forgetUserStatus3;
                }
            }
        }
        return ForgetUserStatus.UNKNOWN;
    }
}
