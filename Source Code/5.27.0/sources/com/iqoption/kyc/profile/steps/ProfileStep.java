package com.iqoption.kyc.profile.steps;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/kyc/profile/steps/ProfileStep;", "", "(Ljava/lang/String;I)V", "LEGAL_NAME", "SEX", "DATE_OF_BIRTH", "COUNTRY", "CITIZEN_COUNTRY", "ADDRESS", "GDPR", "REPORTABLE", "kyc_release"})
/* compiled from: ProfileStep.kt */
public enum ProfileStep {
    LEGAL_NAME,
    SEX,
    DATE_OF_BIRTH,
    COUNTRY,
    CITIZEN_COUNTRY,
    ADDRESS,
    GDPR,
    REPORTABLE
}
