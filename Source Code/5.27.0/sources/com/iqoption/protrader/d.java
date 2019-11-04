package com.iqoption.protrader;

import com.iqoption.microservice.regulators.response.StatusType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class d {
    public static final /* synthetic */ int[] aFX = new int[StatusType.values().length];
    public static final /* synthetic */ int[] aob = new int[StatusType.values().length];
    public static final /* synthetic */ int[] axg = new int[StatusType.values().length];

    static {
        aob[StatusType.APPROVED.ordinal()] = 1;
        aob[StatusType.DECLINED.ordinal()] = 2;
        axg[StatusType.APPROVED.ordinal()] = 1;
        axg[StatusType.DECLINED.ordinal()] = 2;
        aFX[StatusType.APPROVED.ordinal()] = 1;
        aFX[StatusType.DECLINED.ordinal()] = 2;
    }
}
