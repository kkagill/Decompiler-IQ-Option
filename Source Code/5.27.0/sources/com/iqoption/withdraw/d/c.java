package com.iqoption.withdraw.d;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.withdraw.j;
import io.reactivex.b.g;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/withdraw/navigator/WithdrawNavigatorViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "infoPopup", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/withdraw/InfoPopupParams;", "getInfoPopup", "()Landroidx/lifecycle/LiveData;", "selectionViewModel", "Lcom/iqoption/withdraw/WithdrawSelectionViewModel;", "getBalance", "", "showInfoPopup", "", "params", "Companion", "withdraw_release"})
/* compiled from: WithdrawNavigatorViewModel.kt */
public final class c extends ViewModel {
    public static final a etF = new a();
    private j erP;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/withdraw/navigator/WithdrawNavigatorViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/withdraw/navigator/WithdrawNavigatorViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "withdraw_release"})
    /* compiled from: WithdrawNavigatorViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c bF(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(c.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…torViewModel::class.java)");
            c cVar = (c) viewModel;
            cVar.erP = j.epC.bz(fragment);
            return cVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/data/mediators/BalanceData;", "apply"})
    /* compiled from: WithdrawNavigatorViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b etG = new b();

        b() {
        }

        /* renamed from: d */
        public final String apply(com.iqoption.core.data.c.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return aVar.VN();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "", "apply"})
    /* compiled from: WithdrawNavigatorViewModel.kt */
    static final class c<T, R> implements g<Throwable, String> {
        public static final c etH = new c();

        c() {
        }

        /* renamed from: X */
        public final String apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return "";
        }
    }

    public final LiveData<com.iqoption.withdraw.c> bbW() {
        j jVar = this.erP;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.bbW();
    }

    public final void a(com.iqoption.withdraw.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "params");
        j jVar = this.erP;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.a(cVar);
    }

    public final LiveData<String> bdg() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(com.iqoption.core.data.c.b.bcS.VT().d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).g(b.etG).h(c.etH));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…rReturn { \"\" }\n\n        )");
        return fromPublisher;
    }
}
