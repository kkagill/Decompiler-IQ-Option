package com.iqoption.deposit.crypto.refund;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.deposit.j;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, bng = {"Lcom/iqoption/deposit/crypto/refund/RefundAddressViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "depositPayViewModel", "Lcom/iqoption/deposit/DepositPayViewModel;", "payProgress", "Landroidx/lifecycle/LiveData;", "", "getPayProgress", "()Landroidx/lifecycle/LiveData;", "pay", "", "depositParams", "Lcom/iqoption/deposit/DepositParams;", "extraParams", "", "", "", "Companion", "deposit_release"})
/* compiled from: RefundAddressViewModel.kt */
public final class b extends ViewModel {
    public static final a cAr = new a();
    private j cAq;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/deposit/crypto/refund/RefundAddressViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/deposit/crypto/refund/RefundAddressViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "deposit_release"})
    /* compiled from: RefundAddressViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b K(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…essViewModel::class.java]");
            b bVar = (b) viewModel;
            bVar.cAq = j.cwW.m(com.iqoption.core.ext.a.r(fragment));
            return bVar;
        }
    }

    public final LiveData<Boolean> aor() {
        j jVar = this.cAq;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("depositPayViewModel");
        }
        return jVar.aor();
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
}
