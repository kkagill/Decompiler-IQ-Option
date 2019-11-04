package com.iqoption.kyc.profile;

import com.iqoption.kyc.profile.steps.ProfileStep;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aob = new int[ProfileStep.values().length];

    static {
        aob[ProfileStep.LEGAL_NAME.ordinal()] = 1;
        aob[ProfileStep.SEX.ordinal()] = 2;
        aob[ProfileStep.DATE_OF_BIRTH.ordinal()] = 3;
        aob[ProfileStep.COUNTRY.ordinal()] = 4;
        aob[ProfileStep.CITIZEN_COUNTRY.ordinal()] = 5;
        aob[ProfileStep.ADDRESS.ordinal()] = 6;
        aob[ProfileStep.REPORTABLE.ordinal()] = 7;
        aob[ProfileStep.GDPR.ordinal()] = 8;
    }
}
