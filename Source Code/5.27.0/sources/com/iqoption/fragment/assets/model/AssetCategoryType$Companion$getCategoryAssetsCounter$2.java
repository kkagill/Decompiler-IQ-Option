package com.iqoption.fragment.assets.model;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u00050\u0005H\n¢\u0006\u0002\b\b"}, bng = {"<no name provided>", "", "categoryType", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "assets", "", "Lcom/iqoption/core/data/model/InstrumentType;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "invoke"})
/* compiled from: AssetCategoryType.kt */
final class AssetCategoryType$Companion$getCategoryAssetsCounter$2 extends Lambda implements m<AssetCategoryType, Map<InstrumentType, ? extends Map<Integer, ? extends a>>, Integer> {
    final /* synthetic */ b $availabilityPredicate;
    final /* synthetic */ AssetCategoryType$Companion$getCategoryAssetsCounter$1 $getSharedMap$1;

    AssetCategoryType$Companion$getCategoryAssetsCounter$2(AssetCategoryType$Companion$getCategoryAssetsCounter$1 assetCategoryType$Companion$getCategoryAssetsCounter$1, b bVar) {
        this.$getSharedMap$1 = assetCategoryType$Companion$getCategoryAssetsCounter$1;
        this.$availabilityPredicate = bVar;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        return Integer.valueOf(a((AssetCategoryType) obj, (Map) obj2));
    }

    public final int a(AssetCategoryType assetCategoryType, Map<InstrumentType, ? extends Map<Integer, ? extends a>> map) {
        kotlin.jvm.internal.i.f(assetCategoryType, "categoryType");
        kotlin.jvm.internal.i.f(map, "assets");
        Map aAU = this.$getSharedMap$1.invoke();
        for (InstrumentType instrumentType : assetCategoryType.getTypes()) {
            Map map2 = (Map) map.get(instrumentType);
            if (map2 == null) {
                map2 = af.emptyMap();
            }
            for (Entry entry : map2.entrySet()) {
                a aVar = (a) entry.getValue();
                if (((Boolean) assetCategoryType.getFilter().invoke(aVar)).booleanValue() && ((Boolean) this.$availabilityPredicate.invoke(aVar)).booleanValue()) {
                    aAU.put(entry.getKey(), entry.getValue());
                }
            }
        }
        int size = aAU.size();
        aAU.clear();
        return size;
    }
}
