package com.iqoption.cardsverification.status;

import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] aob = new int[CardStatus.values().length];

    static {
        aob[CardStatus.VERIFIED.ordinal()] = 1;
        aob[CardStatus.DECLINED.ordinal()] = 2;
    }
}
