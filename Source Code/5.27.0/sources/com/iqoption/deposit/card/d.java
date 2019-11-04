package com.iqoption.deposit.card;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.deposit.card.ScanViewModel.ScanItem;
import com.iqoption.deposit.k;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/deposit/card/CardPaymentViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "depositSelectionViewModel", "Lcom/iqoption/deposit/DepositSelectionViewModel;", "currentMethod", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "currentScanItem", "Lcom/iqoption/deposit/card/ScanViewModel$ScanItem;", "observerNfcCard", "Lcom/iqoption/deposit/card/NfcCardScanner$NfcCard;", "Companion", "deposit_release"})
/* compiled from: CardPaymentViewModel.kt */
public final class d extends ViewModel {
    public static final a cxE = new a();
    private k cxD;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/deposit/card/CardPaymentViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/deposit/card/CardPaymentViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "deposit_release"})
    /* compiled from: CardPaymentViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d D(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(d.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…entViewModel::class.java]");
            d dVar = (d) viewModel;
            dVar.cxD = k.cxn.C(fragment);
            return dVar;
        }
    }

    public final LiveData<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> aoy() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoy();
    }

    public final LiveData<ScanItem> aoE() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoE();
    }

    public final LiveData<com.iqoption.deposit.card.e.a> aoF() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoF();
    }
}
