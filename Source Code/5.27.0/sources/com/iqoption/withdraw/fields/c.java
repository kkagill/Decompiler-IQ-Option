package com.iqoption.withdraw.fields;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.iqoption.core.microservices.configuration.a.d;
import com.iqoption.core.microservices.internalbilling.a.b;
import com.iqoption.core.microservices.withdraw.response.WithdrawMethodType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020#HÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00060"}, bng = {"Lcom/iqoption/withdraw/fields/WithdrawFieldsData;", "Landroid/os/Parcelable;", "method", "Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "payoutSettings", "Lcom/iqoption/core/microservices/withdraw/response/UserPayoutSettings;", "balance", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "maxAmount", "", "currency", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "availableType", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethodType;", "(Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;Lcom/iqoption/core/microservices/withdraw/response/UserPayoutSettings;Lcom/iqoption/core/microservices/internalbilling/response/Balance;DLcom/iqoption/core/microservices/configuration/response/Currency;Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethodType;)V", "getAvailableType", "()Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethodType;", "getBalance", "()Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "getCurrency", "()Lcom/iqoption/core/microservices/configuration/response/Currency;", "getMaxAmount", "()D", "getMethod", "()Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "getPayoutSettings", "()Lcom/iqoption/core/microservices/withdraw/response/UserPayoutSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "withdraw_release"})
/* compiled from: WithdrawFieldsViewModel.kt */
public final class c implements Parcelable {
    public static final Creator CREATOR = new a();
    private final b bcM;
    private final d bcN;
    private final com.iqoption.core.microservices.withdraw.response.i epf;
    private final com.iqoption.core.microservices.withdraw.response.c erm;
    private final double ern;
    private final WithdrawMethodType ero;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new c((com.iqoption.core.microservices.withdraw.response.c) parcel.readParcelable(c.class.getClassLoader()), (com.iqoption.core.microservices.withdraw.response.i) parcel.readParcelable(c.class.getClassLoader()), (b) parcel.readParcelable(c.class.getClassLoader()), parcel.readDouble(), (d) parcel.readParcelable(c.class.getClassLoader()), (WithdrawMethodType) Enum.valueOf(WithdrawMethodType.class, parcel.readString()));
        }

        public final Object[] newArray(int i) {
            return new c[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:14:0x0042, code skipped:
            if (kotlin.jvm.internal.i.y(r4.ero, r5.ero) != false) goto L_0x0047;
     */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        if (r4 == r5) goto L_0x0047;
    L_0x0002:
        r0 = r5 instanceof com.iqoption.withdraw.fields.c;
        if (r0 == 0) goto L_0x0045;
    L_0x0006:
        r5 = (com.iqoption.withdraw.fields.c) r5;
        r0 = r4.erm;
        r1 = r5.erm;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0012:
        r0 = r4.epf;
        r1 = r5.epf;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x001c:
        r0 = r4.bcM;
        r1 = r5.bcM;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0026:
        r0 = r4.ern;
        r2 = r5.ern;
        r0 = java.lang.Double.compare(r0, r2);
        if (r0 != 0) goto L_0x0045;
    L_0x0030:
        r0 = r4.bcN;
        r1 = r5.bcN;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x003a:
        r0 = r4.ero;
        r5 = r5.ero;
        r5 = kotlin.jvm.internal.i.y(r0, r5);
        if (r5 == 0) goto L_0x0045;
    L_0x0044:
        goto L_0x0047;
    L_0x0045:
        r5 = 0;
        return r5;
    L_0x0047:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.withdraw.fields.c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        com.iqoption.core.microservices.withdraw.response.c cVar = this.erm;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        com.iqoption.core.microservices.withdraw.response.i iVar = this.epf;
        hashCode = (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        b bVar = this.bcM;
        hashCode = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.ern);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        d dVar = this.bcN;
        hashCode = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        WithdrawMethodType withdrawMethodType = this.ero;
        if (withdrawMethodType != null) {
            i = withdrawMethodType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WithdrawFieldsData(method=");
        stringBuilder.append(this.erm);
        stringBuilder.append(", payoutSettings=");
        stringBuilder.append(this.epf);
        stringBuilder.append(", balance=");
        stringBuilder.append(this.bcM);
        stringBuilder.append(", maxAmount=");
        stringBuilder.append(this.ern);
        stringBuilder.append(", currency=");
        stringBuilder.append(this.bcN);
        stringBuilder.append(", availableType=");
        stringBuilder.append(this.ero);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeParcelable(this.erm, i);
        parcel.writeParcelable(this.epf, i);
        parcel.writeParcelable(this.bcM, i);
        parcel.writeDouble(this.ern);
        parcel.writeParcelable(this.bcN, i);
        parcel.writeString(this.ero.name());
    }

    public c(com.iqoption.core.microservices.withdraw.response.c cVar, com.iqoption.core.microservices.withdraw.response.i iVar, b bVar, double d, d dVar, WithdrawMethodType withdrawMethodType) {
        kotlin.jvm.internal.i.f(cVar, "method");
        kotlin.jvm.internal.i.f(iVar, "payoutSettings");
        kotlin.jvm.internal.i.f(bVar, "balance");
        kotlin.jvm.internal.i.f(dVar, "currency");
        kotlin.jvm.internal.i.f(withdrawMethodType, "availableType");
        this.erm = cVar;
        this.epf = iVar;
        this.bcM = bVar;
        this.ern = d;
        this.bcN = dVar;
        this.ero = withdrawMethodType;
    }

    public final com.iqoption.core.microservices.withdraw.response.c bcf() {
        return this.erm;
    }

    public final com.iqoption.core.microservices.withdraw.response.i bbS() {
        return this.epf;
    }

    public final b VL() {
        return this.bcM;
    }

    public final double bcg() {
        return this.ern;
    }

    public final d VM() {
        return this.bcN;
    }

    public final WithdrawMethodType bch() {
        return this.ero;
    }
}
