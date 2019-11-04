package com.iqoption.deposit.navigator;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, bng = {"Lcom/iqoption/deposit/navigator/CommonWebPaymentResult;", "Lcom/iqoption/deposit/navigator/WebPaymentResult;", "isSuccess", "", "depositParams", "Lcom/iqoption/deposit/DepositParams;", "session", "", "(ZLcom/iqoption/deposit/DepositParams;Ljava/lang/String;)V", "getDepositParams", "()Lcom/iqoption/deposit/DepositParams;", "()Z", "getSession", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "deposit_release"})
/* compiled from: DepositNavigatorViewModel.kt */
public final class a extends g {
    private final boolean arq;
    private final String bmn;
    private final com.iqoption.deposit.i cGj;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!((this.arq == aVar.arq ? 1 : null) != null && kotlin.jvm.internal.i.y(this.cGj, aVar.cGj) && kotlin.jvm.internal.i.y(this.bmn, aVar.bmn))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.arq;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        com.iqoption.deposit.i iVar = this.cGj;
        int i2 = 0;
        i = (i + (iVar != null ? iVar.hashCode() : 0)) * 31;
        String str = this.bmn;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CommonWebPaymentResult(isSuccess=");
        stringBuilder.append(this.arq);
        stringBuilder.append(", depositParams=");
        stringBuilder.append(this.cGj);
        stringBuilder.append(", session=");
        stringBuilder.append(this.bmn);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(boolean z, com.iqoption.deposit.i iVar, String str) {
        kotlin.jvm.internal.i.f(iVar, "depositParams");
        super();
        this.arq = z;
        this.cGj = iVar;
        this.bmn = str;
    }

    public final String Zx() {
        return this.bmn;
    }

    public final com.iqoption.deposit.i aqY() {
        return this.cGj;
    }

    public final boolean isSuccess() {
        return this.arq;
    }
}
