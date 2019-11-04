package com.iqoption.core.microservices.risks.response.overnightfee;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0007J\"\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J%\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0013¢\u0006\u0002\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006'"}, bng = {"Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightFeeData;", "Landroid/os/Parcelable;", "()V", "activeId", "", "fee", "", "Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightDay;", "Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightFeeDayData;", "(ILjava/util/Map;)V", "getActiveId", "()I", "getFee", "()Ljava/util/Map;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "getDayFee", "utcOffset", "day", "dayOffset", "getFeeValue", "", "isLong", "(ILcom/iqoption/core/microservices/risks/response/overnightfee/OvernightDay;Z)Ljava/lang/Double;", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "core_release"})
/* compiled from: OvernightFeeData.kt */
public final class c implements Parcelable {
    public static final Creator CREATOR = new b();
    private static final int byx = ((int) TimeUnit.DAYS.toMillis(1));
    public static final a byy = new a();
    @SerializedName("active_id")
    private final int activeId;
    @SerializedName("fee")
    private final Map<OvernightDay, d> byw;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightFeeData$Companion;", "", "()V", "DAY_MILLIS", "", "getDAY_MILLIS", "()I", "core_release"})
    /* compiled from: OvernightFeeData.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15})
    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            while (readInt2 != 0) {
                linkedHashMap.put((OvernightDay) Enum.valueOf(OvernightDay.class, parcel.readString()), (d) d.CREATOR.createFromParcel(parcel));
                readInt2--;
            }
            return new c(readInt, linkedHashMap);
        }

        public final Object[] newArray(int i) {
            return new c[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if ((this.activeId == cVar.activeId ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.byw, cVar.byw)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.activeId * 31;
        Map map = this.byw;
        return i + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OvernightFeeData(activeId=");
        stringBuilder.append(this.activeId);
        stringBuilder.append(", fee=");
        stringBuilder.append(this.byw);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeInt(this.activeId);
        Map map = this.byw;
        parcel.writeInt(map.size());
        for (Object next : map.entrySet()) {
            parcel.writeString(((OvernightDay) next.getKey()).name());
            ((d) next.getValue()).writeToParcel(parcel, 0);
        }
    }

    public c(int i, Map<OvernightDay, d> map) {
        kotlin.jvm.internal.i.f(map, "fee");
        this.activeId = i;
        this.byw = map;
    }

    public final int getActiveId() {
        return this.activeId;
    }

    public /* synthetic */ c(int i, Map map, int i2, f fVar) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            map = af.emptyMap();
        }
        this(i, map);
    }

    public c() {
        this(-1, null, 2, null);
    }

    public final d a(int i, OvernightDay overnightDay) {
        kotlin.jvm.internal.i.f(overnightDay, "day");
        return a(i, overnightDay, 0);
    }

    public final Double a(int i, OvernightDay overnightDay, boolean z) {
        kotlin.jvm.internal.i.f(overnightDay, "day");
        d a = a(i, overnightDay);
        if (a == null) {
            return null;
        }
        if (z) {
            return Double.valueOf(a.ahn());
        }
        return Double.valueOf(a.aho());
    }

    private final d a(int i, OvernightDay overnightDay, int i2) {
        d dVar = (d) this.byw.get(overnightDay);
        if (dVar == null) {
            if (i2 == 0) {
                d a = a(i, overnightDay.next(), byx);
                if (a != null) {
                    return a;
                }
                d a2 = a(i, overnightDay.prev(), -byx);
                if (a2 != null) {
                    return a2;
                }
            }
            return null;
        }
        long time = (dVar.getTime() + ((long) i)) + ((long) i2);
        if (i2 != 0) {
            long j = (long) byx;
            if (0 <= time && j > time) {
                return dVar;
            }
            return null;
        }
        if (time < 0) {
            i2 = byx;
            overnightDay = overnightDay.next();
        } else {
            i2 = byx;
            if (time < ((long) i2)) {
                return dVar;
            }
            i2 = -i2;
            overnightDay = overnightDay.prev();
        }
        return a(i, overnightDay, i2);
    }
}
