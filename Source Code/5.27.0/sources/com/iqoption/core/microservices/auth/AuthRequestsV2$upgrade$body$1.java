package com.iqoption.core.microservices.auth;

import com.iqoption.core.util.t;
import java.util.Arrays;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/util/Json;", "invoke"})
/* compiled from: AuthRequestsV2.kt */
final class AuthRequestsV2$upgrade$body$1 extends Lambda implements b<t, l> {
    final /* synthetic */ String[] $accepted;
    final /* synthetic */ Long $countryId;
    final /* synthetic */ String $identifier;
    final /* synthetic */ String $password;
    final /* synthetic */ String $token;

    AuthRequestsV2$upgrade$body$1(String[] strArr, String str, String str2, String str3, Long l) {
        this.$accepted = strArr;
        this.$identifier = str;
        this.$password = str2;
        this.$token = str3;
        this.$countryId = l;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        a((t) obj);
        return l.eVB;
    }

    public final void a(t tVar) {
        kotlin.jvm.internal.i.f(tVar, "$receiver");
        String[] strArr = this.$accepted;
        tVar.n("accepted", tVar.q(Arrays.copyOf(strArr, strArr.length)));
        tVar.n("identifier", this.$identifier);
        tVar.n("password", this.$password);
        tVar.n("token", this.$token);
        tVar.n("country_id", this.$countryId);
    }
}
