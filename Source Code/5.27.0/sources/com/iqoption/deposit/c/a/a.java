package com.iqoption.deposit.c.a;

import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\r¨\u0006\u0018"}, bng = {"Lcom/iqoption/deposit/menu/currency/CurrencyAdapterItem;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "currencyBilling", "Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "isSelected", "", "(Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;Z)V", "getCurrencyBilling", "()Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "id", "getId", "()Ljava/lang/Long;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "deposit_release"})
/* compiled from: CurrencyAdapterItem.kt */
public final class a implements d<Long> {
    private final com.iqoption.core.microservices.billing.response.deposit.d cGd;
    private final boolean isSelected;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.cGd, aVar.cGd)) {
                    if ((this.isSelected == aVar.isSelected ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        com.iqoption.core.microservices.billing.response.deposit.d dVar = this.cGd;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        int i = this.isSelected;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CurrencyAdapterItem(currencyBilling=");
        stringBuilder.append(this.cGd);
        stringBuilder.append(", isSelected=");
        stringBuilder.append(this.isSelected);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(com.iqoption.core.microservices.billing.response.deposit.d dVar, boolean z) {
        kotlin.jvm.internal.i.f(dVar, "currencyBilling");
        this.cGd = dVar;
        this.isSelected = z;
    }

    public final com.iqoption.core.microservices.billing.response.deposit.d asR() {
        return this.cGd;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public Long getId() {
        return Long.valueOf(this.cGd.getId());
    }
}
