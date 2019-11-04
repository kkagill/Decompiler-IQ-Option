package com.iqoption.kyc.profile.steps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.Scopes;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.util.v;
import com.iqoption.kyc.b.e;
import com.iqoption.kyc.o;
import com.iqoption.kyc.o.f;
import com.iqoption.kyc.q;
import com.iqoption.kyc.r;
import java.util.HashMap;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u001c\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*H\u0014J\b\u0010+\u001a\u00020\u001fH\u0016J\u001a\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\tH\u0002J\u0010\u00100\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138B@BX\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0004\n\u0002\u0010\u001d¨\u00062"}, bng = {"Lcom/iqoption/kyc/profile/steps/KycDateOfBirthFragment;", "Lcom/iqoption/kyc/profile/steps/BaseKycProfileStepFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycDateOfBirthBinding;", "isContinuePressedAnalytics", "", "()Z", "screenName", "", "getScreenName", "()Ljava/lang/String;", "stageName", "getStageName", "step", "Lcom/iqoption/kyc/profile/steps/ProfileStep;", "getStep", "()Lcom/iqoption/kyc/profile/steps/ProfileStep;", "<set-?>", "Lcom/iqoption/core/ui/widget/edittext/soft/DateFormattingTextWatcher;", "textDateValidator", "getTextDateValidator", "()Lcom/iqoption/core/ui/widget/edittext/soft/DateFormattingTextWatcher;", "setTextDateValidator", "(Lcom/iqoption/core/ui/widget/edittext/soft/DateFormattingTextWatcher;)V", "textDateValidator$delegate", "Lkotlin/properties/ReadWriteProperty;", "validatorListener", "com/iqoption/kyc/profile/steps/KycDateOfBirthFragment$validatorListener$1", "Lcom/iqoption/kyc/profile/steps/KycDateOfBirthFragment$validatorListener$1;", "hideError", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onProfileUpdated", "profile", "Lcom/iqoption/kyc/profile/KycProfile;", "onStart", "onViewCreated", "view", "showError", "error", "validateAndSaveData", "Companion", "kyc_release"})
/* compiled from: KycDateOfBirthFragment.kt */
public final class c extends a {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(c.class), "textDateValidator", "getTextDateValidator()Lcom/iqoption/core/ui/widget/edittext/soft/DateFormattingTextWatcher;"))};
    public static final a dBH = new a();
    private HashMap apm;
    private final ProfileStep dBC = ProfileStep.DATE_OF_BIRTH;
    private e dBE;
    private final d dBF = kotlin.f.a.eWg.bnQ();
    private final b dBG = new b(this);
    private final String dtM = "PersonalData";
    private final String dtN = "InputBirthDate";
    private final boolean dxb = true;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/kyc/profile/steps/KycDateOfBirthFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "kyc_release"})
    /* compiled from: KycDateOfBirthFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return c.TAG;
        }

        public final com.iqoption.core.ui.d.c aLM() {
            return new com.iqoption.core.ui.d.c(Bx(), c.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0002¨\u0006\u000b"}, bng = {"com/iqoption/kyc/profile/steps/KycDateOfBirthFragment$validatorListener$1", "Lcom/iqoption/core/ui/widget/edittext/ValidationListener;", "dateInputComplete", "", "day", "", "month", "year", "dateInputInComplete", "dateValidationError", "showError", "kyc_release"})
    /* compiled from: KycDateOfBirthFragment.kt */
    public static final class b implements com.iqoption.core.ui.widget.d.b {
        final /* synthetic */ c dBI;

        b(c cVar) {
            this.dBI = cVar;
        }

        public void amI() {
            Lg();
        }

        private final void Lg() {
            String b = q.b(this.dBI.aMc());
            if (b != null) {
                this.dBI.hH(b);
                com.iqoption.kyc.a.a.h(this.dBI.aKn(), this.dBI.aKo(), b, this.dBI.aLX().Er());
            }
        }

        public void amJ() {
            this.dBI.oM();
        }

        public void n(int i, int i2, int i3) {
            if (this.dBI.aMc().isValid()) {
                String b = q.b(this.dBI.aMc());
                if (b != null) {
                    this.dBI.hH(b);
                    return;
                } else {
                    this.dBI.oM();
                    return;
                }
            }
            Lg();
        }
    }

    private final void a(com.iqoption.core.ui.widget.d.a.b bVar) {
        this.dBF.a(this, anY[0], bVar);
    }

    private final com.iqoption.core.ui.widget.d.a.b aMc() {
        return (com.iqoption.core.ui.widget.d.a.b) this.dBF.b(this, anY[0]);
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
        String name = c.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dBE = (e) com.iqoption.core.ext.a.a((Fragment) this, o.e.fragment_kyc_date_of_birth, viewGroup, false, 4, null);
        a(new com.iqoption.core.ui.widget.d.a.b());
        aMc().setValidationListener(this.dBG);
        e eVar = this.dBE;
        String str = "binding";
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        eVar.duC.addTextChangedListener(aMc());
        eVar = this.dBE;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return eVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        e eVar = this.dBE;
        String str = "binding";
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextInputLayout textInputLayout = eVar.duD;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.kycBirthdayInput");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getString(f.birth_date));
        stringBuilder.append(" (dd.mm.yyyy)");
        textInputLayout.setHint(stringBuilder.toString());
        eVar = this.dBE;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        com.iqoption.kyc.a.c cVar = new com.iqoption.kyc.a.c(eVar.duC, aKn(), aKo(), "BirthDay", 3, aLX().Er());
    }

    public void onStart() {
        super.onStart();
        e eVar = this.dBE;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        IQTextInputEditText iQTextInputEditText = eVar.duC;
        iQTextInputEditText.requestFocus();
        com.iqoption.core.ext.a.d(iQTextInputEditText);
        v.b(iQTextInputEditText.getContext(), iQTextInputEditText);
    }

    /* Access modifiers changed, original: protected */
    public void m(com.iqoption.kyc.profile.a aVar) {
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
        r rVar = r.dth;
        e eVar = this.dBE;
        String str = "binding";
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextInputLayout textInputLayout = eVar.duD;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.kycBirthdayInput");
        e eVar2 = this.dBE;
        if (eVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = eVar2.duC;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycBirthdayEdit");
        rVar.a(textInputLayout, iQTextInputEditText, aVar.aLQ());
    }

    public boolean n(com.iqoption.kyc.profile.a aVar) {
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
        String b = q.b(aMc());
        if (b == null) {
            aLX().a(aMb(), com.iqoption.kyc.profile.a.a(aVar, null, null, q.a(aMc()), null, null, null, null, null, null, null, PointerIconCompat.TYPE_ZOOM_OUT, null));
            return true;
        }
        hH(b);
        return false;
    }

    private final void hH(String str) {
        e eVar = this.dBE;
        String str2 = "binding";
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        TextInputLayout textInputLayout = eVar.duD;
        String str3 = "binding.kycBirthdayInput";
        kotlin.jvm.internal.i.e(textInputLayout, str3);
        textInputLayout.setErrorEnabled(true);
        eVar = this.dBE;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        textInputLayout = eVar.duD;
        kotlin.jvm.internal.i.e(textInputLayout, str3);
        textInputLayout.setError(str);
    }

    private final void oM() {
        e eVar = this.dBE;
        String str = "binding";
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextInputLayout textInputLayout = eVar.duD;
        String str2 = "binding.kycBirthdayInput";
        kotlin.jvm.internal.i.e(textInputLayout, str2);
        textInputLayout.setError((CharSequence) null);
        eVar = this.dBE;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textInputLayout = eVar.duD;
        kotlin.jvm.internal.i.e(textInputLayout, str2);
        textInputLayout.setErrorEnabled(false);
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
