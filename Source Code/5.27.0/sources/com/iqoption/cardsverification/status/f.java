package com.iqoption.cardsverification.status;

import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class f {
    public static final /* synthetic */ int[] aob = new int[CardSide.values().length];
    public static final /* synthetic */ int[] axg = new int[CardSide.values().length];

    static {
        aob[CardSide.FRONT.ordinal()] = 1;
        aob[CardSide.BACK.ordinal()] = 2;
        axg[CardSide.FRONT.ordinal()] = 1;
        axg[CardSide.BACK.ordinal()] = 2;
        axg[CardSide.NONE.ordinal()] = 3;
    }
}
