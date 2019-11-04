package com.iqoption.core.microservices.billing.verification.response;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import kotlin.i;

@JsonAdapter(Deserializer.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, bng = {"Lcom/iqoption/core/microservices/billing/verification/response/DeclineReason;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CARD_IS_NOT_SIGNED", "THERE_IS_NO_BACKSIDE", "NO_FRONT_SIDE", "BLACK_AND_WHITE_COPY", "WRONG_CARD", "COPY_IS_BLURRY", "INFO_IS_HIDDEN", "ANOTHER_REASON", "UNKNOWN", "Deserializer", "core_release"})
/* compiled from: VerifyCard.kt */
public enum DeclineReason {
    CARD_IS_NOT_SIGNED(r2),
    THERE_IS_NO_BACKSIDE(r2),
    NO_FRONT_SIDE(r2),
    BLACK_AND_WHITE_COPY(r2),
    WRONG_CARD(r2),
    COPY_IS_BLURRY(r2),
    INFO_IS_HIDDEN(r2),
    ANOTHER_REASON("ANOTHER_REASON"),
    UNKNOWN("UNKNOWN");
    
    private final String value;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/microservices/billing/verification/response/DeclineReason$Deserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/iqoption/core/microservices/billing/verification/response/DeclineReason;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "core_release"})
    /* compiled from: VerifyCard.kt */
    public static final class Deserializer implements JsonDeserializer<DeclineReason> {
        /* renamed from: b */
        public DeclineReason deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            kotlin.jvm.internal.i.f(jsonElement, "json");
            kotlin.jvm.internal.i.f(type, "typeOfT");
            kotlin.jvm.internal.i.f(jsonDeserializationContext, "context");
            String asString = jsonElement.getAsString();
            for (DeclineReason declineReason : DeclineReason.values()) {
                if (kotlin.jvm.internal.i.y(declineReason.getValue(), asString)) {
                    break;
                }
            }
            DeclineReason declineReason2 = null;
            return declineReason2 != null ? declineReason2 : DeclineReason.UNKNOWN;
        }
    }

    private DeclineReason(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
