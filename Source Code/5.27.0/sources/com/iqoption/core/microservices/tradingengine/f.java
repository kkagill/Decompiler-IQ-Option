package com.iqoption.core.microservices.tradingengine;

import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/TradingMicroService;", "", "getClosePositionMicroService", "", "getGetExpirationListMicroService", "getMicroService", "getPlaceOrderMicroService", "getPlaceOrderName", "getPlaceOrderVersion", "getSpotStrikesMicroService", "getStrikesMicroService", "Companion", "core_release"})
/* compiled from: TradingMicroService.kt */
public interface f {
    public static final a bzr = a.bzw;

    @i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/TradingMicroService$Companion;", "", "()V", "digitalOptionMs", "Lcom/iqoption/core/microservices/tradingengine/DigitalOptionMicroService;", "fxOptionMs", "Lcom/iqoption/core/microservices/tradingengine/FxOptionMicroService;", "multiOptionMs", "Lcom/iqoption/core/microservices/tradingengine/MultiOptionMicroService;", "tradingEngineMs", "Lcom/iqoption/core/microservices/tradingengine/TradingEngineMicroService;", "getMs", "Lcom/iqoption/core/microservices/tradingengine/TradingMicroService;", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "getMsOptional", "isSupported", "", "core_release"})
    /* compiled from: TradingMicroService.kt */
    public static final class a {
        private static final a bzs = new a();
        private static final b bzt = new b();
        private static final d bzu = new d();
        private static final c bzv = new c();
        static final /* synthetic */ a bzw = new a();

        private a() {
        }

        public final f Q(InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            f R = R(instrumentType);
            if (R != null) {
                return R;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported InstrumentType: ");
            stringBuilder.append(instrumentType);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        private final f R(InstrumentType instrumentType) {
            switch (g.aob[instrumentType.ordinal()]) {
                case 1:
                    return bzs;
                case 2:
                    return bzt;
                case 3:
                case 4:
                case 5:
                    return bzu;
                case 6:
                    return bzv;
                default:
                    return null;
            }
        }
    }

    @i(bne = {1, 1, 15})
    /* compiled from: TradingMicroService.kt */
    public static final class b {
        public static String a(f fVar) {
            return null;
        }

        public static String b(f fVar) {
            return null;
        }
    }

    String HV();

    String ahF();

    String ahG();
}
