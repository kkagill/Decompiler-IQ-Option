package com.iqoption.fragment.c.b;

import androidx.annotation.WorkerThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.risks.response.overnightfee.OvernightDay;
import com.iqoption.core.microservices.tradingengine.response.active.m;
import com.iqoption.core.microservices.tradingengine.response.active.n;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.core.util.af;
import com.iqoption.x.R;
import io.reactivex.p;
import io.reactivex.q;
import io.reactivex.s;
import io.reactivex.t;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.TypeCastException;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 .2\u00020\u0001:\u0003./0B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001c\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010&\u001a\u00020$H\u0007J\u001c\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010(\u001a\u00020\u0014H\u0014J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001a\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00062\b\b\u0002\u0010,\u001a\u00020-H\u0003R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, bng = {"Lcom/iqoption/fragment/infoasset/conditions/ConditionsAssetViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "conditionsAssetItems", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/fragment/infoasset/adapters/conditions/ConditionsAssetAdapterItem;", "getConditionsAssetItems", "()Landroidx/lifecycle/LiveData;", "conditionsAssetItemsData", "Landroidx/lifecycle/MutableLiveData;", "currentActiveDisposable", "Lio/reactivex/disposables/Disposable;", "dayFormat", "Ljava/text/SimpleDateFormat;", "eventHandler", "Lcom/iqoption/fragment/infoasset/conditions/ConditionsAssetViewModel$EventHandler;", "socketEventHandler", "Lcom/iqoption/fragment/infoasset/conditions/ConditionsAssetViewModel$SocketEventHandler;", "addAllItem", "", "list", "formattedCommission", "", "commissionData", "Lcom/iqoption/core/microservices/tradingengine/response/commision/Commission$CommissionData;", "getBaseItem", "Lio/reactivex/Single;", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getCalendarCurrentDay", "Ljava/util/Calendar;", "firstSchedule", "", "getExpTitle", "getLeverage", "", "getOvernight", "getOvernightSchedulePosition", "getSchedule", "onCleared", "updateBaseItem", "updateItem", "item", "addIfNeed", "", "Companion", "EventHandler", "SocketEventHandler", "app_optionXRelease"})
/* compiled from: ConditionsAssetViewModel.kt */
public final class a extends com.iqoption.core.ui.f.d {
    private static final String TAG = a.class.getName();
    private static final io.reactivex.b.f<Throwable> aMn = d.dhy;
    private static final OvernightDay[] dhs = new OvernightDay[]{OvernightDay.MON, OvernightDay.TUE, OvernightDay.WED, OvernightDay.THU, OvernightDay.FRI, OvernightDay.SAT, OvernightDay.SUN};
    public static final c dht = new c();
    private final io.reactivex.disposables.b dhm;
    private final SimpleDateFormat dhn = new SimpleDateFormat("dd MMM", Locale.US);
    private final f dho = new f(this);
    private final e dhp = new e(this);
    private final MutableLiveData<List<com.iqoption.fragment.c.a.a.j>> dhq = new MutableLiveData();
    private final LiveData<List<com.iqoption.fragment.c.a.a.j>> dhr = this.dhq;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(Integer.valueOf(((com.iqoption.fragment.c.a.a.j) t).getId().intValue()), Integer.valueOf(((com.iqoption.fragment.c.a.a.j) t2).getId().intValue()));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(Integer.valueOf(((com.iqoption.fragment.c.a.a.j) t).getId().intValue()), Integer.valueOf(((com.iqoption.fragment.c.a.a.j) t2).getId().intValue()));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/fragment/infoasset/conditions/ConditionsAssetViewModel$Companion;", "", "()V", "LOGGING_CONSUMER", "Lio/reactivex/functions/Consumer;", "", "OVERNIGHT_DAYS", "", "Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightDay;", "[Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightDay;", "TAG", "", "kotlin.jvm.PlatformType", "get", "Lcom/iqoption/fragment/infoasset/conditions/ConditionsAssetViewModel;", "f", "Landroidx/fragment/app/Fragment;", "app_optionXRelease"})
    /* compiled from: ConditionsAssetViewModel.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(f fVar) {
            this();
        }

        public final a ac(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "f");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(a.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(f)…setViewModel::class.java]");
            return (a) viewModel;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, bng = {"<anonymous>", "", "call", "()Ljava/lang/Integer;"})
    /* compiled from: ConditionsAssetViewModel.kt */
    static final class i<V> implements Callable<T> {
        final /* synthetic */ com.iqoption.core.microservices.tradingengine.response.active.a dhw;

        i(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            this.dhw = aVar;
        }

        /* renamed from: aDQ */
        public final Integer call() {
            boolean Er = com.iqoption.app.b.DG().Er();
            com.iqoption.core.microservices.tradingengine.response.b.a a = com.iqoption.app.helpers.a.Gs().a(this.dhw.getInstrumentType(), this.dhw.getActiveId());
            if (a != null) {
                return i.r(com.iqoption.fragment.rightpanel.j.a(a.cB(Er), this.dhw.getInstrumentType()));
            }
            return Integer.valueOf(0);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ConditionsAssetViewModel.kt */
    /* renamed from: com.iqoption.fragment.c.b.a$1 */
    static final class AnonymousClass1<T> implements io.reactivex.b.f<com.iqoption.core.microservices.tradingengine.response.active.a> {
        final /* synthetic */ a dhu;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/fragment/infoasset/adapters/conditions/ConditionsAssetAdapterItem;", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: ConditionsAssetViewModel.kt */
        /* renamed from: com.iqoption.fragment.c.b.a$1$2 */
        static final class AnonymousClass2<T> implements io.reactivex.b.f<com.iqoption.fragment.c.a.a.j> {
            final /* synthetic */ AnonymousClass1 dhv;

            AnonymousClass2(AnonymousClass1 anonymousClass1) {
                this.dhv = anonymousClass1;
            }

            /* renamed from: a */
            public final void accept(com.iqoption.fragment.c.a.a.j jVar) {
                this.dhv.dhu.dhq.postValue(l.listOf(jVar));
            }
        }

        AnonymousClass1(a aVar) {
            this.dhu = aVar;
        }

        /* renamed from: K */
        public final void accept(final com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            this.dhu.dispose();
            this.dhu.dhq.postValue(l.listOf(com.iqoption.fragment.c.a.a.k.dgX));
            a aVar2 = this.dhu;
            kotlin.jvm.internal.i.e(aVar, ConditionalUserProperty.ACTIVE);
            io.reactivex.disposables.b a = aVar2.M(aVar).h(com.iqoption.core.rx.i.aki()).f(new io.reactivex.b.f<com.iqoption.fragment.c.a.a.j>(this) {
                final /* synthetic */ AnonymousClass1 dhv;

                @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "list", "", "Lcom/iqoption/fragment/infoasset/adapters/conditions/ConditionsAssetAdapterItem;", "kotlin.jvm.PlatformType", "accept"})
                /* compiled from: ConditionsAssetViewModel.kt */
                /* renamed from: com.iqoption.fragment.c.b.a$1$1$1 */
                static final class AnonymousClass1<T> implements io.reactivex.b.f<List<? extends com.iqoption.fragment.c.a.a.j>> {
                    final /* synthetic */ AnonymousClass1 dhx;

                    AnonymousClass1(AnonymousClass1 anonymousClass1) {
                        this.dhx = anonymousClass1;
                    }

                    /* renamed from: v */
                    public final void accept(List<? extends com.iqoption.fragment.c.a.a.j> list) {
                        a aVar = this.dhx.dhv.dhu;
                        kotlin.jvm.internal.i.e(list, "list");
                        aVar.aU(list);
                    }
                }

                @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "list", "", "Lcom/iqoption/fragment/infoasset/adapters/conditions/ConditionsAssetAdapterItem;", "kotlin.jvm.PlatformType", "accept"})
                /* compiled from: ConditionsAssetViewModel.kt */
                /* renamed from: com.iqoption.fragment.c.b.a$1$1$2 */
                static final class AnonymousClass2<T> implements io.reactivex.b.f<List<? extends com.iqoption.fragment.c.a.a.j>> {
                    final /* synthetic */ AnonymousClass1 dhx;

                    AnonymousClass2(AnonymousClass1 anonymousClass1) {
                        this.dhx = anonymousClass1;
                    }

                    /* renamed from: v */
                    public final void accept(List<? extends com.iqoption.fragment.c.a.a.j> list) {
                        kotlin.jvm.internal.i.e(list, "list");
                        if ((list.isEmpty() ^ 1) != 0) {
                            this.dhx.dhv.dhu.aU(list);
                        }
                    }
                }

                /* renamed from: a */
                public final void accept(com.iqoption.fragment.c.a.a.j jVar) {
                    a aVar = this.dhv.dhu;
                    a aVar2 = this.dhv.dhu;
                    com.iqoption.core.microservices.tradingengine.response.active.a aVar3 = aVar;
                    String str = ConditionalUserProperty.ACTIVE;
                    kotlin.jvm.internal.i.e(aVar3, str);
                    io.reactivex.disposables.b a = aVar2.O(aVar3).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new AnonymousClass1(this), a.aMn);
                    kotlin.jvm.internal.i.e(a, "getSchedule(active)\n    …     }, LOGGING_CONSUMER)");
                    aVar.b(a);
                    if (!aVar.getInstrumentType().isOption()) {
                        aVar = this.dhv.dhu;
                        aVar2 = this.dhv.dhu;
                        aVar3 = aVar;
                        kotlin.jvm.internal.i.e(aVar3, str);
                        a = aVar2.N(aVar3).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new AnonymousClass2(this), a.aMn);
                        kotlin.jvm.internal.i.e(a, "getOvernight(active)\n   …     }, LOGGING_CONSUMER)");
                        aVar.b(a);
                    }
                }
            }).a((io.reactivex.b.f) new AnonymousClass2(this), a.aMn);
            kotlin.jvm.internal.i.e(a, "getBaseItem(active)\n    …     }, LOGGING_CONSUMER)");
            aVar2.b(a);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ConditionsAssetViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<Throwable> {
        public static final d dhy = new d();

        d() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, bng = {"Lcom/iqoption/fragment/infoasset/conditions/ConditionsAssetViewModel$EventHandler;", "Lcom/iqoption/system/event/EventHandlerBaseT;", "Lcom/iqoption/fragment/infoasset/conditions/ConditionsAssetViewModel;", "ref", "(Lcom/iqoption/fragment/infoasset/conditions/ConditionsAssetViewModel;)V", "onChangeExpirationEvent", "", "event", "Lcom/iqoption/app/managers/expiration/ExpirationHelper$ChangeExpirationEvent;", "app_optionXRelease"})
    /* compiled from: ConditionsAssetViewModel.kt */
    private static final class e extends com.iqoption.system.a.e<a> {

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: ConditionsAssetViewModel.kt */
        static final class a implements Runnable {
            final /* synthetic */ e dhz;

            a(e eVar) {
                this.dhz = eVar;
            }

            public final void run() {
                a aVar = (a) this.dhz.dUo.get();
                if (aVar != null) {
                    TabHelper IM = TabHelper.IM();
                    kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
                    com.iqoption.core.microservices.tradingengine.response.active.a IZ = IM.IZ();
                    if (IZ != null) {
                        kotlin.jvm.internal.i.e(IZ, ConditionalUserProperty.ACTIVE);
                        aVar.Q(IZ);
                    }
                }
            }
        }

        public e(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "ref");
            super(aVar);
        }

        @com.google.common.b.e
        public final void onChangeExpirationEvent(com.iqoption.app.managers.a.e.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "event");
            com.iqoption.mobbtech.connect.response.options.d dVar = aVar.optionKey;
            kotlin.jvm.internal.i.e(dVar, "event.optionKey");
            if (dVar.getInstrumentType() == InstrumentType.FX_INSTRUMENT) {
                com.iqoption.core.c.a.biN.execute(new a(this));
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, bng = {"Lcom/iqoption/fragment/infoasset/conditions/ConditionsAssetViewModel$SocketEventHandler;", "Lcom/iqoption/system/event/SocketEventHandlerBaseT;", "Lcom/iqoption/fragment/infoasset/conditions/ConditionsAssetViewModel;", "ref", "(Lcom/iqoption/fragment/infoasset/conditions/ConditionsAssetViewModel;)V", "onChangeCurrentCurrency", "", "event", "Lcom/iqoption/service/WebSocketEvents$ChangeCurrentCurrency;", "app_optionXRelease"})
    /* compiled from: ConditionsAssetViewModel.kt */
    private static final class f extends com.iqoption.system.a.g<a> {

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: ConditionsAssetViewModel.kt */
        static final class a implements Runnable {
            final /* synthetic */ f dhA;

            a(f fVar) {
                this.dhA = fVar;
            }

            public final void run() {
                a aVar = (a) this.dhA.dUo.get();
                if (aVar != null) {
                    TabHelper IM = TabHelper.IM();
                    kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
                    com.iqoption.core.microservices.tradingengine.response.active.a IZ = IM.IZ();
                    if (IZ != null) {
                        kotlin.jvm.internal.i.e(IZ, ConditionalUserProperty.ACTIVE);
                        aVar.Q(IZ);
                    }
                }
            }
        }

        public f(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "ref");
            super(aVar);
        }

        @com.google.common.b.e
        public final void onChangeCurrentCurrency(com.iqoption.service.e.c cVar) {
            kotlin.jvm.internal.i.f(cVar, "event");
            com.iqoption.core.c.a.biN.execute(new a(this));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "leverage", "apply", "(Ljava/lang/Integer;)Lio/reactivex/Single;"})
    /* compiled from: ConditionsAssetViewModel.kt */
    static final class g<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ com.iqoption.core.microservices.tradingengine.response.active.a dhw;

        g(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            this.dhw = aVar;
        }

        /* renamed from: l */
        public final p<Pair<Double, Integer>> apply(final Integer num) {
            kotlin.jvm.internal.i.f(num, "leverage");
            return com.iqoption.asset.c.b.axz.a(this.dhw.getActiveId(), this.dhw.getInstrumentType(), num.intValue()).cE(com.iqoption.core.microservices.risks.response.markup.c.byt.ahk()).t(new io.reactivex.b.g<T, R>() {
                /* renamed from: a */
                public final Pair<Double, Integer> apply(com.iqoption.core.microservices.risks.response.markup.c cVar) {
                    kotlin.jvm.internal.i.f(cVar, "markup");
                    return kotlin.j.x(Double.valueOf(cVar.getValue()), num);
                }
            });
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/iqoption/fragment/infoasset/adapters/conditions/ConditionsAssetAdapterItem;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "apply"})
    /* compiled from: ConditionsAssetViewModel.kt */
    static final class h<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ a dhu;
        final /* synthetic */ com.iqoption.core.microservices.tradingengine.response.active.a dhw;

        h(a aVar, com.iqoption.core.microservices.tradingengine.response.active.a aVar2) {
            this.dhu = aVar;
            this.dhw = aVar2;
        }

        /* JADX WARNING: Missing block: B:24:0x0108, code skipped:
            if (r1 != null) goto L_0x0112;
     */
        /* renamed from: e */
        public final com.iqoption.fragment.c.a.a.j apply(kotlin.Pair<java.lang.Double, java.lang.Integer> r15) {
            /*
            r14 = this;
            r0 = "<name for destructuring parameter 0>";
            kotlin.jvm.internal.i.f(r15, r0);
            r0 = r15.bnj();
            r0 = (java.lang.Number) r0;
            r7 = r0.doubleValue();
            r15 = r15.bnk();
            r15 = (java.lang.Integer) r15;
            r0 = r14.dhw;
            r0 = r0.getInstrumentType();
            r0 = com.iqoption.util.j.ae(r0);
            r1 = com.iqoption.app.managers.tab.TabHelper.IM();
            r2 = "TabHelper.instance()";
            kotlin.jvm.internal.i.e(r1, r2);
            r1 = r1.Jd();
            r2 = r14.dhw;
            r2 = r2.getInstrumentType();
            r3 = com.iqoption.core.data.model.InstrumentType.FX_INSTRUMENT;
            r9 = 0;
            if (r2 != r3) goto L_0x0051;
        L_0x0037:
            r2 = com.iqoption.app.managers.feature.a.Il();
            r1 = r1.expInterval;
            r1 = r2.get(r1);
            r1 = (java.lang.Double) r1;
            if (r1 == 0) goto L_0x0051;
        L_0x0045:
            r1 = (java.lang.Number) r1;
            r1 = r1.doubleValue();
            r1 = com.iqoption.util.j.P(r1);
            r0[r9] = r1;
        L_0x0051:
            r1 = r0[r9];
            r0 = java.lang.Double.valueOf(r1);
            r0 = com.iqoption.util.j.r(r0);
            r10 = com.iqoption.app.helpers.a.Gs();
            r1 = r14.dhw;
            r1 = r1.getActiveId();
            r2 = r14.dhw;
            r2 = r2.getInstrumentType();
            r1 = r10.a(r1, r2);
            r2 = com.iqoption.core.microservices.f.a.a.a.bzg;
            r2 = r2.g(r1);
            r3 = com.iqoption.core.microservices.f.a.a.a.bzg;
            r1 = r3.d(r1);
            r11 = 0;
            if (r1 == 0) goto L_0x00ad;
        L_0x007e:
            if (r2 != 0) goto L_0x0081;
        L_0x0080:
            goto L_0x00ad;
        L_0x0081:
            if (r15 != 0) goto L_0x0084;
        L_0x0083:
            goto L_0x008f;
        L_0x0084:
            r3 = r15.intValue();
            if (r3 != 0) goto L_0x008f;
        L_0x008a:
            r1 = com.iqoption.util.ab.e(r2, r1);
            goto L_0x00ab;
        L_0x008f:
            r3 = com.iqoption.asset.c.a.axy;
            r4 = r14.dhw;
            r4 = r4.getPrecision();
            r5 = r1.doubleValue();
            r12 = r2.doubleValue();
            r1 = r3;
            r2 = r4;
            r3 = r5;
            r5 = r12;
            r1 = r1.a(r2, r3, r5, r7);
            r1 = java.lang.Double.valueOf(r1);
        L_0x00ab:
            r3 = r1;
            goto L_0x00ae;
        L_0x00ad:
            r3 = r11;
        L_0x00ae:
            r1 = r14.dhu;
            r2 = r14.dhw;
            r5 = r1.P(r2);
            r1 = r14.dhw;
            r1 = r1.getInstrumentType();
            r1 = r1.isOption();
            r2 = "minInvest";
            if (r1 == 0) goto L_0x00e8;
        L_0x00c4:
            r15 = r14.dhw;
            r15 = r15.ahR();
            if (r15 != 0) goto L_0x00cd;
        L_0x00cc:
            goto L_0x00dd;
        L_0x00cd:
            r15 = r14.dhw;
            r15 = r15.ahR();
            r15 = 100 - r15;
            r15 = java.lang.Integer.valueOf(r15);
            r11 = com.iqoption.core.util.af.i(r15);
        L_0x00dd:
            r15 = new com.iqoption.fragment.c.a.a.b;
            kotlin.jvm.internal.i.e(r0, r2);
            r15.<init>(r0, r3, r11, r5);
            r15 = (com.iqoption.fragment.c.a.a.j) r15;
            goto L_0x012e;
        L_0x00e8:
            r1 = r14.dhw;
            r1 = r1.getInstrumentType();
            r4 = r14.dhw;
            r4 = r4.getActiveId();
            r4 = java.lang.Integer.valueOf(r4);
            r1 = r10.a(r1, r4);
            if (r1 == 0) goto L_0x010b;
        L_0x00fe:
            r4 = r14.dhu;
            r1 = r1.air();
            r1 = r4.a(r1);
            if (r1 == 0) goto L_0x010b;
        L_0x010a:
            goto L_0x0112;
        L_0x010b:
            r1 = 2131886971; // 0x7f12037b float:1.9408536E38 double:1.053292113E-314;
            r1 = com.iqoption.core.d.getString(r1);
        L_0x0112:
            r6 = r1;
            kotlin.jvm.internal.i.e(r0, r2);
            if (r15 != 0) goto L_0x0119;
        L_0x0118:
            goto L_0x011f;
        L_0x0119:
            r1 = r15.intValue();
            if (r1 == 0) goto L_0x0120;
        L_0x011f:
            r9 = 1;
        L_0x0120:
            if (r9 == 0) goto L_0x0124;
        L_0x0122:
            r4 = r15;
            goto L_0x0125;
        L_0x0124:
            r4 = r11;
        L_0x0125:
            r15 = new com.iqoption.fragment.c.a.a.a;
            r1 = r15;
            r2 = r0;
            r1.<init>(r2, r3, r4, r5, r6);
            r15 = (com.iqoption.fragment.c.a.a.j) r15;
        L_0x012e:
            return r15;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.c.b.a$h.apply(kotlin.Pair):com.iqoption.fragment.c.a.a.j");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "Lcom/iqoption/fragment/infoasset/adapters/conditions/ConditionsAssetAdapterItem;", "overnightFee", "", "", "Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightFeeData;", "apply"})
    /* compiled from: ConditionsAssetViewModel.kt */
    static final class j<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ com.iqoption.core.microservices.tradingengine.response.active.a dhw;

        j(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            this.dhw = aVar;
        }

        /* renamed from: w */
        public final List<com.iqoption.fragment.c.a.a.j> apply(Map<Integer, com.iqoption.core.microservices.risks.response.overnightfee.c> map) {
            Map<Integer, com.iqoption.core.microservices.risks.response.overnightfee.c> map2 = map;
            kotlin.jvm.internal.i.f(map2, "overnightFee");
            com.iqoption.core.microservices.risks.response.overnightfee.c cVar = (com.iqoption.core.microservices.risks.response.overnightfee.c) map2.get(Integer.valueOf(this.dhw.getActiveId()));
            if (cVar == null) {
                return new ArrayList();
            }
            List<com.iqoption.fragment.c.a.a.j> arrayList = new ArrayList();
            OvernightDay today = OvernightDay.Companion.today();
            com.iqoption.core.microservices.risks.response.overnightfee.d a = cVar.a(TimeUtil.bRM.anN(), today);
            arrayList.add(new com.iqoption.fragment.c.a.a.f(a != null ? Double.valueOf(a.ahn()) : null, a != null ? Double.valueOf(a.aho()) : null));
            arrayList.add(new com.iqoption.fragment.c.a.a.e());
            for (OvernightDay overnightDay : a.dhs) {
                arrayList.add(new com.iqoption.fragment.c.a.a.d(overnightDay.ordinal(), com.iqoption.core.d.getString(com.iqoption.util.k.a(overnightDay)), a != null ? TimeUtil.bRM.aQ(a.getTime()) : null, a != null ? Double.valueOf(a.ahn()) : null, a != null ? Double.valueOf(a.aho()) : null, today == overnightDay));
            }
            arrayList.add(new com.iqoption.fragment.c.a.a.c());
            return arrayList;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012 \u0010\u0002\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "Lcom/iqoption/fragment/infoasset/adapters/conditions/ConditionsAssetAdapterItem;", "kotlin.jvm.PlatformType", "subscribe"})
    /* compiled from: ConditionsAssetViewModel.kt */
    static final class k<T> implements s<T> {
        final /* synthetic */ a dhu;
        final /* synthetic */ com.iqoption.core.microservices.tradingengine.response.active.a dhw;

        k(a aVar, com.iqoption.core.microservices.tradingengine.response.active.a aVar2) {
            this.dhu = aVar;
            this.dhw = aVar2;
        }

        public final void a(q<List<com.iqoption.fragment.c.a.a.j>> qVar) {
            q<List<com.iqoption.fragment.c.a.a.j>> qVar2 = qVar;
            kotlin.jvm.internal.i.f(qVar2, "emitter");
            List ahT = this.dhw.ahT();
            String format = new SimpleDateFormat("ZZZZ", Locale.getDefault()).format(new Date());
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(com.iqoption.core.d.getString(R.string.schedule));
            stringBuilder.append(" (");
            stringBuilder.append(format);
            stringBuilder.append(')');
            arrayList.add(new com.iqoption.fragment.c.a.a.h(stringBuilder.toString()));
            long j = 1000;
            Calendar a = this.dhu.bH(((m) u.bU(ahT)).aih() * 1000);
            String string = com.iqoption.core.d.getString(R.string.market_closed);
            int i = 0;
            while (i <= 6) {
                int i2;
                List list;
                Calendar calendar;
                long timeInMillis = a.getTimeInMillis();
                String string2 = com.iqoption.core.d.getString(com.iqoption.util.k.hv(a.get(7)));
                String format2 = this.dhu.dhn.format(Long.valueOf(timeInMillis));
                a.add(7, 1);
                long timeInMillis2 = a.getTimeInMillis() - 1;
                String str = "";
                for (m mVar : r2) {
                    i2 = i;
                    long aih = mVar.aih() * j;
                    long aii = mVar.aii();
                    list = ahT;
                    calendar = a;
                    long j2 = aii * j;
                    if (timeInMillis <= aih && timeInMillis2 >= aih) {
                        StringBuilder stringBuilder2;
                        if ((((CharSequence) str).length() > 0 ? 1 : null) != null) {
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(str);
                            stringBuilder2.append("\n");
                            str = stringBuilder2.toString();
                        }
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(str);
                        stringBuilder2.append(TimeUtil.bRM.aQ(aih));
                        stringBuilder2.append(" - ");
                        stringBuilder2.append(TimeUtil.bRM.aQ(j2));
                        str = stringBuilder2.toString();
                    }
                    ahT = list;
                    i = i2;
                    a = calendar;
                    j = 1000;
                }
                list = ahT;
                calendar = a;
                i2 = i;
                kotlin.jvm.internal.i.e(format2, "day");
                if ((((CharSequence) str).length() == 0 ? 1 : null) != null) {
                    str = string;
                }
                arrayList.add(new com.iqoption.fragment.c.a.a.g(i2, string2, format2, str, com.iqoption.core.util.i.aP(timeInMillis)));
                i = i2 + 1;
                ahT = list;
                a = calendar;
                j = 1000;
            }
            qVar2.onSuccess(arrayList);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/fragment/infoasset/adapters/conditions/ConditionsAssetAdapterItem;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ConditionsAssetViewModel.kt */
    static final class l<T> implements io.reactivex.b.f<com.iqoption.fragment.c.a.a.j> {
        final /* synthetic */ a dhu;

        l(a aVar) {
            this.dhu = aVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.fragment.c.a.a.j jVar) {
            a aVar = this.dhu;
            kotlin.jvm.internal.i.e(jVar, "it");
            a.a(aVar, jVar, false, 2, null);
        }
    }

    public a() {
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        io.reactivex.disposables.b e = IM.IP().d(com.iqoption.core.rx.i.aki()).e((io.reactivex.b.f) new AnonymousClass1(this));
        kotlin.jvm.internal.i.e(e, "TabHelper.instance().cur…ared()\n\n                }");
        this.dhm = e;
        this.dho.register();
        this.dhp.register();
    }

    public final LiveData<List<com.iqoption.fragment.c.a.a.j>> aDM() {
        return this.dhr;
    }

    private final p<Integer> L(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        p j = p.j(new i(aVar));
        kotlin.jvm.internal.i.e(j, "Single.fromCallable {\n  …0\n            }\n        }");
        return j;
    }

    private final p<com.iqoption.fragment.c.a.a.j> M(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        p t = L(aVar).q(new g(aVar)).t(new h(this, aVar));
        kotlin.jvm.internal.i.e(t, "getLeverage(active)\n    …      }\n                }");
        return t;
    }

    private final String a(com.iqoption.core.microservices.tradingengine.response.a.a.a aVar) {
        Object obj = 1;
        String str = "";
        if (aVar != null) {
            double doubleValue;
            Double ait = aVar.ait();
            if (ait != null) {
                doubleValue = ait.doubleValue();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(af.a(doubleValue, 3, false));
                str = stringBuilder.toString();
            }
            Double ais = aVar.ais();
            if (ais != null) {
                doubleValue = ais.doubleValue();
                if (doubleValue > 0.01d) {
                    StringBuilder stringBuilder2;
                    if ((((CharSequence) str).length() > 0 ? 1 : null) != null) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(str);
                        stringBuilder2.append(" + ");
                        str = stringBuilder2.toString();
                    }
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str);
                    Double aWI = com.iqoption.util.j.aWI();
                    kotlin.jvm.internal.i.e(aWI, "CurrencyUtils.getCurrentRate()");
                    stringBuilder2.append(com.iqoption.util.j.O(doubleValue / aWI.doubleValue()));
                    str = stringBuilder2.toString();
                }
            }
        }
        if (str.length() != 0) {
            obj = null;
        }
        return obj != null ? com.iqoption.core.d.getString(R.string.free) : str;
    }

    private final p<List<com.iqoption.fragment.c.a.a.j>> N(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        p t = com.iqoption.core.data.repository.f.bdW.E(aVar.getInstrumentType()).bkV().t(new j(aVar));
        kotlin.jvm.internal.i.e(t, "RisksRepository.getOvern…istOf()\n                }");
        return t;
    }

    private final p<List<com.iqoption.fragment.c.a.a.j>> O(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        p a = p.a((s) new k(this, aVar));
        kotlin.jvm.internal.i.e(a, "Single.create<List<Condi…            })\n\n        }");
        return a;
    }

    private final Calendar bH(long j) {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.clear(12);
        instance.clear(13);
        instance.clear(14);
        kotlin.jvm.internal.i.e(instance, "c");
        instance.set(7, instance.getFirstDayOfWeek());
        if (instance.getTimeInMillis() < j) {
            instance.setTimeInMillis(j);
        }
        return instance;
    }

    private final String P(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        switch (aVar.getInstrumentType()) {
            case TURBO_INSTRUMENT:
            case BINARY_INSTRUMENT:
                if (aVar != null) {
                    return TimeUtil.bo(((n) aVar).aij().aim());
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.tradingengine.response.active.TurboBinaryActive");
            case DIGITAL_INSTRUMENT:
            case MULTI_INSTRUMENT:
                return "1m - 15m";
            case FX_INSTRUMENT:
                return TimeUtil.bo(3600);
            case FOREX_INSTRUMENT:
            case CFD_INSTRUMENT:
            case CRYPTO_INSTRUMENT:
                return aVar.isExpired() ? com.iqoption.core.d.getString(R.string.day1) : com.iqoption.core.d.getString(R.string.n_a);
            default:
                return com.iqoption.core.d.getString(R.string.n_a);
        }
    }

    @WorkerThread
    private final void aU(List<? extends com.iqoption.fragment.c.a.a.j> list) {
        List list2 = (List) this.dhq.getValue();
        if (list2 != null) {
            MutableLiveData mutableLiveData = this.dhq;
            kotlin.jvm.internal.i.e(list2, "items");
            list2 = u.I(list2);
            list2.addAll(list);
            mutableLiveData.setValue(u.a((Iterable) list2, (Comparator) new a()));
        }
    }

    @WorkerThread
    static /* synthetic */ void a(a aVar, com.iqoption.fragment.c.a.a.j jVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        aVar.a(jVar, z);
    }

    @WorkerThread
    private final void a(com.iqoption.fragment.c.a.a.j jVar, boolean z) {
        List<com.iqoption.fragment.c.a.a.j> list = (List) this.dhq.getValue();
        if (list != null) {
            kotlin.jvm.internal.i.e(list, "items");
            int i = 0;
            for (com.iqoption.fragment.c.a.a.j JR : list) {
                if ((JR.getId().intValue() == jVar.getId().intValue() ? 1 : null) != null) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i >= 0) {
                this.dhq.setValue(com.iqoption.core.ext.c.a((List) list, i, (Object) jVar));
            } else if (z) {
                this.dhq.setValue(u.a((Iterable) com.iqoption.core.ext.c.a((List) list, (Object) jVar, 0, 2, null), (Comparator) new b()));
            }
        }
    }

    @WorkerThread
    public final int aDN() {
        List<com.iqoption.fragment.c.a.a.j> list = (List) this.dhq.getValue();
        if (list == null) {
            return -1;
        }
        kotlin.jvm.internal.i.e(list, "items");
        int i = 0;
        for (com.iqoption.fragment.c.a.a.j JR : list) {
            if ((JR.getId().intValue() == 23 ? 1 : null) != null) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final void Q(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        io.reactivex.disposables.b a = M(aVar).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new l(this), aMn);
        kotlin.jvm.internal.i.e(a, "getBaseItem(active)\n    …     }, LOGGING_CONSUMER)");
        b(a);
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        this.dhm.dispose();
        this.dho.unregister();
        this.dhp.unregister();
    }
}
