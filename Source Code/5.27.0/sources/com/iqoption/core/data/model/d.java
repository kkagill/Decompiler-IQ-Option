package com.iqoption.core.data.model;

import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class d {
    public static final /* synthetic */ int[] aob = new int[Sign.values().length];

    static {
        aob[Sign.PLUS.ordinal()] = 1;
        aob[Sign.MINUS.ordinal()] = 2;
        aob[Sign.NONE.ordinal()] = 3;
    }
}
