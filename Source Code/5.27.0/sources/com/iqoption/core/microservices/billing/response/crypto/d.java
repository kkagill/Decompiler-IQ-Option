package com.iqoption.core.microservices.billing.response.crypto;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, bng = {"Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositStatusUpdate;", "", "billingId", "", "status", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositEventStatus;", "cryptoDeposit", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "(JLcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositEventStatus;Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;)V", "getBillingId", "()J", "getCryptoDeposit", "()Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "setCryptoDeposit", "(Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;)V", "getStatus", "()Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositEventStatus;", "setStatus", "(Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositEventStatus;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
@o
/* compiled from: CryptoDepositStatusUpdate.kt */
public final class d {
    @SerializedName("billing_id")
    private final long bmA;
    @SerializedName("status")
    private CryptoDepositEventStatus bmX;
    @SerializedName("crypto_deposit")
    private a bmY;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!((this.bmA == dVar.bmA ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bmX, dVar.bmX) && kotlin.jvm.internal.i.y(this.bmY, dVar.bmY))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.bmA;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        CryptoDepositEventStatus cryptoDepositEventStatus = this.bmX;
        int i2 = 0;
        i = (i + (cryptoDepositEventStatus != null ? cryptoDepositEventStatus.hashCode() : 0)) * 31;
        a aVar = this.bmY;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CryptoDepositStatusUpdate(billingId=");
        stringBuilder.append(this.bmA);
        stringBuilder.append(", status=");
        stringBuilder.append(this.bmX);
        stringBuilder.append(", cryptoDeposit=");
        stringBuilder.append(this.bmY);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final long ZF() {
        return this.bmA;
    }

    public final a aaf() {
        return this.bmY;
    }
}
