package com.iqoption.kyc.questionnaire.governance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ext.g;
import com.iqoption.core.microservices.kyc.response.questionnaire.governance.GovernanceStatus;
import com.iqoption.kyc.b.q;
import com.iqoption.kyc.o.e;
import java.util.HashMap;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010#\u001a\u00020\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000¨\u0006%"}, bng = {"Lcom/iqoption/kyc/questionnaire/governance/KycGovernanceErrorFragment;", "Lcom/iqoption/kyc/BaseKycStepFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycGovernanceErrorBinding;", "isContinuePressedAnalytics", "", "()Z", "screenName", "", "getScreenName", "()Ljava/lang/String;", "stageName", "getStageName", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "getStep", "()Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "step$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/iqoption/kyc/questionnaire/governance/KycGovernanceViewModel;", "back", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "showBottomBar", "Companion", "kyc_release"})
/* compiled from: KycGovernanceErrorFragment.kt */
public final class a extends com.iqoption.kyc.b {
    private static final String TAG = a.class.getName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "step", "getStep()Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;"))};
    public static final a dDc = new a();
    private HashMap apm;
    private q dDa;
    private c dDb;
    private final String dtM = "TradingExperience";
    private final String dtN = "governanceError";
    private final d dwS = g.c(new KycGovernanceErrorFragment$step$2(this));
    private final boolean dxb;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/kyc/questionnaire/governance/KycGovernanceErrorFragment$Companion;", "", "()V", "ARG_STEP", "", "TAG", "kotlin.jvm.PlatformType", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "kyc_release"})
    /* compiled from: KycGovernanceErrorFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c e(com.iqoption.core.microservices.kyc.response.step.c cVar) {
            com.iqoption.core.microservices.kyc.response.step.c cVar2 = cVar;
            kotlin.jvm.internal.i.f(cVar2, "step");
            String Bw = a.TAG;
            kotlin.jvm.internal.i.e(Bw, "TAG");
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_STEP", cVar2);
            return new com.iqoption.core.ui.d.c(Bw, a.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ a this$0;

        public b(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            a.a(this.this$0).d(GovernanceStatus.NOT_PROCEED);
            com.iqoption.kyc.navigator.a.dAF.az(this.this$0);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends g {
        final /* synthetic */ a this$0;

        public c(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            if (!this.this$0.aly()) {
                com.iqoption.kyc.questionnaire.a.dCC.a(this.this$0, b.dDe.e(this.this$0.aKH()), true);
                a.a(this.this$0).d(null);
            }
        }
    }

    private final com.iqoption.core.microservices.kyc.response.step.c aKH() {
        d dVar = this.dwS;
        j jVar = anY[0];
        return (com.iqoption.core.microservices.kyc.response.step.c) dVar.getValue();
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

    public static final /* synthetic */ c a(a aVar) {
        c cVar = aVar.dDb;
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
        this.dDa = (q) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_kyc_governance_error, viewGroup, false, 4, null);
        q qVar = this.dDa;
        if (qVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return qVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        c cVar = this.dDb;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        cVar.aMA();
        q qVar = this.dDa;
        String str = "binding";
        if (qVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = qVar.dvb;
        kotlin.jvm.internal.i.e(textView, "binding.governanceTraderoom");
        textView.setOnClickListener(new b(this));
        qVar = this.dDa;
        if (qVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textView = qVar.dva;
        kotlin.jvm.internal.i.e(textView, "binding.governanceChange");
        textView.setOnClickListener(new c(this));
    }

    public void back() {
        c cVar = this.dDb;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        cVar.d(null);
        super.back();
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
