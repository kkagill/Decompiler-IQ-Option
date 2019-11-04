package com.iqoption.fragment.rightpanel;

import com.iqoption.app.b;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Currencies;
import com.iqoption.dto.Currencies.ConversionCurrency;
import com.iqoption.util.j;

/* compiled from: TotalCommissionCalculator */
public class t {
    public double a(double d, a aVar, boolean z) {
        if (aVar == null || !com.iqoption.app.helpers.a.Gs().d(aVar.getInstrumentType())) {
            return d;
        }
        double d2;
        com.iqoption.core.microservices.tradingengine.response.a.a a = com.iqoption.app.helpers.a.Gs().a(aVar.getInstrumentType(), Integer.valueOf(aVar.getActiveId()));
        if (a == null) {
            d2 = 0.0d;
        } else {
            d2 = a.c(d, j.aWI().doubleValue());
        }
        if (com.google.common.c.a.b(0.0d, d2, 0.001d)) {
            return d;
        }
        if (z) {
            b DG = b.DG();
            Balance DM = DG.DM();
            ConversionCurrency DQ = DG.DQ();
            ConversionCurrency du = DG.du(Currencies.OTN_CURRENCY);
            double doubleValue = j.b(DQ).doubleValue();
            double doubleValue2 = j.b(j.c(Double.valueOf(Balance.getBalanceValue(DM)), Double.valueOf(j.b(du).doubleValue())), Double.valueOf(doubleValue)).doubleValue() - d2;
            if (doubleValue2 < 0.0d) {
                return d + Math.abs(doubleValue2);
            }
        }
        return d + d2;
    }
}
