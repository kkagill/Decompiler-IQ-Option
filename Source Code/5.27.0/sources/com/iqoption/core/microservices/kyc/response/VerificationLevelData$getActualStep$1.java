package com.iqoption.core.microservices.kyc.response;

import com.iqoption.core.microservices.kyc.response.step.c;
import com.iqoption.core.microservices.kyc.response.step.d;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "invoke"})
/* compiled from: VerificationLevelData.kt */
final class VerificationLevelData$getActualStep$1 extends Lambda implements b<c, Boolean> {
    public static final VerificationLevelData$getActualStep$1 buP = new VerificationLevelData$getActualStep$1();

    VerificationLevelData$getActualStep$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((c) obj));
    }

    public final boolean a(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "it");
        return d.afK().contains(cVar.afH());
    }
}
