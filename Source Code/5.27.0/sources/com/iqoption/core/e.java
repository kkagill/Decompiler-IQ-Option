package com.iqoption.core;

import com.iqoption.core.data.model.user.Gender;
import com.iqoption.core.microservices.busapi.response.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u0000 D2\u00020\u0001:\u0001DR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0005R\u0012\u0010 \u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0005R\u0014\u0010\"\u001a\u0004\u0018\u00010#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010(R\u0012\u0010)\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0012\u0010*\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0012\u0010+\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010(R\u0012\u0010,\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010(R\u0012\u0010-\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010(R\u0012\u0010.\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010(R\u0012\u0010/\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010(R\u0012\u00100\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0005R\u0012\u00102\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0005R\u0014\u00104\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0005R\u0012\u00106\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0005R\u0014\u00108\u001a\u0004\u0018\u000109X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010<\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0005R\u0014\u0010>\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0005R\u0012\u0010@\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\rR\u0012\u0010B\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\r¨\u0006E"}, bng = {"Lcom/iqoption/core/IQAccount;", "", "address", "", "getAddress", "()Ljava/lang/String;", "avatar", "Lcom/iqoption/core/microservices/avatar/Avatar;", "getAvatar", "()Lcom/iqoption/core/microservices/avatar/Avatar;", "balanceId", "", "getBalanceId", "()J", "birthdate", "getBirthdate", "city", "getCity", "countryCode", "getCountryCode", "countryId", "getCountryId", "deleteAccountStatus", "Lcom/iqoption/core/microservices/busapi/response/ForgetUserData;", "getDeleteAccountStatus", "()Lcom/iqoption/core/microservices/busapi/response/ForgetUserData;", "depositCount", "", "getDepositCount", "()I", "email", "getEmail", "firstName", "getFirstName", "gender", "Lcom/iqoption/core/data/model/user/Gender;", "getGender", "()Lcom/iqoption/core/data/model/user/Gender;", "isAuthTwoFactor", "", "()Z", "isAuthorized", "isClub", "isEmailConfirmed", "isPro", "isPublic", "isRegulated", "isTrial", "lastName", "getLastName", "locale", "getLocale", "nationality", "getNationality", "nickname", "getNickname", "personalDataPolicy", "Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;", "getPersonalDataPolicy", "()Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;", "phone", "getPhone", "postalIndex", "getPostalIndex", "userGroupId", "getUserGroupId", "userId", "getUserId", "Companion", "core_release"})
/* compiled from: IQAccount.kt */
public interface e {
    public static final a aZu = a.aZw;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/IQAccount$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/IQAccount;", "getEMPTY", "()Lcom/iqoption/core/IQAccount;", "core_release"})
    /* compiled from: IQAccount.kt */
    public static final class a {
        private static final e aZv = new a();
        static final /* synthetic */ a aZw = new a();

        @i(bne = {1, 1, 15}, bnf = {"\u0000K\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0005R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0005R\u0014\u0010 \u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0005R\u0014\u0010\"\u001a\u00020#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'XD¢\u0006\b\n\u0000\u001a\u0004\b&\u0010(R\u0014\u0010)\u001a\u00020'XD¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020'XD¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0014\u0010+\u001a\u00020'XD¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0014\u0010,\u001a\u00020'XD¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0014\u0010-\u001a\u00020'XD¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0014\u0010.\u001a\u00020'XD¢\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0014\u0010/\u001a\u00020'XD¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0014\u00100\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0005R\u0014\u00102\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0005R\u0016\u00104\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0005R\u0014\u00106\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0005R\u0016\u00108\u001a\u0004\u0018\u000109X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0016\u0010<\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0005R\u0016\u0010>\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0005R\u0014\u0010@\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\rR\u0014\u0010B\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\r¨\u0006D"}, bng = {"com/iqoption/core/IQAccount$Companion$EMPTY$1", "Lcom/iqoption/core/IQAccount;", "address", "", "getAddress", "()Ljava/lang/String;", "avatar", "Lcom/iqoption/core/microservices/avatar/Avatar;", "getAvatar", "()Lcom/iqoption/core/microservices/avatar/Avatar;", "balanceId", "", "getBalanceId", "()J", "birthdate", "getBirthdate", "city", "getCity", "countryCode", "getCountryCode", "countryId", "getCountryId", "deleteAccountStatus", "Lcom/iqoption/core/microservices/busapi/response/ForgetUserData;", "getDeleteAccountStatus", "()Lcom/iqoption/core/microservices/busapi/response/ForgetUserData;", "depositCount", "", "getDepositCount", "()I", "email", "getEmail", "firstName", "getFirstName", "gender", "Lcom/iqoption/core/data/model/user/Gender;", "getGender", "()Lcom/iqoption/core/data/model/user/Gender;", "isAuthTwoFactor", "", "()Z", "isAuthorized", "isClub", "isEmailConfirmed", "isPro", "isPublic", "isRegulated", "isTrial", "lastName", "getLastName", "locale", "getLocale", "nationality", "getNationality", "nickname", "getNickname", "personalDataPolicy", "Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;", "getPersonalDataPolicy", "()Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;", "phone", "getPhone", "postalIndex", "getPostalIndex", "userGroupId", "getUserGroupId", "userId", "getUserId", "core_release"})
        /* compiled from: IQAccount.kt */
        public static final class a implements e {
            private final boolean aZA;
            private final boolean aZB;
            private final long aZC;
            private final String aZD;
            private final String aZE;
            private final String aZF;
            private final b aZG;
            private final long aZx = -1;
            private final boolean aZy;
            private final boolean aZz;
            private final String address;
            private final long arN;
            private final Gender arO;
            private final long arT;
            private final String city;
            private final String email;
            private final String firstName;
            private final String lastName;
            private final String locale;
            private final String nationality;
            private final long userId = -1;

            public int Es() {
                return 0;
            }

            a() {
                String str = "";
                this.email = str;
                this.firstName = str;
                this.lastName = str;
                this.arN = -1;
                this.aZC = -1;
                this.arT = -1;
                this.city = str;
                this.address = str;
                this.arO = Gender.MALE;
                this.aZF = str;
                this.locale = str;
            }

            public long getUserId() {
                return this.userId;
            }

            public long Et() {
                return this.aZx;
            }

            public String getFirstName() {
                return this.firstName;
            }

            public String getLastName() {
                return this.lastName;
            }

            public long El() {
                return this.arN;
            }

            public boolean Er() {
                return this.aZy;
            }

            public boolean Ef() {
                return this.aZz;
            }

            public boolean DR() {
                return this.aZA;
            }

            public boolean Ej() {
                return this.aZB;
            }

            public long DH() {
                return this.aZC;
            }

            public long DU() {
                return this.arT;
            }

            public String getCity() {
                return this.city;
            }

            public String getAddress() {
                return this.address;
            }

            public String DY() {
                return this.aZD;
            }

            public String DX() {
                return this.nationality;
            }

            public Gender DT() {
                return this.arO;
            }

            public String getPhone() {
                return this.aZE;
            }

            public b Ed() {
                return this.aZG;
            }

            public String getLocale() {
                return this.locale;
            }
        }

        private a() {
        }

        public final e Ur() {
            return aZv;
        }
    }

    long DH();

    boolean DR();

    Gender DT();

    long DU();

    String DX();

    String DY();

    b Ed();

    boolean Ef();

    boolean Ej();

    long El();

    boolean Er();

    int Es();

    long Et();

    String getAddress();

    String getCity();

    String getFirstName();

    String getLastName();

    String getLocale();

    String getPhone();

    long getUserId();
}
