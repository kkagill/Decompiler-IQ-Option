package com.iqoption.core.data.repository;

import com.iqoption.core.manager.ac;
import com.iqoption.core.microservices.tradingengine.response.active.g;
import com.iqoption.core.util.z;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a6\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0001j\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003`\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$ActiveSetting;", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "invoke"})
/* compiled from: TradingEngineRepository.kt */
final class TradingEngineRepository$activeSettingStreamCache$2 extends Lambda implements a<com.iqoption.core.rx.a.a<z<g.a>, g.a>> {
    public static final TradingEngineRepository$activeSettingStreamCache$2 beu = new TradingEngineRepository$activeSettingStreamCache$2();

    TradingEngineRepository$activeSettingStreamCache$2() {
        super(0);
    }

    /* renamed from: AX */
    public final com.iqoption.core.rx.a.a<z<g.a>, g.a> invoke() {
        return ac.a(ac.bkp, "Active setting", TradingEngineRepository$activeSettingStreamCache$2$streamFactory$1.bev, com.iqoption.core.manager.i.bjd.Ys(), com.iqoption.core.manager.i.bjd.Yh(), 0, null, 48, null);
    }
}
