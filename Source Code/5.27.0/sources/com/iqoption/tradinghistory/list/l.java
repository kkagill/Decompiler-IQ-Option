package com.iqoption.tradinghistory.list;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.portfolio.response.PortfolioPosition;
import io.reactivex.b.h;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.t;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 32\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0002J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J,\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020)2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000-H\u0002J\u000e\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020\u000fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u00064"}, bng = {"Lcom/iqoption/tradinghistory/list/TradingHistoryViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "allPositions", "", "Lcom/iqoption/core/microservices/portfolio/response/PortfolioPosition;", "items", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/tradinghistory/list/TradingHistoryResult;", "getItems", "()Landroidx/lifecycle/LiveData;", "itemsData", "Landroidx/lifecycle/MutableLiveData;", "offsetProcessor", "Lio/reactivex/processors/FlowableProcessor;", "", "kotlin.jvm.PlatformType", "progress", "", "getProgress", "progressData", "selectionViewModel", "Lcom/iqoption/tradinghistory/TradingHistorySelectionViewModel;", "dayIsToday", "timestamp", "", "formatAmount", "", "currency", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "amount", "", "formatDay", "formatProfitPercent", "investment", "profit", "getTitle", "init", "", "observeHistory", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/portfolio/response/HistoryPositions;", "onDataLoaded", "history", "actives", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "balances", "Lcom/iqoption/core/data/mediators/BalanceData;", "performLoading", "offset", "Companion", "tradinghistory_release"})
/* compiled from: TradingHistoryListViewModel.kt */
public final class l extends com.iqoption.core.ui.f.d {
    private static final String TAG;
    public static final a dYU = new a();
    private final MutableLiveData<j> apB = new MutableLiveData();
    private final LiveData<j> apC = this.apB;
    private com.iqoption.tradinghistory.i dXw;
    private final io.reactivex.processors.a<Integer> dYR;
    private final MutableLiveData<Boolean> dYS = new MutableLiveData();
    private final List<PortfolioPosition> dYT = new ArrayList();
    private final LiveData<Boolean> dsB = this.dYS;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, bng = {"Lcom/iqoption/tradinghistory/list/TradingHistoryViewModel$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "get", "Lcom/iqoption/tradinghistory/list/TradingHistoryViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "tradinghistory_release"})
    /* compiled from: TradingHistoryListViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final l bb(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            fragment = com.iqoption.tradinghistory.e.dVk.aj(fragment);
            ViewModel viewModel = ViewModelProviders.of(fragment).get(l.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ho…oryViewModel::class.java]");
            l lVar = (l) viewModel;
            lVar.dXw = com.iqoption.tradinghistory.i.dVq.aV(fragment);
            return lVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "it", "", "Lcom/iqoption/core/data/model/InstrumentType;", "apply"})
    /* compiled from: TradingHistoryListViewModel.kt */
    static final class b<T, R> implements io.reactivex.b.g<T, R> {
        public static final b dYV = new b();

        b() {
        }

        /* renamed from: w */
        public final List<com.iqoption.core.microservices.tradingengine.response.active.a> apply(Map<InstrumentType, ? extends List<? extends com.iqoption.core.microservices.tradingengine.response.active.a>> map) {
            kotlin.jvm.internal.i.f(map, "it");
            Collection arrayList = new ArrayList();
            for (Pair bni : ag.X(map)) {
                r.a(arrayList, (Iterable) (List) bni.bni());
            }
            return (List) arrayList;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00012\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\t"}, bng = {"<anonymous>", "Lkotlin/Triple;", "Lcom/iqoption/core/microservices/portfolio/response/HistoryPositions;", "", "Lcom/iqoption/core/data/mediators/BalanceData;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "history", "balances", "actives", "apply"})
    /* compiled from: TradingHistoryListViewModel.kt */
    static final class c<T1, T2, T3, R> implements h<com.iqoption.core.microservices.portfolio.response.a, List<? extends com.iqoption.core.data.c.a>, List<? extends com.iqoption.core.microservices.tradingengine.response.active.a>, Triple<? extends com.iqoption.core.microservices.portfolio.response.a, ? extends List<? extends com.iqoption.core.data.c.a>, ? extends List<? extends com.iqoption.core.microservices.tradingengine.response.active.a>>> {
        public static final c dYW = new c();

        c() {
        }

        /* renamed from: b */
        public final Triple<com.iqoption.core.microservices.portfolio.response.a, List<com.iqoption.core.data.c.a>, List<com.iqoption.core.microservices.tradingengine.response.active.a>> a(com.iqoption.core.microservices.portfolio.response.a aVar, List<com.iqoption.core.data.c.a> list, List<? extends com.iqoption.core.microservices.tradingengine.response.active.a> list2) {
            kotlin.jvm.internal.i.f(aVar, "history");
            kotlin.jvm.internal.i.f(list, "balances");
            kotlin.jvm.internal.i.f(list2, "actives");
            return new Triple(aVar, list, list2);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012J\u0010\u0002\u001aF\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0005 \b*\"\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, bng = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Triple;", "Lcom/iqoption/core/microservices/portfolio/response/HistoryPositions;", "", "Lcom/iqoption/core/data/mediators/BalanceData;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TradingHistoryListViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<Triple<? extends com.iqoption.core.microservices.portfolio.response.a, ? extends List<? extends com.iqoption.core.data.c.a>, ? extends List<? extends com.iqoption.core.microservices.tradingengine.response.active.a>>> {
        final /* synthetic */ l dYX;

        d(l lVar) {
            this.dYX = lVar;
        }

        /* renamed from: a */
        public final void accept(Triple<com.iqoption.core.microservices.portfolio.response.a, ? extends List<com.iqoption.core.data.c.a>, ? extends List<? extends com.iqoption.core.microservices.tradingengine.response.active.a>> triple) {
            List list = (List) triple.bnk();
            this.dYX.a((com.iqoption.core.microservices.portfolio.response.a) triple.bnj(), (List) triple.bnm(), list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TradingHistoryListViewModel.kt */
    static final class e<T> implements io.reactivex.b.f<Throwable> {
        public static final e dYY = new e();

        e() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, bng = {"<anonymous>", "Lkotlin/Pair;", "Lcom/iqoption/tradinghistory/TradingHistoryFilters;", "", "filter", "offset", "apply", "(Lcom/iqoption/tradinghistory/TradingHistoryFilters;Ljava/lang/Integer;)Lkotlin/Pair;"})
    /* compiled from: TradingHistoryListViewModel.kt */
    static final class f<T1, T2, R> implements io.reactivex.b.c<com.iqoption.tradinghistory.h, Integer, Pair<? extends com.iqoption.tradinghistory.h, ? extends Integer>> {
        public static final f dYZ = new f();

        f() {
        }

        /* renamed from: a */
        public final Pair<com.iqoption.tradinghistory.h, Integer> apply(com.iqoption.tradinghistory.h hVar, Integer num) {
            kotlin.jvm.internal.i.f(hVar, "filter");
            kotlin.jvm.internal.i.f(num, "offset");
            return new Pair(hVar, num);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/portfolio/response/HistoryPositions;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/iqoption/tradinghistory/TradingHistoryFilters;", "", "apply"})
    /* compiled from: TradingHistoryListViewModel.kt */
    static final class g<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        public static final g dZa = new g();

        g() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x004f  */
        /* renamed from: k */
        public final io.reactivex.p<com.iqoption.core.microservices.portfolio.response.a> apply(kotlin.Pair<com.iqoption.tradinghistory.h, java.lang.Integer> r15) {
            /*
            r14 = this;
            r0 = "<name for destructuring parameter 0>";
            kotlin.jvm.internal.i.f(r15, r0);
            r0 = r15.bnj();
            r0 = (com.iqoption.tradinghistory.h) r0;
            r15 = r15.bnk();
            r15 = (java.lang.Number) r15;
            r7 = r15.intValue();
            r15 = r0.aVo();
            r1 = r0.aVm();
            r1 = r1.aVl();
            r2 = r0.VL();
            r4 = r2.getId();
            r0 = r0.aVn();
            r8 = r0.aVf();
            r0 = r15.aVh();
            r2 = 0;
            if (r0 == 0) goto L_0x0048;
        L_0x0038:
            r0 = r0.getDate();
            if (r0 == 0) goto L_0x0048;
        L_0x003e:
            r9 = r0.getTime();
            r0 = java.lang.Long.valueOf(r9);
            r9 = r0;
            goto L_0x0049;
        L_0x0048:
            r9 = r2;
        L_0x0049:
            r15 = r15.aVi();
            if (r15 == 0) goto L_0x005f;
        L_0x004f:
            r15 = r15.getDate();
            if (r15 == 0) goto L_0x005f;
        L_0x0055:
            r2 = r15.getTime();
            r15 = java.lang.Long.valueOf(r2);
            r10 = r15;
            goto L_0x0060;
        L_0x005f:
            r10 = r2;
        L_0x0060:
            r11 = 0;
            r12 = 266; // 0x10a float:3.73E-43 double:1.314E-321;
            r13 = 0;
            r2 = 0;
            r6 = 0;
            r15 = com.iqoption.core.microservices.portfolio.a.a(r1, r2, r4, r6, r7, r8, r9, r10, r11, r12, r13);
            r0 = com.iqoption.core.rx.i.aki();
            r15 = r15.h(r0);
            return r15;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.list.l$g.apply(kotlin.Pair):io.reactivex.p");
        }
    }

    public l() {
        io.reactivex.processors.a bmJ = BehaviorProcessor.bmG().bmJ();
        kotlin.jvm.internal.i.e(bmJ, "BehaviorProcessor.create<Int>().toSerialized()");
        this.dYR = bmJ;
    }

    static {
        String name = l.class.getName();
        kotlin.jvm.internal.i.e(name, "TradingHistoryViewModel::class.java.name");
        TAG = name;
    }

    public final LiveData<j> Bo() {
        return this.apC;
    }

    public final LiveData<Boolean> aJl() {
        return this.dsB;
    }

    public final void init() {
        this.dYS.setValue(Boolean.valueOf(true));
        io.reactivex.disposables.b a = io.reactivex.e.a((org.a.b) aWj(), (org.a.b) com.iqoption.core.data.c.b.bcS.VQ().bkV().bkO().d(com.iqoption.core.rx.i.aki()), (org.a.b) com.iqoption.asset.mediators.b.a(com.iqoption.asset.mediators.b.axN, null, 1, null).g(b.dYV).bkV().bkO().d(com.iqoption.core.rx.i.aki()), (h) c.dYW).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new d(this), (io.reactivex.b.f) e.dYY);
        kotlin.jvm.internal.i.e(a, "Flowable.combineLatest(\n…      \n                })");
        b(a);
    }

    private final io.reactivex.e<com.iqoption.core.microservices.portfolio.response.a> aWj() {
        com.iqoption.tradinghistory.i iVar = this.dXw;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        io.reactivex.e f = io.reactivex.e.a((org.a.b) iVar.aVp(), (org.a.b) this.dYR, (io.reactivex.b.c) f.dYZ).c(com.iqoption.core.rx.i.aki()).bkT().f((io.reactivex.b.g) g.dZa);
        kotlin.jvm.internal.i.e(f, "Flowable.combineLatest(\n…eOn(bg)\n                }");
        return f;
    }

    private final void a(com.iqoption.core.microservices.portfolio.response.a aVar, List<? extends com.iqoption.core.microservices.tradingengine.response.active.a> list, List<com.iqoption.core.data.c.a> list2) {
        int offset = aVar.getOffset();
        List arrayList = new ArrayList();
        if (offset == 0) {
            this.dYT.clear();
        }
        this.dYT.addAll(aVar.agl());
        Map linkedHashMap = new LinkedHashMap();
        for (Object next : this.dYT) {
            String cm = cm(((PortfolioPosition) next).getCloseTime());
            ArrayList arrayList2 = linkedHashMap.get(cm);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(cm, arrayList2);
            }
            arrayList2.add(next);
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            Iterator it2;
            Map map;
            String str = (String) it.next();
            arrayList.add(new d(str));
            List list3 = (List) linkedHashMap.get(str);
            if (list3 != null) {
                Iterable<PortfolioPosition> iterable = list3;
                Collection arrayList3 = new ArrayList(n.e(iterable, 10));
                for (PortfolioPosition portfolioPosition : iterable) {
                    Object obj;
                    for (Object next2 : list) {
                        if (((com.iqoption.core.microservices.tradingengine.response.active.a) next2).getActiveId() == portfolioPosition.getActiveId()) {
                            obj = 1;
                            continue;
                        } else {
                            obj = null;
                            continue;
                        }
                        if (obj != null) {
                            break;
                        }
                    }
                    Object next22 = null;
                    com.iqoption.core.microservices.tradingengine.response.active.a aVar2 = (com.iqoption.core.microservices.tradingengine.response.active.a) next22;
                    for (Object obj2 : list2) {
                        Object obj3;
                        if (((com.iqoption.core.data.c.a) obj2).VL().getId() == portfolioPosition.getUserBalanceId()) {
                            obj3 = 1;
                            continue;
                        } else {
                            obj3 = null;
                            continue;
                        }
                        if (obj3 != null) {
                            break;
                        }
                    }
                    obj2 = null;
                    com.iqoption.core.data.c.a aVar3 = (com.iqoption.core.data.c.a) obj2;
                    it2 = it;
                    map = linkedHashMap;
                    g gVar = r10;
                    g gVar2 = new g(portfolioPosition.getId(), aVar2 != null ? aVar2.getImage() : null, aVar2 != null ? com.iqoption.core.microservices.tradingengine.response.active.d.B(aVar2) : null, com.iqoption.core.g.C(portfolioPosition.getInstrumentType()), a(aVar3 != null ? aVar3.VM() : null, portfolioPosition.agr() - portfolioPosition.getInvest()), h(portfolioPosition.getInvest(), portfolioPosition.agr() - portfolioPosition.getInvest()), portfolioPosition.agr() - portfolioPosition.getInvest() >= ((double) 0), portfolioPosition);
                    arrayList3.add(gVar);
                    linkedHashMap = map;
                    it = it2;
                }
                it2 = it;
                map = linkedHashMap;
                arrayList.addAll((List) arrayList3);
            } else {
                it2 = it;
                map = linkedHashMap;
            }
            linkedHashMap = map;
            it = it2;
        }
        j jVar = new j(arrayList, offset, this.dYT.size(), aVar.agl().size() == 100);
        this.dYS.postValue(Boolean.valueOf(false));
        this.apB.postValue(jVar);
    }

    public final void hf(int i) {
        this.dYR.onNext(Integer.valueOf(i));
    }

    private final String cm(long j) {
        return cn(j) ? com.iqoption.core.d.getString(com.iqoption.tradinghistory.g.f.today) : co(j);
    }

    private final boolean cn(long j) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j * ((long) 1000));
        if (instance.get(6) == instance2.get(6) && instance.get(1) == instance2.get(1)) {
            return true;
        }
        return false;
    }

    private final String co(long j) {
        String format = new SimpleDateFormat("dd MMMM", Locale.getDefault()).format(new Date(j));
        kotlin.jvm.internal.i.e(format, "SimpleDateFormat(\"dd MMM…).format(Date(timestamp))");
        return format;
    }

    private final String a(com.iqoption.core.microservices.configuration.a.d dVar, double d) {
        StringBuilder stringBuilder = new StringBuilder();
        double d2 = (double) 0;
        String str = d > d2 ? "+" : d < d2 ? "-" : "";
        stringBuilder.append(str);
        BigDecimal valueOf = BigDecimal.valueOf(Math.abs(d));
        kotlin.jvm.internal.i.e(valueOf, "BigDecimal.valueOf(abs(amount))");
        stringBuilder.append(com.iqoption.core.util.e.a(valueOf, dVar != null ? dVar.getMinorUnits() : 2, dVar != null ? dVar.getMask() : null, false, false, null, 28, null));
        return stringBuilder.toString();
    }

    private final String h(double d, double d2) {
        double d3 = 0.0d;
        if (d != 0.0d) {
            d3 = (Math.abs(d2) * 100.0d) / d;
        }
        StringBuilder stringBuilder = new StringBuilder();
        double d4 = (double) 0;
        String str = d2 > d4 ? "+" : d2 < d4 ? "-" : "";
        stringBuilder.append(str);
        BigDecimal valueOf = BigDecimal.valueOf(d3);
        kotlin.jvm.internal.i.e(valueOf, "BigDecimal.valueOf(percent)");
        stringBuilder.append(com.iqoption.core.util.e.a(valueOf, 0, null, false, false, null, 31, null));
        stringBuilder.append('%');
        return stringBuilder.toString();
    }
}
