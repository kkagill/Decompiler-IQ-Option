package com.iqoption.util.c;

import com.iqoption.core.data.model.ActiveType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] aob = new int[ActiveType.values().length];

    static {
        aob[ActiveType.TURBO_ACTIVE.ordinal()] = 1;
        aob[ActiveType.BINARY_ACTIVE.ordinal()] = 2;
        aob[ActiveType.MULTI_ACTIVE.ordinal()] = 3;
        aob[ActiveType.DIGITAL_ACTIVE.ordinal()] = 4;
        aob[ActiveType.FOREX_ACTIVE.ordinal()] = 5;
        aob[ActiveType.INTRADAY_ACTIVE.ordinal()] = 6;
        aob[ActiveType.CRYPTO_ACTIVE.ordinal()] = 7;
        aob[ActiveType.FX_ACTIVE.ordinal()] = 8;
        aob[ActiveType.COMMODITY_ACTIVE.ordinal()] = 9;
        aob[ActiveType.STOCK_ACTIVE.ordinal()] = 10;
        aob[ActiveType.ETF_ACTIVE.ordinal()] = 11;
        aob[ActiveType.INDEX_ACTIVE.ordinal()] = 12;
        aob[ActiveType.BOND_ACTIVE.ordinal()] = 13;
    }
}
