package com.iqoption.fragment.assets.model;

import androidx.collection.ArrayMap;
import java.util.Map;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"getSharedMap", "", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "invoke"})
/* compiled from: AssetCategoryType.kt */
final class AssetCategoryType$Companion$getCategoryAssetsCounter$1 extends Lambda implements a<Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>> {
    final /* synthetic */ ThreadLocal $threadLocal;

    AssetCategoryType$Companion$getCategoryAssetsCounter$1(ThreadLocal threadLocal) {
        this.$threadLocal = threadLocal;
        super(0);
    }

    /* renamed from: aAU */
    public final Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a> invoke() {
        Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a> map = (Map) this.$threadLocal.get();
        if (map != null) {
            return map;
        }
        ArrayMap arrayMap = new ArrayMap();
        this.$threadLocal.set(arrayMap);
        return arrayMap;
    }
}
