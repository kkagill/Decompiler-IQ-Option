package com.iqoption.fragment.tradingtoday;

import com.iqoption.core.microservices.tradingengine.response.active.a;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "invoke"})
/* compiled from: TrendingTodayModel.kt */
final class TrendingTodayModel$loadPopularList$1$3 extends Lambda implements b<a, Boolean> {
    final /* synthetic */ int[] $excludedAssets;

    TrendingTodayModel$loadPopularList$1$3(int[] iArr) {
        this.$excludedAssets = iArr;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(w((a) obj));
    }

    public final boolean w(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "it");
        return i.contains(this.$excludedAssets, aVar.getActiveId());
    }
}
