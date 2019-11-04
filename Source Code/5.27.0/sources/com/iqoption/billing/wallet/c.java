package com.iqoption.billing.wallet;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.util.Map;
import kotlin.Pair;
import kotlin.i;
import kotlin.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0015J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, bng = {"Lcom/iqoption/billing/wallet/GooglePayToken;", "", "signature", "", "protocolVersion", "signedMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProtocolVersion", "()Ljava/lang/String;", "getSignature", "getSignedMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toParams", "", "toString", "billing_release"})
@o
/* compiled from: GooglePayToken.kt */
public final class c {
    @SerializedName("protocolVersion")
    private final String azH;
    @SerializedName("signedMessage")
    private final String azI;
    @SerializedName("signature")
    private final String signature;

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.azI, r3.azI) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.billing.wallet.c;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.iqoption.billing.wallet.c) r3;
        r0 = r2.signature;
        r1 = r3.signature;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.azH;
        r1 = r3.azH;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.azI;
        r3 = r3.azI;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.billing.wallet.c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.signature;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.azH;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.azI;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GooglePayToken(signature=");
        stringBuilder.append(this.signature);
        stringBuilder.append(", protocolVersion=");
        stringBuilder.append(this.azH);
        stringBuilder.append(", signedMessage=");
        stringBuilder.append(this.azI);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final Map<String, Object> KK() {
        r0 = new Pair[4];
        r0[0] = j.x("protocol_version", this.azH);
        r0[1] = j.x("signature", this.signature);
        r0[2] = j.x("signed_message", this.azI);
        r0[3] = j.x("payment_type", "google_pay");
        return af.a(r0);
    }
}
