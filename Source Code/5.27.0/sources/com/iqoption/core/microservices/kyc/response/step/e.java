package com.iqoption.core.microservices.kyc.response.step;

import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class e {
    public static final /* synthetic */ int[] aob = new int[KycStepType.values().length];

    static {
        aob[KycStepType.PROFILE.ordinal()] = 1;
        aob[KycStepType.TIN.ordinal()] = 2;
        aob[KycStepType.PHONE.ordinal()] = 3;
        aob[KycStepType.KYC_QUESTIONNAIRE.ordinal()] = 4;
        aob[KycStepType.KYC_DOCUMENTS_POI.ordinal()] = 5;
        aob[KycStepType.KYC_DOCUMENTS_POA.ordinal()] = 6;
    }
}
