package com.iqoption.fragment.tradingtoday;

import com.iqoption.core.microservices.tradingengine.response.active.a;
import kotlin.Pair;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;", "input", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "invoke"})
/* compiled from: TrendingTodayModel.kt */
final class TrendingTodayModel$loadPopularList$topGainers$1 extends Lambda implements b<Pair<? extends a, ? extends com.iqoption.core.microservices.f.a.a.a>, d> {
    public static final TrendingTodayModel$loadPopularList$topGainers$1 dqW = new TrendingTodayModel$loadPopularList$topGainers$1();

    TrendingTodayModel$loadPopularList$topGainers$1() {
        super(1);
    }

    /* renamed from: f */
    public final d invoke(Pair<? extends a, com.iqoption.core.microservices.f.a.a.a> pair) {
        kotlin.jvm.internal.i.f(pair, "input");
        Double f = com.iqoption.core.microservices.f.a.a.a.bzg.f((com.iqoption.core.microservices.f.a.a.a) pair.bni());
        return (f == null || Double.compare(f.doubleValue(), 0.001d) != 1) ? null : new d(PopularType.TOP_GAINERS, (a) pair.getFirst(), f, null, 8, null);
    }
}
