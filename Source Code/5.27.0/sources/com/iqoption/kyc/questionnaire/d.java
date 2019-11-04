package com.iqoption.kyc.questionnaire;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.microservices.kyc.response.questionnaire.f;
import com.iqoption.core.microservices.kyc.response.questionnaire.g;
import com.iqoption.core.microservices.kyc.response.questionnaire.governance.GovernanceStatus;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.kyc.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 42\u00020\u0001:\u00014B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00132\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020\u0013J\u000e\u0010)\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010*\u001a\u00020\u001fJ\b\u0010+\u001a\u00020\u001fH\u0002J\u0010\u0010,\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010\rJ\u000e\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u0013J\b\u00100\u001a\u00020\u001fH\u0002J\u0006\u00101\u001a\u00020\u001fJ\u0010\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\tR\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\tR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u00065"}, bng = {"Lcom/iqoption/kyc/questionnaire/KycQuestionnaireSelectionViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "commonSelectionViewModel", "Lcom/iqoption/kyc/KycSelectionViewModel;", "errors", "Landroidx/lifecycle/LiveData;", "", "getErrors", "()Landroidx/lifecycle/LiveData;", "errorsLiveData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "governanceStatus", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/governance/GovernanceStatus;", "getGovernanceStatus", "governanceStatusData", "questionnaireState", "Lcom/iqoption/kyc/questionnaire/state/KycQuestionsDictionaryState;", "subStepOpened", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "getSubStepOpened", "subStepOpenedLiveData", "subSteps", "Lcom/iqoption/kyc/questionnaire/substeps/QuestionSubStep;", "getSubSteps", "subStepsLiveData", "warning", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycRiskWarning;", "getWarning", "warningLiveData", "answer", "", "kycQuestionsItem", "answerIds", "", "", "answerText", "", "getAnswer", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycAnswer;", "item", "initState", "loadWarning", "saveCurrentQuestionnaire", "setGovernanceStatus", "status", "setSubStepOpened", "subStep", "showNextSubStep", "updateProgress", "updateTitle", "dictionaryState", "Companion", "kyc_release"})
/* compiled from: KycQuestionnaireSelectionViewModel.kt */
public final class d extends com.iqoption.core.ui.f.d {
    public static final a dCW = new a();
    private j dBs;
    private com.iqoption.kyc.questionnaire.b.a dCB;
    private final com.iqoption.core.data.b.b<Throwable> dCM = new com.iqoption.core.data.b.b();
    private final LiveData<Throwable> dCN = this.dCM;
    private final com.iqoption.core.data.b.b<f> dCO = new com.iqoption.core.data.b.b();
    private final LiveData<f> dCP = this.dCO;
    private final com.iqoption.core.data.b.b<com.iqoption.kyc.questionnaire.substeps.f> dCQ = new com.iqoption.core.data.b.b();
    private final LiveData<com.iqoption.kyc.questionnaire.substeps.f> dCR = this.dCQ;
    private final com.iqoption.core.data.b.b<g> dCS = new com.iqoption.core.data.b.b();
    private final LiveData<g> dCT = this.dCS;
    private final com.iqoption.core.data.b.b<GovernanceStatus> dCU = new com.iqoption.core.data.b.b();
    private final LiveData<GovernanceStatus> dCV = this.dCU;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/questionnaire/KycQuestionnaireSelectionViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/questionnaire/KycQuestionnaireSelectionViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycQuestionnaireSelectionViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d aL(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(com.iqoption.kyc.f.dsb.ak(fragment)).get(d.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ge…ionViewModel::class.java)");
            d dVar = (d) viewModel;
            dVar.dBs = j.dsW.am(com.iqoption.kyc.f.dsb.aj(fragment));
            return dVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycRiskWarning;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycQuestionnaireSelectionViewModel.kt */
    static final class b<T> implements io.reactivex.b.f<g> {
        final /* synthetic */ d dCX;

        b(d dVar) {
            this.dCX = dVar;
        }

        /* renamed from: b */
        public final void accept(g gVar) {
            this.dCX.dCS.postValue(gVar);
            d.b(this.dCX).eu(false);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycQuestionnaireSelectionViewModel.kt */
    static final class c<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ d dCX;

        c(d dVar) {
            this.dCX = dVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            d.b(this.dCX).eu(false);
            this.dCX.dCM.postValue(th);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: KycQuestionnaireSelectionViewModel.kt */
    static final class d implements io.reactivex.b.a {
        final /* synthetic */ d dCX;
        final /* synthetic */ com.iqoption.kyc.questionnaire.b.a dCY;

        d(d dVar, com.iqoption.kyc.questionnaire.b.a aVar) {
            this.dCX = dVar;
            this.dCY = aVar;
        }

        public final void run() {
            if (this.dCY.aMI()) {
                this.dCY.aMJ();
                this.dCX.aMu();
                this.dCX.b(this.dCY);
                return;
            }
            this.dCX.aMw();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycQuestionnaireSelectionViewModel.kt */
    static final class e<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ d dCX;

        e(d dVar) {
            this.dCX = dVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            d.b(this.dCX).eu(false);
            this.dCX.dCM.postValue(th);
        }
    }

    public final LiveData<Throwable> aMs() {
        return this.dCN;
    }

    public final LiveData<f> aMp() {
        return this.dCP;
    }

    public final void c(f fVar) {
        kotlin.jvm.internal.i.f(fVar, "subStep");
        this.dCO.postValue(fVar);
        j jVar = this.dBs;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("commonSelectionViewModel");
        }
        jVar.eu(false);
    }

    public final void a(com.iqoption.kyc.questionnaire.b.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "questionnaireState");
        if (this.dCB == null) {
            this.dCB = aVar;
            aMu();
            b(aVar);
        }
    }

    public final LiveData<com.iqoption.kyc.questionnaire.substeps.f> aMq() {
        return this.dCR;
    }

    private final void aMu() {
        com.iqoption.kyc.questionnaire.b.a aVar = this.dCB;
        if (aVar != null && aVar.aMF()) {
            this.dCQ.postValue(new com.iqoption.kyc.questionnaire.substeps.f(aVar.aMH(), aVar.aMD()));
        }
    }

    public final LiveData<g> aMr() {
        return this.dCT;
    }

    public final void a(f fVar, List<Integer> list, String str) {
        kotlin.jvm.internal.i.f(fVar, "kycQuestionsItem");
        kotlin.jvm.internal.i.f(list, "answerIds");
        com.iqoption.kyc.questionnaire.b.a aVar = this.dCB;
        if (aVar != null) {
            aVar.a(fVar, list, str);
        }
        if (aVar == null || !aVar.aME()) {
            aMv();
        } else {
            aMu();
        }
    }

    private final void aMv() {
        com.iqoption.kyc.questionnaire.b.a aVar = this.dCB;
        if (aVar != null) {
            j jVar = this.dBs;
            if (jVar == null) {
                kotlin.jvm.internal.i.lG("commonSelectionViewModel");
            }
            jVar.eu(true);
            Set entrySet = aVar.aMG().entrySet();
            kotlin.jvm.internal.i.e(entrySet, "questionnaireStateLocal.answeredQuestions.entries");
            Iterable<Entry> iterable = entrySet;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (Entry entry : iterable) {
                arrayList.add(((com.iqoption.core.microservices.kyc.response.questionnaire.a) entry.getValue()).eU(((f) entry.getKey()).afj()));
            }
            io.reactivex.disposables.b a = com.iqoption.core.microservices.kyc.b.buq.a(aVar.aMD(), (List) arrayList).b(com.iqoption.core.rx.i.aki()).a(com.iqoption.core.rx.i.akj()).a(new d(this, aVar), new e(this));
            kotlin.jvm.internal.i.e(a, "KycQuestionnaireRequests…      }\n                )");
            b(a);
        }
    }

    public final void aMw() {
        io.reactivex.disposables.b a = com.iqoption.core.microservices.kyc.b.buq.aex().h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new b(this), (io.reactivex.b.f) new c(this));
        kotlin.jvm.internal.i.e(a, "KycQuestionnaireRequests…      }\n                )");
        b(a);
    }

    public final com.iqoption.core.microservices.kyc.response.questionnaire.a d(f fVar) {
        kotlin.jvm.internal.i.f(fVar, "item");
        com.iqoption.kyc.questionnaire.b.a aVar = this.dCB;
        if (aVar != null) {
            HashMap aMG = aVar.aMG();
            if (aMG != null) {
                return (com.iqoption.core.microservices.kyc.response.questionnaire.a) aMG.get(fVar);
            }
        }
        return null;
    }

    public final void aMx() {
        com.iqoption.kyc.questionnaire.b.a aVar = this.dCB;
        if (aVar != null) {
            float aML = ((((float) aVar.aML()) * ((float) 100)) / ((float) aVar.aMK())) - ((float) com.iqoption.core.microservices.kyc.response.step.f.afQ());
            j jVar = this.dBs;
            if (jVar == null) {
                kotlin.jvm.internal.i.lG("commonSelectionViewModel");
            }
            jVar.a(KycStepType.KYC_QUESTIONNAIRE, (int) aML);
        }
    }

    public final LiveData<GovernanceStatus> aMt() {
        return this.dCV;
    }

    public final void c(GovernanceStatus governanceStatus) {
        this.dCU.postValue(governanceStatus);
    }

    private final void b(com.iqoption.kyc.questionnaire.b.a aVar) {
        j jVar = this.dBs;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("commonSelectionViewModel");
        }
        jVar.setTitle(aVar.aMC().getName());
    }
}
