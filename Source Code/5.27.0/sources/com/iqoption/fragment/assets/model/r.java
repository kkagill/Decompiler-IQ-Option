package com.iqoption.fragment.assets.model;

import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class r {
    public static final /* synthetic */ int[] aob = new int[InstrumentType.values().length];
    public static final /* synthetic */ int[] axg = new int[ActiveType.values().length];

    static {
        aob[InstrumentType.TURBO_INSTRUMENT.ordinal()] = 1;
        aob[InstrumentType.BINARY_INSTRUMENT.ordinal()] = 2;
        aob[InstrumentType.DIGITAL_INSTRUMENT.ordinal()] = 3;
        aob[InstrumentType.FX_INSTRUMENT.ordinal()] = 4;
        aob[InstrumentType.MULTI_INSTRUMENT.ordinal()] = 5;
        aob[InstrumentType.FOREX_INSTRUMENT.ordinal()] = 6;
        aob[InstrumentType.CFD_INSTRUMENT.ordinal()] = 7;
        aob[InstrumentType.CRYPTO_INSTRUMENT.ordinal()] = 8;
        axg[ActiveType.FOREX_ACTIVE.ordinal()] = 1;
        axg[ActiveType.INTRADAY_ACTIVE.ordinal()] = 2;
        axg[ActiveType.CRYPTO_ACTIVE.ordinal()] = 3;
    }
}
