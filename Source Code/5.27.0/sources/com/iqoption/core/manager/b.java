package com.iqoption.core.manager;

import com.iqoption.core.microservices.auth.response.VerifyMethod;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, bng = {"Lcom/iqoption/core/manager/Auth2FAEnterCode;", "Lcom/iqoption/core/manager/AuthResult;", "phoneMask", "", "method", "Lcom/iqoption/core/microservices/auth/response/VerifyMethod;", "token", "authInfo", "Lcom/iqoption/core/manager/AuthInfo;", "(Ljava/lang/String;Lcom/iqoption/core/microservices/auth/response/VerifyMethod;Ljava/lang/String;Lcom/iqoption/core/manager/AuthInfo;)V", "getAuthInfo", "()Lcom/iqoption/core/manager/AuthInfo;", "getMethod", "()Lcom/iqoption/core/microservices/auth/response/VerifyMethod;", "getPhoneMask", "()Ljava/lang/String;", "getToken", "core_release"})
/* compiled from: AuthResult.kt */
public final class b extends l {
    private final VerifyMethod biR;
    private final e biS;
    private final String phoneMask;
    private final String sw;

    public final String Yd() {
        return this.phoneMask;
    }

    public /* synthetic */ b(String str, VerifyMethod verifyMethod, String str2, e eVar, int i, f fVar) {
        if ((i & 2) != 0) {
            verifyMethod = VerifyMethod.SMS;
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        this(str, verifyMethod, str2, eVar);
    }

    public final VerifyMethod Ye() {
        return this.biR;
    }

    public final String getToken() {
        return this.sw;
    }

    public b(String str, VerifyMethod verifyMethod, String str2, e eVar) {
        kotlin.jvm.internal.i.f(str, "phoneMask");
        kotlin.jvm.internal.i.f(verifyMethod, "method");
        kotlin.jvm.internal.i.f(str2, "token");
        kotlin.jvm.internal.i.f(eVar, "authInfo");
        super();
        this.phoneMask = str;
        this.biR = verifyMethod;
        this.sw = str2;
        this.biS = eVar;
    }

    public final e Yf() {
        return this.biS;
    }
}
