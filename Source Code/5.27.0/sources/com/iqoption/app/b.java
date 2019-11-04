package com.iqoption.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Predicates;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.a.a;
import com.iqoption.app.managers.k;
import com.iqoption.core.data.model.user.Gender;
import com.iqoption.core.manager.i;
import com.iqoption.core.microservices.busapi.response.ForgetUserStatus;
import com.iqoption.core.microservices.core.register.SocialTypeId;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Currencies.ConversionCurrency;
import com.iqoption.dto.Event;
import com.iqoption.dto.entity.result.KycState;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.protrader.h;
import com.iqoption.util.g;
import com.iqoption.util.j;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: IQAccount */
public class b extends a {
    private static final String TAG = "com.iqoption.app.b";
    private static volatile b arw;
    private String address;
    private String arA;
    private String arB;
    @Nullable
    private SocialTypeId arC;
    private String arD;
    private String arE;
    private boolean arF;
    private com.iqoption.system.a.b<Boolean> arG;
    private String arH;
    private String arI;
    private com.iqoption.system.a.b<com.iqoption.core.microservices.avatar.a> arJ = new com.iqoption.system.a.b(-$$Lambda$iUelJLSgB2oCqm-saoVVFC5Kk14.INSTANCE, null);
    private ConcurrentHashMap<Long, Balance> arK = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, ConversionCurrency> arL = new ConcurrentHashMap();
    private com.iqoption.system.a.b<Integer> arM;
    private long arN;
    private Gender arO;
    private String arP;
    private com.iqoption.system.a.b<String> arQ;
    private String arR;
    private String arS;
    private long arT;
    private boolean arU;
    private int arV;
    private com.iqoption.system.a.b<Boolean> arW;
    private com.iqoption.system.a.b<Boolean> arX;
    private com.iqoption.system.a.b<com.iqoption.core.microservices.busapi.response.b> arY;
    private com.iqoption.system.a.b<com.iqoption.protrader.a> arZ;
    private com.iqoption.system.a.b<Boolean> arx;
    private com.iqoption.system.a.b<String> ary;
    private String arz;
    private com.iqoption.system.a.b<com.iqoption.core.microservices.busapi.response.a> asa;
    public com.iqoption.system.a.b<Integer> asb;
    public boolean asc;
    public int asd;
    public com.iqoption.system.a.b<Integer> ase;
    private boolean asf;
    public boolean asg;
    public boolean ash;
    public boolean asi;
    public boolean asj;
    public boolean asl;
    public boolean asm;
    public boolean asn;
    public boolean aso;
    private com.iqoption.system.a.b<Boolean> asp;
    public boolean asq;
    public com.iqoption.system.a.b<Boolean> asr;
    private Long balanceId = null;
    private String city;
    private String firstName;
    private String flag;
    private boolean isPublic;
    private String lastName;
    private String locale;
    private String nationality;
    private String password;

    public static synchronized void initialize(Context context) {
        synchronized (b.class) {
            synchronized (b.class) {
                arw = new b(context);
                i.bjd.hashCode();
            }
        }
    }

    public static synchronized b aK(Context context) {
        b bVar;
        synchronized (b.class) {
            if (arw == null) {
                synchronized (b.class) {
                    if (arw == null) {
                        arw = new b(context);
                    }
                }
            }
            bVar = arw;
        }
        return bVar;
    }

    public static b DG() {
        return aK(IQApp.Eu());
    }

    public long DH() {
        Long l = this.balanceId;
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    public void setBalanceId(Long l) {
        this.balanceId = l;
    }

    public Double DI() {
        return Double.valueOf(Balance.getBalanceValue(DN()));
    }

    public int DJ() {
        return Balance.getBalanceType(DN());
    }

    public String DK() {
        return j.q(DI());
    }

    public void a(ConcurrentHashMap<Long, Balance> concurrentHashMap) {
        this.arK = concurrentHashMap;
    }

    public ConcurrentHashMap<Long, Balance> DL() {
        return this.arK;
    }

    @Nullable
    public Balance dH(int i) {
        ConcurrentHashMap concurrentHashMap = this.arK;
        return concurrentHashMap != null ? (Balance) com.google.common.collect.i.b(concurrentHashMap.values()).d(Predicates.a(Predicates.ao(Integer.valueOf(i)), Balance.getBalanceType)).pN() : null;
    }

    @Nullable
    public Balance DM() {
        ConcurrentHashMap concurrentHashMap = this.arK;
        return concurrentHashMap != null ? (Balance) com.google.common.collect.i.b(concurrentHashMap.values()).d(Balance.getOtnBalance).pN() : null;
    }

    @Nullable
    public Balance f(Long l) {
        return l == null ? null : (Balance) this.arK.get(l);
    }

    @Nullable
    public Balance DN() {
        Long l = this.balanceId;
        return l == null ? null : (Balance) this.arK.get(l);
    }

    @Nullable
    private String g(Long l) {
        return Balance.getCurrency(f(l));
    }

    public String h(Long l) {
        return dt(g(l));
    }

    public String DO() {
        return h(Long.valueOf(DH()));
    }

    public String dt(String str) {
        return j.c(du(str));
    }

    public boolean DP() {
        return this.arL.isEmpty();
    }

    public void x(List<ConversionCurrency> list) {
        if (!g.isEmpty(list)) {
            for (ConversionCurrency conversionCurrency : list) {
                this.arL.put(conversionCurrency.name, conversionCurrency);
            }
        }
    }

    public void a(ConversionCurrency conversionCurrency) {
        if (conversionCurrency != null) {
            this.arL.put(conversionCurrency.name, conversionCurrency);
        }
    }

    @Nullable
    public ConversionCurrency du(String str) {
        Object str2;
        ConcurrentHashMap concurrentHashMap = this.arL;
        if (str2 == null) {
            str2 = "";
        }
        return (ConversionCurrency) concurrentHashMap.get(str2);
    }

    @Nullable
    public ConversionCurrency DQ() {
        return du(g(this.balanceId));
    }

    private b(Context context) {
        super(context);
        -$$Lambda$eV5LnouwfbNjHzUpMsSuSZWBwNI -__lambda_ev5lnouwfbnjhzupmssuszwbwni = -$$Lambda$eV5LnouwfbNjHzUpMsSuSZWBwNI.INSTANCE;
        Integer valueOf = Integer.valueOf(0);
        Boolean valueOf2 = Boolean.valueOf(false);
        this.arx = new com.iqoption.system.a.b(-__lambda_ev5lnouwfbnjhzupmssuszwbwni, valueOf2);
        String str = "";
        this.ary = new com.iqoption.system.a.b(-$$Lambda$iwPLWitE34NYoPgmllkI-JvSuSQ.INSTANCE, str);
        this.arG = new com.iqoption.system.a.b(-$$Lambda$CI7hIa1MblBHpct8RpcrKa8BqRU.INSTANCE, valueOf2);
        this.arI = str;
        this.arM = new com.iqoption.system.a.b(-$$Lambda$sh6wfhWGniNGek9Rh7D3w8sXbH0.INSTANCE, valueOf);
        this.arQ = new com.iqoption.system.a.b(-$$Lambda$Cu1kcjDwwmVqsRFZsNM3XNoEjjE.INSTANCE, str);
        this.arV = 0;
        this.arW = new com.iqoption.system.a.b(-$$Lambda$2rYg2qnrpN2IZqEWspSb87y52-s.INSTANCE, valueOf2);
        this.arX = new com.iqoption.system.a.b(-$$Lambda$4yEHZOPjgu26DeSNnsA1ZHdkKV8.INSTANCE, valueOf2);
        this.arY = new com.iqoption.system.a.b(-$$Lambda$l15UGEyEIsPxOYmjYNuTsNkCUmA.INSTANCE, new com.iqoption.core.microservices.busapi.response.b());
        this.arZ = new com.iqoption.system.a.b(-$$Lambda$47yrnmZjXprcMYLFdeu1aep0DiA.INSTANCE, new h(null));
        this.asa = new com.iqoption.system.a.b(-$$Lambda$jBaQY4SfwClbUxQss85ar5aDFmE.INSTANCE, null);
        this.asb = new com.iqoption.system.a.b(-$$Lambda$TxPZBwYZJFcKzhG0Z_BsLBBX39w.INSTANCE, valueOf);
        this.ase = new com.iqoption.system.a.b(-$$Lambda$BmQGjb9qUHOMlOLHWakdX5m9X3I.INSTANCE, Integer.valueOf(-1));
        this.asp = new com.iqoption.system.a.b(-$$Lambda$NrJgOjCtkBFTQruIfsU-XtIdqBc.INSTANCE, valueOf2);
        this.asr = new com.iqoption.system.a.b(-$$Lambda$ajkIRvANePfSyQQ7cl5JA1r3kfI.INSTANCE, valueOf2);
        init(context);
    }

    public void aL(Context context) {
        clear();
        aM(context);
    }

    public boolean isVerified() {
        if (this.asf) {
            return ((Boolean) this.asr.getValue()).booleanValue();
        }
        return ((Boolean) this.asp.getValue()).booleanValue();
    }

    /* Access modifiers changed, original: protected */
    public void clear() {
        super.clear();
        this.ary.aUB();
        this.arQ.aUB();
        String str = "";
        this.arB = str;
        this.arA = str;
        this.arW.aUB();
        this.password = str;
        this.arC = null;
        this.arD = str;
        this.arE = str;
        this.arG.aUB();
        this.arF = false;
        this.firstName = str;
        this.lastName = str;
        this.arI = str;
        this.arJ.cm(null);
        this.arx.cm(Boolean.valueOf(false));
    }

    public synchronized void aM(Context context) {
        super.aM(context);
        Editor edit = d.aP(context).Fb().edit();
        edit.putString("email", (String) this.ary.getValue()).putString("password", this.password).putString("auth_code", this.arz).putString("autologin_token", this.arA).putString("tin", this.arI).putInt("social_id", this.arC != null ? this.arC.getServerValue() : 0).putString("user_social_id", this.arD).putString("social_token", this.arE).putBoolean("is_trial", ((Boolean) this.arG.getValue()).booleanValue()).putString("first_name", this.firstName).putString("last_name", this.lastName).putBoolean("is_activated", ((Boolean) this.arW.getValue()).booleanValue()).putBoolean("auth_two_factor", ((Boolean) this.arX.getValue()).booleanValue()).putString("new_email", this.arB).putBoolean("is_account_init_from_server", ((Boolean) this.arx.getValue()).booleanValue());
        com.iqoption.core.microservices.busapi.response.b bVar = (com.iqoption.core.microservices.busapi.response.b) this.arY.getValue();
        a(edit, "gdpr_accepted", bVar.abv());
        a(edit, "gdpr_email_accepted", bVar.abw());
        a(edit, "gdpr_push_accepted", bVar.abx());
        a(edit, "gdpr_call_accepted", bVar.aby());
        a(edit, "gdpr_third_party_accepted", bVar.abz());
        com.iqoption.core.ext.a.a(edit, "client_category_id", Ee().aSR());
        com.iqoption.core.microservices.busapi.response.a Eg = Eg();
        if (Eg != null) {
            edit.putString("forget_user_status", Eg.abt().getServerValue()).putLong("forget_user_created", Eg.getCreated()).putLong("forget_user_expired", Eg.abu());
        } else {
            edit.remove("forget_user_status").remove("forget_user_created").remove("forget_user_expired");
        }
        edit.apply();
    }

    private void init(Context context) {
        SharedPreferences Fb = d.aP(context).Fb();
        String str = "";
        this.ary.cn(Fb.getString("email", str));
        this.arI = Fb.getString("tin", str);
        this.password = Fb.getString("password", str);
        this.arz = Fb.getString("auth_code", str);
        this.arA = Fb.getString("autologin_token", str);
        this.arC = SocialTypeId.fromServerValue(Fb.getInt("social_id", 0));
        this.arD = Fb.getString("user_social_id", str);
        this.arE = Fb.getString("social_token", str);
        this.arG.cn(Boolean.valueOf(Fb.getBoolean("is_trial", false)));
        this.arF = Fb.getBoolean("is_demo", false);
        this.firstName = Fb.getString("first_name", str);
        this.lastName = Fb.getString("last_name", str);
        this.arB = Fb.getString("new_email", str);
        this.arW.cn(Boolean.valueOf(Fb.getBoolean("is_activated", false)));
        this.arX.cn(Boolean.valueOf(Fb.getBoolean("auth_two_factor", false)));
        this.arx.cm(Boolean.valueOf(Fb.getBoolean("is_account_init_from_server", false)));
        this.arY.cn(new com.iqoption.core.microservices.busapi.response.b(c(Fb, "gdpr_accepted"), c(Fb, "gdpr_email_accepted"), c(Fb, "gdpr_push_accepted"), c(Fb, "gdpr_call_accepted"), c(Fb, "gdpr_third_party_accepted")));
        this.arZ.cn(com.iqoption.protrader.a.q(com.iqoption.core.ext.a.d(Fb, "client_category_id")));
        String string = Fb.getString("forget_user_status", null);
        Long e = com.iqoption.core.ext.a.e(Fb, "forget_user_created");
        Long e2 = com.iqoption.core.ext.a.e(Fb, "forget_user_expired");
        if (string != null && e != null && e2 != null) {
            this.asa.cn(new com.iqoption.core.microservices.busapi.response.a(ForgetUserStatus.fromServerValue(string), e.longValue(), e2.longValue()));
        }
    }

    public boolean DR() {
        return RequestManager.aOR().aOV();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public void dv(String str) {
        this.arD = str;
    }

    @Nullable
    public SocialTypeId DS() {
        return this.arC;
    }

    public void a(@Nullable SocialTypeId socialTypeId) {
        this.arC = socialTypeId;
    }

    public void dw(String str) {
        this.arE = str;
    }

    public Gender DT() {
        return this.arO;
    }

    public void a(Gender gender) {
        this.arO = gender;
    }

    public String getCountryCode() {
        return this.arP;
    }

    public void setCountryCode(String str) {
        this.arP = str;
    }

    public void a(com.iqoption.core.microservices.avatar.a aVar) {
        this.arJ.cm(aVar);
    }

    public com.iqoption.core.microservices.avatar.a getAvatar() {
        return (com.iqoption.core.microservices.avatar.a) this.arJ.getValue();
    }

    public long DU() {
        return this.arT;
    }

    public void U(long j) {
        this.arT = j;
    }

    public void aM(boolean z) {
        this.isPublic = z;
    }

    public void dx(@NonNull String str) {
        this.arH = str;
    }

    public String getPhone() {
        return (String) this.arQ.getValue();
    }

    public void setPhone(String str) {
        if (((Boolean) this.arx.getValue()).booleanValue()) {
            this.arQ.cm(str);
        } else {
            this.arQ.cn(str);
        }
    }

    public PhoneNumber DV() {
        try {
            if (TextUtils.isEmpty((CharSequence) this.arQ.getValue())) {
                return new PhoneNumber();
            }
            if (TextUtils.isEmpty(this.arP)) {
                return PhoneNumberUtil.xt().b((CharSequence) this.arQ.getValue(), Locale.getDefault().getCountry());
            }
            int intValue = Integer.valueOf(this.arP.trim()).intValue();
            return PhoneNumberUtil.xt().b((CharSequence) this.arQ.getValue(), PhoneNumberUtil.xt().cD(intValue)).cH(intValue);
        } catch (NumberParseException | NumberFormatException unused) {
            return new PhoneNumber();
        }
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public String DW() {
        return this.arR;
    }

    public void dy(String str) {
        this.arR = str;
    }

    public String DX() {
        return this.nationality;
    }

    public void dz(String str) {
        this.nationality = str;
    }

    @Nullable
    public String DY() {
        return this.arR;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    @NonNull
    public String getEmail() {
        return (String) this.ary.getValue();
    }

    public String DZ() {
        return this.arI;
    }

    public void dA(String str) {
        this.arI = str;
    }

    public void dB(String str) {
        if (((Boolean) this.arx.getValue()).booleanValue()) {
            this.ary.cm(str);
        } else {
            this.ary.cn(str);
        }
    }

    public String Ea() {
        return this.arB;
    }

    public void dC(String str) {
        this.arB = str;
    }

    public String Eb() {
        if (isActivated()) {
            return getEmail();
        }
        return TextUtils.isEmpty(Ea()) ? getEmail() : Ea();
    }

    public boolean isActivated() {
        return ((Boolean) this.arW.getValue()).booleanValue();
    }

    public void setActivated(boolean z) {
        if (!((Boolean) this.arx.getValue()).booleanValue()) {
            this.arW.cn(Boolean.valueOf(z));
        } else if (this.arW.cm(Boolean.valueOf(z)) && z) {
            k.f(IQApp.Eu(), 134217728);
            EventManager.BS().a(new Event(Event.CATEGORY_SYSTEM, "security_email-confirmed"));
        }
    }

    public boolean Ec() {
        return ((Boolean) this.arX.getValue()).booleanValue();
    }

    public void aN(boolean z) {
        if (!((Boolean) this.arx.getValue()).booleanValue()) {
            this.arX.cn(Boolean.valueOf(z));
        } else if (this.arX.cm(Boolean.valueOf(z)) && z) {
            k.f(IQApp.Eu(), Integer.MIN_VALUE);
        }
    }

    @NonNull
    public com.iqoption.core.microservices.busapi.response.b Ed() {
        return (com.iqoption.core.microservices.busapi.response.b) this.arY.getValue();
    }

    public void a(@Nullable com.iqoption.core.microservices.busapi.response.b bVar) {
        this.arY.cn(bVar);
    }

    @NonNull
    public com.iqoption.protrader.a Ee() {
        return (com.iqoption.protrader.a) this.arZ.getValue();
    }

    public void a(@Nullable com.iqoption.protrader.a aVar) {
        this.arZ.cn(aVar);
    }

    public boolean Ef() {
        return Ee() instanceof com.iqoption.protrader.b;
    }

    @Nullable
    public com.iqoption.core.microservices.busapi.response.a Eg() {
        return (com.iqoption.core.microservices.busapi.response.a) this.asa.getValue();
    }

    public void b(@Nullable com.iqoption.core.microservices.busapi.response.a aVar) {
        this.asa.cm(aVar);
    }

    public void dD(String str) {
        this.arA = str;
    }

    public String Eh() {
        return this.arA;
    }

    public void Ei() {
        dD("");
        aM(IQApp.Eu());
    }

    public boolean Ej() {
        return ((Boolean) this.arG.getValue()).booleanValue();
    }

    public boolean Ek() {
        return this.arF;
    }

    public void aN(Context context) {
        this.arF = false;
        d.aP(context).Fb().edit().putBoolean("is_demo", false).apply();
    }

    public boolean aO(boolean z) {
        return this.arG.cm(Boolean.valueOf(z));
    }

    public int getGroupId() {
        return ((Integer) this.arM.getValue()).intValue();
    }

    public void dI(int i) {
        this.arM.cm(Integer.valueOf(i));
    }

    public String getLocale() {
        return this.locale;
    }

    public void dE(String str) {
        this.locale = str;
    }

    public long El() {
        return this.arN;
    }

    public void V(long j) {
        this.arN = j;
    }

    public void dF(String str) {
        this.arS = str;
    }

    public boolean Em() {
        return this.arU;
    }

    public void aP(boolean z) {
        this.arU = z;
    }

    public boolean En() {
        return ((long) ((Integer) this.arM.getValue()).intValue()) == 150;
    }

    public boolean Eo() {
        return ((Boolean) this.asp.getValue()).booleanValue();
    }

    public void aQ(boolean z) {
        if (!((Boolean) this.arx.getValue()).booleanValue()) {
            this.asp.cn(Boolean.valueOf(z));
        } else if (this.asp.cm(Boolean.valueOf(z)) && z) {
            k.f(IQApp.Eu(), 268435456);
        }
    }

    public void aR(boolean z) {
        this.arx.cm(Boolean.valueOf(z));
    }

    public String Ep() {
        if (TextUtils.isEmpty(this.lastName)) {
            return this.firstName;
        }
        if (TextUtils.isEmpty(this.firstName)) {
            return this.lastName;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.firstName);
        stringBuilder.append(" ");
        stringBuilder.append(this.lastName);
        return stringBuilder.toString();
    }

    public boolean Eq() {
        return isActivated();
    }

    public void a(KycState kycState) {
        this.ase.cn(kycState.daysLeftToVerify);
        aS(kycState.isRegulatedUser.booleanValue());
        this.asg = kycState.isProfileNeeded.booleanValue();
        this.ash = kycState.isPhoneNeeded.booleanValue();
        this.asi = kycState.isDocumentsNeeded.booleanValue();
        this.asj = kycState.isDocumentsDeclined.booleanValue();
        this.asl = kycState.isProfileFilled.booleanValue();
        this.asm = kycState.isPhoneFilled.booleanValue();
        this.asn = kycState.isDocumentsUploaded.booleanValue();
        this.aso = kycState.isPhoneConfirmationSkipped.booleanValue();
        this.asn = kycState.isDocumentsUploaded.booleanValue();
        this.aso = kycState.isPhoneConfirmationSkipped.booleanValue();
        this.asp.cm(kycState.isPhoneConfirmed);
        this.asq = kycState.isDocumentsUploadSkipped.booleanValue();
        this.asr.cm(kycState.isDocumentsApproved);
    }

    public void aS(boolean z) {
        this.asf = z;
        if (z) {
            d.Fa().dN(asO);
        }
    }

    public boolean Er() {
        return this.asf;
    }

    public void dJ(int i) {
        this.arV = i;
    }

    public int Es() {
        return this.arV;
    }

    public void dG(String str) {
        this.flag = str;
    }

    public void a(@NonNull Editor editor, @NonNull String str, @Nullable Boolean bool) {
        if (bool != null) {
            editor.putBoolean(str, bool.booleanValue()).apply();
        }
    }

    @Nullable
    public Boolean c(@NonNull SharedPreferences sharedPreferences, @NonNull String str) {
        return sharedPreferences.contains(str) ? Boolean.valueOf(sharedPreferences.getBoolean(str, false)) : null;
    }

    public long Et() {
        return (long) getGroupId();
    }
}
