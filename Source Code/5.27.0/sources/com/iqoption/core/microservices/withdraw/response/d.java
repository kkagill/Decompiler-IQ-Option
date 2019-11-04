package com.iqoption.core.microservices.withdraw.response;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJD\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, bng = {"Lcom/iqoption/core/microservices/withdraw/response/Card;", "", "id", "", "number", "", "owner", "refundAmount", "", "iqOptionPaymentMethodId", "(JLjava/lang/String;Ljava/lang/String;DLjava/lang/Long;)V", "getId", "()J", "getIqOptionPaymentMethodId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNumber", "()Ljava/lang/String;", "getOwner", "getRefundAmount", "()D", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/String;Ljava/lang/String;DLjava/lang/Long;)Lcom/iqoption/core/microservices/withdraw/response/Card;", "equals", "", "other", "hashCode", "", "toString", "core_release"})
/* compiled from: Card.kt */
public final class d {
    @SerializedName("owner")
    private final String bDR;
    @SerializedName("refund_amount")
    private final double bDS;
    @SerializedName("iqoption_payment_method_id")
    private final Long bDT;
    @SerializedName("id")
    private final long id;
    @SerializedName("number")
    private final String number;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!((this.id == dVar.id ? 1 : null) != null && kotlin.jvm.internal.i.y(this.number, dVar.number) && kotlin.jvm.internal.i.y(this.bDR, dVar.bDR) && Double.compare(this.bDS, dVar.bDS) == 0 && kotlin.jvm.internal.i.y(this.bDT, dVar.bDT))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.number;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bDR;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.bDS);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        Long l = this.bDT;
        if (l != null) {
            i2 = l.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Card(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", number=");
        stringBuilder.append(this.number);
        stringBuilder.append(", owner=");
        stringBuilder.append(this.bDR);
        stringBuilder.append(", refundAmount=");
        stringBuilder.append(this.bDS);
        stringBuilder.append(", iqOptionPaymentMethodId=");
        stringBuilder.append(this.bDT);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final long getId() {
        return this.id;
    }

    public final String getNumber() {
        return this.number;
    }

    public final double ajG() {
        return this.bDS;
    }

    public final Long ajH() {
        return this.bDT;
    }
}
