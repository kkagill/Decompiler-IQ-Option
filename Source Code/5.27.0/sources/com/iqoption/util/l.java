package com.iqoption.util;

import com.iqoption.core.microservices.risks.response.overnightfee.OvernightDay;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class l {
    public static final /* synthetic */ int[] aob = new int[OvernightDay.values().length];

    static {
        aob[OvernightDay.MON.ordinal()] = 1;
        aob[OvernightDay.TUE.ordinal()] = 2;
        aob[OvernightDay.WED.ordinal()] = 3;
        aob[OvernightDay.THU.ordinal()] = 4;
        aob[OvernightDay.FRI.ordinal()] = 5;
        aob[OvernightDay.SAT.ordinal()] = 6;
        aob[OvernightDay.SUN.ordinal()] = 7;
    }
}
