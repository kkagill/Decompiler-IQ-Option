package com.iqoption.kyc.navigator;

import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] aob = new int[KycStepType.values().length];

    static {
        aob[KycStepType.PROFILE.ordinal()] = 1;
        aob[KycStepType.TIN.ordinal()] = 2;
        aob[KycStepType.PHONE.ordinal()] = 3;
        aob[KycStepType.KYC_DOCUMENTS_POI.ordinal()] = 4;
        aob[KycStepType.KYC_DOCUMENTS_POA.ordinal()] = 5;
        aob[KycStepType.KYC_QUESTIONNAIRE.ordinal()] = 6;
    }
}
