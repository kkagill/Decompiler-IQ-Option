package com.iqoption.billing.wallet;

import com.google.android.gms.common.api.Status;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, bng = {"Lcom/iqoption/billing/wallet/GooglePayResult;", "", "token", "Lcom/iqoption/billing/wallet/GooglePayToken;", "errorStatus", "Lcom/google/android/gms/common/api/Status;", "(Lcom/iqoption/billing/wallet/GooglePayToken;Lcom/google/android/gms/common/api/Status;)V", "getErrorStatus", "()Lcom/google/android/gms/common/api/Status;", "getToken", "()Lcom/iqoption/billing/wallet/GooglePayToken;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "billing_release"})
/* compiled from: GooglePayResult.kt */
public final class b {
    private final c azF;
    private final Status azG;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.azG, r3.azG) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.billing.wallet.b;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.billing.wallet.b) r3;
        r0 = r2.azF;
        r1 = r3.azF;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.azG;
        r3 = r3.azG;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.billing.wallet.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        c cVar = this.azF;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        Status status = this.azG;
        if (status != null) {
            i = status.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GooglePayResult(token=");
        stringBuilder.append(this.azF);
        stringBuilder.append(", errorStatus=");
        stringBuilder.append(this.azG);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public b(c cVar, Status status) {
        this.azF = cVar;
        this.azG = status;
    }

    public final c KJ() {
        return this.azF;
    }
}
