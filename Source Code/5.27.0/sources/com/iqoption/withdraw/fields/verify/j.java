package com.iqoption.withdraw.fields.verify;

import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class j {
    public static final /* synthetic */ int[] aob = new int[VerificationWarningType.values().length];

    static {
        aob[VerificationWarningType.DOCUMENTS_WARNING.ordinal()] = 1;
        aob[VerificationWarningType.CARDS_WARNING.ordinal()] = 2;
    }
}
