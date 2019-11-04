package com.iqoption.core.microservices.billing.verification.response;

import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, bng = {"PROGRESS_STATUSES", "", "Lcom/iqoption/core/microservices/billing/verification/response/CardStatus;", "getPROGRESS_STATUSES", "()Ljava/util/List;", "core_release"})
/* compiled from: VerifyCard.kt */
public final class d {
    private static final List<CardStatus> boS = m.listOf(CardStatus.CALLBACK_WAIT, CardStatus.VERIFY_PENDING);

    public static final List<CardStatus> abc() {
        return boS;
    }
}
