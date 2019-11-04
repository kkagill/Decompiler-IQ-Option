package com.iqoption.dto.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iqoption.app.managers.c;
import com.iqoption.asset.c.a;
import com.iqoption.asset.c.b;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.util.j;
import java.util.Objects;

public final class ActiveQuote {
    public static final String PHASE_CLOSED = "C";
    public static final String PHASE_CLOSING_AUCTION = "A";
    public static final String PHASE_INTRADAY_AUCTION = "I";
    public static final String PHASE_OPENING_AUCTION = "P";
    public static final String PHASE_TRADING = "T";
    public static final String PHASE_UNKNOWN = "U";
    private final int activeId;
    private volatile double ask;
    private volatile double bid;
    private final a markupCalculator = new a();
    private volatile String phase;
    private volatile double val;

    public ActiveQuote(int i, double d, double d2, double d3, int i2, String str) {
        this.activeId = i;
        this.val = d;
        this.bid = d2;
        this.ask = d3;
        this.phase = str;
        this.markupCalculator.init(i2);
    }

    public int getActiveId() {
        return this.activeId;
    }

    public double getVal() {
        return this.val;
    }

    public double getBid(InstrumentType instrumentType, int i) {
        a aVar = this.markupCalculator;
        aVar.init(aVar.getPrecision());
        return this.markupCalculator.d(this.bid, this.ask, getMarkup(instrumentType, i));
    }

    public double getAsk(InstrumentType instrumentType, int i) {
        a aVar = this.markupCalculator;
        aVar.init(aVar.getPrecision());
        return this.markupCalculator.e(this.bid, this.ask, getMarkup(instrumentType, i));
    }

    private double getMarkup(InstrumentType instrumentType, int i) {
        return b.axz.b(this.activeId, instrumentType, i).getValue();
    }

    public double getSpread(InstrumentType instrumentType, int i) {
        return getAsk(instrumentType, i) - getBid(instrumentType, i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActiveQuote activeQuote = (ActiveQuote) obj;
        if (!(this.activeId == activeQuote.activeId && Double.compare(activeQuote.val, this.val) == 0 && Double.compare(activeQuote.bid, this.bid) == 0 && Double.compare(activeQuote.ask, this.ask) == 0 && Objects.equals(this.phase, activeQuote.phase))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.activeId), Double.valueOf(this.val), Double.valueOf(this.bid), Double.valueOf(this.ask), this.phase});
    }

    public double getBidPrice(InstrumentType instrumentType, int i) {
        return getConvertedBidPrice(this, instrumentType, i).doubleValue();
    }

    public double getAskPrice(InstrumentType instrumentType, int i) {
        return getConvertedAskPrice(this, instrumentType, i).doubleValue();
    }

    public String getPhase() {
        return this.phase;
    }

    private static Double getConvertedBidPrice(@NonNull ActiveQuote activeQuote, InstrumentType instrumentType, int i) {
        return j.v(Double.valueOf(activeQuote.getBid(instrumentType, i)));
    }

    private static Double getConvertedAskPrice(@NonNull ActiveQuote activeQuote, InstrumentType instrumentType, int i) {
        return j.v(Double.valueOf(activeQuote.getAsk(instrumentType, i)));
    }

    public void update(double d, double d2, double d3, String str) {
        this.val = d;
        this.bid = d2;
        this.ask = d3;
        this.phase = str;
        this.markupCalculator.reset();
    }

    @Nullable
    public static Double getCurrentSellPriceEnrolled(int i, boolean z, InstrumentType instrumentType, int i2) {
        ActiveQuote dY = c.GS().dY(i);
        if (dY == null) {
            return null;
        }
        return Double.valueOf(z ? dY.getBid(instrumentType, i2) : dY.getAsk(instrumentType, i2));
    }

    @Nullable
    public static Double getCurrentOpenPriceEnrolled(int i, boolean z, InstrumentType instrumentType, int i2) {
        ActiveQuote dY = c.GS().dY(i);
        if (dY == null) {
            return null;
        }
        return Double.valueOf(z ? dY.getAsk(instrumentType, i2) : dY.getBid(instrumentType, i2));
    }
}
