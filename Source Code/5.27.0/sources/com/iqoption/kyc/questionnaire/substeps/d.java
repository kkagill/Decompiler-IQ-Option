package com.iqoption.kyc.questionnaire.substeps;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.databinding.ViewStubProxy;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType;
import com.iqoption.core.microservices.kyc.response.questionnaire.f;
import com.iqoption.core.ui.d.c;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import com.iqoption.kyc.b.ai;
import com.iqoption.kyc.o;
import com.iqoption.kyc.o.e;
import com.iqoption.kyc.r;
import com.iqoption.kyc.u;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0018\u001a\u00020\nH\u0014J\b\u0010\u0019\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001b"}, bng = {"Lcom/iqoption/kyc/questionnaire/substeps/KycQuestionTextSubStepFragment;", "Lcom/iqoption/kyc/questionnaire/substeps/BaseKycQuestionnaireSubStepFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycQuestionTextBinding;", "expiredPanel", "Landroidx/databinding/ViewStubProxy;", "getExpiredPanel", "()Landroidx/databinding/ViewStubProxy;", "initUi", "", "kycAnswer", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycAnswer;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "proceedAnswer", "updateValidation", "Companion", "kyc_release"})
/* compiled from: KycQuestionTextSubStepFragment.kt */
public final class d extends a {
    public static final a dDO = new a();
    private HashMap apm;
    private ai dDN;

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/kyc/questionnaire/substeps/KycQuestionTextSubStepFragment$Companion;", "", "()V", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "type", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "kycQuestionsItem", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "showExpiredPanel", "", "kyc_release"})
    /* compiled from: KycQuestionTextSubStepFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c b(QuestionnaireType questionnaireType, f fVar, boolean z) {
            QuestionnaireType questionnaireType2 = questionnaireType;
            f fVar2 = fVar;
            kotlin.jvm.internal.i.f(questionnaireType2, "type");
            kotlin.jvm.internal.i.f(fVar2, "kycQuestionsItem");
            return new c(a.dDF.e(questionnaireType2, fVar2), d.class, a.dDF.a(questionnaireType2, fVar2, z), 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/kyc/questionnaire/substeps/KycQuestionTextSubStepFragment$onViewCreated$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "kyc_release"})
    /* compiled from: KycQuestionTextSubStepFragment.kt */
    public static final class b extends ah {
        final /* synthetic */ d dDP;

        b(d dVar) {
            this.dDP = dVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            this.dDP.aMY();
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dDN = (ai) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_kyc_question_text, viewGroup, false, 4, null);
        ai aiVar = this.dDN;
        if (aiVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return aiVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ai aiVar = this.dDN;
        String str = "binding";
        if (aiVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextInputLayout textInputLayout = aiVar.dvz;
        String str2 = "binding.kycTextQuestionInput";
        kotlin.jvm.internal.i.e(textInputLayout, str2);
        textInputLayout.setHint(aMP().afi());
        aiVar = this.dDN;
        if (aiVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = aiVar.dvx;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycTextQuestionEdit");
        EditText editText = iQTextInputEditText;
        ai aiVar2 = this.dDN;
        if (aiVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextInputLayout textInputLayout2 = aiVar2.dvz;
        kotlin.jvm.internal.i.e(textInputLayout2, str2);
        u.a(editText, textInputLayout2);
        aiVar = this.dDN;
        if (aiVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        aiVar.dvx.addTextChangedListener(new b(this));
    }

    public void onStart() {
        super.onStart();
        ai aiVar = this.dDN;
        if (aiVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        IQTextInputEditText iQTextInputEditText = aiVar.dvx;
        iQTextInputEditText.requestFocus();
        com.iqoption.core.ext.a.d(iQTextInputEditText);
        v.b(iQTextInputEditText.getContext(), iQTextInputEditText);
    }

    private final void aMY() {
        e aMR = aMR();
        ai aiVar = this.dDN;
        if (aiVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        IQTextInputEditText iQTextInputEditText = aiVar.dvx;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycTextQuestionEdit");
        Editable text = iQTextInputEditText.getText();
        if (text == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(text, "binding.kycTextQuestionEdit.text!!");
        aMR.et(u.Y(text) ^ 1);
    }

    /* Access modifiers changed, original: protected */
    public void a(com.iqoption.core.microservices.kyc.response.questionnaire.a aVar) {
        com.iqoption.core.microservices.kyc.response.questionnaire.i iVar = (com.iqoption.core.microservices.kyc.response.questionnaire.i) aVar;
        ai aiVar = this.dDN;
        String str = "binding";
        if (aiVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        aiVar.dvx.setText(iVar != null ? iVar.getText() : null);
        ai aiVar2 = this.dDN;
        if (aiVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = aiVar2.dvx;
        aiVar = this.dDN;
        if (aiVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText2 = aiVar.dvx;
        kotlin.jvm.internal.i.e(iQTextInputEditText2, "binding.kycTextQuestionEdit");
        Editable text = iQTextInputEditText2.getText();
        if (text == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        iQTextInputEditText.setSelection(text.length());
        aMY();
    }

    /* Access modifiers changed, original: protected */
    public void aMS() {
        ai aiVar = this.dDN;
        String str = "binding";
        if (aiVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = aiVar.dvx;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.kycTextQuestionEdit");
        Editable text = iQTextInputEditText.getText();
        if (text == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(text, "binding.kycTextQuestionEdit.text!!");
        String obj = v.trim(text).toString();
        if ((((CharSequence) obj).length() > 0 ? 1 : null) == null || !r.dth.g(obj, aMP().afo(), false)) {
            aiVar = this.dDN;
            if (aiVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            TextInputLayout textInputLayout = aiVar.dvz;
            String str2 = "binding.kycTextQuestionInput";
            kotlin.jvm.internal.i.e(textInputLayout, str2);
            textInputLayout.setErrorEnabled(true);
            aiVar = this.dDN;
            if (aiVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textInputLayout = aiVar.dvz;
            kotlin.jvm.internal.i.e(textInputLayout, str2);
            textInputLayout.setError(getString(o.f.incorrect_value));
            return;
        }
        aMR().a(aMP(), obj);
        com.iqoption.kyc.a.a.dtL.a(aKn(), aKo(), aMR().Er(), aMP().afi(), aMP().afj(), null, obj);
    }

    /* Access modifiers changed, original: protected */
    public ViewStubProxy aMT() {
        ai aiVar = this.dDN;
        if (aiVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ViewStubProxy viewStubProxy = aiVar.dvy;
        kotlin.jvm.internal.i.e(viewStubProxy, "binding.kycTextQuestionExpired");
        return viewStubProxy;
    }
}
