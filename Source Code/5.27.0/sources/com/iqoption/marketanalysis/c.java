package com.iqoption.marketanalysis;

import com.iqoption.core.marketanalysis.MarketAnalysisTab;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aob = new int[MarketAnalysisTab.values().length];
    public static final /* synthetic */ int[] axg = new int[MarketAnalysisTab.values().length];

    static {
        aob[MarketAnalysisTab.FOREX.ordinal()] = 1;
        aob[MarketAnalysisTab.EARNINGS.ordinal()] = 2;
        axg[MarketAnalysisTab.NEWS.ordinal()] = 1;
        axg[MarketAnalysisTab.FOREX.ordinal()] = 2;
        axg[MarketAnalysisTab.EARNINGS.ordinal()] = 3;
    }
}
