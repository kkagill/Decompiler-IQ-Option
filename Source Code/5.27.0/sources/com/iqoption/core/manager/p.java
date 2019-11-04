package com.iqoption.core.manager;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JP\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eHÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006)"}, bng = {"Lcom/iqoption/core/manager/EndTrialAuthInfo;", "Lcom/iqoption/core/manager/AuthInfo;", "identifier", "", "password", "isGdpr", "", "countryId", "", "currencyId", "token", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getCountryId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrencyId", "getIdentifier", "()Ljava/lang/String;", "()Z", "getPassword", "getToken", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/iqoption/core/manager/EndTrialAuthInfo;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: AuthInfo.kt */
public final class p extends e {
    public static final Creator CREATOR = new a();
    private final boolean bjL;
    private final Long bjM;
    private final Long bjN;
    private final String identifier;
    private final String password;
    private final String sw;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new p(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new p[i];
        }
    }

    public static /* synthetic */ p a(p pVar, String str, String str2, boolean z, Long l, Long l2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pVar.identifier;
        }
        if ((i & 2) != 0) {
            str2 = pVar.password;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = pVar.bjL;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            l = pVar.bjM;
        }
        Long l3 = l;
        if ((i & 16) != 0) {
            l2 = pVar.bjN;
        }
        Long l4 = l2;
        if ((i & 32) != 0) {
            str3 = pVar.sw;
        }
        return pVar.a(str, str4, z2, l3, l4, str3);
    }

    public final p a(String str, String str2, boolean z, Long l, Long l2, String str3) {
        kotlin.jvm.internal.i.f(str, "identifier");
        kotlin.jvm.internal.i.f(str2, "password");
        return new p(str, str2, z, l, l2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (kotlin.jvm.internal.i.y(this.identifier, pVar.identifier) && kotlin.jvm.internal.i.y(this.password, pVar.password)) {
                    if (!((this.bjL == pVar.bjL ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bjM, pVar.bjM) && kotlin.jvm.internal.i.y(this.bjN, pVar.bjN) && kotlin.jvm.internal.i.y(this.sw, pVar.sw))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.identifier;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.password;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i2 = this.bjL;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        Long l = this.bjM;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.bjN;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str2 = this.sw;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EndTrialAuthInfo(identifier=");
        stringBuilder.append(this.identifier);
        stringBuilder.append(", password=");
        stringBuilder.append(this.password);
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
        parcel.writeString(this.identifier);
        parcel.writeString(this.password);
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

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getPassword() {
        return this.password;
    }

    public final boolean YB() {
        return this.bjL;
    }

    public /* synthetic */ p(String str, String str2, boolean z, Long l, Long l2, String str3, int i, f fVar) {
        boolean z2 = (i & 4) != 0 ? true : z;
        if ((i & 8) != 0) {
            l = (Long) null;
        }
        Long l3 = l;
        if ((i & 16) != 0) {
            l2 = (Long) null;
        }
        Long l4 = l2;
        if ((i & 32) != 0) {
            str3 = (String) null;
        }
        this(str, str2, z2, l3, l4, str3);
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

    public p(String str, String str2, boolean z, Long l, Long l2, String str3) {
        kotlin.jvm.internal.i.f(str, "identifier");
        kotlin.jvm.internal.i.f(str2, "password");
        super();
        this.identifier = str;
        this.password = str2;
        this.bjL = z;
        this.bjM = l;
        this.bjN = l2;
        this.sw = str3;
    }
}
