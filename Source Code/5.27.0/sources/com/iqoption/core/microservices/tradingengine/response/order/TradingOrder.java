package com.iqoption.core.microservices.tradingengine.response.order;

import androidx.core.app.NotificationCompat;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.iqoption.core.Platform;
import com.iqoption.core.data.model.Direction;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.dto.entity.position.PendingOrderWrapper;
import com.iqoption.dto.entity.position.Position;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\bG\b\b\u0018\u00002\u00020\u0001:\n\u0001\u0001\u0001\u0001\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B÷\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020\u000e\u0012\b\b\u0002\u0010\"\u001a\u00020\u000e\u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\b\b\u0002\u0010$\u001a\u00020\u000e\u0012\b\b\u0002\u0010%\u001a\u00020\u000e\u0012\b\b\u0002\u0010&\u001a\u00020\u0004\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\b\b\u0002\u0010+\u001a\u00020\u000e\u0012\b\b\u0002\u0010,\u001a\u00020-\u0012\b\b\u0002\u0010.\u001a\u00020\u000e\u0012\b\b\u0002\u0010/\u001a\u000200\u0012\b\b\u0002\u00101\u001a\u00020\u000e\u0012\b\b\u0002\u00102\u001a\u00020\u000e\u0012\b\b\u0002\u00103\u001a\u00020\u000e¢\u0006\u0002\u00104J\t\u0010k\u001a\u00020\u0004HÆ\u0003J\t\u0010l\u001a\u00020\u000eHÆ\u0003J\t\u0010m\u001a\u00020\u0012HÆ\u0003J\t\u0010n\u001a\u00020\u0004HÆ\u0003J\t\u0010o\u001a\u00020\u0015HÆ\u0003J\t\u0010p\u001a\u00020\u0017HÆ\u0003J\t\u0010q\u001a\u00020\u0012HÆ\u0003J\t\u0010r\u001a\u00020\u0012HÆ\u0003J\t\u0010s\u001a\u00020\u0012HÆ\u0003J\t\u0010t\u001a\u00020\bHÆ\u0003J\t\u0010u\u001a\u00020\u0004HÆ\u0003J\t\u0010v\u001a\u00020\u0004HÆ\u0003J\t\u0010w\u001a\u00020\u000eHÆ\u0003J\t\u0010x\u001a\u00020\u0004HÆ\u0003J\t\u0010y\u001a\u00020 HÆ\u0003J\t\u0010z\u001a\u00020\u000eHÆ\u0003J\t\u0010{\u001a\u00020\u000eHÆ\u0003J\t\u0010|\u001a\u00020\bHÆ\u0003J\t\u0010}\u001a\u00020\u000eHÆ\u0003J\t\u0010~\u001a\u00020\u000eHÆ\u0003J\t\u0010\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0001\u001a\u00020(HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0001\u001a\u00020*HÆ\u0003J\n\u0010\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010\u0001\u001a\u00020-HÆ\u0003J\n\u0010\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010\u0001\u001a\u000200HÆ\u0003J\n\u0010\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010\u0001\u001a\u00020\u000eHÆ\u0003Jü\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020\u000e2\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020\u000e2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u000eHÆ\u0001J\u0015\u0010\u0001\u001a\u00020S2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0001\u001a\u00020\bHÖ\u0001J\n\u0010\u0001\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0016\u00101\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00106R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010!\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0016\u0010\"\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00106R\u0016\u0010\u0010\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00106R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010?R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010?R\u0016\u0010\u001b\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0016\u0010\u001f\u001a\u00020 8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0016\u0010\u001c\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010?R\u0016\u0010\u0018\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010AR\u0016\u0010\u0019\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010AR\u0016\u0010\u001d\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u00106R\u0016\u0010\u001e\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010?R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0016\u0010\u001a\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010AR\u0011\u0010R\u001a\u00020S8F¢\u0006\u0006\u001a\u0004\bR\u0010TR\u0011\u0010U\u001a\u00020S8F¢\u0006\u0006\u001a\u0004\bU\u0010TR\u0011\u0010V\u001a\u00020S8F¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0016\u0010#\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010GR\u0016\u0010$\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u00106R\u0016\u0010%\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u00106R\u0016\u0010&\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010?R\u0016\u0010/\u001a\u0002008\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0016\u0010'\u001a\u00020(8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0016\u0010)\u001a\u00020*8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0016\u00103\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u00106R\u0016\u0010+\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u00106R\u0016\u00102\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u00106R\u0016\u0010,\u001a\u00020-8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0016\u0010.\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u00106R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010?R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010?R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010GR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010?¨\u0006\u0001"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder;", "", "()V", "id", "", "userId", "userBalanceId", "userBalanceType", "", "clientPlatformId", "Lcom/iqoption/core/Platform;", "createAt", "updateAt", "avgPrice", "", "avgPriceEnrolled", "count", "currency", "", "executeAt", "executeStatus", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$ExecStatus;", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "instrumentId", "instrumentIdEscape", "instrumentUnderlying", "instrumentActiveId", "instrumentExpiration", "instrumentStrike", "instrumentStrikeValue", "instrumentDir", "Lcom/iqoption/core/data/model/Direction;", "commissionAmount", "commissionAmountEnrolled", "leverage", "limitPrice", "margin", "positionId", "side", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Side;", "status", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Status;", "stopPrice", "type", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Type;", "underlyingPrice", "rejectStatus", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$RejectStatus;", "basicStopLimitAmount", "takeProfitPrice", "stopLossPrice", "(JJJILcom/iqoption/core/Platform;JJDDDLjava/lang/String;JLcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$ExecStatus;Lcom/iqoption/core/data/model/InstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJDJLcom/iqoption/core/data/model/Direction;DDIDDJLcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Side;Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Status;DLcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Type;DLcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$RejectStatus;DDD)V", "getAvgPrice", "()D", "getAvgPriceEnrolled", "getBasicStopLimitAmount", "getClientPlatformId", "()Lcom/iqoption/core/Platform;", "getCommissionAmount", "getCommissionAmountEnrolled", "getCount", "getCreateAt", "()J", "getCurrency", "()Ljava/lang/String;", "getExecuteAt", "getExecuteStatus", "()Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$ExecStatus;", "getId", "getInstrumentActiveId", "()I", "getInstrumentDir", "()Lcom/iqoption/core/data/model/Direction;", "getInstrumentExpiration", "getInstrumentId", "getInstrumentIdEscape", "getInstrumentStrike", "getInstrumentStrikeValue", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "getInstrumentUnderlying", "isCall", "", "()Z", "isClosed", "isLong", "getLeverage", "getLimitPrice", "getMargin", "getPositionId", "getRejectStatus", "()Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$RejectStatus;", "getSide", "()Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Side;", "getStatus", "()Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Status;", "getStopLossPrice", "getStopPrice", "getTakeProfitPrice", "getType", "()Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Type;", "getUnderlyingPrice", "getUpdateAt", "getUserBalanceId", "getUserBalanceType", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "ExecStatus", "RejectStatus", "Side", "Status", "Type", "core_release"})
/* compiled from: TradingOrder.kt */
public final class TradingOrder {
    @SerializedName("margin")
    private final double aui;
    @SerializedName("instrument_underlying")
    private final String bBA;
    @SerializedName("instrument_active_id")
    private final int bBB;
    @SerializedName("instrument_expiration")
    private final long bBC;
    @SerializedName("instrument_strike")
    private final double bBD;
    @SerializedName("instrument_strike_value")
    private final long bBE;
    @SerializedName("instrument_dir")
    private final Direction bBF;
    @SerializedName("commission_amount")
    private final double bBG;
    @SerializedName("commission_amount_enrolled")
    private final double bBH;
    @SerializedName("limit_price")
    private final double bBI;
    @SerializedName("side")
    private final Side bBJ;
    @SerializedName("status")
    private final Status bBK;
    @SerializedName("stop_price")
    private final double bBL;
    @SerializedName("type")
    private final Type bBM;
    @SerializedName("underlying_price")
    private final double bBN;
    @SerializedName("reject_status")
    private final RejectStatus bBO;
    @SerializedName("basic_stoplimit_amount")
    private final double bBP;
    @SerializedName("user_balance_type")
    private final int bBr;
    @SerializedName("client_platform_id")
    private final Platform bBs;
    @SerializedName("create_at")
    private final long bBt;
    @SerializedName("update_at")
    private final long bBu;
    @SerializedName("avg_price")
    private final double bBv;
    @SerializedName("avg_price_enrolled")
    private final double bBw;
    @SerializedName("count")
    private final double bBx;
    @SerializedName("execute_at")
    private final long bBy;
    @SerializedName("execute_status")
    private final ExecStatus bBz;
    @SerializedName("user_balance_id")
    private final long bwR;
    @SerializedName("take_profit_price")
    private final double bwW;
    @SerializedName("stop_lose_price")
    private final double bwY;
    @SerializedName("instrument_id_escape")
    private final String bzA;
    @SerializedName("currency")
    private final String currency;
    @SerializedName("id")
    private final long id;
    @SerializedName("instrument_id")
    private final String instrumentId;
    @SerializedName("instrument_type")
    private final InstrumentType instrumentType;
    @SerializedName("leverage")
    private final int leverage;
    @SerializedName("position_id")
    private final long positionId;
    @SerializedName("user_id")
    private final long userId;

    @JsonAdapter(nullSafe = false, value = b.class)
    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000e\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$ExecStatus;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "PENDING_NEW", "NEW", "TRADE", "CANCELED", "PENDING_CANCEL", "REJECTED", "Companion", "JsonAdapter", "core_release"})
    /* compiled from: TradingOrder.kt */
    public enum ExecStatus {
        UNKNOWN("_unknown"),
        PENDING_NEW("pending_new"),
        NEW("new"),
        TRADE(Order.ORDER_EXECUTE_STATUS_PARTIALLY_FILLED),
        CANCELED("canceled"),
        PENDING_CANCEL("pending_cancel"),
        REJECTED("rejected");
        
        public static final a Companion = null;
        private final String serverValue;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$ExecStatus$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$ExecStatus;", "value", "", "core_release"})
        /* compiled from: TradingOrder.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            public final ExecStatus fromServerValue(String str) {
                if (str == null) {
                    return ExecStatus.UNKNOWN;
                }
                Enum enumR = ExecStatus.UNKNOWN;
                for (ExecStatus execStatus : ExecStatus.values()) {
                    if (kotlin.jvm.internal.i.y(execStatus.getServerValue(), str)) {
                        break;
                    }
                }
                ExecStatus execStatus2 = null;
                Enum enumR2 = execStatus2;
                if (enumR2 == null) {
                    enumR2 = enumR;
                }
                return (ExecStatus) enumR2;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$ExecStatus$JsonAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$ExecStatus;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "core_release"})
        /* compiled from: TradingOrder.kt */
        public static final class b extends TypeAdapter<ExecStatus> {
            /* renamed from: a */
            public void write(JsonWriter jsonWriter, ExecStatus execStatus) {
                kotlin.jvm.internal.i.f(jsonWriter, "out");
                if (execStatus == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(execStatus.getServerValue());
                }
            }

            /* renamed from: W */
            public ExecStatus read(JsonReader jsonReader) {
                kotlin.jvm.internal.i.f(jsonReader, "reader");
                if (jsonReader.peek() != JsonToken.NULL) {
                    return ExecStatus.Companion.fromServerValue(jsonReader.nextString());
                }
                jsonReader.skipValue();
                return ExecStatus.UNKNOWN;
            }
        }

        public static final ExecStatus fromServerValue(String str) {
            return Companion.fromServerValue(str);
        }

        private ExecStatus(String str) {
            this.serverValue = str;
        }

        public final String getServerValue() {
            return this.serverValue;
        }

        static {
            Companion = new a();
        }
    }

    @JsonAdapter(nullSafe = false, value = b.class)
    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0016\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0018"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$RejectStatus;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "UNKNOWN_SYMBOL", "EXCEEDS_LIMIT", "DUPLICATE", "BAD_POSITION_LEVERAGE_NOT_EXISTS", "BAD_POSITION_LEVERAGE_DUPLICATE", "SHORT_POSITION_FORBIDDEN", "INTERNAL_BILLING_EXCEPTION", "INTERNAL_BILLING_NOT_ENOUGH_BALANCE", "TYPE_FORBIDDEN", "EXPOSURE_NOT_FOUND", "SYMBOL_FORBIDDEN", "INSTRUMENT_PRICE_NOT_FOUND", "TOO_MUCH_TIME_PASSED", "ACTIVE_SUSPENDED", "Companion", "JsonAdapter", "core_release"})
    /* compiled from: TradingOrder.kt */
    public enum RejectStatus {
        UNKNOWN("_unknown"),
        UNKNOWN_SYMBOL("unknown_symbol"),
        EXCEEDS_LIMIT(Order.ORDER_REJECT_STATUS_EXCEEDS_LIMIT),
        DUPLICATE("duplicate"),
        BAD_POSITION_LEVERAGE_NOT_EXISTS("bad_position_leverage_not_exists"),
        BAD_POSITION_LEVERAGE_DUPLICATE("bad_position_leverage_duplicate"),
        SHORT_POSITION_FORBIDDEN("short_position_forbidden"),
        INTERNAL_BILLING_EXCEPTION(Order.ORDER_REJECT_STATUS_INTERNAL_BILLING_EXCEPTION),
        INTERNAL_BILLING_NOT_ENOUGH_BALANCE(Order.ORDER_REJECT_STATUS_INTERNAL_BILLING_NOT_ENOUGH_BALANCE),
        TYPE_FORBIDDEN("type_forbidden"),
        EXPOSURE_NOT_FOUND("exposure_not_found"),
        SYMBOL_FORBIDDEN(Order.ORDER_REJECT_STATUS_SYMBOL_FORBIDDEN),
        INSTRUMENT_PRICE_NOT_FOUND(Order.ORDER_REJECT_STATUS_INSTRUMENT_PRICE_NOT_FOUND),
        TOO_MUCH_TIME_PASSED(Order.ORDER_REJECT_STATUS_TOO_MUCH_TIME_PASSED),
        ACTIVE_SUSPENDED("active_suspended");
        
        public static final a Companion = null;
        private final String serverValue;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$RejectStatus$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$RejectStatus;", "value", "", "core_release"})
        /* compiled from: TradingOrder.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            public final RejectStatus fromServerValue(String str) {
                if (str == null) {
                    return RejectStatus.UNKNOWN;
                }
                Enum enumR = RejectStatus.UNKNOWN;
                for (RejectStatus rejectStatus : RejectStatus.values()) {
                    if (kotlin.jvm.internal.i.y(rejectStatus.getServerValue(), str)) {
                        break;
                    }
                }
                RejectStatus rejectStatus2 = null;
                Enum enumR2 = rejectStatus2;
                if (enumR2 == null) {
                    enumR2 = enumR;
                }
                return (RejectStatus) enumR2;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$RejectStatus$JsonAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$RejectStatus;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "core_release"})
        /* compiled from: TradingOrder.kt */
        public static final class b extends TypeAdapter<RejectStatus> {
            /* renamed from: a */
            public void write(JsonWriter jsonWriter, RejectStatus rejectStatus) {
                kotlin.jvm.internal.i.f(jsonWriter, "out");
                if (rejectStatus == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(rejectStatus.getServerValue());
                }
            }

            /* renamed from: X */
            public RejectStatus read(JsonReader jsonReader) {
                kotlin.jvm.internal.i.f(jsonReader, "reader");
                if (jsonReader.peek() != JsonToken.NULL) {
                    return RejectStatus.Companion.fromServerValue(jsonReader.nextString());
                }
                jsonReader.skipValue();
                return RejectStatus.UNKNOWN;
            }
        }

        public static final RejectStatus fromServerValue(String str) {
            return Companion.fromServerValue(str);
        }

        private RejectStatus(String str) {
            this.serverValue = str;
        }

        public final String getServerValue() {
            return this.serverValue;
        }

        static {
            Companion = new a();
        }
    }

    @JsonAdapter(nullSafe = false, value = b.class)
    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Side;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "BUY", "SELL", "Companion", "JsonAdapter", "core_release"})
    /* compiled from: TradingOrder.kt */
    public enum Side {
        UNKNOWN("_unknown"),
        BUY(Order.BUY),
        SELL(Order.SELL);
        
        public static final a Companion = null;
        private final String serverValue;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Side$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Side;", "value", "", "core_release"})
        /* compiled from: TradingOrder.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            public final Side fromServerValue(String str) {
                if (str == null) {
                    return Side.UNKNOWN;
                }
                Enum enumR = Side.UNKNOWN;
                for (Side side : Side.values()) {
                    if (kotlin.jvm.internal.i.y(side.getServerValue(), str)) {
                        break;
                    }
                }
                Side side2 = null;
                Enum enumR2 = side2;
                if (enumR2 == null) {
                    enumR2 = enumR;
                }
                return (Side) enumR2;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Side$JsonAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Side;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "core_release"})
        /* compiled from: TradingOrder.kt */
        public static final class b extends TypeAdapter<Side> {
            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Side side) {
                kotlin.jvm.internal.i.f(jsonWriter, "out");
                if (side == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(side.getServerValue());
                }
            }

            /* renamed from: Y */
            public Side read(JsonReader jsonReader) {
                kotlin.jvm.internal.i.f(jsonReader, "reader");
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Side.Companion.fromServerValue(jsonReader.nextString());
                }
                jsonReader.skipValue();
                return Side.UNKNOWN;
            }
        }

        public static final Side fromServerValue(String str) {
            return Companion.fromServerValue(str);
        }

        private Side(String str) {
            this.serverValue = str;
        }

        public final String getServerValue() {
            return this.serverValue;
        }

        static {
            Companion = new a();
        }
    }

    @JsonAdapter(nullSafe = false, value = b.class)
    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000f\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0011"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Status;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "PENDING_NEW", "NEW", "PARTIALLY_FILLED", "FILLED", "CANCELED", "PENDING_CANCEL", "REJECTED", "Companion", "JsonAdapter", "core_release"})
    /* compiled from: TradingOrder.kt */
    public enum Status {
        UNKNOWN("_unknown"),
        PENDING_NEW("pending_new"),
        NEW("new"),
        PARTIALLY_FILLED(Order.ORDER_STATUS_PARTIALLY_FILLED),
        FILLED(Order.ORDER_STATUS_FILLED),
        CANCELED("canceled"),
        PENDING_CANCEL("pending_cancel"),
        REJECTED("rejected");
        
        public static final a Companion = null;
        private final String serverValue;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Status$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Status;", "value", "", "core_release"})
        /* compiled from: TradingOrder.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            public final Status fromServerValue(String str) {
                if (str == null) {
                    return Status.UNKNOWN;
                }
                Enum enumR = Status.UNKNOWN;
                for (Status status : Status.values()) {
                    if (kotlin.jvm.internal.i.y(status.getServerValue(), str)) {
                        break;
                    }
                }
                Status status2 = null;
                Enum enumR2 = status2;
                if (enumR2 == null) {
                    enumR2 = enumR;
                }
                return (Status) enumR2;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Status$JsonAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Status;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "core_release"})
        /* compiled from: TradingOrder.kt */
        public static final class b extends TypeAdapter<Status> {
            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Status status) {
                kotlin.jvm.internal.i.f(jsonWriter, "out");
                if (status == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(status.getServerValue());
                }
            }

            /* renamed from: Z */
            public Status read(JsonReader jsonReader) {
                kotlin.jvm.internal.i.f(jsonReader, "reader");
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Status.Companion.fromServerValue(jsonReader.nextString());
                }
                jsonReader.skipValue();
                return Status.UNKNOWN;
            }
        }

        public static final Status fromServerValue(String str) {
            return Companion.fromServerValue(str);
        }

        private Status(String str) {
            this.serverValue = str;
        }

        public final String getServerValue() {
            return this.serverValue;
        }

        static {
            Companion = new a();
        }
    }

    @JsonAdapter(nullSafe = false, value = b.class)
    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000e\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Type;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "MARKET", "STOP", "LIMIT", "WITHDRAW", "TRAIL_STOP", "MARKET_ON_OPEN", "Companion", "JsonAdapter", "core_release"})
    /* compiled from: TradingOrder.kt */
    public enum Type {
        UNKNOWN("_unknown"),
        MARKET(Order.MARKET),
        STOP(Order.STOP),
        LIMIT(Order.LIMIT),
        WITHDRAW(Position.CLOSE_REASON_WITHDRAW),
        TRAIL_STOP("trail_stop"),
        MARKET_ON_OPEN(Order.ON_MKT_OPEN);
        
        public static final a Companion = null;
        private final String serverValue;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Type$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Type;", "value", "", "core_release"})
        /* compiled from: TradingOrder.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            public final Type fromServerValue(String str) {
                if (str == null) {
                    return Type.UNKNOWN;
                }
                Enum enumR = Type.UNKNOWN;
                for (Type type : Type.values()) {
                    if (kotlin.jvm.internal.i.y(type.getServerValue(), str)) {
                        break;
                    }
                }
                Type type2 = null;
                Enum enumR2 = type2;
                if (enumR2 == null) {
                    enumR2 = enumR;
                }
                return (Type) enumR2;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Type$JsonAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder$Type;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "core_release"})
        /* compiled from: TradingOrder.kt */
        public static final class b extends TypeAdapter<Type> {
            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Type type) {
                kotlin.jvm.internal.i.f(jsonWriter, "out");
                if (type == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(type.getServerValue());
                }
            }

            /* renamed from: aa */
            public Type read(JsonReader jsonReader) {
                kotlin.jvm.internal.i.f(jsonReader, "reader");
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Type.Companion.fromServerValue(jsonReader.nextString());
                }
                jsonReader.skipValue();
                return Type.UNKNOWN;
            }
        }

        public static final Type fromServerValue(String str) {
            return Companion.fromServerValue(str);
        }

        private Type(String str) {
            this.serverValue = str;
        }

        public final String getServerValue() {
            return this.serverValue;
        }

        static {
            Companion = new a();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TradingOrder) {
                TradingOrder tradingOrder = (TradingOrder) obj;
                if ((this.id == tradingOrder.id ? 1 : null) != null) {
                    if ((this.userId == tradingOrder.userId ? 1 : null) != null) {
                        if ((this.bwR == tradingOrder.bwR ? 1 : null) != null) {
                            if ((this.bBr == tradingOrder.bBr ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bBs, tradingOrder.bBs)) {
                                if ((this.bBt == tradingOrder.bBt ? 1 : null) != null) {
                                    if ((this.bBu == tradingOrder.bBu ? 1 : null) != null && Double.compare(this.bBv, tradingOrder.bBv) == 0 && Double.compare(this.bBw, tradingOrder.bBw) == 0 && Double.compare(this.bBx, tradingOrder.bBx) == 0 && kotlin.jvm.internal.i.y(this.currency, tradingOrder.currency)) {
                                        if ((this.bBy == tradingOrder.bBy ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bBz, tradingOrder.bBz) && kotlin.jvm.internal.i.y(this.instrumentType, tradingOrder.instrumentType) && kotlin.jvm.internal.i.y(this.instrumentId, tradingOrder.instrumentId) && kotlin.jvm.internal.i.y(this.bzA, tradingOrder.bzA) && kotlin.jvm.internal.i.y(this.bBA, tradingOrder.bBA)) {
                                            if ((this.bBB == tradingOrder.bBB ? 1 : null) != null) {
                                                if ((this.bBC == tradingOrder.bBC ? 1 : null) != null && Double.compare(this.bBD, tradingOrder.bBD) == 0) {
                                                    if ((this.bBE == tradingOrder.bBE ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bBF, tradingOrder.bBF) && Double.compare(this.bBG, tradingOrder.bBG) == 0 && Double.compare(this.bBH, tradingOrder.bBH) == 0) {
                                                        if ((this.leverage == tradingOrder.leverage ? 1 : null) != null && Double.compare(this.bBI, tradingOrder.bBI) == 0 && Double.compare(this.aui, tradingOrder.aui) == 0) {
                                                            if (!((this.positionId == tradingOrder.positionId ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bBJ, tradingOrder.bBJ) && kotlin.jvm.internal.i.y(this.bBK, tradingOrder.bBK) && Double.compare(this.bBL, tradingOrder.bBL) == 0 && kotlin.jvm.internal.i.y(this.bBM, tradingOrder.bBM) && Double.compare(this.bBN, tradingOrder.bBN) == 0 && kotlin.jvm.internal.i.y(this.bBO, tradingOrder.bBO) && Double.compare(this.bBP, tradingOrder.bBP) == 0 && Double.compare(this.bwW, tradingOrder.bwW) == 0 && Double.compare(this.bwY, tradingOrder.bwY) == 0)) {
                                                                return false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.userId;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.bwR;
        i = (((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.bBr) * 31;
        Platform platform = this.bBs;
        int i2 = 0;
        i = (i + (platform != null ? platform.hashCode() : 0)) * 31;
        long j3 = this.bBt;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        j3 = this.bBu;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        j3 = Double.doubleToLongBits(this.bBv);
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        j3 = Double.doubleToLongBits(this.bBw);
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        j3 = Double.doubleToLongBits(this.bBx);
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str = this.currency;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        j3 = this.bBy;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        ExecStatus execStatus = this.bBz;
        i = (i + (execStatus != null ? execStatus.hashCode() : 0)) * 31;
        InstrumentType instrumentType = this.instrumentType;
        i = (i + (instrumentType != null ? instrumentType.hashCode() : 0)) * 31;
        str = this.instrumentId;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bzA;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bBA;
        i = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.bBB) * 31;
        j3 = this.bBC;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        j3 = Double.doubleToLongBits(this.bBD);
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        j3 = this.bBE;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        Direction direction = this.bBF;
        i = (i + (direction != null ? direction.hashCode() : 0)) * 31;
        j3 = Double.doubleToLongBits(this.bBG);
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        j3 = Double.doubleToLongBits(this.bBH);
        i = (((i + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.leverage) * 31;
        j3 = Double.doubleToLongBits(this.bBI);
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        j3 = Double.doubleToLongBits(this.aui);
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        j3 = this.positionId;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        Side side = this.bBJ;
        i = (i + (side != null ? side.hashCode() : 0)) * 31;
        Status status = this.bBK;
        i = (i + (status != null ? status.hashCode() : 0)) * 31;
        j3 = Double.doubleToLongBits(this.bBL);
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        Type type = this.bBM;
        i = (i + (type != null ? type.hashCode() : 0)) * 31;
        j3 = Double.doubleToLongBits(this.bBN);
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        RejectStatus rejectStatus = this.bBO;
        if (rejectStatus != null) {
            i2 = rejectStatus.hashCode();
        }
        i = (i + i2) * 31;
        j2 = Double.doubleToLongBits(this.bBP);
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = Double.doubleToLongBits(this.bwW);
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = Double.doubleToLongBits(this.bwY);
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TradingOrder(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", userBalanceId=");
        stringBuilder.append(this.bwR);
        stringBuilder.append(", userBalanceType=");
        stringBuilder.append(this.bBr);
        stringBuilder.append(", clientPlatformId=");
        stringBuilder.append(this.bBs);
        stringBuilder.append(", createAt=");
        stringBuilder.append(this.bBt);
        stringBuilder.append(", updateAt=");
        stringBuilder.append(this.bBu);
        stringBuilder.append(", avgPrice=");
        stringBuilder.append(this.bBv);
        stringBuilder.append(", avgPriceEnrolled=");
        stringBuilder.append(this.bBw);
        stringBuilder.append(", count=");
        stringBuilder.append(this.bBx);
        stringBuilder.append(", currency=");
        stringBuilder.append(this.currency);
        stringBuilder.append(", executeAt=");
        stringBuilder.append(this.bBy);
        stringBuilder.append(", executeStatus=");
        stringBuilder.append(this.bBz);
        stringBuilder.append(", instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", instrumentId=");
        stringBuilder.append(this.instrumentId);
        stringBuilder.append(", instrumentIdEscape=");
        stringBuilder.append(this.bzA);
        stringBuilder.append(", instrumentUnderlying=");
        stringBuilder.append(this.bBA);
        stringBuilder.append(", instrumentActiveId=");
        stringBuilder.append(this.bBB);
        stringBuilder.append(", instrumentExpiration=");
        stringBuilder.append(this.bBC);
        stringBuilder.append(", instrumentStrike=");
        stringBuilder.append(this.bBD);
        stringBuilder.append(", instrumentStrikeValue=");
        stringBuilder.append(this.bBE);
        stringBuilder.append(", instrumentDir=");
        stringBuilder.append(this.bBF);
        stringBuilder.append(", commissionAmount=");
        stringBuilder.append(this.bBG);
        stringBuilder.append(", commissionAmountEnrolled=");
        stringBuilder.append(this.bBH);
        stringBuilder.append(", leverage=");
        stringBuilder.append(this.leverage);
        stringBuilder.append(", limitPrice=");
        stringBuilder.append(this.bBI);
        stringBuilder.append(", margin=");
        stringBuilder.append(this.aui);
        stringBuilder.append(", positionId=");
        stringBuilder.append(this.positionId);
        stringBuilder.append(", side=");
        stringBuilder.append(this.bBJ);
        stringBuilder.append(", status=");
        stringBuilder.append(this.bBK);
        stringBuilder.append(", stopPrice=");
        stringBuilder.append(this.bBL);
        stringBuilder.append(", type=");
        stringBuilder.append(this.bBM);
        stringBuilder.append(", underlyingPrice=");
        stringBuilder.append(this.bBN);
        stringBuilder.append(", rejectStatus=");
        stringBuilder.append(this.bBO);
        stringBuilder.append(", basicStopLimitAmount=");
        stringBuilder.append(this.bBP);
        stringBuilder.append(", takeProfitPrice=");
        stringBuilder.append(this.bwW);
        stringBuilder.append(", stopLossPrice=");
        stringBuilder.append(this.bwY);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public TradingOrder(long j, long j2, long j3, int i, Platform platform, long j4, long j5, double d, double d2, double d3, String str, long j6, ExecStatus execStatus, InstrumentType instrumentType, String str2, String str3, String str4, int i2, long j7, double d4, long j8, Direction direction, double d5, double d6, int i3, double d7, double d8, long j9, Side side, Status status, double d9, Type type, double d10, RejectStatus rejectStatus, double d11, double d12, double d13) {
        Platform platform2 = platform;
        String str5 = str;
        ExecStatus execStatus2 = execStatus;
        InstrumentType instrumentType2 = instrumentType;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        Direction direction2 = direction;
        Side side2 = side;
        Status status2 = status;
        Type type2 = type;
        RejectStatus rejectStatus2 = rejectStatus;
        kotlin.jvm.internal.i.f(platform2, "clientPlatformId");
        kotlin.jvm.internal.i.f(str5, "currency");
        kotlin.jvm.internal.i.f(execStatus2, "executeStatus");
        kotlin.jvm.internal.i.f(instrumentType2, "instrumentType");
        kotlin.jvm.internal.i.f(str6, "instrumentId");
        kotlin.jvm.internal.i.f(str7, "instrumentIdEscape");
        kotlin.jvm.internal.i.f(str8, "instrumentUnderlying");
        kotlin.jvm.internal.i.f(direction2, "instrumentDir");
        kotlin.jvm.internal.i.f(side2, PendingOrderWrapper.SIDE);
        kotlin.jvm.internal.i.f(status2, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.i.f(type2, "type");
        kotlin.jvm.internal.i.f(rejectStatus2, "rejectStatus");
        this.id = j;
        this.userId = j2;
        this.bwR = j3;
        this.bBr = i;
        this.bBs = platform2;
        this.bBt = j4;
        this.bBu = j5;
        this.bBv = d;
        this.bBw = d2;
        this.bBx = d3;
        this.currency = str5;
        this.bBy = j6;
        this.bBz = execStatus2;
        this.instrumentType = instrumentType2;
        this.instrumentId = str6;
        this.bzA = str7;
        this.bBA = str8;
        this.bBB = i2;
        this.bBC = j7;
        this.bBD = d4;
        this.bBE = j8;
        this.bBF = direction2;
        this.bBG = d5;
        this.bBH = d6;
        this.leverage = i3;
        this.bBI = d7;
        this.aui = d8;
        this.positionId = j9;
        this.bBJ = side2;
        this.bBK = status2;
        this.bBL = d9;
        this.bBM = type2;
        this.bBN = d10;
        this.bBO = rejectStatus2;
        this.bBP = d11;
        this.bwW = d12;
        this.bwY = d13;
    }

    public final long getId() {
        return this.id;
    }

    public /* synthetic */ TradingOrder(long j, long j2, long j3, int i, Platform platform, long j4, long j5, double d, double d2, double d3, String str, long j6, ExecStatus execStatus, InstrumentType instrumentType, String str2, String str3, String str4, int i2, long j7, double d4, long j8, Direction direction, double d5, double d6, int i3, double d7, double d8, long j9, Side side, Status status, double d9, Type type, double d10, RejectStatus rejectStatus, double d11, double d12, double d13, int i4, int i5, f fVar) {
        int i6 = i4;
        long j10 = (i6 & 1) != 0 ? -1 : j;
        long j11 = (i6 & 2) != 0 ? -1 : j2;
        long j12 = (i6 & 4) != 0 ? -1 : j3;
        int i7 = (i6 & 8) != 0 ? 0 : i;
        Platform platform2 = (i6 & 16) != 0 ? Platform.UNKNOWN : platform;
        long j13 = (i6 & 32) != 0 ? 0 : j4;
        long j14 = (i6 & 64) != 0 ? 0 : j5;
        double d14 = -1.0d;
        double d15 = (i6 & 128) != 0 ? -1.0d : d;
        double d16 = 0.0d;
        double d17 = (i6 & 256) != 0 ? 0.0d : d2;
        double d18 = (i6 & 512) != 0 ? 0.0d : d3;
        String str5 = "";
        String str6 = (i6 & 1024) != 0 ? str5 : str;
        long j15 = (i6 & 2048) != 0 ? 0 : j6;
        ExecStatus execStatus2 = (i6 & 4096) != 0 ? ExecStatus.UNKNOWN : execStatus;
        InstrumentType instrumentType2 = (i6 & 8192) != 0 ? InstrumentType.UNKNOWN : instrumentType;
        String str7 = (i6 & 16384) != 0 ? str5 : str2;
        String str8 = (i6 & 32768) != 0 ? str5 : str3;
        if ((i6 & 65536) == 0) {
            str5 = str4;
        }
        int i8 = (i6 & 131072) != 0 ? -1 : i2;
        long j16 = (i6 & 262144) != 0 ? 0 : j7;
        double d19 = (i6 & 524288) != 0 ? 0.0d : d4;
        long j17 = (i6 & 1048576) != 0 ? 0 : j8;
        Direction direction2 = (i6 & 2097152) != 0 ? Direction.UNKNOWN : direction;
        double d20 = (i6 & 4194304) != 0 ? 0.0d : d5;
        double d21 = (i6 & 8388608) != 0 ? 0.0d : d6;
        int i9 = (i6 & 16777216) != 0 ? 1 : i3;
        double d22 = (i6 & 33554432) != 0 ? -1.0d : d7;
        double d23 = (i6 & 67108864) != 0 ? 0.0d : d8;
        long j18 = (i6 & 134217728) != 0 ? -1 : j9;
        Side side2 = (i6 & 268435456) != 0 ? Side.UNKNOWN : side;
        Status status2 = (i6 & 536870912) != 0 ? Status.UNKNOWN : status;
        if ((i6 & 1073741824) == 0) {
            d14 = d9;
        }
        Type type2 = (i6 & Integer.MIN_VALUE) != 0 ? Type.UNKNOWN : type;
        double d24 = (i5 & 1) != 0 ? 0.0d : d10;
        RejectStatus rejectStatus2 = (i5 & 2) != 0 ? RejectStatus.UNKNOWN : rejectStatus;
        double d25 = (i5 & 4) != 0 ? 0.0d : d11;
        double d26 = (i5 & 8) != 0 ? 0.0d : d12;
        if ((i5 & 16) == 0) {
            d16 = d13;
        }
        this(j10, j11, j12, i7, platform2, j13, j14, d15, d17, d18, str6, j15, execStatus2, instrumentType2, str7, str8, str5, i8, j16, d19, j17, direction2, d20, d21, i9, d22, d23, j18, side2, status2, d14, type2, d24, rejectStatus2, d25, d26, d16);
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final long aiK() {
        return this.positionId;
    }

    public final Status aiL() {
        return this.bBK;
    }

    public final Type aiM() {
        return this.bBM;
    }

    public TradingOrder() {
        this(-1, 0, 0, 0, null, 0, 0, 0.0d, 0.0d, 0.0d, null, 0, null, null, null, null, null, 0, 0, 0.0d, 0, null, 0.0d, 0.0d, 0, 0.0d, 0.0d, 0, null, null, 0.0d, null, 0.0d, null, 0.0d, 0.0d, 0.0d, -2, 31, null);
    }
}
