package com.iqoption.core.microservices.popupserver.response;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.i;

@JsonAdapter(a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\r\u000eB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/microservices/popupserver/response/PopupFormat;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NPS", "WHATS_NEW", "NEW_BAKS_MOBILE", "MOBILE_TOAST", "NEW_YEAR", "UNKNOWN", "Adapter", "Companion", "core_release"})
/* compiled from: PopupFormat.kt */
public enum PopupFormat {
    NPS("nps"),
    WHATS_NEW("whats-new-mobile"),
    NEW_BAKS_MOBILE("new-banks-mobile"),
    MOBILE_TOAST("mobile-toast"),
    NEW_YEAR("nps-new-year-2019"),
    UNKNOWN("_UNKNOWN");
    
    public static final b Companion = null;
    private final String value;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/popupserver/response/PopupFormat$Companion;", "", "()V", "from", "Lcom/iqoption/core/microservices/popupserver/response/PopupFormat;", "value", "", "core_release"})
    /* compiled from: PopupFormat.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final PopupFormat from(String str) {
            for (PopupFormat popupFormat : PopupFormat.values()) {
                if (u.v(popupFormat.getValue(), str, true)) {
                    break;
                }
            }
            PopupFormat popupFormat2 = null;
            return popupFormat2 != null ? popupFormat2 : PopupFormat.UNKNOWN;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/popupserver/response/PopupFormat$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/popupserver/response/PopupFormat;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "status", "core_release"})
    /* compiled from: PopupFormat.kt */
    public static final class a extends TypeAdapter<PopupFormat> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, PopupFormat popupFormat) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            jsonWriter.jsonValue(popupFormat != null ? popupFormat.getValue() : null);
        }

        /* renamed from: Q */
        public PopupFormat read(JsonReader jsonReader) {
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            return PopupFormat.Companion.from(jsonReader.nextString());
        }
    }

    public static final PopupFormat from(String str) {
        return Companion.from(str);
    }

    private PopupFormat(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        Companion = new b();
    }
}
