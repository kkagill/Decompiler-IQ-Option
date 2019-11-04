package com.iqoption.dto.entity.position;

import androidx.annotation.NonNull;
import com.iqoption.app.managers.c;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.a;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.util.j;

public final class DigitalMath implements PositionMath {
    private final int activeId;
    private final String instrumentId;
    private final boolean isCall;
    private final double optionPrice;
    private final double rate;
    private final double strikePrice;

    public DigitalMath(@NonNull String str, int i, boolean z, double d, double d2, double d3) {
        this.instrumentId = str;
        this.activeId = i;
        this.isCall = z;
        this.optionPrice = d;
        this.strikePrice = d2;
        this.rate = d3;
    }

    public double getSellProfit() {
        a c = c.GS().c(this.instrumentId, InstrumentType.DIGITAL_INSTRUMENT);
        if (c == null) {
            return getInvest();
        }
        return convert(a.f(c));
    }

    public double getExpProfit() {
        ActiveQuote dY = c.GS().dY(this.activeId);
        if (dY == null) {
            return getInvest();
        }
        double val = dY.getVal();
        double doubleValue = j.v(Double.valueOf(100.0d)).doubleValue();
        double d;
        if (this.isCall) {
            d = this.strikePrice;
            if (val <= d) {
                if (val < d) {
                    doubleValue = 0.0d;
                } else {
                    doubleValue = getInvest();
                }
            }
            return doubleValue;
        }
        d = this.strikePrice;
        if (val >= d) {
            if (val > d) {
                doubleValue = 0.0d;
            } else {
                doubleValue = getInvest();
            }
        }
        return doubleValue;
    }

    public double getInvest() {
        return this.optionPrice;
    }

    private double convert(double d) {
        return d / this.rate;
    }
}
