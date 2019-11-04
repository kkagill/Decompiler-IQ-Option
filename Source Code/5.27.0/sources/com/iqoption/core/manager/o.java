package com.iqoption.core.manager;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.iqoption.core.microservices.core.register.SocialTypeId;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006$"}, bng = {"Lcom/iqoption/core/manager/CheckSocialAuthInfo;", "Lcom/iqoption/core/manager/AuthInfo;", "socialTypeId", "Lcom/iqoption/core/microservices/core/register/SocialTypeId;", "userSocialId", "", "appKey", "accessToken", "token", "(Lcom/iqoption/core/microservices/core/register/SocialTypeId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getAppKey", "getSocialTypeId", "()Lcom/iqoption/core/microservices/core/register/SocialTypeId;", "getToken", "getUserSocialId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: AuthInfo.kt */
public final class o extends e {
    public static final Creator CREATOR = new a();
    private final String arD;
    private final SocialTypeId bjJ;
    private final String bjK;
    private final String sR;
    private final String sw;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new o((SocialTypeId) Enum.valueOf(SocialTypeId.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new o[i];
        }
    }

    public static /* synthetic */ o a(o oVar, SocialTypeId socialTypeId, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            socialTypeId = oVar.bjJ;
        }
        if ((i & 2) != 0) {
            str = oVar.arD;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = oVar.bjK;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = oVar.sR;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = oVar.sw;
        }
        return oVar.a(socialTypeId, str5, str6, str7, str4);
    }

    public final o a(SocialTypeId socialTypeId, String str, String str2, String str3, String str4) {
        kotlin.jvm.internal.i.f(socialTypeId, "socialTypeId");
        kotlin.jvm.internal.i.f(str, "userSocialId");
        kotlin.jvm.internal.i.f(str2, "appKey");
        return new o(socialTypeId, str, str2, str3, str4);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (kotlin.jvm.internal.i.y(r2.sw, r3.sw) != false) goto L_0x003d;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x003d;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.manager.o;
        if (r0 == 0) goto L_0x003b;
    L_0x0006:
        r3 = (com.iqoption.core.manager.o) r3;
        r0 = r2.bjJ;
        r1 = r3.bjJ;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0012:
        r0 = r2.arD;
        r1 = r3.arD;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x001c:
        r0 = r2.bjK;
        r1 = r3.bjK;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0026:
        r0 = r2.sR;
        r1 = r3.sR;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0030:
        r0 = r2.sw;
        r3 = r3.sw;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003d;
    L_0x003b:
        r3 = 0;
        return r3;
    L_0x003d:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.manager.o.equals(java.lang.Object):boolean");
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
        str = this.sw;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CheckSocialAuthInfo(socialTypeId=");
        stringBuilder.append(this.bjJ);
        stringBuilder.append(", userSocialId=");
        stringBuilder.append(this.arD);
        stringBuilder.append(", appKey=");
        stringBuilder.append(this.bjK);
        stringBuilder.append(", accessToken=");
        stringBuilder.append(this.sR);
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

    public /* synthetic */ o(SocialTypeId socialTypeId, String str, String str2, String str3, String str4, int i, f fVar) {
        if ((i & 16) != 0) {
            str4 = (String) null;
        }
        this(socialTypeId, str, str2, str3, str4);
    }

    public final String getToken() {
        return this.sw;
    }

    public o(SocialTypeId socialTypeId, String str, String str2, String str3, String str4) {
        kotlin.jvm.internal.i.f(socialTypeId, "socialTypeId");
        kotlin.jvm.internal.i.f(str, "userSocialId");
        kotlin.jvm.internal.i.f(str2, "appKey");
        super();
        this.bjJ = socialTypeId;
        this.arD = str;
        this.bjK = str2;
        this.sR = str3;
        this.sw = str4;
    }
}
