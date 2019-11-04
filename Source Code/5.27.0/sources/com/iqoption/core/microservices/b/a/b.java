package com.iqoption.core.microservices.b.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.plus.PlusShare;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J_\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\t\u0010#\u001a\u00020\rHÖ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\rHÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006/"}, bng = {"Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEventInfo;", "Landroid/os/Parcelable;", "id", "", "actual", "", "previous", "forecast", "period", "description", "info", "assetIds", "", "", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getActual", "()Ljava/lang/String;", "getAssetIds", "()Ljava/util/List;", "getDescription", "getForecast", "getId", "()J", "getInfo", "getPeriod", "getPrevious", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: CalendarEventInfo.kt */
public final class b implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("actual")
    private final String bsP;
    @SerializedName("previous")
    private final String bsQ;
    @SerializedName("forecast")
    private final String bsR;
    @SerializedName("period")
    private final String bsT;
    @SerializedName("assets")
    private final List<Integer> bsU;
    @SerializedName("description")
    private final String description;
    @SerializedName("id")
    private final long id;
    @SerializedName("info")
    private final String info;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
                readInt--;
            }
            return new b(readLong, readString, readString2, readString3, readString4, readString5, readString6, arrayList);
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
                if (!((this.id == bVar.id ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bsP, bVar.bsP) && kotlin.jvm.internal.i.y(this.bsQ, bVar.bsQ) && kotlin.jvm.internal.i.y(this.bsR, bVar.bsR) && kotlin.jvm.internal.i.y(this.bsT, bVar.bsT) && kotlin.jvm.internal.i.y(this.description, bVar.description) && kotlin.jvm.internal.i.y(this.info, bVar.info) && kotlin.jvm.internal.i.y(this.bsU, bVar.bsU))) {
                    return false;
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
        str = this.bsT;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.description;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.info;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.bsU;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CalendarEventInfo(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", actual=");
        stringBuilder.append(this.bsP);
        stringBuilder.append(", previous=");
        stringBuilder.append(this.bsQ);
        stringBuilder.append(", forecast=");
        stringBuilder.append(this.bsR);
        stringBuilder.append(", period=");
        stringBuilder.append(this.bsT);
        stringBuilder.append(", description=");
        stringBuilder.append(this.description);
        stringBuilder.append(", info=");
        stringBuilder.append(this.info);
        stringBuilder.append(", assetIds=");
        stringBuilder.append(this.bsU);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.bsP);
        parcel.writeString(this.bsQ);
        parcel.writeString(this.bsR);
        parcel.writeString(this.bsT);
        parcel.writeString(this.description);
        parcel.writeString(this.info);
        List<Integer> list = this.bsU;
        parcel.writeInt(list.size());
        for (Integer intValue : list) {
            parcel.writeInt(intValue.intValue());
        }
    }

    public b(long j, String str, String str2, String str3, String str4, String str5, String str6, List<Integer> list) {
        kotlin.jvm.internal.i.f(str, "actual");
        kotlin.jvm.internal.i.f(str2, "previous");
        kotlin.jvm.internal.i.f(str3, "forecast");
        kotlin.jvm.internal.i.f(str4, "period");
        kotlin.jvm.internal.i.f(str5, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION);
        kotlin.jvm.internal.i.f(str6, "info");
        kotlin.jvm.internal.i.f(list, "assetIds");
        this.id = j;
        this.bsP = str;
        this.bsQ = str2;
        this.bsR = str3;
        this.bsT = str4;
        this.description = str5;
        this.info = str6;
        this.bsU = list;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getInfo() {
        return this.info;
    }

    public final List<Integer> adw() {
        return this.bsU;
    }
}
