package com.iqoption.kyc;

import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.core.microservices.kyc.response.step.c;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H&\u0001\u0002\n\u000b¨\u0006\f"}, bng = {"Lcom/iqoption/kyc/StepInvoke;", "", "()V", "getStepToOpen", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "editableSteps", "", "onlyScreen", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "startSteps", "Lcom/iqoption/kyc/ParticularStepInvoke;", "Lcom/iqoption/kyc/NextStepInvoke;", "kyc_release"})
/* compiled from: StepInvoke.kt */
public abstract class p {
    public abstract c a(List<c> list, KycStepType kycStepType, List<? extends KycStepType> list2);

    private p() {
    }

    public /* synthetic */ p(f fVar) {
        this();
    }
}
