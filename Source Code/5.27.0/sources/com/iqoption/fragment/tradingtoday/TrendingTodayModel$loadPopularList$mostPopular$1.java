package com.iqoption.fragment.tradingtoday;

import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.microservices.f.a.a.a;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;", "input", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "invoke"})
/* compiled from: TrendingTodayModel.kt */
final class TrendingTodayModel$loadPopularList$mostPopular$1 extends Lambda implements b<a, d> {
    final /* synthetic */ com.iqoption.app.helpers.a $activeSettingHelper;
    final /* synthetic */ boolean $isEnabledIntraday;
    final /* synthetic */ long $timeSync;

    TrendingTodayModel$loadPopularList$mostPopular$1(com.iqoption.app.helpers.a aVar, long j, boolean z) {
        this.$activeSettingHelper = aVar;
        this.$timeSync = j;
        this.$isEnabledIntraday = z;
        super(1);
    }

    /* renamed from: j */
    public final d invoke(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "input");
        com.iqoption.core.microservices.tradingengine.response.active.a a = this.$activeSettingHelper.a(Integer.valueOf(aVar.getActiveId()), aVar.getInstrumentType());
        if (a == null || !a.aX(this.$timeSync) || a.isSuspended()) {
            return null;
        }
        if (ActiveType.INTRADAY_ACTIVE != a.getActiveType() || this.$isEnabledIntraday) {
            return new d(PopularType.MOST_POPULAR, a, a.bzg.h(aVar), null, 8, null);
        }
        return null;
    }
}
