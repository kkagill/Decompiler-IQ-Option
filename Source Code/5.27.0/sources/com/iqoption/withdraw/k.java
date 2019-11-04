package com.iqoption.withdraw;

import com.iqoption.core.microservices.withdraw.response.c;
import com.iqoption.core.microservices.withdraw.response.j;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, bng = {"Lcom/iqoption/withdraw/WithdrawalFeeUtils;", "", "()V", "canWithdrawForFree", "", "userSettings", "Lcom/iqoption/core/microservices/withdraw/response/UserPayoutSettings;", "method", "Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "withdraw_release"})
/* compiled from: WithdrawalFeeUtils.kt */
public final class k {
    public static final k epD = new k();

    private k() {
    }

    public final boolean a(com.iqoption.core.microservices.withdraw.response.i iVar, c cVar) {
        kotlin.jvm.internal.i.f(iVar, "userSettings");
        kotlin.jvm.internal.i.f(cVar, "method");
        j ajC = cVar.ajC();
        double d = (double) 0;
        if (cVar.ajB() <= d) {
            if (ajC == null) {
                return true;
            }
            if (ajC.ajO() <= d && ajC.agx() <= d) {
                return true;
            }
            Integer ajN = iVar.ajN();
            if ((ajN != null ? ajN.intValue() : 0) > 0) {
                return true;
            }
        }
        return false;
    }
}
