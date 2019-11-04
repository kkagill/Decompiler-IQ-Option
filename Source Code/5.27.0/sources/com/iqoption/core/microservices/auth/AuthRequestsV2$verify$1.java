package com.iqoption.core.microservices.auth;

import com.iqoption.core.ext.d;
import com.iqoption.core.microservices.auth.response.k;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/auth/response/VerifyResponse;", "it", "", "invoke"})
/* compiled from: AuthRequestsV2.kt */
final class AuthRequestsV2$verify$1 extends Lambda implements b<String, k> {
    public static final AuthRequestsV2$verify$1 blM = new AuthRequestsV2$verify$1();

    AuthRequestsV2$verify$1() {
        super(1);
    }

    /* renamed from: ge */
    public final k invoke(String str) {
        kotlin.jvm.internal.i.f(str, "it");
        return (k) d.b(str, k.class, null, 2, null);
    }
}
