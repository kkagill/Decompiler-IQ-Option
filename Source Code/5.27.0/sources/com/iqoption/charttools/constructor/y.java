package com.iqoption.charttools.constructor;

import com.iqoption.charttools.model.indicator.constructor.InputItem.Type;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class y {
    public static final /* synthetic */ int[] aFX = new int[Type.values().length];
    public static final /* synthetic */ int[] aFY = new int[Type.values().length];
    public static final /* synthetic */ int[] aob = new int[Type.values().length];
    public static final /* synthetic */ int[] axg = new int[Type.values().length];

    static {
        aob[Type.INT.ordinal()] = 1;
        aob[Type.DOUBLE.ordinal()] = 2;
        axg[Type.INT.ordinal()] = 1;
        axg[Type.DOUBLE.ordinal()] = 2;
        aFX[Type.INT.ordinal()] = 1;
        aFX[Type.DOUBLE.ordinal()] = 2;
        aFY[Type.INT.ordinal()] = 1;
        aFY[Type.DOUBLE.ordinal()] = 2;
    }
}
