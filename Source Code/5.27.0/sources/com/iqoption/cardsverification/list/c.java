package com.iqoption.cardsverification.list;

import io.card.payment.CardType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aob = new int[CardType.values().length];

    static {
        aob[CardType.VISA.ordinal()] = 1;
        aob[CardType.MASTERCARD.ordinal()] = 2;
    }
}
