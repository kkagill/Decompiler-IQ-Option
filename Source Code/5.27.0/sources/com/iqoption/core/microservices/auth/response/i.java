package com.iqoption.core.microservices.auth.response;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, bng = {"Lcom/iqoption/core/microservices/auth/response/SessionsResponse;", "", "()V", "sessions", "", "Lcom/iqoption/core/microservices/auth/response/Session;", "(Ljava/util/List;)V", "getSessions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
/* compiled from: SessionResponses.kt */
public final class i {
    @SerializedName("sessions")
    private final List<g> bmb;

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.bmb, ((com.iqoption.core.microservices.auth.response.i) r2).bmb) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.core.microservices.auth.response.i;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.core.microservices.auth.response.i) r2;
        r0 = r1.bmb;
        r2 = r2.bmb;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.auth.response.i.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List list = this.bmb;
        return list != null ? list.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SessionsResponse(sessions=");
        stringBuilder.append(this.bmb);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public i(List<g> list) {
        kotlin.jvm.internal.i.f(list, "sessions");
        this.bmb = list;
    }

    public final List<g> Zp() {
        return this.bmb;
    }

    public i() {
        List emptyList = Collections.emptyList();
        kotlin.jvm.internal.i.e(emptyList, "Collections.emptyList()");
        this(emptyList);
    }
}
