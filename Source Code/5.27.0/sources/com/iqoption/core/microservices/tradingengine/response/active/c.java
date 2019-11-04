package com.iqoption.core.microservices.tradingengine.response.active;

import com.iqoption.core.data.model.InstrumentType;
import java.util.Map;
import kotlin.Pair;
import kotlin.i;
import kotlin.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"capacityAssetMap", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "getCapacityAsset", "instrumentType", "core_release"})
/* compiled from: ActiveCapacities.kt */
public final class c {
    private static final Map<InstrumentType, Integer> bzN;

    static {
        r0 = new Pair[8];
        InstrumentType instrumentType = InstrumentType.FOREX_INSTRUMENT;
        Integer valueOf = Integer.valueOf(128);
        r0[2] = j.x(instrumentType, valueOf);
        r0[3] = j.x(InstrumentType.DIGITAL_INSTRUMENT, valueOf);
        r0[4] = j.x(InstrumentType.MULTI_INSTRUMENT, valueOf);
        r0[5] = j.x(InstrumentType.FX_INSTRUMENT, valueOf);
        r0[6] = j.x(InstrumentType.BINARY_INSTRUMENT, valueOf);
        r0[7] = j.x(InstrumentType.TURBO_INSTRUMENT, valueOf);
        bzN = af.a(r0);
    }

    public static final int T(InstrumentType instrumentType) {
        Integer num = (Integer) bzN.get(instrumentType);
        return num != null ? num.intValue() : 128;
    }
}
