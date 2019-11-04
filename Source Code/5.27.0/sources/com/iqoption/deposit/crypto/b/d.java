package com.iqoption.deposit.crypto.b;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.base.Optional;
import com.iqoption.core.microservices.billing.response.crypto.CryptoDepositStatus;
import com.iqoption.deposit.k;
import io.reactivex.b.f;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006J\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00062\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/deposit/crypto/status/CryptoPaymentStatusViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "depositSelectionViewModel", "Lcom/iqoption/deposit/DepositSelectionViewModel;", "currentMethod", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "getCryptoDeposit", "Lcom/google/common/base/Optional;", "Lcom/iqoption/deposit/crypto/status/CryptoDepositData;", "billingId", "", "Companion", "deposit_release"})
/* compiled from: CryptoPaymentStatusViewModel.kt */
public final class d extends com.iqoption.core.ui.f.d {
    public static final a cAA = new a();
    private k cxD;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/deposit/crypto/status/CryptoPaymentStatusViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/deposit/crypto/status/CryptoPaymentStatusViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "deposit_release"})
    /* compiled from: CryptoPaymentStatusViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d L(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(d.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…tusViewModel::class.java]");
            d dVar = (d) viewModel;
            dVar.cxD = k.cxn.C(fragment);
            return dVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "update", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositStatusUpdate;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: CryptoPaymentStatusViewModel.kt */
    /* renamed from: com.iqoption.deposit.crypto.b.d$1 */
    static final class AnonymousClass1<T> implements f<com.iqoption.core.microservices.billing.response.crypto.d> {
        final /* synthetic */ d cAB;

        AnonymousClass1(d dVar) {
            this.cAB = dVar;
        }

        /* renamed from: b */
        public final void accept(com.iqoption.core.microservices.billing.response.crypto.d dVar) {
            if (com.iqoption.core.ext.c.b(dVar.aaf().ZR(), CryptoDepositStatus.SUCCESS, CryptoDepositStatus.FAILED)) {
                d.a(this.cAB).a(dVar.aaf());
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "kotlin.jvm.PlatformType", "deposits", "", "apply"})
    /* compiled from: CryptoPaymentStatusViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        final /* synthetic */ long cAD;

        b(long j) {
            this.cAD = j;
        }

        /* renamed from: aI */
        public final Optional<com.iqoption.core.microservices.billing.response.crypto.a> apply(List<com.iqoption.core.microservices.billing.response.crypto.a> list) {
            kotlin.jvm.internal.i.f(list, "deposits");
            for (Object next : list) {
                Object obj;
                if (((com.iqoption.core.microservices.billing.response.crypto.a) next).ZF() == this.cAD) {
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
            return Optional.an((com.iqoption.core.microservices.billing.response.crypto.a) next2);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n¢\u0006\u0002\b\t"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/deposit/crypto/status/CryptoDepositData;", "kotlin.jvm.PlatformType", "depositOptional", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "currencies", "", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "apply"})
    /* compiled from: CryptoPaymentStatusViewModel.kt */
    static final class c<T1, T2, R> implements io.reactivex.b.c<Optional<com.iqoption.core.microservices.billing.response.crypto.a>, List<? extends com.iqoption.core.microservices.configuration.a.d>, Optional<a>> {
        public static final c cAE = new c();

        c() {
        }

        /* renamed from: a */
        public final Optional<a> apply(Optional<com.iqoption.core.microservices.billing.response.crypto.a> optional, List<com.iqoption.core.microservices.configuration.a.d> list) {
            kotlin.jvm.internal.i.f(optional, "depositOptional");
            kotlin.jvm.internal.i.f(list, "currencies");
            com.iqoption.core.microservices.billing.response.crypto.a aVar = (com.iqoption.core.microservices.billing.response.crypto.a) optional.pN();
            if (aVar == null) {
                return Optional.pW();
            }
            kotlin.jvm.internal.i.e(aVar, "depositOptional.orNull()…unction Optional.absent()");
            for (Object next : list) {
                if (kotlin.jvm.internal.i.y(((com.iqoption.core.microservices.configuration.a.d) next).getName(), aVar.ZO())) {
                    break;
                }
            }
            Object next2 = null;
            return Optional.am(new a(aVar, (com.iqoption.core.microservices.configuration.a.d) next2));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/deposit/crypto/status/CryptoDepositData;", "kotlin.jvm.PlatformType", "it", "", "apply"})
    /* compiled from: CryptoPaymentStatusViewModel.kt */
    static final class d<T, R> implements g<Throwable, Optional<a>> {
        public static final d cAF = new d();

        d() {
        }

        /* renamed from: x */
        public final Optional<a> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return Optional.pW();
        }
    }

    public d() {
        io.reactivex.disposables.b a = com.iqoption.core.microservices.billing.a.bmi.Zv().c(com.iqoption.core.rx.i.aki()).a((f) new AnonymousClass1(this), (f) AnonymousClass2.cAC);
        kotlin.jvm.internal.i.e(a, "CashBoxRequests.getCrypt…      }\n                )");
        b(a);
    }

    public static final /* synthetic */ k a(d dVar) {
        k kVar = dVar.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar;
    }

    public final LiveData<Optional<a>> bt(long j) {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(e.a((org.a.b) com.iqoption.billing.repository.a.ayY.Kw().g(new b(j)), (org.a.b) com.iqoption.core.data.repository.c.bdy.WS(), (io.reactivex.b.c) c.cAE).h(d.cAF).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.… .observeOn(ui)\n        )");
        return fromPublisher;
    }

    public final LiveData<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> aoy() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoy();
    }
}
