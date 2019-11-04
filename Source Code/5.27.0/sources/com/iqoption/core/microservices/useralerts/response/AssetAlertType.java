package com.iqoption.core.microservices.useralerts.response;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.iqoption.dto.entity.position.PendingOrderWrapper;
import kotlin.i;

@JsonAdapter(a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/microservices/useralerts/response/AssetAlertType;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "PRICE", "CHANGE_HOUR", "CHANGE_DAY", "TRADERS_MOOD", "Adapter", "Companion", "core_release"})
/* compiled from: AssetAlertType.kt */
public enum AssetAlertType {
    UNKNOWN("unknown"),
    PRICE(PendingOrderWrapper.PRICE),
    CHANGE_HOUR("change_hour"),
    CHANGE_DAY("change_day"),
    TRADERS_MOOD("traders_mood");
    
    public static final b Companion = null;
    private final String serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/useralerts/response/AssetAlertType$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertType;", "serverValue", "", "core_release"})
    /* compiled from: AssetAlertType.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final AssetAlertType fromServerValue(String str) {
            Enum enumR = AssetAlertType.UNKNOWN;
            for (AssetAlertType assetAlertType : AssetAlertType.values()) {
                if (kotlin.jvm.internal.i.y(assetAlertType.getServerValue(), str)) {
                    break;
                }
            }
            AssetAlertType assetAlertType2 = null;
            Enum enumR2 = assetAlertType2;
            if (enumR2 == null) {
                enumR2 = enumR;
            }
            return (AssetAlertType) enumR2;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/useralerts/response/AssetAlertType$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertType;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "type", "core_release"})
    /* compiled from: AssetAlertType.kt */
    public static final class a extends TypeAdapter<AssetAlertType> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, AssetAlertType assetAlertType) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            jsonWriter.value(assetAlertType != null ? assetAlertType.getServerValue() : null);
        }

        /* renamed from: aj */
        public AssetAlertType read(JsonReader jsonReader) {
            Object nextString;
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            AssetAlertType assetAlertType = null;
            if (jsonReader.peek() != JsonToken.NULL) {
                nextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
                nextString = null;
            }
            Enum enumR = AssetAlertType.UNKNOWN;
            for (AssetAlertType assetAlertType2 : AssetAlertType.values()) {
                if (kotlin.jvm.internal.i.y(assetAlertType2.getServerValue(), nextString)) {
                    assetAlertType = assetAlertType2;
                    break;
                }
            }
            Enum enumR2 = assetAlertType;
            if (enumR2 == null) {
                enumR2 = enumR;
            }
            return (AssetAlertType) enumR2;
        }
    }

    public static final AssetAlertType fromServerValue(String str) {
        return Companion.fromServerValue(str);
    }

    private AssetAlertType(String str) {
        this.serverValue = str;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        Companion = new b();
    }
}
