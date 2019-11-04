package com.iqoption.core.microservices.withdraw.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, bng = {"Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;", "Landroid/os/Parcelable;", "value", "", "type", "Lcom/iqoption/core/microservices/withdraw/response/LimitType;", "direction", "Lcom/iqoption/core/microservices/withdraw/response/LimitDirection;", "(DLcom/iqoption/core/microservices/withdraw/response/LimitType;Lcom/iqoption/core/microservices/withdraw/response/LimitDirection;)V", "getDirection", "()Lcom/iqoption/core/microservices/withdraw/response/LimitDirection;", "getType", "()Lcom/iqoption/core/microservices/withdraw/response/LimitType;", "getValue", "()D", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: AmountLimits.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new a();
    private final LimitType bDP;
    private final LimitDirection bDQ;
    private final double value;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new a(parcel.readDouble(), (LimitType) Enum.valueOf(LimitType.class, parcel.readString()), (LimitDirection) Enum.valueOf(LimitDirection.class, parcel.readString()));
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r4.bDQ, r5.bDQ) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        if (r4 == r5) goto L_0x0029;
    L_0x0002:
        r0 = r5 instanceof com.iqoption.core.microservices.withdraw.response.a;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r5 = (com.iqoption.core.microservices.withdraw.response.a) r5;
        r0 = r4.value;
        r2 = r5.value;
        r0 = java.lang.Double.compare(r0, r2);
        if (r0 != 0) goto L_0x0027;
    L_0x0012:
        r0 = r4.bDP;
        r1 = r5.bDP;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r4.bDQ;
        r5 = r5.bDQ;
        r5 = kotlin.jvm.internal.i.y(r0, r5);
        if (r5 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r5 = 0;
        return r5;
    L_0x0029:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.withdraw.response.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.value);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        LimitType limitType = this.bDP;
        int i2 = 0;
        i = (i + (limitType != null ? limitType.hashCode() : 0)) * 31;
        LimitDirection limitDirection = this.bDQ;
        if (limitDirection != null) {
            i2 = limitDirection.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AmountLimit(value=");
        stringBuilder.append(this.value);
        stringBuilder.append(", type=");
        stringBuilder.append(this.bDP);
        stringBuilder.append(", direction=");
        stringBuilder.append(this.bDQ);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeDouble(this.value);
        parcel.writeString(this.bDP.name());
        parcel.writeString(this.bDQ.name());
    }

    public a(double d, LimitType limitType, LimitDirection limitDirection) {
        kotlin.jvm.internal.i.f(limitType, "type");
        kotlin.jvm.internal.i.f(limitDirection, "direction");
        this.value = d;
        this.bDP = limitType;
        this.bDQ = limitDirection;
    }

    public final double getValue() {
        return this.value;
    }

    public final LimitType ajx() {
        return this.bDP;
    }

    public final LimitDirection ajy() {
        return this.bDQ;
    }
}
