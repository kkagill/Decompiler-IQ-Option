package com.iqoption.core.microservices.billing.response.crypto;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.math.BigDecimal;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, bng = {"Lcom/iqoption/core/microservices/billing/response/crypto/Rate;", "", "fromCurrency", "", "toCurrency", "rate", "Ljava/math/BigDecimal;", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getFromCurrency", "()Ljava/lang/String;", "getRate", "()Ljava/math/BigDecimal;", "getToCurrency", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"})
@o
/* compiled from: CurrencyRateResponse.kt */
public final class j {
    @SerializedName("from_currency")
    private final String bnh;
    @SerializedName("to_currency")
    private final String bni;
    @SerializedName("rate")
    private final BigDecimal bnj;

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bnj, r3.bnj) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.billing.response.crypto.j;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.billing.response.crypto.j) r3;
        r0 = r2.bnh;
        r1 = r3.bnh;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.bni;
        r1 = r3.bni;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.bnj;
        r3 = r3.bnj;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.billing.response.crypto.j.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.bnh;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bni;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        BigDecimal bigDecimal = this.bnj;
        if (bigDecimal != null) {
            i = bigDecimal.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rate(fromCurrency=");
        stringBuilder.append(this.bnh);
        stringBuilder.append(", toCurrency=");
        stringBuilder.append(this.bni);
        stringBuilder.append(", rate=");
        stringBuilder.append(this.bnj);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final BigDecimal aam() {
        return this.bnj;
    }
}
