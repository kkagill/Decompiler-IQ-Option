package com.iqoption.debugmenu.debugmenu;

import com.iqoption.core.data.config.ApiConfig.Type;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class g {
    public static final /* synthetic */ int[] aob = new int[Type.values().length];

    static {
        aob[Type.PROD.ordinal()] = 1;
        aob[Type.INT.ordinal()] = 2;
        aob[Type.SANDBOX.ordinal()] = 3;
    }
}
