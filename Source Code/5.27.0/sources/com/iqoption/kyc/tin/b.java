package com.iqoption.kyc.tin;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.base.Optional;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.core.ui.country.f;
import com.iqoption.kyc.h;
import com.iqoption.kyc.l;
import io.reactivex.b.g;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bJ\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u0006J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, bng = {"Lcom/iqoption/kyc/tin/KycTinViewModel;", "Lcom/iqoption/kyc/KycSubStepContainerViewModel;", "()V", "countryViewModel", "Lcom/iqoption/core/ui/country/CountryViewModel;", "tinError", "Landroidx/lifecycle/LiveData;", "Lcom/google/common/base/Optional;", "", "getTinError", "()Landroidx/lifecycle/LiveData;", "tinErrorLiveData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "isRegulated", "", "saveTin", "", "country", "Lcom/iqoption/core/microservices/configuration/response/Country;", "tin", "selectedCountry", "setCurrentStep", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "skipStep", "stepType", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "Companion", "kyc_release"})
/* compiled from: KycTinViewModel.kt */
public final class b extends l {
    public static final a dEx = new a();
    private f bIt;
    private final com.iqoption.core.data.b.b<Optional<String>> dEv = new com.iqoption.core.data.b.b();
    private final LiveData<Optional<String>> dEw = this.dEv;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/tin/KycTinViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/tin/KycTinViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycTinViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b aR(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…TinViewModel::class.java)");
            b bVar = (b) viewModel;
            bVar.an(fragment);
            bVar.bIt = f.bIy.A(fragment);
            return bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/PutCustomerTinResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycTinViewModel.kt */
    static final class b<T> implements io.reactivex.b.f<com.iqoption.core.microservices.kyc.response.c> {
        final /* synthetic */ b dEy;

        b(b bVar) {
            this.dEy = bVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.kyc.response.c cVar) {
            this.dEy.aIB().en(true);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycTinViewModel.kt */
    static final class c<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ b dEy;

        c(b bVar) {
            this.dEy = bVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.dEy.dEv.postValue(Optional.an(h.dsg.aIX().K(th)));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/configuration/response/Country;", "kotlin.jvm.PlatformType", "countries", "", "apply"})
    /* compiled from: KycTinViewModel.kt */
    static final class d<T, R> implements g<T, R> {
        public static final d dEz = new d();

        d() {
        }

        /* renamed from: aI */
        public final Optional<com.iqoption.core.microservices.configuration.a.c> apply(List<com.iqoption.core.microservices.configuration.a.c> list) {
            kotlin.jvm.internal.i.f(list, "countries");
            long El = com.iqoption.core.d.EA().El();
            for (Object next : list) {
                Object obj;
                if (((com.iqoption.core.microservices.configuration.a.c) next).getId().longValue() == El) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    break;
                }
            }
            Object next2 = null;
            next2 = (com.iqoption.core.microservices.configuration.a.c) next2;
            if (next2 == null) {
                next2 = (com.iqoption.core.microservices.configuration.a.c) u.bU(list);
            }
            return Optional.an(next2);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/configuration/response/Country;", "kotlin.jvm.PlatformType", "it", "", "apply"})
    /* compiled from: KycTinViewModel.kt */
    static final class e<T, R> implements g<Throwable, Optional<com.iqoption.core.microservices.configuration.a.c>> {
        public static final e dEA = new e();

        e() {
        }

        /* renamed from: x */
        public final Optional<com.iqoption.core.microservices.configuration.a.c> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return Optional.pW();
        }
    }

    public final LiveData<Optional<String>> aNj() {
        return this.dEw;
    }

    public final void b(com.iqoption.core.microservices.kyc.response.step.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "step");
        aIB().b(cVar);
        aIB().a(KycStepType.TIN, 0);
    }

    public final LiveData<Optional<com.iqoption.core.microservices.configuration.a.c>> aNk() {
        f fVar = this.bIt;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("countryViewModel");
        }
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(f.a(fVar, true, null, 2, null).t(d.dEz).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).bkO().h(e.dEA));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…rn { Optional.absent() })");
        return fromPublisher;
    }

    public final void a(com.iqoption.core.microservices.configuration.a.c cVar, String str) {
        kotlin.jvm.internal.i.f(cVar, "country");
        kotlin.jvm.internal.i.f(str, "tin");
        io.reactivex.disposables.b a = com.iqoption.core.microservices.kyc.c.bur.g(cVar.getId().longValue(), str).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new b(this), (io.reactivex.b.f) new c(this));
        kotlin.jvm.internal.i.e(a, "KycRequests.putCustomerT…      }\n                )");
        b(a);
    }

    public final void g(KycStepType kycStepType) {
        kotlin.jvm.internal.i.f(kycStepType, "stepType");
        aIB().g(kycStepType);
    }

    public final boolean Er() {
        return aIB().Er();
    }
}
