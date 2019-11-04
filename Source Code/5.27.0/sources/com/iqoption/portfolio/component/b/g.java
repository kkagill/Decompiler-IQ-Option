package com.iqoption.portfolio.component.b;

import androidx.annotation.Nullable;
import com.iqoption.core.d;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dialog.b.a;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.util.ab;

/* compiled from: OpenCfdItem */
public class g extends j<Position> {
    public int asd() {
        return 3;
    }

    public g(i iVar, Position position) {
        super(iVar, position);
    }

    public double getSelfMarginCall() {
        return ((Position) this.dNg).getSelfMarginCall();
    }

    public int N(double d) {
        Double marginCallOpt = ((Position) this.dNg).getMarginCallOpt();
        if (marginCallOpt == null) {
            d = ((Position) this.dNg).getStopOutThreshold();
        } else {
            d = ((Position) this.dNg).getStopOutThreshold() - ab.j(d, marginCallOpt.doubleValue());
        }
        return (int) Math.round(d);
    }

    @Nullable
    public Double aRq() {
        return ((Position) this.dNg).getStopLoseValue();
    }

    @Nullable
    public Double aRr() {
        return ((Position) this.dNg).getTakeProfitValue();
    }

    public int n(Double d) {
        return (int) Math.round(a.a(d.doubleValue(), ((Position) this.dNg).isLong(), ((Position) this.dNg).getOpenPriceEnrolled().doubleValue(), ((Position) this.dNg).getLeverage()));
    }

    public int o(Double d) {
        return (int) Math.round(a.a(d.doubleValue(), ((Position) this.dNg).isLong(), ((Position) this.dNg).getOpenPriceEnrolled().doubleValue(), ((Position) this.dNg).getLeverage()));
    }

    public int getMultiplier() {
        return ((Position) this.dNg).getLeverage();
    }

    public boolean aRs() {
        com.iqoption.core.microservices.tradingengine.response.active.a Jt = Jt();
        return Jt != null && Jt.getInstrumentType() == InstrumentType.CRYPTO_INSTRUMENT;
    }

    public Double getCommission() {
        Double commission = ((Position) this.dNg).getCommission();
        if (commission == null) {
            return null;
        }
        double g = ab.g(commission.doubleValue(), 2);
        if (com.google.common.c.a.b(0.0d, g, 0.001d)) {
            return null;
        }
        return Double.valueOf(g);
    }

    public Double getSwap() {
        Double swap = ((Position) this.dNg).getSwap();
        if (swap == null || com.google.common.c.a.b(0.0d, swap.doubleValue(), 0.001d)) {
            return null;
        }
        return swap;
    }

    public double aRt() {
        return ((Position) this.dNg).getCustodial();
    }

    public boolean aRu() {
        com.iqoption.core.microservices.tradingengine.response.active.a Jt = Jt();
        return Jt != null && com.iqoption.util.c.a.z(Jt);
    }

    public boolean aRv() {
        return aRs() && getMultiplier() == 1 && d.EH().ej("custodial-fee");
    }
}
