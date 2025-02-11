package com.iqoption.core.microservices.billing.response.deposit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.annotations.SerializedName;
import kotlin.i;
import kotlin.jvm.internal.g;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0002\u0010\u0018JN\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\u0006\u0010\"\u001a\u00020\tJ\u0006\u0010#\u001a\u00020\tJ\t\u0010$\u001a\u00020\u001dHÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001dHÖ\u0001R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006+"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "Landroid/os/Parcelable;", "id", "", "mask", "", "name", "symbol", "_minDep", "", "_maxDep", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "Ljava/lang/Double;", "getId", "()J", "getMask", "()Ljava/lang/String;", "getName", "getSymbol", "component1", "component2", "component3", "component4", "component5", "()Ljava/lang/Double;", "component6", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "describeContents", "", "equals", "", "other", "", "getMaxDep", "getMinDep", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: CurrencyBilling.kt */
public final class d implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("min_dep")
    private final Double bnE;
    @SerializedName("max_dep")
    private final Double bnF;
    @SerializedName("id")
    private final long id;
    @SerializedName("mask")
    private final String mask;
    @SerializedName("name")
    private final String name;
    @SerializedName("symbol")
    private final String symbol;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new d(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        public final Object[] newArray(int i) {
            return new d[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!((this.id == dVar.id ? 1 : null) != null && kotlin.jvm.internal.i.y(this.mask, dVar.mask) && kotlin.jvm.internal.i.y(this.name, dVar.name) && kotlin.jvm.internal.i.y(this.symbol, dVar.symbol) && kotlin.jvm.internal.i.y(this.bnE, dVar.bnE) && kotlin.jvm.internal.i.y(this.bnF, dVar.bnF))) {
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
        String str = this.mask;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.name;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.symbol;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        Double d = this.bnE;
        i = (i + (d != null ? d.hashCode() : 0)) * 31;
        d = this.bnF;
        if (d != null) {
            i2 = d.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CurrencyBilling(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", mask=");
        stringBuilder.append(this.mask);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", symbol=");
        stringBuilder.append(this.symbol);
        stringBuilder.append(", _minDep=");
        stringBuilder.append(this.bnE);
        stringBuilder.append(", _maxDep=");
        stringBuilder.append(this.bnF);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.mask);
        parcel.writeString(this.name);
        parcel.writeString(this.symbol);
        Double d = this.bnE;
        if (d != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        } else {
            parcel.writeInt(0);
        }
        d = this.bnF;
        if (d != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
            return;
        }
        parcel.writeInt(0);
    }

    public d(long j, String str, String str2, String str3, Double d, Double d2) {
        kotlin.jvm.internal.i.f(str, "mask");
        kotlin.jvm.internal.i.f(str2, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str3, "symbol");
        this.id = j;
        this.mask = str;
        this.name = str2;
        this.symbol = str3;
        this.bnE = d;
        this.bnF = d2;
    }

    public final long getId() {
        return this.id;
    }

    public final String getMask() {
        return this.mask;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final double aau() {
        Double d = this.bnE;
        return d != null ? d.doubleValue() : 0.0d;
    }

    public final double aav() {
        Double d = this.bnF;
        return d != null ? d.doubleValue() : g.eWa.bnF();
    }
}
