package com.iqoption.core.microservices.billing.response.deposit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/Payment;", "Landroid/os/Parcelable;", "amount", "", "bonusCode", "", "paymentMethod", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PaymentMethod;", "(DLjava/lang/String;Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PaymentMethod;)V", "getAmount", "()D", "getBonusCode", "()Ljava/lang/String;", "getPaymentMethod", "()Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PaymentMethod;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: Payment.kt */
public final class f implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("amount")
    private final double bmw;
    @SerializedName("bonus_code")
    private final String bnK;
    @SerializedName("payment_method")
    private final d bnL;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new f(parcel.readDouble(), parcel.readString(), parcel.readInt() != 0 ? (d) d.CREATOR.createFromParcel(parcel) : null);
        }

        public final Object[] newArray(int i) {
            return new f[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r4.bnL, r5.bnL) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        if (r4 == r5) goto L_0x0029;
    L_0x0002:
        r0 = r5 instanceof com.iqoption.core.microservices.billing.response.deposit.f;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r5 = (com.iqoption.core.microservices.billing.response.deposit.f) r5;
        r0 = r4.bmw;
        r2 = r5.bmw;
        r0 = java.lang.Double.compare(r0, r2);
        if (r0 != 0) goto L_0x0027;
    L_0x0012:
        r0 = r4.bnK;
        r1 = r5.bnK;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r4.bnL;
        r5 = r5.bnL;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.billing.response.deposit.f.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.bmw);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        String str = this.bnK;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        d dVar = this.bnL;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Payment(amount=");
        stringBuilder.append(this.bmw);
        stringBuilder.append(", bonusCode=");
        stringBuilder.append(this.bnK);
        stringBuilder.append(", paymentMethod=");
        stringBuilder.append(this.bnL);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeDouble(this.bmw);
        parcel.writeString(this.bnK);
        d dVar = this.bnL;
        if (dVar != null) {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public f(double d, String str, d dVar) {
        this.bmw = d;
        this.bnK = str;
        this.bnL = dVar;
    }
}
