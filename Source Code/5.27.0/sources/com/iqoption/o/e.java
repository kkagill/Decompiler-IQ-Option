package com.iqoption.o;

import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0003"}, bng = {"LOCAL_TOAST_STATUSES", "", "Lcom/iqoption/core/microservices/billing/verification/response/CardStatus;", "app_optionXRelease"})
/* compiled from: TradeRoomViewModel.kt */
public final class e {
    private static final List<CardStatus> dVf = m.listOf(CardStatus.VERIFIED, CardStatus.DECLINED, CardStatus.FAILED);
}
