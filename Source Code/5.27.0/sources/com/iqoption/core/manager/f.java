package com.iqoption.core.manager;

import com.iqoption.core.microservices.auth.response.VerifyMethod;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class f {
    public static final /* synthetic */ int[] aob = new int[VerifyMethod.values().length];

    static {
        aob[VerifyMethod.EMAIL.ordinal()] = 1;
        aob[VerifyMethod.SMS.ordinal()] = 2;
    }
}
