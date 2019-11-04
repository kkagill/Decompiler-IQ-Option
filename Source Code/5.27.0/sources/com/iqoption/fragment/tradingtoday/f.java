package com.iqoption.fragment.tradingtoday;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.iqoption.app.managers.l;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.signals.r;
import com.iqoption.signals.t;
import io.reactivex.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.g;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000eH\u0002J\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/fragment/tradingtoday/TrendingTodayModel;", "Landroidx/lifecycle/ViewModel;", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "populars", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;", "signalsViewModel", "Lcom/iqoption/signals/SignalsViewModel;", "getExcludedAssetsList", "", "getPopularItemList", "Lio/reactivex/Single;", "load", "Landroidx/lifecycle/LiveData;", "loadPopularList", "onCleared", "", "removeItem", "", "item", "Companion", "app_optionXRelease"})
/* compiled from: TrendingTodayModel.kt */
public final class f extends ViewModel {
    public static final a dqR = new a();
    private final io.reactivex.disposables.a aqB = new io.reactivex.disposables.a();
    private r dqP;
    private final MediatorLiveData<List<d>> dqQ = new MediatorLiveData();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/fragment/tradingtoday/TrendingTodayModel$Companion;", "", "()V", "create", "Lcom/iqoption/fragment/tradingtoday/TrendingTodayModel;", "f", "Landroidx/fragment/app/Fragment;", "app_optionXRelease"})
    /* compiled from: TrendingTodayModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final f ah(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "f");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(f.class);
            f fVar = (f) viewModel;
            fVar.dqP = r.dTN.E(com.iqoption.core.ext.a.r(fragment));
            f.c(fVar).reload();
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(f)…el.reload()\n            }");
            return fVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;", "call"})
    /* compiled from: TrendingTodayModel.kt */
    static final class b<V> implements Callable<T> {
        final /* synthetic */ f dqS;

        b(f fVar) {
            this.dqS = fVar;
        }

        public final List<d> call() {
            return this.dqS.aIm();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "state", "Lcom/iqoption/signals/SignalsViewState;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: TrendingTodayModel.kt */
    static final class c<T> implements Observer<S> {
        final /* synthetic */ f dqS;
        final /* synthetic */ LiveData dqT;

        c(f fVar, LiveData liveData) {
            this.dqS = fVar;
            this.dqT = liveData;
        }

        /* renamed from: a */
        public final void onChanged(t tVar) {
            if (tVar != null) {
                for (Object next : tVar.getItems()) {
                    com.iqoption.signals.a aVar = (com.iqoption.signals.a) next;
                    if (!(aVar instanceof com.iqoption.signals.f)) {
                        aVar = null;
                    }
                    com.iqoption.signals.f fVar = (com.iqoption.signals.f) aVar;
                    if (com.iqoption.util.c.a.z(fVar != null ? fVar.Jt() : null)) {
                        break;
                    }
                }
                Object next2 = null;
                com.iqoption.signals.a aVar2 = (com.iqoption.signals.a) next2;
                if (aVar2 == null) {
                    return;
                }
                if (aVar2 != null) {
                    com.iqoption.signals.f fVar2 = (com.iqoption.signals.f) aVar2;
                    List list = (List) this.dqS.dqQ.getValue();
                    if (list == null) {
                        list = m.emptyList();
                    }
                    kotlin.jvm.internal.i.e(list, "populars.value ?: listOf()");
                    this.dqS.dqQ.setValue(com.iqoption.core.ext.c.a(list, (Object) new d(PopularType.BIG_MOVERS, fVar2.Jt(), null, fVar2, 4, null), 0, 2, null));
                    this.dqS.dqQ.removeSource(this.dqT);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.signals.SignalItem");
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "source", "", "Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: TrendingTodayModel.kt */
    static final class d<T> implements Observer<S> {
        final /* synthetic */ f dqS;

        d(f fVar) {
            this.dqS = fVar;
        }

        /* JADX WARNING: Missing block: B:4:0x001c, code skipped:
            if (r1 != null) goto L_0x0026;
     */
        /* renamed from: u */
        public final void onChanged(java.util.List<com.iqoption.fragment.tradingtoday.d> r4) {
            /*
            r3 = this;
            if (r4 == 0) goto L_0x002f;
        L_0x0002:
            r0 = r3.dqS;
            r0 = r0.dqQ;
            r1 = r3.dqS;
            r1 = r1.dqQ;
            r1 = r1.getValue();
            r1 = (java.util.List) r1;
            if (r1 == 0) goto L_0x001f;
        L_0x0016:
            r1 = (java.util.Collection) r1;
            r1 = kotlin.collections.u.I(r1);
            if (r1 == 0) goto L_0x001f;
        L_0x001e:
            goto L_0x0026;
        L_0x001f:
            r1 = new java.util.ArrayList;
            r1.<init>();
            r1 = (java.util.List) r1;
        L_0x0026:
            r2 = 0;
            r4 = (java.util.Collection) r4;
            r1.addAll(r2, r4);
            r0.setValue(r1);
        L_0x002f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.tradingtoday.f$d.onChanged(java.util.List):void");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TrendingTodayModel.kt */
    static final class e<T> implements io.reactivex.b.f<List<? extends d>> {
        final /* synthetic */ MutableLiveData dqU;

        e(MutableLiveData mutableLiveData) {
            this.dqU = mutableLiveData;
        }

        /* renamed from: v */
        public final void accept(List<d> list) {
            this.dqU.postValue(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TrendingTodayModel.kt */
    static final class f<T> implements io.reactivex.b.f<Throwable> {
        public static final f dqV = new f();

        f() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public final LiveData<List<d>> aIk() {
        r rVar = this.dqP;
        if (rVar == null) {
            kotlin.jvm.internal.i.lG("signalsViewModel");
        }
        LiveData state = rVar.getState();
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.dqQ.addSource(state, new c(this, state));
        this.dqQ.addSource(mutableLiveData, new d(this));
        this.aqB.e(aIl().h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new e(mutableLiveData), (io.reactivex.b.f) f.dqV));
        return this.dqQ;
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        this.aqB.clear();
    }

    public final int c(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "item");
        MediatorLiveData mediatorLiveData = this.dqQ;
        List list = (List) mediatorLiveData.getValue();
        mediatorLiveData.setValue(list != null ? com.iqoption.core.ext.c.h(list, (Object) dVar) : null);
        List list2 = (List) this.dqQ.getValue();
        return list2 != null ? list2.size() : 0;
    }

    private final p<List<d>> aIl() {
        p j = p.j(new b(this));
        kotlin.jvm.internal.i.e(j, "Single.fromCallable { loadPopularList() }");
        return j;
    }

    private final List<d> aIm() {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        Object next;
        Double ahD;
        double doubleValue;
        Object next2;
        Double ahD2;
        double doubleValue2;
        Object next3;
        Object next4;
        double doubleValue3;
        Object next5;
        Object next6;
        d dVar;
        l HZ = l.HZ();
        kotlin.jvm.internal.i.e(HZ, "TimeServerManager.instance()");
        long Ib = HZ.Ib();
        com.iqoption.app.helpers.a Gs = com.iqoption.app.helpers.a.Gs();
        if (com.iqoption.core.features.instrument.b.Xv()) {
            map = (Map) com.iqoption.asset.b.a.awZ.p(InstrumentType.FOREX_INSTRUMENT).cF(af.emptyMap()).bkS();
        } else {
            map = af.emptyMap();
        }
        if (com.iqoption.core.features.instrument.b.Xw()) {
            map2 = (Map) com.iqoption.asset.b.a.awZ.p(InstrumentType.CRYPTO_INSTRUMENT).cF(af.emptyMap()).bkS();
        } else {
            map2 = af.emptyMap();
        }
        if (com.iqoption.core.features.instrument.b.Xu()) {
            map3 = (Map) com.iqoption.asset.b.a.awZ.p(InstrumentType.CFD_INSTRUMENT).cF(af.emptyMap()).bkS();
        } else {
            map3 = af.emptyMap();
        }
        if (com.iqoption.core.features.instrument.b.Xr()) {
            map4 = (Map) com.iqoption.asset.b.a.awZ.p(InstrumentType.DIGITAL_INSTRUMENT).cF(af.emptyMap()).bkS();
        } else {
            map4 = af.emptyMap();
        }
        if (com.iqoption.core.features.instrument.b.Xs()) {
            map5 = (Map) com.iqoption.asset.b.a.awZ.p(InstrumentType.FX_INSTRUMENT).cF(af.emptyMap()).bkS();
        } else {
            map5 = af.emptyMap();
        }
        List arrayList = new ArrayList();
        arrayList.addAll(map.values());
        arrayList.addAll(map2.values());
        arrayList.addAll(map3.values());
        arrayList.addAll(map4.values());
        arrayList.addAll(map5.values());
        kotlin.l lVar = kotlin.l.eVB;
        List arrayList2 = new ArrayList();
        arrayList2.addAll(map.values());
        arrayList2.addAll(map2.values());
        arrayList2.addAll(map3.values());
        kotlin.l lVar2 = kotlin.l.eVB;
        List arrayList3 = new ArrayList();
        ImmutableList bw = Gs.bw(false);
        kotlin.jvm.internal.i.e(bw, "activeSettingHelper.getC…eBinaryActivesList(false)");
        arrayList3.addAll(bw);
        kotlin.l lVar3 = kotlin.l.eVB;
        int[] aIn = aIn();
        if (aIn != null) {
            r.b(arrayList, new TrendingTodayModel$loadPopularList$1$1(aIn));
            r.b(arrayList2, new TrendingTodayModel$loadPopularList$1$2(aIn));
            Boolean.valueOf(r.b(arrayList3, new TrendingTodayModel$loadPopularList$1$3(aIn)));
        }
        boolean ej = com.iqoption.core.d.EH().ej("intraday-forex");
        Collection arrayList4 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            com.iqoption.core.microservices.f.a.a.a aVar = (com.iqoption.core.microservices.f.a.a.a) it.next();
            com.iqoption.core.microservices.tradingengine.response.active.a a = Gs.a(Integer.valueOf(aVar.getActiveId()), aVar.getInstrumentType());
            if (a != null && a.aX(Ib) && !a.isSuspended() && (ActiveType.INTRADAY_ACTIVE != a.getActiveType() || ej)) {
                obj = new Pair(a, aVar);
            }
            if (obj != null) {
                arrayList4.add(obj);
            }
        }
        List list = (List) arrayList4;
        Iterator it2 = n.g(u.Z(arrayList), new TrendingTodayModel$loadPopularList$mostPopular$1(Gs, Ib, ej)).iterator();
        if (it2.hasNext()) {
            next = it2.next();
            ahD = ((d) next).ahD();
            doubleValue = ahD != null ? ahD.doubleValue() : -1.0d;
            while (it2.hasNext()) {
                next2 = it2.next();
                ahD2 = ((d) next2).ahD();
                doubleValue2 = ahD2 != null ? ahD2.doubleValue() : -1.0d;
                if (Double.compare(doubleValue, doubleValue2) < 0) {
                    next = next2;
                    doubleValue = doubleValue2;
                }
            }
        } else {
            next = null;
        }
        d dVar2 = (d) next;
        Iterable iterable = list;
        Iterator it3 = n.g(u.Z(iterable), new TrendingTodayModel$loadPopularList$lowestSpread$1(Gs, com.iqoption.core.d.EA().Er())).iterator();
        if (it3.hasNext()) {
            next3 = it3.next();
            ahD = ((d) next3).ahD();
            doubleValue = ahD != null ? ahD.doubleValue() : g.eWa.bnF();
            while (it3.hasNext()) {
                next2 = it3.next();
                ahD2 = ((d) next2).ahD();
                doubleValue2 = ahD2 != null ? ahD2.doubleValue() : g.eWa.bnF();
                if (Double.compare(doubleValue, doubleValue2) > 0) {
                    next3 = next2;
                    doubleValue = doubleValue2;
                }
            }
        } else {
            next3 = null;
        }
        d dVar3 = (d) next3;
        it3 = n.g(u.Z(iterable), TrendingTodayModel$loadPopularList$topGainers$1.dqW).iterator();
        if (it3.hasNext()) {
            next4 = it3.next();
            Double ahD3 = ((d) next4).ahD();
            double doubleValue4 = ahD3 != null ? ahD3.doubleValue() : -1.0d;
            while (it3.hasNext()) {
                Object next7 = it3.next();
                Double ahD4 = ((d) next7).ahD();
                doubleValue3 = ahD4 != null ? ahD4.doubleValue() : -1.0d;
                if (Double.compare(doubleValue4, doubleValue3) < 0) {
                    doubleValue4 = doubleValue3;
                    next4 = next7;
                }
            }
        } else {
            next4 = null;
        }
        d dVar4 = (d) next4;
        it3 = n.g(u.Z(iterable), TrendingTodayModel$loadPopularList$topLosers$1.dqX).iterator();
        if (it3.hasNext()) {
            next5 = it3.next();
            Double ahD5 = ((d) next5).ahD();
            doubleValue3 = ahD5 != null ? ahD5.doubleValue() : g.eWa.bnF();
            while (it3.hasNext()) {
                Object next8 = it3.next();
                Double ahD6 = ((d) next8).ahD();
                double doubleValue5 = ahD6 != null ? ahD6.doubleValue() : g.eWa.bnF();
                if (Double.compare(doubleValue3, doubleValue5) > 0) {
                    next5 = next8;
                    doubleValue3 = doubleValue5;
                }
            }
        } else {
            next5 = null;
        }
        d dVar5 = (d) next5;
        Iterator it4 = n.b(u.Z(arrayList3), (kotlin.jvm.a.b) new TrendingTodayModel$loadPopularList$bestProfitability$1(Ib)).iterator();
        if (it4.hasNext()) {
            next6 = it4.next();
            int ahR = ((com.iqoption.core.microservices.tradingengine.response.active.a) next6).ahR();
            while (it4.hasNext()) {
                Object next9 = it4.next();
                int ahR2 = ((com.iqoption.core.microservices.tradingengine.response.active.a) next9).ahR();
                if (ahR > ahR2) {
                    next6 = next9;
                    ahR = ahR2;
                }
            }
        } else {
            next6 = null;
        }
        com.iqoption.core.microservices.tradingengine.response.active.a aVar2 = (com.iqoption.core.microservices.tradingengine.response.active.a) next6;
        if (aVar2 != null) {
            d dVar6 = new d(PopularType.BEST_PROFITABILITY, aVar2, null, null, 12, null);
        } else {
            dVar = null;
        }
        return m.M(dVar2, dVar4, dVar5, dVar3, dVar);
    }

    private final int[] aIn() {
        com.iqoption.core.microservices.features.a.a ei = com.iqoption.app.managers.feature.c.Iw().ei("popup-trending-excluded-assets");
        if (kotlin.jvm.internal.i.y(ei != null ? ei.getStatus() : null, "disabled") || ei == null) {
            return null;
        }
        JsonElement ady = ei.ady();
        if (ady == null) {
            return null;
        }
        JsonObject asJsonObject = ady.getAsJsonObject();
        if (asJsonObject == null) {
            return null;
        }
        ady = asJsonObject.get("asset_id");
        if (ady == null) {
            return null;
        }
        JsonArray asJsonArray = ady.getAsJsonArray();
        if (asJsonArray != null) {
            return (int[]) com.iqoption.core.ext.d.b((JsonElement) asJsonArray, int[].class, null, 2, null);
        }
        return null;
    }
}
