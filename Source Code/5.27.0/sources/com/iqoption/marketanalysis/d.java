package com.iqoption.marketanalysis;

import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.marketanalysis.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004H\u0016¨\u0006\b"}, bng = {"Lcom/iqoption/marketanalysis/MarketAnalysisProviderImpl;", "Lcom/iqoption/core/marketanalysis/MarketAnalysisProvider;", "()V", "getCurrentTabActive", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "kotlin.jvm.PlatformType", "Companion", "app_optionXRelease"})
/* compiled from: MarketAnalysisProviderImpl.kt */
public final class d implements e {
    public static final a dFp = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, bng = {"Lcom/iqoption/marketanalysis/MarketAnalysisProviderImpl$Companion;", "", "()V", "initMarketAnalysisProvider", "", "app_optionXRelease"})
    /* compiled from: MarketAnalysisProviderImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void aNM() {
            e.blj.a(new d());
        }
    }

    public static final void aNM() {
        dFp.aNM();
    }

    public io.reactivex.e<com.iqoption.core.microservices.tradingengine.response.active.a> YU() {
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        return IM.IP();
    }
}
