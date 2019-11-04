package com.iqoption.kyc.profile.steps;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.Scopes;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.microservices.kyc.response.b;
import com.iqoption.core.ui.d.c;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.util.v;
import com.iqoption.kyc.b.s;
import com.iqoption.kyc.o.e;
import com.iqoption.kyc.o.f;
import com.iqoption.kyc.r;
import com.iqoption.kyc.u;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0002J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\u001a\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\n\u0010&\u001a\u0004\u0018\u00010'H\u0014J\u0010\u0010(\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006*"}, bng = {"Lcom/iqoption/kyc/profile/steps/KycLegalNameFragment;", "Lcom/iqoption/kyc/profile/steps/BaseKycProfileStepFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycLegalNameBinding;", "isContinuePressedAnalytics", "", "()Z", "isLatNameFocused", "screenName", "", "getScreenName", "()Ljava/lang/String;", "stageName", "getStageName", "step", "Lcom/iqoption/kyc/profile/steps/ProfileStep;", "getStep", "()Lcom/iqoption/kyc/profile/steps/ProfileStep;", "isNameValid", "name", "regexp", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onProfileUpdated", "", "profile", "Lcom/iqoption/kyc/profile/KycProfile;", "onStart", "onStop", "onViewCreated", "view", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "validateAndSaveData", "Companion", "kyc_release"})
/* compiled from: KycLegalNameFragment.kt */
public final class d extends a {
    private static final String TAG;
    public static final a dBK = new a();
    private HashMap apm;
    private final ProfileStep dBC = ProfileStep.LEGAL_NAME;
    private s dBJ;
    private boolean dzK;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, bng = {"Lcom/iqoption/kyc/profile/steps/KycLegalNameFragment$Companion;", "", "()V", "MAX_NAME_LENGTH", "", "TAG", "", "getTAG", "()Ljava/lang/String;", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "kyc_release"})
    /* compiled from: KycLegalNameFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return d.TAG;
        }

        public final c aLM() {
            return new c(Bx(), d.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public String aKn() {
        return "PersonalData";
    }

    public String aKo() {
        return "InputName";
    }

    public boolean aKp() {
        return true;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = d.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dBJ = (s) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_kyc_legal_name, viewGroup, false, 4, null);
        s sVar = this.dBJ;
        if (sVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return sVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        s sVar = this.dBJ;
        String str = "binding";
        if (sVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = sVar.dvc;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycFirstNameEdit");
        EditText editText = iQTextInputEditText;
        s sVar2 = this.dBJ;
        if (sVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextInputLayout textInputLayout = sVar2.dvd;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.kycFirstNameInput");
        u.a(editText, textInputLayout);
        sVar = this.dBJ;
        if (sVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        iQTextInputEditText = sVar.dve;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycLastNameEdit");
        editText = iQTextInputEditText;
        sVar2 = this.dBJ;
        if (sVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textInputLayout = sVar2.dvf;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.kycLastNameInput");
        u.a(editText, textInputLayout);
        sVar = this.dBJ;
        if (sVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        com.iqoption.kyc.a.c cVar = new com.iqoption.kyc.a.c(sVar.dvc, aKn(), aKo(), "Name", 1, aLX().Er());
        sVar = this.dBJ;
        if (sVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        com.iqoption.kyc.a.c cVar2 = new com.iqoption.kyc.a.c(sVar.dve, aKn(), aKo(), "Surname", 2, aLX().Er());
    }

    /* Access modifiers changed, original: protected */
    public void m(com.iqoption.kyc.profile.a aVar) {
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
        String str = null;
        String firstName = (kotlin.jvm.internal.i.y(aVar.getFirstName(), com.iqoption.core.ext.a.q(this).getString(f.name)) ^ 1) != 0 ? aVar.getFirstName() : null;
        if ((kotlin.jvm.internal.i.y(aVar.getLastName(), com.iqoption.core.ext.a.q(this).getString(f.surname)) ^ 1) != 0) {
            str = aVar.getLastName();
        }
        r rVar = r.dth;
        s sVar = this.dBJ;
        String str2 = "binding";
        if (sVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        TextInputLayout textInputLayout = sVar.dvd;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.kycFirstNameInput");
        s sVar2 = this.dBJ;
        if (sVar2 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        IQTextInputEditText iQTextInputEditText = sVar2.dvc;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycFirstNameEdit");
        rVar.a(textInputLayout, iQTextInputEditText, firstName);
        rVar = r.dth;
        s sVar3 = this.dBJ;
        if (sVar3 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        TextInputLayout textInputLayout2 = sVar3.dvf;
        kotlin.jvm.internal.i.e(textInputLayout2, "binding.kycLastNameInput");
        sVar = this.dBJ;
        if (sVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        IQTextInputEditText iQTextInputEditText2 = sVar.dve;
        kotlin.jvm.internal.i.e(iQTextInputEditText2, "binding.kycLastNameEdit");
        rVar.a(textInputLayout2, iQTextInputEditText2, str);
    }

    public boolean n(com.iqoption.kyc.profile.a aVar) {
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
        s sVar = this.dBJ;
        String str = "binding";
        if (sVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = sVar.dvc;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycFirstNameEdit");
        String valueOf = String.valueOf(iQTextInputEditText.getText());
        b WW = com.iqoption.core.data.repository.d.bdF.WW();
        String str2 = null;
        String str3 = "binding.kycFirstNameInput";
        TextInputLayout textInputLayout;
        if (az(valueOf, WW != null ? WW.getFirstName() : null)) {
            s sVar2 = this.dBJ;
            if (sVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            TextInputLayout textInputLayout2 = sVar2.dvd;
            kotlin.jvm.internal.i.e(textInputLayout2, str3);
            CharSequence charSequence = null;
            textInputLayout2.setError(charSequence);
            sVar2 = this.dBJ;
            if (sVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            IQTextInputEditText iQTextInputEditText2 = sVar2.dve;
            kotlin.jvm.internal.i.e(iQTextInputEditText2, "binding.kycLastNameEdit");
            String valueOf2 = String.valueOf(iQTextInputEditText2.getText());
            b WW2 = com.iqoption.core.data.repository.d.bdF.WW();
            if (WW2 != null) {
                str2 = WW2.getLastName();
            }
            String str4 = "binding.kycLastNameInput";
            if (az(valueOf2, str2)) {
                s sVar3 = this.dBJ;
                if (sVar3 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                TextInputLayout textInputLayout3 = sVar3.dvf;
                kotlin.jvm.internal.i.e(textInputLayout3, str4);
                textInputLayout3.setError(charSequence);
                aLX().p(com.iqoption.kyc.profile.a.a(aVar, valueOf, valueOf2, null, null, null, null, null, null, null, null, PointerIconCompat.TYPE_GRAB, null));
                return true;
            }
            sVar = this.dBJ;
            if (sVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textInputLayout = sVar.dvf;
            kotlin.jvm.internal.i.e(textInputLayout, str4);
            textInputLayout.setError(getString(f.incorrect_value));
            return false;
        }
        sVar = this.dBJ;
        if (sVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textInputLayout = sVar.dvd;
        kotlin.jvm.internal.i.e(textInputLayout, str3);
        textInputLayout.setError(getString(f.incorrect_value));
        return false;
    }

    public void onStart() {
        Object obj;
        super.onStart();
        String str = "binding";
        s sVar;
        if (this.dzK) {
            sVar = this.dBJ;
            if (sVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            obj = sVar.dve;
        } else {
            sVar = this.dBJ;
            if (sVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            obj = sVar.dvc;
        }
        kotlin.jvm.internal.i.e(obj, "if (isLatNameFocused) bi… binding.kycFirstNameEdit");
        obj.requestFocus();
        com.iqoption.core.ext.a.d((EditText) obj);
        v.b(getContext(), (View) obj);
    }

    public void onStop() {
        s sVar = this.dBJ;
        if (sVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        this.dzK = sVar.dve.hasFocus();
        super.onStop();
    }

    public ProfileStep aMb() {
        return this.dBC;
    }

    private final boolean az(String str, String str2) {
        CharSequence charSequence = str;
        int length = charSequence.length() - 1;
        int i = 0;
        Object obj = null;
        while (i <= length) {
            Object obj2 = charSequence.charAt(obj == null ? i : length) <= ' ' ? 1 : null;
            if (obj == null) {
                if (obj2 == null) {
                    obj = 1;
                } else {
                    i++;
                }
            } else if (obj2 == null) {
                break;
            } else {
                length--;
            }
        }
        str = charSequence.subSequence(i, length + 1).toString();
        if (TextUtils.isEmpty(str) || str.length() > 30 || !r.dth.g(str, str2, false)) {
            return false;
        }
        return true;
    }
}
