package com.iqoption.core.microservices.billing.response.deposit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003Jh\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\t\u0010 \u001a\u00020\tHÖ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\tHÖ\u0001R\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/Bonus;", "Landroid/os/Parcelable;", "available", "", "text", "", "apply", "amount", "Ljava/util/HashMap;", "", "minAmount", "", "isPercent", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/HashMap;Ljava/util/HashMap;Z)V", "getAmount", "()Ljava/util/HashMap;", "getApply", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAvailable", "()Z", "getMinAmount", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/HashMap;Ljava/util/HashMap;Z)Lcom/iqoption/core/microservices/billing/response/deposit/Bonus;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: Bonus.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("available")
    private final Boolean bnk;
    @SerializedName("apply")
    private final Boolean bnl;
    @SerializedName("amount")
    private final HashMap<String, Integer> bnm;
    @SerializedName("min_amount")
    private final HashMap<String, Long> bnn;
    @SerializedName("is_percent")
    private final boolean bno;
    @SerializedName("text")
    private final String text;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            kotlin.jvm.internal.i.f(parcel, "in");
            if (parcel.readInt() != 0) {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                valueOf = null;
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                valueOf2 = null;
            }
            int readInt = parcel.readInt();
            HashMap hashMap = new HashMap(readInt);
            while (readInt != 0) {
                hashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                readInt--;
            }
            readInt = parcel.readInt();
            HashMap hashMap2 = new HashMap(readInt);
            while (readInt != 0) {
                hashMap2.put(parcel.readString(), Long.valueOf(parcel.readLong()));
                readInt--;
            }
            return new a(valueOf, readString, valueOf2, hashMap, hashMap2, parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.bnk, aVar.bnk) && kotlin.jvm.internal.i.y(this.text, aVar.text) && kotlin.jvm.internal.i.y(this.bnl, aVar.bnl) && kotlin.jvm.internal.i.y(this.bnm, aVar.bnm) && kotlin.jvm.internal.i.y(this.bnn, aVar.bnn)) {
                    if ((this.bno == aVar.bno ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.bnk;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.text;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool2 = this.bnl;
        hashCode = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        HashMap hashMap = this.bnm;
        hashCode = (hashCode + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        hashMap = this.bnn;
        if (hashMap != null) {
            i = hashMap.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.bno;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bonus(available=");
        stringBuilder.append(this.bnk);
        stringBuilder.append(", text=");
        stringBuilder.append(this.text);
        stringBuilder.append(", apply=");
        stringBuilder.append(this.bnl);
        stringBuilder.append(", amount=");
        stringBuilder.append(this.bnm);
        stringBuilder.append(", minAmount=");
        stringBuilder.append(this.bnn);
        stringBuilder.append(", isPercent=");
        stringBuilder.append(this.bno);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        Boolean bool = this.bnk;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.text);
        bool = this.bnl;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue());
        } else {
            parcel.writeInt(0);
        }
        HashMap hashMap = this.bnm;
        parcel.writeInt(hashMap.size());
        for (Object next : hashMap.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeInt(((Integer) next.getValue()).intValue());
        }
        hashMap = this.bnn;
        parcel.writeInt(hashMap.size());
        for (Object next2 : hashMap.entrySet()) {
            parcel.writeString((String) next2.getKey());
            parcel.writeLong(((Long) next2.getValue()).longValue());
        }
        parcel.writeInt(this.bno);
    }

    public a(Boolean bool, String str, Boolean bool2, HashMap<String, Integer> hashMap, HashMap<String, Long> hashMap2, boolean z) {
        kotlin.jvm.internal.i.f(hashMap, "amount");
        kotlin.jvm.internal.i.f(hashMap2, "minAmount");
        this.bnk = bool;
        this.text = str;
        this.bnl = bool2;
        this.bnm = hashMap;
        this.bnn = hashMap2;
        this.bno = z;
    }
}
