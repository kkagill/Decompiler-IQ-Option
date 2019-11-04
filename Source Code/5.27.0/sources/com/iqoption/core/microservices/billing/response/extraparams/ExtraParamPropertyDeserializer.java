package com.iqoption.core.microservices.billing.response.extraparams;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamPropertyDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "deserializeProperty", "propertyObject", "Lcom/google/gson/JsonObject;", "Companion", "core_release"})
/* compiled from: ExtraParamPropertyDeserializer.kt */
public final class ExtraParamPropertyDeserializer implements JsonDeserializer<ExtraParamProperty> {
    private static final String TAG = ExtraParamPropertyDeserializer.class.getName();
    public static final a bor = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamPropertyDeserializer$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "core_release"})
    /* compiled from: ExtraParamPropertyDeserializer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public ExtraParamProperty deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        kotlin.jvm.internal.i.f(jsonElement, "json");
        kotlin.jvm.internal.i.f(type, "typeOfT");
        kotlin.jvm.internal.i.f(jsonDeserializationContext, "context");
        try {
            return b(jsonElement.getAsJsonObject(), jsonDeserializationContext);
        } catch (Exception unused) {
            return null;
        }
    }

    private final ExtraParamProperty b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonObject != null) {
            String str = "type";
            if (jsonObject.has(str)) {
                JsonElement jsonElement = jsonObject.get(str);
                kotlin.jvm.internal.i.e(jsonElement, "jsonElement");
                String str2 = "enum";
                if (jsonElement.isJsonPrimitive()) {
                    str = jsonElement.getAsString();
                    kotlin.jvm.internal.i.e(str, "jsonElement.asString");
                } else {
                    str = (jsonElement.isJsonObject() && ((JsonObject) jsonElement).has(str2)) ? str2 : "";
                }
                switch (str.hashCode()) {
                    case -906021636:
                        if (str.equals("select")) {
                            return c.bot.c(jsonObject, jsonDeserializationContext);
                        }
                        break;
                    case -891985903:
                        if (str.equals("string")) {
                            return d.box.f(jsonObject);
                        }
                        break;
                    case 3118337:
                        if (str.equals(str2)) {
                            return a.bop.a(jsonObject, jsonDeserializationContext);
                        }
                        break;
                    case 1958052158:
                        if (str.equals("integer")) {
                            return b.boq.e(jsonObject);
                        }
                        break;
                }
            }
        }
        return null;
    }
}
