package com.iqoption.core.microservices.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b8\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0015J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010:\u001a\u00020\nHÆ\u0003J\t\u0010;\u001a\u00020\nHÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\t\u0010>\u001a\u00020\u0005HÆ\u0003J¬\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010@J\t\u0010A\u001a\u00020\bHÖ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020\bHÖ\u0001J\t\u0010G\u001a\u00020\u0005HÖ\u0001J\u0019\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0013\u0010&\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0016\u0010\f\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/¨\u0006M"}, bng = {"Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;", "Landroid/os/Parcelable;", "eventId", "", "name", "", "activeIds", "", "", "actual", "", "previous", "forecast", "date", "updatedAt", "country", "currency", "announceTime", "calendarReference", "fiscalReference", "symbol", "(JLjava/lang/String;Ljava/util/List;Ljava/lang/Double;DDJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActiveIds", "()Ljava/util/List;", "getActual", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAnnounceTime", "()Ljava/lang/String;", "getCalendarReference", "getCountry", "getCurrency", "getDate", "()J", "diff", "getDiff", "()D", "getEventId", "firstActiveId", "getFirstActiveId", "()Ljava/lang/Integer;", "getFiscalReference", "getForecast", "getName", "getPrevious", "getSymbol", "getUpdatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/util/List;Ljava/lang/Double;DDJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: EarningCalendarEvent.kt */
public final class b implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("date")
    private final long aSH;
    @SerializedName("event_id")
    private final long bsF;
    @SerializedName("active_ids")
    private final List<Integer> bsG;
    @SerializedName("actual")
    private final Double bsH;
    @SerializedName("previous")
    private final double bsI;
    @SerializedName("forecast")
    private final double bsJ;
    @SerializedName("updated_at")
    private final Long bsK;
    @SerializedName("announce_time")
    private final String bsL;
    @SerializedName("calendar_reference")
    private final String bsM;
    @SerializedName("fiscal_reference")
    private final String bsN;
    @SerializedName("country")
    private final String country;
    @SerializedName("currency")
    private final String currency;
    @SerializedName("name")
    private final String name;
    @SerializedName("symbol")
    private final String symbol;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
                readInt--;
            }
            return new b(readLong, readString, arrayList, parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readDouble(), parcel.readDouble(), parcel.readLong(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if ((this.bsF == bVar.bsF ? 1 : null) != null && kotlin.jvm.internal.i.y(this.name, bVar.name) && kotlin.jvm.internal.i.y(this.bsG, bVar.bsG) && kotlin.jvm.internal.i.y(this.bsH, bVar.bsH) && Double.compare(this.bsI, bVar.bsI) == 0 && Double.compare(this.bsJ, bVar.bsJ) == 0) {
                    if (!((this.aSH == bVar.aSH ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bsK, bVar.bsK) && kotlin.jvm.internal.i.y(this.country, bVar.country) && kotlin.jvm.internal.i.y(this.currency, bVar.currency) && kotlin.jvm.internal.i.y(this.bsL, bVar.bsL) && kotlin.jvm.internal.i.y(this.bsM, bVar.bsM) && kotlin.jvm.internal.i.y(this.bsN, bVar.bsN) && kotlin.jvm.internal.i.y(this.symbol, bVar.symbol))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.bsF;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.name;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.bsG;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        Double d = this.bsH;
        i = (i + (d != null ? d.hashCode() : 0)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.bsI);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.bsJ);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = this.aSH;
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        Long l = this.bsK;
        i = (i + (l != null ? l.hashCode() : 0)) * 31;
        str = this.country;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.currency;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bsL;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bsM;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bsN;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.symbol;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EarningCalendarEvent(eventId=");
        stringBuilder.append(this.bsF);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", activeIds=");
        stringBuilder.append(this.bsG);
        stringBuilder.append(", actual=");
        stringBuilder.append(this.bsH);
        stringBuilder.append(", previous=");
        stringBuilder.append(this.bsI);
        stringBuilder.append(", forecast=");
        stringBuilder.append(this.bsJ);
        stringBuilder.append(", date=");
        stringBuilder.append(this.aSH);
        stringBuilder.append(", updatedAt=");
        stringBuilder.append(this.bsK);
        stringBuilder.append(", country=");
        stringBuilder.append(this.country);
        stringBuilder.append(", currency=");
        stringBuilder.append(this.currency);
        stringBuilder.append(", announceTime=");
        stringBuilder.append(this.bsL);
        stringBuilder.append(", calendarReference=");
        stringBuilder.append(this.bsM);
        stringBuilder.append(", fiscalReference=");
        stringBuilder.append(this.bsN);
        stringBuilder.append(", symbol=");
        stringBuilder.append(this.symbol);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.bsF);
        parcel.writeString(this.name);
        List<Integer> list = this.bsG;
        parcel.writeInt(list.size());
        for (Integer intValue : list) {
            parcel.writeInt(intValue.intValue());
        }
        Double d = this.bsH;
        if (d != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeDouble(this.bsI);
        parcel.writeDouble(this.bsJ);
        parcel.writeLong(this.aSH);
        Long l = this.bsK;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.country);
        parcel.writeString(this.currency);
        parcel.writeString(this.bsL);
        parcel.writeString(this.bsM);
        parcel.writeString(this.bsN);
        parcel.writeString(this.symbol);
    }

    public b(long j, String str, List<Integer> list, Double d, double d2, double d3, long j2, Long l, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = str;
        List<Integer> list2 = list;
        String str9 = str2;
        String str10 = str3;
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(list, "activeIds");
        kotlin.jvm.internal.i.f(str9, "country");
        kotlin.jvm.internal.i.f(str10, "currency");
        this.bsF = j;
        this.name = str8;
        this.bsG = list2;
        this.bsH = d;
        this.bsI = d2;
        this.bsJ = d3;
        this.aSH = j2;
        this.bsK = l;
        this.country = str9;
        this.currency = str10;
        this.bsL = str4;
        this.bsM = str5;
        this.bsN = str6;
        this.symbol = str7;
    }

    public final long ado() {
        return this.bsF;
    }

    public final String getName() {
        return this.name;
    }

    public final Double adp() {
        return this.bsH;
    }

    public final double adq() {
        return this.bsI;
    }

    public final double adr() {
        return this.bsJ;
    }

    public final long getDate() {
        return this.aSH;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String ads() {
        return this.bsL;
    }

    public final Integer adm() {
        return (Integer) u.bV(this.bsG);
    }

    public final double adn() {
        Double d = this.bsH;
        if (d != null) {
            return this.bsJ - d.doubleValue();
        }
        return this.bsJ - this.bsI;
    }
}
