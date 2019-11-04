package com.iqoption.microservice.regulators.response;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import kotlin.i;

@JsonAdapter(nullSafe = false, value = a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\r\u000eB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, bng = {"Lcom/iqoption/microservice/regulators/response/StatusType;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "APPROVED", "DECLINED", "PENDING", "INITIATED", "NEED_ACTION", "UNKNOWN", "Adapter", "Companion", "app_optionXRelease"})
/* compiled from: ProTraderApplicationStatus.kt */
public enum StatusType {
    APPROVED(r2),
    DECLINED(r2),
    PENDING(r2),
    INITIATED(r2),
    NEED_ACTION(r2),
    UNKNOWN("unknown_type");
    
    public static final b Companion = null;
    private final String serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/microservice/regulators/response/StatusType$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/microservice/regulators/response/StatusType;", "value", "", "app_optionXRelease"})
    /* compiled from: ProTraderApplicationStatus.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final StatusType fromServerValue(String str) {
            for (StatusType statusType : StatusType.values()) {
                if (u.v(statusType.getServerValue(), str, true)) {
                    break;
                }
            }
            StatusType statusType2 = null;
            return statusType2 != null ? statusType2 : StatusType.UNKNOWN;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/microservice/regulators/response/StatusType$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/microservice/regulators/response/StatusType;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "status", "app_optionXRelease"})
    /* compiled from: ProTraderApplicationStatus.kt */
    public static final class a extends TypeAdapter<StatusType> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, StatusType statusType) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            jsonWriter.jsonValue(statusType != null ? statusType.getServerValue() : null);
        }

        /* renamed from: al */
        public StatusType read(JsonReader jsonReader) {
            String nextString;
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            if (jsonReader.peek() != JsonToken.NULL) {
                nextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
                nextString = null;
            }
            return StatusType.Companion.fromServerValue(nextString);
        }
    }

    public static final StatusType fromServerValue(String str) {
        return Companion.fromServerValue(str);
    }

    private StatusType(String str) {
        this.serverValue = str;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        Companion = new b();
    }
}
