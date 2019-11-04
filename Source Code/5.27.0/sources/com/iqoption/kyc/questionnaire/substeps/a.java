package com.iqoption.kyc.questionnaire.substeps;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.databinding.ViewStubProxy;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType;
import com.iqoption.core.microservices.kyc.response.questionnaire.f;
import java.util.HashMap;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 02\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020\u0016H\u0016J\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H$J\u0012\u0010)\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u001a\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020.2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010/\u001a\u00020&H$R\u0012\u0010\u0003\u001a\u00020\u0004X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8DX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001a\u0010\tR\u0014\u0010\u001c\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00061"}, bng = {"Lcom/iqoption/kyc/questionnaire/substeps/BaseKycQuestionnaireSubStepFragment;", "Lcom/iqoption/kyc/BaseKycStepFragment;", "()V", "expiredPanel", "Landroidx/databinding/ViewStubProxy;", "getExpiredPanel", "()Landroidx/databinding/ViewStubProxy;", "isContinuePressedAnalytics", "", "()Z", "kycQuestionsItem", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "getKycQuestionsItem", "()Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "kycQuestionsItem$delegate", "Lkotlin/Lazy;", "questionType", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "getQuestionType", "()Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "questionType$delegate", "screenName", "", "getScreenName", "()Ljava/lang/String;", "showExpiredPanel", "getShowExpiredPanel", "showExpiredPanel$delegate", "stageName", "getStageName", "viewModel", "Lcom/iqoption/kyc/questionnaire/substeps/KycQuestionnaireSubStepViewModel;", "getViewModel", "()Lcom/iqoption/kyc/questionnaire/substeps/KycQuestionnaireSubStepViewModel;", "setViewModel", "(Lcom/iqoption/kyc/questionnaire/substeps/KycQuestionnaireSubStepViewModel;)V", "getContentTransitionName", "initUi", "", "kycAnswer", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycAnswer;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "proceedAnswer", "Companion", "kyc_release"})
/* compiled from: BaseKycQuestionnaireSubStepFragment.kt */
public abstract class a extends com.iqoption.kyc.b {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "questionType", "getQuestionType()Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;")), k.a(new PropertyReference1Impl(k.G(a.class), "kycQuestionsItem", "getKycQuestionsItem()Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;")), k.a(new PropertyReference1Impl(k.G(a.class), "showExpiredPanel", "getShowExpiredPanel()Z"))};
    public static final a dDF = new a();
    private HashMap apm;
    private final d dDB = g.c(new BaseKycQuestionnaireSubStepFragment$questionType$2(this));
    private final d dDC = g.c(new BaseKycQuestionnaireSubStepFragment$kycQuestionsItem$2(this));
    private final d dDD = g.c(new BaseKycQuestionnaireSubStepFragment$showExpiredPanel$2(this));
    protected e dDE;
    private final String dtM = "TradingExperience";
    private final String dtN = "Question";
    private final boolean dxb;

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/kyc/questionnaire/substeps/BaseKycQuestionnaireSubStepFragment$Companion;", "", "()V", "ARG_QUESTION", "", "ARG_QUESTION_TYPE", "ARG_SHOW_EXPIRED_PANEL", "TAG", "createArguments", "Landroid/os/Bundle;", "type", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "kycQuestionsItem", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "showExpiredPanel", "", "tag", "kyc_release"})
    /* compiled from: BaseKycQuestionnaireSubStepFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final Bundle a(QuestionnaireType questionnaireType, f fVar, boolean z) {
            kotlin.jvm.internal.i.f(questionnaireType, "type");
            kotlin.jvm.internal.i.f(fVar, "kycQuestionsItem");
            Bundle bundle = new Bundle();
            bundle.putSerializable("ARG_QUESTION_TYPE", questionnaireType);
            bundle.putParcelable("ARG_QUESTION", fVar);
            bundle.putBoolean("ARG_SHOW_EXPIRED_PANEL", z);
            return bundle;
        }

        public final String e(QuestionnaireType questionnaireType, f fVar) {
            kotlin.jvm.internal.i.f(questionnaireType, "type");
            kotlin.jvm.internal.i.f(fVar, "kycQuestionsItem");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a.TAG);
            stringBuilder.append(':');
            stringBuilder.append(questionnaireType);
            stringBuilder.append(':');
            stringBuilder.append(fVar.afj());
            return stringBuilder.toString();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: BaseKycQuestionnaireSubStepFragment.kt */
    static final class b<T> implements Observer<Object> {
        final /* synthetic */ a this$0;

        b(a aVar) {
            this.this$0 = aVar;
        }

        public final void onChanged(Object obj) {
            com.iqoption.kyc.questionnaire.a.dCC.aJ(this.this$0);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: BaseKycQuestionnaireSubStepFragment.kt */
    static final class c<T> implements Observer<Object> {
        final /* synthetic */ a this$0;

        c(a aVar) {
            this.this$0 = aVar;
        }

        public final void onChanged(Object obj) {
            this.this$0.aMS();
        }
    }

    private final boolean aMQ() {
        d dVar = this.dDD;
        j jVar = anY[2];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract void a(com.iqoption.core.microservices.kyc.response.questionnaire.a aVar);

    public final QuestionnaireType aMO() {
        d dVar = this.dDB;
        j jVar = anY[0];
        return (QuestionnaireType) dVar.getValue();
    }

    /* Access modifiers changed, original: protected|final */
    public final f aMP() {
        d dVar = this.dDC;
        j jVar = anY[1];
        return (f) dVar.getValue();
    }

    public abstract void aMS();

    public abstract ViewStubProxy aMT();

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

    /* Access modifiers changed, original: protected|final */
    public final e aMR() {
        e eVar = this.dDE;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return eVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dDE = e.dDQ.aO(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        e eVar = this.dDE;
        String str = "viewModel";
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        eVar.c(aMP());
        eVar = this.dDE;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LifecycleOwner lifecycleOwner = this;
        eVar.aJh().observe(lifecycleOwner, new b(this));
        eVar = this.dDE;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        eVar.aJj().observe(lifecycleOwner, new c(this));
        eVar = this.dDE;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        eVar.aMx();
        eVar = this.dDE;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(eVar.d(aMP()));
        ViewStub viewStub = aMT().getViewStub();
        if (aMQ()) {
            if (!aMT().isInflated()) {
                if (viewStub == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                viewStub.inflate();
            }
            if (viewStub == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            com.iqoption.core.ext.a.ak(viewStub);
        } else if (viewStub != null) {
            com.iqoption.core.ext.a.al(viewStub);
        }
    }

    public boolean aKp() {
        return this.dxb;
    }

    public String aKo() {
        return this.dtN;
    }

    public String aKn() {
        return this.dtM;
    }

    public String alx() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TAG);
        stringBuilder.append(':');
        stringBuilder.append(aMP());
        return stringBuilder.toString();
    }
}
