package com.iqoption.withdraw.fields;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.iqoption.core.microservices.withdraw.response.c;
import java.util.LinkedHashMap;
import java.util.Map;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, bng = {"Lcom/iqoption/withdraw/fields/WithdrawState;", "Landroid/os/Parcelable;", "selectedMethod", "Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "values", "", "", "(Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;Ljava/util/Map;)V", "getSelectedMethod", "()Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "getValues", "()Ljava/util/Map;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "withdraw_release"})
/* compiled from: WithdrawFieldsFragment.kt */
public final class i implements Parcelable {
    public static final Creator CREATOR = new a();
    private final c esc;
    private final Map<String, String> values;

    @kotlin.i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            c cVar = (c) parcel.readParcelable(i.class.getClassLoader());
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            while (readInt != 0) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
                readInt--;
            }
            return new i(cVar, linkedHashMap);
        }

        public final Object[] newArray(int i) {
            return new i[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.values, r3.values) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.withdraw.fields.i;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.withdraw.fields.i) r3;
        r0 = r2.esc;
        r1 = r3.esc;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.values;
        r3 = r3.values;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.withdraw.fields.i.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        c cVar = this.esc;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        Map map = this.values;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WithdrawState(selectedMethod=");
        stringBuilder.append(this.esc);
        stringBuilder.append(", values=");
        stringBuilder.append(this.values);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeParcelable(this.esc, i);
        Map map = this.values;
        parcel.writeInt(map.size());
        for (Object next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    public i(c cVar, Map<String, String> map) {
        kotlin.jvm.internal.i.f(map, "values");
        this.esc = cVar;
        this.values = map;
    }

    public final Map<String, String> aaO() {
        return this.values;
    }

    public final c bcx() {
        return this.esc;
    }
}
