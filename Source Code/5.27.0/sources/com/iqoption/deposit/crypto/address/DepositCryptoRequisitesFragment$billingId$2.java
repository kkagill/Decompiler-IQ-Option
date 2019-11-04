package com.iqoption.deposit.crypto.address;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: DepositCryptoRequisitesFragment.kt */
final class DepositCryptoRequisitesFragment$billingId$2 extends Lambda implements a<Long> {
    final /* synthetic */ a this$0;

    DepositCryptoRequisitesFragment$billingId$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return Long.valueOf(aqC());
    }

    public final long aqC() {
        return com.iqoption.core.ext.a.s(this.this$0).getLong("ARG_BILLING_ID");
    }
}
