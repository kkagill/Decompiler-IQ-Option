package com.iqoption.sessions;

import com.iqoption.core.ui.Status;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aob = new int[Status.values().length];
    public static final /* synthetic */ int[] axg = new int[Status.values().length];

    static {
        aob[Status.SUCCESS.ordinal()] = 1;
        aob[Status.ERROR.ordinal()] = 2;
        aob[Status.LOADING.ordinal()] = 3;
        axg[Status.SUCCESS.ordinal()] = 1;
        axg[Status.ERROR.ordinal()] = 2;
        axg[Status.LOADING.ordinal()] = 3;
    }
}
