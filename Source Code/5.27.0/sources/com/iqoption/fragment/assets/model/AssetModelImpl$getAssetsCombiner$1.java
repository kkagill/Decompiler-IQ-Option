package com.iqoption.fragment.assets.model;

import com.iqoption.core.d;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.ext.c;
import com.iqoption.core.microservices.risks.response.markup.a;
import com.iqoption.core.microservices.tradingengine.response.active.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.a.m;
import kotlin.jvm.a.u;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00050\u0005j\u0002`\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\rj\u0002`\u000f2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u00050\u00052\u001e\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\u00050\u00052\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u00050\u00052\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00160\u0005H\n¢\u0006\u0002\b\u0017"}, bng = {"<no name provided>", "Lkotlin/Function1;", "", "Lcom/iqoption/fragment/assets/model/AssetCategoryInfo;", "markups", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "Lcom/iqoption/core/microservices/risks/response/markup/ActiveMarkups;", "Lcom/iqoption/fragment/assets/model/Markups;", "category", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "maxLeverageSupplier", "Lkotlin/Function2;", "Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;", "Lcom/iqoption/fragment/assets/model/MaxLeverageSupplier;", "assetsMap", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "leverageInfoMap", "spreadDataMap", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "favoritesMap", "", "invoke"})
/* compiled from: AssetsModelImpl.kt */
final class AssetModelImpl$getAssetsCombiner$1 extends Lambda implements u<Map<InstrumentType, ? extends Map<Integer, ? extends a>>, e, m<? super com.iqoption.core.microservices.tradingengine.response.b.a, ? super InstrumentType, ? extends Integer>, Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>>, Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.b.a>>, Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.f.a.a.a>>, Map<InstrumentType, ? extends Set<? extends Integer>>, b<? super CharSequence, ? extends f>> {
    public static final AssetModelImpl$getAssetsCombiner$1 dcA = new AssetModelImpl$getAssetsCombiner$1();

    AssetModelImpl$getAssetsCombiner$1() {
        super(7);
    }

    public final b<CharSequence, f> a(Map<InstrumentType, ? extends Map<Integer, a>> map, e eVar, m<? super com.iqoption.core.microservices.tradingengine.response.b.a, ? super InstrumentType, Integer> mVar, Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>> map2, Map<InstrumentType, ? extends Map<Integer, com.iqoption.core.microservices.tradingengine.response.b.a>> map3, Map<InstrumentType, ? extends Map<Integer, com.iqoption.core.microservices.f.a.a.a>> map4, Map<InstrumentType, ? extends Set<Integer>> map5) {
        final e eVar2 = eVar;
        Map map6 = map2;
        Map<InstrumentType, ? extends Map<Integer, com.iqoption.core.microservices.tradingengine.response.b.a>> map7 = map3;
        Map<InstrumentType, ? extends Map<Integer, com.iqoption.core.microservices.f.a.a.a>> map8 = map4;
        Map<InstrumentType, ? extends Set<Integer>> map9 = map5;
        kotlin.jvm.internal.i.f(map, "markups");
        kotlin.jvm.internal.i.f(eVar2, "category");
        kotlin.jvm.internal.i.f(mVar, "maxLeverageSupplier");
        kotlin.jvm.internal.i.f(map6, "assetsMap");
        kotlin.jvm.internal.i.f(map7, "leverageInfoMap");
        kotlin.jvm.internal.i.f(map8, "spreadDataMap");
        kotlin.jvm.internal.i.f(map9, "favoritesMap");
        final List arrayList = new ArrayList();
        long If = d.EB().If();
        Iterator it = eVar.JU().iterator();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            com.iqoption.core.microservices.f.a.a.a aVar = null;
            if (it.hasNext()) {
                Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>> map10;
                Object obj3 = (InstrumentType) it.next();
                Object obj4 = obj3 == InstrumentType.MULTI_INSTRUMENT ? 1 : null;
                int i = m.aob[obj3.ordinal()];
                Object obj5 = (i == 1 || i == 2 || i == 3) ? 1 : null;
                Map map11 = (Map) map6.get(obj3);
                if (map11 == null) {
                    map11 = af.emptyMap();
                }
                for (Entry value : map11.entrySet()) {
                    Object obj6;
                    com.iqoption.core.microservices.tradingengine.response.active.a aVar2 = (com.iqoption.core.microservices.tradingengine.response.active.a) value.getValue();
                    if (!aVar2.isSuspended() && ((Boolean) eVar.aAR().invoke(aVar2)).booleanValue()) {
                        Map map12;
                        Set set;
                        k b;
                        if (obj4 == null) {
                            obj6 = obj3;
                            i = aVar2.getActiveId();
                            Map map13 = (Map) map7.get(obj6);
                            map12 = (Map) map8.get(obj6);
                            set = (Set) map9.get(obj6);
                            if (set == null) {
                                set = al.emptySet();
                            }
                            b = q.a((Map) map, (m) mVar, aVar2, map13 != null ? (com.iqoption.core.microservices.tradingengine.response.b.a) map13.get(Integer.valueOf(i)) : null, map12 != null ? (com.iqoption.core.microservices.f.a.a.a) map12.get(Integer.valueOf(i)) : null, set.contains(Integer.valueOf(i)), If);
                            if (b != null) {
                                arrayList.add(b);
                            }
                            obj3 = obj6;
                            map10 = map2;
                        } else if (aVar2 != null) {
                            for (j jVar : ((j) aVar2).aib()) {
                                int activeId = jVar.getActiveId();
                                Map map14 = (Map) map7.get(obj3);
                                map12 = (Map) map8.get(InstrumentType.DIGITAL_INSTRUMENT);
                                set = (Set) map9.get(obj3);
                                if (set == null) {
                                    set = al.emptySet();
                                }
                                obj6 = obj3;
                                b = q.a((Map) map, (m) mVar, (com.iqoption.core.microservices.tradingengine.response.active.a) jVar, map14 != null ? (com.iqoption.core.microservices.tradingengine.response.b.a) map14.get(Integer.valueOf(activeId)) : null, map12 != null ? (com.iqoption.core.microservices.f.a.a.a) map12.get(Integer.valueOf(activeId)) : null, set.contains(Integer.valueOf(activeId)), If);
                                if (b != null) {
                                    arrayList.add(b);
                                }
                                obj3 = obj6;
                                map10 = map2;
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.tradingengine.response.active.InstrumentActive");
                        }
                    }
                    obj6 = obj3;
                    obj3 = obj6;
                    map10 = map2;
                }
                map10 = map2;
                obj2 = obj4;
                obj = obj5;
            } else {
                q.a(arrayList, eVar.aAQ());
                if (obj != null) {
                    arrayList.add(u.ddg);
                }
                if (obj2 != null) {
                    map6 = (Map) map8.get(InstrumentType.MULTI_INSTRUMENT);
                    if (map6 != null) {
                        Collection values = map6.values();
                        if (values != null) {
                            Iterator it2 = values.iterator();
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                int e = c.e(com.iqoption.core.microservices.f.a.a.a.bzg.b((com.iqoption.core.microservices.f.a.a.a) next));
                                Object obj7 = next;
                                while (it2.hasNext()) {
                                    next = it2.next();
                                    int e2 = c.e(com.iqoption.core.microservices.f.a.a.a.bzg.b((com.iqoption.core.microservices.f.a.a.a) next));
                                    if (e < e2) {
                                        obj7 = next;
                                        e = e2;
                                    }
                                }
                            }
                            aVar = aVar;
                        }
                    }
                    int e3 = c.e(com.iqoption.core.microservices.f.a.a.a.bzg.b(aVar));
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(e3);
                    stringBuilder.append('%');
                    arrayList.add(new s(stringBuilder.toString()));
                }
                return new b<CharSequence, f>() {
                    /* renamed from: N */
                    public final f invoke(CharSequence charSequence) {
                        List list;
                        kotlin.jvm.internal.i.f(charSequence, "constraint");
                        e eVar = eVar2;
                        if ((charSequence.length() == 0 ? 1 : null) != null) {
                            list = arrayList;
                        } else {
                            Collection arrayList = new ArrayList();
                            for (Object next : arrayList) {
                                if (((a) next).L(charSequence)) {
                                    arrayList.add(next);
                                }
                            }
                            list = (List) arrayList;
                        }
                        return new f(eVar, list, charSequence);
                    }
                };
            }
        }
    }
}
