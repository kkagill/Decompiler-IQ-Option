package com.iqoption.deposit.web;

import android.os.Parcelable;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/deposit/DepositParams;", "invoke"})
/* compiled from: BaseRedirectWebPaymentFragment.kt */
final class BaseRedirectWebPaymentFragment$depositParams$2 extends Lambda implements a<com.iqoption.deposit.i> {
    final /* synthetic */ a this$0;

    BaseRedirectWebPaymentFragment$depositParams$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: arf */
    public final com.iqoption.deposit.i invoke() {
        Parcelable parcelable = com.iqoption.core.ext.a.s(this.this$0).getParcelable("ARG_DEPOSIT_PARAMS");
        if (parcelable != null) {
            return (com.iqoption.deposit.i) parcelable;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.deposit.DepositParams");
    }
}
