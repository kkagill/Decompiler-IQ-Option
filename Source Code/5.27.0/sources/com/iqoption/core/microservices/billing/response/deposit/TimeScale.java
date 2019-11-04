package com.iqoption.core.microservices.billing.response.deposit;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.i;

@JsonAdapter(a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/TimeScale;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "INSTANT", "MINUTES", "HOURS", "DAYS", "UNKNOWN", "Adapter", "Companion", "core_release"})
/* compiled from: TimeScale.kt */
public enum TimeScale {
    INSTANT("instant"),
    MINUTES("minutes"),
    HOURS("hours"),
    DAYS("days"),
    UNKNOWN("_UNKNOWN_TYPE");
    
    public static final b Companion = null;
    private final String serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/TimeScale$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/billing/response/deposit/TimeScale;", "value", "", "core_release"})
    /* compiled from: TimeScale.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final TimeScale fromServerValue(String str) {
            for (TimeScale timeScale : TimeScale.values()) {
                if (u.v(timeScale.getServerValue(), str, true)) {
                    break;
                }
            }
            TimeScale timeScale2 = null;
            return timeScale2 != null ? timeScale2 : TimeScale.UNKNOWN;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/TimeScale$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/billing/response/deposit/TimeScale;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "status", "core_release"})
    /* compiled from: TimeScale.kt */
    public static final class a extends TypeAdapter<TimeScale> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, TimeScale timeScale) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            jsonWriter.jsonValue(timeScale != null ? timeScale.getServerValue() : null);
        }

        /* renamed from: o */
        public TimeScale read(JsonReader jsonReader) {
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            return TimeScale.Companion.fromServerValue(jsonReader.nextString());
        }
    }

    public static final TimeScale fromServerValue(String str) {
        return Companion.fromServerValue(str);
    }

    private TimeScale(String str) {
        this.serverValue = str;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        Companion = new b();
    }
}
