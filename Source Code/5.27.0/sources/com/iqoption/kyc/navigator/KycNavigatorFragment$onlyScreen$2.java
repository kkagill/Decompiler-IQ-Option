package com.iqoption.kyc.navigator;

import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "invoke"})
/* compiled from: KycNavigatorFragment.kt */
final class KycNavigatorFragment$onlyScreen$2 extends Lambda implements a<KycStepType> {
    final /* synthetic */ a this$0;

    KycNavigatorFragment$onlyScreen$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: aLJ */
    public final KycStepType invoke() {
        return (KycStepType) com.iqoption.core.ext.a.s(this.this$0).getSerializable("ARG_NAV_ONLY_SCREEN");
    }
}
