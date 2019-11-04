package com.iqoption.core.microservices.tradingengine.response.position;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.iqoption.dto.entity.position.Position;
import kotlin.i;

@JsonAdapter(nullSafe = false, value = b.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0011\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0013"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/CloseReason;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "UNKNOWN", "SOLD", "CANCELLED", "EXPIRED", "MARGIN_CALL", "TAKE_PROFIT", "STOP_LOSS", "OVERNIGHT", "CUSTODIAL", "WITHDRAW", "BY_ADMIN", "Companion", "JsonAdapter", "core_release"})
/* compiled from: CloseReason.kt */
public enum CloseReason {
    UNKNOWN("_unknown"),
    SOLD(Position.CLOSE_REASON_DEFAULT),
    CANCELLED("cancelled"),
    EXPIRED(Position.CLOSE_REASON_EXPIRED),
    MARGIN_CALL(Position.CLOSE_REASON_MARGIN_ERASE),
    TAKE_PROFIT(Position.CLOSE_REASON_TAKE_PROFIT),
    STOP_LOSS(Position.CLOSE_REASON_STOP_LOSE),
    OVERNIGHT(Position.CLOSE_REASON_OVERNIGHT),
    CUSTODIAL(Position.CLOSE_REASON_CUSTODIAL),
    WITHDRAW(Position.CLOSE_REASON_WITHDRAW),
    BY_ADMIN("by_admin");
    
    public static final a Companion = null;
    private final String serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/CloseReason$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/tradingengine/response/position/CloseReason;", "value", "", "core_release"})
    /* compiled from: CloseReason.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final CloseReason fromServerValue(String str) {
            if (str == null) {
                return CloseReason.UNKNOWN;
            }
            Enum enumR = CloseReason.UNKNOWN;
            for (CloseReason closeReason : CloseReason.values()) {
                if (kotlin.jvm.internal.i.y(closeReason.serverValue, str)) {
                    break;
                }
            }
            CloseReason closeReason2 = null;
            Enum enumR2 = closeReason2;
            if (enumR2 == null) {
                enumR2 = enumR;
            }
            return (CloseReason) enumR2;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/CloseReason$JsonAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/tradingengine/response/position/CloseReason;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "core_release"})
    /* compiled from: CloseReason.kt */
    public static final class b extends TypeAdapter<CloseReason> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, CloseReason closeReason) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            if (closeReason != null) {
                jsonWriter.value(closeReason.serverValue);
            } else {
                jsonWriter.nullValue();
            }
        }

        /* renamed from: ab */
        public CloseReason read(JsonReader jsonReader) {
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            if (jsonReader.peek() != JsonToken.NULL) {
                return CloseReason.Companion.fromServerValue(jsonReader.nextString());
            }
            jsonReader.skipValue();
            return CloseReason.UNKNOWN;
        }
    }

    public static final CloseReason fromServerValue(String str) {
        return Companion.fromServerValue(str);
    }

    private CloseReason(String str) {
        this.serverValue = str;
    }

    static {
        Companion = new a();
    }

    public String toString() {
        return this.serverValue;
    }
}
