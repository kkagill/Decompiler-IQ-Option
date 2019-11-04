package com.iqoption.core.microservices.core.register.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0006\u0010\u0015\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0011J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/microservices/core/register/response/RegisterCheckResponse;", "", "()V", "result", "Lcom/iqoption/core/microservices/core/register/response/RegisterCheckResponse$Result;", "message", "", "", "(Lcom/iqoption/core/microservices/core/register/response/RegisterCheckResponse$Result;Ljava/util/List;)V", "getMessage", "()Ljava/util/List;", "getResult", "()Lcom/iqoption/core/microservices/core/register/response/RegisterCheckResponse$Result;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "isLoggedIn", "isNotRegistered", "toString", "Companion", "Result", "core_release"})
/* compiled from: RegisterCheckResponse.kt */
public final class a {
    public static final a brZ = new a();
    @SerializedName(alternate = {"Result"}, value = "result")
    private final b brY;
    @SerializedName("message")
    private final List<String> message;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/core/microservices/core/register/response/RegisterCheckResponse$Companion;", "", "()V", "STATUS_LOGGED_IN", "", "STATUS_NOT_ACTIVATED", "STATUS_NOT_REGISTERED", "STATUS_REGISTERED", "STATUS_UNKNOWN", "core_release"})
    /* compiled from: RegisterCheckResponse.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, bng = {"Lcom/iqoption/core/microservices/core/register/response/RegisterCheckResponse$Result;", "", "()V", "status", "", "(I)V", "isEmpty", "", "()Z", "getStatus", "()I", "component1", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "core_release"})
    /* compiled from: RegisterCheckResponse.kt */
    public static final class b {
        private static final b bsa = new b();
        public static final a bsb = new a();
        private final boolean aOE;
        @SerializedName("status")
        private final int status;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/core/register/response/RegisterCheckResponse$Result$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/microservices/core/register/response/RegisterCheckResponse$Result;", "getEMPTY", "()Lcom/iqoption/core/microservices/core/register/response/RegisterCheckResponse$Result;", "core_release"})
        /* compiled from: RegisterCheckResponse.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            public final b acY() {
                return b.bsa;
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    if ((this.status == ((b) obj).status ? 1 : null) != null) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.status;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Result(status=");
            stringBuilder.append(this.status);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public b(int i) {
            this.status = i;
            this.aOE = ((b) this) == bsa;
        }

        public final int getStatus() {
            return this.status;
        }

        public b() {
            this(-1);
        }
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.message, r3.message) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.core.register.response.a;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.core.register.response.a) r3;
        r0 = r2.brY;
        r1 = r3.brY;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.message;
        r3 = r3.message;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.core.register.response.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        b bVar = this.brY;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        List list = this.message;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RegisterCheckResponse(result=");
        stringBuilder.append(this.brY);
        stringBuilder.append(", message=");
        stringBuilder.append(this.message);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(b bVar, List<String> list) {
        kotlin.jvm.internal.i.f(bVar, "result");
        kotlin.jvm.internal.i.f(list, "message");
        this.brY = bVar;
        this.message = list;
    }

    public /* synthetic */ a(b bVar, List list, int i, f fVar) {
        if ((i & 1) != 0) {
            bVar = b.bsb.acY();
        }
        if ((i & 2) != 0) {
            list = m.emptyList();
        }
        this(bVar, list);
    }

    public final List<String> Zk() {
        return this.message;
    }

    public a() {
        this(b.bsb.acY(), null, 2, null);
    }

    public final boolean acV() {
        return this.brY.getStatus() == 2;
    }

    public final boolean acW() {
        return this.brY.getStatus() == 0;
    }
}
