package com.iqoption.core.microservices.billing.response.deposit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d;
import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0003\u0018\u00010\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0002\u0010\u0017J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0015HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÂ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003J\u001d\u00101\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0003\u0018\u00010\rHÆ\u0003J\u0015\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\rHÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0015HÆ\u0003Jµ\u0001\u00105\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0003\u0018\u00010\r2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001J\t\u00106\u001a\u000207HÖ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u000207HÖ\u0001J\u0006\u0010=\u001a\u000209J\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00060?2\u0006\u0010@\u001a\u000209J\t\u0010A\u001a\u00020\u000eHÖ\u0001J\u0019\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u000207HÖ\u0001R \u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R*\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0003\u0018\u00010\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u001dR\u0016\u0010\u0016\u001a\u00020\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001d¨\u0006G"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/CashboxCounting;", "Landroid/os/Parcelable;", "userCards", "Ljava/util/ArrayList;", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/UserCard;", "paymentMethods", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PaymentMethod;", "holdPayments", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/HoldPayment;", "currencies", "Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "activeCurrency", "deposits", "Ljava/util/HashMap;", "", "Lcom/iqoption/core/microservices/billing/response/deposit/Deposit;", "defaultBonuses", "Lcom/iqoption/core/microservices/billing/response/deposit/Bonus;", "lastPayments", "Lcom/iqoption/core/microservices/billing/response/deposit/Payment;", "kycLimit", "", "successSum", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/ArrayList;DD)V", "getActiveCurrency", "()Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "setActiveCurrency", "(Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;)V", "getCurrencies", "()Ljava/util/ArrayList;", "setCurrencies", "(Ljava/util/ArrayList;)V", "getDefaultBonuses", "()Ljava/util/HashMap;", "getDeposits", "getHoldPayments", "getKycLimit", "()D", "getLastPayments", "paymentMethodsUnfiltered", "getPaymentMethodsUnfiltered", "getSuccessSum", "getUserCards", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "isCurrencyFixed", "paymentMethodsFiltered", "", "allowGooglePay", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: CashboxCounting.kt */
public final class b implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("currencies")
    private ArrayList<d> bhx;
    @SerializedName("user_cards")
    private final ArrayList<e> bnp;
    @SerializedName("payment_methods")
    private final ArrayList<d> bnq;
    @SerializedName("hold_payments")
    private final ArrayList<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b> bnr;
    @SerializedName("active_currency")
    private d bns;
    @SerializedName("deposits")
    private final HashMap<String, ArrayList<e>> bnt;
    @SerializedName("default_bonuses")
    private final HashMap<String, a> bnu;
    @SerializedName("last_payments")
    private final ArrayList<f> bnv;
    @SerializedName("kyc_limit")
    private final double bnw;
    @SerializedName("success_sum")
    private final double bnx;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            int readInt;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            HashMap hashMap;
            Parcel parcel2 = parcel;
            kotlin.jvm.internal.i.f(parcel2, "in");
            ArrayList arrayList4 = null;
            if (parcel.readInt() != 0) {
                readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((e) e.CREATOR.createFromParcel(parcel2));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            readInt = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList5.add((d) d.CREATOR.createFromParcel(parcel2));
                readInt--;
            }
            if (parcel.readInt() != 0) {
                readInt = parcel.readInt();
                arrayList2 = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList2.add((com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b) com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b.CREATOR.createFromParcel(parcel2));
                    readInt--;
                }
            } else {
                arrayList2 = null;
            }
            if (parcel.readInt() != 0) {
                readInt = parcel.readInt();
                arrayList3 = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList3.add((d) d.CREATOR.createFromParcel(parcel2));
                    readInt--;
                }
            } else {
                arrayList3 = null;
            }
            d dVar = parcel.readInt() != 0 ? (d) d.CREATOR.createFromParcel(parcel2) : null;
            if (parcel.readInt() != 0) {
                readInt = parcel.readInt();
                hashMap = new HashMap(readInt);
                while (readInt != 0) {
                    String readString = parcel.readString();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(readInt2);
                    while (readInt2 != 0) {
                        arrayList6.add((e) e.CREATOR.createFromParcel(parcel2));
                        readInt2--;
                    }
                    hashMap.put(readString, arrayList6);
                    readInt--;
                }
            } else {
                hashMap = null;
            }
            readInt = parcel.readInt();
            HashMap hashMap2 = new HashMap(readInt);
            while (readInt != 0) {
                hashMap2.put(parcel.readString(), (a) a.CREATOR.createFromParcel(parcel2));
                readInt--;
            }
            if (parcel.readInt() != 0) {
                readInt = parcel.readInt();
                arrayList4 = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList4.add((f) f.CREATOR.createFromParcel(parcel2));
                    readInt--;
                }
            }
            return new b(arrayList, arrayList5, arrayList2, arrayList3, dVar, hashMap, hashMap2, arrayList4, parcel.readDouble(), parcel.readDouble());
        }

        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:22:0x006a, code skipped:
            if (java.lang.Double.compare(r4.bnx, r5.bnx) == 0) goto L_0x006f;
     */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        if (r4 == r5) goto L_0x006f;
    L_0x0002:
        r0 = r5 instanceof com.iqoption.core.microservices.billing.response.deposit.b;
        if (r0 == 0) goto L_0x006d;
    L_0x0006:
        r5 = (com.iqoption.core.microservices.billing.response.deposit.b) r5;
        r0 = r4.bnp;
        r1 = r5.bnp;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0012:
        r0 = r4.bnq;
        r1 = r5.bnq;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x001c:
        r0 = r4.bnr;
        r1 = r5.bnr;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0026:
        r0 = r4.bhx;
        r1 = r5.bhx;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0030:
        r0 = r4.bns;
        r1 = r5.bns;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x003a:
        r0 = r4.bnt;
        r1 = r5.bnt;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0044:
        r0 = r4.bnu;
        r1 = r5.bnu;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x004e:
        r0 = r4.bnv;
        r1 = r5.bnv;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0058:
        r0 = r4.bnw;
        r2 = r5.bnw;
        r0 = java.lang.Double.compare(r0, r2);
        if (r0 != 0) goto L_0x006d;
    L_0x0062:
        r0 = r4.bnx;
        r2 = r5.bnx;
        r5 = java.lang.Double.compare(r0, r2);
        if (r5 != 0) goto L_0x006d;
    L_0x006c:
        goto L_0x006f;
    L_0x006d:
        r5 = 0;
        return r5;
    L_0x006f:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.billing.response.deposit.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = this.bnp;
        int i = 0;
        int hashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        ArrayList arrayList2 = this.bnq;
        hashCode = (hashCode + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        arrayList2 = this.bnr;
        hashCode = (hashCode + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        arrayList2 = this.bhx;
        hashCode = (hashCode + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        d dVar = this.bns;
        hashCode = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        HashMap hashMap = this.bnt;
        hashCode = (hashCode + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        hashMap = this.bnu;
        hashCode = (hashCode + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        arrayList2 = this.bnv;
        if (arrayList2 != null) {
            i = arrayList2.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.bnw);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.bnx);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CashboxCounting(userCards=");
        stringBuilder.append(this.bnp);
        stringBuilder.append(", paymentMethods=");
        stringBuilder.append(this.bnq);
        stringBuilder.append(", holdPayments=");
        stringBuilder.append(this.bnr);
        stringBuilder.append(", currencies=");
        stringBuilder.append(this.bhx);
        stringBuilder.append(", activeCurrency=");
        stringBuilder.append(this.bns);
        stringBuilder.append(", deposits=");
        stringBuilder.append(this.bnt);
        stringBuilder.append(", defaultBonuses=");
        stringBuilder.append(this.bnu);
        stringBuilder.append(", lastPayments=");
        stringBuilder.append(this.bnv);
        stringBuilder.append(", kycLimit=");
        stringBuilder.append(this.bnw);
        stringBuilder.append(", successSum=");
        stringBuilder.append(this.bnx);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        ArrayList<e> arrayList = this.bnp;
        if (arrayList != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            for (e writeToParcel : arrayList) {
                writeToParcel.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        ArrayList<d> arrayList2 = this.bnq;
        parcel.writeInt(arrayList2.size());
        for (d writeToParcel2 : arrayList2) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
        ArrayList<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b> arrayList3 = this.bnr;
        if (arrayList3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList3.size());
            for (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b writeToParcel3 : arrayList3) {
                writeToParcel3.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        ArrayList<d> arrayList4 = this.bhx;
        if (arrayList4 != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList4.size());
            for (d writeToParcel4 : arrayList4) {
                writeToParcel4.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        d dVar = this.bns;
        if (dVar != null) {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        HashMap hashMap = this.bnt;
        if (hashMap != null) {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            for (Object next : hashMap.entrySet()) {
                parcel.writeString((String) next.getKey());
                ArrayList<e> arrayList5 = (ArrayList) next.getValue();
                parcel.writeInt(arrayList5.size());
                for (e writeToParcel5 : arrayList5) {
                    writeToParcel5.writeToParcel(parcel, 0);
                }
            }
        } else {
            parcel.writeInt(0);
        }
        hashMap = this.bnu;
        parcel.writeInt(hashMap.size());
        for (Object next2 : hashMap.entrySet()) {
            parcel.writeString((String) next2.getKey());
            ((a) next2.getValue()).writeToParcel(parcel, 0);
        }
        ArrayList<f> arrayList6 = this.bnv;
        if (arrayList6 != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList6.size());
            for (f writeToParcel6 : arrayList6) {
                writeToParcel6.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeDouble(this.bnw);
        parcel.writeDouble(this.bnx);
    }

    public b(ArrayList<e> arrayList, ArrayList<d> arrayList2, ArrayList<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b> arrayList3, ArrayList<d> arrayList4, d dVar, HashMap<String, ArrayList<e>> hashMap, HashMap<String, a> hashMap2, ArrayList<f> arrayList5, double d, double d2) {
        kotlin.jvm.internal.i.f(arrayList2, "paymentMethods");
        kotlin.jvm.internal.i.f(hashMap2, "defaultBonuses");
        this.bnp = arrayList;
        this.bnq = arrayList2;
        this.bnr = arrayList3;
        this.bhx = arrayList4;
        this.bns = dVar;
        this.bnt = hashMap;
        this.bnu = hashMap2;
        this.bnv = arrayList5;
        this.bnw = d;
        this.bnx = d2;
    }

    public final ArrayList<e> aao() {
        return this.bnp;
    }

    public final ArrayList<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b> aap() {
        return this.bnr;
    }

    public final ArrayList<d> XA() {
        return this.bhx;
    }

    public final void g(ArrayList<d> arrayList) {
        this.bhx = arrayList;
    }

    public final d aaq() {
        return this.bns;
    }

    public final HashMap<String, ArrayList<e>> aar() {
        return this.bnt;
    }

    public final double aas() {
        return this.bnw;
    }

    public final double aat() {
        return this.bnx;
    }

    public final List<d> cz(boolean z) {
        if (z) {
            return this.bnq;
        }
        Collection arrayList = new ArrayList();
        for (Object next : this.bnq) {
            if ((c.f((d) next) ^ 1) != 0) {
                arrayList.add(next);
            }
        }
        return u.T((List) arrayList);
    }

    public final boolean aan() {
        ArrayList arrayList = this.bhx;
        return (arrayList != null ? arrayList.size() : 1) == 1;
    }
}
