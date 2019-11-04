package com.iqoption.core.microservices.withdraw;

import com.iqoption.core.microservices.withdraw.response.d;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/withdraw/response/Card;", "kotlin.jvm.PlatformType", "result", "", "invoke"})
/* compiled from: WithdrawRequests.kt */
final class WithdrawRequests$getCards$1 extends Lambda implements b<String, List<? extends d>> {
    public static final WithdrawRequests$getCards$1 bDM = new WithdrawRequests$getCards$1();

    WithdrawRequests$getCards$1() {
        super(1);
    }

    /* renamed from: gw */
    public final List<d> invoke(String str) {
        kotlin.jvm.internal.i.f(str, "result");
        return (List) com.iqoption.core.d.Ez().fromJson(str, a.boI);
    }
}
