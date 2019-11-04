package com.iqoption.core.microservices.tradingengine;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.a;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/tradingengine/response/OptionQuote;", "invoke"})
/* compiled from: TradingEngineRequests.kt */
final class TradingEngineRequests$getOptionQuoteUpdates$1 extends Lambda implements b<a, Boolean> {
    final /* synthetic */ InstrumentType $instrumentType;
    final /* synthetic */ com.iqoption.core.microservices.pricing.a.a $quoteParams;

    TradingEngineRequests$getOptionQuoteUpdates$1(com.iqoption.core.microservices.pricing.a.a aVar, InstrumentType instrumentType) {
        this.$quoteParams = aVar;
        this.$instrumentType = instrumentType;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(c((a) obj));
    }

    public final boolean c(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "it");
        return kotlin.jvm.internal.i.y(aVar.getInstrumentId(), this.$quoteParams.getInstrumentId()) && aVar.getInstrumentType() == this.$instrumentType;
    }
}
