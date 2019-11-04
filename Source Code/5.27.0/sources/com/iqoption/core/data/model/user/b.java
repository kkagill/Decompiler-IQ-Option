package com.iqoption.core.data.model.user;

import com.google.android.gms.common.Scopes;
import com.iqoption.core.e;
import com.iqoption.core.microservices.core.response.d;
import com.iqoption.core.microservices.core.response.g;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 G2\u00020\u0001:\u0001GB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\bR\u0014\u0010\u0017\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\bR\u0014\u0010#\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\bR\u0016\u0010%\u001a\u0004\u0018\u00010&8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020*8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010+R\u0014\u0010,\u001a\u00020*XD¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020*8VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0014\u0010.\u001a\u00020*8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010+R\u0014\u0010/\u001a\u00020*8VX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010+R\u0014\u00100\u001a\u00020*8VX\u0004¢\u0006\u0006\u001a\u0004\b0\u0010+R\u0014\u00101\u001a\u00020*8VX\u0004¢\u0006\u0006\u001a\u0004\b1\u0010+R\u0014\u00102\u001a\u00020*8VX\u0004¢\u0006\u0006\u001a\u0004\b2\u0010+R\u0014\u00103\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\bR\u0014\u00105\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\bR\u0016\u00107\u001a\u0004\u0018\u00010\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\bR\u0014\u00109\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\bR\u0016\u0010;\u001a\u0004\u0018\u00010<8VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0016\u0010?\u001a\u0004\u0018\u00010\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\bR\u0016\u0010A\u001a\u0004\u0018\u00010\u00068VX\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010C\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0010R\u0014\u0010E\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0010¨\u0006H"}, bng = {"Lcom/iqoption/core/data/model/user/ProfileAccount;", "Lcom/iqoption/core/IQAccount;", "profile", "Lcom/iqoption/core/microservices/core/response/Profile;", "(Lcom/iqoption/core/microservices/core/response/Profile;)V", "address", "", "getAddress", "()Ljava/lang/String;", "avatar", "Lcom/iqoption/core/microservices/avatar/Avatar;", "getAvatar", "()Lcom/iqoption/core/microservices/avatar/Avatar;", "balanceId", "", "getBalanceId", "()J", "birthdate", "getBirthdate", "city", "getCity", "countryCode", "getCountryCode", "countryId", "getCountryId", "deleteAccountStatus", "Lcom/iqoption/core/microservices/busapi/response/ForgetUserData;", "getDeleteAccountStatus", "()Lcom/iqoption/core/microservices/busapi/response/ForgetUserData;", "depositCount", "", "getDepositCount", "()I", "email", "getEmail", "firstName", "getFirstName", "gender", "Lcom/iqoption/core/data/model/user/Gender;", "getGender", "()Lcom/iqoption/core/data/model/user/Gender;", "isAuthTwoFactor", "", "()Z", "isAuthorized", "isClub", "isEmailConfirmed", "isPro", "isPublic", "isRegulated", "isTrial", "lastName", "getLastName", "locale", "getLocale", "nationality", "getNationality", "nickname", "getNickname", "personalDataPolicy", "Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;", "getPersonalDataPolicy", "()Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;", "phone", "getPhone", "postalIndex", "getPostalIndex", "userGroupId", "getUserGroupId", "userId", "getUserId", "Companion", "core_release"})
/* compiled from: ProfileAccount.kt */
public final class b implements e {
    public static final a bdg = new a();
    private final transient boolean aZA = true;
    private final g bdf;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/data/model/user/ProfileAccount$Companion;", "", "()V", "CLIENT_CATEGORY_PRO", "", "GROUP_IQ_CLUB", "", "core_release"})
    /* compiled from: ProfileAccount.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public b(g gVar) {
        kotlin.jvm.internal.i.f(gVar, Scopes.PROFILE);
        this.bdf = gVar;
    }

    public long getUserId() {
        return this.bdf.getId();
    }

    public long Et() {
        return this.bdf.adj();
    }

    public String getFirstName() {
        return this.bdf.getFirstName();
    }

    public String getLastName() {
        return this.bdf.getLastName();
    }

    public long El() {
        return this.bdf.El();
    }

    public boolean Er() {
        d adl = this.bdf.adl();
        return adl != null ? adl.adg() : false;
    }

    public boolean Ef() {
        return this.bdf.adk() == 2;
    }

    public boolean Ej() {
        return this.bdf.Ej();
    }

    public long DH() {
        return this.bdf.DH();
    }

    public long DU() {
        return this.bdf.DU();
    }

    public String getCity() {
        return this.bdf.getCity();
    }

    public String getAddress() {
        return this.bdf.getAddress();
    }

    public String DY() {
        return this.bdf.DY();
    }

    public String DX() {
        return this.bdf.DX();
    }

    public Gender DT() {
        return this.bdf.DT();
    }

    public String getPhone() {
        return this.bdf.getPhone();
    }

    public com.iqoption.core.microservices.busapi.response.b Ed() {
        return this.bdf.Ed();
    }

    public int Es() {
        return this.bdf.Es();
    }

    public String getLocale() {
        return this.bdf.getLocale();
    }

    public boolean DR() {
        return this.aZA;
    }
}
