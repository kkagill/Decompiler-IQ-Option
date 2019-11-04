package com.iqoption.core.microservices.risks.response.overnightfee;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.iqoption.core.util.TimeUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001 B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006!"}, bng = {"Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightFeeDayData;", "Landroid/os/Parcelable;", "()V", "time", "", "long", "", "short", "(JDD)V", "getLong", "()D", "getShort", "getTime", "()J", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "UtcTimeAdapter", "core_release"})
/* compiled from: OvernightFeeDayData.kt */
public final class d implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("short")
    private final double byA;
    @SerializedName("long")
    private final double byz;
    @SerializedName("time")
    @JsonAdapter(b.class)
    private final long time;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new d(parcel.readLong(), parcel.readDouble(), parcel.readDouble());
        }

        public final Object[] newArray(int i) {
            return new d[i];
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightFeeDayData$UtcTimeAdapter;", "Lcom/google/gson/TypeAdapter;", "", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Long;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "Companion", "core_release"})
    /* compiled from: OvernightFeeDayData.kt */
    private static final class b extends TypeAdapter<Long> {
        private static final SimpleDateFormat byB;
        public static final a byC = new a();

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightFeeDayData$UtcTimeAdapter$Companion;", "", "()V", "utcFormat", "Ljava/text/SimpleDateFormat;", "core_release"})
        /* compiled from: OvernightFeeDayData.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }
        }

        public /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
            a(jsonWriter, ((Number) obj).longValue());
        }

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.US);
            simpleDateFormat.setTimeZone(TimeUtil.bRM.anJ());
            byB = simpleDateFormat;
        }

        public void a(JsonWriter jsonWriter, long j) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            jsonWriter.value(byB.format(Long.valueOf(j)));
        }

        /* renamed from: t */
        public Long read(JsonReader jsonReader) {
            long time;
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            if (jsonReader.peek() != JsonToken.NULL) {
                Date parse = byB.parse(jsonReader.nextString());
                kotlin.jvm.internal.i.e(parse, "utcFormat.parse(reader.nextString())");
                time = parse.getTime();
            } else {
                jsonReader.skipValue();
                time = 0;
            }
            return Long.valueOf(time);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!((this.time == dVar.time ? 1 : null) != null && Double.compare(this.byz, dVar.byz) == 0 && Double.compare(this.byA, dVar.byA) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.time;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.byz);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.byA);
        return i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OvernightFeeDayData(time=");
        stringBuilder.append(this.time);
        stringBuilder.append(", long=");
        stringBuilder.append(this.byz);
        stringBuilder.append(", short=");
        stringBuilder.append(this.byA);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.time);
        parcel.writeDouble(this.byz);
        parcel.writeDouble(this.byA);
    }

    public d(long j, double d, double d2) {
        this.time = j;
        this.byz = d;
        this.byA = d2;
    }

    public final long getTime() {
        return this.time;
    }

    public final double ahn() {
        return this.byz;
    }

    public /* synthetic */ d(long j, double d, double d2, int i, f fVar) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            d = 0.0d;
        }
        this(j2, d, (i & 4) != 0 ? 0.0d : d2);
    }

    public final double aho() {
        return this.byA;
    }

    public d() {
        this(0, 0.0d, 0.0d, 6, null);
    }
}
