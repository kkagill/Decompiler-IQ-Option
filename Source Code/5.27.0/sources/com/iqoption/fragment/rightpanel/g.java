package com.iqoption.fragment.rightpanel;

import com.google.common.base.Suppliers;
import com.google.common.base.n;
import java.util.Date;

/* compiled from: DateSupplier */
final class g {
    private final n<Date> dne = Suppliers.a(-$$Lambda$Oj6ck5fIxyKIorLOzAt4Qi_CtiA.INSTANCE);

    g() {
    }

    /* Access modifiers changed, original: 0000 */
    public Date bN(long j) {
        Date date = (Date) this.dne.get();
        date.setTime(j);
        return date;
    }
}
