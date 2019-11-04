package com.iqoption.kyc.profile.steps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.Scopes;
import com.iqoption.core.util.v;
import com.iqoption.kyc.b.au;
import com.iqoption.kyc.o.e;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u001dH\u0016J\u001a\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, bng = {"Lcom/iqoption/kyc/profile/steps/KycSexFragment;", "Lcom/iqoption/kyc/profile/steps/BaseKycProfileStepFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycSexBinding;", "isContinuePressedAnalytics", "", "()Z", "keyboardUtil", "Lcom/iqoption/core/util/KeyboardUtil;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "stageName", "getStageName", "step", "Lcom/iqoption/kyc/profile/steps/ProfileStep;", "getStep", "()Lcom/iqoption/kyc/profile/steps/ProfileStep;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onProfileUpdated", "", "profile", "Lcom/iqoption/kyc/profile/KycProfile;", "onStart", "onViewCreated", "view", "validateAndSaveData", "Companion", "kyc_release"})
/* compiled from: KycSexFragment.kt */
public final class f extends a {
    private static final String TAG;
    public static final a dBN = new a();
    private HashMap apm;
    private v bHc;
    private final ProfileStep dBC = ProfileStep.SEX;
    private au dBM;
    private final String dtM = "PersonalData";
    private final String dtN = "ChooseSex";
    private final boolean dxb = true;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/kyc/profile/steps/KycSexFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "kyc_release"})
    /* compiled from: KycSexFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return f.TAG;
        }

        public final com.iqoption.core.ui.d.c aLM() {
            return new com.iqoption.core.ui.d.c(Bx(), f.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "checked", "", "onCheckedChanged"})
    /* compiled from: KycSexFragment.kt */
    static final class b implements OnCheckedChangeListener {
        final /* synthetic */ f dBO;

        b(f fVar) {
            this.dBO = fVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                com.iqoption.kyc.a.a.a(false, this.dBO.aKn(), this.dBO.aKn(), this.dBO.aLX().Er());
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "checked", "", "onCheckedChanged"})
    /* compiled from: KycSexFragment.kt */
    static final class c implements OnCheckedChangeListener {
        final /* synthetic */ f dBO;

        c(f fVar) {
            this.dBO = fVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                com.iqoption.kyc.a.a.a(true, this.dBO.aKn(), this.dBO.aKn(), this.dBO.aLX().Er());
            }
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
        String name = f.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dBM = (au) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_kyc_sex, viewGroup, false, 4, null);
        au auVar = this.dBM;
        if (auVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return auVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        au auVar = this.dBM;
        String str = "binding";
        if (auVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        auVar.dvO.setOnCheckedChangeListener(new b(this));
        auVar = this.dBM;
        if (auVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        auVar.dvP.setOnCheckedChangeListener(new c(this));
        auVar = this.dBM;
        if (auVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        auVar.dvQ.requestFocus();
        this.bHc = new v(getActivity());
    }

    /* Access modifiers changed, original: protected */
    public void m(com.iqoption.kyc.profile.a aVar) {
        au auVar;
        AppCompatRadioButton appCompatRadioButton;
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
        super.m(aVar);
        au auVar2 = this.dBM;
        String str = "binding";
        if (auVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        AppCompatRadioButton appCompatRadioButton2 = auVar2.dvP;
        String str2 = "binding.male";
        kotlin.jvm.internal.i.e(appCompatRadioButton2, str2);
        appCompatRadioButton2.setEnabled(false);
        auVar2 = this.dBM;
        if (auVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        appCompatRadioButton2 = auVar2.dvO;
        String str3 = "binding.female";
        kotlin.jvm.internal.i.e(appCompatRadioButton2, str3);
        appCompatRadioButton2.setEnabled(false);
        Boolean aLR = aVar.aLR();
        if (kotlin.jvm.internal.i.y(aLR, Boolean.valueOf(true))) {
            auVar = this.dBM;
            if (auVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            appCompatRadioButton = auVar.dvP;
            kotlin.jvm.internal.i.e(appCompatRadioButton, str2);
            appCompatRadioButton.setChecked(true);
        } else if (kotlin.jvm.internal.i.y(aLR, Boolean.valueOf(false))) {
            auVar = this.dBM;
            if (auVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            appCompatRadioButton = auVar.dvO;
            kotlin.jvm.internal.i.e(appCompatRadioButton, str3);
            appCompatRadioButton.setChecked(true);
        }
        auVar = this.dBM;
        if (auVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        appCompatRadioButton = auVar.dvP;
        kotlin.jvm.internal.i.e(appCompatRadioButton, str2);
        appCompatRadioButton.setEnabled(true);
        auVar = this.dBM;
        if (auVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        appCompatRadioButton = auVar.dvO;
        kotlin.jvm.internal.i.e(appCompatRadioButton, str3);
        appCompatRadioButton.setEnabled(true);
    }

    public boolean n(com.iqoption.kyc.profile.a aVar) {
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
        au auVar = this.dBM;
        String str = "binding";
        if (auVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        AppCompatRadioButton appCompatRadioButton = auVar.dvP;
        kotlin.jvm.internal.i.e(appCompatRadioButton, "binding.male");
        boolean isChecked = appCompatRadioButton.isChecked();
        au auVar2 = this.dBM;
        if (auVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        AppCompatRadioButton appCompatRadioButton2 = auVar2.dvO;
        kotlin.jvm.internal.i.e(appCompatRadioButton2, "binding.female");
        boolean isChecked2 = appCompatRadioButton2.isChecked();
        if (!isChecked && !isChecked2) {
            return false;
        }
        aLX().a(aMb(), com.iqoption.kyc.profile.a.a(aVar, null, null, null, Boolean.valueOf(isChecked), null, null, null, null, null, null, PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, null));
        return true;
    }

    public void onStart() {
        super.onStart();
        v.j(getActivity());
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
