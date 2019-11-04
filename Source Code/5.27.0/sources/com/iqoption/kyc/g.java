package com.iqoption.kyc;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.common.base.e;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.a;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.t;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.iqoption.app.b;
import com.iqoption.core.microservices.kyc.c;
import com.iqoption.dto.entity.iqbus.Country;
import com.iqoption.dto.entity.result.KycState;
import com.iqoption.mobbtech.connect.request.api.Requests;
import com.iqoption.util.v;
import com.iqoption.x.R;
import java.util.Locale;

/* compiled from: KycInfoProvider */
public class g {
    private static final String TAG = "com.iqoption.kyc.g";
    private static final ImmutableSet<Integer> dsc = ImmutableSet.o(Integer.valueOf(50), Integer.valueOf(51));
    private static final ImmutableMultimap<Integer, Integer> dsd;
    private static final ImmutableMultimap<Integer, Integer> dse;
    private final Context context;
    @Nullable
    private KycState dsf;

    static {
        a n = ImmutableMultimap.ti().n(Integer.valueOf(12), Integer.valueOf(49));
        Integer valueOf = Integer.valueOf(10);
        n = n.n(valueOf, Integer.valueOf(37)).n(valueOf, Integer.valueOf(38));
        valueOf = Integer.valueOf(13);
        dsd = n.n(valueOf, Integer.valueOf(52)).n(valueOf, Integer.valueOf(53)).tl();
        n = ImmutableMultimap.ti();
        valueOf = Integer.valueOf(21);
        n = n.n(valueOf, Integer.valueOf(89)).n(valueOf, Integer.valueOf(90));
        valueOf = Integer.valueOf(22);
        n = n.n(valueOf, Integer.valueOf(93)).n(valueOf, Integer.valueOf(94));
        valueOf = Integer.valueOf(23);
        n = n.n(valueOf, Integer.valueOf(97)).n(valueOf, Integer.valueOf(98));
        valueOf = Integer.valueOf(24);
        n = n.n(valueOf, Integer.valueOf(101)).n(valueOf, Integer.valueOf(102));
        valueOf = Integer.valueOf(25);
        dse = n.n(valueOf, Integer.valueOf(105)).n(valueOf, Integer.valueOf(106)).n(Integer.valueOf(26), Integer.valueOf(108)).n(Integer.valueOf(27), Integer.valueOf(111)).tl();
    }

    public g(Context context) {
        this(context, null);
    }

    public g(Context context, @Nullable KycState kycState) {
        this.context = context;
        this.dsf = kycState;
    }

    public void b(@Nullable KycState kycState) {
        this.dsf = kycState;
    }

    public boolean Eo() {
        b aK = b.aK(this.context);
        if (aK.asc) {
            return aK.Eo();
        }
        KycState kycState = this.dsf;
        return ((Boolean) e.g(kycState != null ? kycState.isPhoneConfirmed : null, Boolean.valueOf(false))).booleanValue();
    }

    public boolean aIN() {
        b aK = b.aK(this.context);
        if (aK.asc) {
            return aK.aso;
        }
        KycState kycState = this.dsf;
        return ((Boolean) e.g(kycState != null ? kycState.isPhoneConfirmationSkipped : null, Boolean.valueOf(false))).booleanValue();
    }

    public PhoneNumber aIO() {
        return b.aK(this.context).DV();
    }

    public PhoneNumber aIP() {
        return Eo() ? b.aK(this.context).DV() : new PhoneNumber();
    }

    public String a(@Nullable Country country) {
        String country2;
        PhoneNumberUtil xt = PhoneNumberUtil.xt();
        if (country == null) {
            country2 = Locale.getDefault().getCountry();
        } else {
            country2 = xt.cD(country.phoneCode.intValue());
        }
        PhoneNumber a = xt.a(country2, PhoneNumberType.MOBILE);
        if (a == null) {
            return this.context.getString(R.string.phone_number);
        }
        return xt.a(a, PhoneNumberFormat.INTERNATIONAL);
    }

    public long aIQ() {
        return com.iqoption.core.e.b.bf(com.iqoption.core.data.d.b.WB().Wz());
    }

    public boolean aIR() {
        return com.iqoption.core.e.b.bg(aIQ());
    }

    public boolean aIS() {
        return com.iqoption.core.e.b.bh(com.iqoption.core.data.d.b.WB().Wz());
    }

    public void aG(long j) {
        com.iqoption.core.data.d.b.WB().aG(j);
    }

    public long Wz() {
        return com.iqoption.core.data.d.b.WB().Wz();
    }

    public String a(@Nullable com.iqoption.kyc.profile.a aVar) {
        String firstName = (aVar == null || TextUtils.isEmpty(aVar.getFirstName())) ? b.aK(this.context).getFirstName() : aVar.getFirstName();
        return this.context.getString(R.string.name).equals(firstName) ? "" : firstName;
    }

    public String b(@Nullable com.iqoption.kyc.profile.a aVar) {
        String lastName = (aVar == null || TextUtils.isEmpty(aVar.getLastName())) ? b.aK(this.context).getLastName() : aVar.getLastName();
        return this.context.getString(R.string.surname).equals(lastName) ? "" : lastName;
    }

    public String c(@Nullable com.iqoption.kyc.profile.a aVar) {
        if (aVar != null && aVar.aLQ() != null) {
            return aVar.aLQ();
        }
        Long valueOf = Long.valueOf(b.aK(this.context).DU());
        return (valueOf == null || valueOf.longValue() == 0) ? null : c.bur.aes().format(Long.valueOf(valueOf.longValue() * 1000));
    }

    public boolean iF(String str) {
        str = str.trim();
        return !TextUtils.isEmpty(str) && str.length() <= 30;
    }

    public long d(@Nullable com.iqoption.kyc.profile.a aVar) {
        return (aVar == null || aVar.YC() == null) ? b.aK(this.context).El() : aVar.YC().longValue();
    }

    public long e(@Nullable com.iqoption.kyc.profile.a aVar) {
        return (aVar == null || aVar.aLS() == null) ? b.aK(this.context).El() : aVar.aLS().longValue();
    }

    public String f(@Nullable com.iqoption.kyc.profile.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.getAddress())) {
            return b.aK(this.context).getAddress();
        }
        return aVar.getAddress();
    }

    public String g(@Nullable com.iqoption.kyc.profile.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.getCity())) {
            return b.aK(this.context).getCity();
        }
        return aVar.getCity();
    }

    public String h(@Nullable com.iqoption.kyc.profile.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.DY())) {
            return b.aK(this.context).DW();
        }
        return aVar.DY();
    }

    public t<Pair<String, String>> aIT() {
        return v.a(Requests.jl("risk-disclosure"), -$$Lambda$g$2cEMkcvTuF6M8xIwAhWhTs45Lyc.INSTANCE);
    }

    public long getUserId() {
        return b.aK(this.context).getUserId();
    }

    public boolean Er() {
        b aK = b.aK(this.context);
        if (aK.asc) {
            return aK.Er();
        }
        KycState kycState = this.dsf;
        return ((Boolean) e.g(kycState != null ? kycState.isRegulatedUser : null, Boolean.valueOf(false))).booleanValue();
    }

    public boolean aIU() {
        b aK = b.aK(this.context);
        if (aK.asc) {
            return aK.asn;
        }
        KycState kycState = this.dsf;
        return ((Boolean) e.g(kycState != null ? kycState.isDocumentsUploaded : null, Boolean.valueOf(false))).booleanValue();
    }

    public boolean aIV() {
        b aK = b.aK(this.context);
        if (aK.asc) {
            return aK.asl;
        }
        KycState kycState = this.dsf;
        return ((Boolean) e.g(kycState != null ? kycState.isProfileFilled : null, Boolean.valueOf(false))).booleanValue();
    }

    public int aIW() {
        b aK = b.aK(this.context);
        if (aK.asc) {
            return ((Integer) aK.ase.getValue()).intValue();
        }
        KycState kycState = this.dsf;
        return ((Integer) e.g(kycState != null ? kycState.daysLeftToVerify : null, Integer.valueOf(0))).intValue();
    }
}
