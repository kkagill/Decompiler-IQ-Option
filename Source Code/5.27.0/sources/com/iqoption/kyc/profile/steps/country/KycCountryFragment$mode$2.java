package com.iqoption.kyc.profile.steps.country;

import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/kyc/profile/steps/country/CountryMode;", "invoke"})
/* compiled from: KycCountryFragment.kt */
final class KycCountryFragment$mode$2 extends Lambda implements a<CountryMode> {
    final /* synthetic */ d this$0;

    KycCountryFragment$mode$2(d dVar) {
        this.this$0 = dVar;
        super(0);
    }

    /* renamed from: aMi */
    public final CountryMode invoke() {
        Serializable serializable = com.iqoption.core.ext.a.s(this.this$0).getSerializable("ARG_COUNTRY_MODE");
        if (serializable != null) {
            return (CountryMode) serializable;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.kyc.profile.steps.country.CountryMode");
    }
}
