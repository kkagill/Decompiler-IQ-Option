package com.iqoption.deposit.verification;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/deposit/verification/VerificationState;", "", "(Ljava/lang/String;I)V", "IMPORTANT", "WAITING", "NEED_ADDITIONAL_ACTION", "OK", "deposit_release"})
/* compiled from: VerificationState.kt */
public enum VerificationState {
    IMPORTANT,
    WAITING,
    NEED_ADDITIONAL_ACTION,
    OK
}
