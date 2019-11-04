package com.iqoption.charttools.tools;

import com.iqoption.charttools.tools.data.SettingType;
import com.iqoption.core.data.model.chart.ChartColor;

@kotlin.i(bne = {1, 1, 15})
public final /* synthetic */ class i {
    public static final /* synthetic */ int[] aFX = new int[ChartColor.values().length];
    public static final /* synthetic */ int[] aob = new int[SettingType.values().length];
    public static final /* synthetic */ int[] axg = new int[ToolsScreen.values().length];

    static {
        aob[SettingType.TRADERS_MOOD.ordinal()] = 1;
        aob[SettingType.LIVE_DEALS.ordinal()] = 2;
        aob[SettingType.APPLY_TO_ALL_ASSETS.ordinal()] = 3;
        aob[SettingType.VOLUME.ordinal()] = 4;
        axg[ToolsScreen.ACTIVE_TOOLS.ordinal()] = 1;
        axg[ToolsScreen.INDICATORS.ordinal()] = 2;
        axg[ToolsScreen.TEMPLATES.ordinal()] = 3;
        aFX[ChartColor.mono.ordinal()] = 1;
        aFX[ChartColor.redGreen.ordinal()] = 2;
    }
}
