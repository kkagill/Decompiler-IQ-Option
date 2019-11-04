package com.iqoption.fragment.rightpanel;

import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class o {
    public static final /* synthetic */ int[] aob = new int[InstrumentType.values().length];

    static {
        aob[InstrumentType.TURBO_INSTRUMENT.ordinal()] = 1;
        aob[InstrumentType.BINARY_INSTRUMENT.ordinal()] = 2;
        aob[InstrumentType.DIGITAL_INSTRUMENT.ordinal()] = 3;
        aob[InstrumentType.FX_INSTRUMENT.ordinal()] = 4;
    }
}
