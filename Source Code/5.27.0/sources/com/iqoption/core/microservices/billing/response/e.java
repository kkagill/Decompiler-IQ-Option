package com.iqoption.core.microservices.billing.response;

import com.google.gson.annotations.SerializedName;
import com.iqoption.config.Platform;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003Jw\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0006HÖ\u0001J\t\u00103\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001b¨\u00064"}, bng = {"Lcom/iqoption/core/microservices/billing/response/DepositCompleted;", "", "invoiceId", "", "userId", "affId", "", "platform", "Lcom/iqoption/config/Platform;", "paygateName", "", "createdAt", "usdAmount", "", "amount", "currency", "externalTransactionId", "eventLogId", "(JJILcom/iqoption/config/Platform;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;J)V", "getAffId", "()I", "getAmount", "()D", "getCreatedAt", "()Ljava/lang/String;", "getCurrency", "getEventLogId", "()J", "getExternalTransactionId", "getInvoiceId", "getPaygateName", "getPlatform", "()Lcom/iqoption/config/Platform;", "getUsdAmount", "getUserId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "core_release"})
@o
/* compiled from: DepositCompleted.kt */
public final class e {
    @SerializedName("platform_id")
    private final Platform blZ;
    @SerializedName("invoice_id")
    private final long bmr;
    @SerializedName("aff_id")
    private final int bms;
    @SerializedName("paygate_name")
    private final String bmt;
    @SerializedName("created_at")
    private final String bmu;
    @SerializedName("usd_amount")
    private final double bmv;
    @SerializedName("amount")
    private final double bmw;
    @SerializedName("external_transaction_id")
    private final String bmx;
    @SerializedName("event_log_id")
    private final long bmy;
    @SerializedName("currency")
    private final String currency;
    @SerializedName("user_id")
    private final long userId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if ((this.bmr == eVar.bmr ? 1 : null) != null) {
                    if ((this.userId == eVar.userId ? 1 : null) != null) {
                        if ((this.bms == eVar.bms ? 1 : null) != null && kotlin.jvm.internal.i.y(this.blZ, eVar.blZ) && kotlin.jvm.internal.i.y(this.bmt, eVar.bmt) && kotlin.jvm.internal.i.y(this.bmu, eVar.bmu) && Double.compare(this.bmv, eVar.bmv) == 0 && Double.compare(this.bmw, eVar.bmw) == 0 && kotlin.jvm.internal.i.y(this.currency, eVar.currency) && kotlin.jvm.internal.i.y(this.bmx, eVar.bmx)) {
                            if ((this.bmy == eVar.bmy ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.bmr;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.userId;
        i = (((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.bms) * 31;
        Platform platform = this.blZ;
        int i2 = 0;
        i = (i + (platform != null ? platform.hashCode() : 0)) * 31;
        String str = this.bmt;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bmu;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.bmv);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.bmw);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        str = this.currency;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bmx;
        if (str != null) {
            i2 = str.hashCode();
        }
        i = (i + i2) * 31;
        j2 = this.bmy;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DepositCompleted(invoiceId=");
        stringBuilder.append(this.bmr);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", affId=");
        stringBuilder.append(this.bms);
        stringBuilder.append(", platform=");
        stringBuilder.append(this.blZ);
        stringBuilder.append(", paygateName=");
        stringBuilder.append(this.bmt);
        stringBuilder.append(", createdAt=");
        stringBuilder.append(this.bmu);
        stringBuilder.append(", usdAmount=");
        stringBuilder.append(this.bmv);
        stringBuilder.append(", amount=");
        stringBuilder.append(this.bmw);
        stringBuilder.append(", currency=");
        stringBuilder.append(this.currency);
        stringBuilder.append(", externalTransactionId=");
        stringBuilder.append(this.bmx);
        stringBuilder.append(", eventLogId=");
        stringBuilder.append(this.bmy);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final Platform Dx() {
        return this.blZ;
    }

    public final double ZB() {
        return this.bmv;
    }

    public final double ZC() {
        return this.bmw;
    }

    public final String getCurrency() {
        return this.currency;
    }
}
