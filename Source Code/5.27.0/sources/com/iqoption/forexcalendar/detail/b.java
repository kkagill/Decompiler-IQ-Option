package com.iqoption.forexcalendar.detail;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStores;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.ui.f.d;
import com.iqoption.forexcalendar.detail.a.e;
import io.reactivex.b.f;
import io.reactivex.b.g;
import io.reactivex.p;
import io.reactivex.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0007\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\fX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, bng = {"Lcom/iqoption/forexcalendar/detail/ForexCalendarDetailViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "idEvent", "", "(J)V", "assetAffectedItems", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedAdapterItem;", "getAssetAffectedItems", "()Landroidx/lifecycle/LiveData;", "assetAffectedItemsData", "Landroidx/lifecycle/MutableLiveData;", "infoHistoryDescr", "", "getInfoHistoryDescr", "infoHistoryDescrData", "infoHistoryTitle", "getInfoHistoryTitle", "infoHistoryTitleData", "marketAnalysisViewModel", "Lcom/iqoption/core/marketanalysis/MarketAnalysisViewModel;", "Lio/reactivex/Single;", "Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedItem;", "it", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEventInfo;", "onActiveClicked", "", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveIdentifier;", "Companion", "forexcalendar_release"})
/* compiled from: ForexCalendarDetailViewModel.kt */
public final class b extends d {
    private static final String TAG = b.class.getName();
    private static final f<Throwable> aMn = b.cTF;
    private static long cTB;
    public static final a cTC = new a();
    private com.iqoption.core.marketanalysis.f cNr;
    private final LiveData<String> cTA = this.cTz;
    private final MutableLiveData<List<com.iqoption.forexcalendar.detail.a.b>> cTv = new MutableLiveData();
    private final LiveData<List<com.iqoption.forexcalendar.detail.a.b>> cTw = this.cTv;
    private final MutableLiveData<String> cTx = new MutableLiveData();
    private final LiveData<String> cTy = this.cTx;
    private final MutableLiveData<String> cTz = new MutableLiveData();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEventInfo;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ForexCalendarDetailViewModel.kt */
    /* renamed from: com.iqoption.forexcalendar.detail.b$2 */
    static final class AnonymousClass2<T> implements f<com.iqoption.core.microservices.b.a.b> {
        final /* synthetic */ b cTE;

        AnonymousClass2(b bVar) {
            this.cTE = bVar;
        }

        /* renamed from: b */
        public final void accept(com.iqoption.core.microservices.b.a.b bVar) {
            this.cTE.cTx.postValue(bVar.getInfo());
            this.cTE.cTz.postValue(bVar.getDescription());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "", "Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedItem;", "it", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEventInfo;", "apply"})
    /* compiled from: ForexCalendarDetailViewModel.kt */
    /* renamed from: com.iqoption.forexcalendar.detail.b$3 */
    static final class AnonymousClass3<T, R> implements g<T, t<? extends R>> {
        final /* synthetic */ b cTE;

        AnonymousClass3(b bVar) {
            this.cTE = bVar;
        }

        /* renamed from: c */
        public final p<List<com.iqoption.forexcalendar.detail.a.c>> apply(com.iqoption.core.microservices.b.a.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return this.cTE.a(bVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "list", "", "Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedItem;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ForexCalendarDetailViewModel.kt */
    /* renamed from: com.iqoption.forexcalendar.detail.b$4 */
    static final class AnonymousClass4<T> implements f<List<? extends com.iqoption.forexcalendar.detail.a.c>> {
        final /* synthetic */ b cTE;

        AnonymousClass4(b bVar) {
            this.cTE = bVar;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.forexcalendar.detail.a.c> list) {
            this.cTE.cTv.postValue(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u000b\u001a\u0002H\f\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lcom/iqoption/forexcalendar/detail/ForexCalendarDetailViewModel$Companion;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "ID_EVENT", "", "LOGGING_CONSUMER", "Lio/reactivex/functions/Consumer;", "", "TAG", "", "kotlin.jvm.PlatformType", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "get", "Lcom/iqoption/forexcalendar/detail/ForexCalendarDetailViewModel;", "f", "Landroidx/fragment/app/Fragment;", "idEvent", "forexcalendar_release"})
    /* compiled from: ForexCalendarDetailViewModel.kt */
    public static final class a implements Factory {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public <T extends ViewModel> T create(Class<T> cls) {
            kotlin.jvm.internal.i.f(cls, "modelClass");
            return new b(b.cTB);
        }

        public final b b(Fragment fragment, long j) {
            kotlin.jvm.internal.i.f(fragment, "f");
            a aVar = this;
            b.cTB = j;
            ViewModel viewModel = new ViewModelProvider(ViewModelStores.of(fragment), (Factory) this).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(f)\n    }[T::class.java]");
            b bVar = (b) viewModel;
            bVar.cNr = com.iqoption.core.marketanalysis.f.blw.k(com.iqoption.core.ext.a.r(fragment));
            return bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ForexCalendarDetailViewModel.kt */
    static final class b<T> implements f<Throwable> {
        public static final b cTF = new b();

        b() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedItem;", "actives", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "apply"})
    /* compiled from: ForexCalendarDetailViewModel.kt */
    static final class c<T, R> implements g<T, R> {
        final /* synthetic */ com.iqoption.core.microservices.b.a.b cTG;

        c(com.iqoption.core.microservices.b.a.b bVar) {
            this.cTG = bVar;
        }

        public final List<com.iqoption.forexcalendar.detail.a.c> apply(List<com.iqoption.asset.mediators.a> list) {
            kotlin.jvm.internal.i.f(list, "actives");
            Set V = u.V(this.cTG.adw());
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (V.contains(Integer.valueOf(((com.iqoption.asset.mediators.a) next).Jt().getActiveId()))) {
                    arrayList.add(next);
                }
            }
            Iterable<com.iqoption.asset.mediators.a> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(n.e(iterable, 10));
            for (com.iqoption.asset.mediators.a aVar : iterable) {
                arrayList2.add(new com.iqoption.forexcalendar.detail.a.c(aVar.Jt(), aVar.JS()));
            }
            return (List) arrayList2;
        }
    }

    public b(long j) {
        this.cTv.setValue(l.listOf(e.cTM));
        io.reactivex.disposables.b a = com.iqoption.core.microservices.b.a.bsO.aA(l.listOf(Long.valueOf(j))).t(AnonymousClass1.cTD).h((f) new AnonymousClass2(this)).q(new AnonymousClass3(this)).h(com.iqoption.core.rx.i.aki()).a((f) new AnonymousClass4(this), aMn);
        kotlin.jvm.internal.i.e(a, "EconomicCalendarRequests…     }, LOGGING_CONSUMER)");
        b(a);
    }

    public final LiveData<List<com.iqoption.forexcalendar.detail.a.b>> awM() {
        return this.cTw;
    }

    public final LiveData<String> awN() {
        return this.cTy;
    }

    public final LiveData<String> awO() {
        return this.cTA;
    }

    private final p<List<com.iqoption.forexcalendar.detail.a.c>> a(com.iqoption.core.microservices.b.a.b bVar) {
        return com.iqoption.asset.mediators.b.axN.a(new com.iqoption.asset.mediators.c(InstrumentType.FOREX_INSTRUMENT, null, false, 6, null)).bkV().t(new c(bVar));
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
