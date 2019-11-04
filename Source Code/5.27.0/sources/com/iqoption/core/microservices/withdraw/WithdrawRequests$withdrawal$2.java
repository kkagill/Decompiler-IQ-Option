package com.iqoption.core.microservices.withdraw;

import com.iqoption.core.d;
import com.iqoption.core.microservices.withdraw.response.q;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawResponse;", "kotlin.jvm.PlatformType", "result", "", "invoke"})
/* compiled from: WithdrawRequests.kt */
final class WithdrawRequests$withdrawal$2 extends Lambda implements b<String, q> {
    public static final WithdrawRequests$withdrawal$2 bDO = new WithdrawRequests$withdrawal$2();

    WithdrawRequests$withdrawal$2() {
        super(1);
    }

    /* renamed from: gX */
    public final q invoke(String str) {
        kotlin.jvm.internal.i.f(str, "result");
        return (q) d.Ez().fromJson(str, q.class);
    }
}
