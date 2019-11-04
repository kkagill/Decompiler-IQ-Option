package com.iqoption.core.microservices.tradingengine;

import com.iqoption.core.microservices.tradingengine.f.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/TradingEngineMicroService;", "Lcom/iqoption/core/microservices/tradingengine/TradingMicroService;", "()V", "getMicroService", "", "getPlaceOrderName", "getPlaceOrderVersion", "core_release"})
/* compiled from: TradingEngineMicroService.kt */
public final class d implements f {
    public String HV() {
        return "trading";
    }

    public String ahF() {
        return b.a(this);
    }

    public String ahG() {
        return b.b(this);
    }
}