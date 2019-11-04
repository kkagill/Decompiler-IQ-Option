package com.iqoption.core.microservices.kyc.response;

import com.google.gson.annotations.SerializedName;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/VerificationDocument;", "", "merchantScanReference", "", "(Ljava/lang/String;)V", "getMerchantScanReference", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"})
/* compiled from: VerificationDocument.kt */
public final class i {
    @SerializedName("merchant_scan_reference")
    private final String buH;

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.buH, ((com.iqoption.core.microservices.kyc.response.i) r2).buH) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.core.microservices.kyc.response.i;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.core.microservices.kyc.response.i) r2;
        r0 = r1.buH;
        r2 = r2.buH;
        r2 = kotlin.jvm.internal.i.y(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.kyc.response.i.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.buH;
        return str != null ? str.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VerificationDocument(merchantScanReference=");
        stringBuilder.append(this.buH);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final String getMerchantScanReference() {
        return this.buH;
    }
}
