package com.iqoption.fragment.leftpanel;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.l;
import io.reactivex.p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 ;2\u00020\u0001:\u0002;<B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cJ\u0010\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cH\u0002J\u0014\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140)H\u0002J\u0014\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140)H\u0002J\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140)H\u0002J\u0006\u0010\u0011\u001a\u00020\tJ\b\u0010+\u001a\u00020%H\u0014J\u0016\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.J\u000e\u00100\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cJ\u001a\u00101\u001a\u00020%2\b\u00102\u001a\u0004\u0018\u00010\u001c2\u0006\u0010&\u001a\u00020\u001cH\u0002J\u0016\u00103\u001a\u00020%2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0018\u00105\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\tH\u0002J\u000e\u00107\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cJ\u0006\u00108\u001a\u00020%J\u000e\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X.¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\rX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\b8F¢\u0006\u0006\u001a\u0004\b \u0010\u000bR\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000¨\u0006="}, bng = {"Lcom/iqoption/fragment/leftpanel/LeftPanelViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "eventHandler", "Lcom/iqoption/fragment/leftpanel/LeftPanelViewModel$EventHandler;", "hasNewVideos", "Landroidx/lifecycle/LiveData;", "", "getHasNewVideos", "()Landroidx/lifecycle/LiveData;", "hasNewVideosData", "Landroidx/lifecycle/MutableLiveData;", "hasOpenedPositions", "getHasOpenedPositions", "hasOpenedPositionsData", "isExpanded", "isExpandedData", "listLeftPanel", "", "Lcom/iqoption/fragment/leftpanel/LeftPanelItem;", "marketAnalysisClickedActive", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveIdentifier;", "getMarketAnalysisClickedActive", "marketAnalysisViewModel", "Lcom/iqoption/core/marketanalysis/MarketAnalysisViewModel;", "openedSection", "Lcom/iqoption/fragment/leftpanel/LeftPanelSection;", "getOpenedSection", "openedSectionData", "sections", "getSections", "sectionsData", "store", "Lcom/iqoption/core/data/filestore/FileStore;", "close", "", "section", "closeSection", "getDefaultSections", "Lio/reactivex/Single;", "getSaveSections", "onCleared", "onItemMove", "fromPosition", "", "toPosition", "open", "openSection", "opened", "scheduleRewriteSections", "list", "sendAnalyticsEvent", "isOpen", "toggle", "toggleExpanded", "toggleVisible", "item", "Companion", "EventHandler", "app_optionXRelease"})
/* compiled from: LeftPanelViewModel.kt */
public final class i extends ViewModel {
    private static final String KEY = KEY;
    private static final String TAG = i.class.getSimpleName();
    public static final a dkm = new a();
    private final com.iqoption.core.data.a.a aCR = com.iqoption.core.data.a.b.fH("leftpanel/setting_left_panel");
    private final io.reactivex.disposables.a bJT = new io.reactivex.disposables.a();
    private com.iqoption.core.marketanalysis.f cNr;
    private final MutableLiveData<Boolean> dkf;
    private final MutableLiveData<Boolean> dkg = new MutableLiveData();
    private final MutableLiveData<Boolean> dkh = new MutableLiveData();
    private final MutableLiveData<List<f>> dki = new MutableLiveData();
    private final MutableLiveData<LeftPanelSection> dkj = new MutableLiveData();
    private final b dkk = new b();
    private List<f> dkl;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/fragment/leftpanel/LeftPanelViewModel$Companion;", "", "()V", "KEY", "", "TAG", "kotlin.jvm.PlatformType", "get", "Lcom/iqoption/fragment/leftpanel/LeftPanelViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: LeftPanelViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final i r(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(i.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…nelViewModel::class.java]");
            i iVar = (i) viewModel;
            iVar.cNr = com.iqoption.core.marketanalysis.f.blw.k(fragmentActivity);
            return iVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "Lcom/iqoption/fragment/leftpanel/LeftPanelItem;", "call"})
    /* compiled from: LeftPanelViewModel.kt */
    static final class c<V> implements Callable<T> {
        final /* synthetic */ i dkn;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"})
        /* compiled from: LeftPanelViewModel.kt */
        /* renamed from: com.iqoption.fragment.leftpanel.i$c$2 */
        static final class AnonymousClass2<T> implements io.reactivex.b.f<Boolean> {
            final /* synthetic */ c dkq;

            AnonymousClass2(c cVar) {
                this.dkq = cVar;
            }

            /* renamed from: j */
            public final void accept(Boolean bool) {
                this.dkq.dkn.dkh.postValue(bool);
            }
        }

        c(i iVar) {
            this.dkn = iVar;
        }

        public final List<f> call() {
            List arrayList = new ArrayList();
            arrayList.add(new f(LeftPanelSection.PORTFOIO, false, false, 6, null));
            if (!com.iqoption.core.d.Un().Dq()) {
                if (com.iqoption.app.managers.feature.a.ef("smart-feed")) {
                    arrayList.add(new f(LeftPanelSection.MARKET_ANALYSIS, false, false, 6, null));
                }
                arrayList.add(new f(LeftPanelSection.PRICE_MOVEMENTS, false, false, 6, null));
                if (com.iqoption.app.managers.feature.a.ef("video-education")) {
                    this.dkn.bJT.e(com.iqoption.videoeducation.i.aXl().g(AnonymousClass1.dkp).d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new AnonymousClass2(this), (io.reactivex.b.f) AnonymousClass3.dkr));
                    arrayList.add(new f(LeftPanelSection.VIDEO_EDUCATION, false, false, 6, null));
                }
                arrayList.add(new f(LeftPanelSection.CHATS, false, false, 6, null));
                if (com.iqoption.app.managers.feature.a.ef("otn-token")) {
                    arrayList.add(new f(LeftPanelSection.OTN, false, false, 6, null));
                }
                arrayList.add(new f(LeftPanelSection.MORE, false, false, 6, null));
            }
            return u.T(arrayList);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "Lcom/iqoption/fragment/leftpanel/LeftPanelItem;", "call"})
    /* compiled from: LeftPanelViewModel.kt */
    static final class d<V> implements Callable<T> {
        final /* synthetic */ i dkn;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/ext/GsonExt$parseGson$$inlined$typeOf$2"})
        /* compiled from: GsonExtensions.kt */
        public static final class a extends TypeToken<List<? extends f>> {
        }

        d(i iVar) {
            this.dkn = iVar;
        }

        public final List<f> call() {
            String r = this.dkn.aCR.r(i.KEY);
            if (r == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            Gson Ez = com.iqoption.core.d.Um().Ez();
            Type type = new a().getType();
            kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
            return (List) Ez.fromJson(r, type);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: LeftPanelViewModel.kt */
    static final class f implements Runnable {
        final /* synthetic */ i dkn;
        final /* synthetic */ List dkt;

        f(i iVar, List list) {
            this.dkn = iVar;
            this.dkt = list;
        }

        public final void run() {
            this.dkn.aCR.ae(i.KEY, com.iqoption.core.ext.d.a(this.dkt, null, 1, null));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "items", "", "Lcom/iqoption/fragment/leftpanel/LeftPanelItem;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LeftPanelViewModel.kt */
    /* renamed from: com.iqoption.fragment.leftpanel.i$1 */
    static final class AnonymousClass1<T> implements io.reactivex.b.f<List<? extends f>> {
        final /* synthetic */ i dkn;

        AnonymousClass1(i iVar) {
            this.dkn = iVar;
        }

        /* renamed from: v */
        public final void accept(List<f> list) {
            i iVar = this.dkn;
            kotlin.jvm.internal.i.e(list, "items");
            iVar.dkl = list;
            MutableLiveData f = this.dkn.dki;
            Collection arrayList = new ArrayList();
            for (Object next : i.e(this.dkn)) {
                if (((f) next).isVisible()) {
                    arrayList.add(next);
                }
            }
            f.setValue((List) arrayList);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/fragment/leftpanel/LeftPanelViewModel$EventHandler;", "Lcom/iqoption/system/event/EventHandlerBase;", "(Lcom/iqoption/fragment/leftpanel/LeftPanelViewModel;)V", "onEvent", "", "event", "Lcom/iqoption/mobbtech/connect/response/options/OptionEvents$OpenOptionGroupsChangeEvents;", "app_optionXRelease"})
    /* compiled from: LeftPanelViewModel.kt */
    public final class b extends com.iqoption.system.a.d {
        @com.google.common.b.e
        public final void onEvent(l lVar) {
            kotlin.jvm.internal.i.f(lVar, "event");
            MutableLiveData a = i.this.dkg;
            com.iqoption.app.managers.c GS = com.iqoption.app.managers.c.GS();
            kotlin.jvm.internal.i.e(GS, "OptionManager.instance()");
            a.postValue(Boolean.valueOf(GS.GV() ^ 1));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "Lcom/iqoption/fragment/leftpanel/LeftPanelItem;", "defaultList", "", "saveList", "apply"})
    /* compiled from: LeftPanelViewModel.kt */
    static final class e<T1, T2, R> implements io.reactivex.b.c<List<? extends f>, List<? extends f>, List<? extends f>> {
        public static final e dks = new e();

        e() {
        }

        /* renamed from: f */
        public final List<f> apply(List<f> list, List<f> list2) {
            f fVar;
            Object obj;
            Object obj2;
            kotlin.jvm.internal.i.f(list, "defaultList");
            kotlin.jvm.internal.i.f(list2, "saveList");
            Iterable iterable = list2;
            Collection arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (true) {
                Object obj3 = null;
                Object obj4 = 1;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                fVar = (f) next;
                for (Object obj5 : list) {
                    if (((f) obj5).aEJ() == fVar.aEJ()) {
                        obj2 = 1;
                        continue;
                    } else {
                        obj2 = null;
                        continue;
                    }
                    if (obj2 != null) {
                        obj3 = obj5;
                        break;
                    }
                }
                if (obj3 == null) {
                    obj4 = null;
                }
                if (obj4 != null) {
                    arrayList.add(next);
                }
            }
            List I = u.I((List) arrayList);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                fVar = (f) list.get(i);
                for (Object obj52 : iterable) {
                    if (((f) obj52).aEJ() == fVar.aEJ()) {
                        obj2 = 1;
                        continue;
                    } else {
                        obj2 = null;
                        continue;
                    }
                    if (obj2 != null) {
                        break;
                    }
                }
                obj52 = null;
                if (obj52 == null) {
                    I.add(i, fVar);
                }
            }
            return I;
        }
    }

    public static final i r(FragmentActivity fragmentActivity) {
        return dkm.r(fragmentActivity);
    }

    public i() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Boolean.valueOf(false));
        this.dkf = mutableLiveData;
        mutableLiveData = this.dkg;
        com.iqoption.app.managers.c GS = com.iqoption.app.managers.c.GS();
        kotlin.jvm.internal.i.e(GS, "OptionManager.instance()");
        mutableLiveData.setValue(Boolean.valueOf(GS.GV() ^ 1));
        this.bJT.e(aER().h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new AnonymousClass1(this), (io.reactivex.b.f) AnonymousClass2.dko));
        this.dkk.register();
    }

    public final LiveData<com.iqoption.core.microservices.tradingengine.response.active.f> aEK() {
        com.iqoption.core.marketanalysis.f fVar = this.cNr;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("marketAnalysisViewModel");
        }
        return fVar.Zb();
    }

    public final LiveData<Boolean> aEL() {
        return this.dkf;
    }

    public final LiveData<Boolean> aEM() {
        return this.dkg;
    }

    public final LiveData<Boolean> aEN() {
        return this.dkh;
    }

    public final LiveData<List<f>> aEO() {
        return this.dki;
    }

    public final LiveData<LeftPanelSection> aEP() {
        return this.dkj;
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        this.dkk.unregister();
        this.bJT.clear();
    }

    public final void b(LeftPanelSection leftPanelSection) {
        kotlin.jvm.internal.i.f(leftPanelSection, "section");
        if (((LeftPanelSection) this.dkj.getValue()) == leftPanelSection) {
            e(leftPanelSection);
        }
    }

    public final void c(LeftPanelSection leftPanelSection) {
        kotlin.jvm.internal.i.f(leftPanelSection, "section");
        if (nq()) {
            aEQ();
        }
        LeftPanelSection leftPanelSection2 = (LeftPanelSection) this.dkj.getValue();
        if (leftPanelSection2 != leftPanelSection) {
            a(leftPanelSection2, leftPanelSection);
        }
    }

    public final void d(LeftPanelSection leftPanelSection) {
        kotlin.jvm.internal.i.f(leftPanelSection, "section");
        if (nq()) {
            aEQ();
        }
        LeftPanelSection leftPanelSection2 = (LeftPanelSection) this.dkj.getValue();
        if (leftPanelSection2 == leftPanelSection) {
            e(leftPanelSection);
        } else {
            a(leftPanelSection2, leftPanelSection);
        }
    }

    public final boolean nq() {
        Object obj = (Boolean) this.dkf.getValue();
        if (obj == null) {
            obj = Boolean.valueOf(false);
        }
        kotlin.jvm.internal.i.e(obj, "isExpandedData.value ?: false");
        return obj.booleanValue();
    }

    public final void aEQ() {
        Boolean bool = (Boolean) this.dkf.getValue();
        if (bool != null) {
            kotlin.jvm.internal.i.e(bool, "isExpanded");
            String str = "listLeftPanel";
            MutableLiveData mutableLiveData;
            List list;
            if (bool.booleanValue()) {
                List list2 = (List) this.dki.getValue();
                if (list2 != null) {
                    kotlin.jvm.internal.i.e(list2, "items");
                    this.dkl = list2;
                    aX(list2);
                }
                mutableLiveData = this.dki;
                list = this.dkl;
                if (list == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                Collection arrayList = new ArrayList();
                for (Object next : list) {
                    if (((f) next).isVisible()) {
                        arrayList.add(next);
                    }
                }
                mutableLiveData.setValue((List) arrayList);
                this.dkf.setValue(Boolean.valueOf(false));
                e(LeftPanelSection.MORE);
                return;
            }
            mutableLiveData = this.dki;
            list = this.dkl;
            if (list == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            mutableLiveData.setValue(list);
            this.dkf.setValue(Boolean.valueOf(true));
            a((LeftPanelSection) this.dkj.getValue(), LeftPanelSection.MORE);
        }
    }

    public final void c(f fVar) {
        kotlin.jvm.internal.i.f(fVar, "item");
        int isVisible = fVar.isVisible() ^ 1;
        List<f> list = (List) this.dki.getValue();
        if (list != null) {
            int i;
            kotlin.jvm.internal.i.e(list, "items");
            int i2 = 0;
            for (f aEJ : list) {
                if ((aEJ.aEJ() == fVar.aEJ() ? 1 : null) != null) {
                    i = i2;
                    break;
                }
                i2++;
            }
            i = -1;
            if (i >= 0) {
                this.dki.setValue(com.iqoption.core.ext.c.a((List) list, i, f.a((f) list.get(i), null, isVisible, false, 5, null)));
            }
        }
    }

    public final void aA(int i, int i2) {
        List list = (List) this.dki.getValue();
        if (list != null) {
            MutableLiveData mutableLiveData = this.dki;
            kotlin.jvm.internal.i.e(list, "items");
            list = u.I(list);
            if (i2 > i) {
                i2--;
            }
            list.add(i2, list.remove(i));
            mutableLiveData.setValue(list);
        }
    }

    private final void e(LeftPanelSection leftPanelSection) {
        List<f> list = (List) this.dki.getValue();
        if (list != null) {
            kotlin.jvm.internal.i.e(list, "items");
            int i = 0;
            for (f aEJ : list) {
                if ((aEJ.aEJ() == leftPanelSection ? 1 : null) != null) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i >= 0) {
                this.dki.setValue(com.iqoption.core.ext.c.a((List) list, i, f.a((f) list.get(i), null, false, false, 3, null)));
            }
        }
        this.dkj.setValue(null);
        a(leftPanelSection, false);
    }

    private final void a(LeftPanelSection leftPanelSection, LeftPanelSection leftPanelSection2) {
        List<f> list = (List) this.dki.getValue();
        if (list != null) {
            kotlin.jvm.internal.i.e(list, "items");
            int i = 0;
            for (f aEJ : list) {
                if ((aEJ.aEJ() == leftPanelSection2 ? 1 : null) != null) {
                    break;
                }
                i++;
            }
            i = -1;
            int i2 = 0;
            for (f aEJ2 : list) {
                if ((aEJ2.aEJ() == leftPanelSection ? 1 : null) != null) {
                    break;
                }
                i2++;
            }
            i2 = -1;
            List I = u.I(list);
            if (i >= 0) {
                I.set(i, f.a((f) list.get(i), null, false, true, 3, null));
            }
            if (i2 >= 0) {
                I.set(i2, f.a((f) list.get(i2), null, false, false, 3, null));
            }
            this.dki.setValue(I);
        }
        this.dkj.setValue(leftPanelSection2);
        a(leftPanelSection2, true);
    }

    private final void a(LeftPanelSection leftPanelSection, boolean z) {
        if (aEP().hasActiveObservers()) {
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, leftPanelSection.getEventName()).setValue(Double.valueOf(z ? 1.0d : 0.0d)).build());
        }
    }

    private final void aX(List<f> list) {
        com.iqoption.core.rx.i.aki().m(new f(this, list));
    }

    private final p<List<f>> aER() {
        p a = p.a(aET(), aES(), e.dks);
        kotlin.jvm.internal.i.e(a, "Single.zip<List<LeftPane…ltList\n                })");
        return a;
    }

    private final p<List<f>> aES() {
        p cJ = p.j(new d(this)).cJ(m.emptyList());
        kotlin.jvm.internal.i.e(cJ, "Single.fromCallable {\n  …ErrorReturnItem(listOf())");
        return cJ;
    }

    private final p<List<f>> aET() {
        Object listOf;
        p j = p.j(new c(this));
        if (com.iqoption.core.d.Un().Dq()) {
            listOf = l.listOf(new f(LeftPanelSection.PORTFOIO, false, false, 6, null));
        } else {
            listOf = m.listOf(new f(LeftPanelSection.PORTFOIO, false, false, 6, null), new f(LeftPanelSection.PRICE_MOVEMENTS, false, false, 6, null), new f(LeftPanelSection.CHATS, false, false, 6, null), new f(LeftPanelSection.MORE, false, false, 6, null));
        }
        j = j.cJ(listOf);
        kotlin.jvm.internal.i.e(j, "Single.fromCallable {\n  …nelItem(MORE))\n        })");
        return j;
    }
}
