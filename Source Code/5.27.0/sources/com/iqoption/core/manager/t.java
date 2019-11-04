package com.iqoption.core.manager;

import com.iqoption.core.microservices.auth.response.d;
import com.iqoption.core.microservices.auth.response.k;
import io.reactivex.b.g;
import io.reactivex.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\n\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\n\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\n\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\n\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\n\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\n\u001a\u00020\u0017H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J*\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00060\u00060\b0\u00042\u0006\u0010\n\u001a\u00020\u001dH\u0002J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, bng = {"Lcom/iqoption/core/manager/NewAuthProvider;", "Lcom/iqoption/core/manager/AuthProvider;", "()V", "responseAuth", "Lkotlin/Function1;", "Lcom/iqoption/core/microservices/auth/response/LoginResponseV2;", "Lcom/iqoption/core/manager/AuthResult;", "anonymRegister", "Lio/reactivex/Single;", "endTrial", "authInfo", "Lcom/iqoption/core/manager/EndTrialAuthInfo;", "login", "Lcom/iqoption/core/manager/LoginAuthInfo;", "loginSocial", "Lcom/iqoption/core/manager/CheckSocialAuthInfo;", "passwordChange", "Lcom/iqoption/core/manager/ChangePasswordAuthInfo;", "passwordRecovery", "Lcom/iqoption/core/manager/RecoveryAuthInfo;", "register", "Lcom/iqoption/core/manager/RegisterAuthInfo;", "registerSocial", "Lcom/iqoption/core/manager/SocialAuthInfo;", "resendCode", "verifyInfo", "Lcom/iqoption/core/manager/VerifyInfo;", "responseAuthMap", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/manager/AuthInfo;", "verify", "core_release"})
/* compiled from: NewAuthProvider.kt */
public final class t implements j {
    private final kotlin.jvm.a.b<d, l> bjY = NewAuthProvider$responseAuth$1.bkb;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthResult;", "verifyResponse", "Lcom/iqoption/core/microservices/auth/response/VerifyResponse;", "apply"})
    /* compiled from: NewAuthProvider.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a bka = new a();

        a() {
        }

        /* renamed from: a */
        public final l apply(k kVar) {
            kotlin.jvm.internal.i.f(kVar, "verifyResponse");
            int i = u.bjZ[kVar.Zi().ordinal()];
            if (i == 1) {
                return new m();
            }
            if (i != 2) {
                return new d(null, kVar.Zi().toString(), 1, null);
            }
            return new c(kVar.Zj(), null, 2, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "verifyResponse", "Lcom/iqoption/core/microservices/auth/response/VerifyResponse;", "apply", "com/iqoption/core/manager/NewAuthProvider$verify$1$1"})
    /* compiled from: NewAuthProvider.kt */
    static final class b<T, R> implements g<T, io.reactivex.t<? extends R>> {
        final /* synthetic */ af bke;
        final /* synthetic */ t this$0;

        b(af afVar, t tVar) {
            this.bke = afVar;
            this.this$0 = tVar;
        }

        /* renamed from: b */
        public final p<? extends l> apply(k kVar) {
            kotlin.jvm.internal.i.f(kVar, "verifyResponse");
            int i = u.aFY[kVar.Zi().ordinal()];
            p<? extends l> cI;
            if (i == 1) {
                e Yf = this.bke.Yf();
                if (Yf instanceof q) {
                    return this.this$0.a(q.a((q) this.bke.Yf(), null, null, kVar.getToken(), 3, null));
                }
                if (Yf instanceof z) {
                    return this.this$0.a(z.a((z) this.bke.Yf(), null, null, null, null, false, null, null, kVar.getToken(), 127, null));
                }
                if (Yf instanceof p) {
                    return this.this$0.a(p.a((p) this.bke.Yf(), null, null, false, null, null, kVar.getToken(), 31, null));
                }
                if (Yf instanceof aa) {
                    return this.this$0.a(aa.a((aa) this.bke.Yf(), null, null, null, null, null, null, null, null, false, null, null, kVar.getToken(), 2047, null));
                }
                if (Yf instanceof o) {
                    return this.this$0.a(o.a((o) this.bke.Yf(), null, null, null, null, kVar.getToken(), 15, null));
                }
                if (Yf instanceof y) {
                    return this.this$0.a(y.a((y) this.bke.Yf(), null, kVar.getToken(), 1, null));
                }
                if (Yf instanceof n) {
                    return this.this$0.a(n.a((n) this.bke.Yf(), null, null, kVar.getToken(), 3, null));
                }
                throw new NoWhenBranchMatchedException();
            } else if (i == 2) {
                cI = p.cI(new a(null, 1, null));
                kotlin.jvm.internal.i.e(cI, "Single.just(Auth2FACodeError())");
                return cI;
            } else if (i != 3) {
                cI = p.cI(new d(null, kVar.Zi().toString(), 1, null));
                kotlin.jvm.internal.i.e(cI, "Single.just(AuthError(lo…esponse.code.toString()))");
                return cI;
            } else {
                cI = p.cI(new c(kVar.Zj(), null, 2, null));
                kotlin.jvm.internal.i.e(cI, "Single.just(Auth2FASendC…eded(verifyResponse.ttl))");
                return cI;
            }
        }
    }

    private final kotlin.jvm.a.b<d, p<l>> a(e eVar) {
        return new NewAuthProvider$responseAuthMap$1(this, eVar);
    }

    public p<l> a(y yVar) {
        kotlin.jvm.internal.i.f(yVar, "authInfo");
        p a = com.iqoption.core.microservices.auth.b.a(com.iqoption.core.microservices.auth.b.blF, yVar.getIdentifier(), null, 2, null);
        kotlin.jvm.a.b a2 = a((e) yVar);
        if (a2 != null) {
            a2 = new v(a2);
        }
        p q = a.q((g) a2);
        kotlin.jvm.internal.i.e(q, "AuthRequestsV2.passwordR…esponseAuthMap(authInfo))");
        return q;
    }

    public p<l> a(n nVar) {
        kotlin.jvm.internal.i.f(nVar, "authInfo");
        p n = com.iqoption.core.microservices.auth.b.blF.n(nVar.getPassword(), nVar.Yw(), nVar.getToken());
        kotlin.jvm.a.b a = a((e) nVar);
        if (a != null) {
            a = new v(a);
        }
        p q = n.q((g) a);
        kotlin.jvm.internal.i.e(q, "AuthRequestsV2.passwordC…esponseAuthMap(authInfo))");
        return q;
    }

    public p<l> a(z zVar) {
        kotlin.jvm.internal.i.f(zVar, "authInfo");
        p a = com.iqoption.core.microservices.auth.b.a(com.iqoption.core.microservices.auth.b.blF, new String[]{"terms", "privacy policy"}, zVar.getIdentifier(), zVar.getPassword(), null, null, zVar.getToken(), zVar.YC(), 24, null);
        kotlin.jvm.a.b a2 = a((e) zVar);
        if (a2 != null) {
            a2 = new v(a2);
        }
        p q = a.q((g) a2);
        kotlin.jvm.internal.i.e(q, "AuthRequestsV2.register(…esponseAuthMap(authInfo))");
        return q;
    }

    public p<l> a(p pVar) {
        kotlin.jvm.internal.i.f(pVar, "authInfo");
        p a = com.iqoption.core.microservices.auth.b.blF.a(new String[]{"terms", "privacy policy"}, pVar.getIdentifier(), pVar.getPassword(), pVar.getToken(), pVar.YC());
        kotlin.jvm.a.b a2 = a((e) pVar);
        if (a2 != null) {
            a2 = new v(a2);
        }
        p q = a.q((g) a2);
        kotlin.jvm.internal.i.e(q, "AuthRequestsV2.upgrade(\n…esponseAuthMap(authInfo))");
        return q;
    }

    public p<l> Yo() {
        p a = com.iqoption.core.microservices.auth.b.a(com.iqoption.core.microservices.auth.b.blF, new String[]{"terms", "privacy policy"}, null, null, null, null, null, null, 126, null);
        kotlin.jvm.a.b bVar = this.bjY;
        if (bVar != null) {
            bVar = new w(bVar);
        }
        a = a.t((g) bVar);
        kotlin.jvm.internal.i.e(a, "AuthRequestsV2.register(…       .map(responseAuth)");
        return a;
    }

    public p<l> a(aa aaVar) {
        kotlin.jvm.internal.i.f(aaVar, "authInfo");
        p a = com.iqoption.core.microservices.auth.b.a(com.iqoption.core.microservices.auth.b.blF, new String[]{"terms", "privacy policy"}, null, null, aaVar.Yz(), aaVar.YA(), aaVar.getToken(), aaVar.YC(), 6, null);
        kotlin.jvm.a.b a2 = a((e) aaVar);
        if (a2 != null) {
            a2 = new v(a2);
        }
        p q = a.q((g) a2);
        kotlin.jvm.internal.i.e(q, "AuthRequestsV2.register(…esponseAuthMap(authInfo))");
        return q;
    }

    public p<l> a(o oVar) {
        kotlin.jvm.internal.i.f(oVar, "authInfo");
        p o = com.iqoption.core.microservices.auth.b.blF.o(oVar.Yz(), oVar.YA(), oVar.getToken());
        kotlin.jvm.a.b a = a((e) oVar);
        if (a != null) {
            a = new v(a);
        }
        p q = o.q((g) a);
        kotlin.jvm.internal.i.e(q, "AuthRequestsV2.loginSoci…esponseAuthMap(authInfo))");
        return q;
    }

    public p<l> a(q qVar) {
        kotlin.jvm.internal.i.f(qVar, "authInfo");
        p m = com.iqoption.core.microservices.auth.b.blF.m(qVar.getIdentifier(), qVar.getPassword(), qVar.getToken());
        kotlin.jvm.a.b a = a((e) qVar);
        if (a != null) {
            a = new v(a);
        }
        p q = m.q((g) a);
        kotlin.jvm.internal.i.e(q, "AuthRequestsV2.login(\n  …esponseAuthMap(authInfo))");
        return q;
    }

    public p<l> b(af afVar) {
        kotlin.jvm.internal.i.f(afVar, "verifyInfo");
        p q = com.iqoption.core.microservices.auth.b.blF.a(afVar.YO(), afVar.getToken(), afVar.Ye(), afVar.getCode()).q(new b(afVar, this));
        kotlin.jvm.internal.i.e(q, "AuthRequestsV2.verify(\n …  }\n                    }");
        return q;
    }

    public p<l> a(af afVar) {
        kotlin.jvm.internal.i.f(afVar, "verifyInfo");
        p t = com.iqoption.core.microservices.auth.b.a(com.iqoption.core.microservices.auth.b.blF, afVar.YO(), afVar.getToken(), null, null, 12, null).t(a.bka);
        kotlin.jvm.internal.i.e(t, "AuthRequestsV2.verify(\n …      }\n                }");
        return t;
    }
}
