package com.iqoption.core.microservices.kyc.response.questionnaire;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006 "}, bng = {"Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycRiskWarning;", "Landroid/os/Parcelable;", "warningKey", "", "showWarning", "", "showUserSignatureField", "signatureRegexp", "(Ljava/lang/String;ZZLjava/lang/String;)V", "getShowUserSignatureField", "()Z", "getShowWarning", "getSignatureRegexp", "()Ljava/lang/String;", "getWarningKey", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: KycRiskWarning.kt */
public final class g implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("showUserSignatureField")
    private final boolean bvA;
    @SerializedName("signatureRegexp")
    private final String bvB;
    @SerializedName("warningKey")
    private final String bvy;
    @SerializedName("showWarning")
    private final boolean bvz;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            String readString = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new g(readString, z2, z, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new g[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (kotlin.jvm.internal.i.y(this.bvy, gVar.bvy)) {
                    if ((this.bvz == gVar.bvz ? 1 : null) != null) {
                        if ((this.bvA == gVar.bvA ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.bvB, gVar.bvB)) {
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
        String str = this.bvy;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        int i2 = this.bvz;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.bvA;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        String str2 = this.bvB;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycRiskWarning(warningKey=");
        stringBuilder.append(this.bvy);
        stringBuilder.append(", showWarning=");
        stringBuilder.append(this.bvz);
        stringBuilder.append(", showUserSignatureField=");
        stringBuilder.append(this.bvA);
        stringBuilder.append(", signatureRegexp=");
        stringBuilder.append(this.bvB);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.bvy);
        parcel.writeInt(this.bvz);
        parcel.writeInt(this.bvA);
        parcel.writeString(this.bvB);
    }

    public g(String str, boolean z, boolean z2, String str2) {
        kotlin.jvm.internal.i.f(str, "warningKey");
        this.bvy = str;
        this.bvz = z;
        this.bvA = z2;
        this.bvB = str2;
    }

    public final String afp() {
        return this.bvy;
    }

    public final boolean afq() {
        return this.bvz;
    }

    public final boolean afr() {
        return this.bvA;
    }

    public final String afs() {
        return this.bvB;
    }
}
