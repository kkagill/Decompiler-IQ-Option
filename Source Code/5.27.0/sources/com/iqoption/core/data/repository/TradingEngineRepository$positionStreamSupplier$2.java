package com.iqoption.core.data.repository;

import com.iqoption.core.manager.ac;
import com.iqoption.core.microservices.tradingengine.response.position.TradingPosition;
import com.iqoption.core.util.z;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aZ\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0001j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003`\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/data/model/aud/AudListState;", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "invoke"})
/* compiled from: TradingEngineRepository.kt */
final class TradingEngineRepository$positionStreamSupplier$2 extends Lambda implements a<com.iqoption.core.rx.a.a<z<com.iqoption.core.data.model.aud.a<TradingPosition>>, com.iqoption.core.data.model.aud.a<TradingPosition>>> {
    public static final TradingEngineRepository$positionStreamSupplier$2 beK = new TradingEngineRepository$positionStreamSupplier$2();

    TradingEngineRepository$positionStreamSupplier$2() {
        super(0);
    }

    /* renamed from: AX */
    public final com.iqoption.core.rx.a.a<z<com.iqoption.core.data.model.aud.a<TradingPosition>>, com.iqoption.core.data.model.aud.a<TradingPosition>> invoke() {
        return ac.a(ac.bkp, "Trading positions", TradingEngineRepository$positionStreamSupplier$2$streamFactory$1.beL, com.iqoption.core.manager.i.bjd.Yt(), com.iqoption.core.manager.i.bjd.Yh(), 0, null, 48, null);
    }
}
