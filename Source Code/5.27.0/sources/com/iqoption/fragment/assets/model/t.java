package com.iqoption.fragment.assets.model;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import io.reactivex.b.g;
import java.util.Map;
import kotlin.i;
import kotlin.jvm.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u000022\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0007J4\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u0002H\u0016RA\u0010\b\u001a2\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, bng = {"Lcom/iqoption/fragment/assets/model/RxAvailableAssetsCounter;", "Lio/reactivex/functions/Function;", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "()V", "counter", "Lkotlin/Function1;", "getCounter", "()Lkotlin/jvm/functions/Function1;", "apply", "assets", "app_optionXRelease"})
/* compiled from: RxAvailableAssetsCounter.kt */
public final class t implements g<Map<InstrumentType, ? extends Map<Integer, ? extends a>>, Map<AssetCategoryType, ? extends Integer>> {
    private final b<Map<InstrumentType, ? extends Map<Integer, ? extends a>>, Map<AssetCategoryType, Integer>> dde = AssetCategoryType.Companion.getFullAssetsCounter(RxAvailableAssetsCounter$counter$1.ddf);

    /* renamed from: x */
    public Map<AssetCategoryType, Integer> apply(Map<InstrumentType, ? extends Map<Integer, ? extends a>> map) {
        kotlin.jvm.internal.i.f(map, "assets");
        return (Map) this.dde.invoke(map);
    }
}
