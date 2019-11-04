package com.iqoption.dto.entity.position;

import androidx.annotation.NonNull;
import com.google.common.primitives.b;
import com.iqoption.app.managers.feature.c;
import com.iqoption.app.managers.feature.c.a;
import com.iqoption.core.d;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.entity.ActiveQuote;

final class FxMath implements a, PositionMath {
    private static final double A = 0.9d;
    private static final double B = 0.9d;
    private static final double X;
    private final double absRestriction;
    private final int activeId;
    private final String instrumentId;
    private final boolean isCall;
    private volatile boolean isRestrictedPnlEnabled;
    private volatile double lastActiveQuoteSpot = Double.NaN;
    private volatile double lastExpProfit = Double.NaN;
    private volatile double lastOptionQuoteBid = Double.NaN;
    private volatile double lastSellProfit = Double.NaN;
    private final double optionPrice;
    private final double pnlRestriction;
    private final double rate;
    private final double strikePrice;

    static {
        double doubleValue;
        if (d.Un().Dr()) {
            com.iqoption.core.microservices.features.a.a ei = d.EH().ei("fx-coefficient-x");
            if (ei != null) {
                Double bV = b.bV(ei.getStatus());
                if (bV != null) {
                    doubleValue = bV.doubleValue();
                    X = doubleValue;
                }
            }
        }
        doubleValue = 1.05d;
        X = doubleValue;
    }

    FxMath(@NonNull String str, int i, double d, double d2, boolean z, double d3, double d4, double d5) {
        this.instrumentId = str;
        this.activeId = i;
        this.pnlRestriction = d;
        this.absRestriction = d2;
        this.isCall = z;
        this.optionPrice = d3;
        this.strikePrice = d4;
        this.rate = d5;
        updateRestrictionEnabled();
        c.a((a) this);
    }

    public double getSellProfit() {
        com.iqoption.core.microservices.tradingengine.response.a c = com.iqoption.app.managers.c.GS().c(this.instrumentId, InstrumentType.FX_INSTRUMENT);
        if (c != null) {
            double f = com.iqoption.core.microservices.tradingengine.response.a.f(c);
            if (!Double.isNaN(this.lastOptionQuoteBid) && this.lastOptionQuoteBid == f) {
                return this.lastSellProfit;
            }
            double f2 = com.iqoption.core.microservices.tradingengine.response.a.f(c) - this.optionPrice;
            if (this.isRestrictedPnlEnabled) {
                f2 = convert(getRestrictedSellPnl(f2));
            } else {
                f2 = convert(f2);
            }
            f2 += getInvest();
            synchronized (this) {
                this.lastOptionQuoteBid = f;
                this.lastSellProfit = f2;
            }
            return f2;
        } else if (Double.isNaN(this.lastSellProfit)) {
            return getInvest();
        } else {
            return this.lastSellProfit;
        }
    }

    public double getExpProfit() {
        ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.activeId);
        if (dY == null) {
            return getInvest();
        }
        double val = dY.getVal();
        if (!Double.isNaN(this.lastActiveQuoteSpot) && this.lastActiveQuoteSpot == val) {
            return this.lastExpProfit;
        }
        double max;
        double d = -this.optionPrice;
        if (this.isCall) {
            max = Math.max(0.0d, val - this.strikePrice);
        } else {
            max = Math.max(0.0d, this.strikePrice - val);
        }
        d += max;
        if (this.isRestrictedPnlEnabled) {
            d = convert(getRestrictedExpPnl(d, val));
        } else {
            d = convert(d);
        }
        d += getInvest();
        synchronized (this) {
            this.lastActiveQuoteSpot = val;
            this.lastExpProfit = d;
        }
        return d;
    }

    public double getInvest() {
        return convert(this.optionPrice);
    }

    private double convert(double d) {
        return d / this.rate;
    }

    /* Access modifiers changed, original: 0000 */
    public double getRestrictedSellPnl(double d) {
        return getRestrictedPnl(d, 0.0d, 0.0d);
    }

    /* Access modifiers changed, original: 0000 */
    public double getRestrictedExpPnl(double d, double d2) {
        return getRestrictedPnl(d, f1(d, d2), f2(d, d2));
    }

    private double getRestrictedPnl(double d, double d2, double d3) {
        if (this.pnlRestriction == 0.0d && this.absRestriction == 0.0d) {
            return d;
        }
        double d4 = this.pnlRestriction;
        if (d4 == 0.0d) {
            return Math.min(d, (this.absRestriction * 0.9d) + d3);
        }
        double d5 = this.absRestriction;
        if (d5 == 0.0d) {
            return Math.min(d, ((d4 * 0.9d) * this.optionPrice) + d2);
        }
        return Math.min(d, Math.min(((d4 * 0.9d) * this.optionPrice) + d2, (d5 * 0.9d) + d3));
    }

    private double f1(double d, double d2) {
        double d3 = this.pnlRestriction;
        double d4 = 0.9d * d3;
        double d5 = this.optionPrice;
        if (d <= d4 * d5) {
            return 0.0d;
        }
        return (((d3 * 0.09999999999999998d) * d5) * Math.min(getPriceRelation(d2), X)) / X;
    }

    private double f2(double d, double d2) {
        double d3 = this.absRestriction;
        if (d <= 0.9d * d3) {
            return 0.0d;
        }
        return ((d3 * 0.09999999999999998d) * Math.min(getPriceRelation(d2), X)) / X;
    }

    private double getPriceRelation(double d) {
        if (this.isCall) {
            return d / this.strikePrice;
        }
        return this.strikePrice / d;
    }

    private void updateRestrictionEnabled() {
        com.iqoption.core.microservices.features.a.a ei = d.EH().ei("fx-option-payout-limit");
        boolean z = ei != null && ei.isEnabled();
        this.isRestrictedPnlEnabled = z;
    }

    public void onFeaturesUpdated() {
        updateRestrictionEnabled();
    }
}
