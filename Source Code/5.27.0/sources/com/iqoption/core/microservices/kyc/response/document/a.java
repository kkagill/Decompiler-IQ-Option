package com.iqoption.core.microservices.kyc.response.document;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/document/DocumentUploadedResult;", "", "result", "", "userId", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "getResult", "()Ljava/lang/String;", "getUserId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/iqoption/core/microservices/kyc/response/document/DocumentUploadedResult;", "equals", "", "other", "hashCode", "", "toString", "core_release"})
@o
/* compiled from: DocumentUploadedResult.kt */
public final class a {
    @SerializedName("result")
    private final String bss;
    @SerializedName("user_id")
    private final Long userId;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.userId, r3.userId) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.kyc.response.document.a;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.kyc.response.document.a) r3;
        r0 = r2.bss;
        r1 = r3.bss;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.userId;
        r3 = r3.userId;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.kyc.response.document.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.bss;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.userId;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DocumentUploadedResult(result=");
        stringBuilder.append(this.bss);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}