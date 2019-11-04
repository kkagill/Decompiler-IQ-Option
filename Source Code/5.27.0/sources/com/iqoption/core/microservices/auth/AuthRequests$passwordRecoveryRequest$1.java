package com.iqoption.core.microservices.auth;

import com.iqoption.core.ext.d;
import com.iqoption.core.microservices.auth.response.f;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "it", "invoke"})
/* compiled from: AuthRequests.kt */
final class AuthRequests$passwordRecoveryRequest$1 extends Lambda implements b<String, String> {
    public static final AuthRequests$passwordRecoveryRequest$1 blE = new AuthRequests$passwordRecoveryRequest$1();

    AuthRequests$passwordRecoveryRequest$1() {
        super(1);
    }

    /* renamed from: fn */
    public final String invoke(String str) {
        kotlin.jvm.internal.i.f(str, "it");
        return (String) ((f) d.b(str, f.class, null, 2, null)).Zk().get(0);
    }
}
