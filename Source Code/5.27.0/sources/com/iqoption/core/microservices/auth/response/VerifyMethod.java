package com.iqoption.core.microservices.auth.response;

import kotlin.NoWhenBranchMatchedException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/auth/response/VerifyMethod;", "", "(Ljava/lang/String;I)V", "toString", "", "SMS", "EMAIL", "core_release"})
/* compiled from: VerifyMethod.kt */
public enum VerifyMethod {
    SMS,
    EMAIL;

    public String toString() {
        int i = j.aob[ordinal()];
        if (i == 1) {
            return "sms";
        }
        if (i == 2) {
            return "email";
        }
        throw new NoWhenBranchMatchedException();
    }
}
