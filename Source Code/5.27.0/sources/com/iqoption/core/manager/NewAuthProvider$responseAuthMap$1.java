package com.iqoption.core.manager;

import com.iqoption.core.data.d.a;
import com.iqoption.core.microservices.auth.response.VerifyMethod;
import com.iqoption.core.microservices.auth.response.VerifyType;
import com.iqoption.core.microservices.auth.response.d;
import com.iqoption.core.microservices.auth.response.k;
import io.reactivex.b.g;
import io.reactivex.p;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "loginResponse", "Lcom/iqoption/core/microservices/auth/response/LoginResponseV2;", "invoke"})
/* compiled from: NewAuthProvider.kt */
final class NewAuthProvider$responseAuthMap$1 extends Lambda implements b<d, p<l>> {
    final /* synthetic */ e $authInfo;
    final /* synthetic */ t this$0;

    NewAuthProvider$responseAuthMap$1(t tVar, e eVar) {
        this.this$0 = tVar;
        this.$authInfo = eVar;
        super(1);
    }

    /* renamed from: b */
    public final p<l> invoke(final d dVar) {
        kotlin.jvm.internal.i.f(dVar, "loginResponse");
        if (u.axg[dVar.Zi().ordinal()] != 1) {
            return p.cI(this.this$0.bjY.invoke(dVar));
        }
        e eVar = this.$authInfo;
        VerifyMethod Ye = dVar.Ye();
        if (Ye == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        VerifyType a = eVar.a(Ye);
        com.iqoption.core.microservices.auth.b bVar = com.iqoption.core.microservices.auth.b.blF;
        String token = dVar.getToken();
        if (token == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return com.iqoption.core.microservices.auth.b.a(bVar, a, token, dVar.Ye(), null, 8, null).t(new g<T, R>(this) {
            final /* synthetic */ NewAuthProvider$responseAuthMap$1 bkc;

            /* renamed from: a */
            public final l apply(k kVar) {
                kotlin.jvm.internal.i.f(kVar, "verifyResponse");
                int i = u.aob[kVar.Zi().ordinal()];
                int i2 = 1;
                if (i == 1) {
                    CharSequence token = kVar.getToken();
                    if (!(token == null || token.length() == 0)) {
                        i2 = 0;
                    }
                    if (i2 != 0) {
                        return new m();
                    }
                    a.bdi.aC(System.currentTimeMillis());
                    VerifyMethod Ye = dVar.Ye();
                    String token2 = kVar.getToken();
                    String identifier = kVar.getIdentifier();
                    if (identifier == null) {
                        identifier = "";
                    }
                    return new b(identifier, Ye, token2, this.bkc.$authInfo);
                } else if (i != 2) {
                    return new d(null, kVar.Zi().toString(), 1, null);
                } else {
                    return new c(kVar.Zj(), null, 2, null);
                }
            }
        });
    }
}
