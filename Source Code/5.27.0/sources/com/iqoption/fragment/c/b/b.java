package com.iqoption.fragment.c.b;

import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] aob = new int[InstrumentType.values().length];

    static {
        aob[InstrumentType.TURBO_INSTRUMENT.ordinal()] = 1;
        aob[InstrumentType.BINARY_INSTRUMENT.ordinal()] = 2;
        aob[InstrumentType.DIGITAL_INSTRUMENT.ordinal()] = 3;
        aob[InstrumentType.MULTI_INSTRUMENT.ordinal()] = 4;
        aob[InstrumentType.FX_INSTRUMENT.ordinal()] = 5;
        aob[InstrumentType.FOREX_INSTRUMENT.ordinal()] = 6;
        aob[InstrumentType.CFD_INSTRUMENT.ordinal()] = 7;
        aob[InstrumentType.CRYPTO_INSTRUMENT.ordinal()] = 8;
    }
}