package com.iqoption.fragment.c.c;

import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.fininfo.response.FinInfoType;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.fragment.c.a.b.j;
import com.iqoption.fragment.c.a.b.k;
import com.iqoption.fragment.c.a.b.l;
import io.reactivex.b.h;
import io.reactivex.p;
import io.reactivex.t;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u0000 :2\u00020\u0001:\u0001:B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u000fH\u0014J\u000e\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0018J\u000e\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020#J\u000e\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020$J\u000e\u0010%\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020&J\u0010\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)H\u0003J\b\u0010*\u001a\u00020\u000fH\u0002J\"\u0010+\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010,\u001a\u00020\u001cH\u0003J \u0010-\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020.2\u0006\u0010/\u001a\u00020)2\u0006\u00100\u001a\u00020)H\u0003J\u0016\u00101\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020)H\u0003J\u0010\u00106\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u001cH\u0003J\u0010\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u000203H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, bng = {"Lcom/iqoption/fragment/infoasset/main/InfoAssetMainViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "currentActiveDisposable", "Lio/reactivex/disposables/Disposable;", "infoAssetItems", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetAdapterItem;", "getInfoAssetItems", "()Landroidx/lifecycle/LiveData;", "infoAssetItemsData", "Landroidx/lifecycle/MutableLiveData;", "statisticsFullDisposable", "dispose", "", "generateCfdList", "dataActive", "Lcom/iqoption/core/microservices/fininfo/response/DataActive;", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "generateCryptoList", "generateForexList", "genetateTitle", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetTitle;", "ticker", "", "isDisabledKeyStat", "", "onCleared", "onFullStatisticsClick", "item", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetStatisticsFull;", "onItemFavoriteButtonClick", "onItemToggled", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetPrice;", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetPriceFull;", "onMoreStatisticsClick", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetStatisticsMore;", "removeItem", "id", "", "statisticsDispose", "updateItem", "addIfNeed", "updateStatisticsItem", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetStatistics;", "activeId", "precision", "updateTitle", "Lio/reactivex/Single;", "", "updateTitleAlertsCount", "alertsCount", "updateTitleFavorite", "isFavorite", "updateTitleQuote", "quote", "Companion", "app_optionXRelease"})
/* compiled from: InfoAssetMainViewModel.kt */
public final class b extends com.iqoption.core.ui.f.d {
    private static final int DAY = 86400;
    private static final int HOUR = 3600;
    private static final String TAG = b.class.getName();
    private static final io.reactivex.b.f<Throwable> aMn = d.dhV;
    private static final int dhN = 300;
    private static final int dhO = 604800;
    private static final int dhP = 2592000;
    public static final c dhQ = new c();
    private final MutableLiveData<List<com.iqoption.fragment.c.a.b.b>> dhK = new MutableLiveData();
    private final LiveData<List<com.iqoption.fragment.c.a.b.b>> dhL = this.dhK;
    private io.reactivex.disposables.b dhM;
    private final io.reactivex.disposables.b dhm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(Integer.valueOf(((com.iqoption.fragment.c.a.b.b) t).getId().intValue()), Integer.valueOf(((com.iqoption.fragment.c.a.b.b) t2).getId().intValue()));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(Integer.valueOf(((com.iqoption.fragment.c.a.b.b) t).getId().intValue()), Integer.valueOf(((com.iqoption.fragment.c.a.b.b) t2).getId().intValue()));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/fragment/infoasset/main/InfoAssetMainViewModel$Companion;", "", "()V", "DAY", "", "HOUR", "LOGGING_CONSUMER", "Lio/reactivex/functions/Consumer;", "", "MIN", "MOUNTH", "TAG", "", "kotlin.jvm.PlatformType", "WEEK", "get", "Lcom/iqoption/fragment/infoasset/main/InfoAssetMainViewModel;", "f", "Landroidx/fragment/app/Fragment;", "app_optionXRelease"})
    /* compiled from: InfoAssetMainViewModel.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(f fVar) {
            this();
        }

        public final b ad(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "f");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(f)…ainViewModel::class.java]");
            return (b) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0006\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "call"})
    /* compiled from: InfoAssetMainViewModel.kt */
    static final class g<V> implements Callable<T> {
        final /* synthetic */ com.iqoption.core.microservices.tradingengine.response.active.a dhw;

        g(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            this.dhw = aVar;
        }

        public /* synthetic */ Object call() {
            return Double.valueOf(aEa());
        }

        public final double aEa() {
            ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.dhw.getActiveId());
            if (dY == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(dY, "OptionManager.instance()…e(active.getActiveId())!!");
            return dY.getVal();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: InfoAssetMainViewModel.kt */
    /* renamed from: com.iqoption.fragment.c.c.b$1 */
    static final class AnonymousClass1<T> implements io.reactivex.b.f<com.iqoption.core.microservices.tradingengine.response.active.a> {
        final /* synthetic */ b dhR;

        AnonymousClass1(b bVar) {
            this.dhR = bVar;
        }

        /* renamed from: K */
        public final void accept(final com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            this.dhR.dispose();
            this.dhR.dhK.postValue(l.listOf(l.dhl));
            final int activeId = aVar.getActiveId();
            final InstrumentType instrumentType = aVar.getInstrumentType();
            final int precision = aVar.getPrecision();
            b bVar = this.dhR;
            final com.iqoption.core.microservices.tradingengine.response.active.a aVar2 = aVar;
            io.reactivex.disposables.b a = com.iqoption.core.microservices.fininfo.a.btx.eT(activeId).h(com.iqoption.core.rx.i.aki()).f(new io.reactivex.b.f<com.iqoption.core.microservices.fininfo.response.a>(this) {
                final /* synthetic */ AnonymousClass1 dhS;

                @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/tradersmood/response/TradersMood;", "kotlin.jvm.PlatformType", "accept"})
                /* compiled from: InfoAssetMainViewModel.kt */
                /* renamed from: com.iqoption.fragment.c.c.b$1$1$1 */
                static final class AnonymousClass1<T> implements io.reactivex.b.f<com.iqoption.core.microservices.g.a.a> {
                    final /* synthetic */ AnonymousClass1 dhU;

                    AnonymousClass1(AnonymousClass1 anonymousClass1) {
                        this.dhU = anonymousClass1;
                    }

                    /* renamed from: b */
                    public final void accept(com.iqoption.core.microservices.g.a.a aVar) {
                        b.a(this.dhU.dhS.dhR, 5, new k(aVar.getValue(), instrumentType.isOption()), false, 4, null);
                    }
                }

                @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetStatistics;", "t1", "Lcom/iqoption/core/microservices/quoteshistory/response/CandlesCompact;", "t2", "t3", "apply"})
                /* compiled from: InfoAssetMainViewModel.kt */
                /* renamed from: com.iqoption.fragment.c.c.b$1$1$2 */
                static final class AnonymousClass2<T1, T2, T3, R> implements h<com.iqoption.core.microservices.quoteshistory.response.a, com.iqoption.core.microservices.quoteshistory.response.a, com.iqoption.core.microservices.quoteshistory.response.a, com.iqoption.fragment.c.a.b.g> {
                    final /* synthetic */ AnonymousClass1 dhU;

                    AnonymousClass2(AnonymousClass1 anonymousClass1) {
                        this.dhU = anonymousClass1;
                    }

                    public final com.iqoption.fragment.c.a.b.g a(com.iqoption.core.microservices.quoteshistory.response.a aVar, com.iqoption.core.microservices.quoteshistory.response.a aVar2, com.iqoption.core.microservices.quoteshistory.response.a aVar3) {
                        kotlin.jvm.internal.i.f(aVar, "t1");
                        kotlin.jvm.internal.i.f(aVar2, "t2");
                        kotlin.jvm.internal.i.f(aVar3, "t3");
                        return new com.iqoption.fragment.c.a.b.g(precision, aVar, aVar2, aVar3);
                    }
                }

                @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetStatistics;", "kotlin.jvm.PlatformType", "accept"})
                /* compiled from: InfoAssetMainViewModel.kt */
                /* renamed from: com.iqoption.fragment.c.c.b$1$1$3 */
                static final class AnonymousClass3<T> implements io.reactivex.b.f<com.iqoption.fragment.c.a.b.g> {
                    final /* synthetic */ AnonymousClass1 dhU;

                    AnonymousClass3(AnonymousClass1 anonymousClass1) {
                        this.dhU = anonymousClass1;
                    }

                    /* renamed from: a */
                    public final void accept(com.iqoption.fragment.c.a.b.g gVar) {
                        b bVar = this.dhU.dhS.dhR;
                        kotlin.jvm.internal.i.e(gVar, "it");
                        bVar.a(gVar, activeId, precision);
                    }
                }

                @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "quote", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Double;)V"})
                /* compiled from: InfoAssetMainViewModel.kt */
                /* renamed from: com.iqoption.fragment.c.c.b$1$1$4 */
                static final class AnonymousClass4<T> implements io.reactivex.b.f<Double> {
                    final /* synthetic */ AnonymousClass1 dhU;

                    AnonymousClass4(AnonymousClass1 anonymousClass1) {
                        this.dhU = anonymousClass1;
                    }

                    /* renamed from: j */
                    public final void accept(Double d) {
                        kotlin.jvm.internal.i.e(d, "quote");
                        if (!Double.isNaN(d.doubleValue())) {
                            this.dhU.dhS.dhR.I(d.doubleValue());
                        }
                    }
                }

                @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "favoriteSet", "", "", "kotlin.jvm.PlatformType", "accept"})
                /* compiled from: InfoAssetMainViewModel.kt */
                /* renamed from: com.iqoption.fragment.c.c.b$1$1$5 */
                static final class AnonymousClass5<T> implements io.reactivex.b.f<Set<? extends Integer>> {
                    final /* synthetic */ AnonymousClass1 dhU;

                    AnonymousClass5(AnonymousClass1 anonymousClass1) {
                        this.dhU = anonymousClass1;
                    }

                    /* renamed from: k */
                    public final void accept(Set<Integer> set) {
                        this.dhU.dhS.dhR.dM(set.contains(Integer.valueOf(activeId)));
                    }
                }

                @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "apply"})
                /* compiled from: InfoAssetMainViewModel.kt */
                /* renamed from: com.iqoption.fragment.c.c.b$1$1$6 */
                static final class AnonymousClass6<T, R> implements io.reactivex.b.g<T, R> {
                    final /* synthetic */ AnonymousClass1 dhU;

                    AnonymousClass6(AnonymousClass1 anonymousClass1) {
                        this.dhU = anonymousClass1;
                    }

                    public /* synthetic */ Object apply(Object obj) {
                        return Integer.valueOf(ax((List) obj));
                    }

                    public final int ax(List<? extends com.iqoption.core.microservices.useralerts.response.a> list) {
                        kotlin.jvm.internal.i.f(list, "it");
                        Iterable<com.iqoption.core.microservices.useralerts.response.a> iterable = list;
                        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                            return 0;
                        }
                        int i = 0;
                        for (com.iqoption.core.microservices.useralerts.response.a aVar : iterable) {
                            Object obj = (aVar.getInstrumentType() == aVar2.getInstrumentType() && aVar.Bs() == activeId) ? 1 : null;
                            if (obj != null) {
                                i++;
                                if (i < 0) {
                                    m.bnp();
                                }
                            }
                        }
                        return i;
                    }
                }

                @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "alertsCount", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Integer;)V"})
                /* compiled from: InfoAssetMainViewModel.kt */
                /* renamed from: com.iqoption.fragment.c.c.b$1$1$7 */
                static final class AnonymousClass7<T> implements io.reactivex.b.f<Integer> {
                    final /* synthetic */ AnonymousClass1 dhU;

                    AnonymousClass7(AnonymousClass1 anonymousClass1) {
                        this.dhU = anonymousClass1;
                    }

                    /* renamed from: m */
                    public final void accept(Integer num) {
                        b bVar = this.dhU.dhS.dhR;
                        kotlin.jvm.internal.i.e(num, "alertsCount");
                        bVar.ge(num.intValue());
                    }
                }

                /* renamed from: a */
                public final void accept(com.iqoption.core.microservices.fininfo.response.a aVar) {
                    io.reactivex.e bkO = com.iqoption.core.microservices.g.a.bzj.e(activeId, instrumentType).bkO();
                    io.reactivex.e d = com.iqoption.core.microservices.g.a.bzj.d(activeId, instrumentType);
                    b bVar = this.dhS.dhR;
                    io.reactivex.disposables.b a = bkO.c((org.a.b) d).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new AnonymousClass1(this), b.aMn);
                    kotlin.jvm.internal.i.e(a, "initial.concatWith(updat…     }, LOGGING_CONSUMER)");
                    bVar.b(a);
                    b bVar2 = this.dhS.dhR;
                    io.reactivex.disposables.b a2 = p.a((t) com.iqoption.core.microservices.quoteshistory.a.a(activeId, b.dhN, 0, 0, 0, 0, 1, false, 188, null), (t) com.iqoption.core.microservices.quoteshistory.a.a(activeId, b.HOUR, 0, 0, 0, 0, 1, false, 188, null), (t) com.iqoption.core.microservices.quoteshistory.a.a(activeId, b.DAY, 0, 0, 0, 0, 1, false, 188, null), (h) new AnonymousClass2(this)).i((io.reactivex.b.g) new com.iqoption.core.rx.e(3, TimeUnit.SECONDS)).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new AnonymousClass3(this), b.aMn);
                    kotlin.jvm.internal.i.e(a2, "Single.zip<CandlesCompac…     }, LOGGING_CONSUMER)");
                    bVar2.b(a2);
                    bVar2 = this.dhS.dhR;
                    b bVar3 = this.dhS.dhR;
                    com.iqoption.core.microservices.tradingengine.response.active.a aVar2 = aVar2;
                    kotlin.jvm.internal.i.e(aVar2, ConditionalUserProperty.ACTIVE);
                    a2 = bVar3.R(aVar2).i((io.reactivex.b.g) new com.iqoption.core.rx.e(1, TimeUnit.SECONDS)).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new AnonymousClass4(this), b.aMn);
                    kotlin.jvm.internal.i.e(a2, "updateTitle(active)\n    …     }, LOGGING_CONSUMER)");
                    bVar2.b(a2);
                    bVar2 = this.dhS.dhR;
                    a2 = com.iqoption.asset.repository.a.aye.s(aVar2.getInstrumentType()).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new AnonymousClass5(this), b.aMn);
                    kotlin.jvm.internal.i.e(a2, "AssetFavoritesRepository…     }, LOGGING_CONSUMER)");
                    bVar2.b(a2);
                    bVar2 = this.dhS.dhR;
                    a2 = com.iqoption.alerts.data.a.aoa.AW().g(new AnonymousClass6(this)).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new AnonymousClass7(this), b.aMn);
                    kotlin.jvm.internal.i.e(a2, "AlertsRepository.getAler…     }, LOGGING_CONSUMER)");
                    bVar2.b(a2);
                }
            }).a((io.reactivex.b.f) new io.reactivex.b.f<com.iqoption.core.microservices.fininfo.response.a>(this) {
                final /* synthetic */ AnonymousClass1 dhS;

                /* renamed from: a */
                public final void accept(com.iqoption.core.microservices.fininfo.response.a aVar) {
                    b bVar;
                    com.iqoption.core.microservices.tradingengine.response.active.a aVar2;
                    Object a;
                    com.iqoption.core.microservices.fininfo.response.d adS = aVar.adQ().adS();
                    FinInfoType adW = adS.adW();
                    String str = ConditionalUserProperty.ACTIVE;
                    if (adW != null) {
                        int i = c.aob[adW.ordinal()];
                        if (i == 1) {
                            bVar = this.dhS.dhR;
                            aVar2 = aVar;
                            kotlin.jvm.internal.i.e(aVar2, str);
                            a = bVar.a(adS, aVar2);
                        } else if (i == 2) {
                            bVar = this.dhS.dhR;
                            aVar2 = aVar;
                            kotlin.jvm.internal.i.e(aVar2, str);
                            a = bVar.b(adS, aVar2);
                        }
                        this.dhS.dhR.dhK.postValue(a);
                    }
                    bVar = this.dhS.dhR;
                    aVar2 = aVar;
                    kotlin.jvm.internal.i.e(aVar2, str);
                    a = bVar.c(adS, aVar2);
                    this.dhS.dhR.dhK.postValue(a);
                }
            }, b.aMn);
            kotlin.jvm.internal.i.e(a, "FinInfoRequests.getFinIn…     }, LOGGING_CONSUMER)");
            bVar.b(a);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: InfoAssetMainViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<Throwable> {
        public static final d dhV = new d();

        d() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetStatisticsFull;", "t1", "Lcom/iqoption/core/microservices/quoteshistory/response/CandlesCompact;", "t2", "apply"})
    /* compiled from: InfoAssetMainViewModel.kt */
    static final class e<T1, T2, R> implements io.reactivex.b.c<com.iqoption.core.microservices.quoteshistory.response.a, com.iqoption.core.microservices.quoteshistory.response.a, com.iqoption.fragment.c.a.b.h> {
        final /* synthetic */ int $activeId;
        final /* synthetic */ int dhT;

        e(int i, int i2) {
            this.$activeId = i;
            this.dhT = i2;
        }

        /* renamed from: a */
        public final com.iqoption.fragment.c.a.b.h apply(com.iqoption.core.microservices.quoteshistory.response.a aVar, com.iqoption.core.microservices.quoteshistory.response.a aVar2) {
            kotlin.jvm.internal.i.f(aVar, "t1");
            kotlin.jvm.internal.i.f(aVar2, "t2");
            return new com.iqoption.fragment.c.a.b.h(this.$activeId, this.dhT, aVar, aVar2);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetStatisticsFull;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: InfoAssetMainViewModel.kt */
    static final class f<T> implements io.reactivex.b.f<com.iqoption.fragment.c.a.b.h> {
        final /* synthetic */ b dhR;

        f(b bVar) {
            this.dhR = bVar;
        }

        /* renamed from: b */
        public final void accept(com.iqoption.fragment.c.a.b.h hVar) {
            b bVar = this.dhR;
            int intValue = hVar.getId().intValue();
            kotlin.jvm.internal.i.e(hVar, "it");
            b.a(bVar, intValue, hVar, false, 4, null);
        }
    }

    public b() {
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        io.reactivex.disposables.b e = IM.IP().d(com.iqoption.core.rx.i.aki()).e((io.reactivex.b.f) new AnonymousClass1(this));
        kotlin.jvm.internal.i.e(e, "TabHelper.instance().cur…red()\n\n\n                }");
        this.dhm = e;
    }

    public final LiveData<List<com.iqoption.fragment.c.a.b.b>> aDU() {
        return this.dhL;
    }

    @MainThread
    static /* synthetic */ void a(b bVar, int i, com.iqoption.fragment.c.a.b.b bVar2, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        bVar.a(i, bVar2, z);
    }

    @MainThread
    private final void a(int i, com.iqoption.fragment.c.a.b.b bVar, boolean z) {
        List<com.iqoption.fragment.c.a.b.b> list = (List) this.dhK.getValue();
        if (list != null) {
            kotlin.jvm.internal.i.e(list, "items");
            int i2 = 0;
            for (com.iqoption.fragment.c.a.b.b JR : list) {
                if ((JR.getId().intValue() == i ? 1 : null) != null) {
                    break;
                }
                i2++;
            }
            i2 = -1;
            if (i2 >= 0) {
                this.dhK.setValue(com.iqoption.core.ext.c.a((List) list, i2, (Object) bVar));
            } else if (z) {
                this.dhK.setValue(u.a((Iterable) com.iqoption.core.ext.c.a((List) list, (Object) bVar, 0, 2, null), (Comparator) new a()));
            }
        }
    }

    @MainThread
    private final void a(com.iqoption.fragment.c.a.b.g gVar, int i, int i2) {
        com.iqoption.fragment.c.a.b.g gVar2 = gVar;
        List<com.iqoption.fragment.c.a.b.b> list = (List) this.dhK.getValue();
        if (list != null) {
            double d = ((gVar.aDF().agP()[0] - gVar.aDF().agO()[0]) / gVar.aDF().agP()[0]) * 100.0d;
            kotlin.jvm.internal.i.e(list, "items");
            int i3 = 0;
            for (com.iqoption.fragment.c.a.b.b JR : list) {
                if ((JR.getId().intValue() == gVar.getId().intValue() ? 1 : null) != null) {
                    break;
                }
                i3++;
            }
            i3 = -1;
            if (i3 >= 0) {
                MutableLiveData mutableLiveData = this.dhK;
                List I = u.I(list);
                I.set(i3, gVar2);
                Object obj = list.get(0);
                if (!(obj instanceof j)) {
                    obj = null;
                }
                j jVar = (j) obj;
                if (jVar != null) {
                    com.iqoption.fragment.c.a.b.b bVar = (com.iqoption.fragment.c.a.b.b) I.set(0, j.a(jVar, null, null, Double.valueOf(d), 0, null, 0, null, null, 251, null));
                }
                mutableLiveData.setValue(I);
                return;
            }
            MutableLiveData mutableLiveData2 = this.dhK;
            List I2 = u.I(list);
            Object obj2 = list.get(0);
            if (!(obj2 instanceof j)) {
                obj2 = null;
            }
            j jVar2 = (j) obj2;
            if (jVar2 != null) {
                com.iqoption.fragment.c.a.b.b bVar2 = (com.iqoption.fragment.c.a.b.b) I2.set(0, j.a(jVar2, null, null, Double.valueOf(d), 0, null, 0, null, null, 251, null));
            }
            I2.add(gVar2);
            I2.add(new com.iqoption.fragment.c.a.b.i(i, i2));
            mutableLiveData2.setValue(u.a((Iterable) I2, (Comparator) new b()));
        }
    }

    @MainThread
    private final void removeItem(int i) {
        List<com.iqoption.fragment.c.a.b.b> list = (List) this.dhK.getValue();
        if (list != null) {
            kotlin.jvm.internal.i.e(list, "items");
            int i2 = 0;
            for (com.iqoption.fragment.c.a.b.b JR : list) {
                if ((JR.getId().intValue() == i ? 1 : null) != null) {
                    break;
                }
                i2++;
            }
            i2 = -1;
            if (i2 >= 0) {
                this.dhK.setValue(com.iqoption.core.ext.c.b((List) list, i2));
            }
        }
    }

    @MainThread
    private final void I(double d) {
        List list = (List) this.dhK.getValue();
        if (list != null) {
            Object obj = list.get(0);
            if (!(obj instanceof j)) {
                obj = null;
            }
            j jVar = (j) obj;
            if (jVar != null) {
                MutableLiveData mutableLiveData = this.dhK;
                kotlin.jvm.internal.i.e(list, "items");
                mutableLiveData.setValue(com.iqoption.core.ext.c.a(list, 0, j.a(jVar, null, Double.valueOf(d), null, 0, null, 0, null, null, 253, null)));
            }
        }
    }

    @MainThread
    private final void dM(boolean z) {
        List list = (List) this.dhK.getValue();
        if (list != null) {
            Object obj = list.get(0);
            if (!(obj instanceof j)) {
                obj = null;
            }
            j jVar = (j) obj;
            if (jVar != null) {
                MutableLiveData mutableLiveData = this.dhK;
                kotlin.jvm.internal.i.e(list, "items");
                mutableLiveData.setValue(com.iqoption.core.ext.c.a(list, 0, j.a(jVar, null, null, null, 0, Boolean.valueOf(z), 0, null, null, 239, null)));
            }
        }
    }

    @MainThread
    private final void ge(int i) {
        List list = (List) this.dhK.getValue();
        if (list != null) {
            Object obj = list.get(0);
            String str = null;
            if (!(obj instanceof j)) {
                obj = null;
            }
            j jVar = (j) obj;
            if (jVar != null) {
                MutableLiveData mutableLiveData = this.dhK;
                kotlin.jvm.internal.i.e(list, "items");
                Integer valueOf = Integer.valueOf(i);
                if ((((Number) valueOf).intValue() > 0 ? 1 : null) == null) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    str = String.valueOf(valueOf.intValue());
                }
                mutableLiveData.setValue(com.iqoption.core.ext.c.a(list, 0, j.a(jVar, null, null, null, 0, null, 0, null, str != null ? str : "", 127, null)));
            }
        }
    }

    /* JADX WARNING: Missing block: B:3:0x000a, code skipped:
            if (r0 != null) goto L_0x0011;
     */
    private final java.util.List<com.iqoption.fragment.c.a.b.b> a(com.iqoption.core.microservices.fininfo.response.d r6, com.iqoption.core.microservices.tradingengine.response.active.a r7) {
        /*
        r5 = this;
        r0 = r6.adV();
        if (r0 == 0) goto L_0x000d;
    L_0x0006:
        r0 = r0.adZ();
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0011;
    L_0x000d:
        r0 = com.iqoption.core.microservices.tradingengine.response.active.d.B(r7);
    L_0x0011:
        r7 = r5.a(r0, r7);
        r0 = r5.aDV();
        r1 = 0;
        if (r0 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x0034;
    L_0x001d:
        r0 = r6.adV();
        if (r0 == 0) goto L_0x0034;
    L_0x0023:
        r0 = r0.adY();
        if (r0 == 0) goto L_0x0034;
    L_0x0029:
        r0 = r0.adR();
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r1 = new com.iqoption.fragment.c.a.b.e;
        r1.<init>(r0);
    L_0x0034:
        r0 = new com.iqoption.fragment.c.a.b.c;
        r2 = r6.adV();
        r3 = r6.adT();
        r4 = r6.adU();
        r6 = r6.adX();
        r0.<init>(r2, r3, r4, r6);
        r6 = 3;
        r6 = new com.iqoption.fragment.c.a.b.b[r6];
        r2 = 0;
        r7 = (com.iqoption.fragment.c.a.b.b) r7;
        r6[r2] = r7;
        r7 = 1;
        r1 = (com.iqoption.fragment.c.a.b.b) r1;
        r6[r7] = r1;
        r7 = 2;
        r0 = (com.iqoption.fragment.c.a.b.b) r0;
        r6[r7] = r0;
        r6 = kotlin.collections.m.M(r6);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.c.c.b.a(com.iqoption.core.microservices.fininfo.response.d, com.iqoption.core.microservices.tradingengine.response.active.a):java.util.List");
    }

    /* JADX WARNING: Missing block: B:3:0x000a, code skipped:
            if (r0 != null) goto L_0x0011;
     */
    private final java.util.List<com.iqoption.fragment.c.a.b.b> b(com.iqoption.core.microservices.fininfo.response.d r5, com.iqoption.core.microservices.tradingengine.response.active.a r6) {
        /*
        r4 = this;
        r0 = r5.adV();
        if (r0 == 0) goto L_0x000d;
    L_0x0006:
        r0 = r0.getName();
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0011;
    L_0x000d:
        r0 = com.iqoption.core.microservices.tradingengine.response.active.d.B(r6);
    L_0x0011:
        r6 = r4.a(r0, r6);
        r0 = new com.iqoption.fragment.c.a.b.c;
        r1 = r5.adV();
        r2 = r5.adT();
        r3 = r5.adU();
        r5 = r5.adX();
        r0.<init>(r1, r2, r3, r5);
        r5 = 2;
        r5 = new com.iqoption.fragment.c.a.b.b[r5];
        r1 = 0;
        r6 = (com.iqoption.fragment.c.a.b.b) r6;
        r5[r1] = r6;
        r6 = 1;
        r0 = (com.iqoption.fragment.c.a.b.b) r0;
        r5[r6] = r0;
        r5 = kotlin.collections.m.listOf(r5);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.c.c.b.b(com.iqoption.core.microservices.fininfo.response.d, com.iqoption.core.microservices.tradingengine.response.active.a):java.util.List");
    }

    /* JADX WARNING: Missing block: B:3:0x000a, code skipped:
            if (r0 != null) goto L_0x0011;
     */
    private final java.util.List<com.iqoption.fragment.c.a.b.b> c(com.iqoption.core.microservices.fininfo.response.d r6, com.iqoption.core.microservices.tradingengine.response.active.a r7) {
        /*
        r5 = this;
        r0 = r6.adV();
        if (r0 == 0) goto L_0x000d;
    L_0x0006:
        r0 = r0.adZ();
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0011;
    L_0x000d:
        r0 = com.iqoption.core.microservices.tradingengine.response.active.d.B(r7);
    L_0x0011:
        r7 = r5.a(r0, r7);
        r0 = r5.aDV();
        r1 = 0;
        if (r0 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x0034;
    L_0x001d:
        r0 = r6.adV();
        if (r0 == 0) goto L_0x0034;
    L_0x0023:
        r0 = r0.adY();
        if (r0 == 0) goto L_0x0034;
    L_0x0029:
        r0 = r0.adR();
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r1 = new com.iqoption.fragment.c.a.b.d;
        r1.<init>(r0);
    L_0x0034:
        r0 = new com.iqoption.fragment.c.a.b.c;
        r2 = r6.adV();
        r3 = r6.adT();
        r4 = r6.adU();
        r6 = r6.adX();
        r0.<init>(r2, r3, r4, r6);
        r6 = 3;
        r6 = new com.iqoption.fragment.c.a.b.b[r6];
        r2 = 0;
        r7 = (com.iqoption.fragment.c.a.b.b) r7;
        r6[r2] = r7;
        r7 = 1;
        r1 = (com.iqoption.fragment.c.a.b.b) r1;
        r6[r7] = r1;
        r7 = 2;
        r0 = (com.iqoption.fragment.c.a.b.b) r0;
        r6[r7] = r0;
        r6 = kotlin.collections.m.M(r6);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.c.c.b.c(com.iqoption.core.microservices.fininfo.response.d, com.iqoption.core.microservices.tradingengine.response.active.a):java.util.List");
    }

    private final boolean aDV() {
        return kotlin.jvm.internal.i.y("enabled-without-mkt", com.iqoption.app.managers.feature.a.eh("asset-info"));
    }

    private final j a(String str, com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(aVar.getActiveId());
        return new j(str, dY != null ? Double.valueOf(dY.getVal()) : null, null, aVar.getPrecision(), null, aVar.getActiveId(), aVar.getInstrumentType(), "");
    }

    private final p<Double> R(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        p cJ = p.j(new g(aVar)).cJ(Double.valueOf(kotlin.jvm.internal.g.eWa.bnG()));
        kotlin.jvm.internal.i.e(cJ, "Single.fromCallable { Op…rorReturnItem(Double.NaN)");
        return cJ;
    }

    public final void a(j jVar) {
        kotlin.jvm.internal.i.f(jVar, "item");
        Boolean aDK = jVar.aDK();
        if (aDK != null) {
            if (aDK.booleanValue()) {
                com.iqoption.asset.repository.a.aye.c(jVar.getActiveId(), jVar.getInstrumentType());
            } else {
                com.iqoption.asset.repository.a.aye.b(jVar.getActiveId(), jVar.getInstrumentType());
            }
        }
        com.iqoption.fragment.c.a.dgs.aDc();
    }

    public final void a(com.iqoption.fragment.c.a.b.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "item");
        a(this, dVar.getId().intValue(), new com.iqoption.fragment.c.a.b.f(dVar.adR()), false, 4, null);
    }

    public final void a(com.iqoption.fragment.c.a.b.f fVar) {
        kotlin.jvm.internal.i.f(fVar, "item");
        a(this, fVar.getId().intValue(), new com.iqoption.fragment.c.a.b.d(fVar.adR()), false, 4, null);
    }

    public final void a(com.iqoption.fragment.c.a.b.i iVar) {
        kotlin.jvm.internal.i.f(iVar, "item");
        int activeId = iVar.getActiveId();
        int precision = iVar.getPrecision();
        removeItem(iVar.getId().intValue());
        aDW();
        int i = activeId;
        this.dhM = p.a(com.iqoption.core.microservices.quoteshistory.a.a(i, dhO, 0, 0, 0, 0, 1, false, 188, null), com.iqoption.core.microservices.quoteshistory.a.a(i, dhP, 0, 0, 0, 0, 1, false, 188, null), new e(activeId, precision)).i((io.reactivex.b.g) new com.iqoption.core.rx.e(30, TimeUnit.SECONDS)).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new f(this), aMn);
        com.iqoption.fragment.c.a.dgs.aDd();
    }

    public final void a(com.iqoption.fragment.c.a.b.h hVar) {
        kotlin.jvm.internal.i.f(hVar, "item");
        aDW();
        a(this, hVar.getId().intValue(), new com.iqoption.fragment.c.a.b.i(hVar.getActiveId(), hVar.getPrecision()), false, 4, null);
    }

    private final void aDW() {
        io.reactivex.disposables.b bVar = this.dhM;
        if (bVar != null && !bVar.isDisposed()) {
            bVar.dispose();
        }
    }

    public void dispose() {
        super.dispose();
        aDW();
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        this.dhm.dispose();
    }
}
