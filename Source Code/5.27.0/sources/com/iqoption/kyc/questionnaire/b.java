package com.iqoption.kyc.questionnaire;

import com.iqoption.core.microservices.kyc.response.questionnaire.governance.GovernanceStatus;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] aob = new int[GovernanceStatus.values().length];

    static {
        aob[GovernanceStatus.APPROVE_RISK.ordinal()] = 1;
        aob[GovernanceStatus.NOT_CONFIRM_RISK.ordinal()] = 2;
        aob[GovernanceStatus.NOT_PROCEED.ordinal()] = 3;
    }
}
