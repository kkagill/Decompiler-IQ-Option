package com.iqoption.kyc.questionnaire.governance;

import android.os.Parcelable;
import com.iqoption.core.microservices.kyc.response.step.c;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "invoke"})
/* compiled from: KycGovernanceErrorFragment.kt */
final class KycGovernanceErrorFragment$step$2 extends Lambda implements a<c> {
    final /* synthetic */ a this$0;

    KycGovernanceErrorFragment$step$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: aKO */
    public final c invoke() {
        Parcelable parcelable = com.iqoption.core.ext.a.s(this.this$0).getParcelable("ARG_STEP");
        if (parcelable != null) {
            return (c) parcelable;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.kyc.response.step.KycCustomerStep");
    }
}
