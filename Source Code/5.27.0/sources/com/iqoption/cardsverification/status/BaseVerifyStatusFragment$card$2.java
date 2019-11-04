package com.iqoption.cardsverification.status;

import android.os.Parcelable;
import com.iqoption.core.microservices.billing.verification.response.c;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "invoke"})
/* compiled from: BaseVerifyStatusFragment.kt */
final class BaseVerifyStatusFragment$card$2 extends Lambda implements a<c> {
    final /* synthetic */ a this$0;

    BaseVerifyStatusFragment$card$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: Lc */
    public final c invoke() {
        Parcelable parcelable = com.iqoption.core.ext.a.s(this.this$0).getParcelable("ARG_CARD");
        if (parcelable != null) {
            return (c) parcelable;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.billing.verification.response.VerifyCard");
    }
}
