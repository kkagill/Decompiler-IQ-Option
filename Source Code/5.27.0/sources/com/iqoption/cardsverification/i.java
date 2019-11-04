package com.iqoption.cardsverification;

import com.iqoption.core.microservices.billing.verification.response.DeclineReason;

@kotlin.i(bne = {1, 1, 15})
public final /* synthetic */ class i {
    public static final /* synthetic */ int[] aob = new int[DeclineReason.values().length];

    static {
        aob[DeclineReason.CARD_IS_NOT_SIGNED.ordinal()] = 1;
        aob[DeclineReason.THERE_IS_NO_BACKSIDE.ordinal()] = 2;
        aob[DeclineReason.NO_FRONT_SIDE.ordinal()] = 3;
        aob[DeclineReason.BLACK_AND_WHITE_COPY.ordinal()] = 4;
        aob[DeclineReason.WRONG_CARD.ordinal()] = 5;
        aob[DeclineReason.COPY_IS_BLURRY.ordinal()] = 6;
        aob[DeclineReason.INFO_IS_HIDDEN.ordinal()] = 7;
    }
}
