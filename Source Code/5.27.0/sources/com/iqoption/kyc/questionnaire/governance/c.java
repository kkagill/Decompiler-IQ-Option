package com.iqoption.kyc.questionnaire.governance;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.microservices.kyc.response.questionnaire.governance.GovernanceStatus;
import com.iqoption.kyc.j;
import com.iqoption.kyc.o;
import com.iqoption.kyc.questionnaire.d;
import io.reactivex.b.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u0006\u0010\u0014\u001a\u00020\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lcom/iqoption/kyc/questionnaire/governance/KycGovernanceViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableAndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "errorMessage", "Landroidx/lifecycle/LiveData;", "", "getErrorMessage", "()Landroidx/lifecycle/LiveData;", "errorMessageData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "questionnaireSelectionViewModel", "Lcom/iqoption/kyc/questionnaire/KycQuestionnaireSelectionViewModel;", "selectionViewModel", "Lcom/iqoption/kyc/KycSelectionViewModel;", "putGovernance", "", "status", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/governance/GovernanceStatus;", "setTitle", "Companion", "kyc_release"})
/* compiled from: KycGovernanceViewModel.kt */
public final class c extends com.iqoption.core.ui.f.c {
    public static final a dDi = new a();
    private d dCE;
    private final com.iqoption.core.data.b.b<String> dDg = new com.iqoption.core.data.b.b();
    private final LiveData<String> dDh = this.dDg;
    private j drN;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/questionnaire/governance/KycGovernanceViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/questionnaire/governance/KycGovernanceViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycGovernanceViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c aM(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(c.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…nceViewModel::class.java)");
            c cVar = (c) viewModel;
            cVar.drN = j.dsW.am(fragment);
            cVar.dCE = d.dCW.aL(fragment);
            return cVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: KycGovernanceViewModel.kt */
    static final class b implements io.reactivex.b.a {
        final /* synthetic */ c dDj;
        final /* synthetic */ GovernanceStatus dDk;

        b(c cVar, GovernanceStatus governanceStatus) {
            this.dDj = cVar;
            this.dDk = governanceStatus;
        }

        public final void run() {
            c.a(this.dDj).c(this.dDk);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycGovernanceViewModel.kt */
    static final class c<T> implements f<Throwable> {
        final /* synthetic */ c dDj;

        c(c cVar) {
            this.dDj = cVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.dDj.dDg.postValue(this.dDj.getContext().getString(o.f.unknown_error_occurred));
        }
    }

    public c(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
    }

    public static final /* synthetic */ d a(c cVar) {
        d dVar = cVar.dCE;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("questionnaireSelectionViewModel");
        }
        return dVar;
    }

    public final LiveData<String> aMz() {
        return this.dDh;
    }

    public final void aMA() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        String string = getContext().getString(o.f.product_suitability);
        kotlin.jvm.internal.i.e(string, "context.getString(R.string.product_suitability)");
        jVar.setTitle(string);
    }

    @SuppressLint({"CheckResult"})
    public final void d(GovernanceStatus governanceStatus) {
        com.iqoption.core.microservices.kyc.b.buq.a(governanceStatus).b(com.iqoption.core.rx.i.aki()).a(com.iqoption.core.rx.i.akj()).a(new b(this, governanceStatus), new c(this));
    }
}
