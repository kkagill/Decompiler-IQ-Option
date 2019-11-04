package com.iqoption.core.microservices.auth;

import com.iqoption.core.ext.d;
import com.iqoption.core.microservices.auth.response.a;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/auth/response/AccessTokenResponse;", "it", "", "invoke"})
/* compiled from: AuthRequests.kt */
final class AuthRequests$getAccessToken$1 extends Lambda implements b<String, a> {
    public static final AuthRequests$getAccessToken$1 blC = new AuthRequests$getAccessToken$1();

    AuthRequests$getAccessToken$1() {
        super(1);
    }

    /* renamed from: gb */
    public final a invoke(String str) {
        kotlin.jvm.internal.i.f(str, "it");
        return (a) d.b(str, a.class, null, 2, null);
    }
}
