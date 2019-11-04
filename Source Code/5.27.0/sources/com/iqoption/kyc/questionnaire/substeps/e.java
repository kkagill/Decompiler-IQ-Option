package com.iqoption.kyc.questionnaire.substeps;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.microservices.kyc.response.questionnaire.f;
import com.iqoption.kyc.l;
import com.iqoption.kyc.questionnaire.d;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\bJ\u0006\u0010\u0019\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, bng = {"Lcom/iqoption/kyc/questionnaire/substeps/KycQuestionnaireSubStepViewModel;", "Lcom/iqoption/kyc/KycSubStepContainerViewModel;", "()V", "questionnaireSelectionViewModel", "Lcom/iqoption/kyc/questionnaire/KycQuestionnaireSelectionViewModel;", "answerMultiChoice", "", "kycQuestionsItem", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "answerIds", "", "", "answerSingleChoice", "answerId", "answerText", "", "getAnswer", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycAnswer;", "item", "isRegulated", "", "setNextEnabled", "enabled", "setSubStepOpened", "subStep", "updateProgress", "Companion", "kyc_release"})
/* compiled from: KycQuestionnaireSubStepViewModel.kt */
public final class e extends l {
    public static final a dDQ = new a();
    private d dCE;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/questionnaire/substeps/KycQuestionnaireSubStepViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/questionnaire/substeps/KycQuestionnaireSubStepViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycQuestionnaireSubStepViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final e aO(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(e.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…tepViewModel::class.java)");
            e eVar = (e) viewModel;
            eVar.an(fragment);
            eVar.dCE = d.dCW.aL(fragment);
            return eVar;
        }
    }

    public final void c(f fVar) {
        kotlin.jvm.internal.i.f(fVar, "subStep");
        d dVar = this.dCE;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("questionnaireSelectionViewModel");
        }
        dVar.c(fVar);
    }

    public final void et(boolean z) {
        aIB().et(z);
    }

    public final void a(f fVar, String str) {
        kotlin.jvm.internal.i.f(fVar, "kycQuestionsItem");
        d dVar = this.dCE;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("questionnaireSelectionViewModel");
        }
        dVar.a(fVar, m.emptyList(), str);
    }

    public final void a(f fVar, int i) {
        kotlin.jvm.internal.i.f(fVar, "kycQuestionsItem");
        d dVar = this.dCE;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("questionnaireSelectionViewModel");
        }
        dVar.a(fVar, l.listOf(Integer.valueOf(i)), null);
    }

    public final void a(f fVar, List<Integer> list) {
        kotlin.jvm.internal.i.f(fVar, "kycQuestionsItem");
        kotlin.jvm.internal.i.f(list, "answerIds");
        d dVar = this.dCE;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("questionnaireSelectionViewModel");
        }
        dVar.a(fVar, list, null);
    }

    public final com.iqoption.core.microservices.kyc.response.questionnaire.a d(f fVar) {
        kotlin.jvm.internal.i.f(fVar, "item");
        d dVar = this.dCE;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("questionnaireSelectionViewModel");
        }
        return dVar.d(fVar);
    }

    public final void aMx() {
        d dVar = this.dCE;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("questionnaireSelectionViewModel");
        }
        dVar.aMx();
    }

    public final boolean Er() {
        return aIB().Er();
    }
}
