package com.iqoption.deposit.crypto.b;

import com.iqoption.core.microservices.billing.response.crypto.CryptoDepositStatus;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aob = new int[CryptoDepositStatus.values().length];

    static {
        aob[CryptoDepositStatus.PENDING.ordinal()] = 1;
        aob[CryptoDepositStatus.FAILED.ordinal()] = 2;
        aob[CryptoDepositStatus.EXPIRED.ordinal()] = 3;
    }
}
