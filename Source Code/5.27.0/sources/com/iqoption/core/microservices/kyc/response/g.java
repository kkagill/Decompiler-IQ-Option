package com.iqoption.core.microservices.kyc.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0013\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J.\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/TwoFactorResponse;", "", "isSuccessful", "", "messages", "", "", "(Ljava/lang/Boolean;Ljava/util/List;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "message", "getMessage", "()Ljava/lang/String;", "getMessages", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lcom/iqoption/core/microservices/kyc/response/TwoFactorResponse;", "equals", "other", "hashCode", "", "toString", "core_release"})
/* compiled from: SavePhoneResult.kt */
public final class g {
    @SerializedName("message")
    private final List<String> anc;
    @SerializedName("isSuccessful")
    private final Boolean isSuccessful;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.anc, r3.anc) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.kyc.response.g;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.kyc.response.g) r3;
        r0 = r2.isSuccessful;
        r1 = r3.isSuccessful;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.anc;
        r3 = r3.anc;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.kyc.response.g.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Boolean bool = this.isSuccessful;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        List list = this.anc;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TwoFactorResponse(isSuccessful=");
        stringBuilder.append(this.isSuccessful);
        stringBuilder.append(", messages=");
        stringBuilder.append(this.anc);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final Boolean ZD() {
        return this.isSuccessful;
    }

    public final String getMessage() {
        List list = this.anc;
        return list != null ? (String) u.bV(list) : null;
    }
}
