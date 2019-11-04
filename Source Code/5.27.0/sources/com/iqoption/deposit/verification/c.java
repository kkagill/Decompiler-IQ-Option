package com.iqoption.deposit.verification;

import com.iqoption.deposit.o.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, bng = {"analyticsName", "", "Lcom/iqoption/deposit/verification/VerificationState;", "getIconResId", "", "deposit_release"})
/* compiled from: VerificationState.kt */
public final class c {
    public static final int a(VerificationState verificationState) {
        kotlin.jvm.internal.i.f(verificationState, "$this$getIconResId");
        int i = d.aob[verificationState.ordinal()];
        if (i == 1) {
            return d.ic_error_red;
        }
        if (i == 2) {
            return d.ic_wait;
        }
        if (i == 3) {
            return d.ic_error_orange;
        }
        if (i == 4) {
            return d.ic_verify;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String b(VerificationState verificationState) {
        kotlin.jvm.internal.i.f(verificationState, "$this$analyticsName");
        int i = d.axg[verificationState.ordinal()];
        if (i == 1) {
            return "IMPORTANT";
        }
        if (i != 2) {
            return i != 3 ? null : "NEED_ADDITIONAL_ACTION";
        } else {
            return "WAITING";
        }
    }
}
