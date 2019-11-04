package com.iqoption.deposit.light.perform;

import com.iqoption.core.microservices.billing.response.deposit.d;
import com.iqoption.core.microservices.billing.response.deposit.e;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/deposit/light/presets/PresetItem;", "deposit", "Lcom/iqoption/core/microservices/billing/response/deposit/Deposit;", "invoke"})
/* compiled from: DepositPerformLightFragment.kt */
final class DepositPerformLightFragment$setPresets$items$2 extends Lambda implements b<e, com.iqoption.deposit.light.d.b> {
    final /* synthetic */ d $currency;

    DepositPerformLightFragment$setPresets$items$2(d dVar) {
        this.$currency = dVar;
        super(1);
    }

    /* renamed from: d */
    public final com.iqoption.deposit.light.d.b invoke(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "deposit");
        return new com.iqoption.deposit.light.d.b(eVar, this.$currency, false);
    }
}
