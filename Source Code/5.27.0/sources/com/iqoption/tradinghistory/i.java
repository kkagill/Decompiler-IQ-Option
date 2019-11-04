package com.iqoption.tradinghistory;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.microservices.internalbilling.a.b;
import com.iqoption.core.ui.f.d;
import io.reactivex.b.f;
import io.reactivex.e;
import io.reactivex.processors.BehaviorProcessor;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0013R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lcom/iqoption/tradinghistory/TradingHistorySelectionViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "filterProcessor", "Lio/reactivex/processors/BehaviorProcessor;", "Lcom/iqoption/tradinghistory/TradingHistoryFilters;", "kotlin.jvm.PlatformType", "filters", "Lio/reactivex/Flowable;", "setActiveFilter", "", "filter", "Lcom/iqoption/tradinghistory/ActiveFilter;", "setBalanceFilter", "balance", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "setDateFilter", "Lcom/iqoption/tradinghistory/DateFilter;", "setInstrumentFilter", "Lcom/iqoption/tradinghistory/InstrumentFilter;", "Companion", "tradinghistory_release"})
/* compiled from: TradingHistorySelectionViewModel.kt */
public final class i extends d {
    public static final a dVq = new a();
    private final BehaviorProcessor<h> dVp;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/tradinghistory/TradingHistorySelectionViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/tradinghistory/TradingHistorySelectionViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "tradinghistory_release"})
    /* compiled from: TradingHistorySelectionViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final i aV(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(e.dVk.aj(fragment)).get(i.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ho…ionViewModel::class.java]");
            return (i) viewModel;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TradingHistorySelectionViewModel.kt */
    /* renamed from: com.iqoption.tradinghistory.i$1 */
    static final class AnonymousClass1<T> implements f<b> {
        final /* synthetic */ i dVr;

        AnonymousClass1(i iVar) {
            this.dVr = iVar;
        }

        /* renamed from: d */
        public final void accept(b bVar) {
            BehaviorProcessor a = this.dVr.dVp;
            com.iqoption.tradinghistory.h.a aVar = h.dVo;
            kotlin.jvm.internal.i.e(bVar, "it");
            a.onNext(aVar.b(bVar));
        }
    }

    public i() {
        BehaviorProcessor bmG = BehaviorProcessor.bmG();
        kotlin.jvm.internal.i.e(bmG, "BehaviorProcessor.create<TradingHistoryFilters>()");
        this.dVp = bmG;
        io.reactivex.disposables.b a = com.iqoption.core.data.repository.a.bds.aI(com.iqoption.core.d.EA().DH()).f(com.iqoption.core.rx.i.aki()).e(com.iqoption.core.rx.i.akj()).a(new AnonymousClass1(this), AnonymousClass2.dVs);
        kotlin.jvm.internal.i.e(a, "BalanceRepository.getBal…      }\n                )");
        b(a);
    }

    public final e<h> aVp() {
        e c = this.dVp.c(com.iqoption.core.rx.i.aki());
        kotlin.jvm.internal.i.e(c, "filterProcessor.observeOn(bg)");
        return c;
    }

    public final void a(f fVar) {
        kotlin.jvm.internal.i.f(fVar, "filter");
        h hVar = (h) this.dVp.getValue();
        if (hVar != null) {
            this.dVp.onNext(h.a(hVar, fVar, null, null, null, 14, null));
        }
    }

    public final void c(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "balance");
        h hVar = (h) this.dVp.getValue();
        if (hVar != null) {
            this.dVp.onNext(h.a(hVar, null, bVar, null, null, 13, null));
        }
    }

    public final void a(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "filter");
        h hVar = (h) this.dVp.getValue();
        if (hVar != null) {
            this.dVp.onNext(h.a(hVar, null, null, aVar, null, 11, null));
        }
    }

    public final void a(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "filter");
        h hVar = (h) this.dVp.getValue();
        if (hVar != null) {
            this.dVp.onNext(h.a(hVar, null, null, null, dVar, 7, null));
        }
    }
}
