package com.iqoption.deposit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.c;
import com.iqoption.core.microservices.billing.response.deposit.d;
import java.math.BigDecimal;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003JZ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010%J\t\u0010&\u001a\u00020'HÖ\u0001J\u0013\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u000b\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u00062"}, bng = {"Lcom/iqoption/deposit/DepositParams;", "Landroid/os/Parcelable;", "session", "", "payMethod", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PayMethod;", "amount", "Ljava/math/BigDecimal;", "currency", "Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "cryptoAmount", "isCryptoBased", "", "refundAddress", "(Ljava/lang/String;Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PayMethod;Ljava/math/BigDecimal;Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAmount", "()Ljava/math/BigDecimal;", "getCryptoAmount", "getCurrency", "()Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isGooglePay", "()Z", "getPayMethod", "()Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PayMethod;", "getRefundAddress", "()Ljava/lang/String;", "getSession", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PayMethod;Ljava/math/BigDecimal;Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/iqoption/deposit/DepositParams;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "deposit_release"})
/* compiled from: DepositParams.kt */
public final class i implements Parcelable {
    public static final Creator CREATOR = new a();
    private final String bmn;
    private final BigDecimal bub;
    private final c cwL;
    private final d cwM;
    private final BigDecimal cwN;
    private final Boolean cwO;
    private final String cwP;

    @kotlin.i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean valueOf;
            kotlin.jvm.internal.i.f(parcel, "in");
            String readString = parcel.readString();
            c cVar = (c) parcel.readParcelable(i.class.getClassLoader());
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            d dVar = (d) parcel.readParcelable(i.class.getClassLoader());
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                valueOf = null;
            }
            return new i(readString, cVar, bigDecimal, dVar, bigDecimal2, valueOf, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new i[i];
        }
    }

    public static /* synthetic */ i a(i iVar, String str, c cVar, BigDecimal bigDecimal, d dVar, BigDecimal bigDecimal2, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iVar.bmn;
        }
        if ((i & 2) != 0) {
            cVar = iVar.cwL;
        }
        c cVar2 = cVar;
        if ((i & 4) != 0) {
            bigDecimal = iVar.bub;
        }
        BigDecimal bigDecimal3 = bigDecimal;
        if ((i & 8) != 0) {
            dVar = iVar.cwM;
        }
        d dVar2 = dVar;
        if ((i & 16) != 0) {
            bigDecimal2 = iVar.cwN;
        }
        BigDecimal bigDecimal4 = bigDecimal2;
        if ((i & 32) != 0) {
            bool = iVar.cwO;
        }
        Boolean bool2 = bool;
        if ((i & 64) != 0) {
            str2 = iVar.cwP;
        }
        return iVar.a(str, cVar2, bigDecimal3, dVar2, bigDecimal4, bool2, str2);
    }

    public final i a(String str, c cVar, BigDecimal bigDecimal, d dVar, BigDecimal bigDecimal2, Boolean bool, String str2) {
        String str3 = str;
        kotlin.jvm.internal.i.f(str, "session");
        c cVar2 = cVar;
        kotlin.jvm.internal.i.f(cVar, "payMethod");
        BigDecimal bigDecimal3 = bigDecimal;
        kotlin.jvm.internal.i.f(bigDecimal, "amount");
        d dVar2 = dVar;
        kotlin.jvm.internal.i.f(dVar, "currency");
        return new i(str3, cVar2, bigDecimal3, dVar2, bigDecimal2, bool, str2);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:16:0x004c, code skipped:
            if (kotlin.jvm.internal.i.y(r2.cwP, r3.cwP) != false) goto L_0x0051;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0051;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.deposit.i;
        if (r0 == 0) goto L_0x004f;
    L_0x0006:
        r3 = (com.iqoption.deposit.i) r3;
        r0 = r2.bmn;
        r1 = r3.bmn;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x0012:
        r0 = r2.cwL;
        r1 = r3.cwL;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x001c:
        r0 = r2.bub;
        r1 = r3.bub;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x0026:
        r0 = r2.cwM;
        r1 = r3.cwM;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x0030:
        r0 = r2.cwN;
        r1 = r3.cwN;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x003a:
        r0 = r2.cwO;
        r1 = r3.cwO;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x0044:
        r0 = r2.cwP;
        r3 = r3.cwP;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0051;
    L_0x004f:
        r3 = 0;
        return r3;
    L_0x0051:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.i.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.bmn;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        c cVar = this.cwL;
        hashCode = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        BigDecimal bigDecimal = this.bub;
        hashCode = (hashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31;
        d dVar = this.cwM;
        hashCode = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        bigDecimal = this.cwN;
        hashCode = (hashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31;
        Boolean bool = this.cwO;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str2 = this.cwP;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DepositParams(session=");
        stringBuilder.append(this.bmn);
        stringBuilder.append(", payMethod=");
        stringBuilder.append(this.cwL);
        stringBuilder.append(", amount=");
        stringBuilder.append(this.bub);
        stringBuilder.append(", currency=");
        stringBuilder.append(this.cwM);
        stringBuilder.append(", cryptoAmount=");
        stringBuilder.append(this.cwN);
        stringBuilder.append(", isCryptoBased=");
        stringBuilder.append(this.cwO);
        stringBuilder.append(", refundAddress=");
        stringBuilder.append(this.cwP);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.bmn);
        parcel.writeParcelable(this.cwL, i);
        parcel.writeSerializable(this.bub);
        parcel.writeParcelable(this.cwM, i);
        parcel.writeSerializable(this.cwN);
        Boolean bool = this.cwO;
        if (bool != null) {
            parcel.writeInt(1);
            i = bool.booleanValue();
        } else {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(this.cwP);
    }

    public i(String str, c cVar, BigDecimal bigDecimal, d dVar, BigDecimal bigDecimal2, Boolean bool, String str2) {
        kotlin.jvm.internal.i.f(str, "session");
        kotlin.jvm.internal.i.f(cVar, "payMethod");
        kotlin.jvm.internal.i.f(bigDecimal, "amount");
        kotlin.jvm.internal.i.f(dVar, "currency");
        this.bmn = str;
        this.cwL = cVar;
        this.bub = bigDecimal;
        this.cwM = dVar;
        this.cwN = bigDecimal2;
        this.cwO = bool;
        this.cwP = str2;
    }

    public final String Zx() {
        return this.bmn;
    }

    public final c aon() {
        return this.cwL;
    }

    public final BigDecimal aeo() {
        return this.bub;
    }

    public final d aoo() {
        return this.cwM;
    }

    public /* synthetic */ i(String str, c cVar, BigDecimal bigDecimal, d dVar, BigDecimal bigDecimal2, Boolean bool, String str2, int i, f fVar) {
        this(str, cVar, bigDecimal, dVar, (i & 16) != 0 ? (BigDecimal) null : bigDecimal2, (i & 32) != 0 ? (Boolean) null : bool, (i & 64) != 0 ? (String) null : str2);
    }

    public final BigDecimal aop() {
        return this.cwN;
    }

    public final Boolean aoq() {
        return this.cwO;
    }

    public final boolean aom() {
        c cVar = this.cwL;
        if (!(cVar instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d)) {
            cVar = null;
        }
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d dVar = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) cVar;
        return dVar != null && com.iqoption.core.microservices.billing.response.deposit.c.f(dVar);
    }
}
