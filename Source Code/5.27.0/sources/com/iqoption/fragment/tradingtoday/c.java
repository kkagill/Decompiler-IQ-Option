package com.iqoption.fragment.tradingtoday;

import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aob = new int[PopularType.values().length];

    static {
        aob[PopularType.BEST_PROFITABILITY.ordinal()] = 1;
        aob[PopularType.MOST_POPULAR.ordinal()] = 2;
        aob[PopularType.TOP_GAINERS.ordinal()] = 3;
        aob[PopularType.TOP_LOSERS.ordinal()] = 4;
        aob[PopularType.LOWEST_SPREAD.ordinal()] = 5;
        aob[PopularType.BIG_MOVERS.ordinal()] = 6;
    }
}
