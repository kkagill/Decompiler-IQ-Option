package com.iqoption.deposit;

import com.iqoption.core.microservices.billing.response.deposit.e;
import java.math.BigDecimal;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001¨\u0006\u0006"}, bng = {"formatDeposit", "", "Lcom/iqoption/core/microservices/billing/response/deposit/Deposit;", "hasSameAmount", "", "amount", "deposit_release"})
/* compiled from: DepositExtesions.kt */
public final class f {
    public static final String a(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "$this$formatDeposit");
        return com.iqoption.core.util.e.a(new BigDecimal(eVar.ZC()), 0, null, true, false, null, 19, null);
    }

    public static final boolean a(e eVar, String str) {
        kotlin.jvm.internal.i.f(eVar, "$this$hasSameAmount");
        kotlin.jvm.internal.i.f(str, "amount");
        return kotlin.jvm.internal.i.y(a(eVar), str);
    }
}
