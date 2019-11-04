package com.iqoption.core.microservices.auth;

import com.iqoption.core.microservices.auth.response.VerifyMethod;
import com.iqoption.core.util.t;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/util/Json;", "invoke"})
/* compiled from: AuthRequestsV2.kt */
final class AuthRequestsV2$verify$body$1 extends Lambda implements b<t, l> {
    final /* synthetic */ String $code;
    final /* synthetic */ VerifyMethod $method;
    final /* synthetic */ String $token;

    AuthRequestsV2$verify$body$1(String str, VerifyMethod verifyMethod, String str2) {
        this.$token = str;
        this.$method = verifyMethod;
        this.$code = str2;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        a((t) obj);
        return l.eVB;
    }

    public final void a(t tVar) {
        kotlin.jvm.internal.i.f(tVar, "$receiver");
        tVar.n("token", this.$token);
        tVar.n("method", this.$method);
        tVar.n("code", this.$code);
    }
}
