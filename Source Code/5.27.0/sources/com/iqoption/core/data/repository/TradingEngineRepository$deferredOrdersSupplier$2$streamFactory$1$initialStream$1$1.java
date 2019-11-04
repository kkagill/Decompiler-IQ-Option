package com.iqoption.core.data.repository;

import com.iqoption.core.data.model.aud.a;
import com.iqoption.core.microservices.tradingengine.response.order.TradingOrder;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/data/model/aud/AudListState;", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder;", "state", "invoke"})
/* compiled from: TradingEngineRepository.kt */
final class TradingEngineRepository$deferredOrdersSupplier$2$streamFactory$1$initialStream$1$1 extends Lambda implements b<a<TradingOrder>, a<TradingOrder>> {
    final /* synthetic */ List $orders;

    TradingEngineRepository$deferredOrdersSupplier$2$streamFactory$1$initialStream$1$1(List list) {
        this.$orders = list;
        super(1);
    }

    /* renamed from: b */
    public final a<TradingOrder> invoke(a<TradingOrder> aVar) {
        kotlin.jvm.internal.i.f(aVar, "state");
        List list = this.$orders;
        kotlin.jvm.internal.i.e(list, "orders");
        return a.a(aVar, list, null, 2, null);
    }
}
