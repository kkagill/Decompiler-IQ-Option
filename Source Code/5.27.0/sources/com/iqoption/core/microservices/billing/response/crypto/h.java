package com.iqoption.core.microservices.billing.response.crypto;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, bng = {"Lcom/iqoption/core/microservices/billing/response/crypto/CurrencyRateResponse;", "", "rate", "Lcom/iqoption/core/microservices/billing/response/crypto/Rate;", "error", "Lcom/iqoption/core/microservices/billing/response/crypto/ErrorDescription;", "(Lcom/iqoption/core/microservices/billing/response/crypto/Rate;Lcom/iqoption/core/microservices/billing/response/crypto/ErrorDescription;)V", "getError", "()Lcom/iqoption/core/microservices/billing/response/crypto/ErrorDescription;", "setError", "(Lcom/iqoption/core/microservices/billing/response/crypto/ErrorDescription;)V", "getRate", "()Lcom/iqoption/core/microservices/billing/response/crypto/Rate;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
@o
/* compiled from: CurrencyRateResponse.kt */
public final class h {
    @SerializedName("response")
    private final j bnf;
    @SerializedName("error")
    private i bng;

    public h() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bng, r3.bng) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.billing.response.crypto.h;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.billing.response.crypto.h) r3;
        r0 = r2.bnf;
        r1 = r3.bnf;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.bng;
        r3 = r3.bng;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.billing.response.crypto.h.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        j jVar = this.bnf;
        int i = 0;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        i iVar = this.bng;
        if (iVar != null) {
            i = iVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CurrencyRateResponse(rate=");
        stringBuilder.append(this.bnf);
        stringBuilder.append(", error=");
        stringBuilder.append(this.bng);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public h(j jVar, i iVar) {
        this.bnf = jVar;
        this.bng = iVar;
    }

    public /* synthetic */ h(j jVar, i iVar, int i, f fVar) {
        if ((i & 1) != 0) {
            jVar = (j) null;
        }
        if ((i & 2) != 0) {
            iVar = (i) null;
        }
        this(jVar, iVar);
    }

    public final j aal() {
        return this.bnf;
    }
}
