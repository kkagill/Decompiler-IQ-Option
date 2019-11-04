package com.iqoption.core.data.model;

import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aob = new int[InstrumentType.values().length];

    static {
        aob[InstrumentType.TURBO_INSTRUMENT.ordinal()] = 1;
        aob[InstrumentType.BINARY_INSTRUMENT.ordinal()] = 2;
        aob[InstrumentType.MULTI_INSTRUMENT.ordinal()] = 3;
        aob[InstrumentType.DIGITAL_INSTRUMENT.ordinal()] = 4;
        aob[InstrumentType.FX_INSTRUMENT.ordinal()] = 5;
    }
}
