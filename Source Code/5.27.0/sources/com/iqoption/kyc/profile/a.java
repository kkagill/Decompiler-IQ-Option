package com.iqoption.kyc.profile;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00108J\t\u00109\u001a\u00020:HÖ\u0001J\u0013\u0010;\u001a\u00020\u00072\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020:HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\u0019\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020:HÖ\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\u0006\u0010#\"\u0004\b$\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010\u0013¨\u0006E"}, bng = {"Lcom/iqoption/kyc/profile/KycProfile;", "Landroid/os/Parcelable;", "firstName", "", "lastName", "birthDate", "isMale", "", "countryId", "", "citizenCountryId", "nationality", "city", "postalIndex", "address", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getBirthDate", "setBirthDate", "getCitizenCountryId", "()Ljava/lang/Long;", "setCitizenCountryId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCity", "setCity", "getCountryId", "setCountryId", "getFirstName", "setFirstName", "isFilled", "()Z", "()Ljava/lang/Boolean;", "setMale", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLastName", "setLastName", "getNationality", "setNationality", "getPostalIndex", "setPostalIndex", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/iqoption/kyc/profile/KycProfile;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "kyc_release"})
/* compiled from: KycProfile.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new a();
    private String aZD;
    private String address;
    private String birthDate;
    private Long bjM;
    private String city;
    private Boolean dBk;
    private Long dBl;
    private String firstName;
    private String lastName;
    private String nationality;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean valueOf;
            kotlin.jvm.internal.i.f(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                valueOf = null;
            }
            return new a(readString, readString2, readString3, valueOf, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ a a(a aVar, String str, String str2, String str3, Boolean bool, Long l, Long l2, String str4, String str5, String str6, String str7, int i, Object obj) {
        a aVar2 = aVar;
        int i2 = i;
        return aVar.a((i2 & 1) != 0 ? aVar2.firstName : str, (i2 & 2) != 0 ? aVar2.lastName : str2, (i2 & 4) != 0 ? aVar2.birthDate : str3, (i2 & 8) != 0 ? aVar2.dBk : bool, (i2 & 16) != 0 ? aVar2.bjM : l, (i2 & 32) != 0 ? aVar2.dBl : l2, (i2 & 64) != 0 ? aVar2.nationality : str4, (i2 & 128) != 0 ? aVar2.city : str5, (i2 & 256) != 0 ? aVar2.aZD : str6, (i2 & 512) != 0 ? aVar2.address : str7);
    }

    public final a a(String str, String str2, String str3, Boolean bool, Long l, Long l2, String str4, String str5, String str6, String str7) {
        return new a(str, str2, str3, bool, l, l2, str4, str5, str6, str7);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:22:0x006a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.address, r3.address) != false) goto L_0x006f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x006f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.kyc.profile.a;
        if (r0 == 0) goto L_0x006d;
    L_0x0006:
        r3 = (com.iqoption.kyc.profile.a) r3;
        r0 = r2.firstName;
        r1 = r3.firstName;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0012:
        r0 = r2.lastName;
        r1 = r3.lastName;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x001c:
        r0 = r2.birthDate;
        r1 = r3.birthDate;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0026:
        r0 = r2.dBk;
        r1 = r3.dBk;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0030:
        r0 = r2.bjM;
        r1 = r3.bjM;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x003a:
        r0 = r2.dBl;
        r1 = r3.dBl;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0044:
        r0 = r2.nationality;
        r1 = r3.nationality;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x004e:
        r0 = r2.city;
        r1 = r3.city;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0058:
        r0 = r2.aZD;
        r1 = r3.aZD;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0062:
        r0 = r2.address;
        r3 = r3.address;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x006d;
    L_0x006c:
        goto L_0x006f;
    L_0x006d:
        r3 = 0;
        return r3;
    L_0x006f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.profile.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.firstName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.lastName;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.birthDate;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.dBk;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.bjM;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.dBl;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str2 = this.nationality;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.city;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.aZD;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.address;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycProfile(firstName=");
        stringBuilder.append(this.firstName);
        stringBuilder.append(", lastName=");
        stringBuilder.append(this.lastName);
        stringBuilder.append(", birthDate=");
        stringBuilder.append(this.birthDate);
        stringBuilder.append(", isMale=");
        stringBuilder.append(this.dBk);
        stringBuilder.append(", countryId=");
        stringBuilder.append(this.bjM);
        stringBuilder.append(", citizenCountryId=");
        stringBuilder.append(this.dBl);
        stringBuilder.append(", nationality=");
        stringBuilder.append(this.nationality);
        stringBuilder.append(", city=");
        stringBuilder.append(this.city);
        stringBuilder.append(", postalIndex=");
        stringBuilder.append(this.aZD);
        stringBuilder.append(", address=");
        stringBuilder.append(this.address);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.birthDate);
        Boolean bool = this.dBk;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue());
        } else {
            parcel.writeInt(0);
        }
        Long l = this.bjM;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        l = this.dBl;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.nationality);
        parcel.writeString(this.city);
        parcel.writeString(this.aZD);
        parcel.writeString(this.address);
    }

    public a(String str, String str2, String str3, Boolean bool, Long l, Long l2, String str4, String str5, String str6, String str7) {
        this.firstName = str;
        this.lastName = str2;
        this.birthDate = str3;
        this.dBk = bool;
        this.bjM = l;
        this.dBl = l2;
        this.nationality = str4;
        this.city = str5;
        this.aZD = str6;
        this.address = str7;
    }

    public /* synthetic */ a(String str, String str2, String str3, Boolean bool, Long l, Long l2, String str4, String str5, String str6, String str7, int i, f fVar) {
        int i2 = i;
        String str8 = (i2 & 1) != 0 ? (String) null : str;
        this(str8, (i2 & 2) != 0 ? (String) null : str2, (i2 & 4) != 0 ? (String) null : str3, (i2 & 8) != 0 ? (Boolean) null : bool, (i2 & 16) != 0 ? (Long) null : l, (i2 & 32) != 0 ? (Long) null : l2, (i2 & 64) != 0 ? (String) null : str4, (i2 & 128) != 0 ? (String) null : str5, (i2 & 256) != 0 ? (String) null : str6, (i2 & 512) != 0 ? (String) null : str7);
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final String aLQ() {
        return this.birthDate;
    }

    public final void iQ(String str) {
        this.birthDate = str;
    }

    public final Boolean aLR() {
        return this.dBk;
    }

    public final void u(Boolean bool) {
        this.dBk = bool;
    }

    public final Long YC() {
        return this.bjM;
    }

    public final void t(Long l) {
        this.bjM = l;
    }

    public final Long aLS() {
        return this.dBl;
    }

    public final void u(Long l) {
        this.dBl = l;
    }

    public final String DX() {
        return this.nationality;
    }

    public final void dz(String str) {
        this.nationality = str;
    }

    public final String getCity() {
        return this.city;
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final String DY() {
        return this.aZD;
    }

    public final void iR(String str) {
        this.aZD = str;
    }

    public final String getAddress() {
        return this.address;
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    public final boolean aLP() {
        return (this.firstName == null || this.lastName == null || this.birthDate == null || this.dBk == null || this.bjM == null || this.nationality == null || this.city == null || this.aZD == null || this.address == null) ? false : true;
    }
}
