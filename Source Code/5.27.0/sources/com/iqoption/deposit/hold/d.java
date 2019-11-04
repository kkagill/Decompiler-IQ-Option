package com.iqoption.deposit.hold;

import com.iqoption.deposit.verification.VerificationState;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class d {
    public static final /* synthetic */ int[] aob = new int[VerificationState.values().length];

    static {
        aob[VerificationState.WAITING.ordinal()] = 1;
        aob[VerificationState.OK.ordinal()] = 2;
    }
}
