package com.iqoption.h;

import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] aob = new int[InstrumentType.values().length];
    public static final /* synthetic */ int[] axg = new int[InstrumentType.values().length];

    static {
        aob[InstrumentType.TURBO_INSTRUMENT.ordinal()] = 1;
        aob[InstrumentType.BINARY_INSTRUMENT.ordinal()] = 2;
        aob[InstrumentType.DIGITAL_INSTRUMENT.ordinal()] = 3;
        aob[InstrumentType.FX_INSTRUMENT.ordinal()] = 4;
        axg[InstrumentType.TURBO_INSTRUMENT.ordinal()] = 1;
        axg[InstrumentType.BINARY_INSTRUMENT.ordinal()] = 2;
        axg[InstrumentType.DIGITAL_INSTRUMENT.ordinal()] = 3;
        axg[InstrumentType.FX_INSTRUMENT.ordinal()] = 4;
    }
}
