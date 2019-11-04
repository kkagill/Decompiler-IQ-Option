package com.iqoption.deposit.light.perform;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.billing.f;
import com.iqoption.billing.wallet.b;
import com.iqoption.core.microservices.billing.response.deposit.d;
import com.iqoption.deposit.j;
import com.iqoption.deposit.k;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\bJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bJ\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\bJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\bJ\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\bJ\"\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 J\u0010\u0010#\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010\u0010J\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0012J\u000e\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u0014J\u0006\u0010)\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b¨\u0006+"}, bng = {"Lcom/iqoption/deposit/light/perform/DepositPerformLightViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "depositPayViewModel", "Lcom/iqoption/deposit/DepositPayViewModel;", "depositSelectionViewModel", "Lcom/iqoption/deposit/DepositSelectionViewModel;", "googlePayResult", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/billing/wallet/GooglePayResult;", "getGooglePayResult", "()Landroidx/lifecycle/LiveData;", "payProgress", "", "getPayProgress", "currentAmount", "Ljava/math/BigDecimal;", "currentCurrency", "Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "currentDeposit", "Lcom/iqoption/core/microservices/billing/response/deposit/Deposit;", "currentMethod", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "currentRateData", "Lcom/iqoption/deposit/crypto/preform/RateData;", "loadedCashbox", "Lcom/iqoption/billing/CashboxDisplayData;", "pay", "", "depositParams", "Lcom/iqoption/deposit/DepositParams;", "extraParams", "", "", "", "selectAmount", "amount", "selectCurrency", "currency", "selectDeposit", "deposit", "shouldShowKycBeforeDep", "Companion", "deposit_release"})
/* compiled from: DepositPerformLightViewModel.kt */
public final class e extends ViewModel {
    public static final a cFU = new a();
    private j cAq;
    private k cxD;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/deposit/light/perform/DepositPerformLightViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/deposit/light/perform/DepositPerformLightViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "deposit_release"})
    /* compiled from: DepositPerformLightViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final e N(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(e.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ghtViewModel::class.java]");
            e eVar = (e) viewModel;
            eVar.cxD = k.cxn.C(fragment);
            eVar.cAq = j.cwW.m(com.iqoption.core.ext.a.r(fragment));
            return eVar;
        }
    }

    public final LiveData<f> aox() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aox();
    }

    public final LiveData<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> aoy() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoy();
    }

    public final void a(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "currency");
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        kVar.a(dVar);
    }

    public final LiveData<d> aoz() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoz();
    }

    public final void b(com.iqoption.core.microservices.billing.response.deposit.e eVar) {
        kotlin.jvm.internal.i.f(eVar, "deposit");
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        kVar.b(eVar);
    }

    public final LiveData<com.iqoption.core.microservices.billing.response.deposit.e> aoC() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoC();
    }

    public final void b(BigDecimal bigDecimal) {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        kVar.b(bigDecimal);
    }

    public final LiveData<BigDecimal> aoD() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoD();
    }

    public final LiveData<com.iqoption.deposit.crypto.a.d> aoB() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoB();
    }

    public final void a(com.iqoption.deposit.i iVar, Map<String, ? extends Object> map) {
        kotlin.jvm.internal.i.f(iVar, "depositParams");
        kotlin.jvm.internal.i.f(map, "extraParams");
        j jVar = this.cAq;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("depositPayViewModel");
        }
        jVar.a(iVar, (Map) map);
    }

    public final LiveData<Boolean> aor() {
        j jVar = this.cAq;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("depositPayViewModel");
        }
        return jVar.aor();
    }

    public final LiveData<b> aot() {
        j jVar = this.cAq;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("depositPayViewModel");
        }
        return jVar.aot();
    }

    public final boolean aoJ() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoJ();
    }
}
