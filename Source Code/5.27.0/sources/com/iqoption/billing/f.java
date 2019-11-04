package com.iqoption.billing;

import com.iqoption.core.microservices.billing.response.crypto.a;
import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J7\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006\""}, bng = {"Lcom/iqoption/billing/CashboxDisplayData;", "", "cashboxData", "Lcom/iqoption/billing/CashboxData;", "cryptoDeposits", "", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "allowGooglePay", "", "kycPermissions", "Lcom/iqoption/billing/KycDepositPermissions;", "(Lcom/iqoption/billing/CashboxData;Ljava/util/List;ZLcom/iqoption/billing/KycDepositPermissions;)V", "getAllowGooglePay", "()Z", "getCashboxData", "()Lcom/iqoption/billing/CashboxData;", "getCryptoDeposits", "()Ljava/util/List;", "getKycPermissions", "()Lcom/iqoption/billing/KycDepositPermissions;", "paymentMethodsFiltered", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PaymentMethod;", "getPaymentMethodsFiltered", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "billing_release"})
/* compiled from: CashBoxMediator.kt */
public final class f {
    private final e ayL;
    private final List<a> ayM;
    private final boolean ayN;
    private final h ayO;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (kotlin.jvm.internal.i.y(this.ayL, fVar.ayL) && kotlin.jvm.internal.i.y(this.ayM, fVar.ayM)) {
                    if ((this.ayN == fVar.ayN ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.ayO, fVar.ayO)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        e eVar = this.ayL;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        List list = this.ayM;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        int i2 = this.ayN;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        h hVar = this.ayO;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CashboxDisplayData(cashboxData=");
        stringBuilder.append(this.ayL);
        stringBuilder.append(", cryptoDeposits=");
        stringBuilder.append(this.ayM);
        stringBuilder.append(", allowGooglePay=");
        stringBuilder.append(this.ayN);
        stringBuilder.append(", kycPermissions=");
        stringBuilder.append(this.ayO);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public f(e eVar, List<a> list, boolean z, h hVar) {
        kotlin.jvm.internal.i.f(eVar, "cashboxData");
        kotlin.jvm.internal.i.f(list, "cryptoDeposits");
        kotlin.jvm.internal.i.f(hVar, "kycPermissions");
        this.ayL = eVar;
        this.ayM = list;
        this.ayN = z;
        this.ayO = hVar;
    }

    public final e Kp() {
        return this.ayL;
    }

    public final List<a> Kq() {
        return this.ayM;
    }

    public final boolean Kr() {
        return this.ayN;
    }

    public final h Ks() {
        return this.ayO;
    }

    public final List<d> Ko() {
        return this.ayL.Km().cz(this.ayN);
    }
}
