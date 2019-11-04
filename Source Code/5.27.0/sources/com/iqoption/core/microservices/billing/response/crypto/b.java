package com.iqoption.core.microservices.billing.response.crypto;

import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] aob = new int[CryptoDepositStatus.values().length];

    static {
        aob[CryptoDepositStatus.PENDING.ordinal()] = 1;
        aob[CryptoDepositStatus.SUCCESS.ordinal()] = 2;
        aob[CryptoDepositStatus.EXPIRED.ordinal()] = 3;
        aob[CryptoDepositStatus.NEW.ordinal()] = 4;
        aob[CryptoDepositStatus.FAILED.ordinal()] = 5;
    }
}
