package com.iqoption.forexcalendar;

import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.marketanalysis.LoadingDirection;
import com.iqoption.core.util.TimeUtil;
import io.reactivex.processors.BehaviorProcessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 92\u00020\u0001:\u00029:B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0002J\u000e\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001bJ\u000e\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001bJ?\u0010(\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0!0*0)2\b\u0010,\u001a\u0004\u0018\u00010\u00052\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010.J\u0006\u0010/\u001a\u000200J\u0010\u00101\u001a\u0002002\u0006\u0010&\u001a\u00020\u001bH\u0007J\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020$0)2\b\u0010,\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u00103J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020+0)2\b\u0010,\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u00103J\u000e\u00105\u001a\u0002002\u0006\u00106\u001a\u00020+J\b\u00107\u001a\u000200H\u0014J\u0010\u00108\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001bH\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8B@BX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, bng = {"Lcom/iqoption/forexcalendar/ForexCalendarViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "downPageRequests", "Lio/reactivex/processors/BehaviorProcessor;", "", "kotlin.jvm.PlatformType", "<set-?>", "", "filterByCurrentActive", "getFilterByCurrentActive", "()Z", "setFilterByCurrentActive", "(Z)V", "filterByCurrentActive$delegate", "Lkotlin/properties/ReadWriteProperty;", "forexCalendarAdapterData", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/forexcalendar/ForexAdapterData;", "getForexCalendarAdapterData", "()Landroidx/lifecycle/LiveData;", "forexCalendarItemsData", "Landroidx/lifecycle/MutableLiveData;", "loadDataDisposable", "Lio/reactivex/disposables/Disposable;", "loadingStates", "", "Lcom/iqoption/core/marketanalysis/LoadingDirection;", "Lcom/iqoption/core/marketanalysis/LoadingState;", "marketAnalysisViewModel", "Lcom/iqoption/core/marketanalysis/MarketAnalysisViewModel;", "upPageRequests", "composeAdapterItems", "", "Lcom/iqoption/forexcalendar/ForexCalendarAdapterItem;", "it", "Lcom/iqoption/forexcalendar/ForexCalendarViewModel$State;", "hasMore", "direction", "isLoading", "loadByPage", "Lio/reactivex/Flowable;", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "activeId", "offset", "(Ljava/lang/Integer;Lcom/iqoption/core/marketanalysis/LoadingDirection;I)Lio/reactivex/Flowable;", "loadData", "", "loadNextPage", "makeStream", "(Ljava/lang/Integer;)Lio/reactivex/Flowable;", "observeUpdates", "onCalendarEventClicked", "event", "onCleared", "state", "Companion", "State", "forexcalendar_release"})
/* compiled from: ForexCalendarViewModel.kt */
public final class n extends com.iqoption.core.ui.f.d {
    private static final String TAG = n.class.getName();
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{kotlin.jvm.internal.k.a(new MutablePropertyReference1Impl(kotlin.jvm.internal.k.G(n.class), "filterByCurrentActive", "getFilterByCurrentActive()Z"))};
    private static final String cSP = com.iqoption.core.d.getString(com.iqoption.forexcalendar.r.f.today);
    public static final a cSQ = new a();
    private com.iqoption.core.marketanalysis.f cNr;
    private final BehaviorProcessor<Integer> cNs;
    private final BehaviorProcessor<Integer> cNt;
    private final kotlin.f.d cNw = kotlin.f.a.eWg.bnQ();
    private final Map<LoadingDirection, com.iqoption.core.marketanalysis.d> cNx = af.a(kotlin.j.x(LoadingDirection.UP, new com.iqoption.core.marketanalysis.d(-100)), kotlin.j.x(LoadingDirection.DOWN, new com.iqoption.core.marketanalysis.d(0)));
    private io.reactivex.disposables.b cNy;
    private final MutableLiveData<e> cSN = new MutableLiveData();
    private final LiveData<e> cSO = this.cSN;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/forexcalendar/ForexCalendarViewModel$Companion;", "", "()V", "PAGE_LIMIT", "", "START_OFFSET_DOWN", "START_OFFSET_UP", "TAG", "", "kotlin.jvm.PlatformType", "todayLabel", "formatDateDay", "date", "", "get", "Lcom/iqoption/forexcalendar/ForexCalendarViewModel;", "f", "Landroidx/fragment/app/Fragment;", "filterByCurrentActive", "", "forexcalendar_release"})
    /* compiled from: ForexCalendarViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        private final String bC(long j) {
            j *= 1000;
            if (com.iqoption.core.ext.c.aP(j)) {
                return n.cSP;
            }
            String format = TimeUtil.bRM.anL().format(Long.valueOf(j));
            kotlin.jvm.internal.i.e(format, "TimeUtil.dateMonthFormat.format(dateMillis)");
            return format;
        }

        public final n d(Fragment fragment, boolean z) {
            kotlin.jvm.internal.i.f(fragment, "f");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(n.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(f)…darViewModel::class.java]");
            n nVar = (n) viewModel;
            nVar.cNr = com.iqoption.core.marketanalysis.f.blw.k(com.iqoption.core.ext.a.r(fragment));
            nVar.df(z);
            return nVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004J\u001c\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, bng = {"Lcom/iqoption/forexcalendar/ForexCalendarViewModel$State;", "", "list", "", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "lastDirection", "Lcom/iqoption/core/marketanalysis/LoadingDirection;", "centralItem", "(Ljava/util/List;Lcom/iqoption/core/marketanalysis/LoadingDirection;Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;)V", "getCentralItem", "()Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "getLastDirection", "()Lcom/iqoption/core/marketanalysis/LoadingDirection;", "setLastDirection", "(Lcom/iqoption/core/marketanalysis/LoadingDirection;)V", "getList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "onItemChanged", "item", "onNewPage", "direction", "items", "toString", "", "forexcalendar_release"})
    /* compiled from: ForexCalendarViewModel.kt */
    public static final class b {
        private final List<com.iqoption.core.microservices.b.a.a> aEg;
        private volatile LoadingDirection cNA;
        private final com.iqoption.core.microservices.b.a.a cSR;

        public b() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ b a(b bVar, List list, LoadingDirection loadingDirection, com.iqoption.core.microservices.b.a.a aVar, int i, Object obj) {
            if ((i & 1) != 0) {
                list = bVar.aEg;
            }
            if ((i & 2) != 0) {
                loadingDirection = bVar.cNA;
            }
            if ((i & 4) != 0) {
                aVar = bVar.cSR;
            }
            return bVar.a(list, loadingDirection, aVar);
        }

        public final b a(List<com.iqoption.core.microservices.b.a.a> list, LoadingDirection loadingDirection, com.iqoption.core.microservices.b.a.a aVar) {
            kotlin.jvm.internal.i.f(list, "list");
            return new b(list, loadingDirection, aVar);
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.cSR, r3.cSR) != false) goto L_0x0029;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.forexcalendar.n.b;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (com.iqoption.forexcalendar.n.b) r3;
            r0 = r2.aEg;
            r1 = r3.aEg;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.cNA;
            r1 = r3.cNA;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.cSR;
            r3 = r3.cSR;
            r3 = kotlin.jvm.internal.i.y(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.forexcalendar.n$b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            List list = this.aEg;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            LoadingDirection loadingDirection = this.cNA;
            hashCode = (hashCode + (loadingDirection != null ? loadingDirection.hashCode() : 0)) * 31;
            com.iqoption.core.microservices.b.a.a aVar = this.cSR;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("State(list=");
            stringBuilder.append(this.aEg);
            stringBuilder.append(", lastDirection=");
            stringBuilder.append(this.cNA);
            stringBuilder.append(", centralItem=");
            stringBuilder.append(this.cSR);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public b(List<com.iqoption.core.microservices.b.a.a> list, LoadingDirection loadingDirection, com.iqoption.core.microservices.b.a.a aVar) {
            kotlin.jvm.internal.i.f(list, "list");
            this.aEg = list;
            this.cNA = loadingDirection;
            this.cSR = aVar;
        }

        public /* synthetic */ b(List list, LoadingDirection loadingDirection, com.iqoption.core.microservices.b.a.a aVar, int i, f fVar) {
            if ((i & 1) != 0) {
                list = m.emptyList();
            }
            if ((i & 2) != 0) {
                loadingDirection = (LoadingDirection) null;
            }
            if ((i & 4) != 0) {
                aVar = (com.iqoption.core.microservices.b.a.a) null;
            }
            this(list, loadingDirection, aVar);
        }

        public final List<com.iqoption.core.microservices.b.a.a> ava() {
            return this.aEg;
        }

        public final LoadingDirection avb() {
            return this.cNA;
        }

        public final com.iqoption.core.microservices.b.a.a awE() {
            return this.cSR;
        }

        public final b b(LoadingDirection loadingDirection, List<com.iqoption.core.microservices.b.a.a> list) {
            com.iqoption.core.microservices.b.a.a aVar;
            kotlin.jvm.internal.i.f(loadingDirection, "direction");
            kotlin.jvm.internal.i.f(list, "items");
            if (this.cSR == null && loadingDirection == LoadingDirection.DOWN) {
                aVar = (com.iqoption.core.microservices.b.a.a) u.bV(list);
            } else {
                aVar = this.cSR;
            }
            if (loadingDirection == LoadingDirection.UP) {
                return a(u.b((Collection) list, (Iterable) this.aEg), loadingDirection, aVar);
            }
            return a(u.b((Collection) this.aEg, (Iterable) list), loadingDirection, aVar);
        }

        public final b c(com.iqoption.core.microservices.b.a.a aVar) {
            List a;
            kotlin.jvm.internal.i.f(aVar, "item");
            int i = 0;
            for (com.iqoption.core.microservices.b.a.a id : this.aEg) {
                if ((id.getId() == aVar.getId() ? 1 : null) != null) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i >= 0) {
                a = com.iqoption.core.ext.c.a(this.aEg, i, (Object) aVar);
            } else {
                a = com.iqoption.core.ext.c.a(this.aEg, (Object) aVar, 0);
            }
            return a(this, a, null, null, 6, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lkotlin/Pair;", "Lcom/iqoption/core/marketanalysis/LoadingDirection;", "", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "it", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEventResult;", "apply"})
    /* compiled from: ForexCalendarViewModel.kt */
    static final class c<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ LoadingDirection $direction;
        final /* synthetic */ n cSS;

        c(n nVar, LoadingDirection loadingDirection) {
            this.cSS = nVar;
            this.$direction = loadingDirection;
        }

        /* renamed from: a */
        public final Pair<LoadingDirection, List<com.iqoption.core.microservices.b.a.a>> apply(com.iqoption.core.microservices.b.a.d dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            if (dVar.getEvents().size() < 100) {
                this.cSS.b(this.$direction).YS().set(false);
            }
            return new Pair(this.$direction, dVar.getEvents());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ForexCalendarViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ LoadingDirection $direction;
        final /* synthetic */ n cSS;

        d(n nVar, LoadingDirection loadingDirection) {
            this.cSS = nVar;
            this.$direction = loadingDirection;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.cSS.b(this.$direction).YT().getAndAdd(-100);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/forexcalendar/ForexCalendarViewModel$State;", "test"})
    /* compiled from: ForexCalendarViewModel.kt */
    static final class e<T> implements io.reactivex.b.l<b> {
        public static final e cST = new e();

        e() {
        }

        /* renamed from: b */
        public final boolean test(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return bVar.awE() != null || bVar.ava().isEmpty();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lkotlin/Pair;", "Lcom/iqoption/forexcalendar/ForexAdapterData;", "Lcom/iqoption/forexcalendar/ForexCalendarViewModel$State;", "state", "apply"})
    /* compiled from: ForexCalendarViewModel.kt */
    static final class f<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ n cSS;

        f(n nVar) {
            this.cSS = nVar;
        }

        /* renamed from: c */
        public final Pair<e, b> apply(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "state");
            return new Pair(new e(this.cSS.a(bVar), bVar.awE(), bVar.ava().isEmpty() ^ 1), bVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/iqoption/forexcalendar/ForexAdapterData;", "Lcom/iqoption/forexcalendar/ForexCalendarViewModel$State;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ForexCalendarViewModel.kt */
    static final class g<T> implements io.reactivex.b.f<Pair<? extends e, ? extends b>> {
        final /* synthetic */ n cSS;

        g(n nVar) {
            this.cSS = nVar;
        }

        /* renamed from: c */
        public final void accept(Pair<e, b> pair) {
            e eVar = (e) pair.bnj();
            b bVar = (b) pair.bnk();
            if (this.cSS.cNt.hasValue()) {
                this.cSS.cSN.setValue(eVar);
            } else {
                this.cSS.cNt.onNext(Integer.valueOf(0));
                this.cSS.b(LoadingDirection.UP).YR().set(false);
            }
            LoadingDirection avb = bVar.avb();
            if (avb != null) {
                this.cSS.b(avb).YR().set(false);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ForexCalendarViewModel.kt */
    static final class h<T> implements io.reactivex.b.f<Throwable> {
        public static final h cSU = new h();

        h() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/forexcalendar/ForexCalendarViewModel$State;", "it", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "apply"})
    /* compiled from: ForexCalendarViewModel.kt */
    static final class i<T, R> implements io.reactivex.b.g<T, org.a.b<? extends R>> {
        final /* synthetic */ n cSS;

        i(n nVar) {
            this.cSS = nVar;
        }

        /* renamed from: D */
        public final io.reactivex.e<b> apply(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return this.cSS.j(Integer.valueOf(aVar.getActiveId()));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/forexcalendar/ForexCalendarViewModel$State;", "old", "mutator", "Lkotlin/Function1;", "apply"})
    /* compiled from: ForexCalendarViewModel.kt */
    static final class j<T1, T2, R> implements io.reactivex.b.c<R, T, R> {
        public static final j cSV = new j();

        j() {
        }

        /* renamed from: a */
        public final b apply(b bVar, kotlin.jvm.a.b<? super b, b> bVar2) {
            kotlin.jvm.internal.i.f(bVar, "old");
            kotlin.jvm.internal.i.f(bVar2, "mutator");
            return (b) bVar2.invoke(bVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lkotlin/Pair;", "Lcom/iqoption/core/marketanalysis/LoadingDirection;", "", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "offset", "", "apply", "(Ljava/lang/Integer;)Lio/reactivex/Flowable;"})
    /* compiled from: ForexCalendarViewModel.kt */
    static final class k<T, R> implements io.reactivex.b.g<T, org.a.b<? extends R>> {
        final /* synthetic */ Integer cNI;
        final /* synthetic */ n cSS;

        k(n nVar, Integer num) {
            this.cSS = nVar;
            this.cNI = num;
        }

        /* renamed from: d */
        public final io.reactivex.e<Pair<LoadingDirection, List<com.iqoption.core.microservices.b.a.a>>> apply(Integer num) {
            kotlin.jvm.internal.i.f(num, "offset");
            return this.cSS.a(this.cNI, LoadingDirection.UP, num.intValue());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lkotlin/Pair;", "Lcom/iqoption/core/marketanalysis/LoadingDirection;", "", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "offset", "", "apply", "(Ljava/lang/Integer;)Lio/reactivex/Flowable;"})
    /* compiled from: ForexCalendarViewModel.kt */
    static final class l<T, R> implements io.reactivex.b.g<T, org.a.b<? extends R>> {
        final /* synthetic */ Integer cNI;
        final /* synthetic */ n cSS;

        l(n nVar, Integer num) {
            this.cSS = nVar;
            this.cNI = num;
        }

        /* renamed from: d */
        public final io.reactivex.e<Pair<LoadingDirection, List<com.iqoption.core.microservices.b.a.a>>> apply(Integer num) {
            kotlin.jvm.internal.i.f(num, "offset");
            return this.cSS.a(this.cNI, LoadingDirection.DOWN, num.intValue());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lkotlin/Function1;", "Lcom/iqoption/forexcalendar/ForexCalendarViewModel$State;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/iqoption/core/marketanalysis/LoadingDirection;", "", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "apply"})
    /* compiled from: ForexCalendarViewModel.kt */
    static final class m<T, R> implements io.reactivex.b.g<T, R> {
        public static final m cSW = new m();

        m() {
        }

        /* renamed from: d */
        public final kotlin.jvm.a.b<b, b> apply(Pair<? extends LoadingDirection, ? extends List<com.iqoption.core.microservices.b.a.a>> pair) {
            kotlin.jvm.internal.i.f(pair, "<name for destructuring parameter 0>");
            return new ForexCalendarViewModel$makeStream$initial$3$1((LoadingDirection) pair.bnj(), (List) pair.bnk());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lkotlin/Function1;", "Lcom/iqoption/forexcalendar/ForexCalendarViewModel$State;", "item", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "apply"})
    /* compiled from: ForexCalendarViewModel.kt */
    static final class n<T, R> implements io.reactivex.b.g<T, R> {
        public static final n cSX = new n();

        n() {
        }

        /* renamed from: d */
        public final kotlin.jvm.a.b<b, b> apply(com.iqoption.core.microservices.b.a.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "item");
            return new ForexCalendarViewModel$makeStream$updates$1$1(aVar);
        }
    }

    private final boolean auV() {
        return ((Boolean) this.cNw.b(this, anY[0])).booleanValue();
    }

    private final void df(boolean z) {
        this.cNw.a(this, anY[0], Boolean.valueOf(z));
    }

    public n() {
        BehaviorProcessor bmG = BehaviorProcessor.bmG();
        String str = "BehaviorProcessor.create<Int>()";
        kotlin.jvm.internal.i.e(bmG, str);
        this.cNs = bmG;
        bmG = BehaviorProcessor.bmG();
        kotlin.jvm.internal.i.e(bmG, str);
        this.cNt = bmG;
        this.cSN.setValue(new e(l.listOf(q.cSY), null, false));
        b(LoadingDirection.UP).YR().set(true);
        b(LoadingDirection.DOWN).YR().set(true);
        this.cNs.onNext(Integer.valueOf(-100));
    }

    public final LiveData<e> awC() {
        return this.cSO;
    }

    public final void auZ() {
        if (this.cNy == null) {
            io.reactivex.e k;
            if (auV()) {
                k = com.iqoption.core.marketanalysis.e.blj.YV().YU().k(new i(this));
            } else {
                k = j(null);
            }
            this.cNy = k.b((io.reactivex.b.l) e.cST).g(new f(this)).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new g(this), (io.reactivex.b.f) h.cSU);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        io.reactivex.disposables.b bVar = this.cNy;
        if (bVar != null) {
            bVar.dispose();
        }
        this.cNy = (io.reactivex.disposables.b) null;
        super.onCleared();
    }

    private final List<g> a(b bVar) {
        if (bVar.ava().isEmpty()) {
            return l.listOf(d.cSw);
        }
        List arrayList = new ArrayList();
        Object obj = (String) null;
        for (com.iqoption.core.microservices.b.a.a aVar : bVar.ava()) {
            String a = cSQ.bC(aVar.adv());
            if ((kotlin.jvm.internal.i.y(obj, a) ^ 1) != 0) {
                arrayList.add(new l(a));
                obj = a;
            }
            arrayList.add(new j(aVar));
        }
        return arrayList;
    }

    @MainThread
    public final void a(LoadingDirection loadingDirection) {
        kotlin.jvm.internal.i.f(loadingDirection, "direction");
        com.iqoption.core.marketanalysis.d b = b(loadingDirection);
        if (b.YS().get()) {
            int i = b.YT().get();
            int i2 = o.aob[loadingDirection.ordinal()];
            if (i2 == 1) {
                i -= 100;
            } else if (i2 == 2) {
                i += 100;
            }
            b(loadingDirection).YR().set(true);
            b.YT().set(i);
            int i3 = o.axg[loadingDirection.ordinal()];
            if (i3 == 1) {
                this.cNs.onNext(Integer.valueOf(i));
            } else if (i3 == 2) {
                this.cNt.onNext(Integer.valueOf(i));
            }
        }
    }

    private final com.iqoption.core.marketanalysis.d b(LoadingDirection loadingDirection) {
        Object obj = this.cNx.get(loadingDirection);
        if (obj == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return (com.iqoption.core.marketanalysis.d) obj;
    }

    public final boolean c(LoadingDirection loadingDirection) {
        kotlin.jvm.internal.i.f(loadingDirection, "direction");
        return b(loadingDirection).YR().get();
    }

    public final boolean d(LoadingDirection loadingDirection) {
        kotlin.jvm.internal.i.f(loadingDirection, "direction");
        return b(loadingDirection).YS().get();
    }

    private final io.reactivex.e<Pair<LoadingDirection, List<com.iqoption.core.microservices.b.a.a>>> a(Integer num, LoadingDirection loadingDirection, int i) {
        io.reactivex.e cF = com.iqoption.core.microservices.b.a.bsO.c(num != null ? l.listOf(Integer.valueOf(num.intValue())) : null, i, 100).bkO().g(new c(this, loadingDirection)).b((io.reactivex.b.f) new d(this, loadingDirection)).cF(new Pair(loadingDirection, m.emptyList()));
        kotlin.jvm.internal.i.e(cF, "EconomicCalendarRequests…(direction, emptyList()))");
        return cF;
    }

    private final io.reactivex.e<com.iqoption.core.microservices.b.a.a> k(Integer num) {
        return com.iqoption.core.microservices.b.a.bsO.aB(num != null ? l.listOf(Integer.valueOf(num.intValue())) : null);
    }

    private final io.reactivex.e<b> j(Integer num) {
        io.reactivex.e g = this.cNs.c(com.iqoption.core.rx.i.aki()).b((io.reactivex.b.g) new k(this, num)).d((org.a.b) this.cNt.c(com.iqoption.core.rx.i.aki()).b((io.reactivex.b.g) new l(this, num))).g(m.cSW);
        kotlin.jvm.internal.i.e(g, "upPageRequests.observeOn…age(direction, items) } }");
        io.reactivex.e g2 = k(num).g(n.cSX);
        kotlin.jvm.internal.i.e(g2, "observeUpdates(activeId)…e.onItemChanged(item) } }");
        g2 = io.reactivex.e.b((org.a.b) g, (org.a.b) g2).a((Object) new b(null, null, null, 7, null), (io.reactivex.b.c) j.cSV);
        kotlin.jvm.internal.i.e(g2, "Flowable.merge(initial, …mutator -> mutator(old) }");
        return g2;
    }

    public final void b(com.iqoption.core.microservices.b.a.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "event");
        com.iqoption.core.marketanalysis.f fVar = this.cNr;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("marketAnalysisViewModel");
        }
        fVar.b(aVar);
    }
}
