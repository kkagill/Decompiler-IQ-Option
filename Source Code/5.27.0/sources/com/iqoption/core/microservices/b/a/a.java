package com.iqoption.core.microservices.b.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003Jk\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u000bHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u00061"}, bng = {"Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "Landroid/os/Parcelable;", "id", "", "actual", "", "previous", "forecast", "country", "datetime", "importance", "", "info", "name", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;)V", "getActual", "()Ljava/lang/String;", "getCountry", "getDatetime", "()J", "getForecast", "getId", "getImportance", "()I", "getInfo", "getName", "getPrevious", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: CalendarEvent.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("actual")
    private final String bsP;
    @SerializedName("previous")
    private final String bsQ;
    @SerializedName("forecast")
    private final String bsR;
    @SerializedName("datetime")
    private final long bsS;
    @SerializedName("country")
    private final String country;
    @SerializedName("id")
    private final long id;
    @SerializedName("importance")
    private final int importance;
    @SerializedName("info")
    private final String info;
    @SerializedName("name")
    private final String name;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if ((this.id == aVar.id ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bsP, aVar.bsP) && kotlin.jvm.internal.i.y(this.bsQ, aVar.bsQ) && kotlin.jvm.internal.i.y(this.bsR, aVar.bsR) && kotlin.jvm.internal.i.y(this.country, aVar.country)) {
                    if ((this.bsS == aVar.bsS ? 1 : null) != null) {
                        if (!((this.importance == aVar.importance ? 1 : null) != null && kotlin.jvm.internal.i.y(this.info, aVar.info) && kotlin.jvm.internal.i.y(this.name, aVar.name))) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.bsP;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bsQ;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bsR;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.country;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.bsS;
        i = (((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.importance) * 31;
        str = this.info;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.name;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CalendarEvent(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", actual=");
        stringBuilder.append(this.bsP);
        stringBuilder.append(", previous=");
        stringBuilder.append(this.bsQ);
        stringBuilder.append(", forecast=");
        stringBuilder.append(this.bsR);
        stringBuilder.append(", country=");
        stringBuilder.append(this.country);
        stringBuilder.append(", datetime=");
        stringBuilder.append(this.bsS);
        stringBuilder.append(", importance=");
        stringBuilder.append(this.importance);
        stringBuilder.append(", info=");
        stringBuilder.append(this.info);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.bsP);
        parcel.writeString(this.bsQ);
        parcel.writeString(this.bsR);
        parcel.writeString(this.country);
        parcel.writeLong(this.bsS);
        parcel.writeInt(this.importance);
        parcel.writeString(this.info);
        parcel.writeString(this.name);
    }

    public a(long j, String str, String str2, String str3, String str4, long j2, int i, String str5, String str6) {
        kotlin.jvm.internal.i.f(str4, "country");
        kotlin.jvm.internal.i.f(str6, ConditionalUserProperty.NAME);
        this.id = j;
        this.bsP = str;
        this.bsQ = str2;
        this.bsR = str3;
        this.country = str4;
        this.bsS = j2;
        this.importance = i;
        this.info = str5;
        this.name = str6;
    }

    public final long getId() {
        return this.id;
    }

    public final String getActual() {
        return this.bsP;
    }

    public final String adt() {
        return this.bsQ;
    }

    public final String adu() {
        return this.bsR;
    }

    public final String getCountry() {
        return this.country;
    }

    public final long adv() {
        return this.bsS;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final String getName() {
        return this.name;
    }
}
