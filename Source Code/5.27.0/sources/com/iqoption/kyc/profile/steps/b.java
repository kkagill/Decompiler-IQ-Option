package com.iqoption.kyc.profile.steps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.Scopes;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.data.repository.d;
import com.iqoption.core.ui.d.c;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.util.v;
import com.iqoption.kyc.o.e;
import com.iqoption.kyc.o.f;
import com.iqoption.kyc.r;
import com.iqoption.kyc.u;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\u001a\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, bng = {"Lcom/iqoption/kyc/profile/steps/KycAddressFragment;", "Lcom/iqoption/kyc/profile/steps/BaseKycProfileStepFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycAddressBinding;", "isContinuePressedAnalytics", "", "()Z", "screenName", "", "getScreenName", "()Ljava/lang/String;", "stageName", "getStageName", "step", "Lcom/iqoption/kyc/profile/steps/ProfileStep;", "getStep", "()Lcom/iqoption/kyc/profile/steps/ProfileStep;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onProfileUpdated", "", "profile", "Lcom/iqoption/kyc/profile/KycProfile;", "onStart", "onViewCreated", "view", "validateAndSaveData", "Companion", "kyc_release"})
/* compiled from: KycAddressFragment.kt */
public final class b extends a {
    private static final String TAG;
    public static final a dBD = new a();
    private HashMap apm;
    private com.iqoption.kyc.b.a dBB;
    private final ProfileStep dBC = ProfileStep.ADDRESS;
    private final String dtM = "PersonalData";
    private final String dtN = "InputAddress_StreetAndHouseNumber";
    private final boolean dxb = true;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/kyc/profile/steps/KycAddressFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "kyc_release"})
    /* compiled from: KycAddressFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return b.TAG;
        }

        public final c aLM() {
            return new c(Bx(), b.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = b.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dBB = (com.iqoption.kyc.b.a) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_kyc_address, viewGroup, false, 4, null);
        com.iqoption.kyc.b.a aVar = this.dBB;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return aVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        com.iqoption.kyc.b.a aVar = this.dBB;
        String str = "binding";
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        com.iqoption.kyc.a.c cVar = new com.iqoption.kyc.a.c(aVar.dus, aKn(), aKo(), "City", 4, aLX().Er());
        aVar = this.dBB;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        com.iqoption.kyc.a.c cVar2 = new com.iqoption.kyc.a.c(aVar.duu, aKn(), aKo(), "PostalCode", 5, aLX().Er());
        com.iqoption.kyc.b.a aVar2 = this.dBB;
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        com.iqoption.kyc.a.c cVar3 = new com.iqoption.kyc.a.c(aVar2.duq, aKn(), aKo(), "AddressLine1", 6, aLX().Er());
        aVar = this.dBB;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = aVar.dus;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycCityEdit");
        EditText editText = iQTextInputEditText;
        aVar2 = this.dBB;
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextInputLayout textInputLayout = aVar2.dut;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.kycCityInput");
        u.a(editText, textInputLayout);
        aVar = this.dBB;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        iQTextInputEditText = aVar.duu;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycPostalCodeEdit");
        editText = iQTextInputEditText;
        aVar2 = this.dBB;
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textInputLayout = aVar2.duv;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.kycPostalCodeInput");
        u.a(editText, textInputLayout);
        aVar = this.dBB;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        iQTextInputEditText = aVar.duq;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycAddressEdit");
        editText = iQTextInputEditText;
        aVar2 = this.dBB;
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textInputLayout = aVar2.dur;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.kycAddressInput");
        u.a(editText, textInputLayout);
    }

    public void onStart() {
        super.onStart();
        com.iqoption.kyc.b.a aVar = this.dBB;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        IQTextInputEditText iQTextInputEditText = aVar.dus;
        iQTextInputEditText.requestFocus();
        com.iqoption.core.ext.a.d(iQTextInputEditText);
        v.b(iQTextInputEditText.getContext(), iQTextInputEditText);
    }

    /* Access modifiers changed, original: protected */
    public void m(com.iqoption.kyc.profile.a aVar) {
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
        r rVar = r.dth;
        com.iqoption.kyc.b.a aVar2 = this.dBB;
        String str = "binding";
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextInputLayout textInputLayout = aVar2.dut;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.kycCityInput");
        com.iqoption.kyc.b.a aVar3 = this.dBB;
        if (aVar3 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = aVar3.dus;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycCityEdit");
        rVar.a(textInputLayout, iQTextInputEditText, aVar.getCity());
        rVar = r.dth;
        aVar2 = this.dBB;
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textInputLayout = aVar2.duv;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.kycPostalCodeInput");
        aVar3 = this.dBB;
        if (aVar3 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        iQTextInputEditText = aVar3.duu;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycPostalCodeEdit");
        rVar.a(textInputLayout, iQTextInputEditText, aVar.DY());
        rVar = r.dth;
        aVar2 = this.dBB;
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textInputLayout = aVar2.dur;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.kycAddressInput");
        aVar3 = this.dBB;
        if (aVar3 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText2 = aVar3.duq;
        kotlin.jvm.internal.i.e(iQTextInputEditText2, "binding.kycAddressEdit");
        rVar.a(textInputLayout, iQTextInputEditText2, aVar.getAddress());
    }

    public boolean n(com.iqoption.kyc.profile.a aVar) {
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
        com.iqoption.kyc.b.a aVar2 = this.dBB;
        String str = "binding";
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = aVar2.dus;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycCityEdit");
        String valueOf = String.valueOf(iQTextInputEditText.getText());
        String str2 = "null cannot be cast to non-null type kotlin.CharSequence";
        if (valueOf != null) {
            TextInputLayout textInputLayout;
            String obj = v.trim(valueOf).toString();
            if ((((CharSequence) obj).length() == 0 ? 1 : null) == null) {
                r rVar = r.dth;
                com.iqoption.core.microservices.kyc.response.b WW = d.bdF.WW();
                String str3 = null;
                if (rVar.g(obj, WW != null ? WW.getCity() : null, false)) {
                    aVar2 = this.dBB;
                    if (aVar2 == null) {
                        kotlin.jvm.internal.i.lG(str);
                    }
                    iQTextInputEditText = aVar2.duu;
                    kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycPostalCodeEdit");
                    valueOf = String.valueOf(iQTextInputEditText.getText());
                    if (valueOf != null) {
                        String obj2 = v.trim(valueOf).toString();
                        if ((((CharSequence) obj2).length() == 0 ? 1 : null) == null) {
                            rVar = r.dth;
                            WW = d.bdF.WW();
                            if (rVar.g(obj2, WW != null ? WW.DY() : null, false)) {
                                aVar2 = this.dBB;
                                if (aVar2 == null) {
                                    kotlin.jvm.internal.i.lG(str);
                                }
                                iQTextInputEditText = aVar2.duq;
                                kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycAddressEdit");
                                valueOf = String.valueOf(iQTextInputEditText.getText());
                                if (valueOf != null) {
                                    String obj3 = v.trim(valueOf).toString();
                                    if ((((CharSequence) obj3).length() == 0 ? 1 : null) == null) {
                                        rVar = r.dth;
                                        com.iqoption.core.microservices.kyc.response.b WW2 = d.bdF.WW();
                                        if (WW2 != null) {
                                            str3 = WW2.getAddress();
                                        }
                                        if (rVar.g(obj3, str3, false)) {
                                            aLX().p(com.iqoption.kyc.profile.a.a(aVar, null, null, null, null, null, null, null, obj, obj2, obj3, 127, null));
                                            return true;
                                        }
                                    }
                                    aVar2 = this.dBB;
                                    if (aVar2 == null) {
                                        kotlin.jvm.internal.i.lG(str);
                                    }
                                    textInputLayout = aVar2.dur;
                                    kotlin.jvm.internal.i.e(textInputLayout, "binding.kycAddressInput");
                                    textInputLayout.setError(getString(f.incorrect_value));
                                    return false;
                                }
                                throw new TypeCastException(str2);
                            }
                        }
                        aVar2 = this.dBB;
                        if (aVar2 == null) {
                            kotlin.jvm.internal.i.lG(str);
                        }
                        textInputLayout = aVar2.duv;
                        kotlin.jvm.internal.i.e(textInputLayout, "binding.kycPostalCodeInput");
                        textInputLayout.setError(getString(f.incorrect_value));
                        return false;
                    }
                    throw new TypeCastException(str2);
                }
            }
            aVar2 = this.dBB;
            if (aVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textInputLayout = aVar2.dut;
            kotlin.jvm.internal.i.e(textInputLayout, "binding.kycCityInput");
            textInputLayout.setError(getString(f.incorrect_value));
            return false;
        }
        throw new TypeCastException(str2);
    }

    public String aKo() {
        return this.dtN;
    }

    public boolean aKp() {
        return this.dxb;
    }

    public String aKn() {
        return this.dtM;
    }

    public ProfileStep aMb() {
        return this.dBC;
    }
}
