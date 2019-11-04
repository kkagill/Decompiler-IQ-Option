package com.iqoption.dto.entity.position;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.common.base.Predicates;
import com.google.common.base.e;
import com.google.common.base.f;
import com.google.common.c.a;
import com.google.common.collect.i;
import com.google.common.primitives.Longs;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.mobbtech.connect.response.options.c;
import com.iqoption.mobbtech.connect.response.options.d;
import com.iqoption.util.ab;
import com.iqoption.util.ad;
import com.iqoption.util.j;
import com.iqoption.util.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Position extends c {
    public static final String CLOSE_REASON_CUSTODIAL = "custodial";
    public static final String CLOSE_REASON_DEFAULT = "default";
    public static final String CLOSE_REASON_EXPIRED = "expired";
    public static final String CLOSE_REASON_MARGIN_ERASE = "margin_erase";
    public static final String CLOSE_REASON_OVERNIGHT = "overnight";
    public static final String CLOSE_REASON_STOP_LOSE = "stop_lose";
    public static final String CLOSE_REASON_STOP_LOSS = "stop_loss";
    public static final String CLOSE_REASON_TAKE_PROFIT = "take_profit";
    public static final String CLOSE_REASON_WITHDRAW = "withdraw";
    public static final Creator<Position> CREATOR = new Creator<Position>() {
        public Position createFromParcel(Parcel parcel) {
            return new Position(parcel);
        }

        public Position[] newArray(int i) {
            return new Position[i];
        }
    };
    public static final double MAX_STOP_LOSE_PERCENTE = -95.0d;
    public static final String STATUS_CLOSED = "closed";
    public static final String STATUS_OPEN = "open";
    private static final String TAG = "Position";
    public static final String TYPE_LONG = "long";
    public static final String TYPE_SHORT = "short";
    @SerializedName("buy_amount")
    private Double buyAmount;
    @SerializedName("buy_amount_enrolled")
    private Double buyAmountEnrolled;
    @SerializedName("buy_avg_price")
    private Double buyAvgPrice;
    @SerializedName("buy_avg_price_enrolled")
    private Double buyAvgPriceEnrolled;
    @SerializedName("charge")
    private Double charge;
    @SerializedName("close_at")
    private Long closeAt;
    @SerializedName("close_effect_amount")
    private Double closeEffectAmount;
    @SerializedName("close_effect_amount_enrolled")
    private Double closeEffectAmountEnrolled;
    private transient d closeOptionKey;
    @SerializedName("close_reason")
    private String closeReason;
    @SerializedName("close_underlying_price")
    private Double closeUnderlyingPrice;
    @SerializedName("commission")
    private Double commission;
    @SerializedName("count")
    private Double count;
    @SerializedName("count_realized")
    private Double countRealized;
    @SerializedName("create_at")
    private Long createAt;
    @SerializedName("currency_rate")
    private Double currencyRate;
    @SerializedName("currency_unit")
    private Double currencyUnit;
    @SerializedName("custodial")
    private Double custodial;
    @SerializedName("custodial_enrolled")
    private Double custodialEnrolled;
    @SerializedName("custodial_last_age")
    private Integer custodialLastAge;
    @SerializedName("extra_data")
    private ExtraData extraData;
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
    @SerializedName("instrument_period")
    private Long instrumentPeriod;
    @SerializedName("instrument_strike")
    private Double instrumentStrike;
    @SerializedName("instrument_strike_value")
    private Long instrumentStrikeValue;
    @SerializedName("instrument_type")
    private InstrumentType instrumentType;
    @SerializedName("instrument_underlying")
    private String instrumentUderlying;
    @SerializedName("items")
    private ArrayList<PositionItem> items;
    @SerializedName("leverage")
    private Integer leverage;
    @SerializedName("margin")
    private Double margin;
    @SerializedName("margin_call")
    private Double marginCall;
    private transient PositionMath math;
    @SerializedName("open_client_platform_id")
    private Integer openClientPlatformId;
    @SerializedName("open_underlying_price")
    private Double openUnderlyingPrice;
    @SerializedName("order_ids")
    private ArrayList<Long> orderIds;
    @SerializedName("pnl_realized")
    private Double pnlRealized;
    @SerializedName("pnl_realized_enrolled")
    private Double pnlRealizedEnrolled;
    @SerializedName("sell_amount")
    private Double sellAmount;
    @SerializedName("sell_amount_enrolled")
    private Double sellAmountEnrolled;
    @SerializedName("sell_avg_price")
    private Double sellAvgPrice;
    @SerializedName("sell_avg_price_enrolled")
    private Double sellAvgPriceEnrolled;
    @SerializedName("status")
    private String status;
    @SerializedName("stop_lose_order_id")
    private Long stopLoseOrderId;
    @SerializedName("swap")
    private Double swap;
    @SerializedName("take_profit_order_id")
    private Long takeProfitOrderId;
    @SerializedName("update_at")
    private Long updateAt;

    public int describeContents() {
        return 0;
    }

    public long getCancelTimeLeft(long j) {
        return 0;
    }

    public boolean isCancelable(long j) {
        return false;
    }

    public ArrayList<PositionItem> getPositionItems() {
        ArrayList<PositionItem> arrayList = this.items;
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private PositionMath getMath() {
        if (this.math == null) {
            if (this.instrumentType == InstrumentType.FX_INSTRUMENT) {
                double percent;
                PayoutLimit payoutLimit = this.extraData.getPayoutLimit();
                String str = this.instrumentId;
                int intValue = this.instrumentActiveId.intValue();
                if (payoutLimit != null) {
                    percent = (double) payoutLimit.getPercent();
                    Double.isNaN(percent);
                    percent /= 100.0d;
                } else {
                    percent = 0.0d;
                }
                double absolute = payoutLimit != null ? payoutLimit.getAbsolute() : 0.0d;
                FxMath fxMath = r2;
                FxMath fxMath2 = new FxMath(str, intValue, percent, absolute, isCall(), getBuyAvgPriceEnrolled(), getInstrumentStrike(), getRate());
                this.math = fxMath;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Math is not supported for ");
                stringBuilder.append(this.instrumentType);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return this.math;
    }

    public List<Long> getOrderIds() {
        List<Long> list = this.orderIds;
        return list == null ? Collections.emptyList() : list;
    }

    public double getCustodial() {
        return ad.w(this.custodial);
    }

    public int getCustodialLastAge() {
        return ad.r(this.custodialLastAge);
    }

    public long getIndex() {
        return this.index;
    }

    public Long getStopLoseOrderId() {
        return this.stopLoseOrderId;
    }

    public Long getTakeProfitOrderId() {
        return this.takeProfitOrderId;
    }

    public String getStringStopLoseOrderId() {
        Long l = this.stopLoseOrderId;
        return l == null ? "" : String.valueOf(l);
    }

    public String getStringTakeProfitOrderId() {
        Long l = this.takeProfitOrderId;
        return l == null ? "" : String.valueOf(l);
    }

    public Double getCommission() {
        return this.commission;
    }

    public Double getSwap() {
        return p.d(this.swap, this.charge);
    }

    public double getSelfSwap() {
        return ((Double) e.g(getSwap(), Double.valueOf(0.0d))).doubleValue();
    }

    public Double getMarginCall() {
        return this.marginCall;
    }

    public double getSelfMarginCall() {
        Double d = this.marginCall;
        return d == null ? 0.0d : d.doubleValue();
    }

    @Nullable
    public Double getMarginCallOpt() {
        Double d = this.marginCall;
        if (d == null || a.b(0.0d, d.doubleValue(), 0.001d)) {
            return null;
        }
        return this.marginCall;
    }

    public boolean isAutoMarginCall() {
        ExtraData extraData = this.extraData;
        return (extraData == null || extraData.autoMarginCall == null) ? false : this.extraData.autoMarginCall.booleanValue();
    }

    public String spotLowerInstrumentId() {
        ExtraData extraData = this.extraData;
        return (extraData == null || extraData.spotLowerInstrumentId == null) ? "" : this.extraData.spotLowerInstrumentId;
    }

    public String spotUpperInstrumentId() {
        ExtraData extraData = this.extraData;
        return (extraData == null || extraData.spotUpperInstrumentId == null) ? "" : this.extraData.spotUpperInstrumentId;
    }

    public long spotLowerInstrumentStrike() {
        ExtraData extraData = this.extraData;
        return (extraData == null || extraData.lowerInstrumentStrike == null) ? 0 : this.extraData.lowerInstrumentStrike.longValue();
    }

    public long spotUpperInstrumentStrike() {
        ExtraData extraData = this.extraData;
        return (extraData == null || extraData.upperInstrumentStrike == null) ? 0 : this.extraData.upperInstrumentStrike.longValue();
    }

    public boolean isSpotStrike() {
        ExtraData extraData = this.extraData;
        return (extraData == null || extraData.isSpotOption == null) ? false : this.extraData.isSpotOption.booleanValue();
    }

    public int getGLstopOutThreshold() {
        if (this.instrumentType.isForexOrCFDorCrypto()) {
            ExtraData extraData = this.extraData;
            if (!(extraData == null || extraData.stopOutThreshold == null)) {
                return this.extraData.stopOutThreshold.intValue();
            }
        }
        return 0;
    }

    public double getStopOutThreshold() {
        if (this.instrumentType.isForexOrCFDorCrypto()) {
            ExtraData extraData = this.extraData;
            if (!(extraData == null || extraData.stopOutThreshold == null)) {
                return ab.Q((double) this.extraData.stopOutThreshold.intValue());
            }
        }
        return -95.0d;
    }

    public Integer getOpenClientPlatformId() {
        Integer num = this.openClientPlatformId;
        return Integer.valueOf(num == null ? 17 : num.intValue());
    }

    public int getActiveId() {
        Integer num = this.instrumentActiveId;
        return num != null ? num.intValue() : -1;
    }

    public String getDir() {
        return this.instrumentDir;
    }

    public int isLongInt() {
        return isLong();
    }

    public int isCallInt() {
        return isCall();
    }

    public boolean isCall() {
        int i = AnonymousClass2.$SwitchMap$com$iqoption$core$data$model$InstrumentType[this.instrumentType.ordinal()];
        if (i == 1 || i == 2) {
            return NotificationCompat.CATEGORY_CALL.equalsIgnoreCase(this.instrumentDir);
        } else if (i == 3 || i == 4 || i == 5) {
            return isLong(this);
        } else {
            return true;
        }
    }

    public boolean isLong() {
        return isLong(this);
    }

    public long getExpired() {
        Long l = this.instrumentExpiration;
        if (l == null) {
            return -1;
        }
        return ad.D(l) / 1000;
    }

    public long getExpireTime() {
        Long l = this.instrumentExpiration;
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    public long getCreated() {
        return ad.D(this.createAt) / 1000;
    }

    public long getUpdated() {
        Long l = this.updateAt;
        if (l == null) {
            return 0;
        }
        return l.longValue() / 1000;
    }

    public long getClosed() {
        Long l = this.closeAt;
        if (l == null) {
            return 0;
        }
        return l.longValue() / 1000;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public boolean isClosed() {
        return f.equal(this.status, STATUS_CLOSED);
    }

    public String getStatus() {
        return this.status;
    }

    public double getBidPrice() {
        Double price = getPrice(true, false);
        return price != null ? price.doubleValue() : 0.0d;
    }

    public double getAskPrice() {
        Double price = getPrice(false, false);
        return price != null ? price.doubleValue() : 0.0d;
    }

    public double getBidPriceEnrolled() {
        Double price = getPrice(true, true);
        return price != null ? price.doubleValue() : 0.0d;
    }

    public double getAskPriceEnrolled() {
        Double price = getPrice(false, true);
        return price != null ? price.doubleValue() : 0.0d;
    }

    public double getSelfPriceEnrolled() {
        Double price = getPrice(isLong(this), true);
        return price != null ? price.doubleValue() : 0.0d;
    }

    public double getUnderlyingPrice() {
        ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.instrumentActiveId.intValue());
        if (dY == null) {
            return 0.0d;
        }
        double bid;
        if (isLong(this)) {
            bid = dY.getBid(getInstrumentType(), getLeverage());
        } else {
            bid = dY.getAsk(getInstrumentType(), getLeverage());
        }
        return bid;
    }

    @Nullable
    public synchronized Double calculateBuybackAmountWithCancelable(long j) {
        return calculateBuyback();
    }

    private Double calculateBuyback() {
        Double price = getPrice(isLong(), false);
        if (price == null) {
            return null;
        }
        int i = AnonymousClass2.$SwitchMap$com$iqoption$core$data$model$InstrumentType[this.instrumentType.ordinal()];
        if (i == 1) {
            return Double.valueOf(getMath().getSellProfit() * getAbsCount());
        }
        if (i != 6) {
            return Double.valueOf(price.doubleValue() * getAbsCount());
        }
        return Double.valueOf(price.doubleValue() * getBuyAmount());
    }

    public double getSellPnl() {
        double pnlRealized;
        double selfMarginCall;
        if (isClosed()) {
            pnlRealized = getPnlRealized() + getCloseEffectAmount();
            selfMarginCall = getSelfMarginCall();
        } else if (isLong()) {
            pnlRealized = ad.w(calculateBuyback());
            selfMarginCall = getOpenAmount();
        } else {
            pnlRealized = getOpenAmount();
            selfMarginCall = ad.w(calculateBuyback());
        }
        return pnlRealized - selfMarginCall;
    }

    private double getCloseEffectAmount() {
        double w = ad.w(this.closeEffectAmount);
        int i = AnonymousClass2.$SwitchMap$com$iqoption$core$data$model$InstrumentType[this.instrumentType.ordinal()];
        if (i == 1 || i == 2 || i == 6) {
            return w;
        }
        double openPrice = getOpenPrice() * getAbsCount();
        double leverage = (double) getLeverage();
        Double.isNaN(leverage);
        return w - (openPrice / leverage);
    }

    private double getPnlRealized() {
        int i = AnonymousClass2.$SwitchMap$com$iqoption$core$data$model$InstrumentType[this.instrumentType.ordinal()];
        return (i == 1 || i == 2 || i == 6) ? getSellAmount() - getBuyAmount() : ad.w(this.pnlRealized);
    }

    @Nullable
    private Double getPrice(boolean z, boolean z2) {
        switch (this.instrumentType) {
            case FX_INSTRUMENT:
                return calculatePriceForFxOption(z2, this);
            case DIGITAL_INSTRUMENT:
                return isSpotStrike() ? calculatePriceForDigitalSpotOption(isCall(), z2, this) : calculatePriceForDigitalOption(z2, this);
            case CRYPTO_INSTRUMENT:
            case FOREX_INSTRUMENT:
            case CFD_INSTRUMENT:
                return calculatePriceForCfd(z, z2, this);
            case MULTI_INSTRUMENT:
                return calculatePriceForMultiSpotOption(z2, this);
            default:
                return null;
        }
    }

    private Double calculatePriceForFxOption(boolean z, Position position) {
        com.iqoption.core.microservices.tradingengine.response.a c = com.iqoption.app.managers.c.GS().c(position.instrumentId, InstrumentType.FX_INSTRUMENT);
        if (c == null) {
            return null;
        }
        if (z) {
            return Double.valueOf(c.getBidPrice());
        }
        return Double.valueOf(getConvertedPriceInCurrencyPosition(Double.valueOf(c.getBidPrice()), position.getRate()));
    }

    private static Double calculatePriceForCfd(boolean z, boolean z2, Position position) {
        ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(position.getActiveId());
        if (dY == null) {
            return null;
        }
        return calculatePriceForCfd(z, z2, position, dY);
    }

    private static Double calculatePriceForCfd(boolean z, boolean z2, Position position, ActiveQuote activeQuote) {
        double bid;
        if (z2) {
            if (z) {
                bid = activeQuote.getBid(position.getInstrumentType(), position.getLeverage());
            } else {
                bid = activeQuote.getAsk(position.getInstrumentType(), position.getLeverage());
            }
            return Double.valueOf(bid);
        }
        if (z) {
            bid = activeQuote.getBid(position.getInstrumentType(), position.getLeverage());
        } else {
            bid = activeQuote.getAsk(position.getInstrumentType(), position.getLeverage());
        }
        return Double.valueOf(getConvertedPriceInCurrencyPosition(Double.valueOf(bid), position.getRate()));
    }

    private static Double calculatePriceForDigitalOption(boolean z, Position position) {
        com.iqoption.core.microservices.tradingengine.response.a c = com.iqoption.app.managers.c.GS().c(position.instrumentId, InstrumentType.DIGITAL_INSTRUMENT);
        if (c == null) {
            return null;
        }
        return calculatePriceForDigitalOption(z, position, c);
    }

    private static Double calculatePriceForDigitalOption(boolean z, Position position, com.iqoption.core.microservices.tradingengine.response.a aVar) {
        if (z) {
            return Double.valueOf(aVar.getBidPrice());
        }
        return Double.valueOf(getConvertedPriceInCurrencyPosition(Double.valueOf(aVar.getBidPrice()), position.getRate()));
    }

    private static Double calculatePriceForDigitalSpotOption(boolean z, boolean z2, Position position) {
        com.iqoption.core.microservices.tradingengine.response.a c = com.iqoption.app.managers.c.GS().c(position.spotLowerInstrumentId(), InstrumentType.DIGITAL_INSTRUMENT);
        com.iqoption.core.microservices.tradingengine.response.a c2 = com.iqoption.app.managers.c.GS().c(position.spotUpperInstrumentId(), InstrumentType.DIGITAL_INSTRUMENT);
        return (c == null || c2 == null) ? null : calculatePriceForDigitalSpotOption(z, z2, position, c, c2);
    }

    private static Double calculatePriceForDigitalSpotOption(boolean z, boolean z2, Position position, com.iqoption.core.microservices.tradingengine.response.a aVar, com.iqoption.core.microservices.tradingengine.response.a aVar2) {
        double instrumentStrikeValue = (double) position.getInstrumentStrikeValue();
        Double.isNaN(instrumentStrikeValue);
        instrumentStrikeValue /= 1000000.0d;
        double spotLowerInstrumentStrike = (double) position.spotLowerInstrumentStrike();
        Double.isNaN(spotLowerInstrumentStrike);
        spotLowerInstrumentStrike /= 1000000.0d;
        double spotUpperInstrumentStrike = (double) position.spotUpperInstrumentStrike();
        Double.isNaN(spotUpperInstrumentStrike);
        spotUpperInstrumentStrike /= 1000000.0d;
        double f = com.iqoption.core.microservices.tradingengine.response.a.f(aVar);
        double f2 = com.iqoption.core.microservices.tradingengine.response.a.f(aVar2);
        if (spotLowerInstrumentStrike != instrumentStrikeValue) {
            if (spotLowerInstrumentStrike > instrumentStrikeValue || instrumentStrikeValue > spotUpperInstrumentStrike) {
                aVar = com.iqoption.app.managers.c.GS().c(position.getInstrumentId(), InstrumentType.DIGITAL_INSTRUMENT);
                ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(position.getActiveId());
                if (aVar == null || dY == null) {
                    return null;
                }
                spotUpperInstrumentStrike = dY.getVal();
                f2 = com.iqoption.core.microservices.tradingengine.response.a.f(aVar);
                if (z) {
                    instrumentStrikeValue = (spotUpperInstrumentStrike - instrumentStrikeValue) / Math.abs(spotUpperInstrumentStrike - spotLowerInstrumentStrike);
                    f = Math.abs(f2 - f);
                } else {
                    instrumentStrikeValue = (instrumentStrikeValue - spotUpperInstrumentStrike) / Math.abs(spotUpperInstrumentStrike - spotLowerInstrumentStrike);
                    f = Math.abs(f2 - f);
                }
            } else if (z) {
                f += ((instrumentStrikeValue - spotLowerInstrumentStrike) / (spotUpperInstrumentStrike - spotLowerInstrumentStrike)) * (f2 - f);
            } else {
                instrumentStrikeValue = (spotUpperInstrumentStrike - instrumentStrikeValue) / (spotUpperInstrumentStrike - spotLowerInstrumentStrike);
                f -= f2;
            }
            f = f2 + (instrumentStrikeValue * f);
        }
        if (z2) {
            return Double.valueOf(f);
        }
        return Double.valueOf(getConvertedPriceInCurrencyPosition(Double.valueOf(f), position.getRate()));
    }

    private static Double calculatePriceForMultiSpotOption(boolean z, Position position) {
        double rate = position.getRate();
        Iterator it = position.getPositionItems().iterator();
        Double d = null;
        while (it.hasNext()) {
            Double price = ((PositionItem) it.next()).getPrice(z, rate);
            if (price == null) {
                return null;
            }
            double doubleValue;
            if (d == null) {
                doubleValue = price.doubleValue();
            } else {
                doubleValue = price.doubleValue() * d.doubleValue();
            }
            d = Double.valueOf(doubleValue);
        }
        return d;
    }

    private static double getConvertedPriceInCurrencyPosition(Double d, double d2) {
        return d == null ? 0.0d : d.doubleValue() / d2;
    }

    public double getRate() {
        Double d = this.currencyRate;
        double d2 = 1.0d;
        double doubleValue = d == null ? 1.0d : d.doubleValue();
        d = this.currencyUnit;
        if (d != null) {
            d2 = d.doubleValue();
        }
        return doubleValue / d2;
    }

    public double getValue() {
        int i = AnonymousClass2.$SwitchMap$com$iqoption$core$data$model$InstrumentType[this.instrumentType.ordinal()];
        if (i == 1 || i == 2) {
            return ad.w(this.instrumentStrike);
        }
        if (i == 3 || i == 4 || i == 5) {
            return getOpenPrice();
        }
        return 0.0d;
    }

    public double getOpenUnderlyingPrice() {
        return ad.w(this.openUnderlyingPrice);
    }

    public double getExpValue() {
        return ad.w(this.closeUnderlyingPrice);
    }

    public double getWinAmount() {
        return getSellPnl() + getInvestSum();
    }

    public double getCloseInvestSum() {
        return (getInvestSum() + getSelfSwap()) + getCustodial();
    }

    public double getInvestSum() {
        double totalSum = getTotalSum();
        double leverage = (double) getLeverage();
        Double.isNaN(leverage);
        return totalSum / leverage;
    }

    public double getTotalSum() {
        return getOpenAmount();
    }

    public double getProfitIfWin() {
        if (AnonymousClass2.$SwitchMap$com$iqoption$core$data$model$InstrumentType[this.instrumentType.ordinal()] != 6) {
            return ad.w(j.v(Double.valueOf(100.0d))) * getCount();
        }
        double d = 1.0d;
        Iterator it = getPositionItems().iterator();
        while (it.hasNext()) {
            d *= 100.0d / ((PositionItem) it.next()).getBuyAvgPriceEnrolled();
        }
        return d * getBuyAmount();
    }

    public Double getOptionCount() {
        return Double.valueOf(getCountRealized() + getAbsCount());
    }

    public Double getOptionOptPrice() {
        return Double.valueOf(getBuyAvgPrice());
    }

    public boolean isSold() {
        String str = this.closeReason;
        return (str == null || CLOSE_REASON_EXPIRED.equals(str)) ? false : true;
    }

    public static String createPositionSplitId(InstrumentType instrumentType, Integer num, Long l, Long l2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(instrumentType);
        String str = "_";
        stringBuilder.append(str);
        stringBuilder.append(num);
        stringBuilder.append(str);
        stringBuilder.append(l);
        stringBuilder.append(str);
        stringBuilder.append(l2);
        return stringBuilder.toString();
    }

    public String getPositionSplitId() {
        return createPositionSplitId(getInstrumentType(), Integer.valueOf(getActiveId()), Long.valueOf(getExpired()), getId());
    }

    public static Object[] parsePositionSplitId(String str) {
        String[] split = str.split("_");
        InstrumentType fromServerValue = InstrumentType.fromServerValue(split[0]);
        Integer bW = com.google.common.primitives.c.bW(split[1]);
        Long bX = Longs.bX(split[2]);
        Long bX2 = Longs.bX(split[3]);
        d dVar = new d(bX, bW, fromServerValue);
        return new Object[]{bX2, dVar};
    }

    public String createStrikeKey() {
        return com.iqoption.core.microservices.tradingengine.response.instrument.e.a(getInstrumentType(), getInstrumentUderlying(), getInstrumentExpiration().longValue(), getInstrumentStrikeValue(), getExpirationPeriod(), isSpotStrike());
    }

    public long getExpirationPeriod() {
        return ad.D(this.instrumentPeriod);
    }

    public String getWin() {
        return ((long) (getWinAmount() * 1000.0d)) > ((long) (getCloseInvestSum() * 1000.0d)) ? "win" : "loose";
    }

    public String getCloseStatus() {
        if (isSold()) {
            return "sold";
        }
        return getWin();
    }

    public synchronized double getCurrentProfitAmount() {
        int i = AnonymousClass2.$SwitchMap$com$iqoption$core$data$model$InstrumentType[this.instrumentType.ordinal()];
        Object obj = 1;
        if (i != 1) {
            double d = 0.0d;
            if (i == 2) {
                if (this.currentProfitAmount == null) {
                    this.currentProfitAmount = Double.valueOf(0.0d);
                }
                ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(getActiveId());
                if (!(dY == null || getLastKnowValue() == dY.getVal())) {
                    Object valueOf;
                    setLastKnowValue(dY.getVal());
                    long val = (long) (dY.getVal() * 1000000.0d);
                    long value = (long) (getValue() * 1000000.0d);
                    if (NotificationCompat.CATEGORY_CALL.equals(getDir())) {
                        if (val > value) {
                            d = getProfitIfWin();
                        }
                        valueOf = Double.valueOf(d);
                    } else {
                        if (val < value) {
                            d = getProfitIfWin();
                        }
                        valueOf = Double.valueOf(d);
                    }
                    if (this.currentProfitAmount == null || !this.currentProfitAmount.equals(valueOf)) {
                        this.currentProfitAmount = valueOf;
                    }
                }
                return this.currentProfitAmount.doubleValue();
            } else if (i != 6) {
                return super.getCurrentProfitAmount();
            } else {
                if (this.currentProfitAmount == null) {
                    this.currentProfitAmount = Double.valueOf(0.0d);
                }
                Iterator it = getPositionItems().iterator();
                while (it.hasNext()) {
                    PositionItem positionItem = (PositionItem) it.next();
                    ActiveQuote dY2 = com.iqoption.app.managers.c.GS().dY(positionItem.getActiveId());
                    if (dY2 == null || !positionItem.isWin(dY2.getVal())) {
                        obj = null;
                    }
                }
                if (obj != null) {
                    d = getProfitIfWin();
                }
                this.currentProfitAmount = Double.valueOf(d);
                return this.currentProfitAmount.doubleValue();
            }
        }
        return getMath().getExpProfit() * getAbsCount();
    }

    public String getInstrumentId() {
        String str = this.instrumentId;
        return str == null ? "" : str;
    }

    public Long getInstrumentExpiration() {
        Long l = this.instrumentExpiration;
        return Long.valueOf(l == null ? 0 : l.longValue());
    }

    public String getInstrumentUderlying() {
        String str = this.instrumentUderlying;
        return str == null ? "" : str;
    }

    public double getInstrumentStrike() {
        return ad.w(this.instrumentStrike);
    }

    public long getInstrumentStrikeValue() {
        return ad.D(this.instrumentStrikeValue);
    }

    public int getLeverage() {
        Integer num = this.leverage;
        return (num == null || num.intValue() == 0) ? 1 : this.leverage.intValue();
    }

    public double getBuyAvgPrice() {
        return ad.w(this.buyAvgPrice);
    }

    public double getSellAvgPrice() {
        return ad.w(this.sellAvgPrice);
    }

    public double getBuyAvgPriceEnrolled() {
        return ad.w(this.buyAvgPriceEnrolled);
    }

    public double getSellAvgPriceEnrolled() {
        return ad.w(this.sellAvgPriceEnrolled);
    }

    public double getAbsCount() {
        if (isLong(this)) {
            return getCount();
        }
        return -getCount();
    }

    public double getCount() {
        return ad.w(this.count);
    }

    public double getCountRealized() {
        return ad.w(this.countRealized);
    }

    public double getOpenPrice() {
        if (isLong(this)) {
            return getBuyAvgPrice();
        }
        return getSellAvgPrice();
    }

    public Double getOpenPriceEnrolled() {
        if (isLong(this)) {
            return Double.valueOf(getBuyAvgPriceEnrolled());
        }
        return Double.valueOf(getSellAvgPriceEnrolled());
    }

    public Double getCloseUnderlyingPrice() {
        return this.closeUnderlyingPrice;
    }

    @Nullable
    public Double getTakeProfitValue() {
        Order order;
        Long takeProfitOrderId = getTakeProfitOrderId();
        if (takeProfitOrderId == null) {
            order = null;
        } else {
            order = (Order) i.b(com.iqoption.app.managers.c.GS().j(getId())).d(Predicates.a(Predicates.ao(takeProfitOrderId), Order.getOrderId)).pN();
        }
        if (order == null) {
            return null;
        }
        return order.getLimitPrice();
    }

    @Nullable
    public Double getStopLoseValue() {
        Order order;
        Long stopLoseOrderId = getStopLoseOrderId();
        if (stopLoseOrderId == null) {
            order = null;
        } else {
            order = (Order) i.b(com.iqoption.app.managers.c.GS().j(getId())).d(Predicates.a(Predicates.ao(stopLoseOrderId), Order.getOrderId)).pN();
        }
        if (order == null) {
            return null;
        }
        return order.getStopPrice();
    }

    public boolean isTrailingStop() {
        Order order;
        Long stopLoseOrderId = getStopLoseOrderId();
        if (stopLoseOrderId == null) {
            order = null;
        } else {
            order = (Order) i.b(com.iqoption.app.managers.c.GS().j(getId())).d(Predicates.a(Predicates.ao(stopLoseOrderId), Order.getOrderId)).pN();
        }
        if (order != null) {
            if (Order.TRAIL_STOP.equalsIgnoreCase(order.getType())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLong(Position position) {
        return TYPE_LONG.equalsIgnoreCase(position.getType());
    }

    public long getCloseTime() {
        Long l = this.closeAt;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    public long getUpdateTime() {
        Long l = this.updateAt;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    public long getCreateTime() {
        Long l = this.createAt;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    public d getCloseOptionKey() {
        com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(getActiveId()), getInstrumentType());
        if (a == null) {
            int i = AnonymousClass2.$SwitchMap$com$iqoption$core$data$model$InstrumentType[this.instrumentType.ordinal()];
            if (i == 3 || i == 4 || i == 5) {
                return getCFCCloseOptionKey();
            }
            return super.getCloseOptionKey();
        } else if (a.isExpired()) {
            return super.getCloseOptionKey();
        } else {
            return getCFCCloseOptionKey();
        }
    }

    private d getCFCCloseOptionKey() {
        if (this.closeOptionKey == null) {
            synchronized (this) {
                if (this.closeOptionKey == null) {
                    this.closeOptionKey = createCFCCloseOptionKey(this);
                }
            }
        }
        return this.closeOptionKey;
    }

    private static d createCFCCloseOptionKey(Position position) {
        return new d(position.getId(), Long.valueOf(position.getCloseTime() / 1000), Integer.valueOf(position.getActiveId()), position.getInstrumentType());
    }

    public boolean isMarginErased() {
        return CLOSE_REASON_MARGIN_ERASE.equalsIgnoreCase(this.closeReason);
    }

    public boolean isExpired() {
        return CLOSE_REASON_EXPIRED.equalsIgnoreCase(this.closeReason);
    }

    public boolean isStopLossPerformed() {
        if (!CLOSE_REASON_STOP_LOSS.equalsIgnoreCase(this.closeReason)) {
            if (!CLOSE_REASON_STOP_LOSE.equalsIgnoreCase(this.closeReason)) {
                return false;
            }
        }
        return true;
    }

    public boolean isTakeProfitPerformed() {
        return CLOSE_REASON_TAKE_PROFIT.equalsIgnoreCase(this.closeReason);
    }

    public boolean isOvernight() {
        return CLOSE_REASON_OVERNIGHT.equalsIgnoreCase(this.closeReason);
    }

    public boolean isWithdraw() {
        return CLOSE_REASON_WITHDRAW.equalsIgnoreCase(this.closeReason);
    }

    public String getCloseReason() {
        String str = this.closeReason;
        return str == null ? "" : str;
    }

    public double getProfitPercentRestriction() {
        ExtraData extraData = this.extraData;
        if (extraData == null) {
            return 0.0d;
        }
        PayoutLimit payoutLimit = extraData.getPayoutLimit();
        if (payoutLimit == null) {
            return 0.0d;
        }
        return (double) payoutLimit.getPercent();
    }

    public double getProfitAbsoluteRestriction() {
        ExtraData extraData = this.extraData;
        if (extraData == null) {
            return 0.0d;
        }
        PayoutLimit payoutLimit = extraData.getPayoutLimit();
        if (payoutLimit == null) {
            return 0.0d;
        }
        return payoutLimit.getAbsolute();
    }

    private double getOpenAmount() {
        if (isLong()) {
            return getBuyAmount();
        }
        return getSellAmount();
    }

    public double getBuyAmount() {
        return ad.w(this.buyAmount);
    }

    public double getBuyAmountEnrolled() {
        return ad.w(this.buyAmountEnrolled);
    }

    public double getSellAmount() {
        return ad.w(this.sellAmount);
    }

    public double getSellAmountEnrolled() {
        return ad.w(this.sellAmountEnrolled);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Position{index=");
        stringBuilder.append(this.index);
        stringBuilder.append(", instrumentUderlying='");
        stringBuilder.append(this.instrumentUderlying);
        stringBuilder.append('\'');
        stringBuilder.append(", instrumentActiveId=");
        stringBuilder.append(this.instrumentActiveId);
        stringBuilder.append(", instrumentExpiration=");
        stringBuilder.append(this.instrumentExpiration);
        stringBuilder.append(", instrumentDir='");
        stringBuilder.append(this.instrumentDir);
        stringBuilder.append('\'');
        stringBuilder.append(", instrumentStrike=");
        stringBuilder.append(this.instrumentStrike);
        stringBuilder.append(", instrumentStrikeValue=");
        stringBuilder.append(this.instrumentStrikeValue);
        stringBuilder.append(", instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", instrumentId='");
        stringBuilder.append(this.instrumentId);
        stringBuilder.append('\'');
        stringBuilder.append(", status='");
        stringBuilder.append(this.status);
        stringBuilder.append('\'');
        stringBuilder.append(", commission=");
        stringBuilder.append(this.commission);
        stringBuilder.append(", closeReason='");
        stringBuilder.append(this.closeReason);
        stringBuilder.append('\'');
        stringBuilder.append(", count=");
        stringBuilder.append(this.count);
        stringBuilder.append(", countRealized=");
        stringBuilder.append(this.countRealized);
        stringBuilder.append(", leverage=");
        stringBuilder.append(this.leverage);
        stringBuilder.append(", buyAvgPrice=");
        stringBuilder.append(this.buyAvgPrice);
        stringBuilder.append(", buyAvgPriceEnrolled=");
        stringBuilder.append(this.buyAvgPriceEnrolled);
        stringBuilder.append(", sellAvgPrice=");
        stringBuilder.append(this.sellAvgPrice);
        stringBuilder.append(", sellAvgPriceEnrolled=");
        stringBuilder.append(this.sellAvgPriceEnrolled);
        stringBuilder.append(", buyAmount=");
        stringBuilder.append(this.buyAmount);
        stringBuilder.append(", buyAmountEnrolled=");
        stringBuilder.append(this.buyAmountEnrolled);
        stringBuilder.append(", sellAmount=");
        stringBuilder.append(this.sellAmount);
        stringBuilder.append(", sellAmountEnrolled=");
        stringBuilder.append(this.sellAmountEnrolled);
        stringBuilder.append(", pnlRealized=");
        stringBuilder.append(this.pnlRealized);
        stringBuilder.append(", pnlRealizedEnrolled=");
        stringBuilder.append(this.pnlRealizedEnrolled);
        stringBuilder.append(", closeEffectAmount=");
        stringBuilder.append(this.closeEffectAmount);
        stringBuilder.append(", swap=");
        stringBuilder.append(this.swap);
        stringBuilder.append(", charge=");
        stringBuilder.append(this.charge);
        stringBuilder.append(", openClientPlatformId=");
        stringBuilder.append(this.openClientPlatformId);
        stringBuilder.append(", createAt=");
        stringBuilder.append(this.createAt);
        stringBuilder.append(", updateAt=");
        stringBuilder.append(this.updateAt);
        stringBuilder.append(", closeAt=");
        stringBuilder.append(this.closeAt);
        stringBuilder.append(", closeUnderlyingPrice=");
        stringBuilder.append(this.closeUnderlyingPrice);
        stringBuilder.append(", openUnderlyingPrice=");
        stringBuilder.append(this.openUnderlyingPrice);
        stringBuilder.append(", margin=");
        stringBuilder.append(this.margin);
        stringBuilder.append(", currencyUnit=");
        stringBuilder.append(this.currencyUnit);
        stringBuilder.append(", currencyRate=");
        stringBuilder.append(this.currencyRate);
        stringBuilder.append(", custodial=");
        stringBuilder.append(this.custodial);
        stringBuilder.append(", custodialEnrolled=");
        stringBuilder.append(this.custodialEnrolled);
        stringBuilder.append(", custodialLastAge=");
        stringBuilder.append(this.custodialLastAge);
        stringBuilder.append(", stopLoseOrderId=");
        stringBuilder.append(this.stopLoseOrderId);
        stringBuilder.append(", takeProfitOrderId=");
        stringBuilder.append(this.takeProfitOrderId);
        stringBuilder.append(", marginCall=");
        stringBuilder.append(this.marginCall);
        stringBuilder.append(", extraData=");
        stringBuilder.append(this.extraData);
        stringBuilder.append(", orderIds=");
        stringBuilder.append(this.orderIds);
        stringBuilder.append(", math=");
        stringBuilder.append(this.math);
        stringBuilder.append(", closeOptionKey=");
        stringBuilder.append(this.closeOptionKey);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.instrumentUderlying);
        parcel.writeValue(this.instrumentActiveId);
        parcel.writeValue(this.instrumentExpiration);
        parcel.writeString(this.instrumentDir);
        parcel.writeValue(this.instrumentStrike);
        parcel.writeValue(this.instrumentStrikeValue);
        parcel.writeString(this.instrumentType.getServerValue());
        parcel.writeString(this.instrumentId);
        parcel.writeString(this.status);
        parcel.writeValue(this.commission);
        parcel.writeString(this.closeReason);
        parcel.writeValue(this.count);
        parcel.writeValue(this.countRealized);
        parcel.writeValue(this.leverage);
        parcel.writeValue(this.buyAvgPrice);
        parcel.writeValue(this.buyAvgPriceEnrolled);
        parcel.writeValue(this.sellAvgPrice);
        parcel.writeValue(this.sellAvgPriceEnrolled);
        parcel.writeValue(this.pnlRealized);
        parcel.writeValue(this.pnlRealizedEnrolled);
        parcel.writeValue(this.closeEffectAmount);
        parcel.writeValue(this.swap);
        parcel.writeValue(this.openClientPlatformId);
        parcel.writeValue(this.createAt);
        parcel.writeValue(this.updateAt);
        parcel.writeValue(this.closeAt);
        parcel.writeValue(this.closeUnderlyingPrice);
        parcel.writeValue(this.openUnderlyingPrice);
        parcel.writeValue(this.margin);
        parcel.writeValue(this.currencyUnit);
        parcel.writeValue(this.currencyRate);
        parcel.writeValue(this.stopLoseOrderId);
        parcel.writeValue(this.takeProfitOrderId);
        parcel.writeValue(this.marginCall);
        parcel.writeParcelable(this.extraData, i);
    }

    protected Position(Parcel parcel) {
        super(parcel);
        this.instrumentUderlying = parcel.readString();
        this.instrumentActiveId = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.instrumentExpiration = (Long) parcel.readValue(Long.class.getClassLoader());
        this.instrumentDir = parcel.readString();
        this.instrumentStrike = (Double) parcel.readValue(Double.class.getClassLoader());
        this.instrumentStrikeValue = (Long) parcel.readValue(Long.class.getClassLoader());
        this.instrumentType = InstrumentType.fromServerValue(parcel.readString());
        this.instrumentId = parcel.readString();
        this.status = parcel.readString();
        this.commission = (Double) parcel.readValue(Double.class.getClassLoader());
        this.closeReason = parcel.readString();
        this.count = (Double) parcel.readValue(Double.class.getClassLoader());
        this.countRealized = (Double) parcel.readValue(Double.class.getClassLoader());
        this.leverage = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.buyAvgPrice = (Double) parcel.readValue(Double.class.getClassLoader());
        this.buyAvgPriceEnrolled = (Double) parcel.readValue(Double.class.getClassLoader());
        this.sellAvgPrice = (Double) parcel.readValue(Double.class.getClassLoader());
        this.sellAvgPriceEnrolled = (Double) parcel.readValue(Double.class.getClassLoader());
        this.pnlRealized = (Double) parcel.readValue(Double.class.getClassLoader());
        this.pnlRealizedEnrolled = (Double) parcel.readValue(Double.class.getClassLoader());
        this.closeEffectAmount = (Double) parcel.readValue(Double.class.getClassLoader());
        this.swap = (Double) parcel.readValue(Double.class.getClassLoader());
        this.openClientPlatformId = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.createAt = (Long) parcel.readValue(Long.class.getClassLoader());
        this.updateAt = (Long) parcel.readValue(Long.class.getClassLoader());
        this.closeAt = (Long) parcel.readValue(Long.class.getClassLoader());
        this.closeUnderlyingPrice = (Double) parcel.readValue(Double.class.getClassLoader());
        this.openUnderlyingPrice = (Double) parcel.readValue(Double.class.getClassLoader());
        this.margin = (Double) parcel.readValue(Double.class.getClassLoader());
        this.currencyUnit = (Double) parcel.readValue(Double.class.getClassLoader());
        this.currencyRate = (Double) parcel.readValue(Double.class.getClassLoader());
        this.stopLoseOrderId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.takeProfitOrderId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.marginCall = (Double) parcel.readValue(Double.class.getClassLoader());
        this.extraData = (ExtraData) parcel.readParcelable(ExtraData.class.getClassLoader());
    }
}
