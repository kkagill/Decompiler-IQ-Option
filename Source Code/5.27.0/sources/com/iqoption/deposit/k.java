package com.iqoption.deposit;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.billing.f;
import com.iqoption.billing.h;
import com.iqoption.core.data.b.b;
import com.iqoption.core.microservices.billing.response.crypto.CryptoDepositStatus;
import com.iqoption.core.microservices.billing.response.deposit.e;
import com.iqoption.core.microservices.configuration.a.d;
import com.iqoption.deposit.a.a.b.c;
import com.iqoption.deposit.card.ScanViewModel.ScanItem;
import io.reactivex.processors.BehaviorProcessor;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 I2\u00020\u0001:\u0001IB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\fJ\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050&J\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0&J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0&J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0*J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130&J\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0&J\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0&J\f\u0010.\u001a\b\u0012\u0004\u0012\u00020!0&J\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070&J\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bJ\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bJ\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f0&J\n\u00103\u001a\u0004\u0018\u000104H\u0002J\u0010\u00105\u001a\u00020#2\b\u00106\u001a\u0004\u0018\u00010\u0005J\u000e\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020\u000eJ\u000e\u00109\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0013J\u000e\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020\u0015J\u0010\u0010<\u001a\u00020#2\b\u0010=\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020!J\u000e\u0010@\u001a\u00020#2\u0006\u0010;\u001a\u00020\u0017J\u0010\u0010A\u001a\u00020#2\b\u0010B\u001a\u0004\u0018\u00010\u0007J\u000e\u0010C\u001a\u00020#2\u0006\u0010D\u001a\u00020\u001fJ\u000e\u0010E\u001a\u00020#2\u0006\u0010F\u001a\u00020\tJ\u0006\u0010G\u001a\u00020\u0019J\u0006\u0010H\u001a\u00020\u0019R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u000e0\u000e0\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, bng = {"Lcom/iqoption/deposit/DepositSelectionViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "amountLiveData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/math/BigDecimal;", "cashboxLiveData", "Lcom/iqoption/billing/CashboxDisplayData;", "convertRateLiveData", "Lcom/iqoption/deposit/crypto/preform/RateData;", "cryptoStatusLiveData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "currencyLiveData", "Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "currencyProcessor", "Lio/reactivex/processors/FlowableProcessor;", "kotlin.jvm.PlatformType", "depositLiveData", "Lcom/iqoption/core/microservices/billing/response/deposit/Deposit;", "fieldSelectIntegerLiveData", "Lcom/iqoption/deposit/constructor/selector/integer/SelectorIntegerAdapterItem;", "fieldSelectStringLiveData", "Lcom/iqoption/deposit/constructor/selector/string/SelectorStringItem;", "hasSucceededCryptoDeposits", "", "getHasSucceededCryptoDeposits", "()Landroidx/lifecycle/MutableLiveData;", "methodLiveData", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "nfcCardLiveData", "Lcom/iqoption/deposit/card/NfcCardScanner$NfcCard;", "scanCardLiveData", "Lcom/iqoption/deposit/card/ScanViewModel$ScanItem;", "changeCurrentCryptoStatus", "", "deposit", "currentAmount", "Landroidx/lifecycle/LiveData;", "currentCryptoStatus", "currentCurrency", "currentCurrencyFlowable", "Lio/reactivex/Flowable;", "currentDeposit", "currentMethod", "currentRateData", "currentScanItem", "loadedCashbox", "observeSelectedIntegerItem", "observeSelectedStringItem", "observerNfcCard", "permissions", "Lcom/iqoption/billing/KycDepositPermissions;", "selectAmount", "amount", "selectCurrency", "currencyBilling", "selectDeposit", "selectIntegerItem", "item", "selectMethod", "cashboxItem", "selectScanItem", "scanItem", "selectStringItem", "setLoadedCashbox", "counting", "setNfcCard", "nfcCard", "setRateData", "rateData", "shouldShowKycAfterDep", "shouldShowKycBeforeDep", "Companion", "deposit_release"})
/* compiled from: DepositSelectionViewModel.kt */
public final class k extends ViewModel {
    private static final String cxm = d.brN.acS();
    public static final a cxn = new a();
    private final MutableLiveData<f> cwZ = new MutableLiveData();
    private final MutableLiveData<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> cxa = new MutableLiveData();
    private final MutableLiveData<com.iqoption.core.microservices.billing.response.deposit.d> cxb = new MutableLiveData();
    private final io.reactivex.processors.a<com.iqoption.core.microservices.billing.response.deposit.d> cxc;
    private final MutableLiveData<com.iqoption.deposit.crypto.a.d> cxd;
    private final b<e> cxe;
    private final MutableLiveData<BigDecimal> cxf;
    private final b<ScanItem> cxg;
    private final b<com.iqoption.deposit.a.a.a.b> cxh;
    private final b<c> cxi;
    private final b<com.iqoption.deposit.card.e.a> cxj;
    private final b<com.iqoption.core.microservices.billing.response.crypto.a> cxk;
    private final MutableLiveData<Boolean> cxl;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, bng = {"Lcom/iqoption/deposit/DepositSelectionViewModel$Companion;", "", "()V", "CRYPTO_CURRENCY", "", "getCRYPTO_CURRENCY", "()Ljava/lang/String;", "create", "Lcom/iqoption/deposit/DepositSelectionViewModel;", "child", "Landroidx/fragment/app/Fragment;", "deposit_release"})
    /* compiled from: DepositSelectionViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String aoN() {
            return k.cxm;
        }

        public final k C(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            com.iqoption.deposit.navigator.b bVar = (com.iqoption.deposit.navigator.b) (!(fragment instanceof com.iqoption.deposit.navigator.b) ? null : fragment);
            if (bVar == null) {
                bVar = (com.iqoption.deposit.navigator.b) com.iqoption.core.ext.a.a(fragment, com.iqoption.deposit.navigator.b.class);
            }
            ViewModel viewModel = ViewModelProviders.of((Fragment) bVar).get(k.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ionViewModel::class.java]");
            return (k) viewModel;
        }
    }

    public k() {
        io.reactivex.processors.a bmJ = BehaviorProcessor.bmG().bmJ();
        kotlin.jvm.internal.i.e(bmJ, "BehaviorProcessor.create…Billing>().toSerialized()");
        this.cxc = bmJ;
        this.cxd = new MutableLiveData();
        this.cxe = new b();
        this.cxf = new MutableLiveData();
        this.cxg = new b();
        this.cxh = new b();
        this.cxi = new b();
        this.cxj = new b();
        this.cxk = new b();
        this.cxl = new MutableLiveData();
    }

    public final MutableLiveData<Boolean> aow() {
        return this.cxl;
    }

    public final void a(f fVar) {
        Iterable<com.iqoption.core.microservices.billing.response.crypto.a> iterable;
        f fVar2 = (f) this.cwZ.getValue();
        Integer num = null;
        List Kq = fVar2 != null ? fVar2.Kq() : null;
        int i = 0;
        if (Kq != null) {
            int i2;
            iterable = Kq;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                for (com.iqoption.core.microservices.billing.response.crypto.a ZR : iterable) {
                    if ((ZR.ZR() == CryptoDepositStatus.SUCCESS ? 1 : null) != null) {
                        i2++;
                        if (i2 < 0) {
                            m.bnp();
                        }
                    }
                }
            }
            num = Integer.valueOf(i2);
        }
        if (fVar != null) {
            Kq = fVar.Kq();
            if (Kq != null) {
                iterable = Kq;
                if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                    int i3 = 0;
                    for (com.iqoption.core.microservices.billing.response.crypto.a ZR2 : iterable) {
                        if ((ZR2.ZR() == CryptoDepositStatus.SUCCESS ? 1 : null) != null) {
                            i3++;
                            if (i3 < 0) {
                                m.bnp();
                            }
                        }
                    }
                    i = i3;
                }
            }
        }
        if (num != null && kotlin.jvm.internal.i.compare(i, num.intValue()) > 0) {
            this.cxl.postValue(Boolean.valueOf(true));
        }
        this.cwZ.postValue(fVar);
    }

    public final LiveData<f> aox() {
        return this.cwZ;
    }

    public final void i(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
        this.cxa.postValue(aVar);
    }

    public final LiveData<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> aoy() {
        return this.cxa;
    }

    public final void a(com.iqoption.core.microservices.billing.response.deposit.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "currencyBilling");
        this.cxb.postValue(dVar);
        this.cxc.onNext(dVar);
    }

    public final LiveData<com.iqoption.core.microservices.billing.response.deposit.d> aoz() {
        return this.cxb;
    }

    public final io.reactivex.e<com.iqoption.core.microservices.billing.response.deposit.d> aoA() {
        return this.cxc;
    }

    public final LiveData<com.iqoption.deposit.crypto.a.d> aoB() {
        return this.cxd;
    }

    public final void a(com.iqoption.deposit.crypto.a.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "rateData");
        this.cxd.postValue(dVar);
    }

    public final void b(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "deposit");
        this.cxe.postValue(eVar);
    }

    public final LiveData<e> aoC() {
        return this.cxe;
    }

    public final void b(BigDecimal bigDecimal) {
        com.iqoption.core.ext.a.b(this.cxf, (Object) bigDecimal);
    }

    public final LiveData<BigDecimal> aoD() {
        return this.cxf;
    }

    public final void a(ScanItem scanItem) {
        kotlin.jvm.internal.i.f(scanItem, "scanItem");
        this.cxg.postValue(scanItem);
    }

    public final LiveData<ScanItem> aoE() {
        return this.cxg;
    }

    public final void a(com.iqoption.deposit.card.e.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "nfcCard");
        this.cxj.postValue(aVar);
    }

    public final LiveData<com.iqoption.deposit.card.e.a> aoF() {
        return this.cxj;
    }

    public final void a(com.iqoption.deposit.a.a.a.b bVar) {
        kotlin.jvm.internal.i.f(bVar, "item");
        this.cxh.postValue(bVar);
    }

    public final b<com.iqoption.deposit.a.a.a.b> aoG() {
        return this.cxh;
    }

    public final void a(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "item");
        this.cxi.postValue(cVar);
    }

    public final b<c> aoH() {
        return this.cxi;
    }

    public final void a(com.iqoption.core.microservices.billing.response.crypto.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "deposit");
        this.cxk.postValue(aVar);
    }

    public final LiveData<com.iqoption.core.microservices.billing.response.crypto.a> aoI() {
        return this.cxk;
    }

    public final boolean aoJ() {
        h aoL = aoL();
        return aoL != null && aoL.Kt();
    }

    public final boolean aoK() {
        h aoL = aoL();
        return aoL != null && aoL.Ku();
    }

    private final h aoL() {
        f fVar = (f) this.cwZ.getValue();
        return fVar != null ? fVar.Ks() : null;
    }
}
