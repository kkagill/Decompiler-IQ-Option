package com.iqoption.withdraw.fields;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, bng = {"Lcom/iqoption/withdraw/fields/FeeRequest;", "", "methodId", "", "amount", "", "(JLjava/lang/Double;)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMethodId", "()J", "component1", "component2", "copy", "(JLjava/lang/Double;)Lcom/iqoption/withdraw/fields/FeeRequest;", "equals", "", "other", "hashCode", "", "toString", "", "withdraw_release"})
/* compiled from: WithdrawFieldsViewModel.kt */
public final class a {
    private final Double amount;
    private final long erj;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if ((this.erj == aVar.erj ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.amount, aVar.amount)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.erj;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Double d = this.amount;
        return i + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeeRequest(methodId=");
        stringBuilder.append(this.erj);
        stringBuilder.append(", amount=");
        stringBuilder.append(this.amount);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(long j, Double d) {
        this.erj = j;
        this.amount = d;
    }

    public final Double aPS() {
        return this.amount;
    }

    public final long bcb() {
        return this.erj;
    }
}
