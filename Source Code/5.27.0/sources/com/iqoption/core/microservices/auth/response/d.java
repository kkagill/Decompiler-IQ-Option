package com.iqoption.core.microservices.auth.response;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, bng = {"Lcom/iqoption/core/microservices/auth/response/LoginResponseV2;", "", "code", "Lcom/iqoption/core/microservices/auth/response/AuthCode;", "method", "Lcom/iqoption/core/microservices/auth/response/VerifyMethod;", "token", "", "ssid", "ttl", "", "(Lcom/iqoption/core/microservices/auth/response/AuthCode;Lcom/iqoption/core/microservices/auth/response/VerifyMethod;Ljava/lang/String;Ljava/lang/String;J)V", "getCode", "()Lcom/iqoption/core/microservices/auth/response/AuthCode;", "getMethod", "()Lcom/iqoption/core/microservices/auth/response/VerifyMethod;", "getSsid", "()Ljava/lang/String;", "getToken", "getTtl", "()J", "core_release"})
/* compiled from: LoginResponseV2.kt */
public final class d {
    @SerializedName("method")
    private final VerifyMethod biR;
    @SerializedName("ttl")
    private final long biT;
    @SerializedName("code")
    private final AuthCode blP;
    @SerializedName("ssid")
    private final String ssid;
    @SerializedName("token")
    private final String sw;

    public final AuthCode Zi() {
        return this.blP;
    }

    public final VerifyMethod Ye() {
        return this.biR;
    }

    public final String getToken() {
        return this.sw;
    }

    public final long Zj() {
        return this.biT;
    }
}
