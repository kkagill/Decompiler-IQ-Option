package com.iqoption.tradinghistory.filter.b;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.tradinghistory.h;
import io.reactivex.b.g;
import io.reactivex.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J \u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0012H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, bng = {"Lcom/iqoption/tradinghistory/filter/balance/BalanceFilterViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "items", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/tradinghistory/filter/balance/BalanceFilterAdapterItem;", "getItems", "()Landroidx/lifecycle/LiveData;", "itemsLiveData", "Landroidx/lifecycle/MutableLiveData;", "selectionViewModel", "Lcom/iqoption/tradinghistory/TradingHistorySelectionViewModel;", "init", "", "select", "item", "selected", "", "updateFilteredList", "adapterItems", "updateSelection", "current", "target", "targetSelection", "Companion", "tradinghistory_release"})
/* compiled from: BalanceFilterViewModel.kt */
public final class f extends com.iqoption.core.ui.f.d {
    public static final a dXO = new a();
    private final LiveData<List<c>> apC = this.dXx;
    private com.iqoption.tradinghistory.i dXw;
    private final MutableLiveData<List<c>> dXx = new MutableLiveData();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/tradinghistory/filter/balance/BalanceFilterViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/tradinghistory/filter/balance/BalanceFilterViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "tradinghistory_release"})
    /* compiled from: BalanceFilterViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final f aX(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(f.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…terViewModel::class.java]");
            f fVar = (f) viewModel;
            fVar.dXw = com.iqoption.tradinghistory.i.dVq.aV(fragment);
            fVar.init();
            return fVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "it", "Lcom/iqoption/tradinghistory/TradingHistoryFilters;", "apply"})
    /* compiled from: BalanceFilterViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b dXP = new b();

        b() {
        }

        /* renamed from: b */
        public final com.iqoption.core.microservices.internalbilling.a.b apply(h hVar) {
            kotlin.jvm.internal.i.f(hVar, "it");
            return hVar.VL();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "balances", "apply"})
    /* compiled from: BalanceFilterViewModel.kt */
    static final class c<T, R> implements g<T, R> {
        public static final c dXQ = new c();

        c() {
        }

        public final List<com.iqoption.core.microservices.internalbilling.a.b> apply(List<com.iqoption.core.microservices.internalbilling.a.b> list) {
            kotlin.jvm.internal.i.f(list, "balances");
            if (com.iqoption.core.d.EH().ej("show-crypto-balances")) {
                return list;
            }
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if ((((com.iqoption.core.microservices.internalbilling.a.b) next).getType() != 5 ? 1 : null) != null) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "", "selectedBalance", "balances", "apply"})
    /* compiled from: BalanceFilterViewModel.kt */
    static final class d<T1, T2, R> implements io.reactivex.b.c<com.iqoption.core.microservices.internalbilling.a.b, List<? extends com.iqoption.core.microservices.internalbilling.a.b>, Pair<? extends com.iqoption.core.microservices.internalbilling.a.b, ? extends List<? extends com.iqoption.core.microservices.internalbilling.a.b>>> {
        public static final d dXR = new d();

        d() {
        }

        /* renamed from: a */
        public final Pair<com.iqoption.core.microservices.internalbilling.a.b, List<com.iqoption.core.microservices.internalbilling.a.b>> apply(com.iqoption.core.microservices.internalbilling.a.b bVar, List<com.iqoption.core.microservices.internalbilling.a.b> list) {
            kotlin.jvm.internal.i.f(bVar, "selectedBalance");
            kotlin.jvm.internal.i.f(list, "balances");
            return new Pair(bVar, list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: BalanceFilterViewModel.kt */
    static final class e<T> implements io.reactivex.b.f<Pair<? extends com.iqoption.core.microservices.internalbilling.a.b, ? extends List<? extends com.iqoption.core.microservices.internalbilling.a.b>>> {
        final /* synthetic */ f dXS;

        e(f fVar) {
            this.dXS = fVar;
        }

        /* renamed from: c */
        public final void accept(Pair<com.iqoption.core.microservices.internalbilling.a.b, ? extends List<com.iqoption.core.microservices.internalbilling.a.b>> pair) {
            com.iqoption.core.microservices.internalbilling.a.b bVar = (com.iqoption.core.microservices.internalbilling.a.b) pair.bnj();
            Iterable<com.iqoption.core.microservices.internalbilling.a.b> iterable = (List) pair.bnk();
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (com.iqoption.core.microservices.internalbilling.a.b bVar2 : iterable) {
                arrayList.add(new c(bVar2, bVar2.getId() == bVar.getId()));
            }
            this.dXS.bv((List) arrayList);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: BalanceFilterViewModel.kt */
    static final class f<T> implements io.reactivex.b.f<Throwable> {
        public static final f dXT = new f();

        f() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public final LiveData<List<c>> Bo() {
        return this.apC;
    }

    private final void init() {
        com.iqoption.tradinghistory.i iVar = this.dXw;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        io.reactivex.disposables.b a = p.a(iVar.aVp().g(b.dXP).bkV(), com.iqoption.core.data.repository.a.bds.WN().g(c.dXQ).bkV(), d.dXR).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new e(this), (io.reactivex.b.f) f.dXT);
        kotlin.jvm.internal.i.e(a, "Single.zip(\n            …      }\n                )");
        b(a);
    }

    public final void b(c cVar, boolean z) {
        kotlin.jvm.internal.i.f(cVar, "item");
        List list = (List) this.dXx.getValue();
        if (list != null) {
            kotlin.jvm.internal.i.e(list, "prevList");
            Iterable<c> iterable = list;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (c a : iterable) {
                arrayList.add(a(a, cVar, z));
            }
            bv((List) arrayList);
        }
    }

    private final void bv(List<c> list) {
        this.dXx.postValue(list);
        for (Object next : list) {
            if (((c) next).asM()) {
                break;
            }
        }
        Object next2 = null;
        c cVar = (c) next2;
        if (cVar != null) {
            com.iqoption.tradinghistory.i iVar = this.dXw;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG("selectionViewModel");
            }
            iVar.c(cVar.VL());
        }
    }

    private final c a(c cVar, c cVar2, boolean z) {
        if (cVar2.getId().longValue() != cVar.getId().longValue()) {
            if (z) {
                z = false;
            } else {
                z = cVar.asM();
            }
        }
        return z != cVar.asM() ? c.a(cVar, null, z, 1, null) : cVar;
    }
}
