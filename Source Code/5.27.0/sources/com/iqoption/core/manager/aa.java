package com.iqoption.core.manager;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.iqoption.core.microservices.core.register.SocialTypeId;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00100J\t\u00101\u001a\u000202HÖ\u0001J\u0013\u00103\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000202HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000202HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u0006="}, bng = {"Lcom/iqoption/core/manager/SocialAuthInfo;", "Lcom/iqoption/core/manager/AuthInfo;", "socialTypeId", "Lcom/iqoption/core/microservices/core/register/SocialTypeId;", "userSocialId", "", "appKey", "accessToken", "email", "firstName", "lastName", "imageUrl", "isGdpr", "", "countryId", "", "currencyId", "token", "(Lcom/iqoption/core/microservices/core/register/SocialTypeId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getAppKey", "getCountryId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrencyId", "getEmail", "getFirstName", "getImageUrl", "()Z", "getLastName", "getSocialTypeId", "()Lcom/iqoption/core/microservices/core/register/SocialTypeId;", "getToken", "getUserSocialId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/iqoption/core/microservices/core/register/SocialTypeId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/iqoption/core/manager/SocialAuthInfo;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: AuthInfo.kt */
public final class aa extends e {
    public static final Creator CREATOR = new a();
    private final String arD;
    private final SocialTypeId bjJ;
    private final String bjK;
    private final boolean bjL;
    private final Long bjM;
    private final Long bjN;
    private final String bkn;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final String sR;
    private final String sw;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            SocialTypeId socialTypeId = (SocialTypeId) Enum.valueOf(SocialTypeId.class, parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            Long l = null;
            Long valueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            if (parcel.readInt() != 0) {
                l = Long.valueOf(parcel.readLong());
            }
            return new aa(socialTypeId, readString, readString2, readString3, readString4, readString5, readString6, readString7, z, valueOf, l, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new aa[i];
        }
    }

    public static /* synthetic */ aa a(aa aaVar, SocialTypeId socialTypeId, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Long l, Long l2, String str8, int i, Object obj) {
        aa aaVar2 = aaVar;
        int i2 = i;
        return aaVar.a((i2 & 1) != 0 ? aaVar2.bjJ : socialTypeId, (i2 & 2) != 0 ? aaVar2.arD : str, (i2 & 4) != 0 ? aaVar2.bjK : str2, (i2 & 8) != 0 ? aaVar2.sR : str3, (i2 & 16) != 0 ? aaVar2.email : str4, (i2 & 32) != 0 ? aaVar2.firstName : str5, (i2 & 64) != 0 ? aaVar2.lastName : str6, (i2 & 128) != 0 ? aaVar2.bkn : str7, (i2 & 256) != 0 ? aaVar2.bjL : z, (i2 & 512) != 0 ? aaVar2.bjM : l, (i2 & 1024) != 0 ? aaVar2.bjN : l2, (i2 & 2048) != 0 ? aaVar2.sw : str8);
    }

    public final aa a(SocialTypeId socialTypeId, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Long l, Long l2, String str8) {
        SocialTypeId socialTypeId2 = socialTypeId;
        kotlin.jvm.internal.i.f(socialTypeId, "socialTypeId");
        String str9 = str;
        kotlin.jvm.internal.i.f(str9, "userSocialId");
        String str10 = str2;
        kotlin.jvm.internal.i.f(str10, "appKey");
        String str11 = str4;
        kotlin.jvm.internal.i.f(str11, "email");
        String str12 = str5;
        kotlin.jvm.internal.i.f(str12, "firstName");
        String str13 = str6;
        kotlin.jvm.internal.i.f(str13, "lastName");
        return new aa(socialTypeId2, str9, str10, str3, str11, str12, str13, str7, z, l, l2, str8);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aa) {
                aa aaVar = (aa) obj;
                if (kotlin.jvm.internal.i.y(this.bjJ, aaVar.bjJ) && kotlin.jvm.internal.i.y(this.arD, aaVar.arD) && kotlin.jvm.internal.i.y(this.bjK, aaVar.bjK) && kotlin.jvm.internal.i.y(this.sR, aaVar.sR) && kotlin.jvm.internal.i.y(this.email, aaVar.email) && kotlin.jvm.internal.i.y(this.firstName, aaVar.firstName) && kotlin.jvm.internal.i.y(this.lastName, aaVar.lastName) && kotlin.jvm.internal.i.y(this.bkn, aaVar.bkn)) {
                    if (!((this.bjL == aaVar.bjL ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bjM, aaVar.bjM) && kotlin.jvm.internal.i.y(this.bjN, aaVar.bjN) && kotlin.jvm.internal.i.y(this.sw, aaVar.sw))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        SocialTypeId socialTypeId = this.bjJ;
        int i = 0;
        int hashCode = (socialTypeId != null ? socialTypeId.hashCode() : 0) * 31;
        String str = this.arD;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bjK;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.sR;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.email;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.firstName;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.lastName;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bkn;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        int i2 = this.bjL;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        Long l = this.bjM;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.bjN;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.sw;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SocialAuthInfo(socialTypeId=");
        stringBuilder.append(this.bjJ);
        stringBuilder.append(", userSocialId=");
        stringBuilder.append(this.arD);
        stringBuilder.append(", appKey=");
        stringBuilder.append(this.bjK);
        stringBuilder.append(", accessToken=");
        stringBuilder.append(this.sR);
        stringBuilder.append(", email=");
        stringBuilder.append(this.email);
        stringBuilder.append(", firstName=");
        stringBuilder.append(this.firstName);
        stringBuilder.append(", lastName=");
        stringBuilder.append(this.lastName);
        stringBuilder.append(", imageUrl=");
        stringBuilder.append(this.bkn);
        stringBuilder.append(", isGdpr=");
        stringBuilder.append(this.bjL);
        stringBuilder.append(", countryId=");
        stringBuilder.append(this.bjM);
        stringBuilder.append(", currencyId=");
        stringBuilder.append(this.bjN);
        stringBuilder.append(", token=");
        stringBuilder.append(this.sw);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.bjJ.name());
        parcel.writeString(this.arD);
        parcel.writeString(this.bjK);
        parcel.writeString(this.sR);
        parcel.writeString(this.email);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.bkn);
        parcel.writeInt(this.bjL);
        Long l = this.bjM;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        l = this.bjN;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.sw);
    }

    public final SocialTypeId Yx() {
        return this.bjJ;
    }

    public final String Yy() {
        return this.arD;
    }

    public final String Yz() {
        return this.bjK;
    }

    public final String YA() {
        return this.sR;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public /* synthetic */ aa(SocialTypeId socialTypeId, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Long l, Long l2, String str8, int i, f fVar) {
        int i2 = i;
        this(socialTypeId, str, str2, str3, str4, str5, str6, (i2 & 128) != 0 ? (String) null : str7, (i2 & 256) != 0 ? true : z, (i2 & 512) != 0 ? (Long) null : l, (i2 & 1024) != 0 ? (Long) null : l2, (i2 & 2048) != 0 ? (String) null : str8);
    }

    public final String YE() {
        return this.bkn;
    }

    public final boolean YB() {
        return this.bjL;
    }

    public final Long YC() {
        return this.bjM;
    }

    public final Long YD() {
        return this.bjN;
    }

    public final String getToken() {
        return this.sw;
    }

    public aa(SocialTypeId socialTypeId, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Long l, Long l2, String str8) {
        kotlin.jvm.internal.i.f(socialTypeId, "socialTypeId");
        kotlin.jvm.internal.i.f(str, "userSocialId");
        kotlin.jvm.internal.i.f(str2, "appKey");
        kotlin.jvm.internal.i.f(str4, "email");
        kotlin.jvm.internal.i.f(str5, "firstName");
        kotlin.jvm.internal.i.f(str6, "lastName");
        super();
        this.bjJ = socialTypeId;
        this.arD = str;
        this.bjK = str2;
        this.sR = str3;
        this.email = str4;
        this.firstName = str5;
        this.lastName = str6;
        this.bkn = str7;
        this.bjL = z;
        this.bjM = l;
        this.bjN = l2;
        this.sw = str8;
    }
}
