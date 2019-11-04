package com.iqoption.core.microservices.core.register.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, bng = {"Lcom/iqoption/core/microservices/core/register/response/RegisterTrialResponse;", "", "()V", "isSuccessful", "", "message", "", "", "code", "", "(ZLjava/util/List;I)V", "getCode", "()I", "()Z", "getMessage", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "Companion", "core_release"})
/* compiled from: RegisterTrialResponse.kt */
public final class c {
    public static final a bsg = new a();
    @SerializedName("isSuccessful")
    private final boolean blS;
    @SerializedName("code")
    private final int code;
    @SerializedName("message")
    private final List<String> message;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/microservices/core/register/response/RegisterTrialResponse$Companion;", "", "()V", "CODE_UNKNOWN", "", "core_release"})
    /* compiled from: RegisterTrialResponse.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if ((this.blS == cVar.blS ? 1 : null) != null && kotlin.jvm.internal.i.y(this.message, cVar.message)) {
                    if ((this.code == cVar.code ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.blS;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        List list = this.message;
        return ((i + (list != null ? list.hashCode() : 0)) * 31) + this.code;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RegisterTrialResponse(isSuccessful=");
        stringBuilder.append(this.blS);
        stringBuilder.append(", message=");
        stringBuilder.append(this.message);
        stringBuilder.append(", code=");
        stringBuilder.append(this.code);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public c(boolean z, List<String> list, int i) {
        kotlin.jvm.internal.i.f(list, "message");
        this.blS = z;
        this.message = list;
        this.code = i;
    }

    public final boolean isSuccessful() {
        return this.blS;
    }

    public /* synthetic */ c(boolean z, List list, int i, int i2, f fVar) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            list = m.emptyList();
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(z, list, i);
    }

    public final List<String> Zk() {
        return this.message;
    }

    public c() {
        this(false, null, 0, 6, null);
    }
}
