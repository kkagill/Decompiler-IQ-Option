package com.iqoption.signals;

import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class u {
    public static final /* synthetic */ int[] aob = new int[SignalFilter.values().length];

    static {
        aob[SignalFilter.ALL.ordinal()] = 1;
        aob[SignalFilter.GAP.ordinal()] = 2;
        aob[SignalFilter.SHARP_JUMP.ordinal()] = 3;
    }
}
