package com.iqoption.earningscalendar;

import com.iqoption.core.marketanalysis.LoadingDirection;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class g {
    public static final /* synthetic */ int[] aob = new int[LoadingDirection.values().length];

    static {
        aob[LoadingDirection.UP.ordinal()] = 1;
        aob[LoadingDirection.DOWN.ordinal()] = 2;
    }
}
