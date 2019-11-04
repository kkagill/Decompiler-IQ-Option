package com.iqoption.core.microservices.billing.verification.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003JY\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'HÖ\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00062"}, bng = {"Lcom/iqoption/core/microservices/billing/verification/response/BinInfoResult;", "Landroid/os/Parcelable;", "needKyc", "", "bin", "", "bank", "brand", "country", "icon", "color", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBank", "()Ljava/lang/String;", "setBank", "(Ljava/lang/String;)V", "getBin", "setBin", "getBrand", "setBrand", "getColor", "setColor", "getCountry", "setCountry", "getIcon", "setIcon", "getNeedKyc", "()Z", "setNeedKyc", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: BinInfoResult.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("need_kyc")
    private boolean boL;
    @SerializedName("bin")
    private String boM;
    @SerializedName("bank")
    private String boN;
    @SerializedName("brand")
    private String boO;
    @SerializedName("icon")
    private String boP;
    @SerializedName("color")
    private String boQ;
    @SerializedName("country")
    private String country;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new a(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
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
                if (!((this.boL == aVar.boL ? 1 : null) != null && kotlin.jvm.internal.i.y(this.boM, aVar.boM) && kotlin.jvm.internal.i.y(this.boN, aVar.boN) && kotlin.jvm.internal.i.y(this.boO, aVar.boO) && kotlin.jvm.internal.i.y(this.country, aVar.country) && kotlin.jvm.internal.i.y(this.boP, aVar.boP) && kotlin.jvm.internal.i.y(this.boQ, aVar.boQ))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.boL;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        String str = this.boM;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.boN;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.boO;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.country;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.boP;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.boQ;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BinInfoResult(needKyc=");
        stringBuilder.append(this.boL);
        stringBuilder.append(", bin=");
        stringBuilder.append(this.boM);
        stringBuilder.append(", bank=");
        stringBuilder.append(this.boN);
        stringBuilder.append(", brand=");
        stringBuilder.append(this.boO);
        stringBuilder.append(", country=");
        stringBuilder.append(this.country);
        stringBuilder.append(", icon=");
        stringBuilder.append(this.boP);
        stringBuilder.append(", color=");
        stringBuilder.append(this.boQ);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeInt(this.boL);
        parcel.writeString(this.boM);
        parcel.writeString(this.boN);
        parcel.writeString(this.boO);
        parcel.writeString(this.country);
        parcel.writeString(this.boP);
        parcel.writeString(this.boQ);
    }

    public a(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        kotlin.jvm.internal.i.f(str, "bin");
        this.boL = z;
        this.boM = str;
        this.boN = str2;
        this.boO = str3;
        this.country = str4;
        this.boP = str5;
        this.boQ = str6;
    }

    public final boolean aaZ() {
        return this.boL;
    }
}
