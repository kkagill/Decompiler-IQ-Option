package com.iqoption.asset.mediators;

import android.util.SparseArray;
import androidx.collection.ArraySet;
import com.iqoption.core.data.model.InstrumentType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.i;
import kotlin.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b0\u00072\b\b\u0002\u0010\f\u001a\u00020\rJ\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0\u00072\b\b\u0002\u0010\f\u001a\u00020\rJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\u00072\u0006\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, bng = {"Lcom/iqoption/asset/mediators/AssetStreamMediator;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getActives", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "params", "Lcom/iqoption/asset/mediators/AssetStreamParams;", "getActivesDistinct", "Landroid/util/SparseArray;", "observeAssetDisplayData", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "asset_release"})
/* compiled from: AssetStreamMediator.kt */
public final class b {
    private static final String TAG = b.class.getSimpleName();
    public static final b axN = new b();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Landroid/util/SparseArray;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "activesMap", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "apply"})
    /* compiled from: AssetStreamMediator.kt */
    static final class a<T, R> implements io.reactivex.b.g<T, R> {
        public static final a axO = new a();

        a() {
        }

        /* renamed from: A */
        public final SparseArray<com.iqoption.core.microservices.tradingengine.response.active.a> apply(Map<InstrumentType, ? extends List<? extends com.iqoption.core.microservices.tradingengine.response.active.a>> map) {
            kotlin.jvm.internal.i.f(map, "activesMap");
            SparseArray sparseArray = new SparseArray();
            for (List<com.iqoption.core.microservices.tradingengine.response.active.a> it : map.values()) {
                for (com.iqoption.core.microservices.tradingengine.response.active.a aVar : it) {
                    sparseArray.put(aVar.getActiveId(), aVar);
                }
            }
            return sparseArray;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00060\u00062\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u0006H\n¢\u0006\u0002\b\u000e"}, bng = {"<anonymous>", "", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "actives", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "spreads", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "leverages", "Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;", "favorites", "", "apply"})
    /* compiled from: AssetStreamMediator.kt */
    static final class b<T1, T2, T3, T4, R> implements io.reactivex.b.i<List<? extends com.iqoption.core.microservices.tradingengine.response.active.a>, Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.f.a.a.a>>, Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.b.a>>, Map<InstrumentType, ? extends Set<? extends Integer>>, List<? extends a>> {
        final /* synthetic */ c axP;

        b(c cVar) {
            this.axP = cVar;
        }

        public final List<a> a(List<? extends com.iqoption.core.microservices.tradingengine.response.active.a> list, Map<InstrumentType, ? extends Map<Integer, com.iqoption.core.microservices.f.a.a.a>> map, Map<InstrumentType, ? extends Map<Integer, com.iqoption.core.microservices.tradingengine.response.b.a>> map2, Map<InstrumentType, ? extends Set<Integer>> map3) {
            InstrumentType instrumentType;
            kotlin.sequences.h a;
            kotlin.jvm.internal.i.f(list, "actives");
            kotlin.jvm.internal.i.f(map, "spreads");
            kotlin.jvm.internal.i.f(map2, "leverages");
            kotlin.jvm.internal.i.f(map3, "favorites");
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (com.iqoption.core.ext.c.b(((com.iqoption.core.microservices.tradingengine.response.active.a) next).getInstrumentType(), InstrumentType.TURBO_INSTRUMENT, InstrumentType.BINARY_INSTRUMENT)) {
                    arrayList.add(next);
                }
            }
            Map linkedHashMap = new LinkedHashMap();
            for (Object next2 : (List) arrayList) {
                instrumentType = ((com.iqoption.core.microservices.tradingengine.response.active.a) next2).getInstrumentType();
                ArrayList arrayList2 = linkedHashMap.get(instrumentType);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(instrumentType, arrayList2);
                }
                arrayList2.add(next2);
            }
            arrayList = new ArrayList(linkedHashMap.size());
            for (Entry entry : linkedHashMap.entrySet()) {
                instrumentType = (InstrumentType) entry.getKey();
                Iterable<com.iqoption.core.microservices.tradingengine.response.active.a> iterable2 = (List) entry.getValue();
                Collection arrayList3 = new ArrayList(n.e(iterable2, 10));
                for (com.iqoption.core.microservices.tradingengine.response.active.a aVar : iterable2) {
                    arrayList3.add(j.x(Integer.valueOf(aVar.getActiveId()), aVar));
                }
                arrayList.add(j.x(instrumentType, af.ac((List) arrayList3)));
            }
            Map ac = af.ac((List) arrayList);
            ArraySet arraySet = new ArraySet();
            kotlin.sequences.h f = n.f(n.b(u.Z(iterable), (kotlin.jvm.a.b) new AssetStreamMediator$observeAssetDisplayData$1$1(arraySet)), new AssetStreamMediator$observeAssetDisplayData$1$2(map, map2, map3, arraySet, ac));
            Comparator JX = this.axP.JX();
            if (JX != null) {
                a = n.a(f, JX);
                if (a != null) {
                    f = a;
                }
            }
            Integer JY = this.axP.JY();
            if (JY != null) {
                a = n.b(f, JY.intValue());
                if (a != null) {
                    f = a;
                }
            }
            return n.f(f);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "it", "apply"})
    /* compiled from: AssetStreamMediator.kt */
    static final class c<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ kotlin.jvm.a.b axQ;

        c(kotlin.jvm.a.b bVar) {
            this.axQ = bVar;
        }

        public final List<com.iqoption.core.microservices.tradingengine.response.active.a> apply(List<? extends com.iqoption.core.microservices.tradingengine.response.active.a> list) {
            kotlin.jvm.internal.i.f(list, "it");
            Iterable iterable = list;
            kotlin.jvm.a.b bVar = this.axQ;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (((Boolean) bVar.invoke(next)).booleanValue()) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "it", "apply"})
    /* compiled from: AssetStreamMediator.kt */
    static final class d<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ List axR;

        d(List list) {
            this.axR = list;
        }

        public final List<com.iqoption.core.microservices.tradingengine.response.active.a> apply(List<? extends com.iqoption.core.microservices.tradingengine.response.active.a> list) {
            kotlin.jvm.internal.i.f(list, "it");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (u.b((Iterable) this.axR, (Object) ((com.iqoption.core.microservices.tradingengine.response.active.a) next).getActiveType())) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AssetStreamMediator.kt */
    static final class e<T> implements io.reactivex.b.f<Throwable> {
        public static final e axS = new e();

        e() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AssetStreamMediator.kt */
    static final class f<T> implements io.reactivex.b.f<Throwable> {
        public static final f axT = new f();

        f() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AssetStreamMediator.kt */
    static final class g<T> implements io.reactivex.b.f<Throwable> {
        public static final g axU = new g();

        g() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AssetStreamMediator.kt */
    static final class h<T> implements io.reactivex.b.f<Throwable> {
        public static final h axV = new h();

        h() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    private b() {
    }

    public final io.reactivex.e<List<a>> a(c cVar) {
        io.reactivex.e g;
        Object cF;
        kotlin.jvm.internal.i.f(cVar, "params");
        List JU = cVar.JU();
        Iterable<InstrumentType> iterable = JU;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (InstrumentType o : iterable) {
            arrayList.add(com.iqoption.asset.b.a.awZ.o(o));
        }
        io.reactivex.e aF = com.iqoption.core.rx.g.aF((List) arrayList);
        kotlin.jvm.a.b filter = cVar.getFilter();
        if (filter != null) {
            g = aF.g(new c(filter));
            if (g != null) {
                aF = g;
            }
        }
        List JV = cVar.JV();
        if (JV != null) {
            g = aF.g(new d(JV));
            if (g != null) {
                aF = g;
            }
        }
        aF = aF.b((io.reactivex.b.f) e.axS).cF(m.emptyList());
        kotlin.jvm.internal.i.e(aF, "combineToList(\n         …ErrorReturnItem(listOf())");
        if (cVar.JW()) {
            Collection arrayList2 = new ArrayList(n.e(iterable, 10));
            for (InstrumentType p : iterable) {
                arrayList2.add(com.iqoption.asset.b.a.awZ.p(p));
            }
            cF = com.iqoption.core.rx.g.i(JU, (List) arrayList2).b((io.reactivex.b.f) h.axV).cF(af.emptyMap());
        } else {
            cF = io.reactivex.e.cD(af.emptyMap());
        }
        kotlin.jvm.internal.i.e(cF, "if (params.isSpreadNeede…e.just(mapOf())\n        }");
        Collection arrayList3 = new ArrayList(n.e(iterable, 10));
        for (InstrumentType q : iterable) {
            arrayList3.add(com.iqoption.asset.b.a.awZ.q(q));
        }
        io.reactivex.e cF2 = com.iqoption.core.rx.g.i(JU, (List) arrayList3).b((io.reactivex.b.f) g.axU).cF(af.emptyMap());
        String str = "combineToMap(\n          …nErrorReturnItem(mapOf())";
        kotlin.jvm.internal.i.e(cF2, str);
        Collection arrayList4 = new ArrayList(n.e(iterable, 10));
        for (InstrumentType s : iterable) {
            arrayList4.add(com.iqoption.asset.b.a.awZ.s(s));
        }
        io.reactivex.e cF3 = com.iqoption.core.rx.g.i(JU, (List) arrayList4).b((io.reactivex.b.f) f.axT).cF(af.emptyMap());
        kotlin.jvm.internal.i.e(cF3, str);
        io.reactivex.e a = io.reactivex.e.a(aF, (org.a.b) cF, cF2, cF3, new b(cVar));
        kotlin.jvm.internal.i.e(a, "combineLatest(\n         …              }\n        )");
        return a;
    }

    public static /* synthetic */ io.reactivex.e a(b bVar, c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            c cVar2 = new c(null, null, false, null, null, null, 63, null);
        }
        return bVar.b(cVar);
    }

    public final io.reactivex.e<Map<InstrumentType, List<com.iqoption.core.microservices.tradingengine.response.active.a>>> b(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "params");
        List JU = cVar.JU();
        Iterable<InstrumentType> iterable = JU;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (InstrumentType o : iterable) {
            arrayList.add(com.iqoption.asset.b.a.awZ.o(o));
        }
        return com.iqoption.core.rx.g.i(JU, (List) arrayList);
    }

    public static /* synthetic */ io.reactivex.e b(b bVar, c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            c cVar2 = new c(null, null, false, null, null, null, 63, null);
        }
        return bVar.c(cVar);
    }

    public final io.reactivex.e<SparseArray<com.iqoption.core.microservices.tradingengine.response.active.a>> c(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "params");
        io.reactivex.e g = b(cVar).g(a.axO);
        kotlin.jvm.internal.i.e(g, "getActives(params)\n     …      }\n                }");
        return g;
    }
}
