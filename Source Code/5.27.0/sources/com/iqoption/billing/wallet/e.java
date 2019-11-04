package com.iqoption.billing.wallet;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0004"}, bng = {"MICROS", "Ljava/math/BigDecimal;", "microsToString", "", "billing_release"})
/* compiled from: WalletPaymentsUtil.kt */
public final class e {
    private static final BigDecimal azN = new BigDecimal(1000000.0d);

    public static final String a(BigDecimal bigDecimal) {
        kotlin.jvm.internal.i.f(bigDecimal, "$this$microsToString");
        String bigDecimal2 = bigDecimal.divide(azN).setScale(2, RoundingMode.HALF_EVEN).toString();
        kotlin.jvm.internal.i.e(bigDecimal2, "divide(MICROS)\n        .…EVEN)\n        .toString()");
        return bigDecimal2;
    }
}
