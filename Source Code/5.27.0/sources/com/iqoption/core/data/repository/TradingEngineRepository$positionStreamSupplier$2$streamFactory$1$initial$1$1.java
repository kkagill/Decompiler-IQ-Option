package com.iqoption.core.data.repository;

import com.iqoption.core.data.model.aud.a;
import com.iqoption.core.microservices.tradingengine.response.order.TradingOrder;
import com.iqoption.core.microservices.tradingengine.response.position.TradingPosition;
import java.util.Iterator;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/data/model/aud/AudListState;", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "state", "invoke"})
/* compiled from: TradingEngineRepository.kt */
final class TradingEngineRepository$positionStreamSupplier$2$streamFactory$1$initial$1$1 extends Lambda implements b<a<TradingPosition>, a<TradingPosition>> {
    final /* synthetic */ List $positions;

    TradingEngineRepository$positionStreamSupplier$2$streamFactory$1$initial$1$1(List list) {
        this.$positions = list;
        super(1);
    }

    /* renamed from: b */
    public final a<TradingPosition> invoke(a<TradingPosition> aVar) {
        kotlin.jvm.internal.i.f(aVar, "state");
        h.bem.evictAll();
        Iterator it = this.$positions.iterator();
        while (true) {
            List list = null;
            if (it.hasNext()) {
                long longValue;
                TradingPosition tradingPosition = (TradingPosition) it.next();
                Long valueOf = Long.valueOf(tradingPosition.aiS());
                if ((((Number) valueOf).longValue() > 0 ? 1 : null) == null) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    longValue = valueOf.longValue();
                    for (Object next : tradingPosition.getOrders()) {
                        Object obj;
                        if (((TradingOrder) next).getId() == longValue) {
                            obj = 1;
                            continue;
                        } else {
                            obj = null;
                            continue;
                        }
                        if (obj != null) {
                            break;
                        }
                    }
                    Object next2 = null;
                    TradingOrder tradingOrder = (TradingOrder) next2;
                    if (tradingOrder != null) {
                        h.bet.a(tradingPosition.getId(), tradingOrder);
                    }
                }
                valueOf = Long.valueOf(tradingPosition.aiT());
                if ((((Number) valueOf).longValue() > 0 ? 1 : null) == null) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    longValue = valueOf.longValue();
                    for (List next3 : tradingPosition.getOrders()) {
                        Object obj2;
                        if (((TradingOrder) next3).getId() == longValue) {
                            obj2 = 1;
                            continue;
                        } else {
                            obj2 = null;
                            continue;
                        }
                        if (obj2 != null) {
                            list = next3;
                            break;
                        }
                    }
                    TradingOrder tradingOrder2 = (TradingOrder) list;
                    if (tradingOrder2 != null) {
                        h.bet.a(tradingPosition.getId(), tradingOrder2);
                    }
                }
            } else {
                List list2 = this.$positions;
                kotlin.jvm.internal.i.e(list2, "positions");
                return a.a(aVar, list2, null, 2, null);
            }
        }
    }
}
