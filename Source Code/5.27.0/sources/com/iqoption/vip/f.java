package com.iqoption.vip;

import com.iqoption.util.Status;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class f {
    public static final /* synthetic */ int[] aob = new int[Status.values().length];

    static {
        aob[Status.SUCCESS.ordinal()] = 1;
        aob[Status.ERROR.ordinal()] = 2;
        aob[Status.LOADING.ordinal()] = 3;
    }
}
