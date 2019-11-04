package com.iqoption.kyc.questionnaire;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.microservices.kyc.response.questionnaire.KycControlElement;
import com.iqoption.core.microservices.kyc.response.questionnaire.governance.GovernanceStatus;
import com.iqoption.core.util.z;
import com.iqoption.kyc.b.am;
import java.util.HashMap;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0012\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020&H\u0016J\u001a\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000¨\u00064"}, bng = {"Lcom/iqoption/kyc/questionnaire/KycQuestionnaireContainerFragment;", "Lcom/iqoption/core/ui/navigation/BaseStackNavigatorFragment;", "Lcom/iqoption/kyc/analytics/KycAnalyticsFragmentInfo;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycQuestionnaireContainerBinding;", "isContinuePressedAnalytics", "", "()Z", "questionnaireState", "Lcom/iqoption/kyc/questionnaire/state/KycQuestionsDictionaryState;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "stageName", "getStageName", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "getStep", "()Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "step$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/iqoption/kyc/questionnaire/KycQuestionnaireContainerViewModel;", "canReturnToPrevSubStep", "getContainerId", "", "getInitialEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "getLastAnalyticsFragment", "loadQuestions", "", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onViewCreated", "view", "setProgress", "progress", "Companion", "kyc_release"})
/* compiled from: KycQuestionnaireContainerFragment.kt */
public final class a extends com.iqoption.core.ui.d.b implements com.iqoption.kyc.a.b {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "step", "getStep()Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;"))};
    public static final a dCC = new a();
    private HashMap apm;
    private am dCA;
    private com.iqoption.kyc.questionnaire.b.a dCB;
    private c dCz;
    private final kotlin.d dwS = g.c(new KycQuestionnaireContainerFragment$step$2(this));
    private final boolean dxb = true;

    @i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/kyc/questionnaire/KycQuestionnaireContainerFragment$Companion;", "", "()V", "ARG_STEP", "", "STATE_QUESTIONNAIRE", "TAG", "navigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "pop", "", "child", "Landroidx/fragment/app/Fragment;", "showFragment", "entry", "isRoot", "", "kyc_release"})
    /* compiled from: KycQuestionnaireContainerFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c g(com.iqoption.core.microservices.kyc.response.step.c cVar) {
            com.iqoption.core.microservices.kyc.response.step.c cVar2 = cVar;
            kotlin.jvm.internal.i.f(cVar2, "step");
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_STEP", cVar2);
            return new com.iqoption.core.ui.d.c(a.TAG, a.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }

        public static /* synthetic */ void a(a aVar, Fragment fragment, com.iqoption.core.ui.d.c cVar, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            aVar.a(fragment, cVar, z);
        }

        public final void a(Fragment fragment, com.iqoption.core.ui.d.c cVar, boolean z) {
            kotlin.jvm.internal.i.f(fragment, "child");
            kotlin.jvm.internal.i.f(cVar, "entry");
            ((a) com.iqoption.core.ext.a.a(fragment, a.class)).alE().a(cVar, z);
        }

        public final void aJ(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            ((a) com.iqoption.core.ext.a.a(fragment, a.class)).alE().alG();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "result", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/kyc/questionnaire/QuestionsResult;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycQuestionnaireContainerFragment.kt */
    static final class b<T> implements Observer<com.iqoption.core.ui.d<e>> {
        final /* synthetic */ a this$0;

        b(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: a */
        public final void onChanged(com.iqoption.core.ui.d<e> dVar) {
            if (dVar != null) {
                this.this$0.eS(false);
                if (dVar.isSuccess()) {
                    Object data = dVar.getData();
                    if (data == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    e eVar = (e) data;
                    List aMy = eVar.aMy();
                    if ((aMy.isEmpty() ^ 1) != 0) {
                        com.iqoption.kyc.questionnaire.b.a c = com.iqoption.kyc.questionnaire.b.a.dDv.c(aMy, eVar.aff());
                        this.this$0.dCB = c;
                        a.a(this.this$0).a(c);
                    }
                } else {
                    com.iqoption.core.d.a(com.iqoption.kyc.o.f.unknown_error_occurred, 0, 2, null);
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycQuestionnaireContainerFragment.kt */
    static final class c<T> implements Observer<com.iqoption.core.microservices.kyc.response.questionnaire.f> {
        final /* synthetic */ a this$0;

        c(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: b */
        public final void onChanged(com.iqoption.core.microservices.kyc.response.questionnaire.f fVar) {
            a.a(this.this$0).es(this.this$0.aMm() ^ 1);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/governance/ProductGovernance;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycQuestionnaireContainerFragment.kt */
    static final class d<T> implements Observer<z<com.iqoption.core.microservices.kyc.response.questionnaire.governance.a>> {
        public static final d dCD = new d();

        d() {
        }

        /* renamed from: f */
        public final void onChanged(z<com.iqoption.core.microservices.kyc.response.questionnaire.governance.a> zVar) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/governance/GovernanceStatus;", "onChanged"})
    /* compiled from: KycQuestionnaireContainerFragment.kt */
    static final class e<T> implements Observer<GovernanceStatus> {
        final /* synthetic */ a this$0;

        e(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: b */
        public final void onChanged(GovernanceStatus governanceStatus) {
            if (governanceStatus != null) {
                int i = b.aob[governanceStatus.ordinal()];
                if (i == 1) {
                    this.this$0.aMl();
                    return;
                } else if (i == 2 || i == 3) {
                    this.this$0.eS(false);
                    com.iqoption.core.ui.d.g.a(this.this$0.alE(), com.iqoption.kyc.questionnaire.governance.a.dDc.e(this.this$0.aKH()), false, 2, null);
                    return;
                }
            }
            this.this$0.eS(false);
            com.iqoption.core.ui.d.g.a(this.this$0.alE(), com.iqoption.kyc.questionnaire.governance.b.dDe.e(this.this$0.aKH()), false, 2, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "subStep", "Lcom/iqoption/kyc/questionnaire/substeps/QuestionSubStep;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycQuestionnaireContainerFragment.kt */
    static final class f<T> implements Observer<com.iqoption.kyc.questionnaire.substeps.f> {
        final /* synthetic */ a this$0;

        f(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: a */
        public final void onChanged(com.iqoption.kyc.questionnaire.substeps.f fVar) {
            com.iqoption.core.ui.d.c cVar;
            com.iqoption.kyc.a.b e = this.this$0.aLE();
            if (e != null) {
                com.iqoption.kyc.a.a.dtL.i("kyc_next", e.aKn(), e.aKo(), a.a(this.this$0).Er());
            }
            com.iqoption.kyc.questionnaire.b.a f = this.this$0.dCB;
            boolean z = true;
            if (f == null || !f.aMM() || (this.this$0.alE().alH().findFragmentById(this.this$0.KW()) instanceof com.iqoption.kyc.questionnaire.substeps.a)) {
                z = false;
            }
            com.iqoption.core.microservices.kyc.response.questionnaire.f aMZ = fVar != null ? fVar.aMZ() : null;
            if (aMZ == null) {
                cVar = null;
            } else if (aMZ.afn() == KycControlElement.TEXT_INPUT) {
                cVar = com.iqoption.kyc.questionnaire.substeps.d.dDO.b(fVar.afc(), fVar.aMZ(), z);
            } else if (aMZ.afl()) {
                cVar = com.iqoption.kyc.questionnaire.substeps.b.dDI.b(fVar.afc(), fVar.aMZ(), z);
            } else {
                cVar = com.iqoption.kyc.questionnaire.substeps.c.dDL.b(fVar.afc(), fVar.aMZ(), z);
            }
            if (cVar != null) {
                com.iqoption.core.ui.d.g.a(this.this$0.alE(), cVar, false, 2, null);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycRiskWarning;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycQuestionnaireContainerFragment.kt */
    static final class g<T> implements Observer<com.iqoption.core.microservices.kyc.response.questionnaire.g> {
        final /* synthetic */ a this$0;

        g(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: a */
        public final void onChanged(com.iqoption.core.microservices.kyc.response.questionnaire.g gVar) {
            if (gVar == null) {
                return;
            }
            if (gVar.afq()) {
                com.iqoption.core.ui.d.g.a(this.this$0.alE(), com.iqoption.kyc.questionnaire.warning.b.dDZ.c(gVar), false, 2, null);
            } else {
                a.a(this.this$0).aKS();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycQuestionnaireContainerFragment.kt */
    static final class h<T> implements Observer<Throwable> {
        final /* synthetic */ a this$0;

        h(a aVar) {
            this.this$0 = aVar;
        }

        /* JADX WARNING: Missing block: B:2:0x000c, code skipped:
            if (r4 != null) goto L_0x001c;
     */
        /* renamed from: L */
        public final void onChanged(java.lang.Throwable r4) {
            /*
            r3 = this;
            if (r4 == 0) goto L_0x000f;
        L_0x0002:
            r0 = com.iqoption.kyc.h.dsg;
            r0 = r0.aIX();
            r4 = r0.K(r4);
            if (r4 == 0) goto L_0x000f;
        L_0x000e:
            goto L_0x001c;
        L_0x000f:
            r4 = r3.this$0;
            r0 = com.iqoption.kyc.o.f.unknown_error_occurred;
            r4 = r4.getString(r0);
            r0 = "getString(R.string.unknown_error_occurred)";
            kotlin.jvm.internal.i.e(r4, r0);
        L_0x001c:
            r0 = 0;
            r1 = 2;
            r2 = 0;
            com.iqoption.core.d.a(r4, r0, r1, r2);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.questionnaire.a$h.onChanged(java.lang.Throwable):void");
        }
    }

    private final com.iqoption.core.microservices.kyc.response.step.c aKH() {
        kotlin.d dVar = this.dwS;
        j jVar = anY[0];
        return (com.iqoption.core.microservices.kyc.response.step.c) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public com.iqoption.core.ui.d.c KX() {
        return null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dCz = c.dCF.aK(this);
        this.dCB = bundle != null ? (com.iqoption.kyc.questionnaire.b.a) bundle.getParcelable("STATE_QUESTIONNAIRE") : null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dCA = (am) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.kyc.o.e.fragment_kyc_questionnaire_container, viewGroup, false, 4, null);
        am amVar = this.dCA;
        if (amVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return amVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        c cVar = this.dCz;
        String str = "viewModel";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.b(aKH());
        cVar = this.dCz;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LifecycleOwner lifecycleOwner = this;
        cVar.aMp().observe(lifecycleOwner, new c(this));
        com.iqoption.kyc.questionnaire.b.a aVar = this.dCB;
        if (aVar == null) {
            eS(true);
            cVar = this.dCz;
            if (cVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            cVar.aMn().observe(lifecycleOwner, d.dCD);
            cVar = this.dCz;
            if (cVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            cVar.aMt().observe(lifecycleOwner, new e(this));
        } else {
            c cVar2 = this.dCz;
            if (cVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            cVar2.a(aVar);
        }
        cVar = this.dCz;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.aMq().observe(lifecycleOwner, new f(this));
        cVar = this.dCz;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.aMr().observe(lifecycleOwner, new g(this));
        cVar = this.dCz;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.aMs().observe(lifecycleOwner, new h(this));
    }

    private final void aMl() {
        eS(true);
        c cVar = this.dCz;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        cVar.aMo().observe(this, new b(this));
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        if (aMm()) {
            return super.a(fragmentManager);
        }
        return com.iqoption.kyc.navigator.a.dAF.au(this);
    }

    /* JADX WARNING: Missing block: B:11:0x0050, code skipped:
            if (r0 == (r1 != null ? r1.aMD() : null)) goto L_0x0057;
     */
    /* JADX WARNING: Missing block: B:16:0x005b, code skipped:
            if ((r0 instanceof com.iqoption.kyc.questionnaire.warning.b) != false) goto L_0x0057;
     */
    private final boolean aMm() {
        /*
        r6 = this;
        r0 = r6.alE();
        r0 = r0.alH();
        r1 = r0.getBackStackEntryCount();
        r2 = 0;
        r3 = 1;
        if (r1 > r3) goto L_0x0011;
    L_0x0010:
        return r2;
    L_0x0011:
        r4 = r1 + -1;
        r4 = r0.getBackStackEntryAt(r4);
        r5 = "fm.getBackStackEntryAt(entryCount - 1)";
        kotlin.jvm.internal.i.e(r4, r5);
        r4 = r4.getName();
        r4 = r0.findFragmentByTag(r4);
        r1 = r1 + -2;
        r1 = r0.getBackStackEntryAt(r1);
        r5 = "fm.getBackStackEntryAt(entryCount - 2)";
        kotlin.jvm.internal.i.e(r1, r5);
        r1 = r1.getName();
        r0 = r0.findFragmentByTag(r1);
        r1 = r4 instanceof com.iqoption.kyc.questionnaire.warning.b;
        if (r1 == 0) goto L_0x003c;
    L_0x003b:
        goto L_0x005e;
    L_0x003c:
        r1 = r0 instanceof com.iqoption.kyc.questionnaire.substeps.a;
        if (r1 == 0) goto L_0x0053;
    L_0x0040:
        r0 = (com.iqoption.kyc.questionnaire.substeps.a) r0;
        r0 = r0.aMO();
        r1 = r6.dCB;
        if (r1 == 0) goto L_0x004f;
    L_0x004a:
        r1 = r1.aMD();
        goto L_0x0050;
    L_0x004f:
        r1 = 0;
    L_0x0050:
        if (r0 != r1) goto L_0x005e;
    L_0x0052:
        goto L_0x0057;
    L_0x0053:
        r1 = r0 instanceof com.iqoption.kyc.questionnaire.a.a;
        if (r1 == 0) goto L_0x0059;
    L_0x0057:
        r2 = 1;
        goto L_0x005e;
    L_0x0059:
        r0 = r0 instanceof com.iqoption.kyc.questionnaire.warning.b;
        if (r0 == 0) goto L_0x005e;
    L_0x005d:
        goto L_0x0057;
    L_0x005e:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.questionnaire.a.aMm():boolean");
    }

    private final void eS(boolean z) {
        String str = "binding.kycQuestionnaireProgress";
        String str2 = "binding.kycQuestionnaireContainer";
        String str3 = "binding";
        am amVar;
        FrameLayout frameLayout;
        ContentLoadingProgressBar contentLoadingProgressBar;
        if (z) {
            amVar = this.dCA;
            if (amVar == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            frameLayout = amVar.dvH;
            kotlin.jvm.internal.i.e(frameLayout, str2);
            com.iqoption.core.ext.a.al(frameLayout);
            amVar = this.dCA;
            if (amVar == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            contentLoadingProgressBar = amVar.dvI;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, str);
            contentLoadingProgressBar.setVisibility(0);
            return;
        }
        amVar = this.dCA;
        if (amVar == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        frameLayout = amVar.dvH;
        kotlin.jvm.internal.i.e(frameLayout, str2);
        com.iqoption.core.ext.a.ak(frameLayout);
        amVar = this.dCA;
        if (amVar == null) {
            kotlin.jvm.internal.i.lG(str3);
        }
        contentLoadingProgressBar = amVar.dvI;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, str);
        com.iqoption.core.ext.a.al(contentLoadingProgressBar);
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        bundle.putParcelable("STATE_QUESTIONNAIRE", this.dCB);
        super.onSaveInstanceState(bundle);
    }

    public int KW() {
        return com.iqoption.kyc.o.d.kycQuestionnaireContainer;
    }

    private final com.iqoption.kyc.a.b aLE() {
        Fragment findFragmentById = alE().alH().findFragmentById(KW());
        if (!(findFragmentById instanceof com.iqoption.kyc.a.b)) {
            findFragmentById = null;
        }
        return (com.iqoption.kyc.a.b) findFragmentById;
    }

    public String aKn() {
        com.iqoption.kyc.a.b aLE = aLE();
        if (aLE != null) {
            String aKn = aLE.aKn();
            if (aKn != null) {
                return aKn;
            }
        }
        return "";
    }

    public String aKo() {
        com.iqoption.kyc.a.b aLE = aLE();
        if (aLE != null) {
            String aKo = aLE.aKo();
            if (aKo != null) {
                return aKo;
            }
        }
        return "";
    }

    public boolean aKp() {
        return this.dxb;
    }
}
