package com.iqoption.core.microservices.core.response;

import com.google.gson.annotations.JsonAdapter;
import com.iqoption.core.data.model.user.Gender;
import com.iqoption.core.microservices.busapi.response.a;
import com.iqoption.core.microservices.busapi.response.b;
import java.util.List;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@JsonAdapter(ProfileJsonDeserializer.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BÃ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020\u0007\u0012\b\b\u0002\u0010\"\u001a\u00020\u0013\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010)\u001a\u00020\u0013¢\u0006\u0002\u0010*R\u0011\u0010\u0019\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b2\u0010,R\u0011\u0010!\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001d\u00105\u001a\u0004\u0018\u00010\t8FX\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b6\u0010,R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u00100R\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u00104R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b;\u0010,R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b<\u0010,R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b=\u0010,R\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u00100R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u00100R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010.R\u0011\u0010)\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010.R\u0011\u0010\"\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010.R\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bF\u0010,R\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bG\u0010,R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u0011\u0010\u001b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bI\u0010,R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010,R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bK\u0010,R\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u001d\u0010\u0018\u001a\u0004\u0018\u00010\t8FX\u0002¢\u0006\f\n\u0004\bO\u00108\u001a\u0004\bN\u0010,R!\u0010P\u001a\b\u0012\u0004\u0012\u00020\t0Q8BX\u0002¢\u0006\f\n\u0004\bT\u00108\u001a\u0004\bR\u0010SR\u0011\u0010\u001a\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bU\u0010,R\u0011\u0010\u001e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bV\u0010,R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bW\u0010,R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bX\u0010Y¨\u0006Z"}, bng = {"Lcom/iqoption/core/microservices/core/response/Profile;", "", "id", "", "balanceId", "groupId", "messages", "", "firstName", "", "lastName", "nickname", "birthdate", "email", "newEmail", "tin", "city", "locale", "isEmailConfirmed", "", "authTwoFactor", "depositCount", "flag", "countryId", "phone", "address", "postalIndex", "nationality", "gender", "Lcom/iqoption/core/data/model/user/Gender;", "skey", "userGroup", "Lcom/iqoption/core/microservices/core/response/UserGroup;", "clientCategoryId", "isTrial", "personalDataPolicy", "Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;", "forgetStatus", "Lcom/iqoption/core/microservices/busapi/response/ForgetUserData;", "kyc", "Lcom/iqoption/core/microservices/core/response/Kyc;", "isPublic", "(JJJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/iqoption/core/data/model/user/Gender;Ljava/lang/String;Lcom/iqoption/core/microservices/core/response/UserGroup;IZLcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;Lcom/iqoption/core/microservices/busapi/response/ForgetUserData;Lcom/iqoption/core/microservices/core/response/Kyc;Z)V", "getAddress", "()Ljava/lang/String;", "getAuthTwoFactor", "()Z", "getBalanceId", "()J", "getBirthdate", "getCity", "getClientCategoryId", "()I", "countryCode", "getCountryCode", "countryCode$delegate", "Lkotlin/Lazy;", "getCountryId", "getDepositCount", "getEmail", "getFirstName", "getFlag", "getForgetStatus", "()Lcom/iqoption/core/microservices/busapi/response/ForgetUserData;", "getGender", "()Lcom/iqoption/core/data/model/user/Gender;", "getGroupId", "getId", "getKyc", "()Lcom/iqoption/core/microservices/core/response/Kyc;", "getLastName", "getLocale", "getMessages", "getNationality", "getNewEmail", "getNickname", "getPersonalDataPolicy", "()Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;", "getPhone", "phone$delegate", "phoneParts", "", "getPhoneParts", "()Ljava/util/List;", "phoneParts$delegate", "getPostalIndex", "getSkey", "getTin", "getUserGroup", "()Lcom/iqoption/core/microservices/core/response/UserGroup;", "core_release"})
/* compiled from: Profile.kt */
public final class g {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(g.class), "phoneParts", "getPhoneParts()Ljava/util/List;")), k.a(new PropertyReference1Impl(k.G(g.class), "countryCode", "getCountryCode()Ljava/lang/String;")), k.a(new PropertyReference1Impl(k.G(g.class), "phone", "getPhone()Ljava/lang/String;"))};
    private final boolean aZB;
    private final long aZC;
    private final String aZD;
    private final String aZF;
    private final b aZG;
    private final String address;
    private final String arB;
    private final String arI;
    private final long arN;
    private final Gender arO;
    private final String arS;
    private final long arT;
    private final int arV;
    private final int bsA;
    private final a bsB;
    private final d bsC;
    private final d bst;
    private final d bsu;
    private final d bsv;
    private final long bsw;
    private final boolean bsx;
    private final boolean bsy;
    private final UserGroup bsz;
    private final String city;
    private final String email;
    private final String firstName;
    private final String flag;
    private final long id;
    private final boolean isPublic;
    private final String lastName;
    private final String locale;
    private final int messages;
    private final String nationality;

    public g() {
        this(0, 0, 0, 0, null, null, null, 0, null, null, null, null, null, false, false, 0, null, 0, null, null, null, null, null, null, null, 0, false, null, null, null, false, Integer.MAX_VALUE, null);
    }

    private final List<String> adi() {
        d dVar = this.bst;
        j jVar = anY[0];
        return (List) dVar.getValue();
    }

    public final String getPhone() {
        d dVar = this.bsv;
        j jVar = anY[2];
        return (String) dVar.getValue();
    }

    public g(long j, long j2, long j3, int i, String str, String str2, String str3, long j4, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, int i2, String str9, long j5, String str10, String str11, String str12, String str13, Gender gender, String str14, UserGroup userGroup, int i3, boolean z3, b bVar, a aVar, d dVar, boolean z4) {
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        String str23 = str9;
        String str24 = str10;
        String str25 = str11;
        String str26 = str12;
        String str27 = str13;
        String str28 = str14;
        UserGroup userGroup2 = userGroup;
        kotlin.jvm.internal.i.f(str15, "firstName");
        kotlin.jvm.internal.i.f(str16, "lastName");
        kotlin.jvm.internal.i.f(str17, "nickname");
        kotlin.jvm.internal.i.f(str18, "email");
        kotlin.jvm.internal.i.f(str19, "newEmail");
        kotlin.jvm.internal.i.f(str20, "tin");
        kotlin.jvm.internal.i.f(str21, "city");
        kotlin.jvm.internal.i.f(str22, "locale");
        kotlin.jvm.internal.i.f(str23, "flag");
        kotlin.jvm.internal.i.f(str24, "phone");
        kotlin.jvm.internal.i.f(str25, "address");
        kotlin.jvm.internal.i.f(str26, "postalIndex");
        kotlin.jvm.internal.i.f(str27, "nationality");
        kotlin.jvm.internal.i.f(str28, "skey");
        kotlin.jvm.internal.i.f(userGroup2, "userGroup");
        this.id = j;
        this.aZC = j2;
        this.bsw = j3;
        this.messages = i;
        this.firstName = str15;
        this.lastName = str16;
        this.aZF = str17;
        this.arT = j4;
        this.email = str18;
        this.arB = str19;
        this.arI = str20;
        this.city = str21;
        this.locale = str22;
        this.bsx = z;
        this.bsy = z2;
        this.arV = i2;
        this.flag = str23;
        this.arN = j5;
        this.address = str25;
        this.aZD = str26;
        this.nationality = str27;
        this.arO = gender;
        this.arS = str14;
        this.bsz = userGroup;
        this.bsA = i3;
        this.aZB = z3;
        this.aZG = bVar;
        this.bsB = aVar;
        this.bsC = dVar;
        this.isPublic = z4;
        this.bst = g.c(new Profile$phoneParts$2(str24));
        this.bsu = g.c(new Profile$countryCode$2(this));
        this.bsv = g.c(new Profile$phone$2(this));
    }

    public final long getId() {
        return this.id;
    }

    public final long DH() {
        return this.aZC;
    }

    public final long adj() {
        return this.bsw;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final long DU() {
        return this.arT;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final int Es() {
        return this.arV;
    }

    public final long El() {
        return this.arN;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String DY() {
        return this.aZD;
    }

    public final String DX() {
        return this.nationality;
    }

    public /* synthetic */ g(long j, long j2, long j3, int i, String str, String str2, String str3, long j4, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, int i2, String str9, long j5, String str10, String str11, String str12, String str13, Gender gender, String str14, UserGroup userGroup, int i3, boolean z3, b bVar, a aVar, d dVar, boolean z4, int i4, f fVar) {
        int i5 = i4;
        long j6 = (i5 & 1) != 0 ? -1 : j;
        String str15 = "";
        String str16 = str15;
        this(j6, (i5 & 2) != 0 ? -1 : j2, (i5 & 4) != 0 ? -1 : j3, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? str15 : str, (i5 & 32) != 0 ? str15 : str2, (i5 & 64) != 0 ? str15 : str3, (i5 & 128) != 0 ? 0 : j4, (i5 & 256) != 0 ? str15 : str4, (i5 & 512) != 0 ? str15 : str5, (i5 & 1024) != 0 ? str15 : str6, (i5 & 2048) != 0 ? str16 : str7, (i5 & 4096) != 0 ? "en_US" : str8, (i5 & 8192) != 0 ? false : z, (i5 & 16384) != 0 ? false : z2, (i5 & 32768) != 0 ? 0 : i2, (i5 & 65536) != 0 ? str16 : str9, (i5 & 131072) != 0 ? -1 : j5, (i5 & 262144) != 0 ? str16 : str10, (i5 & 524288) != 0 ? str16 : str11, (i5 & 1048576) != 0 ? str16 : str12, (i5 & 2097152) != 0 ? str16 : str13, (i5 & 4194304) != 0 ? (Gender) null : gender, (i5 & 8388608) != 0 ? str16 : str14, (i5 & 16777216) != 0 ? UserGroup.DEFAULT : userGroup, (i5 & 33554432) != 0 ? 0 : i3, (i5 & 67108864) != 0 ? false : z3, (i5 & 134217728) != 0 ? (b) null : bVar, (i5 & 268435456) != 0 ? (a) null : aVar, (i5 & 536870912) != 0 ? (d) null : dVar, (i5 & 1073741824) != 0 ? false : z4);
    }

    public final Gender DT() {
        return this.arO;
    }

    public final int adk() {
        return this.bsA;
    }

    public final boolean Ej() {
        return this.aZB;
    }

    public final b Ed() {
        return this.aZG;
    }

    public final d adl() {
        return this.bsC;
    }
}
