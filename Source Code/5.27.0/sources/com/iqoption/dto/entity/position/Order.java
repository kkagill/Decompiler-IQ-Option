package com.iqoption.dto.entity.position;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.base.d;
import com.google.common.base.f;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Longs;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.util.ab;

public class Order implements Parcelable {
    public static final String BUY = "buy";
    public static final Creator<Order> CREATOR = new Creator<Order>() {
        public Order createFromParcel(Parcel parcel) {
            return new Order(parcel);
        }

        public Order[] newArray(int i) {
            return new Order[i];
        }
    };
    public static final String LIMIT = "limit";
    public static final String MARKET = "market";
    public static final String ON_MKT_OPEN = "market-on-open";
    public static Ordering<Order> ORDERING_ORDER = new Ordering<Order>() {
        public int compare(Order order, Order order2) {
            return Longs.compare(order.id.longValue(), order2.id.longValue());
        }
    };
    public static final String ORDER_EXECUTE_STATUS_CANCELED = "canceled";
    public static final String ORDER_EXECUTE_STATUS_NEW = "new";
    public static final String ORDER_EXECUTE_STATUS_PARTIALLY_FILLED = "trade";
    public static final String ORDER_EXECUTE_STATUS_PENDING_CANCEL = "pending_cancel";
    public static final String ORDER_EXECUTE_STATUS_PENDING_NEW = "pending_new";
    public static final String ORDER_EXECUTE_STATUS_REJECTED = "rejected";
    public static final String ORDER_REJECT_STATUS_EXCEEDS_LIMIT = "exceeds_limit";
    public static final String ORDER_REJECT_STATUS_INSTRUMENT_PRICE_NOT_FOUND = "instrument_price_not_found";
    public static final String ORDER_REJECT_STATUS_INTERNAL_BILLING_EXCEPTION = "internal_billing_exception";
    public static final String ORDER_REJECT_STATUS_INTERNAL_BILLING_NOT_ENOUGH_BALANCE = "internal_billing_not_enough_balance";
    public static final String ORDER_REJECT_STATUS_RISK_EXCEPTION = "risk_exception";
    public static final String ORDER_REJECT_STATUS_SYMBOL_FORBIDDEN = "symbol_forbidden";
    public static final String ORDER_REJECT_STATUS_TOO_MUCH_TIME_PASSED = "too_much_time_passed";
    public static final String ORDER_REJECT_STATUS_UNKNOWN = "unknown";
    public static final String ORDER_REJECT_STATUS_USER_BALANCE_NOT_FOUND_OR_WRONG = "user_balance_not_found_or_wrong";
    public static final String ORDER_STATUS_CANCELED = "canceled";
    public static final String ORDER_STATUS_FILLED = "filled";
    public static final String ORDER_STATUS_NEW = "new";
    public static final String ORDER_STATUS_PARTIALLY_FILLED = "partially_filled";
    public static final String ORDER_STATUS_PENDING_CANCEL = "pending_cancel";
    public static final String ORDER_STATUS_PENDING_NEW = "pending_new";
    public static final String ORDER_STATUS_REJECTED = "rejected";
    public static final String SELL = "sell";
    public static final String STOP = "stop";
    public static final String TRAIL_STOP = "trail-stop";
    public static final d<Order, Long> getOrderId = -$$Lambda$Order$extX1pRFXZUJlMrxM32TnlQ0H1U.INSTANCE;
    @SerializedName("avg_price")
    private Double avgPrice;
    @SerializedName("avg_price_enrolled")
    private Double avgPriceEnrolled;
    @SerializedName("basic_stoplimit_amount")
    private Double basicStopLimitAmount;
    @SerializedName("count")
    private Double count;
    @SerializedName("create_at")
    private Long createAt;
    @SerializedName("execute_at")
    private Long executeAt;
    @SerializedName("execute_status")
    private String executeStatus;
    @SerializedName("id")
    private Long id;
    @SerializedName("index")
    private long index;
    @SerializedName("instrument_active_id")
    private Integer instrumentActiveId;
    @SerializedName("instrument_dir")
    private String instrumentDir;
    @SerializedName("instrument_expiration")
    private Long instrumentExpiration;
    @SerializedName("instrument_id")
    private String instrumentId;
    @SerializedName("instrument_strike")
    private Double instrumentStrike;
    @SerializedName("instrument_strike_value")
    private Long instrumentStrikeValue;
    @SerializedName("instrument_type")
    private InstrumentType instrumentType;
    @SerializedName("instrument_underlying")
    private String instrumentUderlying;
    @SerializedName("leverage")
    private Integer leverage;
    @SerializedName("limit_price")
    private Double limitPrice;
    @SerializedName("margin")
    private Double margin;
    @SerializedName("position_id")
    private Long positionId;
    @SerializedName("reject_status")
    private String rejectStatus;
    @SerializedName("side")
    private String side;
    @SerializedName("status")
    private String status;
    @SerializedName("stop_lose_price")
    private Double stopLosePrice;
    @SerializedName("stop_price")
    private Double stopPrice;
    @SerializedName("take_profit_price")
    private Double takeProfitPrice;
    @SerializedName("type")
    private String type;
    @SerializedName("underlying_price")
    private Double underlyingPrice;
    @SerializedName("update_at")
    private Long updateAt;
    @SerializedName("user_balance_id")
    private Long userBalanceId;
    @SerializedName("user_id")
    private Long userId;

    public String createStrikeKey() {
        return "";
    }

    public int describeContents() {
        return 0;
    }

    static /* synthetic */ Long lambda$static$0(Order order) {
        return order != null ? order.getId() : null;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Order) && f.equal(this.id, ((Order) obj).id));
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public Long getCreateAt() {
        return Long.valueOf(this.createAt.longValue() / 1000);
    }

    public Long getInstrumentExpiration() {
        Long l = this.instrumentExpiration;
        if (l == null) {
            return Long.valueOf(-1);
        }
        return Long.valueOf(l.longValue() / 1000);
    }

    public static boolean isMarketOrderFilled(Order order) {
        if (order != null) {
            if (ORDER_STATUS_FILLED.equalsIgnoreCase(order.status)) {
                if (MARKET.equalsIgnoreCase(order.type)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isTrailStoPOrder(Order order) {
        if (!(order == null || order.getPositionId() == null)) {
            if (TRAIL_STOP.equals(order.type)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Missing block: B:8:0x0026, code skipped:
            if (TRAIL_STOP.equals(r2.type) != false) goto L_0x0028;
     */
    public static boolean isTpslOrder(com.iqoption.dto.entity.position.Order r2) {
        /*
        if (r2 == 0) goto L_0x002a;
    L_0x0002:
        r0 = r2.getPositionId();
        if (r0 == 0) goto L_0x002a;
    L_0x0008:
        r0 = r2.type;
        r1 = "limit";
        r0 = r1.equalsIgnoreCase(r0);
        if (r0 != 0) goto L_0x0028;
    L_0x0012:
        r0 = r2.type;
        r1 = "stop";
        r0 = r1.equalsIgnoreCase(r0);
        if (r0 != 0) goto L_0x0028;
    L_0x001d:
        r2 = r2.type;
        r0 = "trail-stop";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x002a;
    L_0x0028:
        r2 = 1;
        goto L_0x002b;
    L_0x002a:
        r2 = 0;
    L_0x002b:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.dto.entity.position.Order.isTpslOrder(com.iqoption.dto.entity.position.Order):boolean");
    }

    /* JADX WARNING: Missing block: B:8:0x0025, code skipped:
            if (ON_MKT_OPEN.equalsIgnoreCase(r2.type) != false) goto L_0x0027;
     */
    public static boolean isDeferredOrder(com.iqoption.dto.entity.position.Order r2) {
        /*
        if (r2 == 0) goto L_0x0029;
    L_0x0002:
        r0 = r2.getPositionId();
        if (r0 != 0) goto L_0x0029;
    L_0x0008:
        r0 = r2.type;
        r1 = "limit";
        r0 = r1.equalsIgnoreCase(r0);
        if (r0 != 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.type;
        r1 = "stop";
        r0 = r1.equalsIgnoreCase(r0);
        if (r0 != 0) goto L_0x0027;
    L_0x001d:
        r2 = r2.type;
        r0 = "market-on-open";
        r2 = r0.equalsIgnoreCase(r2);
        if (r2 == 0) goto L_0x0029;
    L_0x0027:
        r2 = 1;
        goto L_0x002a;
    L_0x0029:
        r2 = 0;
    L_0x002a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.dto.entity.position.Order.isDeferredOrder(com.iqoption.dto.entity.position.Order):boolean");
    }

    public static boolean mktOnOpenExecuting(Order order) {
        if (!(order == null || order.getPositionId() == null)) {
            if (ON_MKT_OPEN.equalsIgnoreCase(order.type)) {
                return true;
            }
        }
        return false;
    }

    public long getIndex() {
        return this.index;
    }

    public Long getId() {
        return this.id;
    }

    public Long getUserId() {
        return this.userId;
    }

    public Long getUserBalanceId() {
        return this.userBalanceId;
    }

    public InstrumentType getInstrumentType() {
        InstrumentType instrumentType = this.instrumentType;
        return instrumentType == null ? InstrumentType.UNKNOWN : instrumentType;
    }

    public String getInstrumentId() {
        return this.instrumentId;
    }

    public Long getPositionId() {
        return this.positionId;
    }

    public String getInstrumentUderlying() {
        String str = this.instrumentUderlying;
        return str == null ? "" : str;
    }

    public Integer getInstrumentActiveId() {
        Integer num = this.instrumentActiveId;
        return Integer.valueOf(num == null ? -1 : num.intValue());
    }

    public String getInstrumentDir() {
        String str = this.instrumentDir;
        return str == null ? "" : str;
    }

    public Double getInstrumentStrike() {
        return this.instrumentStrike;
    }

    public Long getInstrumentStrikeValue() {
        Long l = this.instrumentStrikeValue;
        return Long.valueOf(l == null ? 0 : l.longValue());
    }

    public String getStatus() {
        String str = this.status;
        return str == null ? "" : str;
    }

    public String getExecuteStatus() {
        String str = this.executeStatus;
        return str == null ? "" : str;
    }

    public String getRejectStatus() {
        return this.rejectStatus;
    }

    public String getSide() {
        String str = this.side;
        return str == null ? "" : str;
    }

    public String getType() {
        String str = this.type;
        return str == null ? "" : str;
    }

    public Long getUpdateAt() {
        return this.updateAt;
    }

    public Long getExecuteAt() {
        return this.executeAt;
    }

    public Double getUnderlyingPrice() {
        return this.underlyingPrice;
    }

    public Double getAvgPriceGL() {
        Double d = this.avgPrice;
        return Double.valueOf(d == null ? -1.0d : d.doubleValue());
    }

    public Double getAvgPriceEnrolled() {
        return this.avgPriceEnrolled;
    }

    public Double getStopPrice() {
        return this.stopPrice;
    }

    public Double getLimitPrice() {
        return this.limitPrice;
    }

    public long getCreateTime() {
        return ab.D(this.createAt);
    }

    public double getCount() {
        return ab.w(this.count);
    }

    public int getLeverage() {
        Integer num = this.leverage;
        return num == null ? 1 : num.intValue();
    }

    public double getAvgPrice() {
        return ab.w(this.avgPrice);
    }

    public Double getTakeProfitPrice() {
        return this.takeProfitPrice;
    }

    public Double getStopLosePrice() {
        return this.stopLosePrice;
    }

    public boolean isMarginMore() {
        return getCount() * getAvgPrice() < getMargin();
    }

    public double getPendingPrice() {
        Double stopPrice = isStop() ? getStopPrice() : isLimit() ? getLimitPrice() : null;
        return ab.w(stopPrice);
    }

    public double getMargin() {
        return ab.w(this.margin);
    }

    public double getInvestment() {
        return ab.w(this.basicStopLimitAmount);
    }

    public boolean isStop() {
        return STOP.equalsIgnoreCase(this.type);
    }

    public boolean isLimit() {
        return LIMIT.equalsIgnoreCase(this.type);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.id);
        parcel.writeValue(this.userId);
        parcel.writeValue(this.userBalanceId);
        parcel.writeString(this.instrumentType.getServerValue());
        parcel.writeString(this.instrumentId);
        parcel.writeValue(this.positionId);
        parcel.writeString(this.instrumentUderlying);
        parcel.writeValue(this.instrumentActiveId);
        parcel.writeValue(this.instrumentExpiration);
        parcel.writeString(this.instrumentDir);
        parcel.writeValue(this.instrumentStrike);
        parcel.writeValue(this.instrumentStrikeValue);
        parcel.writeString(this.status);
        parcel.writeString(this.executeStatus);
        parcel.writeString(this.rejectStatus);
        parcel.writeString(this.side);
        parcel.writeString(this.type);
        parcel.writeValue(this.count);
        parcel.writeValue(this.leverage);
        parcel.writeValue(this.createAt);
        parcel.writeValue(this.updateAt);
        parcel.writeValue(this.executeAt);
        parcel.writeValue(this.underlyingPrice);
        parcel.writeValue(this.avgPrice);
        parcel.writeValue(this.avgPriceEnrolled);
        parcel.writeValue(this.stopPrice);
        parcel.writeValue(this.limitPrice);
        parcel.writeValue(this.margin);
        parcel.writeValue(this.basicStopLimitAmount);
        parcel.writeValue(this.takeProfitPrice);
        parcel.writeValue(this.stopLosePrice);
    }

    protected Order(Parcel parcel) {
        this.id = (Long) parcel.readValue(Long.class.getClassLoader());
        this.userId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.userBalanceId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.instrumentType = InstrumentType.fromServerValue(parcel.readString());
        this.instrumentId = parcel.readString();
        this.positionId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.instrumentUderlying = parcel.readString();
        this.instrumentActiveId = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.instrumentExpiration = (Long) parcel.readValue(Long.class.getClassLoader());
        this.instrumentDir = parcel.readString();
        this.instrumentStrike = (Double) parcel.readValue(Double.class.getClassLoader());
        this.instrumentStrikeValue = (Long) parcel.readValue(Long.class.getClassLoader());
        this.status = parcel.readString();
        this.executeStatus = parcel.readString();
        this.rejectStatus = parcel.readString();
        this.side = parcel.readString();
        this.type = parcel.readString();
        this.count = (Double) parcel.readValue(Double.class.getClassLoader());
        this.leverage = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.createAt = (Long) parcel.readValue(Long.class.getClassLoader());
        this.updateAt = (Long) parcel.readValue(Long.class.getClassLoader());
        this.executeAt = (Long) parcel.readValue(Long.class.getClassLoader());
        this.underlyingPrice = (Double) parcel.readValue(Double.class.getClassLoader());
        this.avgPrice = (Double) parcel.readValue(Double.class.getClassLoader());
        this.avgPriceEnrolled = (Double) parcel.readValue(Double.class.getClassLoader());
        this.stopPrice = (Double) parcel.readValue(Double.class.getClassLoader());
        this.limitPrice = (Double) parcel.readValue(Double.class.getClassLoader());
        this.margin = (Double) parcel.readValue(Double.class.getClassLoader());
        this.basicStopLimitAmount = (Double) parcel.readValue(Double.class.getClassLoader());
        this.takeProfitPrice = (Double) parcel.readValue(Double.class.getClassLoader());
        this.stopLosePrice = (Double) parcel.readValue(Double.class.getClassLoader());
    }
}
