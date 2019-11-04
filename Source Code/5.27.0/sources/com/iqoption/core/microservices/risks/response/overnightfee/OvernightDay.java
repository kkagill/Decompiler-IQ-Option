package com.iqoption.core.microservices.risks.response.overnightfee;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.iqoption.core.util.TimeUtil;
import kotlin.i;

@JsonAdapter(a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0014\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\u0000H\u0016J\b\u0010\n\u001a\u00020\u0000H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0016"}, bng = {"Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightDay;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "convertToCalendarDay", "", "next", "prev", "toString", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN", "UNKNOWN", "Adapter", "Companion", "core_release"})
/* compiled from: OvernightDay.kt */
public enum OvernightDay {
    TUE("tue"),
    WED("wed"),
    THU("thu"),
    FRI("fri"),
    SAT("sat");
    
    public static final b Companion = null;
    private final String serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightDay$Companion;", "", "()V", "fromCalendarDay", "Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightDay;", "calendarDay", "", "today", "core_release"})
    /* compiled from: OvernightDay.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final OvernightDay today() {
            return eX(TimeUtil.bRM.anO());
        }

        private final OvernightDay eX(int i) {
            switch (i) {
                case 1:
                    return OvernightDay.SUN;
                case 2:
                    return OvernightDay.MON;
                case 3:
                    return OvernightDay.TUE;
                case 4:
                    return OvernightDay.WED;
                case 5:
                    return OvernightDay.THU;
                case 6:
                    return OvernightDay.FRI;
                case 7:
                    return OvernightDay.SAT;
                default:
                    return OvernightDay.UNKNOWN;
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0001H\u0016¨\u0006\u0003"}, bng = {"Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightDay$MON;", "Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightDay;", "prev", "core_release"})
    /* compiled from: OvernightDay.kt */
    static final class MON extends OvernightDay {
        MON(String str, int i) {
            super(str, i, "mon", null);
        }

        public OvernightDay prev() {
            return OvernightDay.SUN;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0001H\u0016¨\u0006\u0003"}, bng = {"Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightDay$SUN;", "Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightDay;", "next", "core_release"})
    /* compiled from: OvernightDay.kt */
    static final class SUN extends OvernightDay {
        SUN(String str, int i) {
            super(str, i, "sun", null);
        }

        public OvernightDay next() {
            return OvernightDay.MON;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0001H\u0016J\b\u0010\u0003\u001a\u00020\u0001H\u0016¨\u0006\u0004"}, bng = {"Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightDay$UNKNOWN;", "Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightDay;", "next", "prev", "core_release"})
    /* compiled from: OvernightDay.kt */
    static final class UNKNOWN extends OvernightDay {
        UNKNOWN(String str, int i) {
            super(str, i, "_unknown", null);
        }

        public OvernightDay next() {
            return this;
        }

        public OvernightDay prev() {
            return this;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightDay$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightDay;", "()V", "fromServerValue", "value", "", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "type", "core_release"})
    /* compiled from: OvernightDay.kt */
    public static final class a extends TypeAdapter<OvernightDay> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, OvernightDay overnightDay) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            jsonWriter.value(overnightDay != null ? overnightDay.getServerValue() : null);
        }

        /* renamed from: S */
        public OvernightDay read(JsonReader jsonReader) {
            String nextString;
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            if (jsonReader.peek() != JsonToken.NULL) {
                nextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
                nextString = null;
            }
            return gP(nextString);
        }

        public final OvernightDay gP(String str) {
            if (str == null) {
                return OvernightDay.UNKNOWN;
            }
            Enum enumR = OvernightDay.UNKNOWN;
            for (OvernightDay overnightDay : OvernightDay.values()) {
                if (kotlin.jvm.internal.i.y(overnightDay.getServerValue(), str)) {
                    break;
                }
            }
            OvernightDay overnightDay2 = null;
            Enum enumR2 = overnightDay2;
            if (enumR2 == null) {
                enumR2 = enumR;
            }
            return (OvernightDay) enumR2;
        }
    }

    public static final OvernightDay today() {
        return Companion.today();
    }

    private OvernightDay(String str) {
        this.serverValue = str;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        Companion = new b();
    }

    public final int convertToCalendarDay() {
        switch (a.aob[ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    public OvernightDay next() {
        OvernightDay[] values = values();
        int ordinal = ordinal() + 1;
        if (ordinal < values.length) {
            return values[ordinal];
        }
        return values[0];
    }

    public OvernightDay prev() {
        OvernightDay[] values = values();
        int ordinal = ordinal() - 1;
        if (ordinal >= 0) {
            return values[ordinal];
        }
        return values[values.length - 1];
    }

    public String toString() {
        return this.serverValue;
    }
}
