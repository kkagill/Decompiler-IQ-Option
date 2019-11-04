package com.iqoption.kyc.profile.steps.gdpr;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.ui.f.d;
import com.iqoption.kyc.profile.steps.ProfileStep;
import io.reactivex.b.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/kyc/profile/steps/gdpr/KycGdprViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "gdprRequestError", "Landroidx/lifecycle/LiveData;", "", "getGdprRequestError", "()Landroidx/lifecycle/LiveData;", "gdprRequestErrorLiveData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "profileSelectionViewModel", "Lcom/iqoption/kyc/profile/KycProfileSelectionViewModel;", "setPersonalDataPolicy", "", "policy", "Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;", "Companion", "kyc_release"})
/* compiled from: KycGdprViewModel.kt */
public final class b extends d {
    public static final a dCm = new a();
    private com.iqoption.kyc.profile.d dBw;
    private final com.iqoption.core.data.b.b<Throwable> dCk = new com.iqoption.core.data.b.b();
    private final LiveData<Throwable> dCl = this.dCk;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/profile/steps/gdpr/KycGdprViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/profile/steps/gdpr/KycGdprViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycGdprViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b aH(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…dprViewModel::class.java]");
            b bVar = (b) viewModel;
            bVar.dBw = com.iqoption.kyc.profile.d.dBv.aD(fragment);
            return bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: KycGdprViewModel.kt */
    static final class b implements io.reactivex.b.a {
        final /* synthetic */ b dCn;

        b(b bVar) {
            this.dCn = bVar;
        }

        public final void run() {
            b.a(this.dCn).c(ProfileStep.GDPR);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycGdprViewModel.kt */
    static final class c<T> implements f<Throwable> {
        final /* synthetic */ b dCn;

        c(b bVar) {
            this.dCn = bVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.dCn.dCk.postValue(th);
        }
    }

    public final LiveData<Throwable> aMj() {
        return this.dCl;
    }

    public final void a(com.iqoption.core.microservices.busapi.response.b bVar) {
        kotlin.jvm.internal.i.f(bVar, "policy");
        io.reactivex.disposables.b a = com.iqoption.core.microservices.busapi.a.bpm.c(bVar).b(com.iqoption.core.rx.i.aki()).a(com.iqoption.core.rx.i.akj()).a(new b(this), new c(this));
        kotlin.jvm.internal.i.e(a, "BusApiRequests.setPerson…rror) }\n                )");
        b(a);
    }
}
