package com.iqoption.core.marketanalysis;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/core/marketanalysis/MarketAnalysisProvider;", "", "getCurrentTabActive", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "Companion", "core_release"})
/* compiled from: MarketAnalysisProvider.kt */
public interface e {
    public static final a blj = a.bll;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, bng = {"Lcom/iqoption/core/marketanalysis/MarketAnalysisProvider$Companion;", "", "()V", "instance", "Lcom/iqoption/core/marketanalysis/MarketAnalysisProvider;", "getInstance", "()Lcom/iqoption/core/marketanalysis/MarketAnalysisProvider;", "setInstance", "(Lcom/iqoption/core/marketanalysis/MarketAnalysisProvider;)V", "core_release"})
    /* compiled from: MarketAnalysisProvider.kt */
    public static final class a {
        public static e blk;
        static final /* synthetic */ a bll = new a();

        private a() {
        }

        public final e YV() {
            e eVar = blk;
            if (eVar == null) {
                kotlin.jvm.internal.i.lG("instance");
            }
            return eVar;
        }

        public final void a(e eVar) {
            kotlin.jvm.internal.i.f(eVar, "<set-?>");
            blk = eVar;
        }
    }

    io.reactivex.e<com.iqoption.core.microservices.tradingengine.response.active.a> YU();
}
