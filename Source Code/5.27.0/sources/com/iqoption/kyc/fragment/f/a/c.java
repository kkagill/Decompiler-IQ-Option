package com.iqoption.kyc.fragment.f.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType;
import com.iqoption.core.microservices.kyc.response.questionnaire.f;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.core.util.LocalizationUtil;
import com.iqoption.core.util.ah;
import com.iqoption.e.kq;
import com.iqoption.kyc.g;
import com.iqoption.kyc.j;
import com.iqoption.kyc.s;
import com.iqoption.x.R;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0002,-B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010)\u001a\u00020\u001cH\u0016J\b\u0010*\u001a\u00020\u001cH\u0016J\b\u0010+\u001a\u00020\u001cH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0005XD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u0005XD¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007¨\u0006."}, bng = {"Lcom/iqoption/kyc/fragment/question2/question/KycQuestionTextFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/iqoption/kyc/analytics/KycAnalyticsFragmentInfo;", "()V", "answerText", "", "getAnswerText", "()Ljava/lang/String;", "backStackChangedListener", "Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;", "binding", "Lcom/iqoption/databinding/FragmentKycQuestionTextOldBinding;", "isContinuePressedAnalytics", "", "()Z", "kycQuestionsItem", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "listener", "Lcom/iqoption/kyc/fragment/question2/question/KycQuestionTextFragment$OnFragmentInteractionListener;", "questionType", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "screenName", "getScreenName", "selectionViewModel", "Lcom/iqoption/kyc/KycSelectionViewModel;", "stageName", "getStageName", "initToolbar", "", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onDetach", "updateContinueButton", "Companion", "OnFragmentInteractionListener", "app_optionXRelease"})
/* compiled from: KycQuestionTextFragment.kt */
public final class c extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG;
    public static final a dAf = new a();
    private HashMap apm;
    private b dAd;
    private kq dAe;
    private j drN;
    private final String dtM = "TradingExperience";
    private final String dtN = "Question";
    private OnBackStackChangedListener dxW;
    private final boolean dxb;
    private QuestionnaireType dzU;
    private f dzV;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/kyc/fragment/question2/question/KycQuestionTextFragment$Companion;", "", "()V", "ARG_QUESTION", "", "ARG_QUESTION_TYPE", "TAG", "newInstance", "Lcom/iqoption/kyc/fragment/question2/question/KycQuestionTextFragment;", "type", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "kycQuestionsItem", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "app_optionXRelease"})
    /* compiled from: KycQuestionTextFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c c(QuestionnaireType questionnaireType, f fVar) {
            kotlin.jvm.internal.i.f(questionnaireType, "type");
            kotlin.jvm.internal.i.f(fVar, "kycQuestionsItem");
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putSerializable("ARG_QUESTION_TYPE", questionnaireType);
            bundle.putParcelable("ARG_QUESTION", fVar);
            cVar.setArguments(bundle);
            return cVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, bng = {"Lcom/iqoption/kyc/fragment/question2/question/KycQuestionTextFragment$OnFragmentInteractionListener;", "", "onQuestionTextChoice", "", "questionType", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "kycQuestionsItem", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "answer", "", "analyticsFragmentInfo", "Lcom/iqoption/kyc/analytics/KycAnalyticsFragmentInfo;", "app_optionXRelease"})
    /* compiled from: KycQuestionTextFragment.kt */
    public interface b {
        void a(QuestionnaireType questionnaireType, f fVar, String str, com.iqoption.kyc.a.b bVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: KycQuestionTextFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ c dAg;

        c(c cVar) {
            this.dAg = cVar;
        }

        public final void onClick(View view) {
            b a = this.dAg.dAd;
            if (a == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            a.a(c.b(this.dAg), c.c(this.dAg), this.dAg.aLx(), this.dAg);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/kyc/fragment/question2/question/KycQuestionTextFragment$onCreateView$3", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "app_optionXRelease"})
    /* compiled from: KycQuestionTextFragment.kt */
    public static final class e extends ah {
        final /* synthetic */ c dAg;

        e(c cVar) {
            this.dAg = cVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            this.dAg.aLr();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0014¨\u0006\u0004"}, bng = {"com/iqoption/kyc/fragment/question2/question/KycQuestionTextFragment$onCreateView$2", "Lcom/iqoption/kyc/analytics/ScreenEventOnBackStackChangedListener;", "onBackStackChangedOnTop", "", "app_optionXRelease"})
    /* compiled from: KycQuestionTextFragment.kt */
    public static final class d extends com.iqoption.kyc.a.d {
        final /* synthetic */ c dAg;

        d(c cVar, com.iqoption.core.analytics.b bVar, FragmentManager fragmentManager, boolean z, String str, String str2, String str3) {
            this.dAg = cVar;
            super(bVar, fragmentManager, z, str, str2, str3);
        }

        /* Access modifiers changed, original: protected */
        public void aKr() {
            super.aKr();
            this.dAg.Lb();
        }
    }

    public static final c c(QuestionnaireType questionnaireType, f fVar) {
        return dAf.c(questionnaireType, fVar);
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final /* synthetic */ QuestionnaireType b(c cVar) {
        QuestionnaireType questionnaireType = cVar.dzU;
        if (questionnaireType == null) {
            kotlin.jvm.internal.i.lG("questionType");
        }
        return questionnaireType;
    }

    public static final /* synthetic */ f c(c cVar) {
        f fVar = cVar.dzV;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("kycQuestionsItem");
        }
        return fVar;
    }

    static {
        String name = c.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    private final String aLx() {
        kq kqVar = this.dAe;
        if (kqVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        EditText editText = kqVar.cgO;
        kotlin.jvm.internal.i.e(editText, "binding.kycTextField");
        return editText.getText().toString();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Serializable serializable = com.iqoption.core.ext.a.s(this).getSerializable("ARG_QUESTION_TYPE");
        if (serializable != null) {
            this.dzU = (QuestionnaireType) serializable;
            Parcelable parcelable = com.iqoption.core.ext.a.s(this).getParcelable("ARG_QUESTION");
            if (parcelable == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            this.dzV = (f) parcelable;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dAe = (kq) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_kyc_question_text_old, viewGroup, false);
        kq kqVar = this.dAe;
        String str = "binding";
        if (kqVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = kqVar.cgm;
        kotlin.jvm.internal.i.e(textView, "binding.question");
        f fVar = this.dzV;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("kycQuestionsItem");
        }
        if (fVar == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        textView.setText(LocalizationUtil.hr(fVar.afi()));
        aLr();
        kqVar = this.dAe;
        if (kqVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        kqVar.cga.cfW.setOnClickListener(new c(this));
        Lb();
        com.iqoption.kyc.a.a aVar = com.iqoption.kyc.a.a.dtL;
        String aKn = aKn();
        String aKo = aKo();
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        this.dxW = new d(this, aVar.i(aKn, aKo, jVar.Er()), getFragmentManager(), new g(getContext()).Er(), aKn(), aKo(), TAG);
        FragmentManager t = com.iqoption.core.ext.a.t(this);
        OnBackStackChangedListener onBackStackChangedListener = this.dxW;
        if (onBackStackChangedListener == null) {
            kotlin.jvm.internal.i.lG("backStackChangedListener");
        }
        t.addOnBackStackChangedListener(onBackStackChangedListener);
        kqVar = this.dAe;
        if (kqVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        kqVar.cgO.addTextChangedListener(new e(this));
        kqVar = this.dAe;
        if (kqVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return kqVar.getRoot();
    }

    public String aKn() {
        return this.dtM;
    }

    public String aKo() {
        return this.dtN;
    }

    public boolean aKp() {
        return this.dxb;
    }

    private final void Lb() {
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        kq kqVar = this.dAe;
        if (kqVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        Toolbar toolbar = kqVar.cfS.toolbar;
        kotlin.jvm.internal.i.e(toolbar, "binding.kycToolbarLayout.toolbar");
        s.b(appCompatActivity, toolbar);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof b) {
            this.dAd = (b) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context);
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dAd = (b) null;
    }

    public void onDestroyView() {
        FragmentManager t = com.iqoption.core.ext.a.t(this);
        OnBackStackChangedListener onBackStackChangedListener = this.dxW;
        if (onBackStackChangedListener == null) {
            kotlin.jvm.internal.i.lG("backStackChangedListener");
        }
        t.removeOnBackStackChangedListener(onBackStackChangedListener);
        super.onDestroyView();
        Bj();
    }

    private final void aLr() {
        kq kqVar = this.dAe;
        if (kqVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ConfirmButtonView confirmButtonView = kqVar.cga.cfW;
        kotlin.jvm.internal.i.e(confirmButtonView, "binding.nextButton.nextButton");
        f fVar = this.dzV;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("kycQuestionsItem");
        }
        boolean z = true;
        if (fVar.wo() && (u.Y(aLx()) ^ 1) == 0) {
            z = false;
        }
        confirmButtonView.setEnabled(z);
    }
}
