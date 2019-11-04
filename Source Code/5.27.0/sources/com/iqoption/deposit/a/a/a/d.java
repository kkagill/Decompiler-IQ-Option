package com.iqoption.deposit.a.a.a;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.deposit.k;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/deposit/constructor/selector/integer/SelectorIntegerMenuViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "depositSelectionViewModel", "Lcom/iqoption/deposit/DepositSelectionViewModel;", "selectIntegerItem", "", "item", "Lcom/iqoption/deposit/constructor/selector/integer/SelectorIntegerAdapterItem;", "Companion", "deposit_release"})
/* compiled from: SelectorIntegerMenuViewModel.kt */
public final class d extends ViewModel {
    public static final a cyU = new a();
    private k cxD;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/deposit/constructor/selector/integer/SelectorIntegerMenuViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/deposit/constructor/selector/integer/SelectorIntegerMenuViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "deposit_release"})
    /* compiled from: SelectorIntegerMenuViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d H(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(d.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…enuViewModel::class.java]");
            d dVar = (d) viewModel;
            dVar.cxD = k.cxn.C(fragment);
            return dVar;
        }
    }

    public final void a(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "item");
        k kVar = this.cxD;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("depositSelectionViewModel");
        }
        kVar.a(bVar);
    }
}
