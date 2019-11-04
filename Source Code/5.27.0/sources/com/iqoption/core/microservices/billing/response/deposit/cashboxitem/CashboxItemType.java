package com.iqoption.core.microservices.billing.response.deposit.cashboxitem;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItemType;", "", "(Ljava/lang/String;I)V", "USER_CARD", "PAYMENT_METHOD", "HOLD_PAYMENT", "CRYPTO_DEPOSIT", "EXPAND_CRYPTO_DEPOSIT", "core_release"})
/* compiled from: CashboxItemType.kt */
public enum CashboxItemType {
    USER_CARD,
    PAYMENT_METHOD,
    HOLD_PAYMENT,
    CRYPTO_DEPOSIT,
    EXPAND_CRYPTO_DEPOSIT
}
