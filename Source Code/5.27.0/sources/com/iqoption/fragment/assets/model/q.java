package com.iqoption.fragment.assets.model;

import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.ext.c;
import com.iqoption.core.features.a.b;
import com.iqoption.core.microservices.tradingengine.response.active.d;
import com.iqoption.core.microservices.tradingengine.response.b.a;
import com.iqoption.core.util.TimeUtil.Duration;
import com.iqoption.core.util.e;
import com.iqoption.x.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000¦\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\b\t\u001a(\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0004j\u0002`\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002\u001a$\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001aT\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0004j\u0002`\u00072\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a\"\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a\"\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a\"\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001ax\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\"\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00150 0 j\u0002`!2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0004j\u0002`\u00072\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#H\u0002\u001a\"\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a.\u0010'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(*\b\u0012\u0004\u0012\u00020)0(2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0 H\u0002\u001a\u001e\u0010-\u001a\u0004\u0018\u00010)*\b\u0012\u0004\u0012\u00020)0(2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002\u001a,\u00100\u001a\u0004\u0018\u00010/*\b\u0012\u0004\u0012\u00020)0(2\b\u0010.\u001a\u0004\u0018\u00010/2\f\u00101\u001a\b\u0012\u0004\u0012\u00020/02H\u0002\u001a2\u00103\u001a\u000204*\b\u0012\u0004\u0012\u00020)052\u0006\u00106\u001a\u00020\u00012\u0006\u00107\u001a\u00020+2\u0006\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0002\u001a@\u00103\u001a\u000204*\b\u0012\u0004\u0012\u00020)052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00010 2\u0006\u00107\u001a\u00020+2\u0006\u00108\u001a\u00020\u00012\b\b\u0002\u00109\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000*<\b\u0002\u0010;\"\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00150 0 2\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00150 0 *0\b\u0002\u0010<\"\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00042\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006=²\u0006\u0016\u0010>\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00010 X\u0002"}, bng = {"DEFAULT_LEVERAGE", "", "DEFAULT_THRESHOLD", "getMaxLeverageSupplier", "Lkotlin/Function2;", "Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;", "Lcom/iqoption/core/data/model/InstrumentType;", "Lcom/iqoption/fragment/assets/model/MaxLeverageSupplier;", "leveragesLimitParams", "Lcom/iqoption/core/features/deal/LeveragesLimitParams;", "mapToAssetBo", "Lcom/iqoption/fragment/assets/model/AssetBo;", "asset", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "spreadData", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "isFavorite", "", "mapToAssetCfd", "Lcom/iqoption/fragment/assets/model/AssetCfd;", "markups", "Lcom/iqoption/core/microservices/risks/response/markup/ActiveMarkups;", "maxLeverageSupplier", "leverageInfo", "mapToAssetClosed", "Lcom/iqoption/fragment/assets/model/AssetClosed;", "mapToAssetDo", "Lcom/iqoption/fragment/assets/model/AssetDo;", "mapToAssetFx", "Lcom/iqoption/fragment/assets/model/AssetFx;", "mapToAssetItem", "Lcom/iqoption/fragment/assets/model/AssetItem;", "", "Lcom/iqoption/fragment/assets/model/Markups;", "timeSync", "", "mapToAssetMulti", "Lcom/iqoption/fragment/assets/model/AssetMulti;", "active", "ensureSorting", "", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "sortings", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "findCategoryById", "id", "", "selectCategory", "expandedIds", "", "tryAddCategory", "", "", "count", "categoryType", "titleResId", "imageResId", "counts", "Markups", "MaxLeverageSupplier", "app_optionXRelease", "thresholds"})
/* compiled from: AssetsModelImpl.kt */
public final class q {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference0Impl(k.d(q.class, "app_optionXRelease"), "thresholds", "<v#0>"))};

    private static final m<a, InstrumentType, Integer> b(b bVar) {
        return new AssetsModelImplKt$getMaxLeverageSupplier$1(g.c(new AssetsModelImplKt$getMaxLeverageSupplier$thresholds$2(bVar)), anY[0]);
    }

    private static final void a(List<e> list, Map<AssetCategoryType, Integer> map, AssetCategoryType assetCategoryType, int i, int i2) {
        Integer num = (Integer) map.get(assetCategoryType);
        a((List) list, num != null ? num.intValue() : 0, assetCategoryType, i, i2);
    }

    private static final void a(List<e> list, int i, AssetCategoryType assetCategoryType, int i2, int i3) {
        if (i > 0) {
            list.add(new e(assetCategoryType, i, i2, i3));
        }
    }

    private static final String a(List<e> list, String str, Set<String> set) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            e eVar = (e) list.get(i);
            if (eVar.Ng()) {
                String a = a(eVar.aAP(), str, (Set) set);
                if (a != null) {
                    set.add(eVar.getId());
                    return a;
                }
            } else if (str == null || kotlin.jvm.internal.i.y(str, eVar.getId())) {
                return eVar.getId();
            }
        }
        return null;
    }

    private static final e d(List<e> list, String str) {
        if (str == null) {
            return null;
        }
        for (e eVar : list) {
            e eVar2;
            if (eVar2.Ng()) {
                eVar2 = d(eVar2.aAP(), str);
                continue;
            } else if (kotlin.jvm.internal.i.y(eVar2.getId(), str)) {
                continue;
            } else {
                eVar2 = null;
                continue;
            }
            if (eVar2 != null) {
                return eVar2;
            }
        }
        return null;
    }

    private static final List<e> b(List<e> list, Map<AssetCategoryType, p> map) {
        List<e> list2 = list;
        Map<AssetCategoryType, p> map2 = map;
        List<e> list3 = (List) null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            e eVar = (e) list2.get(i);
            p pVar = (p) map2.get(eVar.aAN());
            if (eVar.Ng()) {
                List b = b(eVar.aAP(), map2);
                if (b != null) {
                    if (list3 == null) {
                        list3 = u.I(list2);
                    }
                    list3.set(i, e.a(eVar, null, null, null, 0, null, false, false, b, null, null, null, 1919, null));
                }
            } else if (!(pVar == null || (kotlin.jvm.internal.i.y(eVar.aAQ(), pVar) ^ 1) == 0)) {
                if (list3 == null) {
                    list3 = u.I(list2);
                }
                list3.set(i, e.a(eVar, null, null, null, 0, null, false, false, null, null, pVar, null, 1535, null));
            }
        }
        return list3;
    }

    private static final k a(Map<InstrumentType, ? extends Map<Integer, com.iqoption.core.microservices.risks.response.markup.a>> map, m<? super a, ? super InstrumentType, Integer> mVar, com.iqoption.core.microservices.tradingengine.response.active.a aVar, a aVar2, com.iqoption.core.microservices.f.a.a.a aVar3, boolean z, long j) {
        if (!aVar.aX(j)) {
            return a(aVar, aVar3, z);
        }
        k kVar = null;
        switch (r.aob[aVar.getInstrumentType().ordinal()]) {
            case 1:
            case 2:
                kVar = b(aVar, aVar3, z);
                break;
            case 3:
                kVar = c(aVar, aVar3, z);
                break;
            case 4:
                kVar = d(aVar, aVar3, z);
                break;
            case 5:
                kVar = e(aVar, aVar3, z);
                break;
            case 6:
            case 7:
            case 8:
                com.iqoption.core.microservices.risks.response.markup.a aVar4;
                Map map2 = (Map) map.get(aVar.getInstrumentType());
                if (map2 != null) {
                    aVar4 = (com.iqoption.core.microservices.risks.response.markup.a) map2.get(Integer.valueOf(aVar.getActiveId()));
                }
                kVar = a(aVar4, mVar, aVar, aVar2, aVar3, z);
                break;
        }
        return kVar;
    }

    private static final h a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.core.microservices.f.a.a.a aVar2, boolean z) {
        String aQ;
        String fS;
        String B = d.B(aVar);
        String image = aVar.getImage();
        long If = com.iqoption.core.d.EB().If();
        long aY = aVar.aY(If);
        if (c.aP(aY)) {
            aQ = c.aQ(aY);
        } else {
            aQ = c.a(aY - If, Duration.MINUTE);
        }
        String str = aQ;
        if (aVar2 != null) {
            Double g = com.iqoption.core.microservices.f.a.a.a.bzg.g(aVar2);
            fS = c.fS(g != null ? String.valueOf(g.doubleValue()) : null);
        } else {
            fS = "";
        }
        return new h(aVar, image, B, z, fS, str);
    }

    private static final d b(com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.core.microservices.f.a.a.a aVar2, boolean z) {
        String fS;
        String B = d.B(aVar);
        String image = aVar.getImage();
        int ahR = 100 - aVar.ahR();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ahR);
        stringBuilder.append('%');
        String stringBuilder2 = stringBuilder.toString();
        if (aVar2 != null) {
            Double g = com.iqoption.core.microservices.f.a.a.a.bzg.g(aVar2);
            fS = c.fS(g != null ? String.valueOf(g.doubleValue()) : null);
        } else {
            fS = "";
        }
        return new d(aVar, ahR, image, B, z, fS, stringBuilder2);
    }

    private static final i c(com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.core.microservices.f.a.a.a aVar2, boolean z) {
        double c;
        String stringBuilder;
        String str;
        int i;
        String str2;
        String B = d.B(aVar);
        String image = aVar.getImage();
        String str3 = "";
        if (aVar2 != null) {
            Double g = com.iqoption.core.microservices.f.a.a.a.bzg.g(aVar2);
            str3 = c.fS(g != null ? String.valueOf(g.doubleValue()) : null);
            c = c.c(com.iqoption.core.microservices.f.a.a.a.bzg.e(aVar2));
            String b = e.b(c, null, 1, null);
            int e = c.e(com.iqoption.core.microservices.f.a.a.a.bzg.b(aVar2));
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(e);
            stringBuilder2.append('%');
            stringBuilder = stringBuilder2.toString();
            str = b;
            i = e;
            str2 = str3;
        } else {
            c = 0.0d;
            str2 = str3;
            str = str2;
            stringBuilder = str;
            i = 0;
        }
        return new i(aVar, c, c > 0.0d, i, image, B, z, str2, str, stringBuilder);
    }

    private static final j d(com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.core.microservices.f.a.a.a aVar2, boolean z) {
        double c;
        String b;
        String str;
        String str2;
        int i;
        com.iqoption.core.microservices.f.a.a.a aVar3 = aVar2;
        String B = d.B(aVar);
        String image = aVar.getImage();
        String str3 = "";
        if (aVar3 != null) {
            int longValue;
            Double g = com.iqoption.core.microservices.f.a.a.a.bzg.g(aVar3);
            String fS = c.fS(g != null ? String.valueOf(g.doubleValue()) : null);
            c = c.c(com.iqoption.core.microservices.f.a.a.a.bzg.e(aVar3));
            b = e.b(c, null, 1, null);
            Long a = com.iqoption.core.microservices.f.a.a.a.bzg.a(aVar3);
            if (a != null) {
                longValue = (int) (a.longValue() - com.iqoption.core.d.EB().If());
                str3 = com.iqoption.core.d.getString(R.string.in_time_n1, c.a(r12, Duration.MINUTE));
            } else {
                longValue = 0;
            }
            str = str3;
            str2 = b;
            b = fS;
            i = longValue;
        } else {
            c = 0.0d;
            b = str3;
            str2 = b;
            str = str2;
            i = 0;
        }
        return new j(aVar, c, c > 0.0d, i, image, B, z, b, str2, str);
    }

    private static final n e(com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.core.microservices.f.a.a.a aVar2, boolean z) {
        double c;
        String stringBuilder;
        String str;
        int i;
        String str2;
        String B = d.B(aVar);
        String image = aVar.getImage();
        String str3 = "";
        if (aVar2 != null) {
            Double g = com.iqoption.core.microservices.f.a.a.a.bzg.g(aVar2);
            str3 = c.fS(g != null ? String.valueOf(g.doubleValue()) : null);
            c = c.c(com.iqoption.core.microservices.f.a.a.a.bzg.e(aVar2));
            String b = e.b(c, null, 1, null);
            int e = c.e(com.iqoption.core.microservices.f.a.a.a.bzg.b(aVar2));
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(e);
            stringBuilder2.append('%');
            stringBuilder = stringBuilder2.toString();
            str = b;
            i = e;
            str2 = str3;
        } else {
            c = 0.0d;
            str2 = str3;
            str = str2;
            stringBuilder = str;
            i = 0;
        }
        return new n(aVar, c, c > 0.0d, i, image, B, z, str2, str, stringBuilder);
    }

    private static final g a(com.iqoption.core.microservices.risks.response.markup.a aVar, m<? super a, ? super InstrumentType, Integer> mVar, com.iqoption.core.microservices.tradingengine.response.active.a aVar2, a aVar3, com.iqoption.core.microservices.f.a.a.a aVar4, boolean z) {
        Integer valueOf;
        String str;
        double c;
        double doubleValue;
        String str2;
        String str3;
        String str4;
        double d;
        com.iqoption.core.microservices.risks.response.markup.a aVar5 = aVar;
        a aVar6 = aVar3;
        com.iqoption.core.microservices.f.a.a.a aVar7 = aVar4;
        String B = d.B(aVar2);
        String image = aVar2.getImage();
        String str5 = "";
        if (aVar6 != null) {
            Number number = (Number) mVar.w(aVar6, aVar2.getInstrumentType());
            int intValue = number.intValue();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('x');
            stringBuilder.append(intValue);
            String stringBuilder2 = stringBuilder.toString();
            valueOf = Integer.valueOf(number.intValue());
            str = stringBuilder2;
        } else {
            valueOf = null;
            str = str5;
        }
        if (aVar7 != null) {
            String valueOf2;
            double c2 = c.c(com.iqoption.core.microservices.f.a.a.a.bzg.h(aVar7));
            c = c.c(com.iqoption.core.microservices.f.a.a.a.bzg.f(aVar7));
            String b = e.b(c, null, 1, null);
            Double g = com.iqoption.core.microservices.f.a.a.a.bzg.g(aVar7);
            if (g != null) {
                double doubleValue2 = g.doubleValue();
                valueOf2 = String.valueOf(doubleValue2);
                Double d2 = com.iqoption.core.microservices.f.a.a.a.bzg.d(aVar7);
                if (d2 != null) {
                    String d3;
                    doubleValue = d2.doubleValue();
                    if (valueOf != null) {
                        Double valueOf3;
                        int intValue2 = valueOf.intValue();
                        if (aVar5 != null) {
                            valueOf3 = Double.valueOf(com.iqoption.asset.c.a.axy.b(aVar2.getPrecision(), doubleValue, doubleValue2, aVar5.eV(intValue2)));
                        } else {
                            valueOf3 = null;
                        }
                        if (valueOf3 != null) {
                            doubleValue = valueOf3.doubleValue();
                        }
                    }
                    com.iqoption.core.microservices.tradingengine.response.active.a aVar8;
                    if (com.iqoption.fragment.rightpanel.m.doC.isAvailable()) {
                        ActiveType activeType = aVar2.getActiveType();
                        if (activeType != null) {
                            int i = r.axg[activeType.ordinal()];
                            if (i == 1 || i == 2) {
                                doubleValue = com.iqoption.fragment.rightpanel.m.doC.c(doubleValue, aVar2);
                                d3 = c.d(doubleValue, 1);
                            } else if (i == 3) {
                                d3 = e.a(doubleValue, aVar2.getPrecision(), null, false, false, false, false, null, null, 246, null);
                                aVar8 = aVar2;
                            }
                        }
                        d3 = e.a(doubleValue, 2, null, false, false, false, false, null, null, 246, null);
                        aVar8 = aVar2;
                    } else {
                        aVar8 = aVar2;
                        doubleValue = (doubleValue / doubleValue2) * 100.0d;
                        d3 = e.a(doubleValue, "0.000'%'", false, false, null, null, 28, null);
                    }
                    str5 = d3;
                    str2 = str5;
                    str3 = b;
                    str4 = valueOf2;
                    d = doubleValue;
                    doubleValue = c2;
                }
            } else {
                valueOf2 = str5;
            }
            doubleValue = 0.0d;
            str2 = str5;
            str3 = b;
            str4 = valueOf2;
            d = doubleValue;
            doubleValue = c2;
        } else {
            str4 = str5;
            str3 = str4;
            str2 = str3;
            doubleValue = 0.0d;
            c = doubleValue;
            d = c;
        }
        return new g(aVar2, doubleValue, c, c > 0.0d, d, c.e(valueOf), image, B, z, str4, str3, str2, str);
    }
}
