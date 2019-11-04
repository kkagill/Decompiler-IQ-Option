package com.iqoption.core.microservices.risks.response.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J`\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020\u0004HÖ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0004HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016¨\u00060"}, bng = {"Lcom/iqoption/core/microservices/risks/response/commission/CommissionData;", "Landroid/os/Parcelable;", "()V", "activeId", "", "value", "valueVipDiff", "openFixed", "", "openPercent", "buy", "sell", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getActiveId", "()I", "getBuy", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getOpenFixed", "getOpenPercent", "getSell", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValueVipDiff", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/iqoption/core/microservices/risks/response/commission/CommissionData;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "core_release"})
/* compiled from: CommissionData.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new b();
    private static final a byk = new a();
    public static final a byl = new a();
    @SerializedName("active_id")
    private final int activeId;
    @SerializedName("value")
    private final Integer bye;
    @SerializedName("value_vip_diff")
    private final Integer byf;
    @SerializedName("open_fixed")
    private final Double byg;
    @SerializedName("open_percent")
    private final Double byh;
    @SerializedName("buy")
    private final Double byi;
    @SerializedName("sell")
    private final Double byj;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/risks/response/commission/CommissionData$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/microservices/risks/response/commission/CommissionData;", "getEMPTY", "()Lcom/iqoption/core/microservices/risks/response/commission/CommissionData;", "core_release"})
    /* compiled from: CommissionData.kt */
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
            return new a(parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
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
                if (!((this.activeId == aVar.activeId ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bye, aVar.bye) && kotlin.jvm.internal.i.y(this.byf, aVar.byf) && kotlin.jvm.internal.i.y(this.byg, aVar.byg) && kotlin.jvm.internal.i.y(this.byh, aVar.byh) && kotlin.jvm.internal.i.y(this.byi, aVar.byi) && kotlin.jvm.internal.i.y(this.byj, aVar.byj))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.activeId * 31;
        Integer num = this.bye;
        int i2 = 0;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.byf;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        Double d = this.byg;
        i = (i + (d != null ? d.hashCode() : 0)) * 31;
        d = this.byh;
        i = (i + (d != null ? d.hashCode() : 0)) * 31;
        d = this.byi;
        i = (i + (d != null ? d.hashCode() : 0)) * 31;
        d = this.byj;
        if (d != null) {
            i2 = d.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CommissionData(activeId=");
        stringBuilder.append(this.activeId);
        stringBuilder.append(", value=");
        stringBuilder.append(this.bye);
        stringBuilder.append(", valueVipDiff=");
        stringBuilder.append(this.byf);
        stringBuilder.append(", openFixed=");
        stringBuilder.append(this.byg);
        stringBuilder.append(", openPercent=");
        stringBuilder.append(this.byh);
        stringBuilder.append(", buy=");
        stringBuilder.append(this.byi);
        stringBuilder.append(", sell=");
        stringBuilder.append(this.byj);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeInt(this.activeId);
        Integer num = this.bye;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        num = this.byf;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Double d = this.byg;
        if (d != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        } else {
            parcel.writeInt(0);
        }
        d = this.byh;
        if (d != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        } else {
            parcel.writeInt(0);
        }
        d = this.byi;
        if (d != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        } else {
            parcel.writeInt(0);
        }
        d = this.byj;
        if (d != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
            return;
        }
        parcel.writeInt(0);
    }

    public a(int i, Integer num, Integer num2, Double d, Double d2, Double d3, Double d4) {
        this.activeId = i;
        this.bye = num;
        this.byf = num2;
        this.byg = d;
        this.byh = d2;
        this.byi = d3;
        this.byj = d4;
    }

    public final int getActiveId() {
        return this.activeId;
    }

    public /* synthetic */ a(int i, Integer num, Integer num2, Double d, Double d2, Double d3, Double d4, int i2, f fVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            num = (Integer) null;
        }
        Integer num3 = num;
        if ((i2 & 4) != 0) {
            num2 = (Integer) null;
        }
        Integer num4 = num2;
        if ((i2 & 8) != 0) {
            d = (Double) null;
        }
        Double d5 = d;
        if ((i2 & 16) != 0) {
            d2 = (Double) null;
        }
        Double d6 = d2;
        if ((i2 & 32) != 0) {
            d3 = (Double) null;
        }
        Double d7 = d3;
        if ((i2 & 64) != 0) {
            d4 = (Double) null;
        }
        this(i, num3, num4, d5, d6, d7, d4);
    }

    public final Integer ahd() {
        return this.bye;
    }

    public a() {
        this(0, null, null, null, null, null, null, 126, null);
    }
}
