package com.iqoption.core.microservices.internalbilling.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 <2\u00020\u0001:\u0001<B\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010'\u001a\u00020\u0012HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001J\u0013\u00102\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u0005HÖ\u0001J\t\u00106\u001a\u00020\u000fHÖ\u0001J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001eR\u0016\u0010\r\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"¨\u0006="}, bng = {"Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "Landroid/os/Parcelable;", "id", "", "userId", "", "type", "amount", "Ljava/math/BigDecimal;", "authAmount", "enrolledAmount", "enrolledSumAmount", "holdAmount", "ordersAmount", "currency", "", "tournamentName", "isFiat", "", "(JIILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Z)V", "getAmount", "()Ljava/math/BigDecimal;", "getAuthAmount", "getCurrency", "()Ljava/lang/String;", "getEnrolledAmount", "getEnrolledSumAmount", "getHoldAmount", "getId", "()J", "()Z", "getOrdersAmount", "getTournamentName", "getType", "()I", "getUserId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "core_release"})
/* compiled from: Balance.kt */
public final class b implements Parcelable {
    public static final Creator CREATOR = new b();
    public static final a bul = new a();
    @SerializedName("amount")
    private final BigDecimal bub;
    @SerializedName("user_id")
    private final int buc;
    @SerializedName("auth_amount")
    private final BigDecimal bud;
    @SerializedName("enrolled_amount")
    private final BigDecimal bue;
    @SerializedName("enrolled_sum_amount")
    private final BigDecimal buh;
    @SerializedName("hold_amount")
    private final BigDecimal bui;
    @SerializedName("orders_amount")
    private final BigDecimal buj;
    @SerializedName("is_fiat")
    private final boolean buk;
    @SerializedName("currency")
    private final String currency;
    @SerializedName("id")
    private final long id;
    @SerializedName("tournament_name")
    private final String tournamentName;
    @SerializedName("type")
    private final int type;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/core/microservices/internalbilling/response/Balance$Companion;", "", "()V", "TYPE_CRYPTO", "", "TYPE_DEMO", "TYPE_MAIN", "TYPE_PRACTICE", "TYPE_TOURNAMENT", "TYPE_UNKNOWN", "core_release"})
    /* compiled from: Balance.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15})
    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new b(parcel.readLong(), parcel.readInt(), parcel.readInt(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public b() {
        this(0, 0, 0, null, null, null, null, null, null, null, null, false, 4095, null);
    }

    public static /* synthetic */ b a(b bVar, long j, int i, int i2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str, String str2, boolean z, int i3, Object obj) {
        b bVar2 = bVar;
        int i4 = i3;
        return bVar.a((i4 & 1) != 0 ? bVar2.id : j, (i4 & 2) != 0 ? bVar2.buc : i, (i4 & 4) != 0 ? bVar2.type : i2, (i4 & 8) != 0 ? bVar2.bub : bigDecimal, (i4 & 16) != 0 ? bVar2.bud : bigDecimal2, (i4 & 32) != 0 ? bVar2.bue : bigDecimal3, (i4 & 64) != 0 ? bVar2.buh : bigDecimal4, (i4 & 128) != 0 ? bVar2.bui : bigDecimal5, (i4 & 256) != 0 ? bVar2.buj : bigDecimal6, (i4 & 512) != 0 ? bVar2.currency : str, (i4 & 1024) != 0 ? bVar2.tournamentName : str2, (i4 & 2048) != 0 ? bVar2.buk : z);
    }

    public final b a(long j, int i, int i2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str, String str2, boolean z) {
        BigDecimal bigDecimal7 = bigDecimal;
        kotlin.jvm.internal.i.f(bigDecimal7, "amount");
        BigDecimal bigDecimal8 = bigDecimal3;
        kotlin.jvm.internal.i.f(bigDecimal8, "enrolledAmount");
        BigDecimal bigDecimal9 = bigDecimal4;
        kotlin.jvm.internal.i.f(bigDecimal9, "enrolledSumAmount");
        BigDecimal bigDecimal10 = bigDecimal5;
        kotlin.jvm.internal.i.f(bigDecimal10, "holdAmount");
        BigDecimal bigDecimal11 = bigDecimal6;
        kotlin.jvm.internal.i.f(bigDecimal11, "ordersAmount");
        String str3 = str;
        kotlin.jvm.internal.i.f(str3, "currency");
        return new b(j, i, i2, bigDecimal7, bigDecimal2, bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11, str3, str2, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if ((this.id == bVar.id ? 1 : null) != null) {
                    if ((this.buc == bVar.buc ? 1 : null) != null) {
                        if ((this.type == bVar.type ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bub, bVar.bub) && kotlin.jvm.internal.i.y(this.bud, bVar.bud) && kotlin.jvm.internal.i.y(this.bue, bVar.bue) && kotlin.jvm.internal.i.y(this.buh, bVar.buh) && kotlin.jvm.internal.i.y(this.bui, bVar.bui) && kotlin.jvm.internal.i.y(this.buj, bVar.buj) && kotlin.jvm.internal.i.y(this.currency, bVar.currency) && kotlin.jvm.internal.i.y(this.tournamentName, bVar.tournamentName)) {
                            if ((this.buk == bVar.buk ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.id;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + this.buc) * 31) + this.type) * 31;
        BigDecimal bigDecimal = this.bub;
        int i2 = 0;
        i = (i + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31;
        bigDecimal = this.bud;
        i = (i + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31;
        bigDecimal = this.bue;
        i = (i + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31;
        bigDecimal = this.buh;
        i = (i + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31;
        bigDecimal = this.bui;
        i = (i + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31;
        bigDecimal = this.buj;
        i = (i + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31;
        String str = this.currency;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.tournamentName;
        if (str != null) {
            i2 = str.hashCode();
        }
        i = (i + i2) * 31;
        int i3 = this.buk;
        if (i3 != 0) {
            i3 = 1;
        }
        return i + i3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Balance(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.buc);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", amount=");
        stringBuilder.append(this.bub);
        stringBuilder.append(", authAmount=");
        stringBuilder.append(this.bud);
        stringBuilder.append(", enrolledAmount=");
        stringBuilder.append(this.bue);
        stringBuilder.append(", enrolledSumAmount=");
        stringBuilder.append(this.buh);
        stringBuilder.append(", holdAmount=");
        stringBuilder.append(this.bui);
        stringBuilder.append(", ordersAmount=");
        stringBuilder.append(this.buj);
        stringBuilder.append(", currency=");
        stringBuilder.append(this.currency);
        stringBuilder.append(", tournamentName=");
        stringBuilder.append(this.tournamentName);
        stringBuilder.append(", isFiat=");
        stringBuilder.append(this.buk);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeInt(this.buc);
        parcel.writeInt(this.type);
        parcel.writeSerializable(this.bub);
        parcel.writeSerializable(this.bud);
        parcel.writeSerializable(this.bue);
        parcel.writeSerializable(this.buh);
        parcel.writeSerializable(this.bui);
        parcel.writeSerializable(this.buj);
        parcel.writeString(this.currency);
        parcel.writeString(this.tournamentName);
        parcel.writeInt(this.buk);
    }

    public b(long j, int i, int i2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str, String str2, boolean z) {
        kotlin.jvm.internal.i.f(bigDecimal, "amount");
        kotlin.jvm.internal.i.f(bigDecimal3, "enrolledAmount");
        kotlin.jvm.internal.i.f(bigDecimal4, "enrolledSumAmount");
        kotlin.jvm.internal.i.f(bigDecimal5, "holdAmount");
        kotlin.jvm.internal.i.f(bigDecimal6, "ordersAmount");
        kotlin.jvm.internal.i.f(str, "currency");
        this.id = j;
        this.buc = i;
        this.type = i2;
        this.bub = bigDecimal;
        this.bud = bigDecimal2;
        this.bue = bigDecimal3;
        this.buh = bigDecimal4;
        this.bui = bigDecimal5;
        this.buj = bigDecimal6;
        this.currency = str;
        this.tournamentName = str2;
        this.buk = z;
    }

    public final long getId() {
        return this.id;
    }

    public final int getType() {
        return this.type;
    }

    public /* synthetic */ b(long j, int i, int i2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str, String str2, boolean z, int i3, f fVar) {
        BigDecimal bigDecimal7;
        BigDecimal bigDecimal8;
        BigDecimal bigDecimal9;
        BigDecimal bigDecimal10;
        BigDecimal bigDecimal11;
        int i4 = i3;
        long j2 = (i4 & 1) != 0 ? -1 : j;
        int i5 = (i4 & 2) != 0 ? -1 : i;
        int i6 = (i4 & 4) != 0 ? 0 : i2;
        String str3 = "BigDecimal.ZERO";
        if ((i4 & 8) != 0) {
            bigDecimal7 = BigDecimal.ZERO;
            kotlin.jvm.internal.i.e(bigDecimal7, str3);
        } else {
            bigDecimal7 = bigDecimal;
        }
        BigDecimal bigDecimal12 = (i4 & 16) != 0 ? (BigDecimal) null : bigDecimal2;
        if ((i4 & 32) != 0) {
            bigDecimal8 = BigDecimal.ZERO;
            kotlin.jvm.internal.i.e(bigDecimal8, str3);
        } else {
            bigDecimal8 = bigDecimal3;
        }
        if ((i4 & 64) != 0) {
            bigDecimal9 = BigDecimal.ZERO;
            kotlin.jvm.internal.i.e(bigDecimal9, str3);
        } else {
            bigDecimal9 = bigDecimal4;
        }
        if ((i4 & 128) != 0) {
            bigDecimal10 = BigDecimal.ZERO;
            kotlin.jvm.internal.i.e(bigDecimal10, str3);
        } else {
            bigDecimal10 = bigDecimal5;
        }
        if ((i4 & 256) != 0) {
            bigDecimal11 = BigDecimal.ZERO;
            kotlin.jvm.internal.i.e(bigDecimal11, str3);
        } else {
            bigDecimal11 = bigDecimal6;
        }
        this(j2, i5, i6, bigDecimal7, bigDecimal12, bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11, (i4 & 512) != 0 ? "" : str, (i4 & 1024) != 0 ? (String) null : str2, (i4 & 2048) != 0 ? true : z);
    }

    public final BigDecimal aeo() {
        return this.bub;
    }

    public final BigDecimal aep() {
        return this.bud;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String aeq() {
        return this.tournamentName;
    }
}
