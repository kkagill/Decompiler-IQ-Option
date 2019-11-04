package com.iqoption.deposit.light.perform;

import com.iqoption.core.microservices.billing.response.deposit.e;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "deposit", "Lcom/iqoption/core/microservices/billing/response/deposit/Deposit;", "invoke"})
/* compiled from: DepositPerformLightFragment.kt */
final class DepositPerformLightFragment$setPresets$items$1 extends Lambda implements b<e, Boolean> {
    final /* synthetic */ c this$0;

    DepositPerformLightFragment$setPresets$items$1(c cVar) {
        this.this$0 = cVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(c((e) obj));
    }

    public final boolean c(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "deposit");
        return this.this$0.f(Double.valueOf(eVar.ZC())) == null;
    }
}
