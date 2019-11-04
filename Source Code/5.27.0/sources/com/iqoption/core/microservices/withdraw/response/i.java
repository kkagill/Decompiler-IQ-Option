package com.iqoption.core.microservices.withdraw.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\r\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\r\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006 "}, bng = {"Lcom/iqoption/core/microservices/withdraw/response/UserPayoutSettings;", "Landroid/os/Parcelable;", "payoutCount", "", "limit", "commissionEnabled", "", "(IIZ)V", "getCommissionEnabled", "()Z", "getLimit", "()I", "getPayoutCount", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "freePayoutLimit", "()Ljava/lang/Integer;", "hashCode", "limitIfFeeEnabled", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: UserPayoutSettings.kt */
public final class i implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("payout_count")
    private final int bEd;
    @SerializedName("commission_enabled")
    private final boolean bEe;
    @SerializedName("limit")
    private final int limit;

    @kotlin.i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new i(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new i[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if ((this.bEd == iVar.bEd ? 1 : null) != null) {
                    if ((this.limit == iVar.limit ? 1 : null) != null) {
                        if ((this.bEe == iVar.bEe ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = ((this.bEd * 31) + this.limit) * 31;
        int i2 = this.bEe;
        if (i2 != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserPayoutSettings(payoutCount=");
        stringBuilder.append(this.bEd);
        stringBuilder.append(", limit=");
        stringBuilder.append(this.limit);
        stringBuilder.append(", commissionEnabled=");
        stringBuilder.append(this.bEe);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeInt(this.bEd);
        parcel.writeInt(this.limit);
        parcel.writeInt(this.bEe);
    }

    public i(int i, int i2, boolean z) {
        this.bEd = i;
        this.limit = i2;
        this.bEe = z;
    }

    public final Integer ajM() {
        return this.bEe ? Integer.valueOf(this.limit) : null;
    }

    public final Integer ajN() {
        return this.bEe ? Integer.valueOf(this.limit - this.bEd) : null;
    }
}
