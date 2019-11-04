package com.iqoption.dialog.b;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.c;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.u;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.l.b;
import com.iqoption.util.ab;
import com.iqoption.util.v;

/* compiled from: LimitsCalculatedHelper */
public class a {
    private double auh;
    private Double bBY;
    private int cKA;
    private Boolean cKB;
    private Double cKC;
    private Boolean cKD;
    private boolean cKE;
    private final double cKF;
    private boolean cKy;
    private double cKz;
    private InstrumentType instrumentType;
    private int leverage;
    private Position position;

    public a(Position position) {
        this.cKy = Position.isLong(position);
        this.leverage = position.getLeverage();
        this.cKz = position.getOpenPriceEnrolled().doubleValue();
        this.cKC = position.getStopLoseValue();
        this.bBY = position.getTakeProfitValue();
        this.cKA = position.getActiveId();
        this.instrumentType = position.getInstrumentType();
        this.auh = position.getInvestSum();
        this.position = position;
        this.cKF = position.getStopOutThreshold();
    }

    public a(int i, InstrumentType instrumentType, boolean z, int i2, double d) {
        this.cKy = z;
        this.leverage = i2;
        this.cKA = i;
        this.instrumentType = instrumentType;
        this.auh = d;
        this.cKF = e(instrumentType, z ? Position.TYPE_LONG : Position.TYPE_SHORT);
    }

    public double getStopOutThreshold() {
        return this.cKF;
    }

    public boolean cV(boolean z) {
        Position position = this.position;
        return ((position != null && position.isTrailingStop()) || z) && !this.cKE;
    }

    public boolean atW() {
        Position position = this.position;
        if (position == null || !position.isTrailingStop()) {
            Boolean bool = this.cKD;
            if (bool != null ? !bool.booleanValue() : !b.aTS().Fo()) {
                return false;
            }
        }
        return true;
    }

    public void cW(boolean z) {
        this.cKD = Boolean.valueOf(z);
    }

    public double y(double d) {
        return a(d, this.cKy, this.cKz, this.leverage);
    }

    public double z(double d) {
        return b(d, this.cKy, this.cKz, this.leverage);
    }

    public boolean cX(boolean z) {
        Position position = this.position;
        if (position != null) {
            return position.isAutoMarginCall();
        }
        Boolean bool = this.cKB;
        if (bool == null) {
            return b.aTS().Fn() && z;
        } else {
            return bool.booleanValue();
        }
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public boolean isLong() {
        return this.cKy;
    }

    public int getLeverage() {
        return this.leverage;
    }

    public int atX() {
        return this.cKA;
    }

    public double getInvest() {
        return this.auh;
    }

    public Double getStopLoseValue() {
        return this.cKC;
    }

    public Double getTakeProfitValue() {
        return this.bBY;
    }

    public double atY() {
        return this.cKz;
    }

    public void cY(boolean z) {
        this.cKB = Boolean.valueOf(z);
    }

    public void cZ(boolean z) {
        this.cKE = z;
    }

    public void g(Double d) {
        this.cKz = d == null ? 0.0d : d.doubleValue();
    }

    public void h(Double d) {
        this.cKC = d;
    }

    public void i(Double d) {
        this.bBY = d;
    }

    public t<?> a(Double d, Double d2) {
        if (aub()) {
            Boolean bool = this.cKD;
            t<?> a = com.iqoption.mobbtech.connect.request.api.a.b.a(this.position.getId(), d, d2, bool == null ? this.position.isTrailingStop() : bool.booleanValue());
            Boolean bool2 = this.cKB;
            if (!(bool2 == null || bool2.equals(Boolean.valueOf(this.position.isAutoMarginCall())))) {
                a = v.a((t) a, new -$$Lambda$a$XSdsD0WtVNhKxyVfZMqA9oiFH6Y(this));
            }
            return a;
        }
        Double d3 = null;
        if (d == null) {
            d = null;
        } else {
            d = Double.valueOf(y(d.doubleValue()));
        }
        if (d2 != null) {
            d3 = Double.valueOf(y(d2.doubleValue()));
        }
        IQApp.Ex().bd(new com.iqoption.dialog.b.b.a(d, d3, this.cKB, this.cKD));
        return p.bo(Boolean.valueOf(true));
    }

    private /* synthetic */ t a(com.iqoption.core.microservices.tradingengine.response.order.b bVar) {
        return com.iqoption.mobbtech.connect.request.api.a.b.b(this.position.getId(), this.cKB.booleanValue());
    }

    @Nullable
    public Double atZ() {
        if (aub()) {
            return ActiveQuote.getCurrentSellPriceEnrolled(this.cKA, isLong(), getInstrumentType(), getLeverage());
        }
        ActiveQuote dY = c.GS().dY(this.cKA);
        if (dY == null) {
            return null;
        }
        int i = isLong() ? 1 : -1;
        double d = this.cKz;
        double spread = dY.getSpread(getInstrumentType(), getLeverage());
        double d2 = (double) i;
        Double.isNaN(d2);
        return Double.valueOf(d - (spread * d2));
    }

    @Nullable
    public Double aua() {
        return aub() ? Double.valueOf((this.position.getSellPnl() / this.auh) * 100.0d) : null;
    }

    public boolean aub() {
        return this.position != null;
    }

    public static double a(double d, boolean z, double d2, int i) {
        double d3 = (double) (z ? 1 : -1);
        Double.isNaN(d3);
        d3 *= 100.0d;
        double d4 = (double) i;
        Double.isNaN(d4);
        return ((d3 * d4) * (d - d2)) / d2;
    }

    public static double b(double d, boolean z, double d2, int i) {
        int i2 = z ? 1 : -1;
        double d3 = (double) i;
        Double.isNaN(d3);
        d = (d / d3) / 100.0d;
        d3 = (double) i2;
        Double.isNaN(d3);
        return d2 * ((d * d3) + 1.0d);
    }

    private static double e(InstrumentType instrumentType, String str) {
        com.iqoption.core.microservices.features.a.a ei = com.iqoption.app.managers.feature.c.Iw().ei("default-stop-out");
        if (ei == null || ei.ZY()) {
            return -95.0d;
        }
        return ab.Q(u.a(u.b(u.b(u.b(ei.ady(), instrumentType.toString()), str), com.iqoption.app.b.DG().Er() ? "reg" : "nonreg"), -95.0d));
    }
}
