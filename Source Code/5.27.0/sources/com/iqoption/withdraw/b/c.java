package com.iqoption.withdraw.b;

import io.card.payment.CardType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, bng = {"Lcom/iqoption/withdraw/history/CardData;", "", "cardType", "Lio/card/payment/CardType;", "lastDigits", "", "(Lio/card/payment/CardType;Ljava/lang/String;)V", "getCardType", "()Lio/card/payment/CardType;", "getLastDigits", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "withdraw_release"})
/* compiled from: WithdrawHistoryHolders.kt */
public final class c {
    private final CardType bDW;
    private final String esD;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.esD, r3.esD) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.withdraw.b.c;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.withdraw.b.c) r3;
        r0 = r2.bDW;
        r1 = r3.bDW;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.esD;
        r3 = r3.esD;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.withdraw.b.c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        CardType cardType = this.bDW;
        int i = 0;
        int hashCode = (cardType != null ? cardType.hashCode() : 0) * 31;
        String str = this.esD;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CardData(cardType=");
        stringBuilder.append(this.bDW);
        stringBuilder.append(", lastDigits=");
        stringBuilder.append(this.esD);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public c(CardType cardType, String str) {
        kotlin.jvm.internal.i.f(cardType, "cardType");
        kotlin.jvm.internal.i.f(str, "lastDigits");
        this.bDW = cardType;
        this.esD = str;
    }

    public final String bcN() {
        return this.esD;
    }

    public final CardType getCardType() {
        return this.bDW;
    }
}
