package com.iqoption.core.manager;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.iqoption.core.microservices.auth.response.VerifyMethod;
import com.iqoption.core.microservices.auth.response.VerifyType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\u0006\u0010\u001f\u001a\u00020 J\t\u0010!\u001a\u00020\u001aHÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006("}, bng = {"Lcom/iqoption/core/manager/VerifyInfo;", "Landroid/os/Parcelable;", "authInfo", "Lcom/iqoption/core/manager/AuthInfo;", "method", "Lcom/iqoption/core/microservices/auth/response/VerifyMethod;", "token", "", "phoneMask", "code", "(Lcom/iqoption/core/manager/AuthInfo;Lcom/iqoption/core/microservices/auth/response/VerifyMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthInfo", "()Lcom/iqoption/core/manager/AuthInfo;", "getCode", "()Ljava/lang/String;", "getMethod", "()Lcom/iqoption/core/microservices/auth/response/VerifyMethod;", "getPhoneMask", "getToken", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "getVerifyType", "Lcom/iqoption/core/microservices/auth/response/VerifyType;", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: VerifyInfo.kt */
public final class af implements Parcelable {
    public static final Creator CREATOR = new a();
    private final VerifyMethod biR;
    private final e biS;
    private final String code;
    private final String phoneMask;
    private final String sw;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new af((e) parcel.readParcelable(af.class.getClassLoader()), (VerifyMethod) Enum.valueOf(VerifyMethod.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new af[i];
        }
    }

    public static /* synthetic */ af a(af afVar, e eVar, VerifyMethod verifyMethod, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = afVar.biS;
        }
        if ((i & 2) != 0) {
            verifyMethod = afVar.biR;
        }
        VerifyMethod verifyMethod2 = verifyMethod;
        if ((i & 4) != 0) {
            str = afVar.sw;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = afVar.phoneMask;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = afVar.code;
        }
        return afVar.a(eVar, verifyMethod2, str4, str5, str3);
    }

    public final af a(e eVar, VerifyMethod verifyMethod, String str, String str2, String str3) {
        kotlin.jvm.internal.i.f(eVar, "authInfo");
        kotlin.jvm.internal.i.f(verifyMethod, "method");
        kotlin.jvm.internal.i.f(str, "token");
        kotlin.jvm.internal.i.f(str2, "phoneMask");
        return new af(eVar, verifyMethod, str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (kotlin.jvm.internal.i.y(r2.code, r3.code) != false) goto L_0x003d;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x003d;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.manager.af;
        if (r0 == 0) goto L_0x003b;
    L_0x0006:
        r3 = (com.iqoption.core.manager.af) r3;
        r0 = r2.biS;
        r1 = r3.biS;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0012:
        r0 = r2.biR;
        r1 = r3.biR;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x001c:
        r0 = r2.sw;
        r1 = r3.sw;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0026:
        r0 = r2.phoneMask;
        r1 = r3.phoneMask;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0030:
        r0 = r2.code;
        r3 = r3.code;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.manager.af.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        e eVar = this.biS;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        VerifyMethod verifyMethod = this.biR;
        hashCode = (hashCode + (verifyMethod != null ? verifyMethod.hashCode() : 0)) * 31;
        String str = this.sw;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.phoneMask;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.code;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VerifyInfo(authInfo=");
        stringBuilder.append(this.biS);
        stringBuilder.append(", method=");
        stringBuilder.append(this.biR);
        stringBuilder.append(", token=");
        stringBuilder.append(this.sw);
        stringBuilder.append(", phoneMask=");
        stringBuilder.append(this.phoneMask);
        stringBuilder.append(", code=");
        stringBuilder.append(this.code);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeParcelable(this.biS, i);
        parcel.writeString(this.biR.name());
        parcel.writeString(this.sw);
        parcel.writeString(this.phoneMask);
        parcel.writeString(this.code);
    }

    public af(e eVar, VerifyMethod verifyMethod, String str, String str2, String str3) {
        kotlin.jvm.internal.i.f(eVar, "authInfo");
        kotlin.jvm.internal.i.f(verifyMethod, "method");
        kotlin.jvm.internal.i.f(str, "token");
        kotlin.jvm.internal.i.f(str2, "phoneMask");
        this.biS = eVar;
        this.biR = verifyMethod;
        this.sw = str;
        this.phoneMask = str2;
        this.code = str3;
    }

    public final e Yf() {
        return this.biS;
    }

    public final VerifyMethod Ye() {
        return this.biR;
    }

    public final String getToken() {
        return this.sw;
    }

    public final String Yd() {
        return this.phoneMask;
    }

    public /* synthetic */ af(e eVar, VerifyMethod verifyMethod, String str, String str2, String str3, int i, f fVar) {
        if ((i & 16) != 0) {
            str3 = (String) null;
        }
        this(eVar, verifyMethod, str, str2, str3);
    }

    public final String getCode() {
        return this.code;
    }

    public final VerifyType YO() {
        return this.biS.a(this.biR);
    }
}
