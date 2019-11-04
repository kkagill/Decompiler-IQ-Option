package com.iqoption.core.microservices.popupserver.response;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.i;

@JsonAdapter(a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\r\u000eB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/microservices/popupserver/response/PopupAnchor;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MOBILE_LEGAL_UPDATE", "WITH_ACTION_V1", "TWO_BUTTON_V1", "ONE_BUTTON_V1", "WITHOUT_ACTION_V1", "UNKNOWN", "Adapter", "Companion", "core_release"})
/* compiled from: PopupAnchor.kt */
public enum PopupAnchor {
    MOBILE_LEGAL_UPDATE("MOBILE-LEGAL-UPDATE-V1"),
    WITH_ACTION_V1("with-action-v1"),
    TWO_BUTTON_V1("two-button-v1"),
    ONE_BUTTON_V1("one-button-v1"),
    WITHOUT_ACTION_V1("without-action-v1"),
    UNKNOWN("_UNKNOWN");
    
    public static final b Companion = null;
    private final String value;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/popupserver/response/PopupAnchor$Companion;", "", "()V", "from", "Lcom/iqoption/core/microservices/popupserver/response/PopupAnchor;", "value", "", "core_release"})
    /* compiled from: PopupAnchor.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final PopupAnchor from(String str) {
            for (PopupAnchor popupAnchor : PopupAnchor.values()) {
                if (u.v(popupAnchor.getValue(), str, true)) {
                    break;
                }
            }
            PopupAnchor popupAnchor2 = null;
            return popupAnchor2 != null ? popupAnchor2 : PopupAnchor.UNKNOWN;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/popupserver/response/PopupAnchor$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/popupserver/response/PopupAnchor;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "status", "core_release"})
    /* compiled from: PopupAnchor.kt */
    public static final class a extends TypeAdapter<PopupAnchor> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, PopupAnchor popupAnchor) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            jsonWriter.jsonValue(popupAnchor != null ? popupAnchor.getValue() : null);
        }

        /* renamed from: P */
        public PopupAnchor read(JsonReader jsonReader) {
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            return PopupAnchor.Companion.from(jsonReader.nextString());
        }
    }

    public static final PopupAnchor from(String str) {
        return Companion.from(str);
    }

    private PopupAnchor(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        Companion = new b();
    }
}
