package com.iqoption.kyc.questionnaire.governance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.microservices.kyc.response.questionnaire.governance.GovernanceStatus;
import com.iqoption.kyc.b.o;
import com.iqoption.kyc.o.e;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\"\u001a\u00020\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000¨\u0006$"}, bng = {"Lcom/iqoption/kyc/questionnaire/governance/KycGovernanceFragment;", "Lcom/iqoption/kyc/BaseKycStepFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycGovernanceBinding;", "isContinuePressedAnalytics", "", "()Z", "screenName", "", "getScreenName", "()Ljava/lang/String;", "stageName", "getStageName", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "getStep", "()Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "step$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/iqoption/kyc/questionnaire/governance/KycGovernanceViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "showBottomBar", "Companion", "kyc_release"})
/* compiled from: KycGovernanceFragment.kt */
public final class b extends com.iqoption.kyc.b {
    private static final String TAG = b.class.getName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(b.class), "step", "getStep()Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;"))};
    public static final a dDe = new a();
    private HashMap apm;
    private c dDb;
    private o dDd;
    private final String dtM = "TradingExperience";
    private final String dtN = "governance";
    private final kotlin.d dwS = g.c(new KycGovernanceFragment$step$2(this));
    private final boolean dxb;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/kyc/questionnaire/governance/KycGovernanceFragment$Companion;", "", "()V", "ARG_STEP", "", "TAG", "kotlin.jvm.PlatformType", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "kyc_release"})
    /* compiled from: KycGovernanceFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c e(com.iqoption.core.microservices.kyc.response.step.c cVar) {
            com.iqoption.core.microservices.kyc.response.step.c cVar2 = cVar;
            kotlin.jvm.internal.i.f(cVar2, "step");
            String Bw = b.TAG;
            kotlin.jvm.internal.i.e(Bw, "TAG");
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_STEP", cVar2);
            return new com.iqoption.core.ui.d.c(Bw, b.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: KycGovernanceFragment.kt */
    static final class b implements OnCheckedChangeListener {
        final /* synthetic */ b this$0;

        b(b bVar) {
            this.this$0 = bVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                b.a(this.this$0).d(GovernanceStatus.APPROVE_RISK);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: KycGovernanceFragment.kt */
    static final class c implements OnCheckedChangeListener {
        final /* synthetic */ b this$0;

        c(b bVar) {
            this.this$0 = bVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                b.a(this.this$0).d(GovernanceStatus.NOT_CONFIRM_RISK);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycGovernanceFragment.kt */
    static final class d<T> implements Observer<String> {
        public static final d dDf = new d();

        d() {
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            kotlin.jvm.internal.i.e(str, "it");
            com.iqoption.core.d.a(str, 0, 2, null);
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

    public static final /* synthetic */ c a(b bVar) {
        c cVar = bVar.dDb;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return cVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dDb = c.dDi.aM(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dDd = (o) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_kyc_governance, viewGroup, false, 4, null);
        o oVar = this.dDd;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return oVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        c cVar = this.dDb;
        String str = "viewModel";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.aMA();
        o oVar = this.dDd;
        String str2 = "binding";
        if (oVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        oVar.duY.setOnCheckedChangeListener(new b(this));
        oVar = this.dDd;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        oVar.duZ.setOnCheckedChangeListener(new c(this));
        cVar = this.dDb;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.aMz().observe(this, d.dDf);
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
}
