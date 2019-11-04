package com.iqoption.deposit.a;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.data.b.b;
import com.iqoption.deposit.a.a.b.c;
import com.iqoption.deposit.k;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/deposit/constructor/PaymentMethodFieldsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "depositSelectionViewModel", "Lcom/iqoption/deposit/DepositSelectionViewModel;", "observeSelectedInteger", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "Lcom/iqoption/deposit/constructor/selector/integer/SelectorIntegerAdapterItem;", "observeSelectedStringItem", "Lcom/iqoption/deposit/constructor/selector/string/SelectorStringItem;", "selectedMethod", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "Companion", "deposit_release"})
/* compiled from: PaymentMethodFieldsViewModel.kt */
public final class h extends ViewModel {
    public static final a cyS = new a();
    private k cxD;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/deposit/constructor/PaymentMethodFieldsViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/deposit/constructor/PaymentMethodFieldsViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "deposit_release"})
    /* compiled from: PaymentMethodFieldsViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final h G(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(h.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ldsViewModel::class.java]");
            h hVar = (h) viewModel;
            hVar.cxD = k.cxn.C(fragment);
            return hVar;
        }
    }

    public final LiveData<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> aqq() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoy();
    }

    public final b<com.iqoption.deposit.a.a.a.b> aqr() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoG();
    }

    public final b<c> aoH() {
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        return kVar.aoH();
    }
}
