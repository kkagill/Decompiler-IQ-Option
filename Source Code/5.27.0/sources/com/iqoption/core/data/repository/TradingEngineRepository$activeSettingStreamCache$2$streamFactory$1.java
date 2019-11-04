package com.iqoption.core.data.repository;

import com.iqoption.core.e;
import com.iqoption.core.microservices.tradingengine.response.active.g.a;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$ActiveSetting;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/iqoption/core/IQAccount;", "invoke"})
/* compiled from: TradingEngineRepository.kt */
final class TradingEngineRepository$activeSettingStreamCache$2$streamFactory$1 extends Lambda implements b<e, io.reactivex.e<a>> {
    public static final TradingEngineRepository$activeSettingStreamCache$2$streamFactory$1 bev = new TradingEngineRepository$activeSettingStreamCache$2$streamFactory$1();

    TradingEngineRepository$activeSettingStreamCache$2$streamFactory$1() {
        super(1);
    }

    /* renamed from: a */
    public final io.reactivex.e<a> invoke(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "<anonymous parameter 0>");
        return com.iqoption.core.microservices.tradingengine.e.bzn.ahH().bkO();
    }
}
