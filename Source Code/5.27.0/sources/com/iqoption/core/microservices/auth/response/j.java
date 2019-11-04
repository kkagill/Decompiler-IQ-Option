package com.iqoption.core.microservices.auth.response;

import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class j {
    public static final /* synthetic */ int[] aob = new int[VerifyMethod.values().length];

    static {
        aob[VerifyMethod.SMS.ordinal()] = 1;
        aob[VerifyMethod.EMAIL.ordinal()] = 2;
    }
}
