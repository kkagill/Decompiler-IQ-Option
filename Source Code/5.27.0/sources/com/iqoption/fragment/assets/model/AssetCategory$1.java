package com.iqoption.fragment.assets.model;

import com.iqoption.core.microservices.tradingengine.response.active.a;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "invoke"})
/* compiled from: AssetCategory.kt */
final class AssetCategory$1 extends Lambda implements b<a, Boolean> {
    final /* synthetic */ AssetCategoryType $type;

    AssetCategory$1(AssetCategoryType assetCategoryType) {
        this.$type = assetCategoryType;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(w((a) obj));
    }

    public final boolean w(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "it");
        return ((Boolean) this.$type.getFilter().invoke(aVar)).booleanValue();
    }
}
