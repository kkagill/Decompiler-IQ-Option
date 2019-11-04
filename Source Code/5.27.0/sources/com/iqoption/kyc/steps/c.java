package com.iqoption.kyc.steps;

import com.iqoption.core.microservices.kyc.response.step.KycStepState;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aob = new int[KycStepState.values().length];
    public static final /* synthetic */ int[] axg = new int[KycStepState.values().length];

    static {
        aob[KycStepState.PASSED.ordinal()] = 1;
        aob[KycStepState.PENDING.ordinal()] = 2;
        aob[KycStepState.DECLINED.ordinal()] = 3;
        aob[KycStepState.SKIPPED.ordinal()] = 4;
        aob[KycStepState.NOT_FILLED.ordinal()] = 5;
        aob[KycStepState.NEED_ACTION.ordinal()] = 6;
        aob[KycStepState.UNKNOWN.ordinal()] = 7;
        axg[KycStepState.PASSED.ordinal()] = 1;
        axg[KycStepState.PENDING.ordinal()] = 2;
        axg[KycStepState.SKIPPED.ordinal()] = 3;
    }
}
