package com.iqoption.core.microservices.auth;

import com.iqoption.core.ext.d;
import com.iqoption.core.microservices.auth.response.c;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/auth/response/LoginResponse;", "it", "", "invoke"})
/* compiled from: AuthRequests.kt */
final class AuthRequests$login$1 extends Lambda implements b<String, c> {
    public static final AuthRequests$login$1 blD = new AuthRequests$login$1();

    AuthRequests$login$1() {
        super(1);
    }

    /* renamed from: gc */
    public final c invoke(String str) {
        kotlin.jvm.internal.i.f(str, "it");
        return (c) d.b(str, c.class, null, 2, null);
    }
}
