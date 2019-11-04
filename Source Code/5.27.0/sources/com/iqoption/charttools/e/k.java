package com.iqoption.charttools.e;

import com.iqoption.core.data.model.chart.ChartColor;
import com.iqoption.core.data.model.chart.ChartType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class k {
    public static final /* synthetic */ int[] aob = new int[ChartColor.values().length];
    public static final /* synthetic */ int[] axg = new int[ChartType.values().length];

    static {
        aob[ChartColor.mono.ordinal()] = 1;
        aob[ChartColor.redGreen.ordinal()] = 2;
        axg[ChartType.zone.ordinal()] = 1;
        axg[ChartType.linear.ordinal()] = 2;
        axg[ChartType.candles.ordinal()] = 3;
        axg[ChartType.bar.ordinal()] = 4;
    }
}
