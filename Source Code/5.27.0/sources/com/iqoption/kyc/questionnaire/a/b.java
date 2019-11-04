package com.iqoption.kyc.questionnaire.a;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.base.Optional;
import com.iqoption.core.ui.f.d;
import io.reactivex.b.g;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¨\u0006\b"}, bng = {"Lcom/iqoption/kyc/questionnaire/risks/KycRisksViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "getRiskDisclosure", "Landroidx/lifecycle/LiveData;", "Lcom/google/common/base/Optional;", "Lcom/iqoption/kyc/questionnaire/risks/RiskDisclosure;", "Companion", "kyc_release"})
/* compiled from: KycRisksViewModel.kt */
public final class b extends d {
    public static final a dDq = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/questionnaire/risks/KycRisksViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/questionnaire/risks/KycRisksViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycRisksViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b aN(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…sksViewModel::class.java)");
            return (b) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/kyc/questionnaire/risks/RiskDisclosure;", "kotlin.jvm.PlatformType", "response", "Lcom/iqoption/core/microservices/cms/response/TermsResponse;", "apply"})
    /* compiled from: KycRisksViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b dDr = new b();

        b() {
        }

        /* renamed from: b */
        public final Optional<c> apply(com.iqoption.core.microservices.cms.a.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "response");
            com.iqoption.core.microservices.cms.a.a gv = bVar.acH().gv(com.iqoption.core.d.getLocale());
            return Optional.an(gv != null ? new c(gv.getHeader(), gv.getText()) : null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/kyc/questionnaire/risks/RiskDisclosure;", "kotlin.jvm.PlatformType", "it", "", "apply"})
    /* compiled from: KycRisksViewModel.kt */
    static final class c<T, R> implements g<Throwable, Optional<c>> {
        public static final c dDs = new c();

        c() {
        }

        /* renamed from: x */
        public final Optional<c> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return Optional.pW();
        }
    }

    public final LiveData<Optional<c>> aMB() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(com.iqoption.core.microservices.cms.a.gt("risk-disclosure").t(b.dDr).u(c.dDs).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).bkO());
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…  .toFlowable()\n        )");
        return fromPublisher;
    }
}
