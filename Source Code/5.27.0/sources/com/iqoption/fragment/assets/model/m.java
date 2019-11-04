package com.iqoption.fragment.assets.model;

import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class m {
    public static final /* synthetic */ int[] aob = new int[InstrumentType.values().length];

    static {
        aob[InstrumentType.FOREX_INSTRUMENT.ordinal()] = 1;
        aob[InstrumentType.CFD_INSTRUMENT.ordinal()] = 2;
        aob[InstrumentType.CRYPTO_INSTRUMENT.ordinal()] = 3;
    }
}
