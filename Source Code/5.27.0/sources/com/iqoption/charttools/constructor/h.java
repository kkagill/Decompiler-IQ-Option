package com.iqoption.charttools.constructor;

import com.iqoption.charttools.model.indicator.constructor.InputItem.Type;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class h {
    public static final /* synthetic */ int[] aob = new int[Type.values().length];
    public static final /* synthetic */ int[] axg = new int[Type.values().length];

    static {
        aob[Type.BOOL.ordinal()] = 1;
        aob[Type.PLOT_VISIBILITY.ordinal()] = 2;
        aob[Type.INT.ordinal()] = 3;
        aob[Type.DOUBLE.ordinal()] = 4;
        aob[Type.STRING.ordinal()] = 5;
        aob[Type.INT_SELECTION.ordinal()] = 6;
        aob[Type.DOUBLE_SELECTION.ordinal()] = 7;
        aob[Type.STRING_SELECTION.ordinal()] = 8;
        aob[Type.COLOR.ordinal()] = 9;
        aob[Type.LINE_WIDTH.ordinal()] = 10;
        aob[Type.HOST.ordinal()] = 11;
        axg[Type.INT.ordinal()] = 1;
        axg[Type.INT_SELECTION.ordinal()] = 2;
        axg[Type.DOUBLE_SELECTION.ordinal()] = 3;
        axg[Type.STRING_SELECTION.ordinal()] = 4;
        axg[Type.LINE_WIDTH.ordinal()] = 5;
        axg[Type.HOST.ordinal()] = 6;
        axg[Type.COLOR.ordinal()] = 7;
        axg[Type.DOUBLE.ordinal()] = 8;
        axg[Type.BOOL.ordinal()] = 9;
        axg[Type.PLOT_VISIBILITY.ordinal()] = 10;
        axg[Type.ACTIVE.ordinal()] = 11;
    }
}
