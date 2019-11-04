package com.iqoption.dto.entity.position;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.iqoption.app.managers.c;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.a;
import com.iqoption.core.microservices.tradingengine.response.instrument.e;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.util.ab;

public class PositionItem implements Parcelable {
    public static final Creator<PositionItem> CREATOR = new Creator<PositionItem>() {
        public PositionItem createFromParcel(Parcel parcel) {
            return new PositionItem(parcel);
        }

        public PositionItem[] newArray(int i) {
            return new PositionItem[i];
        }
    };
    @SerializedName("buy_avg_price")
    private Double buyAvgPrice;
    @SerializedName("buy_avg_price_enrolled")
    private Double buyAvgPriceEnrolled;
    @SerializedName("close_underlying_price")
    private Double closeUnderlyingPrice;
    @SerializedName("create_at")
    private Long createAt;
    @SerializedName("instrument_active_id")
    private Integer instrumentActiveId;
    @SerializedName("instrument_dir")
    private String instrumentDir;
    @SerializedName("instrument_id")
    private String instrumentId;
    @SerializedName("instrument_strike")
    private Double instrumentStrike;
    @SerializedName("instrument_strike_value")
    private Long instrumentStrikeValue;
    @SerializedName("instrument_underlying")
    private String instrumentUderlying;
    private volatile transient double lastKnownValue;
    @SerializedName("lower_instrument_strike")
    private Long lowerInstrumentStrike;
    @SerializedName("open_underlying_price")
    private Double openUnderlyingPrice;
    @SerializedName("sell_avg_price")
    private Double sellAvgPrice;
    @SerializedName("sell_avg_price_enrolled")
    private Double sellAvgPriceEnrolled;
    @SerializedName("lower_instrument_id")
    private String spotLowerInstrumentId;
    @SerializedName("upper_instrument_id")
    private String spotUpperInstrumentId;
    @SerializedName("upper_instrument_strike")
    private Long upperInstrumentStrike;
    @SerializedName("win_status")
    private String winStatus;

    public int describeContents() {
        return 0;
    }

    public boolean isSpotOption() {
        return true;
    }

    public int getActiveId() {
        Integer num = this.instrumentActiveId;
        return num != null ? num.intValue() : -1;
    }

    public String getInstrumentId() {
        return this.instrumentId;
    }

    public String getInstrumentUderlying() {
        String str = this.instrumentUderlying;
        return str == null ? "" : str;
    }

    public double getInstrumentStrike() {
        return ab.w(this.instrumentStrike);
    }

    public long getInstrumentStrikeValue() {
        return ab.D(this.instrumentStrikeValue);
    }

    public String getDir() {
        return this.instrumentDir;
    }

    public double getCloseUnderlyingPrice() {
        return ab.w(this.closeUnderlyingPrice);
    }

    public double getOpenUnderlyingPrice() {
        return ab.w(this.openUnderlyingPrice);
    }

    public double getBuyAvgPrice() {
        return ab.w(this.buyAvgPrice);
    }

    public double getSellAvgPrice() {
        return ab.w(this.sellAvgPrice);
    }

    public double getBuyAvgPriceEnrolled() {
        return ab.w(this.buyAvgPriceEnrolled);
    }

    public double getSellAvgPriceEnrolled() {
        return ab.w(this.sellAvgPriceEnrolled);
    }

    public long getCreated() {
        Long l = this.createAt;
        if (l == null) {
            return 0;
        }
        return l.longValue() / 1000;
    }

    public String spotLowerInstrumentId() {
        String str = this.spotLowerInstrumentId;
        return str != null ? str : "";
    }

    public String spotUpperInstrumentId() {
        String str = this.spotUpperInstrumentId;
        return str != null ? str : "";
    }

    public long spotLowerInstrumentStrike() {
        return ab.D(this.lowerInstrumentStrike);
    }

    public long spotUpperInstrumentStrike() {
        return ab.D(this.upperInstrumentStrike);
    }

    public double getBidPrice(double d) {
        return ab.w(getPrice(false, d));
    }

    public double getAskPrice(double d) {
        return ab.w(getPrice(false, d));
    }

    public double getBidPriceEnrolled(double d) {
        return ab.w(getPrice(true, d));
    }

    public double getAskPriceEnrolled(double d) {
        return ab.w(getPrice(true, d));
    }

    public boolean isWin(double d) {
        this.lastKnownValue = d;
        long j = (long) (d * 1000000.0d);
        long value = (long) (getValue() * 1000000.0d);
        if (isCall()) {
            if (j > value) {
                return true;
            }
        } else if (j < value) {
            return true;
        }
        return false;
    }

    public boolean isWinLastKnowValue() {
        long j = (long) (this.lastKnownValue * 1000000.0d);
        long value = (long) (getValue() * 1000000.0d);
        if (isCall()) {
            if (j > value) {
                return true;
            }
        } else if (j < value) {
            return true;
        }
        return false;
    }

    public synchronized double getLastKnowValue() {
        return this.lastKnownValue;
    }

    public double getValue() {
        return ab.w(this.instrumentStrike);
    }

    public String createStrikeKey(long j, long j2) {
        return e.a(InstrumentType.DIGITAL_INSTRUMENT, getInstrumentUderlying(), j, getInstrumentStrikeValue(), j2, isSpotOption());
    }

    @Nullable
    public Double getPrice(boolean z, double d) {
        return calculatePriceForMultiOption(isCall(), z, d, this);
    }

    private static Double calculatePriceForMultiOption(boolean z, boolean z2, double d, PositionItem positionItem) {
        a c = c.GS().c(positionItem.spotLowerInstrumentId(), InstrumentType.DIGITAL_INSTRUMENT);
        a c2 = c.GS().c(positionItem.spotUpperInstrumentId(), InstrumentType.DIGITAL_INSTRUMENT);
        return (c == null || c2 == null) ? null : calculatePriceForMultiOption(z, z2, d, positionItem, c, c2);
    }

    private static Double calculatePriceForMultiOption(boolean z, boolean z2, double d, PositionItem positionItem, a aVar, a aVar2) {
        double instrumentStrikeValue = (double) positionItem.getInstrumentStrikeValue();
        Double.isNaN(instrumentStrikeValue);
        instrumentStrikeValue /= 1000000.0d;
        double spotLowerInstrumentStrike = (double) positionItem.spotLowerInstrumentStrike();
        Double.isNaN(spotLowerInstrumentStrike);
        spotLowerInstrumentStrike /= 1000000.0d;
        double spotUpperInstrumentStrike = (double) positionItem.spotUpperInstrumentStrike();
        Double.isNaN(spotUpperInstrumentStrike);
        spotUpperInstrumentStrike /= 1000000.0d;
        double f = a.f(aVar);
        double f2 = a.f(aVar2);
        if (spotLowerInstrumentStrike != instrumentStrikeValue) {
            if (spotLowerInstrumentStrike > instrumentStrikeValue || instrumentStrikeValue > spotUpperInstrumentStrike) {
                aVar = c.GS().c(positionItem.getInstrumentId(), InstrumentType.DIGITAL_INSTRUMENT);
                ActiveQuote dY = c.GS().dY(positionItem.getActiveId());
                if (aVar == null || dY == null) {
                    return null;
                }
                spotUpperInstrumentStrike = dY.getVal();
                f2 = a.f(aVar);
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
        f /= positionItem.getBuyAvgPrice();
        if (z2) {
            return Double.valueOf(f);
        }
        return Double.valueOf(getConvertedPriceInCurrencyPosition(Double.valueOf(f), d));
    }

    private static double getConvertedPriceInCurrencyPosition(Double d, double d2) {
        return d == null ? 0.0d : d.doubleValue() / d2;
    }

    public int isCallInt() {
        return isCall();
    }

    public boolean isCall() {
        return NotificationCompat.CATEGORY_CALL.equalsIgnoreCase(this.instrumentDir);
    }

    public String getStatus() {
        String str = this.winStatus;
        return str == null ? "" : str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.instrumentActiveId);
        parcel.writeString(this.instrumentId);
        parcel.writeString(this.instrumentUderlying);
        parcel.writeValue(this.instrumentStrike);
        parcel.writeValue(this.instrumentStrikeValue);
        parcel.writeString(this.instrumentDir);
        parcel.writeValue(this.closeUnderlyingPrice);
        parcel.writeValue(this.openUnderlyingPrice);
        parcel.writeValue(this.buyAvgPrice);
        parcel.writeValue(this.buyAvgPriceEnrolled);
        parcel.writeValue(this.sellAvgPrice);
        parcel.writeValue(this.sellAvgPriceEnrolled);
        parcel.writeValue(this.createAt);
        parcel.writeString(this.spotLowerInstrumentId);
        parcel.writeString(this.spotUpperInstrumentId);
        parcel.writeValue(this.lowerInstrumentStrike);
        parcel.writeValue(this.upperInstrumentStrike);
    }

    protected PositionItem(Parcel parcel) {
        this.instrumentActiveId = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.instrumentId = parcel.readString();
        this.instrumentUderlying = parcel.readString();
        this.instrumentStrike = (Double) parcel.readValue(Double.class.getClassLoader());
        this.instrumentStrikeValue = (Long) parcel.readValue(Long.class.getClassLoader());
        this.instrumentDir = parcel.readString();
        this.closeUnderlyingPrice = (Double) parcel.readValue(Double.class.getClassLoader());
        this.openUnderlyingPrice = (Double) parcel.readValue(Double.class.getClassLoader());
        this.buyAvgPrice = (Double) parcel.readValue(Double.class.getClassLoader());
        this.buyAvgPriceEnrolled = (Double) parcel.readValue(Double.class.getClassLoader());
        this.sellAvgPrice = (Double) parcel.readValue(Double.class.getClassLoader());
        this.sellAvgPriceEnrolled = (Double) parcel.readValue(Double.class.getClassLoader());
        this.createAt = (Long) parcel.readValue(Long.class.getClassLoader());
        this.spotLowerInstrumentId = parcel.readString();
        this.spotUpperInstrumentId = parcel.readString();
        this.lowerInstrumentStrike = (Long) parcel.readValue(Long.class.getClassLoader());
        this.upperInstrumentStrike = (Long) parcel.readValue(Long.class.getClassLoader());
    }
}
