package com.iqoption.core.microservices.withdraw.response;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import kotlin.i;

@JsonAdapter(Deserializer.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\b\u0012¢\u0006\u0002\u0010\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/withdraw/response/PayoutFieldType;", "", "(Ljava/lang/String;I)V", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TEXT", "TEXT_AREA", "UNKNOWN", "Deserializer", "core_release"})
/* compiled from: PayoutField.kt */
public enum PayoutFieldType {
    TEXT("text"),
    TEXT_AREA("textarea"),
    UNKNOWN("unknown_type");
    
    private final String value;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/microservices/withdraw/response/PayoutFieldType$Deserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/iqoption/core/microservices/withdraw/response/PayoutFieldType;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "core_release"})
    /* compiled from: PayoutField.kt */
    public static final class Deserializer implements JsonDeserializer<PayoutFieldType> {
        /* renamed from: j */
        public PayoutFieldType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            kotlin.jvm.internal.i.f(jsonElement, "json");
            kotlin.jvm.internal.i.f(type, "typeOfT");
            kotlin.jvm.internal.i.f(jsonDeserializationContext, "context");
            String asString = jsonElement.getAsString();
            for (PayoutFieldType payoutFieldType : PayoutFieldType.values()) {
                if (kotlin.jvm.internal.i.y(payoutFieldType.getValue(), asString)) {
                    break;
                }
            }
            PayoutFieldType payoutFieldType2 = null;
            return payoutFieldType2 != null ? payoutFieldType2 : PayoutFieldType.UNKNOWN;
        }
    }

    private PayoutFieldType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
