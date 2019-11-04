package com.iqoption.core.microservices.quotes.response;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.iqoption.dto.entity.ActiveQuote;
import kotlin.i;

@JsonAdapter(a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000e\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/microservices/quotes/response/ActivePhase;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "isTradingAvailable", "", "TRADING", "OPENING_AUCTION", "INTRADAY_AUCTION", "CLOSING_AUCTION", "CLOSED", "Adapter", "Companion", "core_release"})
/* compiled from: ActivePhase.kt */
public enum ActivePhase {
    TRADING(ActiveQuote.PHASE_TRADING),
    OPENING_AUCTION(ActiveQuote.PHASE_OPENING_AUCTION),
    INTRADAY_AUCTION(ActiveQuote.PHASE_INTRADAY_AUCTION),
    CLOSING_AUCTION(ActiveQuote.PHASE_CLOSING_AUCTION),
    CLOSED(ActiveQuote.PHASE_CLOSED);
    
    public static final b Companion = null;
    private final String serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/quotes/response/ActivePhase$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/quotes/response/ActivePhase;", "value", "", "core_release"})
    /* compiled from: ActivePhase.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final ActivePhase fromServerValue(String str) {
            for (ActivePhase activePhase : ActivePhase.values()) {
                if (kotlin.jvm.internal.i.y(activePhase.getServerValue(), str)) {
                    break;
                }
            }
            ActivePhase activePhase2 = null;
            activePhase2 = activePhase2;
            return activePhase2 != null ? activePhase2 : ActivePhase.TRADING;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/quotes/response/ActivePhase$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/quotes/response/ActivePhase;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "type", "core_release"})
    /* compiled from: ActivePhase.kt */
    public static final class a extends TypeAdapter<ActivePhase> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, ActivePhase activePhase) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            jsonWriter.value(activePhase != null ? activePhase.getServerValue() : null);
        }

        /* renamed from: R */
        public ActivePhase read(JsonReader jsonReader) {
            String nextString;
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            if (jsonReader.peek() != JsonToken.NULL) {
                nextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
                nextString = null;
            }
            return ActivePhase.Companion.fromServerValue(nextString);
        }
    }

    public static final ActivePhase fromServerValue(String str) {
        return Companion.fromServerValue(str);
    }

    private ActivePhase(String str) {
        this.serverValue = str;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        Companion = new b();
    }

    public final boolean isTradingAvailable() {
        return ((ActivePhase) this) == TRADING;
    }
}
