package com.iqoption.core.microservices.tradingengine.response.position;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.iqoption.dto.entity.position.PendingOrderWrapper;
import kotlin.i;

@JsonAdapter(nullSafe = false, value = b.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/TPSLKind;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "PRICE", "PERCENT", "DIFF", "Companion", "JsonAdapter", "core_release"})
/* compiled from: TPSLKind.kt */
public enum TPSLKind {
    UNKNOWN("_unknown"),
    PRICE(PendingOrderWrapper.PRICE),
    PERCENT("percent"),
    DIFF("diff");
    
    public static final a Companion = null;
    private final String serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/TPSLKind$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/tradingengine/response/position/TPSLKind;", "value", "", "core_release"})
    /* compiled from: TPSLKind.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final TPSLKind fromServerValue(String str) {
            if (str == null) {
                return TPSLKind.UNKNOWN;
            }
            Enum enumR = TPSLKind.UNKNOWN;
            for (TPSLKind tPSLKind : TPSLKind.values()) {
                if (kotlin.jvm.internal.i.y(tPSLKind.getServerValue(), str)) {
                    break;
                }
            }
            TPSLKind tPSLKind2 = null;
            Enum enumR2 = tPSLKind2;
            if (enumR2 == null) {
                enumR2 = enumR;
            }
            return (TPSLKind) enumR2;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/TPSLKind$JsonAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/tradingengine/response/position/TPSLKind;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "core_release"})
    /* compiled from: TPSLKind.kt */
    public static final class b extends TypeAdapter<TPSLKind> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, TPSLKind tPSLKind) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            if (tPSLKind != null) {
                jsonWriter.value(tPSLKind.getServerValue());
            } else {
                jsonWriter.nullValue();
            }
        }

        /* renamed from: ad */
        public TPSLKind read(JsonReader jsonReader) {
            String nextString;
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            a aVar = TPSLKind.Companion;
            if (jsonReader.peek() != JsonToken.NULL) {
                nextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
                nextString = null;
            }
            return aVar.fromServerValue(nextString);
        }
    }

    public static final TPSLKind fromServerValue(String str) {
        return Companion.fromServerValue(str);
    }

    private TPSLKind(String str) {
        this.serverValue = str;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        Companion = new a();
    }
}
