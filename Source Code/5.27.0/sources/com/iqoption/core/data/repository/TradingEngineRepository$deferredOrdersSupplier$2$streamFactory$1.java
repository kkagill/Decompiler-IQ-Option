package com.iqoption.core.data.repository;

import com.iqoption.core.e;
import com.iqoption.core.microservices.tradingengine.response.order.TradingOrder;
import io.reactivex.b.c;
import io.reactivex.b.g;
import io.reactivex.b.l;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/data/model/aud/AudListState;", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder;", "kotlin.jvm.PlatformType", "account", "Lcom/iqoption/core/IQAccount;", "invoke"})
/* compiled from: TradingEngineRepository.kt */
final class TradingEngineRepository$deferredOrdersSupplier$2$streamFactory$1 extends Lambda implements kotlin.jvm.a.b<e, io.reactivex.e<com.iqoption.core.data.model.aud.a<TradingOrder>>> {
    public static final TradingEngineRepository$deferredOrdersSupplier$2$streamFactory$1 bex = new TradingEngineRepository$deferredOrdersSupplier$2$streamFactory$1();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lkotlin/Function1;", "Lcom/iqoption/core/data/model/aud/AudListState;", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder;", "orders", "", "apply"})
    /* compiled from: TradingEngineRepository.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a beB = new a();

        a() {
        }

        /* renamed from: au */
        public final kotlin.jvm.a.b<com.iqoption.core.data.model.aud.a<TradingOrder>, com.iqoption.core.data.model.aud.a<TradingOrder>> apply(List<TradingOrder> list) {
            kotlin.jvm.internal.i.f(list, "orders");
            return new TradingEngineRepository$deferredOrdersSupplier$2$streamFactory$1$initialStream$1$1(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lkotlin/Function1;", "Lcom/iqoption/core/data/model/aud/AudListState;", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder;", "updated", "", "apply"})
    /* compiled from: TradingEngineRepository.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b beC = new b();

        b() {
        }

        /* renamed from: au */
        public final kotlin.jvm.a.b<com.iqoption.core.data.model.aud.a<TradingOrder>, com.iqoption.core.data.model.aud.a<TradingOrder>> apply(List<TradingOrder> list) {
            kotlin.jvm.internal.i.f(list, "updated");
            return new TradingEngineRepository$deferredOrdersSupplier$2$streamFactory$1$updatesStream$1$1(list);
        }
    }

    TradingEngineRepository$deferredOrdersSupplier$2$streamFactory$1() {
        super(1);
    }

    /* renamed from: a */
    public final io.reactivex.e<com.iqoption.core.data.model.aud.a<TradingOrder>> invoke(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "account");
        io.reactivex.e g = h.bet.aM(eVar.DH()).bkO().g(a.beB);
        kotlin.jvm.internal.i.e(g, "zipDeferredOrdersRequest…  }\n                    }");
        AnonymousClass1 anonymousClass1 = AnonymousClass1.bey;
        io.reactivex.e g2 = h.bet.aN(eVar.DH()).g(b.beC);
        kotlin.jvm.internal.i.e(g2, "mergeDeferredOrdersUpdat…  }\n                    }");
        return g.c((org.a.b) g2).a(com.iqoption.core.data.model.aud.a.bde.VX(), (c) AnonymousClass2.bez).b((l) AnonymousClass3.beA);
    }
}
