package com.iqoption.core.microservices.billing.response.deposit.cashboxitem;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.math.BigDecimal;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\n\u0010$\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\t\u0010)\u001a\u00020\u001fHÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u00060"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/HoldPayment;", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "cardId", "", "cardNumber", "", "expireDate", "sum", "Ljava/math/BigDecimal;", "currency", "mask", "(JLjava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()J", "getCardNumber", "()Ljava/lang/String;", "getCurrency", "getExpireDate", "getMask", "getSum", "()Ljava/math/BigDecimal;", "category", "Lcom/iqoption/core/microservices/billing/response/deposit/MethodCategory;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "getImageUrl", "getName", "getType", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItemType;", "getUniqueId", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: HoldPayment.kt */
public final class b implements a {
    public static final Creator CREATOR = new a();
    @SerializedName("card_id")
    private final long bnQ;
    @SerializedName("sum")
    private final BigDecimal bnR;
    @SerializedName("card_number")
    private final String cardNumber;
    @SerializedName("currency")
    private final String currency;
    @SerializedName("exp")
    private final String expireDate;
    @SerializedName("mask")
    private final String mask;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new b(parcel.readLong(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString());
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
                if (!((this.bnQ == bVar.bnQ ? 1 : null) != null && kotlin.jvm.internal.i.y(this.cardNumber, bVar.cardNumber) && kotlin.jvm.internal.i.y(this.expireDate, bVar.expireDate) && kotlin.jvm.internal.i.y(this.bnR, bVar.bnR) && kotlin.jvm.internal.i.y(this.currency, bVar.currency) && kotlin.jvm.internal.i.y(this.mask, bVar.mask))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.bnQ;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.cardNumber;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.expireDate;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        BigDecimal bigDecimal = this.bnR;
        i = (i + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31;
        str = this.currency;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.mask;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HoldPayment(cardId=");
        stringBuilder.append(this.bnQ);
        stringBuilder.append(", cardNumber=");
        stringBuilder.append(this.cardNumber);
        stringBuilder.append(", expireDate=");
        stringBuilder.append(this.expireDate);
        stringBuilder.append(", sum=");
        stringBuilder.append(this.bnR);
        stringBuilder.append(", currency=");
        stringBuilder.append(this.currency);
        stringBuilder.append(", mask=");
        stringBuilder.append(this.mask);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.bnQ);
        parcel.writeString(this.cardNumber);
        parcel.writeString(this.expireDate);
        parcel.writeSerializable(this.bnR);
        parcel.writeString(this.currency);
        parcel.writeString(this.mask);
    }

    public b(long j, String str, String str2, BigDecimal bigDecimal, String str3, String str4) {
        kotlin.jvm.internal.i.f(str, "cardNumber");
        kotlin.jvm.internal.i.f(str2, "expireDate");
        kotlin.jvm.internal.i.f(bigDecimal, "sum");
        kotlin.jvm.internal.i.f(str3, "currency");
        kotlin.jvm.internal.i.f(str4, "mask");
        this.bnQ = j;
        this.cardNumber = str;
        this.expireDate = str2;
        this.bnR = bigDecimal;
        this.currency = str3;
        this.mask = str4;
    }

    public boolean ZY() {
        return com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a.a.g(this);
    }

    public String ZZ() {
        return com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a.a.h(this);
    }

    public final long aaB() {
        return this.bnQ;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final BigDecimal aaC() {
        return this.bnR;
    }

    public final String getMask() {
        return this.mask;
    }

    public String ZK() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hold-");
        stringBuilder.append(this.bnQ);
        return stringBuilder.toString();
    }

    public String getName() {
        return this.cardNumber;
    }

    public CashboxItemType ZL() {
        return CashboxItemType.HOLD_PAYMENT;
    }
}
