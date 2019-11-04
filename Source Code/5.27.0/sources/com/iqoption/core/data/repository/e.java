package com.iqoption.core.data.repository;

import com.iqoption.core.microservices.kyc.response.restriction.RestrictionChangeType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class e {
    public static final /* synthetic */ int[] aob = new int[RestrictionChangeType.values().length];

    static {
        aob[RestrictionChangeType.ADDED.ordinal()] = 1;
        aob[RestrictionChangeType.REMOVED.ordinal()] = 2;
        aob[RestrictionChangeType.UPDATED.ordinal()] = 3;
    }
}
