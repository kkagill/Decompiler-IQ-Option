package com.iqoption.core.microservices.withdraw.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\u0013\u0010&\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u000bHÖ\u0001J\t\u0010*\u001a\u00020\u0004HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000bHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, bng = {"Lcom/iqoption/core/microservices/withdraw/response/PayoutField;", "Landroid/os/Parcelable;", "()V", "name", "", "langKey", "frontKey", "type", "Lcom/iqoption/core/microservices/withdraw/response/PayoutFieldType;", "regexp", "maxLength", "", "required", "", "placeholder", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/iqoption/core/microservices/withdraw/response/PayoutFieldType;Ljava/lang/String;IZLjava/lang/String;)V", "getFrontKey", "()Ljava/lang/String;", "getLangKey", "getMaxLength", "()I", "getName", "getPlaceholder", "getRegexp", "getRequired", "()Z", "getType", "()Lcom/iqoption/core/microservices/withdraw/response/PayoutFieldType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: PayoutField.kt */
public final class h implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("lang_key")
    private final String bEa;
    @SerializedName("front_key")
    private final String bEb;
    @SerializedName("type")
    private final PayoutFieldType bEc;
    @SerializedName("placeholder")
    private final String bou;
    @SerializedName("regexp")
    private final String bvx;
    @SerializedName("maxLength")
    private final int maxLength;
    @SerializedName("name")
    private final String name;
    @SerializedName("required")
    private final boolean required;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new h(parcel.readString(), parcel.readString(), parcel.readString(), (PayoutFieldType) Enum.valueOf(PayoutFieldType.class, parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new h[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (kotlin.jvm.internal.i.y(this.name, hVar.name) && kotlin.jvm.internal.i.y(this.bEa, hVar.bEa) && kotlin.jvm.internal.i.y(this.bEb, hVar.bEb) && kotlin.jvm.internal.i.y(this.bEc, hVar.bEc) && kotlin.jvm.internal.i.y(this.bvx, hVar.bvx)) {
                    if ((this.maxLength == hVar.maxLength ? 1 : null) != null) {
                        if ((this.required == hVar.required ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.bou, hVar.bou)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bEa;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bEb;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        PayoutFieldType payoutFieldType = this.bEc;
        hashCode = (hashCode + (payoutFieldType != null ? payoutFieldType.hashCode() : 0)) * 31;
        str2 = this.bvx;
        hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.maxLength) * 31;
        int i2 = this.required;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        str2 = this.bou;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PayoutField(name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", langKey=");
        stringBuilder.append(this.bEa);
        stringBuilder.append(", frontKey=");
        stringBuilder.append(this.bEb);
        stringBuilder.append(", type=");
        stringBuilder.append(this.bEc);
        stringBuilder.append(", regexp=");
        stringBuilder.append(this.bvx);
        stringBuilder.append(", maxLength=");
        stringBuilder.append(this.maxLength);
        stringBuilder.append(", required=");
        stringBuilder.append(this.required);
        stringBuilder.append(", placeholder=");
        stringBuilder.append(this.bou);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.name);
        parcel.writeString(this.bEa);
        parcel.writeString(this.bEb);
        parcel.writeString(this.bEc.name());
        parcel.writeString(this.bvx);
        parcel.writeInt(this.maxLength);
        parcel.writeInt(this.required);
        parcel.writeString(this.bou);
    }

    public h(String str, String str2, String str3, PayoutFieldType payoutFieldType, String str4, int i, boolean z, String str5) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str2, "langKey");
        kotlin.jvm.internal.i.f(str3, "frontKey");
        kotlin.jvm.internal.i.f(payoutFieldType, "type");
        kotlin.jvm.internal.i.f(str4, "regexp");
        kotlin.jvm.internal.i.f(str5, "placeholder");
        this.name = str;
        this.bEa = str2;
        this.bEb = str3;
        this.bEc = payoutFieldType;
        this.bvx = str4;
        this.maxLength = i;
        this.required = z;
        this.bou = str5;
    }

    public final String getName() {
        return this.name;
    }

    public final String ajI() {
        return this.bEa;
    }

    public final String ajJ() {
        return this.bEb;
    }

    public final PayoutFieldType ajK() {
        return this.bEc;
    }

    public final String afo() {
        return this.bvx;
    }

    public final boolean ajL() {
        return this.required;
    }

    public final String aaQ() {
        return this.bou;
    }

    public h() {
        this("", "", "", PayoutFieldType.UNKNOWN, "", 0, false, "");
    }
}
