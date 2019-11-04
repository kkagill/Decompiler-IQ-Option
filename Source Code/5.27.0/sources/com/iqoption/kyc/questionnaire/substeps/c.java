package com.iqoption.kyc.questionnaire.substeps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.databinding.ViewStubProxy;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType;
import com.iqoption.core.microservices.kyc.response.questionnaire.f;
import com.iqoption.core.microservices.kyc.response.questionnaire.h;
import com.iqoption.kyc.b.ag;
import com.iqoption.kyc.b.bi;
import com.iqoption.kyc.o.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0019\u001a\u00020\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001b"}, bng = {"Lcom/iqoption/kyc/questionnaire/substeps/KycQuestionSingleChoiceSubStepFragment;", "Lcom/iqoption/kyc/questionnaire/substeps/BaseKycQuestionnaireSubStepFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycQuestionSingleChoiceBinding;", "expiredPanel", "Landroidx/databinding/ViewStubProxy;", "getExpiredPanel", "()Landroidx/databinding/ViewStubProxy;", "answerId", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycAnswersItem;", "initUi", "", "kycAnswer", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycAnswer;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "proceedAnswer", "Companion", "kyc_release"})
/* compiled from: KycQuestionSingleChoiceSubStepFragment.kt */
public final class c extends a {
    public static final a dDL = new a();
    private HashMap apm;
    private ag dDK;

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/kyc/questionnaire/substeps/KycQuestionSingleChoiceSubStepFragment$Companion;", "", "()V", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "type", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "kycQuestionsItem", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "showExpiredPanel", "", "kyc_release"})
    /* compiled from: KycQuestionSingleChoiceSubStepFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c b(QuestionnaireType questionnaireType, f fVar, boolean z) {
            QuestionnaireType questionnaireType2 = questionnaireType;
            f fVar2 = fVar;
            kotlin.jvm.internal.i.f(questionnaireType2, "type");
            kotlin.jvm.internal.i.f(fVar2, "kycQuestionsItem");
            return new com.iqoption.core.ui.d.c(a.dDF.e(questionnaireType2, fVar2), c.class, a.dDF.a(questionnaireType2, fVar2, z), 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/RadioGroup;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCheckedChanged"})
    /* compiled from: KycQuestionSingleChoiceSubStepFragment.kt */
    static final class b implements OnCheckedChangeListener {
        final /* synthetic */ c dDM;

        b(c cVar) {
            this.dDM = cVar;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            this.dDM.aMR().et(true);
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

    private final com.iqoption.core.microservices.kyc.response.questionnaire.b aMX() {
        ag agVar = this.dDK;
        if (agVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        RadioGroup radioGroup = agVar.dvu;
        kotlin.jvm.internal.i.e(radioGroup, "binding.kycSingleQuestionAnswers");
        View findViewById = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        Object tag = findViewById != null ? findViewById.getTag() : null;
        if (tag != null) {
            return (com.iqoption.core.microservices.kyc.response.questionnaire.b) tag;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.kyc.response.questionnaire.KycAnswersItem");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dDK = (ag) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_kyc_question_single_choice, viewGroup, false, 4, null);
        ag agVar = this.dDK;
        if (agVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return agVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ag agVar = this.dDK;
        if (agVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = agVar.dvw;
        kotlin.jvm.internal.i.e(textView, "binding.kycSingleQuestionTitle");
        textView.setText(aMP().afi());
    }

    /* Access modifiers changed, original: protected */
    public void a(com.iqoption.core.microservices.kyc.response.questionnaire.a aVar) {
        boolean z;
        h hVar = (h) aVar;
        ag agVar = this.dDK;
        if (agVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        RadioGroup radioGroup = agVar.dvu;
        kotlin.jvm.internal.i.e(radioGroup, "binding.kycSingleQuestionAnswers");
        radioGroup.removeAllViews();
        Iterator it = aMP().afk().iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            com.iqoption.core.microservices.kyc.response.questionnaire.b bVar = (com.iqoption.core.microservices.kyc.response.questionnaire.b) it.next();
            bi biVar = (bi) com.iqoption.core.ext.a.a((Fragment) this, e.item_kyc_answer_single, (ViewGroup) radioGroup, false);
            AppCompatRadioButton appCompatRadioButton = biVar.dwl;
            kotlin.jvm.internal.i.e(appCompatRadioButton, "itemBinding.kycAnswerSingle");
            appCompatRadioButton.setTag(bVar);
            appCompatRadioButton.setId(View.generateViewId());
            appCompatRadioButton.setText(bVar.aeY());
            if (hVar != null) {
                List aft = hVar.aft();
                if (aft != null && aft.contains(Integer.valueOf(bVar.aeW()))) {
                    appCompatRadioButton.setChecked(z);
                    radioGroup.addView(biVar.getRoot());
                }
            }
            z = false;
            appCompatRadioButton.setChecked(z);
            radioGroup.addView(biVar.getRoot());
        }
        e aMR = aMR();
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            z = false;
        }
        aMR.et(z);
        radioGroup.setOnCheckedChangeListener(new b(this));
    }

    /* Access modifiers changed, original: protected */
    public void aMS() {
        com.iqoption.core.microservices.kyc.response.questionnaire.b aMX = aMX();
        if (aMX == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        int aeW = aMX.aeW();
        aMR().a(aMP(), aeW);
        com.iqoption.kyc.a.a.dtL.a(aKn(), aKo(), aMR().Er(), aMP().afi(), aMP().afj(), l.listOf(Integer.valueOf(aeW)), null);
    }

    /* Access modifiers changed, original: protected */
    public ViewStubProxy aMT() {
        ag agVar = this.dDK;
        if (agVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ViewStubProxy viewStubProxy = agVar.dvv;
        kotlin.jvm.internal.i.e(viewStubProxy, "binding.kycSingleQuestionExpired");
        return viewStubProxy;
    }
}
