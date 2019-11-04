package com.iqoption.core.microservices.tradingengine;

import com.google.gson.reflect.TypeToken;
import com.iqoption.core.connect.j;
import com.iqoption.core.connect.k;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.o;
import com.iqoption.core.microservices.tradingengine.response.custodial.CustordialHistory;
import com.iqoption.core.microservices.tradingengine.response.order.TradingOrder;
import com.iqoption.core.microservices.tradingengine.response.position.TPSLKind;
import com.iqoption.core.microservices.tradingengine.response.position.TradingPosition;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.dto.entity.position.PendingOrderWrapper;
import io.reactivex.b.l;
import io.reactivex.p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u000207J3\u00108\u001a\b\u0012\u0004\u0012\u00020:092\n\b\u0002\u0010;\u001a\u0004\u0018\u0001072\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\u0006\u0010<\u001a\u00020=H\u0002¢\u0006\u0002\u0010>J\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u00106\u001a\u0002072\u0006\u0010<\u001a\u00020=J\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020=JQ\u0010A\u001a\b\u0012\u0004\u0012\u00020B092\u0006\u0010C\u001a\u0002072\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E2\b\b\u0002\u0010F\u001a\u00020G2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010E2\b\b\u0002\u0010I\u001a\u00020G2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010=¢\u0006\u0002\u0010KJG\u0010A\u001a\b\u0012\u0004\u0012\u00020B092\u0006\u0010C\u001a\u0002072\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010=2\b\b\u0002\u0010L\u001a\u00020G¢\u0006\u0002\u0010MJ\u0016\u0010N\u001a\u0002052\u0006\u0010;\u001a\u0002072\u0006\u0010O\u001a\u00020PJ\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020R092\u0006\u0010O\u001a\u00020PJ\u001e\u0010S\u001a\b\u0012\u0004\u0012\u00020R0T2\u0006\u0010O\u001a\u00020P2\b\b\u0002\u0010U\u001a\u000207J\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020W092\u0006\u0010;\u001a\u000207H\u0007J*\u0010X\u001a\b\u0012\u0004\u0012\u00020Y092\u0006\u0010O\u001a\u00020P2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010[\u001a\u000207J,\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0]0T2\u0006\u0010O\u001a\u00020P2\u0006\u0010_\u001a\u00020\u00042\b\b\u0002\u0010U\u001a\u000207J*\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0]092\u0006\u0010O\u001a\u00020P2\u0006\u0010_\u001a\u00020\u00042\u0006\u0010a\u001a\u00020bJ\f\u0010c\u001a\b\u0012\u0004\u0012\u00020d09J\u0014\u0010e\u001a\b\u0012\u0004\u0012\u00020f092\u0006\u0010g\u001a\u00020PJ(\u0010h\u001a\b\u0012\u0004\u0012\u00020f0T2\u0006\u0010g\u001a\u00020P2\b\b\u0002\u0010U\u001a\u0002072\b\b\u0002\u0010i\u001a\u00020=J*\u0010j\u001a\b\u0012\u0004\u0012\u00020k0T2\u0006\u0010l\u001a\u00020m2\b\b\u0002\u0010n\u001a\u0002072\b\b\u0002\u0010o\u001a\u00020pH\u0007J*\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020k0]092\u0006\u0010O\u001a\u00020P2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00040]H\u0007J\u0014\u0010s\u001a\b\u0012\u0004\u0012\u00020t092\u0006\u0010C\u001a\u000207J(\u0010u\u001a\b\u0012\u0004\u0012\u00020t0T2\u0006\u0010O\u001a\u00020P2\b\b\u0002\u0010v\u001a\u0002072\b\b\u0002\u0010U\u001a\u000207J \u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020t0]092\f\u0010x\u001a\b\u0012\u0004\u0012\u0002070]J\u0014\u0010y\u001a\b\u0012\u0004\u0012\u00020z092\u0006\u0010;\u001a\u000207J\u001c\u0010{\u001a\b\u0012\u0004\u0012\u00020|092\u0006\u0010C\u001a\u0002072\u0006\u0010O\u001a\u00020PJ\u001e\u0010}\u001a\b\u0012\u0004\u0012\u00020|0T2\u0006\u0010O\u001a\u00020P2\b\b\u0002\u0010U\u001a\u000207JC\u0010~\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020|0]092\u0006\u0010O\u001a\u00020P2\b\b\u0002\u0010v\u001a\u0002072\n\b\u0002\u0010\u001a\u0004\u0018\u00010b2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010b¢\u0006\u0003\u0010\u0001J>\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010]092\u0006\u0010O\u001a\u00020P2\u0006\u0010_\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u0002072\u0007\u0010\u0001\u001a\u0002072\u0006\u0010a\u001a\u00020bJ>\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010]092\u0006\u0010O\u001a\u00020P2\u0006\u0010_\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u0002072\u0007\u0010\u0001\u001a\u0002072\u0006\u0010a\u001a\u00020bJ\u0016\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u0001092\u0006\u0010g\u001a\u00020PJ*\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010T2\u0006\u0010g\u001a\u00020P2\b\b\u0002\u0010U\u001a\u0002072\b\b\u0002\u0010i\u001a\u00020=J5\u0010\u0001\u001a\u0002052\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010a\u001a\u00020b2\u0007\u0010\u0001\u001a\u00020E2\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020=Jµ\u0001\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u0001092\u0006\u0010a\u001a\u0002072\u0006\u0010Z\u001a\u00020\u00042\u0006\u0010O\u001a\u00020P2\u0006\u0010[\u001a\u0002072\u0007\u0010\u0001\u001a\u0002072\u0007\u0010\u0001\u001a\u00020=2\u0007\u0010\u0001\u001a\u00020E2\u0007\u0010\u0001\u001a\u00020b2\u0007\u0010\u0001\u001a\u00020E2\u0007\u0010\u0001\u001a\u00020E2\u0007\u0010\u0001\u001a\u00020E2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010E2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010E2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010=2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010=2\f\b\u0002\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0003\u0010\u0001R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n '*\u0004\u0018\u00010&0&X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0001"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/TradingEngineRequests;", "", "()V", "BUY", "", "CMD_CANCEL_POSITION", "CMD_CHANGE_AUTO_MARGIN_CALL", "CMD_CHANGE_TPSL", "CMD_CLOSE_POSITION", "CMD_GET_AVAILABLE_LEVERAGES", "CMD_GET_CUSTODIAL_HISTORY", "CMD_GET_DEFERRED_ORDERS", "CMD_GET_EXPIRATION_LIST", "CMD_GET_INITIALIZATION_DATA", "CMD_GET_INSTRUMENTS", "CMD_GET_LAST_QUOTE", "CMD_GET_ORDER", "CMD_GET_ORDERS_BY_IDS", "CMD_GET_OVERNIGHT_HISTORY", "CMD_GET_POSITION", "CMD_GET_POSITIONS", "CMD_GET_SPOT_LIST", "CMD_GET_STRIKE_LIST", "CMD_GET_UNDERLYING_LIST", "CMD_PLACE_DIGITAL_OPTION", "CMD_PLACE_ORDER", "EVENT_AVAILABLE_LEVERAGES_CHANGED", "EVENT_EXPIRATION_LIST", "EVENT_INSTRUMENTS_CHANGED", "EVENT_OPTION_QUOTE", "EVENT_ORDER_CHANGED", "EVENT_POSITION_CHANGED", "EVENT_UNDERLYING_LIST_CHANGED", "EXPIRATIONS_PARSER", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/ExpirationsJsonParser;", "INSTRUMENT_TYPE", "IS_REGULATED", "LIST_OF_QUOTES_TYPE", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "MS_DIGITAL_OPTIONS", "MS_FX_QUOTES", "MS_TRADING", "MS_TRADING_FX_OPTION", "MS_TRADING_INSTRUMENTS_FX_OPTIONS", "MS_TRADING_MULTI_OPTION", "SELL", "STRIKES_PARSER", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/StrikeJsonParser;", "TYPE", "USER_BALANCE_ID", "USER_GROUP_ID", "cancelOrder", "Lio/reactivex/Completable;", "orderId", "", "changeAutoMarginCall", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/tradingengine/response/order/ChangeAutoMarginResult;", "positionId", "autoMarginCall", "", "(Ljava/lang/Long;Ljava/lang/Long;Z)Lio/reactivex/Single;", "changeOrderAutoMarginCall", "changePositionAutoMarginCall", "changeTpsl", "Lcom/iqoption/core/microservices/tradingengine/response/order/ChangeTpslResult;", "id", "takeProfit", "", "takeProfitType", "Lcom/iqoption/core/microservices/tradingengine/response/position/TPSLKind;", "stopLoss", "stopLossType", "isTrailingStop", "(JLjava/lang/Double;Lcom/iqoption/core/microservices/tradingengine/response/position/TPSLKind;Ljava/lang/Double;Lcom/iqoption/core/microservices/tradingengine/response/position/TPSLKind;Ljava/lang/Boolean;)Lio/reactivex/Single;", "valueType", "(JLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Lcom/iqoption/core/microservices/tradingengine/response/position/TPSLKind;)Lio/reactivex/Single;", "closePosition", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "getAvailableLeverages", "Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeveragesResult;", "getAvailableLeveragesUpdates", "Lio/reactivex/Flowable;", "userGroupId", "getCustodialHistory", "Lcom/iqoption/core/microservices/tradingengine/response/custodial/CustordialHistory$List;", "getDeferredOrders", "Lcom/iqoption/core/microservices/tradingengine/response/order/DeferredOrdersResponse;", "instrumentId", "balanceId", "getExpirationUpdates", "", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/Expiration;", "underlying", "getExpirations", "activeId", "", "getInitializationData", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$ActiveSetting;", "getInstruments", "Lcom/iqoption/core/microservices/tradingengine/response/active/InstrumentsResult;", "type", "getInstrumentsUpdates", "isRegulated", "getOptionQuoteUpdates", "Lcom/iqoption/core/microservices/tradingengine/response/OptionQuote;", "quoteParams", "Lcom/iqoption/core/microservices/pricing/request/QuoteParams;", "throttling", "throttlingUnit", "Ljava/util/concurrent/TimeUnit;", "getOptionQuotes", "instrumentIds", "getOrder", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder;", "getOrderUpdates", "userBalanceId", "getOrders", "ids", "getOvernightHistory", "Lcom/iqoption/core/microservices/tradingengine/response/overnight/OvernightHistory$List;", "getPosition", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "getPositionUpdates", "getPositions", "skip", "limit", "(Lcom/iqoption/core/data/model/InstrumentType;JLjava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/Single;", "getSpotStrikes", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/Strike;", "expiration", "period", "getStrikes", "getUnderlyingList", "Lcom/iqoption/core/microservices/tradingengine/response/active/UnderlyingResult;", "getUnderlyingListUpdates", "placeOrder", "strike", "amount", "balance", "Lcom/iqoption/core/data/mediators/BalanceData;", "isCall", "Lcom/iqoption/core/microservices/tradingengine/response/order/PlaceOrderResult;", "balanceType", "isLong", "leverage", "price", "ask", "bid", "takeProfitPercent", "stopLossPercent", "autoMargin", "useTrailStop", "defaultTypeOrder", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Type;", "(JLjava/lang/String;Lcom/iqoption/core/data/model/InstrumentType;JJZDIDDDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Type;)Lio/reactivex/Single;", "core_release"})
/* compiled from: TradingEngineRequests.kt */
public final class e {
    private static final Type bzk = new a().getType();
    private static final com.iqoption.core.microservices.tradingengine.response.instrument.b bzl = new com.iqoption.core.microservices.tradingengine.response.instrument.b();
    private static final com.iqoption.core.microservices.tradingengine.response.instrument.f bzm = new com.iqoption.core.microservices.tradingengine.response.instrument.f();
    public static final e bzn = new e();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, bng = {"com/iqoption/core/microservices/tradingengine/TradingEngineRequests$LIST_OF_QUOTES_TYPE$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/ArrayList;", "Lcom/iqoption/core/microservices/tradingengine/response/OptionQuote;", "core_release"})
    /* compiled from: TradingEngineRequests.kt */
    public static final class a extends TypeToken<ArrayList<com.iqoption.core.microservices.tradingengine.response.a>> {
        a() {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeveragesResult;", "test"})
    /* compiled from: TradingEngineRequests.kt */
    static final class b<T> implements l<com.iqoption.core.microservices.tradingengine.response.b.b> {
        final /* synthetic */ InstrumentType $instrumentType;

        b(InstrumentType instrumentType) {
            this.$instrumentType = instrumentType;
        }

        /* renamed from: b */
        public final boolean test(com.iqoption.core.microservices.tradingengine.response.b.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return bVar.getInstrumentType() == this.$instrumentType;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/tradingengine/response/active/InstrumentsResult;", "test"})
    /* compiled from: TradingEngineRequests.kt */
    static final class c<T> implements l<com.iqoption.core.microservices.tradingengine.response.active.l> {
        final /* synthetic */ InstrumentType bzo;

        c(InstrumentType instrumentType) {
            this.bzo = instrumentType;
        }

        /* renamed from: b */
        public final boolean test(com.iqoption.core.microservices.tradingengine.response.active.l lVar) {
            kotlin.jvm.internal.i.f(lVar, "it");
            return lVar.aif() == this.bzo;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/tradingengine/response/OptionQuote;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TradingEngineRequests.kt */
    static final class d<T> implements io.reactivex.b.f<com.iqoption.core.microservices.tradingengine.response.a> {
        public static final d bzp = new d();

        d() {
        }

        /* renamed from: d */
        public final void accept(com.iqoption.core.microservices.tradingengine.response.a aVar) {
            com.iqoption.core.d.Um().EG().dn("quotes-digital");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: TradingEngineRequests.kt */
    static final class e implements io.reactivex.b.a {
        final /* synthetic */ com.iqoption.core.microservices.pricing.a.a $quoteParams;

        e(com.iqoption.core.microservices.pricing.a.a aVar) {
            this.$quoteParams = aVar;
        }

        public final void run() {
            com.iqoption.core.d.Um().EG().a("quotes-digital", false, this.$quoteParams);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder;", "test"})
    /* compiled from: TradingEngineRequests.kt */
    static final class f<T> implements l<TradingOrder> {
        final /* synthetic */ InstrumentType $instrumentType;

        f(InstrumentType instrumentType) {
            this.$instrumentType = instrumentType;
        }

        /* renamed from: a */
        public final boolean test(TradingOrder tradingOrder) {
            kotlin.jvm.internal.i.f(tradingOrder, "it");
            return tradingOrder.getInstrumentType() == this.$instrumentType;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "test"})
    /* compiled from: TradingEngineRequests.kt */
    static final class g<T> implements l<TradingPosition> {
        final /* synthetic */ InstrumentType $instrumentType;

        g(InstrumentType instrumentType) {
            this.$instrumentType = instrumentType;
        }

        /* renamed from: a */
        public final boolean test(TradingPosition tradingPosition) {
            kotlin.jvm.internal.i.f(tradingPosition, "it");
            return tradingPosition.getInstrumentType() == this.$instrumentType;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "it", "Lcom/iqoption/core/microservices/tradingengine/response/position/PositionsResult;", "apply"})
    /* compiled from: TradingEngineRequests.kt */
    static final class h<T, R> implements io.reactivex.b.g<T, R> {
        public static final h bzq = new h();

        h() {
        }

        /* renamed from: a */
        public final List<TradingPosition> apply(com.iqoption.core.microservices.tradingengine.response.position.c cVar) {
            kotlin.jvm.internal.i.f(cVar, "it");
            return cVar.agl();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/tradingengine/response/active/UnderlyingResult;", "test"})
    /* compiled from: TradingEngineRequests.kt */
    static final class i<T> implements l<o> {
        final /* synthetic */ InstrumentType bzo;

        i(InstrumentType instrumentType) {
            this.bzo = instrumentType;
        }

        /* renamed from: b */
        public final boolean test(o oVar) {
            kotlin.jvm.internal.i.f(oVar, "it");
            return oVar.aif() == this.bzo;
        }
    }

    public static final io.reactivex.e<com.iqoption.core.microservices.tradingengine.response.a> a(com.iqoption.core.microservices.pricing.a.a aVar) {
        return a(aVar, 0, null, 6, null);
    }

    private e() {
    }

    public final p<com.iqoption.core.microservices.tradingengine.response.b.b> N(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        return com.iqoption.core.d.EV().a("get-available-leverages", com.iqoption.core.microservices.tradingengine.response.b.b.class).fp("2.0").k("instrument_type", instrumentType).UB();
    }

    public final io.reactivex.e<com.iqoption.core.microservices.tradingengine.response.b.b> h(InstrumentType instrumentType, long j) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        String str = "user_group_id";
        io.reactivex.e blb = com.iqoption.core.d.EW().b("available-leverages-changed", com.iqoption.core.microservices.tradingengine.response.b.b.class).ec("2.0").i("instrument_type", instrumentType).i(str, Long.valueOf(j)).HO().HQ().b((l) new b(instrumentType)).blb();
        kotlin.jvm.internal.i.e(blb, "eventBuilderFactory\n    …\n                .share()");
        return blb;
    }

    public final p<o> O(InstrumentType instrumentType) {
        String str = "type";
        kotlin.jvm.internal.i.f(instrumentType, str);
        return com.iqoption.core.analytics.a.b.aZL.a(com.iqoption.core.d.EV().a("get-underlying-list", o.class).fq(InstrumentType.FX_INSTRUMENT == instrumentType ? "trading-instruments-fx-option" : null).fp("2.0").ch(false).k(str, instrumentType).UB(), instrumentType);
    }

    public final io.reactivex.e<o> a(InstrumentType instrumentType, long j, boolean z) {
        String str = "type";
        kotlin.jvm.internal.i.f(instrumentType, str);
        io.reactivex.e blb = com.iqoption.core.d.EW().b("underlying-list-changed", o.class).ed(InstrumentType.FX_INSTRUMENT == instrumentType ? "trading-instruments-fx-option" : null).ec("4.0").i(str, instrumentType).i("user_group_id", Long.valueOf(j)).i("is_regulated", Boolean.valueOf(z)).HO().HQ().b((l) new i(instrumentType)).blb();
        kotlin.jvm.internal.i.e(blb, "eventBuilderFactory\n    …\n                .share()");
        return blb;
    }

    public final p<com.iqoption.core.microservices.tradingengine.response.active.l> P(InstrumentType instrumentType) {
        String str = "type";
        kotlin.jvm.internal.i.f(instrumentType, str);
        return com.iqoption.core.analytics.a.b.aZL.b(com.iqoption.core.d.EV().a("get-instruments", com.iqoption.core.microservices.tradingengine.response.active.l.class).ch(false).fp("4.0").k(str, instrumentType).UB(), instrumentType);
    }

    public final io.reactivex.e<com.iqoption.core.microservices.tradingengine.response.active.l> b(InstrumentType instrumentType, long j, boolean z) {
        String str = "type";
        kotlin.jvm.internal.i.f(instrumentType, str);
        String str2 = "user_group_id";
        io.reactivex.e blb = com.iqoption.core.d.EW().b("instruments-changed", com.iqoption.core.microservices.tradingengine.response.active.l.class).i(str, instrumentType).i(str2, Long.valueOf(j)).i("is_regulated", Boolean.valueOf(z)).ec("5.0").HO().HQ().b((l) new c(instrumentType)).blb();
        kotlin.jvm.internal.i.e(blb, "eventBuilderFactory\n    …\n                .share()");
        return blb;
    }

    public final p<com.iqoption.core.microservices.tradingengine.response.active.g.a> ahH() {
        return com.iqoption.core.d.EV().a("get-initialization-data", com.iqoption.core.microservices.tradingengine.response.active.g.a.class).fp("3.0").UB();
    }

    public final p<List<TradingPosition>> a(InstrumentType instrumentType, long j, Integer num, Integer num2) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        String str = "get-positions";
        String str2 = "user_balance_id";
        p t = com.iqoption.core.d.EV().a(str, com.iqoption.core.microservices.tradingengine.response.position.c.class).fq(f.bzr.Q(instrumentType).HV()).k(str2, Long.valueOf(j)).k("instrument_type", instrumentType).k("skip", num).k(Order.LIMIT, num2).UB().t(h.bzq);
        kotlin.jvm.internal.i.e(t, "requestBuilderFactory\n  …    .map { it.positions }");
        return t;
    }

    public final io.reactivex.e<TradingPosition> i(InstrumentType instrumentType, long j) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        String str = "position-changed";
        String str2 = "user_group_id";
        io.reactivex.e blb = com.iqoption.core.d.EW().b(str, TradingPosition.class).ed(f.bzr.Q(instrumentType).HV()).i(str2, Long.valueOf(j)).i("instrument_type", instrumentType).HO().HQ().b((l) new g(instrumentType)).blb();
        kotlin.jvm.internal.i.e(blb, "eventBuilderFactory\n    …\n                .share()");
        return blb;
    }

    public final io.reactivex.e<TradingOrder> a(InstrumentType instrumentType, long j, long j2) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        String str = "order-changed";
        String str2 = "user_balance_id";
        io.reactivex.e blb = com.iqoption.core.d.EW().b(str, TradingOrder.class).ed(f.bzr.Q(instrumentType).HV()).i(str2, Long.valueOf(j)).i("user_group_id", Long.valueOf(j2)).i("instrument_type", instrumentType).HO().HQ().b((l) new f(instrumentType)).blb();
        kotlin.jvm.internal.i.e(blb, "eventBuilderFactory\n    …\n                .share()");
        return blb;
    }

    public static final p<List<com.iqoption.core.microservices.tradingengine.response.a>> b(InstrumentType instrumentType, List<String> list) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        kotlin.jvm.internal.i.f(list, "instrumentIds");
        List arrayList = new ArrayList();
        for (String put : list) {
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("id", put);
            linkedHashMap.put("type", instrumentType.toString());
            arrayList.add(linkedHashMap);
        }
        String str = InstrumentType.FX_INSTRUMENT == instrumentType ? "instruments-quotes-fx-option" : null;
        k EV = com.iqoption.core.d.EV();
        Type type = bzk;
        kotlin.jvm.internal.i.e(type, "LIST_OF_QUOTES_TYPE");
        return EV.a("get-last-quote", type).fq(str).k("instruments", arrayList).UB();
    }

    public static final io.reactivex.e<com.iqoption.core.microservices.tradingengine.response.a> a(com.iqoption.core.microservices.pricing.a.a aVar, long j, TimeUnit timeUnit) {
        kotlin.jvm.internal.i.f(aVar, "quoteParams");
        kotlin.jvm.internal.i.f(timeUnit, "throttlingUnit");
        InstrumentType instrumentType = aVar.getInstrumentType();
        io.reactivex.e e = com.iqoption.core.d.EW().b("option-quote", com.iqoption.core.microservices.tradingengine.response.a.class).ed(instrumentType == InstrumentType.FX_INSTRUMENT ? "instruments-quotes-fx-option" : null).b(new TradingEngineRequests$getOptionQuoteUpdates$1(aVar, instrumentType)).a(j, timeUnit, false).i("instrument_type", instrumentType).i("instrument_id_escape", u.a(aVar.getInstrumentId(), '.', '_', true)).i("user_group_id", Long.valueOf(aVar.adj())).HP().HQ().c((io.reactivex.b.f) d.bzp).e((io.reactivex.b.a) new e(aVar));
        kotlin.jvm.internal.i.e(e, "eventBuilderFactory\n    …AL, false, quoteParams) }");
        return e;
    }

    public final p<com.iqoption.core.microservices.tradingengine.response.order.d> a(long j, String str, InstrumentType instrumentType, long j2, long j3, boolean z, double d, int i, double d2, double d3, double d4, Double d5, Double d6, Boolean bool, Boolean bool2, TradingOrder.Type type) {
        String str2 = str;
        InstrumentType instrumentType2 = instrumentType;
        Boolean bool3 = bool2;
        kotlin.jvm.internal.i.f(str, "instrumentId");
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        double d7 = z ? d3 : d4;
        TradingOrder.Type type2 = d2 > d7 ? z ? TradingOrder.Type.STOP : TradingOrder.Type.LIMIT : d2 < d7 ? z ? TradingOrder.Type.LIMIT : TradingOrder.Type.STOP : type != null ? type : TradingOrder.Type.MARKET;
        j k = com.iqoption.core.d.EV().a("place-order-temp", com.iqoption.core.microservices.tradingengine.response.order.d.class).fp("4.0").ch(false).k("user_balance_id", Long.valueOf(j2)).k("client_platform_id", com.iqoption.core.d.Un().Dx()).k("instrument_id", str).k("instrument_type", instrumentType).k(PendingOrderWrapper.SIDE, z ? Order.BUY : Order.SELL).k("type", type2).k("amount", String.valueOf(d)).k("leverage", Integer.valueOf(i));
        if (type2 == TradingOrder.Type.LIMIT) {
            k.k("limit_price", Double.valueOf(d2));
        } else if (type2 == TradingOrder.Type.STOP) {
            k.k("stop_price", Double.valueOf(d2));
        }
        if (d5 != null) {
            k.k("take_profit_value", Double.valueOf(d5.doubleValue()));
            k.k("take_profit_kind", TPSLKind.PERCENT);
        }
        if (d6 != null) {
            k.k("stop_lose_value", Double.valueOf(d6.doubleValue()));
            k.k("stop_lose_kind", TPSLKind.PERCENT);
        }
        if (bool != null) {
            k.k("auto_margin_call", Boolean.valueOf(bool.booleanValue()));
        }
        if (bool3 != null) {
            bool2.booleanValue();
            k.k("use_trail_stop", bool3);
        }
        if (type2 != TradingOrder.Type.MARKET) {
            return k.UB();
        }
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.i.e(uuid, "UUID.randomUUID().toString()");
        k.fr(uuid);
        com.iqoption.core.analytics.a.b.aZL.a(z, j, uuid, instrumentType, j3);
        return com.iqoption.core.analytics.a.b.aZL.a(k.UB(), instrumentType, j, uuid);
    }

    public final p<com.iqoption.core.microservices.tradingengine.response.order.b> a(long j, Double d, Double d2, Boolean bool, TPSLKind tPSLKind) {
        kotlin.jvm.internal.i.f(tPSLKind, "valueType");
        return a(j, d, tPSLKind, d2, tPSLKind, bool);
    }

    public final p<com.iqoption.core.microservices.tradingengine.response.order.b> a(long j, Double d, TPSLKind tPSLKind, Double d2, TPSLKind tPSLKind2, Boolean bool) {
        kotlin.jvm.internal.i.f(tPSLKind, "takeProfitType");
        kotlin.jvm.internal.i.f(tPSLKind2, "stopLossType");
        j k = com.iqoption.core.d.EV().a("change-tpsl", com.iqoption.core.microservices.tradingengine.response.order.b.class).fp("2.0").k(PendingOrderWrapper.POSITION_ID, Long.valueOf(j));
        if (d != null) {
            d.doubleValue();
            k.k("take_profit_value", d);
            k.k("take_profit_kind", tPSLKind);
        }
        if (d2 != null) {
            d2.doubleValue();
            k.k("stop_lose_value", d2);
            k.k("stop_lose_kind", tPSLKind2);
        }
        if (bool != null) {
            k.k("use_trail_stop", Boolean.valueOf(bool.booleanValue()));
        }
        return k.UB();
    }

    public final p<com.iqoption.core.microservices.tradingengine.response.order.a> b(long j, boolean z) {
        return a(this, Long.valueOf(j), null, z, 2, null);
    }

    private final p<com.iqoption.core.microservices.tradingengine.response.order.a> a(Long l, Long l2, boolean z) {
        String str = "auto_margin_call";
        j k = com.iqoption.core.d.EV().a("change-auto-margin-call", com.iqoption.core.microservices.tradingengine.response.order.a.class).fp("2.0").k(str, Boolean.valueOf(z));
        if (l != null) {
            l.longValue();
            k.k(PendingOrderWrapper.POSITION_ID, l);
        }
        if (l2 != null) {
            l2.longValue();
            k.k("order_id", l2);
        }
        return k.UB();
    }

    public final p<com.iqoption.core.microservices.tradingengine.response.order.c> a(InstrumentType instrumentType, String str, long j) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        j k = com.iqoption.core.d.EV().a("get-deferred-orders", com.iqoption.core.microservices.tradingengine.response.order.c.class).k("instrument_type", instrumentType);
        if (str != null) {
            k.k("instrument_id", str);
        }
        return k.k("user_balance_id", Long.valueOf(j)).UB();
    }

    public static final p<CustordialHistory.List> aV(long j) {
        return com.iqoption.core.d.EV().a("get-custodial-history", CustordialHistory.List.class).k(PendingOrderWrapper.POSITION_ID, Long.valueOf(j)).UB();
    }

    public final p<List<com.iqoption.core.microservices.tradingengine.response.instrument.e>> a(InstrumentType instrumentType, String str, long j, long j2, int i) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        String str2 = "underlying";
        kotlin.jvm.internal.i.f(str, str2);
        String str3 = "get-strike-list";
        String str4 = "expiration";
        str4 = "period";
        p a = com.iqoption.core.d.EV().a(str3, (kotlin.jvm.a.b) bzm).fq(f.bzr.Q(instrumentType).ahF()).fp("4.0").k("type", instrumentType).k(str2, str).k(str4, Long.valueOf(j)).k(str4, Long.valueOf(j2)).UB().a((io.reactivex.b.b) new com.iqoption.core.analytics.a.b.d(str3, i, instrumentType));
        kotlin.jvm.internal.i.e(a, "requestBuilderFactory\n  …ctiveId, instrumentType))");
        return a;
    }

    public final p<List<com.iqoption.core.microservices.tradingengine.response.instrument.e>> b(InstrumentType instrumentType, String str, long j, long j2, int i) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        String str2 = "underlying";
        kotlin.jvm.internal.i.f(str, str2);
        String str3 = "get-spot-list";
        String str4 = "expiration";
        str4 = "period";
        p a = com.iqoption.core.d.EV().a(str3, (kotlin.jvm.a.b) bzm).fq(f.bzr.Q(instrumentType).ahG()).k("type", instrumentType).k(str2, str).k(str4, Long.valueOf(j)).k(str4, Long.valueOf(j2)).UB().a((io.reactivex.b.b) new com.iqoption.core.analytics.a.b.d(str3, i, instrumentType));
        kotlin.jvm.internal.i.e(a, "requestBuilderFactory\n  …ctiveId, instrumentType))");
        return a;
    }
}
