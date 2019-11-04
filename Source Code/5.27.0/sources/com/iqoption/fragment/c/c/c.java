package com.iqoption.fragment.c.c;

import com.iqoption.core.microservices.fininfo.response.FinInfoType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aob = new int[FinInfoType.values().length];

    static {
        aob[FinInfoType.CRYPTO.ordinal()] = 1;
        aob[FinInfoType.FOREX.ordinal()] = 2;
    }
}
