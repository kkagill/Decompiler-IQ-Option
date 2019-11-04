package com.iqoption.core.data.model;

import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] aob = new int[Direction.values().length];

    static {
        aob[Direction.UNKNOWN.ordinal()] = 1;
        aob[Direction.PUT.ordinal()] = 2;
        aob[Direction.CALL.ordinal()] = 3;
    }
}
