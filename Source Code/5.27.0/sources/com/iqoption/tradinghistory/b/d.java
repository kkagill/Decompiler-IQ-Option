package com.iqoption.tradinghistory.b;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, bng = {"Lcom/iqoption/tradinghistory/details/InvestData;", "", "amount", "", "overnightFee", "", "custodialFee", "profit", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getAmount", "()Ljava/lang/String;", "getCustodialFee", "()Ljava/lang/CharSequence;", "getOvernightFee", "getProfit", "tradinghistory_release"})
/* compiled from: PositionDetailsViewModel.kt */
public final class d {
    private final String amount;
    private final CharSequence dWH;
    private final CharSequence dWI;
    private final CharSequence dWJ;

    public d(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        kotlin.jvm.internal.i.f(str, "amount");
        kotlin.jvm.internal.i.f(charSequence, "overnightFee");
        kotlin.jvm.internal.i.f(charSequence2, "custodialFee");
        kotlin.jvm.internal.i.f(charSequence3, "profit");
        this.amount = str;
        this.dWH = charSequence;
        this.dWI = charSequence2;
        this.dWJ = charSequence3;
    }

    public final String VN() {
        return this.amount;
    }

    public final CharSequence aVz() {
        return this.dWH;
    }

    public final CharSequence aVA() {
        return this.dWI;
    }

    public final CharSequence aVB() {
        return this.dWJ;
    }
}
