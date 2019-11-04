package com.iqoption.withdraw.c;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.iqoption.core.microservices.internalbilling.a.b;
import com.iqoption.core.microservices.withdraw.response.WithdrawMethodType;
import com.iqoption.core.microservices.withdraw.response.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Be\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e¢\u0006\u0002\u0010\u0014J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u0011HÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eHÆ\u0003Jy\u0010,\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eHÆ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020.HÖ\u0001J\t\u00104\u001a\u00020\u000fHÖ\u0001J\u0019\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001e¨\u0006:"}, bng = {"Lcom/iqoption/withdraw/methods/WithdrawMethodsData;", "Landroid/os/Parcelable;", "methods", "", "Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "payoutSettings", "Lcom/iqoption/core/microservices/withdraw/response/UserPayoutSettings;", "balance", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "currency", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "availableType", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethodType;", "methodWarnings", "", "", "fullRefundAmount", "", "totalAmountWithFeeByMethod", "", "(Ljava/util/List;Lcom/iqoption/core/microservices/withdraw/response/UserPayoutSettings;Lcom/iqoption/core/microservices/internalbilling/response/Balance;Lcom/iqoption/core/microservices/configuration/response/Currency;Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethodType;Ljava/util/Map;DLjava/util/Map;)V", "getAvailableType", "()Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethodType;", "getBalance", "()Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "getCurrency", "()Lcom/iqoption/core/microservices/configuration/response/Currency;", "getFullRefundAmount", "()D", "getMethodWarnings", "()Ljava/util/Map;", "getMethods", "()Ljava/util/List;", "getPayoutSettings", "()Lcom/iqoption/core/microservices/withdraw/response/UserPayoutSettings;", "getTotalAmountWithFeeByMethod", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "withdraw_release"})
/* compiled from: WithdrawMethodsViewModel.kt */
public final class d implements Parcelable {
    public static final Creator CREATOR = new a();
    private final List<c> bEh;
    private final b bcM;
    private final com.iqoption.core.microservices.configuration.a.d bcN;
    private final com.iqoption.core.microservices.withdraw.response.i epf;
    private final Map<Long, Double> epy;
    private final WithdrawMethodType ero;
    private final Map<c, String> eta;
    private final double etb;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((c) parcel.readParcelable(d.class.getClassLoader()));
                readInt--;
            }
            com.iqoption.core.microservices.withdraw.response.i iVar = (com.iqoption.core.microservices.withdraw.response.i) parcel.readParcelable(d.class.getClassLoader());
            b bVar = (b) parcel.readParcelable(d.class.getClassLoader());
            com.iqoption.core.microservices.configuration.a.d dVar = (com.iqoption.core.microservices.configuration.a.d) parcel.readParcelable(d.class.getClassLoader());
            WithdrawMethodType withdrawMethodType = (WithdrawMethodType) Enum.valueOf(WithdrawMethodType.class, parcel.readString());
            readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            while (readInt != 0) {
                linkedHashMap.put((c) parcel.readParcelable(d.class.getClassLoader()), parcel.readString());
                readInt--;
            }
            double readDouble = parcel.readDouble();
            readInt = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
            while (readInt != 0) {
                linkedHashMap2.put(Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
                readInt--;
            }
            return new d(arrayList, iVar, bVar, dVar, withdrawMethodType, linkedHashMap, readDouble, linkedHashMap2);
        }

        public final Object[] newArray(int i) {
            return new d[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:18:0x0056, code skipped:
            if (kotlin.jvm.internal.i.y(r4.epy, r5.epy) != false) goto L_0x005b;
     */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        if (r4 == r5) goto L_0x005b;
    L_0x0002:
        r0 = r5 instanceof com.iqoption.withdraw.c.d;
        if (r0 == 0) goto L_0x0059;
    L_0x0006:
        r5 = (com.iqoption.withdraw.c.d) r5;
        r0 = r4.bEh;
        r1 = r5.bEh;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x0012:
        r0 = r4.epf;
        r1 = r5.epf;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x001c:
        r0 = r4.bcM;
        r1 = r5.bcM;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x0026:
        r0 = r4.bcN;
        r1 = r5.bcN;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x0030:
        r0 = r4.ero;
        r1 = r5.ero;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x003a:
        r0 = r4.eta;
        r1 = r5.eta;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x0044:
        r0 = r4.etb;
        r2 = r5.etb;
        r0 = java.lang.Double.compare(r0, r2);
        if (r0 != 0) goto L_0x0059;
    L_0x004e:
        r0 = r4.epy;
        r5 = r5.epy;
        r5 = kotlin.jvm.internal.i.y(r0, r5);
        if (r5 == 0) goto L_0x0059;
    L_0x0058:
        goto L_0x005b;
    L_0x0059:
        r5 = 0;
        return r5;
    L_0x005b:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.withdraw.c.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List list = this.bEh;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        com.iqoption.core.microservices.withdraw.response.i iVar = this.epf;
        hashCode = (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        b bVar = this.bcM;
        hashCode = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        com.iqoption.core.microservices.configuration.a.d dVar = this.bcN;
        hashCode = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        WithdrawMethodType withdrawMethodType = this.ero;
        hashCode = (hashCode + (withdrawMethodType != null ? withdrawMethodType.hashCode() : 0)) * 31;
        Map map = this.eta;
        hashCode = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.etb);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        map = this.epy;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WithdrawMethodsData(methods=");
        stringBuilder.append(this.bEh);
        stringBuilder.append(", payoutSettings=");
        stringBuilder.append(this.epf);
        stringBuilder.append(", balance=");
        stringBuilder.append(this.bcM);
        stringBuilder.append(", currency=");
        stringBuilder.append(this.bcN);
        stringBuilder.append(", availableType=");
        stringBuilder.append(this.ero);
        stringBuilder.append(", methodWarnings=");
        stringBuilder.append(this.eta);
        stringBuilder.append(", fullRefundAmount=");
        stringBuilder.append(this.etb);
        stringBuilder.append(", totalAmountWithFeeByMethod=");
        stringBuilder.append(this.epy);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        List<c> list = this.bEh;
        parcel.writeInt(list.size());
        for (c writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeParcelable(this.epf, i);
        parcel.writeParcelable(this.bcM, i);
        parcel.writeParcelable(this.bcN, i);
        parcel.writeString(this.ero.name());
        Map map = this.eta;
        parcel.writeInt(map.size());
        for (Object next : map.entrySet()) {
            parcel.writeParcelable((c) next.getKey(), i);
            parcel.writeString((String) next.getValue());
        }
        parcel.writeDouble(this.etb);
        Map map2 = this.epy;
        parcel.writeInt(map2.size());
        for (Object next2 : map2.entrySet()) {
            parcel.writeLong(((Long) next2.getKey()).longValue());
            Double d = (Double) next2.getValue();
            if (d != null) {
                parcel.writeInt(1);
                parcel.writeDouble(d.doubleValue());
            } else {
                parcel.writeInt(0);
            }
        }
    }

    public d(List<? extends c> list, com.iqoption.core.microservices.withdraw.response.i iVar, b bVar, com.iqoption.core.microservices.configuration.a.d dVar, WithdrawMethodType withdrawMethodType, Map<c, String> map, double d, Map<Long, Double> map2) {
        kotlin.jvm.internal.i.f(list, "methods");
        kotlin.jvm.internal.i.f(iVar, "payoutSettings");
        kotlin.jvm.internal.i.f(bVar, "balance");
        kotlin.jvm.internal.i.f(dVar, "currency");
        kotlin.jvm.internal.i.f(withdrawMethodType, "availableType");
        kotlin.jvm.internal.i.f(map, "methodWarnings");
        kotlin.jvm.internal.i.f(map2, "totalAmountWithFeeByMethod");
        this.bEh = list;
        this.epf = iVar;
        this.bcM = bVar;
        this.bcN = dVar;
        this.ero = withdrawMethodType;
        this.eta = map;
        this.etb = d;
        this.epy = map2;
    }

    public final List<c> ajQ() {
        return this.bEh;
    }

    public final com.iqoption.core.microservices.withdraw.response.i bbS() {
        return this.epf;
    }

    public final b VL() {
        return this.bcM;
    }

    public final com.iqoption.core.microservices.configuration.a.d VM() {
        return this.bcN;
    }

    public final WithdrawMethodType bch() {
        return this.ero;
    }

    public final Map<c, String> bcX() {
        return this.eta;
    }

    public final Map<Long, Double> bbV() {
        return this.epy;
    }
}
