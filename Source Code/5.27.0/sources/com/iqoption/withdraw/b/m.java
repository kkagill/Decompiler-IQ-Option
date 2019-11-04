package com.iqoption.withdraw.b;

import com.iqoption.core.microservices.withdraw.response.Status;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0004"}, bng = {"ERROR_STATUSES", "", "Lcom/iqoption/core/microservices/withdraw/response/Status;", "SUCCESS_STATUSES", "withdraw_release"})
/* compiled from: WithdrawHistoryHolders.kt */
public final class m {
    private static final List<Status> esS = m.listOf(Status.SUCCESS, Status.SUCCESS_PROCESSING);
    private static final List<Status> esT = m.listOf(Status.FAILED, Status.PROCESSING_FAILED, Status.DECLINED, Status.CANCELED, Status.CANCEL_PROCESSING, Status.UNKNOWN);
}
