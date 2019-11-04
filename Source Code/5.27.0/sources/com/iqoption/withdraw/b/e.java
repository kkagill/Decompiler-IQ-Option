package com.iqoption.withdraw.b;

import com.iqoption.core.microservices.withdraw.response.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, bng = {"Lcom/iqoption/withdraw/history/PayoutItem;", "Lcom/iqoption/withdraw/history/WithdrawHistoryAdapterItem;", "payout", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawPayout;", "mask", "", "minorUnits", "", "cancellationInProgress", "", "(Lcom/iqoption/core/microservices/withdraw/response/WithdrawPayout;Ljava/lang/String;IZ)V", "getCancellationInProgress", "()Z", "getMask", "()Ljava/lang/String;", "getMinorUnits", "()I", "getPayout", "()Lcom/iqoption/core/microservices/withdraw/response/WithdrawPayout;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "getViewType", "hashCode", "toString", "withdraw_release"})
/* compiled from: WithdrawHistoryAdapterItems.kt */
public final class e extends k {
    private final int brG;
    private final o esE;
    private final boolean esF;
    private final String mask;

    public int asd() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (kotlin.jvm.internal.i.y(this.esE, eVar.esE) && kotlin.jvm.internal.i.y(this.mask, eVar.mask)) {
                    if ((this.brG == eVar.brG ? 1 : null) != null) {
                        if ((this.esF == eVar.esF ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        o oVar = this.esE;
        int i = 0;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        String str = this.mask;
        if (str != null) {
            i = str.hashCode();
        }
        hashCode = (((hashCode + i) * 31) + this.brG) * 31;
        i = this.esF;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PayoutItem(payout=");
        stringBuilder.append(this.esE);
        stringBuilder.append(", mask=");
        stringBuilder.append(this.mask);
        stringBuilder.append(", minorUnits=");
        stringBuilder.append(this.brG);
        stringBuilder.append(", cancellationInProgress=");
        stringBuilder.append(this.esF);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final o bcO() {
        return this.esE;
    }

    public final String getMask() {
        return this.mask;
    }

    public final int getMinorUnits() {
        return this.brG;
    }

    public final boolean bcP() {
        return this.esF;
    }

    public e(o oVar, String str, int i, boolean z) {
        kotlin.jvm.internal.i.f(oVar, "payout");
        kotlin.jvm.internal.i.f(str, "mask");
        super();
        this.esE = oVar;
        this.mask = str;
        this.brG = i;
        this.esF = z;
    }
}
