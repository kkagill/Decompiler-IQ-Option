package com.iqoption.dto;

import com.google.common.base.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "input", "Lcom/iqoption/dto/Balance;", "apply"})
/* compiled from: Balance.kt */
final class Balance$Companion$filteredCryptoType$1<F, T> implements d<Balance, Boolean> {
    public static final Balance$Companion$filteredCryptoType$1 INSTANCE = new Balance$Companion$filteredCryptoType$1();

    Balance$Companion$filteredCryptoType$1() {
    }

    public final boolean apply(Balance balance) {
        return balance != null && balance.type == 5;
    }
}
