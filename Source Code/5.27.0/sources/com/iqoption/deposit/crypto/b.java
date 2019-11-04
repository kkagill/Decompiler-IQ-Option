package com.iqoption.deposit.crypto;

import com.iqoption.core.microservices.billing.response.crypto.CryptoDepositStatus;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] aob = new int[CryptoDepositStatus.values().length];
    public static final /* synthetic */ int[] axg = new int[CryptoDepositStatus.values().length];

    static {
        aob[CryptoDepositStatus.SUCCESS.ordinal()] = 1;
        aob[CryptoDepositStatus.NEW.ordinal()] = 2;
        aob[CryptoDepositStatus.PENDING.ordinal()] = 3;
        aob[CryptoDepositStatus.FAILED.ordinal()] = 4;
        aob[CryptoDepositStatus.EXPIRED.ordinal()] = 5;
        axg[CryptoDepositStatus.NEW.ordinal()] = 1;
        axg[CryptoDepositStatus.PENDING.ordinal()] = 2;
        axg[CryptoDepositStatus.SUCCESS.ordinal()] = 3;
        axg[CryptoDepositStatus.FAILED.ordinal()] = 4;
        axg[CryptoDepositStatus.EXPIRED.ordinal()] = 5;
    }
}
