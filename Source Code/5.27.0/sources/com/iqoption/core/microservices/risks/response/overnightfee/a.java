package com.iqoption.core.microservices.risks.response.overnightfee;

import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class a {
    public static final /* synthetic */ int[] aob = new int[OvernightDay.values().length];

    static {
        aob[OvernightDay.SUN.ordinal()] = 1;
        aob[OvernightDay.MON.ordinal()] = 2;
        aob[OvernightDay.TUE.ordinal()] = 3;
        aob[OvernightDay.WED.ordinal()] = 4;
        aob[OvernightDay.THU.ordinal()] = 5;
        aob[OvernightDay.FRI.ordinal()] = 6;
        aob[OvernightDay.SAT.ordinal()] = 7;
    }
}
