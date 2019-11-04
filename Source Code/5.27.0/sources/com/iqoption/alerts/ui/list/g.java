package com.iqoption.alerts.ui.list;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProviders;
import com.google.gson.JsonObject;
import com.iqoption.core.data.model.InstrumentType;
import io.reactivex.b.h;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J>\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\"\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001e0 0 j\u0002`#2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\"H\u0002J\u0012\u0010&\u001a\u00020'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)J\u000e\u0010*\u001a\u00020'2\u0006\u0010(\u001a\u00020)J\u000e\u0010+\u001a\u00020'2\u0006\u0010(\u001a\u00020)R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R/\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b8F@FX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, bng = {"Lcom/iqoption/alerts/ui/list/AlertsListViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "<set-?>", "", "expandedId", "getExpandedId", "()J", "Lcom/iqoption/alerts/ui/list/AlertsListInteractor;", "interactor", "getInteractor", "()Lcom/iqoption/alerts/ui/list/AlertsListInteractor;", "setInteractor", "(Lcom/iqoption/alerts/ui/list/AlertsListInteractor;)V", "interactor$delegate", "Lkotlin/properties/ReadWriteProperty;", "isShowAddButton", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "isShowAddButtonData", "Landroidx/lifecycle/MutableLiveData;", "items", "", "Lcom/iqoption/alerts/ui/list/AlertAdapterItem;", "getItems", "itemsData", "triggerDateFormat", "Ljava/text/SimpleDateFormat;", "getAsset", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "assetsMap", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "Lcom/iqoption/asset/AssetsMap;", "instrumentType", "assetId", "onItemConfigureClick", "", "alertItem", "Lcom/iqoption/alerts/ui/list/AlertItem;", "onItemDeleteClick", "onItemExpandedChanged", "Companion", "alerts_release"})
/* compiled from: AlertsListViewModel.kt */
public final class g extends com.iqoption.core.ui.f.d {
    private static final String TAG = g.class.getSimpleName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(g.class), "interactor", "getInteractor()Lcom/iqoption/alerts/ui/list/AlertsListInteractor;"))};
    public static final a apI = new a();
    private final MutableLiveData<List<a>> apB;
    private final LiveData<List<a>> apC = this.apB;
    private final MutableLiveData<Boolean> apD;
    private final LiveData<Boolean> apE;
    private final SimpleDateFormat apF;
    private volatile long apG;
    private final kotlin.f.d apH;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/alerts/ui/list/AlertsListViewModel$Companion;", "", "()V", "MAX_TRIGGERS", "", "TAG", "", "kotlin.jvm.PlatformType", "get", "Lcom/iqoption/alerts/ui/list/AlertsListViewModel;", "a", "Landroidx/fragment/app/FragmentActivity;", "alerts_release"})
    /* compiled from: AlertsListViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final g a(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "a");
            Factory factory = (Factory) null;
            ViewModelProvider of = ViewModelProviders.of(fragmentActivity);
            kotlin.jvm.internal.i.e(of, "ViewModelProviders.of(a)");
            ViewModel viewModel = of.get(g.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(a)\n    }[T::class.java]");
            return (g) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u0004j\u0002`\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nH\n¢\u0006\u0002\b\u000e"}, bng = {"<anonymous>", "", "Lcom/iqoption/alerts/ui/list/AlertAdapterItem;", "assetsMap", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "Lcom/iqoption/asset/AssetsMap;", "triggers", "", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertTrigger;", "alerts", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "apply"})
    /* compiled from: AlertsListViewModel.kt */
    /* renamed from: com.iqoption.alerts.ui.list.g$1 */
    static final class AnonymousClass1<T1, T2, T3, R> implements h<Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>>, List<? extends com.iqoption.core.microservices.useralerts.response.b>, List<? extends com.iqoption.core.microservices.useralerts.response.a>, List<a>> {
        final /* synthetic */ g apJ;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
        /* compiled from: Comparisons.kt */
        public static final class a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return b.c(Long.valueOf(((com.iqoption.core.microservices.useralerts.response.b) t).ajf()), Long.valueOf(((com.iqoption.core.microservices.useralerts.response.b) t2).ajf()));
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
        /* compiled from: Comparisons.kt */
        public static final class b<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return b.c(Long.valueOf(((com.iqoption.core.microservices.useralerts.response.a) t).ajc()), Long.valueOf(((com.iqoption.core.microservices.useralerts.response.a) t2).ajc()));
            }
        }

        AnonymousClass1(g gVar) {
            this.apJ = gVar;
        }

        public final List<a> a(Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>> map, List<com.iqoption.core.microservices.useralerts.response.b> list, List<? extends com.iqoption.core.microservices.useralerts.response.a> list2) {
            com.iqoption.core.microservices.tradingengine.response.active.a a;
            String B;
            String image;
            String U;
            String a2;
            int i;
            String format;
            Map map2 = map;
            List<com.iqoption.core.microservices.useralerts.response.b> list3 = list;
            List<? extends com.iqoption.core.microservices.useralerts.response.a> list4 = list2;
            kotlin.jvm.internal.i.f(map2, "assetsMap");
            kotlin.jvm.internal.i.f(list3, "triggers");
            kotlin.jvm.internal.i.f(list4, "alerts");
            List arrayList = new ArrayList();
            for (com.iqoption.core.microservices.useralerts.response.b bVar : u.a((Iterable) list3, (Comparator) new a())) {
                a = this.apJ.a(map2, bVar.getInstrumentType(), bVar.Bs());
                if (a != null) {
                    B = com.iqoption.core.microservices.tradingengine.response.active.d.B(a);
                    image = a.getImage();
                    U = com.iqoption.core.microservices.tradingengine.response.active.d.U(bVar.getInstrumentType());
                    a2 = com.iqoption.core.util.e.a(bVar.getValue(), a.getPrecision(), null, false, false, false, false, null, null, 254, null);
                    i = com.iqoption.alerts.b.a.grey_blue_70;
                    format = this.apJ.apF.format(Long.valueOf(bVar.getTimestamp()));
                    kotlin.jvm.internal.i.e(format, "triggerDateFormat.format(trigger.timestamp)");
                    arrayList.add(new m(bVar, a, B, image, U, a2, format, i, com.iqoption.alerts.b.a.grey_blue_70, com.iqoption.alerts.b.a.grey_blue_50, com.iqoption.alerts.b.c.ic_circled_check_white_24dp));
                }
            }
            if ((list4.isEmpty() ^ 1) != 0) {
                arrayList.add(new l());
            }
            for (com.iqoption.core.microservices.useralerts.response.a aVar : u.a((Iterable) list4, (Comparator) new b())) {
                a = this.apJ.a(map2, aVar.getInstrumentType(), aVar.Bs());
                if (a != null) {
                    B = com.iqoption.core.microservices.tradingengine.response.active.d.B(a);
                    image = a.getImage();
                    U = com.iqoption.core.microservices.tradingengine.response.active.d.U(aVar.getInstrumentType());
                    a2 = com.iqoption.core.util.e.a(aVar.getValue(), a.getPrecision(), null, false, false, false, false, null, null, 254, null);
                    i = com.iqoption.alerts.b.a.white;
                    String string = com.iqoption.core.d.getString(com.iqoption.alerts.b.f.price);
                    if (string != null) {
                        format = string.toUpperCase();
                        kotlin.jvm.internal.i.e(format, "(this as java.lang.String).toUpperCase()");
                        arrayList.add(new b(aVar, a, B, image, U, a2, format, i, com.iqoption.alerts.b.a.gold, com.iqoption.alerts.b.a.gold, com.iqoption.alerts.b.c.ic_alert_white_24dp, this.apJ.Bq() == aVar.getId()));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add(new j(com.iqoption.alerts.b.f.you_have_no_active_alerts));
            }
            return arrayList;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "items", "", "Lcom/iqoption/alerts/ui/list/AlertAdapterItem;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AlertsListViewModel.kt */
    /* renamed from: com.iqoption.alerts.ui.list.g$2 */
    static final class AnonymousClass2<T> implements io.reactivex.b.f<List<a>> {
        final /* synthetic */ g apJ;

        AnonymousClass2(g gVar) {
            this.apJ = gVar;
        }

        /* renamed from: v */
        public final void accept(List<a> list) {
            this.apJ.apB.postValue(list);
            MutableLiveData c = this.apJ.apD;
            kotlin.jvm.internal.i.e(list, "items");
            Iterable<a> iterable = list;
            int i = 0;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (a aVar : iterable) {
                    if (aVar instanceof b) {
                        i = 1;
                        break;
                    }
                }
            }
            c.postValue(Boolean.valueOf(i ^ 1));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AlertsListViewModel.kt */
    static final class b<T> implements io.reactivex.b.f<com.iqoption.core.microservices.useralerts.response.a> {
        public static final b apL = new b();

        b() {
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.useralerts.response.a aVar) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AlertsListViewModel.kt */
    static final class c<T> implements io.reactivex.b.f<Throwable> {
        public static final c apM = new c();

        c() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertTrigger;", "it", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertTrigger$Response;", "apply"})
    /* compiled from: AlertsListViewModel.kt */
    static final class d<T, R> implements io.reactivex.b.g<T, R> {
        public static final d apN = new d();

        d() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.useralerts.response.b> apply(com.iqoption.core.microservices.useralerts.response.b.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return aVar.ajd();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lkotlin/Function1;", "", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertTrigger;", "", "new", "apply"})
    /* compiled from: AlertsListViewModel.kt */
    static final class e<T, R> implements io.reactivex.b.g<T, R> {
        public static final e apO = new e();

        e() {
        }

        /* renamed from: a */
        public final kotlin.jvm.a.b<List<com.iqoption.core.microservices.useralerts.response.b>, List<com.iqoption.core.microservices.useralerts.response.b>> apply(com.iqoption.core.microservices.useralerts.response.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "new");
            return new AlertsListViewModel$triggersFlowable$2$1(bVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012:\u0010\u0005\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertTrigger;", "kotlin.jvm.PlatformType", "list", "mutator", "Lkotlin/Function1;", "apply"})
    /* compiled from: AlertsListViewModel.kt */
    static final class f<T1, T2, R> implements io.reactivex.b.c<R, T, R> {
        public static final f apP = new f();

        f() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.useralerts.response.b> apply(List<com.iqoption.core.microservices.useralerts.response.b> list, kotlin.jvm.a.b<? super List<com.iqoption.core.microservices.useralerts.response.b>, ? extends List<com.iqoption.core.microservices.useralerts.response.b>> bVar) {
            kotlin.jvm.internal.i.f(list, "list");
            kotlin.jvm.internal.i.f(bVar, "mutator");
            return (List) bVar.invoke(list);
        }
    }

    public final f Br() {
        return (f) this.apH.b(this, anY[0]);
    }

    public final void a(f fVar) {
        this.apH.a(this, anY[0], fVar);
    }

    public g() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(l.listOf(new k()));
        this.apB = mutableLiveData;
        mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Boolean.valueOf(false));
        this.apD = mutableLiveData;
        this.apE = this.apD;
        this.apF = new SimpleDateFormat("dd MMM, HH:mm", Locale.getDefault());
        this.apG = -1;
        this.apH = com.iqoption.core.d.c.bL(null);
        io.reactivex.e JP = com.iqoption.asset.b.a.awZ.JP();
        io.reactivex.e bkO = com.iqoption.core.microservices.useralerts.a.a(com.iqoption.core.microservices.useralerts.a.bCX, 50, 0, null, null, 14, null).t(d.apN).bkO();
        kotlin.jvm.internal.i.e(bkO, "UserAlertsRequests.getTr…            .toFlowable()");
        io.reactivex.e a = com.iqoption.core.rx.g.f(bkO).c((org.a.b) com.iqoption.core.microservices.useralerts.a.b(com.iqoption.core.microservices.useralerts.a.bCX, 0, 1, null).g(e.apO)).a(m.emptyList(), (io.reactivex.b.c) f.apP);
        kotlin.jvm.internal.i.e(a, "UserAlertsRequests.getTr…r(list)\n                }");
        io.reactivex.disposables.b a2 = io.reactivex.e.a((org.a.b) JP, (org.a.b) a, (org.a.b) com.iqoption.alerts.data.a.aoa.AW(), (h) new AnonymousClass1(this)).c(com.iqoption.core.rx.i.aki()).bkT().d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new AnonymousClass2(this), (io.reactivex.b.f) AnonymousClass3.apK);
        kotlin.jvm.internal.i.e(a2, "Flowable\n               …      \n                })");
        b(a2);
    }

    public final LiveData<List<a>> Bo() {
        return this.apC;
    }

    public final LiveData<Boolean> Bp() {
        return this.apE;
    }

    public final long Bq() {
        return this.apG;
    }

    private final com.iqoption.core.microservices.tradingengine.response.active.a a(Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>> map, InstrumentType instrumentType, int i) {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = null;
        Map map2;
        if (h.aob[instrumentType.ordinal()] != 1) {
            map2 = (Map) map.get(instrumentType);
            if (map2 != null) {
                aVar = (com.iqoption.core.microservices.tradingengine.response.active.a) map2.get(Integer.valueOf(i));
            }
        } else {
            map2 = (Map) map.get(instrumentType);
            if (map2 != null) {
                Collection<com.iqoption.core.microservices.tradingengine.response.active.a> values = map2.values();
                if (values != null) {
                    for (com.iqoption.core.microservices.tradingengine.response.active.a aVar2 : values) {
                        if (aVar2 != null) {
                            com.iqoption.core.microservices.tradingengine.response.active.j fa = ((com.iqoption.core.microservices.tradingengine.response.active.j) aVar2).fa(i);
                            if (fa != null) {
                                return fa;
                            }
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.tradingengine.response.active.InstrumentActive");
                    }
                }
            }
        }
        return aVar;
    }

    public final void c(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "alertItem");
        this.apG = bVar.nq() ? bVar.Ba().getId() : -1;
        if (bVar.nq()) {
            com.iqoption.core.microservices.useralerts.response.a Ba = bVar.Ba();
            com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("asset_id", (Number) Integer.valueOf(Ba.Bs()));
            jsonObject.addProperty("instrument_type", Ba.getInstrumentType().getServerValue());
            EC.a("alerts-screen_alert-open", jsonObject);
        }
    }

    public final void a(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "alertItem");
        com.iqoption.core.microservices.useralerts.response.a Ba = bVar.Ba();
        com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("asset_id", (Number) Integer.valueOf(Ba.Bs()));
        jsonObject.addProperty("instrument_type", Ba.getInstrumentType().getServerValue());
        EC.a("alerts-screen_alert-remove", jsonObject);
        com.iqoption.core.microservices.useralerts.a.bCX.bb(bVar.Ba().getId()).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) b.apL, (io.reactivex.b.f) c.apM);
    }

    public final void b(b bVar) {
        if (bVar != null) {
            f Br = Br();
            if (Br != null) {
                Br.a(bVar.Bb(), bVar.Ba());
                return;
            }
            return;
        }
        f Br2 = Br();
        if (Br2 != null) {
            Br2.Bm();
        }
    }
}
