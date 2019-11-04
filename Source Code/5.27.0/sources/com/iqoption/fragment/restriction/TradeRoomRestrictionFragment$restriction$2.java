package com.iqoption.fragment.restriction;

import com.iqoption.core.microservices.kyc.response.restriction.b;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestriction;", "invoke"})
/* compiled from: TradeRoomRestrictionFragment.kt */
final class TradeRoomRestrictionFragment$restriction$2 extends Lambda implements a<b> {
    final /* synthetic */ a this$0;

    TradeRoomRestrictionFragment$restriction$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: aEY */
    public final b invoke() {
        return (b) com.iqoption.core.ext.a.s(this.this$0).getParcelable("ARG_RESTRICTION");
    }
}
