package com.iqoption.deposit.crypto.a;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.base.Optional;
import com.iqoption.core.microservices.billing.response.crypto.f;
import com.iqoption.core.microservices.billing.response.crypto.j;
import com.iqoption.core.microservices.billing.response.deposit.d;
import com.iqoption.deposit.k;
import io.reactivex.b.g;
import io.reactivex.b.h;
import io.reactivex.p;
import io.reactivex.t;
import java.math.BigDecimal;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006J\"\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/deposit/crypto/preform/DepositCryptoViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "depositSelectionViewModel", "Lcom/iqoption/deposit/DepositSelectionViewModel;", "currentAmount", "Landroidx/lifecycle/LiveData;", "Ljava/math/BigDecimal;", "currentCurrency", "Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "currentMethod", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "getCryptoData", "Lcom/google/common/base/Optional;", "Lcom/iqoption/deposit/crypto/preform/CryptoData;", "methodId", "", "from", "", "Companion", "deposit_release"})
/* compiled from: DepositCryptoViewModel.kt */
public final class c extends ViewModel {
    public static final a czX = new a();
    private k cxD;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/deposit/crypto/preform/DepositCryptoViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/deposit/crypto/preform/DepositCryptoViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "deposit_release"})
    /* compiled from: DepositCryptoViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c J(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(c.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ptoViewModel::class.java)");
            c cVar = (c) viewModel;
            cVar.cxD = k.cxn.C(fragment);
            return cVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/google/common/base/Optional;", "Lcom/iqoption/deposit/crypto/preform/CryptoData;", "kotlin.jvm.PlatformType", "fiatCurrency", "Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "apply"})
    /* compiled from: DepositCryptoViewModel.kt */
    static final class b<T, R> implements g<T, t<? extends R>> {
        final /* synthetic */ String cAa;
        final /* synthetic */ c czY;
        final /* synthetic */ long czZ;

        b(c cVar, long j, String str) {
            this.czY = cVar;
            this.czZ = j;
            this.cAa = str;
        }

        /* renamed from: b */
        public final p<Optional<a>> apply(final d dVar) {
            kotlin.jvm.internal.i.f(dVar, "fiatCurrency");
            return p.a((t) com.iqoption.core.microservices.billing.a.bmi.Zt().t(AnonymousClass1.cAb).u(AnonymousClass2.cAc).h(com.iqoption.core.rx.i.aki()), (t) com.iqoption.core.microservices.billing.a.bmi.b(this.czZ, this.cAa, dVar.getName()).t(AnonymousClass3.cAd).u(AnonymousClass4.cAe).h(com.iqoption.core.rx.i.aki()), (t) com.iqoption.core.data.repository.c.bdy.WS().d(com.iqoption.core.rx.i.aki()).bkV(), (h) new h<Optional<f>, Optional<com.iqoption.core.microservices.billing.response.crypto.h>, List<? extends com.iqoption.core.microservices.configuration.a.d>, Optional<a>>(this) {
                final /* synthetic */ b cAf;

                public final Optional<a> a(Optional<f> optional, Optional<com.iqoption.core.microservices.billing.response.crypto.h> optional2, List<com.iqoption.core.microservices.configuration.a.d> list) {
                    kotlin.jvm.internal.i.f(optional, "settingsResult");
                    kotlin.jvm.internal.i.f(optional2, "rateResult");
                    kotlin.jvm.internal.i.f(list, "currencies");
                    com.iqoption.core.microservices.billing.response.crypto.h hVar = (com.iqoption.core.microservices.billing.response.crypto.h) optional2.pN();
                    Object obj = null;
                    j aal = hVar != null ? hVar.aal() : null;
                    f fVar = (f) optional.pN();
                    if (aal == null || fVar == null) {
                        return Optional.pW();
                    }
                    Iterable iterable = list;
                    for (Object next : iterable) {
                        if (kotlin.jvm.internal.i.y(((com.iqoption.core.microservices.configuration.a.d) next).getName(), this.cAf.cAa)) {
                            break;
                        }
                    }
                    Object next2 = null;
                    if (next2 == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    com.iqoption.core.microservices.configuration.a.d dVar = (com.iqoption.core.microservices.configuration.a.d) next2;
                    for (Object next3 : iterable) {
                        if (kotlin.jvm.internal.i.y(((com.iqoption.core.microservices.configuration.a.d) next3).getName(), dVar.getName())) {
                            obj = next3;
                            break;
                        }
                    }
                    if (obj == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    c.a(this.cAf.czY).a(new d(aal, dVar, (com.iqoption.core.microservices.configuration.a.d) obj));
                    String str = this.cAf.cAa;
                    d dVar2 = dVar;
                    kotlin.jvm.internal.i.e(dVar2, "fiatCurrency");
                    return Optional.am(new a(str, dVar2, fVar, aal));
                }
            });
        }
    }

    public static final /* synthetic */ k a(c cVar) {
        k kVar = cVar.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar;
    }

    public final LiveData<Optional<a>> j(long j, String str) {
        kotlin.jvm.internal.i.f(str, "from");
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(kVar.aoA().c(com.iqoption.core.rx.i.aki()).f((g) new b(this, j, str)).cF(Optional.pW()).c(com.iqoption.core.rx.i.akj()));
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

    public final LiveData<BigDecimal> aoD() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoD();
    }
}
