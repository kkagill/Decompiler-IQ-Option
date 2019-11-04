package com.iqoption.withdraw.fields;

import com.iqoption.core.microservices.withdraw.response.LimitType;
import com.iqoption.core.microservices.withdraw.response.PayoutFieldType;
import com.iqoption.core.ui.Status;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class e {
    public static final /* synthetic */ int[] aFX = new int[LimitType.values().length];
    public static final /* synthetic */ int[] aob = new int[Status.values().length];
    public static final /* synthetic */ int[] axg = new int[PayoutFieldType.values().length];

    static {
        aob[Status.LOADING.ordinal()] = 1;
        aob[Status.SUCCESS.ordinal()] = 2;
        aob[Status.ERROR.ordinal()] = 3;
        axg[PayoutFieldType.TEXT.ordinal()] = 1;
        axg[PayoutFieldType.TEXT_AREA.ordinal()] = 2;
        aFX[LimitType.WALLET_AMOUNT.ordinal()] = 1;
        aFX[LimitType.WITHDRAW_METHOD_LIMIT.ordinal()] = 2;
        aFX[LimitType.CARD_REFUND_LIMIT.ordinal()] = 3;
    }
}
