package com.iqoption.core.microservices.useralerts.response;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, bng = {"Lcom/iqoption/core/microservices/useralerts/response/AssetAlertChanged;", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "()V", "reason", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertChanged$Reason;", "(Lcom/iqoption/core/microservices/useralerts/response/AssetAlertChanged$Reason;)V", "getReason", "()Lcom/iqoption/core/microservices/useralerts/response/AssetAlertChanged$Reason;", "Reason", "core_release"})
/* compiled from: AssetAlertChanged.kt */
public final class AssetAlertChanged extends a {
    @SerializedName("reason")
    private final Reason bDd;

    @JsonAdapter(a.class)
    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/useralerts/response/AssetAlertChanged$Reason;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "CREATED", "UPDATED", "DELETED", "Adapter", "core_release"})
    /* compiled from: AssetAlertChanged.kt */
    public enum Reason {
        UNKNOWN("unknown"),
        CREATED("created"),
        UPDATED("updated"),
        DELETED("deleted");
        
        private final String serverValue;

        @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/useralerts/response/AssetAlertChanged$Reason$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertChanged$Reason;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "type", "core_release"})
        /* compiled from: AssetAlertChanged.kt */
        public static final class a extends TypeAdapter<Reason> {
            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Reason reason) {
                kotlin.jvm.internal.i.f(jsonWriter, "out");
                jsonWriter.value(reason != null ? reason.getServerValue() : null);
            }

            /* renamed from: ai */
            public Reason read(JsonReader jsonReader) {
                Object nextString;
                kotlin.jvm.internal.i.f(jsonReader, "reader");
                Reason reason = null;
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextString = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                    nextString = null;
                }
                Enum enumR = Reason.UNKNOWN;
                for (Reason reason2 : Reason.values()) {
                    if (kotlin.jvm.internal.i.y(reason2.getServerValue(), nextString)) {
                        reason = reason2;
                        break;
                    }
                }
                Enum enumR2 = reason;
                if (enumR2 == null) {
                    enumR2 = enumR;
                }
                return (Reason) enumR2;
            }
        }

        private Reason(String str) {
            this.serverValue = str;
        }

        public final String getServerValue() {
            return this.serverValue;
        }
    }

    public final Reason aje() {
        return this.bDd;
    }

    public AssetAlertChanged(Reason reason) {
        kotlin.jvm.internal.i.f(reason, "reason");
        this.bDd = reason;
    }

    public AssetAlertChanged() {
        this(Reason.UNKNOWN);
    }
}
