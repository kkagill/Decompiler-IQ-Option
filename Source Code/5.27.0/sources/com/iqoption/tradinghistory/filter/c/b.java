package com.iqoption.tradinghistory.filter.c;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.collect.Maps;
import com.iqoption.core.ui.f.d;
import com.iqoption.tradinghistory.g;
import com.iqoption.tradinghistory.h;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/tradinghistory/filter/date/DateFilterViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "selectionViewModel", "Lcom/iqoption/tradinghistory/TradingHistorySelectionViewModel;", "dateFilter", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/tradinghistory/DateFilter;", "setFilter", "", "filter", "Companion", "tradinghistory_release"})
/* compiled from: DateFilterViewModel.kt */
public final class b extends d {
    public static final a dYj = new a();
    private com.iqoption.tradinghistory.i dXw;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/tradinghistory/filter/date/DateFilterViewModel$Companion;", "", "()V", "generatePresets", "", "", "Lcom/iqoption/tradinghistory/DateFilter;", "get", "Lcom/iqoption/tradinghistory/filter/date/DateFilterViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "tradinghistory_release"})
    /* compiled from: DateFilterViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b aZ(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…terViewModel::class.java]");
            b bVar = (b) viewModel;
            bVar.dXw = com.iqoption.tradinghistory.i.dVq.aV(fragment);
            return bVar;
        }

        public final Map<Integer, com.iqoption.tradinghistory.d> aVY() {
            HashMap uk = Maps.uk();
            com.iqoption.tradinghistory.materialcalendar.b aWk = com.iqoption.tradinghistory.materialcalendar.b.aWk();
            kotlin.jvm.internal.i.e(aWk, "CalendarDay.today()");
            Calendar instance = Calendar.getInstance();
            instance.add(5, 1);
            com.iqoption.tradinghistory.materialcalendar.b b = com.iqoption.tradinghistory.materialcalendar.b.b(instance);
            kotlin.jvm.internal.i.e(uk, "presets");
            Map map = uk;
            map.put(Integer.valueOf(g.d.today), new com.iqoption.tradinghistory.d(aWk, b));
            Calendar instance2 = Calendar.getInstance();
            instance2.add(5, -1);
            com.iqoption.tradinghistory.materialcalendar.b b2 = com.iqoption.tradinghistory.materialcalendar.b.b(instance2);
            map.put(Integer.valueOf(g.d.yestarday), new com.iqoption.tradinghistory.d(b2, b2));
            instance2.add(5, -5);
            map.put(Integer.valueOf(g.d.lastSevenDay), new com.iqoption.tradinghistory.d(com.iqoption.tradinghistory.materialcalendar.b.b(instance2), b));
            instance2.add(5, -23);
            map.put(Integer.valueOf(g.d.last30days), new com.iqoption.tradinghistory.d(com.iqoption.tradinghistory.materialcalendar.b.b(instance2), b));
            instance2.add(5, 29);
            instance2.add(2, -3);
            map.put(Integer.valueOf(g.d.threeMonths), new com.iqoption.tradinghistory.d(com.iqoption.tradinghistory.materialcalendar.b.b(instance2), b));
            map.put(Integer.valueOf(g.d.allTime), new com.iqoption.tradinghistory.d(null, null));
            return map;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/tradinghistory/DateFilter;", "it", "Lcom/iqoption/tradinghistory/TradingHistoryFilters;", "apply"})
    /* compiled from: DateFilterViewModel.kt */
    static final class b<T, R> implements io.reactivex.b.g<T, R> {
        public static final b dYk = new b();

        b() {
        }

        /* renamed from: d */
        public final com.iqoption.tradinghistory.d apply(h hVar) {
            kotlin.jvm.internal.i.f(hVar, "it");
            return hVar.aVo();
        }
    }

    public final LiveData<com.iqoption.tradinghistory.d> aVX() {
        com.iqoption.tradinghistory.i iVar = this.dXw;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(iVar.aVp().g(b.dYk).c(com.iqoption.core.rx.i.akj()).bkT());
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…tUntilChanged()\n        )");
        return fromPublisher;
    }

    public final void e(com.iqoption.tradinghistory.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "filter");
        com.iqoption.tradinghistory.i iVar = this.dXw;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        iVar.a(dVar);
    }
}
