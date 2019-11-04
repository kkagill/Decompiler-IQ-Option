package com.iqoption.withdraw.fields;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, bng = {"Lcom/iqoption/withdraw/fields/FeeResult;", "", "commission", "", "total", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getCommission", "()Ljava/lang/CharSequence;", "getTotal", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "withdraw_release"})
/* compiled from: WithdrawFieldsViewModel.kt */
public final class b {
    private final CharSequence erk;
    private final CharSequence erl;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.erl, r3.erl) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.withdraw.fields.b;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.withdraw.fields.b) r3;
        r0 = r2.erk;
        r1 = r3.erk;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.erl;
        r3 = r3.erl;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.withdraw.fields.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        CharSequence charSequence = this.erk;
        int i = 0;
        int hashCode = (charSequence != null ? charSequence.hashCode() : 0) * 31;
        CharSequence charSequence2 = this.erl;
        if (charSequence2 != null) {
            i = charSequence2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeeResult(commission=");
        stringBuilder.append(this.erk);
        stringBuilder.append(", total=");
        stringBuilder.append(this.erl);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public b(CharSequence charSequence, CharSequence charSequence2) {
        kotlin.jvm.internal.i.f(charSequence, "commission");
        kotlin.jvm.internal.i.f(charSequence2, "total");
        this.erk = charSequence;
        this.erl = charSequence2;
    }

    public final CharSequence bcc() {
        return this.erk;
    }

    public final CharSequence bcd() {
        return this.erl;
    }
}
