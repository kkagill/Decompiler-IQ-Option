package com.iqoption.earningscalendar;

import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.marketanalysis.LoadingDirection;
import com.iqoption.core.util.TimeUtil;
import io.reactivex.p;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 <2\u00020\u0001:\u0002<=B\u0005¢\u0006\u0002\u0010\u0002J$\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0!H\u0002J\u000e\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u001bJ\u000e\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u001bJ?\u0010*\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0!0,0+2\b\u0010.\u001a\u0004\u0018\u00010\u00052\u0006\u0010(\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u0005H\u0002¢\u0006\u0002\u00100J\u0006\u00101\u001a\u000202J\u0010\u00103\u001a\u0002022\u0006\u0010(\u001a\u00020\u001bH\u0007J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020$0+2\b\u0010.\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u00105J\u000e\u00106\u001a\u0002022\u0006\u00107\u001a\u000208J\b\u00109\u001a\u000202H\u0014J\b\u0010:\u001a\u000202H\u0002J\u0010\u0010;\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001bH\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0004¢\u0006\u0002\n\u0000R+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, bng = {"Lcom/iqoption/earningscalendar/EarningsCalendarViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "downPageRequests", "Lio/reactivex/processors/BehaviorProcessor;", "", "kotlin.jvm.PlatformType", "earningsCalendarAdapterData", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/earningscalendar/EarningsAdapterData;", "getEarningsCalendarAdapterData", "()Landroidx/lifecycle/LiveData;", "earningsCalendarAdapterLiveData", "Landroidx/lifecycle/MutableLiveData;", "<set-?>", "", "filterByCurrentActive", "getFilterByCurrentActive", "()Z", "setFilterByCurrentActive", "(Z)V", "filterByCurrentActive$delegate", "Lkotlin/properties/ReadWriteProperty;", "loadDataDisposable", "Lio/reactivex/disposables/Disposable;", "loadingStates", "", "Lcom/iqoption/core/marketanalysis/LoadingDirection;", "Lcom/iqoption/core/marketanalysis/LoadingState;", "marketAnalysisViewModel", "Lcom/iqoption/core/marketanalysis/MarketAnalysisViewModel;", "upPageRequests", "composeAdapterItems", "", "Lcom/iqoption/earningscalendar/EarningsCalendarAdapterItem;", "it", "Lcom/iqoption/earningscalendar/EarningsCalendarViewModel$State;", "actives", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "hasMore", "direction", "isLoading", "loadByPage", "Lio/reactivex/Flowable;", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;", "activeId", "offset", "(Ljava/lang/Integer;Lcom/iqoption/core/marketanalysis/LoadingDirection;I)Lio/reactivex/Flowable;", "loadData", "", "loadNextPage", "makeStream", "(Ljava/lang/Integer;)Lio/reactivex/Flowable;", "onActiveClicked", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveIdentifier;", "onCleared", "showLoading", "state", "Companion", "State", "earningscalendar_release"})
/* compiled from: EarningsCalendarViewModel.kt */
public final class k extends com.iqoption.core.ui.f.d {
    private static final String TAG = k.class.getName();
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{kotlin.jvm.internal.k.a(new MutablePropertyReference1Impl(kotlin.jvm.internal.k.G(k.class), "filterByCurrentActive", "getFilterByCurrentActive()Z"))};
    public static final a cNz = new a();
    private com.iqoption.core.marketanalysis.f cNr;
    private final BehaviorProcessor<Integer> cNs;
    private final BehaviorProcessor<Integer> cNt;
    private final MutableLiveData<c> cNu = new MutableLiveData();
    private final LiveData<c> cNv = this.cNu;
    private final kotlin.f.d cNw = kotlin.f.a.eWg.bnQ();
    private final Map<LoadingDirection, com.iqoption.core.marketanalysis.d> cNx = af.a(kotlin.j.x(LoadingDirection.UP, new com.iqoption.core.marketanalysis.d(-100)), kotlin.j.x(LoadingDirection.DOWN, new com.iqoption.core.marketanalysis.d(0)));
    private io.reactivex.disposables.b cNy;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/earningscalendar/EarningsCalendarViewModel$Companion;", "", "()V", "PAGE_LIMIT", "", "START_OFFSET_DOWN", "START_OFFSET_UP", "TAG", "", "kotlin.jvm.PlatformType", "formatDateDay", "date", "", "get", "Lcom/iqoption/earningscalendar/EarningsCalendarViewModel;", "f", "Landroidx/fragment/app/Fragment;", "filterByCurrentActive", "", "earningscalendar_release"})
    /* compiled from: EarningsCalendarViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        private final String bC(long j) {
            j *= 1000;
            if (com.iqoption.core.ext.c.aP(j)) {
                return com.iqoption.core.d.getString(com.iqoption.earningscalendar.o.d.today);
            }
            String format = TimeUtil.bRM.anL().format(Long.valueOf(j));
            kotlin.jvm.internal.i.e(format, "TimeUtil.dateMonthFormat.format(dateMillis)");
            return format;
        }

        public final k c(Fragment fragment, boolean z) {
            kotlin.jvm.internal.i.f(fragment, "f");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(k.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(f)…darViewModel::class.java]");
            k kVar = (k) viewModel;
            kVar.cNr = com.iqoption.core.marketanalysis.f.blw.k(com.iqoption.core.ext.a.r(fragment));
            kVar.df(z);
            return kVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u001c\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, bng = {"Lcom/iqoption/earningscalendar/EarningsCalendarViewModel$State;", "", "list", "", "Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;", "lastDirection", "Lcom/iqoption/core/marketanalysis/LoadingDirection;", "centralItem", "(Ljava/util/List;Lcom/iqoption/core/marketanalysis/LoadingDirection;Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;)V", "getCentralItem", "()Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;", "getLastDirection", "()Lcom/iqoption/core/marketanalysis/LoadingDirection;", "setLastDirection", "(Lcom/iqoption/core/marketanalysis/LoadingDirection;)V", "getList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "onNewPage", "direction", "items", "toString", "", "earningscalendar_release"})
    /* compiled from: EarningsCalendarViewModel.kt */
    public static final class b {
        private final List<com.iqoption.core.microservices.a.a.b> aEg;
        private volatile LoadingDirection cNA;
        private final com.iqoption.core.microservices.a.a.b cNB;

        public b() {
            this(null, null, null, 7, null);
        }

        public final b a(List<com.iqoption.core.microservices.a.a.b> list, LoadingDirection loadingDirection, com.iqoption.core.microservices.a.a.b bVar) {
            kotlin.jvm.internal.i.f(list, "list");
            return new b(list, loadingDirection, bVar);
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.cNB, r3.cNB) != false) goto L_0x0029;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.earningscalendar.k.b;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (com.iqoption.earningscalendar.k.b) r3;
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
            r0 = r2.cNB;
            r3 = r3.cNB;
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
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.earningscalendar.k$b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            List list = this.aEg;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            LoadingDirection loadingDirection = this.cNA;
            hashCode = (hashCode + (loadingDirection != null ? loadingDirection.hashCode() : 0)) * 31;
            com.iqoption.core.microservices.a.a.b bVar = this.cNB;
            if (bVar != null) {
                i = bVar.hashCode();
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
            stringBuilder.append(this.cNB);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public b(List<com.iqoption.core.microservices.a.a.b> list, LoadingDirection loadingDirection, com.iqoption.core.microservices.a.a.b bVar) {
            kotlin.jvm.internal.i.f(list, "list");
            this.aEg = list;
            this.cNA = loadingDirection;
            this.cNB = bVar;
        }

        public /* synthetic */ b(List list, LoadingDirection loadingDirection, com.iqoption.core.microservices.a.a.b bVar, int i, f fVar) {
            if ((i & 1) != 0) {
                list = m.emptyList();
            }
            if ((i & 2) != 0) {
                loadingDirection = (LoadingDirection) null;
            }
            if ((i & 4) != 0) {
                bVar = (com.iqoption.core.microservices.a.a.b) null;
            }
            this(list, loadingDirection, bVar);
        }

        public final List<com.iqoption.core.microservices.a.a.b> ava() {
            return this.aEg;
        }

        public final LoadingDirection avb() {
            return this.cNA;
        }

        public final com.iqoption.core.microservices.a.a.b avc() {
            return this.cNB;
        }

        public final b a(LoadingDirection loadingDirection, List<com.iqoption.core.microservices.a.a.b> list) {
            com.iqoption.core.microservices.a.a.b bVar;
            kotlin.jvm.internal.i.f(loadingDirection, "direction");
            kotlin.jvm.internal.i.f(list, "items");
            if (this.cNB == null && loadingDirection == LoadingDirection.DOWN) {
                bVar = (com.iqoption.core.microservices.a.a.b) u.bV(list);
            } else {
                bVar = this.cNB;
            }
            if (loadingDirection == LoadingDirection.UP) {
                return a(u.b((Collection) list, (Iterable) this.aEg), loadingDirection, bVar);
            }
            return a(u.b((Collection) this.aEg, (Iterable) list), loadingDirection, bVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lkotlin/Pair;", "Lcom/iqoption/core/marketanalysis/LoadingDirection;", "", "Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;", "it", "Lcom/iqoption/core/microservices/earningscalendar/response/CalendarEarningEventResult;", "apply"})
    /* compiled from: EarningsCalendarViewModel.kt */
    static final class c<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ LoadingDirection $direction;
        final /* synthetic */ k cNC;

        c(k kVar, LoadingDirection loadingDirection) {
            this.cNC = kVar;
            this.$direction = loadingDirection;
        }

        /* renamed from: a */
        public final Pair<LoadingDirection, List<com.iqoption.core.microservices.a.a.b>> apply(com.iqoption.core.microservices.a.a.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            if (aVar.getEvents().size() < 100) {
                this.cNC.b(this.$direction).YS().set(false);
            }
            return new Pair(this.$direction, aVar.getEvents());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: EarningsCalendarViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ LoadingDirection $direction;
        final /* synthetic */ k cNC;

        d(k kVar, LoadingDirection loadingDirection) {
            this.cNC = kVar;
            this.$direction = loadingDirection;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.cNC.b(this.$direction).YT().getAndAdd(-100);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/earningscalendar/EarningsCalendarViewModel$State;", "test"})
    /* compiled from: EarningsCalendarViewModel.kt */
    static final class e<T> implements io.reactivex.b.l<b> {
        public static final e cND = new e();

        e() {
        }

        /* renamed from: a */
        public final boolean test(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return bVar.avc() != null || bVar.ava().isEmpty();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lkotlin/Pair;", "Lcom/iqoption/earningscalendar/EarningsAdapterData;", "Lcom/iqoption/earningscalendar/EarningsCalendarViewModel$State;", "kotlin.jvm.PlatformType", "state", "apply"})
    /* compiled from: EarningsCalendarViewModel.kt */
    static final class f<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ k cNC;

        f(k kVar) {
            this.cNC = kVar;
        }

        /* renamed from: b */
        public final p<Pair<c, b>> apply(final b bVar) {
            kotlin.jvm.internal.i.f(bVar, "state");
            return com.iqoption.asset.mediators.b.axN.a(new com.iqoption.asset.mediators.c(InstrumentType.CFD_INSTRUMENT, null, true, 2, null)).bkV().t(new io.reactivex.b.g<T, R>(this) {
                final /* synthetic */ f cNE;

                /* renamed from: aP */
                public final Pair<c, b> apply(List<com.iqoption.asset.mediators.a> list) {
                    kotlin.jvm.internal.i.f(list, "actives");
                    k kVar = this.cNE.cNC;
                    b bVar = bVar;
                    kotlin.jvm.internal.i.e(bVar, "state");
                    return new Pair(new c(kVar.a(bVar, (List) list), bVar.avc(), bVar.ava().isEmpty() ^ 1), bVar);
                }
            });
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/iqoption/earningscalendar/EarningsAdapterData;", "Lcom/iqoption/earningscalendar/EarningsCalendarViewModel$State;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: EarningsCalendarViewModel.kt */
    static final class g<T> implements io.reactivex.b.f<Pair<? extends c, ? extends b>> {
        final /* synthetic */ k cNC;

        g(k kVar) {
            this.cNC = kVar;
        }

        /* renamed from: c */
        public final void accept(Pair<c, b> pair) {
            c cVar = (c) pair.bnj();
            b bVar = (b) pair.bnk();
            if (this.cNC.cNt.hasValue()) {
                this.cNC.cNu.setValue(cVar);
            } else {
                this.cNC.cNt.onNext(Integer.valueOf(0));
                this.cNC.b(LoadingDirection.UP).YR().set(false);
            }
            LoadingDirection avb = bVar.avb();
            if (avb != null) {
                this.cNC.b(avb).YR().set(false);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: EarningsCalendarViewModel.kt */
    static final class h<T> implements io.reactivex.b.f<Throwable> {
        public static final h cNG = new h();

        h() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/earningscalendar/EarningsCalendarViewModel$State;", "it", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "apply"})
    /* compiled from: EarningsCalendarViewModel.kt */
    static final class i<T, R> implements io.reactivex.b.g<T, org.a.b<? extends R>> {
        final /* synthetic */ k cNC;

        i(k kVar) {
            this.cNC = kVar;
        }

        /* renamed from: D */
        public final io.reactivex.e<b> apply(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return this.cNC.j(Integer.valueOf(aVar.getActiveId()));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/earningscalendar/EarningsCalendarViewModel$State;", "old", "mutator", "Lkotlin/Function1;", "apply"})
    /* compiled from: EarningsCalendarViewModel.kt */
    static final class j<T1, T2, R> implements io.reactivex.b.c<R, T, R> {
        public static final j cNH = new j();

        j() {
        }

        /* renamed from: a */
        public final b apply(b bVar, kotlin.jvm.a.b<? super b, b> bVar2) {
            kotlin.jvm.internal.i.f(bVar, "old");
            kotlin.jvm.internal.i.f(bVar2, "mutator");
            return (b) bVar2.invoke(bVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lkotlin/Pair;", "Lcom/iqoption/core/marketanalysis/LoadingDirection;", "", "Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;", "offset", "", "apply", "(Ljava/lang/Integer;)Lio/reactivex/Flowable;"})
    /* compiled from: EarningsCalendarViewModel.kt */
    static final class k<T, R> implements io.reactivex.b.g<T, org.a.b<? extends R>> {
        final /* synthetic */ k cNC;
        final /* synthetic */ Integer cNI;

        k(k kVar, Integer num) {
            this.cNC = kVar;
            this.cNI = num;
        }

        /* renamed from: d */
        public final io.reactivex.e<Pair<LoadingDirection, List<com.iqoption.core.microservices.a.a.b>>> apply(Integer num) {
            kotlin.jvm.internal.i.f(num, "offset");
            return this.cNC.a(this.cNI, LoadingDirection.UP, num.intValue());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lkotlin/Pair;", "Lcom/iqoption/core/marketanalysis/LoadingDirection;", "", "Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;", "offset", "", "apply", "(Ljava/lang/Integer;)Lio/reactivex/Flowable;"})
    /* compiled from: EarningsCalendarViewModel.kt */
    static final class l<T, R> implements io.reactivex.b.g<T, org.a.b<? extends R>> {
        final /* synthetic */ k cNC;
        final /* synthetic */ Integer cNI;

        l(k kVar, Integer num) {
            this.cNC = kVar;
            this.cNI = num;
        }

        /* renamed from: d */
        public final io.reactivex.e<Pair<LoadingDirection, List<com.iqoption.core.microservices.a.a.b>>> apply(Integer num) {
            kotlin.jvm.internal.i.f(num, "offset");
            return this.cNC.a(this.cNI, LoadingDirection.DOWN, num.intValue());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lkotlin/Function1;", "Lcom/iqoption/earningscalendar/EarningsCalendarViewModel$State;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/iqoption/core/marketanalysis/LoadingDirection;", "", "Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;", "apply"})
    /* compiled from: EarningsCalendarViewModel.kt */
    static final class m<T, R> implements io.reactivex.b.g<T, R> {
        public static final m cNJ = new m();

        m() {
        }

        /* renamed from: d */
        public final kotlin.jvm.a.b<b, b> apply(Pair<? extends LoadingDirection, ? extends List<com.iqoption.core.microservices.a.a.b>> pair) {
            kotlin.jvm.internal.i.f(pair, "<name for destructuring parameter 0>");
            return new EarningsCalendarViewModel$makeStream$initial$3$1((LoadingDirection) pair.bnj(), (List) pair.bnk());
        }
    }

    private final boolean auV() {
        return ((Boolean) this.cNw.b(this, anY[0])).booleanValue();
    }

    private final void df(boolean z) {
        this.cNw.a(this, anY[0], Boolean.valueOf(z));
    }

    public k() {
        BehaviorProcessor bmG = BehaviorProcessor.bmG();
        String str = "BehaviorProcessor.create<Int>()";
        kotlin.jvm.internal.i.e(bmG, str);
        this.cNs = bmG;
        bmG = BehaviorProcessor.bmG();
        kotlin.jvm.internal.i.e(bmG, str);
        this.cNt = bmG;
        showLoading();
        b(LoadingDirection.UP).YR().set(true);
        b(LoadingDirection.DOWN).YR().set(true);
        this.cNs.onNext(Integer.valueOf(-100));
    }

    public final LiveData<c> auY() {
        return this.cNv;
    }

    private final void showLoading() {
        this.cNu.setValue(new c(l.listOf(n.cNL), null, false));
    }

    public final void auZ() {
        if (this.cNy == null) {
            io.reactivex.e k;
            if (auV()) {
                k = com.iqoption.core.marketanalysis.e.blj.YV().YU().k(new i(this));
            } else {
                k = j(null);
            }
            this.cNy = k.b((io.reactivex.b.l) e.cND).f((io.reactivex.b.g) new f(this)).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new g(this), (io.reactivex.b.f) h.cNG);
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

    private final List<e> a(b bVar, List<com.iqoption.asset.mediators.a> list) {
        if (bVar.ava().isEmpty()) {
            return l.listOf(m.cNK);
        }
        List arrayList = new ArrayList();
        Object obj = (String) null;
        Iterable<com.iqoption.asset.mediators.a> iterable = list;
        Collection arrayList2 = new ArrayList(n.e(iterable, 10));
        for (com.iqoption.asset.mediators.a aVar : iterable) {
            arrayList2.add(kotlin.j.x(aVar.getId(), aVar));
        }
        Map ac = af.ac((List) arrayList2);
        for (com.iqoption.core.microservices.a.a.b bVar2 : bVar.ava()) {
            String a = cNz.bC(bVar2.getDate());
            if ((kotlin.jvm.internal.i.y(obj, a) ^ 1) != 0) {
                arrayList.add(new j(a));
                obj = a;
            }
            Integer adm = bVar2.adm();
            arrayList.add(new h(bVar2, adm != null ? (com.iqoption.asset.mediators.a) ac.get(Integer.valueOf(adm.intValue())) : null));
        }
        return arrayList;
    }

    @MainThread
    public final void a(LoadingDirection loadingDirection) {
        kotlin.jvm.internal.i.f(loadingDirection, "direction");
        com.iqoption.core.marketanalysis.d b = b(loadingDirection);
        if (b.YS().get()) {
            int i = b.YT().get();
            int i2 = l.aob[loadingDirection.ordinal()];
            if (i2 == 1) {
                i -= 100;
            } else if (i2 == 2) {
                i += 100;
            }
            b(loadingDirection).YR().set(true);
            b.YT().set(i);
            int i3 = l.axg[loadingDirection.ordinal()];
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

    private final io.reactivex.e<Pair<LoadingDirection, List<com.iqoption.core.microservices.a.a.b>>> a(Integer num, LoadingDirection loadingDirection, int i) {
        io.reactivex.e cF = com.iqoption.core.microservices.a.a.bsD.a(i, 100, num).bkO().g(new c(this, loadingDirection)).b((io.reactivex.b.f) new d(this, loadingDirection)).cF(new Pair(loadingDirection, m.emptyList()));
        kotlin.jvm.internal.i.e(cF, "EarningsCalendarRequests…(direction, emptyList()))");
        return cF;
    }

    private final io.reactivex.e<b> j(Integer num) {
        io.reactivex.e g = this.cNs.c(com.iqoption.core.rx.i.aki()).b((io.reactivex.b.g) new k(this, num)).d((org.a.b) this.cNt.c(com.iqoption.core.rx.i.aki()).b((io.reactivex.b.g) new l(this, num))).g(m.cNJ);
        kotlin.jvm.internal.i.e(g, "upPageRequests.observeOn…age(direction, items) } }");
        g = g.a((Object) new b(null, null, null, 7, null), (io.reactivex.b.c) j.cNH);
        kotlin.jvm.internal.i.e(g, "initial.scan(State()) { …mutator -> mutator(old) }");
        return g;
    }

    public final void b(com.iqoption.core.microservices.tradingengine.response.active.f fVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.ACTIVE);
        com.iqoption.core.marketanalysis.f fVar2 = this.cNr;
        if (fVar2 == null) {
            kotlin.jvm.internal.i.lG("marketAnalysisViewModel");
        }
        fVar2.b(fVar);
    }
}
