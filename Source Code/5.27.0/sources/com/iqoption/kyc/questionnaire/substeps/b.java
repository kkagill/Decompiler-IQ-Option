package com.iqoption.kyc.questionnaire.substeps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewStubProxy;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType;
import com.iqoption.core.microservices.kyc.response.questionnaire.f;
import com.iqoption.core.microservices.kyc.response.questionnaire.h;
import com.iqoption.core.ui.d.c;
import com.iqoption.kyc.b.ae;
import com.iqoption.kyc.b.bg;
import com.iqoption.kyc.o.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0014J\b\u0010\u001c\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8TX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, bng = {"Lcom/iqoption/kyc/questionnaire/substeps/KycQuestionMultiChoiceSubStepFragment;", "Lcom/iqoption/kyc/questionnaire/substeps/BaseKycQuestionnaireSubStepFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycQuestionMultiChoiceBinding;", "checksMap", "", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycAnswersItem;", "", "expiredPanel", "Landroidx/databinding/ViewStubProxy;", "getExpiredPanel", "()Landroidx/databinding/ViewStubProxy;", "initUi", "", "kycAnswer", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycAnswer;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "proceedAnswer", "updateNextVisibility", "Companion", "kyc_release"})
/* compiled from: KycQuestionMultiChoiceSubStepFragment.kt */
public final class b extends a {
    public static final a dDI = new a();
    private HashMap apm;
    private ae dDG;
    private final Map<com.iqoption.core.microservices.kyc.response.questionnaire.b, Boolean> dDH = new LinkedHashMap();

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/kyc/questionnaire/substeps/KycQuestionMultiChoiceSubStepFragment$Companion;", "", "()V", "navigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "type", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "kycQuestionsItem", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "showExpiredPanel", "", "kyc_release"})
    /* compiled from: KycQuestionMultiChoiceSubStepFragment.kt */
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
            return new c(a.dDF.e(questionnaireType2, fVar2), b.class, a.dDF.a(questionnaireType2, fVar2, z), 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "view", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: KycQuestionMultiChoiceSubStepFragment.kt */
    static final class b implements OnCheckedChangeListener {
        final /* synthetic */ b dDJ;

        b(b bVar) {
            this.dDJ = bVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Map a = this.dDJ.dDH;
            kotlin.jvm.internal.i.e(compoundButton, Promotion.ACTION_VIEW);
            Object tag = compoundButton.getTag();
            if (tag != null) {
                a.put((com.iqoption.core.microservices.kyc.response.questionnaire.b) tag, Boolean.valueOf(z));
                this.dDJ.aMW();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.kyc.response.questionnaire.KycAnswersItem");
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
        this.dDG = (ae) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_kyc_question_multi_choice, viewGroup, false, 4, null);
        ae aeVar = this.dDG;
        if (aeVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return aeVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ae aeVar = this.dDG;
        if (aeVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = aeVar.dvt;
        kotlin.jvm.internal.i.e(textView, "binding.kycMultiQuestionTitle");
        textView.setText(aMP().afi());
    }

    /* Access modifiers changed, original: protected */
    public void a(com.iqoption.core.microservices.kyc.response.questionnaire.a aVar) {
        h hVar = (h) aVar;
        ae aeVar = this.dDG;
        if (aeVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        LinearLayout linearLayout = aeVar.dvr;
        kotlin.jvm.internal.i.e(linearLayout, "binding.kycMultiQuestionAnswers");
        linearLayout.removeAllViews();
        for (com.iqoption.core.microservices.kyc.response.questionnaire.b bVar : aMP().afk()) {
            boolean z = false;
            bg bgVar = (bg) com.iqoption.core.ext.a.a((Fragment) this, e.item_kyc_answer_multi, (ViewGroup) linearLayout, false);
            CheckBox checkBox = bgVar.dwk;
            kotlin.jvm.internal.i.e(checkBox, "itemBinding.kycAnswerMulti");
            checkBox.setTag(bVar);
            checkBox.setId(View.generateViewId());
            checkBox.setText(bVar.aeY());
            checkBox.setOnCheckedChangeListener(new b(this));
            aMW();
            if (hVar != null) {
                List aft = hVar.aft();
                if (aft != null && aft.contains(Integer.valueOf(bVar.aeW()))) {
                    z = true;
                }
            }
            checkBox.setChecked(z);
            linearLayout.addView(bgVar.getRoot());
        }
    }

    private final void aMW() {
        aMR().et(this.dDH.values().contains(Boolean.valueOf(true)));
    }

    /* Access modifiers changed, original: protected */
    public void aMS() {
        Map linkedHashMap = new LinkedHashMap();
        for (Entry entry : this.dDH.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Collection arrayList = new ArrayList(linkedHashMap.size());
        for (Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(Integer.valueOf(((com.iqoption.core.microservices.kyc.response.questionnaire.b) entry2.getKey()).aeW()));
        }
        List list = (List) arrayList;
        aMR().a(aMP(), list);
        com.iqoption.kyc.a.a.dtL.a(aKn(), aKo(), aMR().Er(), aMP().afi(), aMP().afj(), list, null);
    }

    /* Access modifiers changed, original: protected */
    public ViewStubProxy aMT() {
        ae aeVar = this.dDG;
        if (aeVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ViewStubProxy viewStubProxy = aeVar.dvs;
        kotlin.jvm.internal.i.e(viewStubProxy, "binding.kycMultiQuestionExpired");
        return viewStubProxy;
    }
}
