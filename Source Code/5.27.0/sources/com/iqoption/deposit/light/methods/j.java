package com.iqoption.deposit.light.methods;

import com.iqoption.core.microservices.billing.response.deposit.TimeScale;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class j {
    public static final /* synthetic */ int[] aob = new int[TimeScale.values().length];

    static {
        aob[TimeScale.MINUTES.ordinal()] = 1;
        aob[TimeScale.HOURS.ordinal()] = 2;
        aob[TimeScale.DAYS.ordinal()] = 3;
    }
}
