package com.iqoption.core.microservices.auth.response;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, bng = {"Lcom/iqoption/core/microservices/auth/response/Session;", "", "()V", "id", "", "data", "Lcom/iqoption/core/microservices/auth/response/SessionData;", "expiresAt", "", "expiresCacheAt", "(Ljava/lang/String;Lcom/iqoption/core/microservices/auth/response/SessionData;JJ)V", "getData", "()Lcom/iqoption/core/microservices/auth/response/SessionData;", "getExpiresAt", "()J", "getExpiresCacheAt", "getId", "()Ljava/lang/String;", "parsedUserAgentString", "getParsedUserAgentString", "setParsedUserAgentString", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"})
/* compiled from: SessionResponses.kt */
public final class g {
    private String blW;
    @SerializedName("data")
    private final h blX;
    @SerializedName("expires_cache_at")
    private final long blY;
    @SerializedName("expires_at")
    private final long expiresAt;
    @SerializedName("id")
    private final String id;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (kotlin.jvm.internal.i.y(this.id, gVar.id) && kotlin.jvm.internal.i.y(this.blX, gVar.blX)) {
                    if ((this.expiresAt == gVar.expiresAt ? 1 : null) != null) {
                        if ((this.blY == gVar.blY ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        h hVar = this.blX;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        long j = this.expiresAt;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.blY;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Session(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", data=");
        stringBuilder.append(this.blX);
        stringBuilder.append(", expiresAt=");
        stringBuilder.append(this.expiresAt);
        stringBuilder.append(", expiresCacheAt=");
        stringBuilder.append(this.blY);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public g(String str, h hVar, long j, long j2) {
        kotlin.jvm.internal.i.f(str, "id");
        kotlin.jvm.internal.i.f(hVar, "data");
        this.id = str;
        this.blX = hVar;
        this.expiresAt = j;
        this.blY = j2;
        this.blW = "";
    }

    public final String getId() {
        return this.id;
    }

    public final h Zn() {
        return this.blX;
    }

    public final String Zm() {
        return this.blW;
    }

    public final void gf(String str) {
        kotlin.jvm.internal.i.f(str, "<set-?>");
        this.blW = str;
    }

    public g() {
        this("", new h(), 0, 0);
    }
}
