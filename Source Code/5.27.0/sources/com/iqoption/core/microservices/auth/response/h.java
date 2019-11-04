package com.iqoption.core.microservices.auth.response;

import com.google.gson.annotations.SerializedName;
import com.iqoption.config.Platform;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, bng = {"Lcom/iqoption/core/microservices/auth/response/SessionData;", "", "()V", "userId", "", "modified", "platform", "Lcom/iqoption/config/Platform;", "ip", "", "userAgent", "(JJLcom/iqoption/config/Platform;Ljava/lang/String;Ljava/lang/String;)V", "getIp", "()Ljava/lang/String;", "getModified", "()J", "getPlatform", "()Lcom/iqoption/config/Platform;", "getUserAgent", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"})
/* compiled from: SessionResponses.kt */
public final class h {
    @SerializedName("platform")
    private final Platform blZ;
    @SerializedName("ip")
    private final String bma;
    @SerializedName("user_agent")
    private final String userAgent;
    @SerializedName("user_id")
    private final long userId;
    @SerializedName("modified")
    private final long yQ;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if ((this.userId == hVar.userId ? 1 : null) != null) {
                    if (!((this.yQ == hVar.yQ ? 1 : null) != null && kotlin.jvm.internal.i.y(this.blZ, hVar.blZ) && kotlin.jvm.internal.i.y(this.bma, hVar.bma) && kotlin.jvm.internal.i.y(this.userAgent, hVar.userAgent))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.userId;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.yQ;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Platform platform = this.blZ;
        int i2 = 0;
        i = (i + (platform != null ? platform.hashCode() : 0)) * 31;
        String str = this.bma;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.userAgent;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SessionData(userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", modified=");
        stringBuilder.append(this.yQ);
        stringBuilder.append(", platform=");
        stringBuilder.append(this.blZ);
        stringBuilder.append(", ip=");
        stringBuilder.append(this.bma);
        stringBuilder.append(", userAgent=");
        stringBuilder.append(this.userAgent);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public h(long j, long j2, Platform platform, String str, String str2) {
        kotlin.jvm.internal.i.f(platform, "platform");
        kotlin.jvm.internal.i.f(str, "ip");
        kotlin.jvm.internal.i.f(str2, "userAgent");
        this.userId = j;
        this.yQ = j2;
        this.blZ = platform;
        this.bma = str;
        this.userAgent = str2;
    }

    public final long ki() {
        return this.yQ;
    }

    public final Platform Dx() {
        return this.blZ;
    }

    public final String Zo() {
        return this.bma;
    }

    public final String hu() {
        return this.userAgent;
    }

    public h() {
        this(0, 0, Platform.UNKNOWN, "", "");
    }
}
