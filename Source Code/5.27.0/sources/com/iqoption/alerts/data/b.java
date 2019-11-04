package com.iqoption.alerts.data;

import com.iqoption.core.microservices.useralerts.response.AssetAlertChanged.Reason;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] aob = new int[Reason.values().length];

    static {
        aob[Reason.CREATED.ordinal()] = 1;
        aob[Reason.UPDATED.ordinal()] = 2;
        aob[Reason.DELETED.ordinal()] = 3;
    }
}
