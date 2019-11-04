package com.iqoption.deposit.card;

import com.iqoption.core.ui.Status;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class g {
    public static final /* synthetic */ int[] aob = new int[Status.values().length];

    static {
        aob[Status.LOADING.ordinal()] = 1;
        aob[Status.ERROR.ordinal()] = 2;
        aob[Status.SUCCESS.ordinal()] = 3;
    }
}
