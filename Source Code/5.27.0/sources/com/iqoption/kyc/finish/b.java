package com.iqoption.kyc.finish;

import com.iqoption.kyc.KycCaller;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] aob = new int[KycCaller.values().length];

    static {
        aob[KycCaller.DEPOSIT.ordinal()] = 1;
        aob[KycCaller.WITHDRAW.ordinal()] = 2;
    }
}
