package com.iqoption.kyc.questionnaire.warning;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.core.ui.f.d;
import com.iqoption.kyc.j;
import io.reactivex.b.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0010R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, bng = {"Lcom/iqoption/kyc/questionnaire/warning/KycQuestionWarningViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "error", "Landroidx/lifecycle/LiveData;", "", "getError", "()Landroidx/lifecycle/LiveData;", "errorLiveData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "isRegulated", "", "()Z", "selectionViewModel", "Lcom/iqoption/kyc/KycSelectionViewModel;", "putKycRiskWarning", "", "signature", "", "setTitle", "title", "updateProgress", "Companion", "kyc_release"})
/* compiled from: KycQuestionWarningViewModel.kt */
public final class a extends d {
    public static final a dDU = new a();
    private final com.iqoption.core.data.b.b<Throwable> dDS = new com.iqoption.core.data.b.b();
    private final LiveData<Throwable> dDT = this.dDS;
    private j drN;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/questionnaire/warning/KycQuestionWarningViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/questionnaire/warning/KycQuestionWarningViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycQuestionWarningViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a aP(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(a.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ingViewModel::class.java)");
            a aVar = (a) viewModel;
            aVar.drN = j.dsW.am(fragment);
            return aVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: KycQuestionWarningViewModel.kt */
    static final class b implements io.reactivex.b.a {
        final /* synthetic */ a dDV;

        b(a aVar) {
            this.dDV = aVar;
        }

        public final void run() {
            a.a(this.dDV).en(true);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycQuestionWarningViewModel.kt */
    static final class c<T> implements f<Throwable> {
        final /* synthetic */ a dDV;

        c(a aVar) {
            this.dDV = aVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.dDV.dDS.postValue(th);
        }
    }

    public static final /* synthetic */ j a(a aVar) {
        j jVar = aVar.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar;
    }

    public final LiveData<Throwable> aNa() {
        return this.dDT;
    }

    public final boolean Er() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.Er();
    }

    public final void setTitle(String str) {
        kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.setTitle(str);
    }

    public final void aMx() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.a(KycStepType.KYC_QUESTIONNAIRE, 100 - com.iqoption.core.microservices.kyc.response.step.f.afQ());
    }

    public final void iS(String str) {
        io.reactivex.disposables.b a = com.iqoption.core.microservices.kyc.b.buq.e(true, str).b(com.iqoption.core.rx.i.aki()).a(com.iqoption.core.rx.i.akj()).a(new b(this), new c(this));
        kotlin.jvm.internal.i.e(a, "KycQuestionnaireRequests…      }\n                )");
        b(a);
    }
}
