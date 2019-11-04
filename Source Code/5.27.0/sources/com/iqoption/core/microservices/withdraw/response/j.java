package com.iqoption.core.microservices.withdraw.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006$"}, bng = {"Lcom/iqoption/core/microservices/withdraw/response/WithdrawCommissions;", "Landroid/os/Parcelable;", "name", "", "min", "", "max", "percent", "fixed", "(Ljava/lang/String;DDDD)V", "getFixed", "()D", "getMax", "getMin", "getName", "()Ljava/lang/String;", "getPercent", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: WithdrawCommissions.kt */
public final class j implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("min")
    private final double aID;
    @SerializedName("max")
    private final double aIE;
    @SerializedName("percent")
    private final double aug;
    @SerializedName("fixed")
    private final double bEf;
    @SerializedName("name")
    private final String name;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new j(parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        public final Object[] newArray(int i) {
            return new j[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (java.lang.Double.compare(r4.bEf, r5.bEf) == 0) goto L_0x003d;
     */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        if (r4 == r5) goto L_0x003d;
    L_0x0002:
        r0 = r5 instanceof com.iqoption.core.microservices.withdraw.response.j;
        if (r0 == 0) goto L_0x003b;
    L_0x0006:
        r5 = (com.iqoption.core.microservices.withdraw.response.j) r5;
        r0 = r4.name;
        r1 = r5.name;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0012:
        r0 = r4.aID;
        r2 = r5.aID;
        r0 = java.lang.Double.compare(r0, r2);
        if (r0 != 0) goto L_0x003b;
    L_0x001c:
        r0 = r4.aIE;
        r2 = r5.aIE;
        r0 = java.lang.Double.compare(r0, r2);
        if (r0 != 0) goto L_0x003b;
    L_0x0026:
        r0 = r4.aug;
        r2 = r5.aug;
        r0 = java.lang.Double.compare(r0, r2);
        if (r0 != 0) goto L_0x003b;
    L_0x0030:
        r0 = r4.bEf;
        r2 = r5.bEf;
        r5 = java.lang.Double.compare(r0, r2);
        if (r5 != 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003d;
    L_0x003b:
        r5 = 0;
        return r5;
    L_0x003d:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.withdraw.response.j.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.aID);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.aIE);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.aug);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.bEf);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WithdrawCommissions(name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", min=");
        stringBuilder.append(this.aID);
        stringBuilder.append(", max=");
        stringBuilder.append(this.aIE);
        stringBuilder.append(", percent=");
        stringBuilder.append(this.aug);
        stringBuilder.append(", fixed=");
        stringBuilder.append(this.bEf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.name);
        parcel.writeDouble(this.aID);
        parcel.writeDouble(this.aIE);
        parcel.writeDouble(this.aug);
        parcel.writeDouble(this.bEf);
    }

    public j(String str, double d, double d2, double d3, double d4) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        this.name = str;
        this.aID = d;
        this.aIE = d2;
        this.aug = d3;
        this.bEf = d4;
    }

    public final double getMin() {
        return this.aID;
    }

    public final double getMax() {
        return this.aIE;
    }

    public final double agx() {
        return this.aug;
    }

    public final double ajO() {
        return this.bEf;
    }
}
