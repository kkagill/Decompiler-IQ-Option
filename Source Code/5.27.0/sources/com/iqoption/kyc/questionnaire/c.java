package com.iqoption.kyc.questionnaire;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireAction;
import com.iqoption.core.microservices.kyc.response.questionnaire.governance.GovernanceStatus;
import com.iqoption.core.util.z;
import com.iqoption.kyc.l;
import io.reactivex.p;
import io.reactivex.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0004J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u0004J\u000e\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007¨\u0006)"}, bng = {"Lcom/iqoption/kyc/questionnaire/KycQuestionnaireContainerViewModel;", "Lcom/iqoption/kyc/KycSubStepContainerViewModel;", "()V", "errors", "Landroidx/lifecycle/LiveData;", "", "getErrors", "()Landroidx/lifecycle/LiveData;", "governanceStatus", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/governance/GovernanceStatus;", "getGovernanceStatus", "questionnaireSelectionViewModel", "Lcom/iqoption/kyc/questionnaire/KycQuestionnaireSelectionViewModel;", "subStepOpened", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "getSubStepOpened", "subSteps", "Lcom/iqoption/kyc/questionnaire/substeps/QuestionSubStep;", "getSubSteps", "warning", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycRiskWarning;", "getWarning", "getQuestions", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/kyc/questionnaire/QuestionsResult;", "goToNextStep", "", "initState", "questionnaireState", "Lcom/iqoption/kyc/questionnaire/state/KycQuestionsDictionaryState;", "isRegulated", "", "loadGovernance", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/governance/ProductGovernance;", "setCurrentStep", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "setFirstSubStep", "first", "Companion", "kyc_release"})
/* compiled from: KycQuestionnaireContainerViewModel.kt */
public final class c extends l {
    public static final a dCF = new a();
    private d dCE;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/questionnaire/KycQuestionnaireContainerViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/questionnaire/KycQuestionnaireContainerViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycQuestionnaireContainerViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c aK(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(c.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…nerViewModel::class.java)");
            c cVar = (c) viewModel;
            cVar.an(fragment);
            cVar.dCE = d.dCW.aL(fragment);
            return cVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/kyc/questionnaire/QuestionsResult;", "kotlin.jvm.PlatformType", "items", "", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnairesItem;", "apply"})
    /* compiled from: KycQuestionnaireContainerViewModel.kt */
    static final class b<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ c dCG;

        b(c cVar) {
            this.dCG = cVar;
        }

        /* renamed from: aW */
        public final p<e> apply(List<com.iqoption.core.microservices.kyc.response.questionnaire.e> list) {
            boolean z;
            Object next;
            kotlin.jvm.internal.i.f(list, "items");
            Collection arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
                if (((com.iqoption.core.microservices.kyc.response.questionnaire.e) next).afh() != QuestionnaireAction.QUESTIONNAIRE) {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            List list2 = (List) arrayList;
            if (list2.isEmpty()) {
                c.a(this.dCG).aMw();
                return p.cI(new e(m.emptyList(), false));
            }
            Iterable<com.iqoption.core.microservices.kyc.response.questionnaire.e> iterable = list2;
            for (Object next2 : iterable) {
                if (((com.iqoption.core.microservices.kyc.response.questionnaire.e) next2).aff()) {
                    break;
                }
            }
            next2 = null;
            if (next2 == null) {
                z = false;
            }
            Collection arrayList2 = new ArrayList(n.e(iterable, 10));
            for (com.iqoption.core.microservices.kyc.response.questionnaire.e afc : iterable) {
                arrayList2.add(com.iqoption.core.microservices.kyc.b.buq.a(afc.afc()));
            }
            return p.b((List) arrayList2, new io.reactivex.b.g<Object[], R>() {
                /* renamed from: s */
                public final e apply(Object[] objArr) {
                    kotlin.jvm.internal.i.f(objArr, "questionnaires");
                    List E = i.E(objArr);
                    if (E != null) {
                        List<com.iqoption.core.microservices.kyc.response.questionnaire.d> sortedCopy = com.iqoption.core.microservices.kyc.response.questionnaire.c.bvh.aeZ().sortedCopy(E);
                        for (com.iqoption.core.microservices.kyc.response.questionnaire.d afd : sortedCopy) {
                            for (com.iqoption.core.microservices.kyc.response.questionnaire.f afk : afd.afd()) {
                                Collections.sort(afk.afk(), com.iqoption.core.microservices.kyc.response.questionnaire.c.bvh.afb());
                            }
                        }
                        kotlin.jvm.internal.i.e(sortedCopy, "sorted");
                        return new e(sortedCopy, z);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.iqoption.core.microservices.kyc.response.questionnaire.KycQuestionnaire>");
                }
            });
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/kyc/questionnaire/QuestionsResult;", "it", "apply"})
    /* compiled from: KycQuestionnaireContainerViewModel.kt */
    static final class c<T, R> implements io.reactivex.b.g<T, R> {
        public static final c dCI = new c();

        c() {
        }

        /* renamed from: a */
        public final com.iqoption.core.ui.d<e> apply(e eVar) {
            kotlin.jvm.internal.i.f(eVar, "it");
            return com.iqoption.core.ui.d.bHb.bS(eVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/kyc/questionnaire/QuestionsResult;", "it", "", "apply"})
    /* compiled from: KycQuestionnaireContainerViewModel.kt */
    static final class d<T, R> implements io.reactivex.b.g<Throwable, com.iqoption.core.ui.d<e>> {
        public static final d dCJ = new d();

        d() {
        }

        /* renamed from: w */
        public final com.iqoption.core.ui.d<e> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, th, null, null, 6, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/governance/ProductGovernance;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycQuestionnaireContainerViewModel.kt */
    static final class e<T> implements io.reactivex.b.f<com.iqoption.core.microservices.kyc.response.questionnaire.governance.a> {
        final /* synthetic */ c dCG;

        e(c cVar) {
            this.dCG = cVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.kyc.response.questionnaire.governance.a aVar) {
            c.a(this.dCG).c(aVar.afu());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/governance/ProductGovernance;", "it", "apply"})
    /* compiled from: KycQuestionnaireContainerViewModel.kt */
    static final class f<T, R> implements io.reactivex.b.g<T, R> {
        public static final f dCK = new f();

        f() {
        }

        /* renamed from: b */
        public final z<com.iqoption.core.microservices.kyc.response.questionnaire.governance.a> apply(com.iqoption.core.microservices.kyc.response.questionnaire.governance.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return z.bRg.bX(aVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/governance/ProductGovernance;", "it", "", "apply"})
    /* compiled from: KycQuestionnaireContainerViewModel.kt */
    static final class g<T, R> implements io.reactivex.b.g<Throwable, z<com.iqoption.core.microservices.kyc.response.questionnaire.governance.a>> {
        public static final g dCL = new g();

        g() {
        }

        /* renamed from: M */
        public final z<com.iqoption.core.microservices.kyc.response.questionnaire.governance.a> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return z.bRg.any();
        }
    }

    public final void b(com.iqoption.core.microservices.kyc.response.step.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "step");
        aIB().b(cVar);
    }

    public final LiveData<z<com.iqoption.core.microservices.kyc.response.questionnaire.governance.a>> aMn() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(com.iqoption.core.microservices.kyc.b.buq.aey().h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).h((io.reactivex.b.f) new e(this)).t(f.dCK).u(g.dCL).bkO());
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…  .toFlowable()\n        )");
        return fromPublisher;
    }

    public final LiveData<com.iqoption.core.ui.d<e>> aMo() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(com.iqoption.core.microservices.kyc.b.buq.aew().q(new b(this)).t(c.dCI).u(d.dCJ).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).bkO());
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…  .toFlowable()\n        )");
        return fromPublisher;
    }

    public final void a(com.iqoption.kyc.questionnaire.b.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "questionnaireState");
        d dVar = this.dCE;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("questionnaireSelectionViewModel");
        }
        dVar.a(aVar);
    }

    public final LiveData<com.iqoption.core.microservices.kyc.response.questionnaire.f> aMp() {
        d dVar = this.dCE;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("questionnaireSelectionViewModel");
        }
        return dVar.aMp();
    }

    public final LiveData<com.iqoption.kyc.questionnaire.substeps.f> aMq() {
        d dVar = this.dCE;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("questionnaireSelectionViewModel");
        }
        return dVar.aMq();
    }

    public final LiveData<com.iqoption.core.microservices.kyc.response.questionnaire.g> aMr() {
        d dVar = this.dCE;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("questionnaireSelectionViewModel");
        }
        return dVar.aMr();
    }

    public final LiveData<Throwable> aMs() {
        d dVar = this.dCE;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("questionnaireSelectionViewModel");
        }
        return dVar.aMs();
    }

    public final void aKS() {
        aIB().en(true);
    }

    public final void es(boolean z) {
        aIB().es(z);
    }

    public final LiveData<GovernanceStatus> aMt() {
        d dVar = this.dCE;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("questionnaireSelectionViewModel");
        }
        return dVar.aMt();
    }

    public final boolean Er() {
        return aIB().Er();
    }
}
