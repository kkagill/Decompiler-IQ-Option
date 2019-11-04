package com.iqoption.core.microservices.auth.response;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, bng = {"Lcom/iqoption/core/microservices/auth/response/VerifyResponse;", "", "code", "Lcom/iqoption/core/microservices/auth/response/AuthCode;", "token", "", "ssid", "identifier", "ttl", "", "(Lcom/iqoption/core/microservices/auth/response/AuthCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getCode", "()Lcom/iqoption/core/microservices/auth/response/AuthCode;", "getIdentifier", "()Ljava/lang/String;", "getSsid", "getToken", "getTtl", "()J", "core_release"})
/* compiled from: VerifyResponse.kt */
public final class k {
    @SerializedName("ttl")
    private final long biT;
    @SerializedName("code")
    private final AuthCode blP;
    @SerializedName("identifier")
    private final String identifier;
    @SerializedName("ssid")
    private final String ssid;
    @SerializedName("token")
    private final String sw;

    public final AuthCode Zi() {
        return this.blP;
    }

    public final String getToken() {
        return this.sw;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final long Zj() {
        return this.biT;
    }
}
