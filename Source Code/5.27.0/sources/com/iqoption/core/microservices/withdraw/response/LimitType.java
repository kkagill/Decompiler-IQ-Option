package com.iqoption.core.microservices.withdraw.response;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, bng = {"Lcom/iqoption/core/microservices/withdraw/response/LimitType;", "", "(Ljava/lang/String;I)V", "WALLET_AMOUNT", "CARD_REFUND_LIMIT", "WITHDRAW_METHOD_LIMIT", "core_release"})
/* compiled from: AmountLimits.kt */
public enum LimitType {
    WALLET_AMOUNT,
    CARD_REFUND_LIMIT,
    WITHDRAW_METHOD_LIMIT
}
