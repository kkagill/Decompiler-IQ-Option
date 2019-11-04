package com.iqoption.core.microservices.binaryoptions.response;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;

@JsonAdapter(b.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000f\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0011"}, bng = {"Lcom/iqoption/core/microservices/binaryoptions/response/OptionType;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "getServerValue", "()Ljava/lang/String;", "toString", "UNKNOWN", "TURBO", "BINARY", "Companion", "JsonAdapter", "core_release"})
/* compiled from: OptionType.kt */
public enum OptionType {
    UNKNOWN("_unknown"),
    TURBO("turbo"),
    BINARY("binary");
    
    public static final a Companion = null;
    private final String serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/binaryoptions/response/OptionType$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/binaryoptions/response/OptionType;", "value", "", "core_release"})
    /* compiled from: OptionType.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final OptionType fromServerValue(String str) {
            if (str == null) {
                return OptionType.UNKNOWN;
            }
            Enum enumR = OptionType.UNKNOWN;
            for (OptionType optionType : OptionType.values()) {
                if (kotlin.jvm.internal.i.y(optionType.getServerValue(), str)) {
                    break;
                }
            }
            OptionType optionType2 = null;
            Enum enumR2 = optionType2;
            if (enumR2 == null) {
                enumR2 = enumR;
            }
            return (OptionType) enumR2;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/binaryoptions/response/OptionType$JsonAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/binaryoptions/response/OptionType;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "core_release"})
    /* compiled from: OptionType.kt */
    public static final class b extends TypeAdapter<OptionType> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, OptionType optionType) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            if (optionType == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(optionType.getServerValue());
            }
        }

        /* renamed from: s */
        public OptionType read(JsonReader jsonReader) {
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            if (jsonReader.peek() != JsonToken.NULL) {
                return OptionType.Companion.fromServerValue(jsonReader.nextString());
            }
            jsonReader.skipValue();
            return OptionType.UNKNOWN;
        }
    }

    public static final OptionType fromServerValue(String str) {
        return Companion.fromServerValue(str);
    }

    private OptionType(String str) {
        this.serverValue = str;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        Companion = new a();
    }

    public final InstrumentType getInstrumentType() {
        int i = a.aob[ordinal()];
        if (i == 1) {
            return InstrumentType.TURBO_INSTRUMENT;
        }
        if (i != 2) {
            return InstrumentType.UNKNOWN;
        }
        return InstrumentType.BINARY_INSTRUMENT;
    }

    public String toString() {
        return this.serverValue;
    }
}
