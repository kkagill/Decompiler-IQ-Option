package com.iqoption.core.util;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.features.a.c;
import kotlin.i;
import kotlin.jvm.internal.g;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, bng = {"Lcom/iqoption/core/util/CurrencyUtils;", "", "()V", "getMinMaxAmount", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "currencyName", "", "currencyMinDeal", "", "currencyMaxDeal", "(Lcom/iqoption/core/data/model/InstrumentType;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)[D", "core_release"})
/* compiled from: CurrencyUtils.kt */
public final class f {
    public static final f bQp = new f();

    private f() {
    }

    public static final double[] a(InstrumentType instrumentType, String str, Double d, Double d2) {
        double b = (instrumentType == null || str == null) ? -1.0d : c.b(instrumentType, str);
        double[] dArr = new double[2];
        dArr[0] = d != null ? d.doubleValue() : 1.0d;
        dArr[1] = d2 != null ? d2.doubleValue() : g.eWa.bnF();
        dArr[0] = Math.max(dArr[0], b);
        return dArr;
    }
}
