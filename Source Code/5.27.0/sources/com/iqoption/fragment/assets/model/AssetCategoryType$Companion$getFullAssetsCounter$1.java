package com.iqoption.fragment.assets.model;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00010\u0001H\n¢\u0006\u0002\b\u0007"}, bng = {"<no name provided>", "", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "", "assets", "Lcom/iqoption/core/data/model/InstrumentType;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "invoke"})
/* compiled from: AssetCategoryType.kt */
final class AssetCategoryType$Companion$getFullAssetsCounter$1 extends Lambda implements b<Map<InstrumentType, ? extends Map<Integer, ? extends a>>, Map<AssetCategoryType, ? extends Integer>> {
    final /* synthetic */ m $categoryAssetsCounter;

    AssetCategoryType$Companion$getFullAssetsCounter$1(m mVar) {
        this.$categoryAssetsCounter = mVar;
        super(1);
    }

    /* renamed from: F */
    public final Map<AssetCategoryType, Integer> invoke(Map<InstrumentType, ? extends Map<Integer, ? extends a>> map) {
        kotlin.jvm.internal.i.f(map, "assets");
        Map linkedHashMap = new LinkedHashMap();
        for (Object obj : AssetCategoryType.values()) {
            linkedHashMap.put(obj, this.$categoryAssetsCounter.w(obj, map));
        }
        return linkedHashMap;
    }
}
