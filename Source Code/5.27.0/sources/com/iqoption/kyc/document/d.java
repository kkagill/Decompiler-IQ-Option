package com.iqoption.kyc.document;

import com.iqoption.core.microservices.kyc.response.document.DocumentStatus;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class d {
    public static final /* synthetic */ int[] aob = new int[DocumentStatus.values().length];

    static {
        aob[DocumentStatus.APPROVED.ordinal()] = 1;
        aob[DocumentStatus.VERIFYING.ordinal()] = 2;
        aob[DocumentStatus.DECLINED.ordinal()] = 3;
    }
}
