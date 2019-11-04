package com.iqoption.core.data.repository;

import com.iqoption.core.e;
import com.iqoption.core.microservices.tradingengine.response.position.TradingPosition;
import io.reactivex.b.c;
import io.reactivex.b.g;
import io.reactivex.b.l;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/data/model/aud/AudListState;", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "kotlin.jvm.PlatformType", "account", "Lcom/iqoption/core/IQAccount;", "invoke"})
/* compiled from: TradingEngineRepository.kt */
final class TradingEngineRepository$positionStreamSupplier$2$streamFactory$1 extends Lambda implements kotlin.jvm.a.b<e, io.reactivex.e<com.iqoption.core.data.model.aud.a<TradingPosition>>> {
    public static final TradingEngineRepository$positionStreamSupplier$2$streamFactory$1 beL = new TradingEngineRepository$positionStreamSupplier$2$streamFactory$1();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lkotlin/Function1;", "Lcom/iqoption/core/data/model/aud/AudListState;", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "positions", "", "apply"})
    /* compiled from: TradingEngineRepository.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a beP = new a();

        a() {
        }

        /* renamed from: au */
        public final kotlin.jvm.a.b<com.iqoption.core.data.model.aud.a<TradingPosition>, com.iqoption.core.data.model.aud.a<TradingPosition>> apply(List<TradingPosition> list) {
            kotlin.jvm.internal.i.f(list, "positions");
            return new TradingEngineRepository$positionStreamSupplier$2$streamFactory$1$initial$1$1(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lkotlin/Function1;", "Lcom/iqoption/core/data/model/aud/AudListState;", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "updated", "", "apply"})
    /* compiled from: TradingEngineRepository.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b beQ = new b();

        b() {
        }

        /* renamed from: au */
        public final kotlin.jvm.a.b<com.iqoption.core.data.model.aud.a<TradingPosition>, com.iqoption.core.data.model.aud.a<TradingPosition>> apply(List<TradingPosition> list) {
            kotlin.jvm.internal.i.f(list, "updated");
            return new TradingEngineRepository$positionStreamSupplier$2$streamFactory$1$updates$1$1(list);
        }
    }

    TradingEngineRepository$positionStreamSupplier$2$streamFactory$1() {
        super(1);
    }

    /* renamed from: a */
    public final io.reactivex.e<com.iqoption.core.data.model.aud.a<TradingPosition>> invoke(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "account");
        io.reactivex.e g = h.bet.aK(eVar.DH()).bkO().g(a.beP);
        kotlin.jvm.internal.i.e(g, "zipPositionRequests(acco…  }\n                    }");
        AnonymousClass1 anonymousClass1 = AnonymousClass1.beM;
        io.reactivex.e g2 = h.bet.aL(eVar.DH()).g(b.beQ);
        kotlin.jvm.internal.i.e(g2, "mergePositionUpdates(acc…  }\n                    }");
        return g.c((org.a.b) g2).a(com.iqoption.core.data.model.aud.a.bde.VX(), (c) AnonymousClass2.beN).b((l) AnonymousClass3.beO);
    }
}
