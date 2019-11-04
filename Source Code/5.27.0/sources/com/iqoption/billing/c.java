package com.iqoption.billing;

import io.card.payment.CardType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aob = new int[CardType.values().length];

    static {
        aob[CardType.VISA.ordinal()] = 1;
        aob[CardType.MASTERCARD.ordinal()] = 2;
        aob[CardType.AMEX.ordinal()] = 3;
        aob[CardType.DISCOVER.ordinal()] = 4;
        aob[CardType.JCB.ordinal()] = 5;
    }
}
