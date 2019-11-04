package com.iqoption.deposit.light.perform;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, bng = {"Lcom/iqoption/deposit/light/perform/AmountError;", "", "errorMessage", "", "shouldLinkifyKyc", "", "(Ljava/lang/String;Z)V", "getErrorMessage", "()Ljava/lang/String;", "getShouldLinkifyKyc", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "deposit_release"})
/* compiled from: DepositPerformLightFragment.kt */
public final class a {
    private final boolean cFy;
    private final String errorMessage;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.errorMessage, aVar.errorMessage)) {
                    if ((this.cFy == aVar.cFy ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.errorMessage;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        int i = this.cFy;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AmountError(errorMessage=");
        stringBuilder.append(this.errorMessage);
        stringBuilder.append(", shouldLinkifyKyc=");
        stringBuilder.append(this.cFy);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(String str, boolean z) {
        kotlin.jvm.internal.i.f(str, "errorMessage");
        this.errorMessage = str;
        this.cFy = z;
    }

    public final boolean aso() {
        return this.cFy;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
