package com.iqoption.kyc.profile;

import com.iqoption.kyc.profile.steps.ProfileStep;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class e {
    public static final /* synthetic */ int[] aob = new int[ProfileStep.values().length];

    static {
        aob[ProfileStep.COUNTRY.ordinal()] = 1;
        aob[ProfileStep.CITIZEN_COUNTRY.ordinal()] = 2;
        aob[ProfileStep.GDPR.ordinal()] = 3;
    }
}