package com.iqoption.kyc.profile.steps.reportable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.Scopes;
import com.iqoption.core.ui.d.g;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.core.util.v;
import com.iqoption.kyc.b.ao;
import com.iqoption.kyc.profile.steps.ProfileStep;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\u001a\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0006H\u0002J\b\u0010(\u001a\u00020\u0006H\u0014J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0006H\u0002J\u0010\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006/"}, bng = {"Lcom/iqoption/kyc/profile/steps/reportable/KycReportableFragment;", "Lcom/iqoption/kyc/profile/steps/BaseKycProfileStepFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycReportableBinding;", "isContinuePressedAnalytics", "", "()Z", "keyboardListener", "Lcom/iqoption/core/util/KeyboardUtil$OnKeyboardVisibilityListener;", "keyboardUtil", "Lcom/iqoption/core/util/KeyboardUtil;", "reportableViewModel", "Lcom/iqoption/kyc/profile/steps/reportable/KycReportableViewModel;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "stageName", "getStageName", "step", "Lcom/iqoption/kyc/profile/steps/ProfileStep;", "getStep", "()Lcom/iqoption/kyc/profile/steps/ProfileStep;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onStop", "onViewCreated", "view", "saveReportable", "reportable", "showBottomBar", "showProgress", "show", "validateAndSaveData", "profile", "Lcom/iqoption/kyc/profile/KycProfile;", "Companion", "kyc_release"})
/* compiled from: KycReportableFragment.kt */
public final class b extends com.iqoption.kyc.profile.steps.a {
    private static final String TAG;
    public static final a dCu = new a();
    private HashMap apm;
    private v bHc;
    private final ProfileStep dBC = ProfileStep.REPORTABLE;
    private ao dCr;
    private c dCs;
    private final com.iqoption.core.util.v.a dCt = new b(this);
    private final String dtM = "PersonalData";
    private final String dtN = "USPerson";
    private final boolean dxb = true;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/kyc/profile/steps/reportable/KycReportableFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "kyc_release"})
    /* compiled from: KycReportableFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return b.TAG;
        }

        public final com.iqoption.core.ui.d.c aLM() {
            return new com.iqoption.core.ui.d.c(Bx(), b.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: KycReportableFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ b dCv;

        c(b bVar) {
            this.dCv = bVar;
        }

        public final void onClick(View view) {
            com.iqoption.kyc.a.a.b(false, this.dCv.aKn(), this.dCv.aKo(), this.dCv.aLX().Er());
            this.dCv.eR(false);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: KycReportableFragment.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ b dCv;

        d(b bVar) {
            this.dCv = bVar;
        }

        public final void onClick(View view) {
            com.iqoption.kyc.a.a.b(true, this.dCv.aKn(), this.dCv.aKo(), this.dCv.aLX().Er());
            this.dCv.eR(true);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "visible", "", "onKeyboardVisibilityChanged"})
    /* compiled from: KycReportableFragment.kt */
    static final class b implements com.iqoption.core.util.v.a {
        final /* synthetic */ b dCv;

        b(b bVar) {
            this.dCv = bVar;
        }

        public final void onKeyboardVisibilityChanged(boolean z) {
            if (z && this.dCv.isAdded()) {
                b.b(this.dCv).dvJ.requestFocus();
                v.j(this.dCv.getActivity());
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: KycReportableFragment.kt */
    static final class e<T> implements Observer<Boolean> {
        final /* synthetic */ b dCv;

        e(b bVar) {
            this.dCv = bVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            this.dCv.ev(bool != null ? bool.booleanValue() : false);
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean aIE() {
        return false;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ ao b(b bVar) {
        ao aoVar = bVar.dCr;
        if (aoVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return aoVar;
    }

    static {
        String name = b.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dCs = c.dCx.aI(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dCr = (ao) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.kyc.o.e.fragment_kyc_reportable, viewGroup, false, 4, null);
        ao aoVar = this.dCr;
        if (aoVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return aoVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ao aoVar = this.dCr;
        String str = "binding";
        if (aoVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        aoVar.cgZ.setOnClickListener(new c(this));
        aoVar = this.dCr;
        if (aoVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        aoVar.chb.setOnClickListener(new d(this));
        this.bHc = new v(getActivity());
        c cVar = this.dCs;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("reportableViewModel");
        }
        cVar.aJl().observe(this, new e(this));
    }

    private final void eR(boolean z) {
        com.iqoption.kyc.profile.a aLY = aLY();
        if (aLY == null) {
            return;
        }
        if (z) {
            g.a(com.iqoption.kyc.profile.b.dBp.P(this), a.dCq.eQ(false), false, 2, null);
            return;
        }
        c cVar = this.dCs;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("reportableViewModel");
        }
        cVar.q(aLY);
    }

    public void onStart() {
        super.onStart();
        v.a(this.dCt);
    }

    public void onStop() {
        super.onStop();
        v.b(this.dCt);
    }

    private final void ev(boolean z) {
        String str = "binding.yes";
        String str2 = "binding";
        ao aoVar;
        ConfirmButtonView confirmButtonView;
        if (z) {
            aoVar = this.dCr;
            if (aoVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            aoVar.cgZ.d(true, false);
            aoVar = this.dCr;
            if (aoVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            confirmButtonView = aoVar.chb;
            kotlin.jvm.internal.i.e(confirmButtonView, str);
            confirmButtonView.setEnabled(false);
            return;
        }
        aoVar = this.dCr;
        if (aoVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        aoVar.cgZ.d(false, false);
        aoVar = this.dCr;
        if (aoVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        confirmButtonView = aoVar.chb;
        kotlin.jvm.internal.i.e(confirmButtonView, str);
        confirmButtonView.setEnabled(true);
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

    public boolean n(com.iqoption.kyc.profile.a aVar) {
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
        throw new IllegalStateException("Should not be called");
    }
}
