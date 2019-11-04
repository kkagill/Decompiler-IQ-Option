package com.iqoption.core.microservices.kyc.response;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.microservices.c;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\b\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\nR\u0014\u0010\f\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/SavePhoneResult;", "Lcom/iqoption/core/microservices/ResponseStatus;", "isSuccessfulInternal", "", "messages", "", "", "(Ljava/lang/Boolean;Ljava/util/List;)V", "isSuccessful", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "message", "getMessage", "()Ljava/lang/String;", "getMessages", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lcom/iqoption/core/microservices/kyc/response/SavePhoneResult;", "equals", "other", "", "hashCode", "", "toString", "core_release"})
/* compiled from: SavePhoneResult.kt */
public final class d implements c {
    @SerializedName("message")
    private final List<String> anc;
    @SerializedName("isSuccessful")
    private final Boolean buF;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.anc, r3.anc) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.kyc.response.d;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.kyc.response.d) r3;
        r0 = r2.buF;
        r1 = r3.buF;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.kyc.response.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Boolean bool = this.buF;
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
        stringBuilder.append("SavePhoneResult(isSuccessfulInternal=");
        stringBuilder.append(this.buF);
        stringBuilder.append(", messages=");
        stringBuilder.append(this.anc);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public boolean isSuccessful() {
        Boolean bool = this.buF;
        return bool != null ? bool.booleanValue() : true;
    }

    public String getMessage() {
        List list = this.anc;
        if (list != null) {
            String str = (String) u.bV(list);
            if (str != null) {
                return str;
            }
        }
        return "";
    }
}
