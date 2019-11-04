package com.iqoption.deposit.complete;

import com.iqoption.core.microservices.billing.response.failure.PaymentErrorCategory;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] aob = new int[PaymentErrorCategory.values().length];

    static {
        aob[PaymentErrorCategory.OTHER_METHODS.ordinal()] = 1;
        aob[PaymentErrorCategory.SUPPORT.ordinal()] = 2;
        aob[PaymentErrorCategory.CHECK_CREDENTIALS.ordinal()] = 3;
        aob[PaymentErrorCategory.ADD_NEW_CARD.ordinal()] = 4;
        aob[PaymentErrorCategory.CHANGE_AMOUNT.ordinal()] = 5;
        aob[PaymentErrorCategory.TRY_AGAIN.ordinal()] = 6;
    }
}
