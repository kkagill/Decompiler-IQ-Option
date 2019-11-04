package com.iqoption.core.data.repository;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.e;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import java.util.Map;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "kotlin.jvm.PlatformType", "account", "Lcom/iqoption/core/IQAccount;", "invoke"})
/* compiled from: TradingEngineRepository.kt */
final class TradingEngineRepository$underlyingStreams$1$streamFactory$1 extends Lambda implements b<e, io.reactivex.e<Map<Integer, ? extends a>>> {
    final /* synthetic */ InstrumentType $instrumentType;

    TradingEngineRepository$underlyingStreams$1$streamFactory$1(InstrumentType instrumentType) {
        this.$instrumentType = instrumentType;
        super(1);
    }

    /* renamed from: a */
    public final io.reactivex.e<Map<Integer, a>> invoke(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "account");
        return io.reactivex.e.a((org.a.b) com.iqoption.core.microservices.tradingengine.e.bzn.O(this.$instrumentType).bkO(), (org.a.b) com.iqoption.core.microservices.tradingengine.e.bzn.a(this.$instrumentType, eVar.Et(), eVar.Er())).g(AnonymousClass1.beX);
    }
}
