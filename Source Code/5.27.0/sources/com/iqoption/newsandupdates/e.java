package com.iqoption.newsandupdates;

import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class e {
    public static final /* synthetic */ int[] aob = new int[Type.values().length];
    public static final /* synthetic */ int[] axg = new int[Type.values().length];

    static {
        aob[Type.EMAIL.ordinal()] = 1;
        aob[Type.PUSH.ordinal()] = 2;
        aob[Type.CALL.ordinal()] = 3;
        aob[Type.THIRD_PARTY.ordinal()] = 4;
        axg[Type.EMAIL.ordinal()] = 1;
        axg[Type.PUSH.ordinal()] = 2;
        axg[Type.CALL.ordinal()] = 3;
        axg[Type.THIRD_PARTY.ordinal()] = 4;
    }
}
