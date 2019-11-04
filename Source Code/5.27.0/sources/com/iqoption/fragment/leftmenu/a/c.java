package com.iqoption.fragment.leftmenu.a;

import com.iqoption.microservice.regulators.response.StatusType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aFX = new int[StatusType.values().length];
    public static final /* synthetic */ int[] aFY = new int[StatusType.values().length];
    public static final /* synthetic */ int[] aob = new int[StatusType.values().length];
    public static final /* synthetic */ int[] axg = new int[StatusType.values().length];
    public static final /* synthetic */ int[] bjZ = new int[StatusType.values().length];

    static {
        aob[StatusType.DECLINED.ordinal()] = 1;
        aob[StatusType.PENDING.ordinal()] = 2;
        aob[StatusType.APPROVED.ordinal()] = 3;
        axg[StatusType.DECLINED.ordinal()] = 1;
        axg[StatusType.PENDING.ordinal()] = 2;
        axg[StatusType.APPROVED.ordinal()] = 3;
        aFX[StatusType.PENDING.ordinal()] = 1;
        aFX[StatusType.DECLINED.ordinal()] = 2;
        aFY[StatusType.DECLINED.ordinal()] = 1;
        bjZ[StatusType.PENDING.ordinal()] = 1;
        bjZ[StatusType.DECLINED.ordinal()] = 2;
    }
}
