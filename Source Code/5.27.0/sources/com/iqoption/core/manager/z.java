package com.iqoption.core.manager;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Jd\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\t\u0010#\u001a\u00020$HÖ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020$HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020$HÖ\u0001R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006/"}, bng = {"Lcom/iqoption/core/manager/RegisterAuthInfo;", "Lcom/iqoption/core/manager/AuthInfo;", "identifier", "", "password", "firstName", "lastName", "isGdpr", "", "countryId", "", "currencyId", "token", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getCountryId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrencyId", "getFirstName", "()Ljava/lang/String;", "getIdentifier", "()Z", "getLastName", "getPassword", "getToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/iqoption/core/manager/RegisterAuthInfo;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: AuthInfo.kt */
public final class z extends e {
    public static final Creator CREATOR = new a();
    private final boolean bjL;
    private final Long bjM;
    private final Long bjN;
    private final String firstName;
    private final String identifier;
    private final String lastName;
    private final String password;
    private final String sw;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new z(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new z[i];
        }
    }

    public static /* synthetic */ z a(z zVar, String str, String str2, String str3, String str4, boolean z, Long l, Long l2, String str5, int i, Object obj) {
        z zVar2 = zVar;
        int i2 = i;
        return zVar.a((i2 & 1) != 0 ? zVar2.identifier : str, (i2 & 2) != 0 ? zVar2.password : str2, (i2 & 4) != 0 ? zVar2.firstName : str3, (i2 & 8) != 0 ? zVar2.lastName : str4, (i2 & 16) != 0 ? zVar2.bjL : z, (i2 & 32) != 0 ? zVar2.bjM : l, (i2 & 64) != 0 ? zVar2.bjN : l2, (i2 & 128) != 0 ? zVar2.sw : str5);
    }

    public final z a(String str, String str2, String str3, String str4, boolean z, Long l, Long l2, String str5) {
        String str6 = str;
        kotlin.jvm.internal.i.f(str, "identifier");
        String str7 = str2;
        kotlin.jvm.internal.i.f(str2, "password");
        String str8 = str3;
        kotlin.jvm.internal.i.f(str3, "firstName");
        String str9 = str4;
        kotlin.jvm.internal.i.f(str4, "lastName");
        return new z(str6, str7, str8, str9, z, l, l2, str5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                if (kotlin.jvm.internal.i.y(this.identifier, zVar.identifier) && kotlin.jvm.internal.i.y(this.password, zVar.password) && kotlin.jvm.internal.i.y(this.firstName, zVar.firstName) && kotlin.jvm.internal.i.y(this.lastName, zVar.lastName)) {
                    if (!((this.bjL == zVar.bjL ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bjM, zVar.bjM) && kotlin.jvm.internal.i.y(this.bjN, zVar.bjN) && kotlin.jvm.internal.i.y(this.sw, zVar.sw))) {
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
        str2 = this.firstName;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.lastName;
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
        stringBuilder.append("RegisterAuthInfo(identifier=");
        stringBuilder.append(this.identifier);
        stringBuilder.append(", password=");
        stringBuilder.append(this.password);
        stringBuilder.append(", firstName=");
        stringBuilder.append(this.firstName);
        stringBuilder.append(", lastName=");
        stringBuilder.append(this.lastName);
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
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
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

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final boolean YB() {
        return this.bjL;
    }

    public /* synthetic */ z(String str, String str2, String str3, String str4, boolean z, Long l, Long l2, String str5, int i, f fVar) {
        int i2 = i;
        this(str, str2, str3, str4, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? (Long) null : l, (i2 & 64) != 0 ? (Long) null : l2, (i2 & 128) != 0 ? (String) null : str5);
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

    public z(String str, String str2, String str3, String str4, boolean z, Long l, Long l2, String str5) {
        kotlin.jvm.internal.i.f(str, "identifier");
        kotlin.jvm.internal.i.f(str2, "password");
        kotlin.jvm.internal.i.f(str3, "firstName");
        kotlin.jvm.internal.i.f(str4, "lastName");
        super();
        this.identifier = str;
        this.password = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.bjL = z;
        this.bjM = l;
        this.bjN = l2;
        this.sw = str5;
    }
}
