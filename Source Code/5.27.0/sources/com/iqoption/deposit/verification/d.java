package com.iqoption.deposit.verification;

import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class d {
    public static final /* synthetic */ int[] aob = new int[VerificationState.values().length];
    public static final /* synthetic */ int[] axg = new int[VerificationState.values().length];

    static {
        aob[VerificationState.IMPORTANT.ordinal()] = 1;
        aob[VerificationState.WAITING.ordinal()] = 2;
        aob[VerificationState.NEED_ADDITIONAL_ACTION.ordinal()] = 3;
        aob[VerificationState.OK.ordinal()] = 4;
        axg[VerificationState.IMPORTANT.ordinal()] = 1;
        axg[VerificationState.WAITING.ordinal()] = 2;
        axg[VerificationState.NEED_ADDITIONAL_ACTION.ordinal()] = 3;
    }
}
