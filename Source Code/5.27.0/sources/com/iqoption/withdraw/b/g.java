package com.iqoption.withdraw.b;

import com.iqoption.core.microservices.withdraw.response.Status;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class g {
    public static final /* synthetic */ int[] aob = new int[Status.values().length];

    static {
        aob[Status.FAILED.ordinal()] = 1;
        aob[Status.PROCESSING_FAILED.ordinal()] = 2;
        aob[Status.DECLINED.ordinal()] = 3;
        aob[Status.CANCELED.ordinal()] = 4;
        aob[Status.CANCEL_PROCESSING.ordinal()] = 5;
    }
}
