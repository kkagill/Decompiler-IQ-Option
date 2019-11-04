package com.iqoption.portfolio.component.b;

import androidx.annotation.NonNull;
import com.iqoption.app.b;
import com.iqoption.app.managers.c;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.dto.Currencies.ConversionCurrency;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.util.j;

/* compiled from: PendingItem */
public final class m implements k {
    private final a anF;
    private final String bIH;
    private final Order cVP;
    private double dNe = -1.0d;

    public static String s(Order order) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("pendingItem:");
        stringBuilder.append(order.getId());
        return stringBuilder.toString();
    }

    public m(l lVar, Order order) {
        this.cVP = order;
        this.bIH = s(order);
        this.anF = lVar.Jt();
    }

    @NonNull
    public String Or() {
        return this.bIH;
    }

    public int asd() {
        return Order.ON_MKT_OPEN.equals(this.cVP.getType()) ? 6 : 3;
    }

    public a Jt() {
        return this.anF;
    }

    public boolean isCall() {
        return Order.BUY.equalsIgnoreCase(this.cVP.getSide());
    }

    public boolean aRs() {
        return this.anF.getInstrumentType() == InstrumentType.CRYPTO_INSTRUMENT;
    }

    public double aRN() {
        return this.cVP.getPendingPrice();
    }

    public long getCreateTime() {
        return this.cVP.getCreateTime();
    }

    public double getInvestment() {
        return this.cVP.getInvestment();
    }

    public double aRD() {
        if (this.dNe == -1.0d) {
            ConversionCurrency DQ = b.DG().DQ();
            if (DQ == null) {
                this.dNe = 0.0d;
            } else {
                this.dNe = j.c(Double.valueOf(getInvestment()), j.b(DQ)).doubleValue() / aRN();
            }
        }
        return this.dNe;
    }

    public int getMultiplier() {
        return this.cVP.getLeverage();
    }

    public Double aRO() {
        ActiveQuote dY = c.GS().dY(this.anF.getActiveId());
        if (dY == null) {
            return null;
        }
        double ask;
        if (isCall()) {
            ask = dY.getAsk(this.cVP.getInstrumentType(), this.cVP.getLeverage());
        } else {
            ask = dY.getBid(this.cVP.getInstrumentType(), this.cVP.getLeverage());
        }
        return Double.valueOf(ask);
    }

    public Double aRr() {
        return this.cVP.getTakeProfitPrice();
    }

    public Double aRq() {
        return this.cVP.getStopLosePrice();
    }

    public int o(Double d) {
        return (int) Math.round(com.iqoption.dialog.b.a.a(d.doubleValue(), isCall(), this.cVP.getPendingPrice(), this.cVP.getLeverage()));
    }

    public int n(Double d) {
        return (int) Math.round(com.iqoption.dialog.b.a.a(d.doubleValue(), isCall(), this.cVP.getPendingPrice(), this.cVP.getLeverage()));
    }

    public String adZ() {
        return com.iqoption.util.c.a.C(this.anF);
    }

    public Order aRP() {
        return this.cVP;
    }
}
