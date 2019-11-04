package com.iqoption.mobbtech.connect.response;

import androidx.core.app.NotificationCompat;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.s;
import com.google.gson.annotations.Expose;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.mobbtech.connect.response.options.d;

/* compiled from: BuyBackData */
public class c extends b {
    private static final String TAG = "com.iqoption.mobbtech.connect.response.c";
    public Integer activeId;
    public Long dIM;
    @Expose(deserialize = false, serialize = false)
    public transient ImmutableSortedMap<Integer, Double> dIN;
    public Integer optionTypeId;

    public static Double a(com.iqoption.mobbtech.connect.response.options.c cVar, Double d, c cVar2, int i, int i2, int i3) {
        boolean equals = NotificationCompat.CATEGORY_CALL.equals(cVar.getDir());
        double doubleValue = (d.doubleValue() - cVar.getValue()) * 1000000.0d;
        int i4 = (int) (10000.0d * doubleValue);
        if ((i4 <= 0 || !equals) && (i4 >= 0 || equals) ? i4 <= 0 : i4 >= 0) {
            doubleValue = -doubleValue;
        }
        double d2 = (double) i;
        Double.isNaN(d2);
        double floor = Math.floor(doubleValue / d2);
        Double.isNaN(d2);
        i4 = (int) (d2 * floor);
        if (i4 < i2) {
            i4 = i2;
        }
        if (i4 > i3) {
            i4 = i3;
        }
        return (Double) cVar2.dIN.get(Integer.valueOf(i4));
    }

    public Double a(com.iqoption.mobbtech.connect.response.options.c cVar, double d, double d2) {
        if (this.dIN.size() < 2) {
            return null;
        }
        Iterable ts = this.dIN.ta();
        return Double.valueOf((d2 * a(cVar, Double.valueOf(d), this, Math.abs(((Integer) this.dIN.firstKey()).intValue() - ((Integer) s.a(ts, 1)).intValue()), ((Integer) ts.first()).intValue(), ((Integer) ts.last()).intValue()).doubleValue()) / 100.0d);
    }

    public d getOptionKey() {
        return new d(this.dIM, this.activeId, a.eZ(this.optionTypeId.intValue()));
    }
}
