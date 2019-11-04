package com.iqoption.core.data.config;

import com.iqoption.core.data.config.ApiConfig.Type;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class e {
    public static final /* synthetic */ int[] aob = new int[Type.values().length];

    static {
        aob[Type.INT.ordinal()] = 1;
        aob[Type.PROD.ordinal()] = 2;
        aob[Type.SANDBOX.ordinal()] = 3;
    }
}
