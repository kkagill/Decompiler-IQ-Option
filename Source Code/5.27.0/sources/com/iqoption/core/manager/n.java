package com.iqoption.core.manager;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, bng = {"Lcom/iqoption/core/manager/ChangePasswordAuthInfo;", "Lcom/iqoption/core/manager/AuthInfo;", "password", "", "confirmation", "token", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConfirmation", "()Ljava/lang/String;", "getPassword", "getToken", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: AuthInfo.kt */
public final class n extends e {
    public static final Creator CREATOR = new a();
    private final String bjI;
    private final String password;
    private final String sw;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new n(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new n[i];
        }
    }

    public static /* synthetic */ n a(n nVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nVar.password;
        }
        if ((i & 2) != 0) {
            str2 = nVar.bjI;
        }
        if ((i & 4) != 0) {
            str3 = nVar.sw;
        }
        return nVar.k(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.sw, r3.sw) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.manager.n;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.iqoption.core.manager.n) r3;
        r0 = r2.password;
        r1 = r3.password;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.bjI;
        r1 = r3.bjI;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.sw;
        r3 = r3.sw;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.manager.n.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.password;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bjI;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.sw;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final n k(String str, String str2, String str3) {
        kotlin.jvm.internal.i.f(str, "password");
        kotlin.jvm.internal.i.f(str2, "confirmation");
        return new n(str, str2, str3);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChangePasswordAuthInfo(password=");
        stringBuilder.append(this.password);
        stringBuilder.append(", confirmation=");
        stringBuilder.append(this.bjI);
        stringBuilder.append(", token=");
        stringBuilder.append(this.sw);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.password);
        parcel.writeString(this.bjI);
        parcel.writeString(this.sw);
    }

    public final String getPassword() {
        return this.password;
    }

    public final String Yw() {
        return this.bjI;
    }

    public /* synthetic */ n(String str, String str2, String str3, int i, f fVar) {
        if ((i & 4) != 0) {
            str3 = (String) null;
        }
        this(str, str2, str3);
    }

    public final String getToken() {
        return this.sw;
    }

    public n(String str, String str2, String str3) {
        kotlin.jvm.internal.i.f(str, "password");
        kotlin.jvm.internal.i.f(str2, "confirmation");
        super();
        this.password = str;
        this.bjI = str2;
        this.sw = str3;
    }
}
