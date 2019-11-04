package com.iqoption.core.manager;

import com.iqoption.core.microservices.core.register.SocialTypeId;
import io.reactivex.p;
import io.reactivex.t;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J;\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\fJ(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u0017H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u001dH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u001fH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020!H\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010#\u001a\u00020$H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010#\u001a\u00020$H\u0016¨\u0006&"}, bng = {"Lcom/iqoption/core/manager/OldAuthProvider;", "Lcom/iqoption/core/manager/AuthProvider;", "()V", "_login", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "email", "", "password", "code", "isCodeResend", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/Single;", "_socialAuth", "socialId", "Lcom/iqoption/core/microservices/core/register/SocialTypeId;", "userSocialId", "accessToken", "anonymRegister", "endTrial", "authInfo", "Lcom/iqoption/core/manager/EndTrialAuthInfo;", "login", "Lcom/iqoption/core/manager/LoginAuthInfo;", "loginSocial", "Lcom/iqoption/core/manager/CheckSocialAuthInfo;", "passwordChange", "Lcom/iqoption/core/manager/ChangePasswordAuthInfo;", "passwordRecovery", "Lcom/iqoption/core/manager/RecoveryAuthInfo;", "register", "Lcom/iqoption/core/manager/RegisterAuthInfo;", "registerSocial", "Lcom/iqoption/core/manager/SocialAuthInfo;", "resendCode", "verifyInfo", "Lcom/iqoption/core/manager/VerifyInfo;", "verify", "core_release"})
/* compiled from: OldAuthProvider.kt */
public final class x implements j {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthResult;", "it", "Lcom/iqoption/core/microservices/auth/response/LoginResponse;", "apply"})
    /* compiled from: OldAuthProvider.kt */
    static final class a<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ String $password;
        final /* synthetic */ String bkf;

        a(String str, String str2) {
            this.bkf = str;
            this.$password = str2;
        }

        /* JADX WARNING: Missing block: B:42:0x00b5, code skipped:
            if (r14 != null) goto L_0x00ba;
     */
        /* renamed from: a */
        public final com.iqoption.core.manager.l apply(com.iqoption.core.microservices.auth.response.c r14) {
            /*
            r13 = this;
            r0 = "it";
            kotlin.jvm.internal.i.f(r14, r0);
            r0 = r14.Zh();
            r0 = r0.isEmpty();
            if (r0 == 0) goto L_0x0017;
        L_0x000f:
            r14 = new com.iqoption.core.manager.m;
            r14.<init>();
            r14 = (com.iqoption.core.manager.l) r14;
            return r14;
        L_0x0017:
            r0 = r14.Zh();
            r0 = kotlin.collections.u.bV(r0);
            r0 = (com.iqoption.core.microservices.auth.response.b) r0;
            r1 = 3;
            r2 = 0;
            if (r0 == 0) goto L_0x00f0;
        L_0x0025:
            r3 = r0.getCode();
            if (r3 == r1) goto L_0x00e4;
        L_0x002b:
            r1 = 202; // 0xca float:2.83E-43 double:1.0E-321;
            if (r3 == r1) goto L_0x00d8;
        L_0x002f:
            r1 = 100;
            if (r3 == r1) goto L_0x0094;
        L_0x0033:
            r1 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
            if (r3 == r1) goto L_0x0094;
        L_0x0037:
            r1 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
            r4 = "ttl";
            r5 = 0;
            if (r3 == r1) goto L_0x0071;
        L_0x0040:
            r1 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
            if (r3 == r1) goto L_0x0052;
        L_0x0044:
            r14 = new com.iqoption.core.manager.d;
            r0 = r0.getTitle();
            r1 = 2;
            r14.<init>(r0, r2, r1, r2);
            r14 = (com.iqoption.core.manager.l) r14;
            goto L_0x00ef;
        L_0x0052:
            r14 = r14.Zg();
            if (r14 == 0) goto L_0x0068;
        L_0x0058:
            r14 = r14.get(r4);
            if (r14 == 0) goto L_0x0068;
        L_0x005e:
            r14 = r14.getAsJsonPrimitive();
            if (r14 == 0) goto L_0x0068;
        L_0x0064:
            r5 = r14.getAsLong();
        L_0x0068:
            r14 = new com.iqoption.core.manager.h;
            r14.<init>(r5);
            r14 = (com.iqoption.core.manager.l) r14;
            goto L_0x00ef;
        L_0x0071:
            r14 = r14.Zg();
            if (r14 == 0) goto L_0x0087;
        L_0x0077:
            r14 = r14.get(r4);
            if (r14 == 0) goto L_0x0087;
        L_0x007d:
            r14 = r14.getAsJsonPrimitive();
            if (r14 == 0) goto L_0x0087;
        L_0x0083:
            r5 = r14.getAsLong();
        L_0x0087:
            r8 = r5;
            r14 = new com.iqoption.core.manager.c;
            r10 = 0;
            r11 = 2;
            r12 = 0;
            r7 = r14;
            r7.<init>(r8, r10, r11, r12);
            r14 = (com.iqoption.core.manager.l) r14;
            goto L_0x00ef;
        L_0x0094:
            r0 = com.iqoption.core.data.d.a.bdi;
            r1 = java.lang.System.currentTimeMillis();
            r0.aC(r1);
            r14 = r14.Zg();
            if (r14 == 0) goto L_0x00b8;
        L_0x00a3:
            r0 = "phone";
            r14 = r14.get(r0);
            if (r14 == 0) goto L_0x00b8;
        L_0x00ab:
            r14 = r14.getAsJsonPrimitive();
            if (r14 == 0) goto L_0x00b8;
        L_0x00b1:
            r14 = r14.getAsString();
            if (r14 == 0) goto L_0x00b8;
        L_0x00b7:
            goto L_0x00ba;
        L_0x00b8:
            r14 = "";
        L_0x00ba:
            r1 = r14;
            r14 = new com.iqoption.core.manager.b;
            r2 = 0;
            r3 = 0;
            r0 = new com.iqoption.core.manager.q;
            r5 = r13.bkf;
            r6 = r13.$password;
            r7 = 0;
            r8 = 4;
            r9 = 0;
            r4 = r0;
            r4.<init>(r5, r6, r7, r8, r9);
            r4 = r0;
            r4 = (com.iqoption.core.manager.e) r4;
            r5 = 6;
            r6 = 0;
            r0 = r14;
            r0.<init>(r1, r2, r3, r4, r5, r6);
            r14 = (com.iqoption.core.manager.l) r14;
            goto L_0x00ef;
        L_0x00d8:
            r14 = new com.iqoption.core.manager.g;
            r0 = r0.getTitle();
            r14.<init>(r0);
            r14 = (com.iqoption.core.manager.l) r14;
            goto L_0x00ef;
        L_0x00e4:
            r14 = new com.iqoption.core.manager.a;
            r0 = r0.getTitle();
            r14.<init>(r0);
            r14 = (com.iqoption.core.manager.l) r14;
        L_0x00ef:
            return r14;
        L_0x00f0:
            r14 = new com.iqoption.core.manager.d;
            r14.<init>(r2, r2, r1, r2);
            r14 = (com.iqoption.core.manager.l) r14;
            return r14;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.manager.x$a.apply(com.iqoption.core.microservices.auth.response.c):com.iqoption.core.manager.l");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthResult;", "it", "Lcom/iqoption/core/microservices/core/register/response/RegisterCheckResponse;", "apply"})
    /* compiled from: OldAuthProvider.kt */
    static final class b<T, R> implements io.reactivex.b.g<T, R> {
        public static final b bkg = new b();

        b() {
        }

        /* renamed from: a */
        public final l apply(com.iqoption.core.microservices.core.register.response.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            if (aVar.acV()) {
                return new m();
            }
            if (aVar.acW()) {
                return new ab();
            }
            return new d((String) u.bV(aVar.Zk()), null, 2, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthResult;", "it", "Lcom/iqoption/core/microservices/core/register/response/RegisterTrialResponse;", "apply"})
    /* compiled from: OldAuthProvider.kt */
    static final class c<T, R> implements io.reactivex.b.g<T, R> {
        public static final c bkh = new c();

        c() {
        }

        /* renamed from: a */
        public final l apply(com.iqoption.core.microservices.core.register.response.c cVar) {
            kotlin.jvm.internal.i.f(cVar, "it");
            if (cVar.isSuccessful()) {
                return new m();
            }
            return new d((String) u.bV(cVar.Zk()), null, 2, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "it", "Lcom/iqoption/core/microservices/core/register/response/RegisterResponse;", "apply", "com/iqoption/core/manager/OldAuthProvider$endTrial$1$1"})
    /* compiled from: OldAuthProvider.kt */
    static final class d<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ p bki;
        final /* synthetic */ x bkj;

        d(p pVar, x xVar) {
            this.bki = pVar;
            this.bkj = xVar;
        }

        /* renamed from: a */
        public final p<? extends l> apply(com.iqoption.core.microservices.core.register.response.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            if (bVar.isSuccessful()) {
                p<? extends l> cI = p.cI(new m());
                kotlin.jvm.internal.i.e(cI, "Single.just(AuthSuccess())");
                return cI;
            } else if (bVar.getCode() == 4) {
                return x.a(this.bkj, this.bki.getIdentifier(), this.bki.getPassword(), null, null, 12, null);
            } else {
                p cI2 = p.cI(new d((String) u.bV(bVar.getMessages()), null, 2, null));
                kotlin.jvm.internal.i.e(cI2, "Single.just(AuthError(it.messages.firstOrNull()))");
                return cI2;
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthRecovery;", "it", "", "apply"})
    /* compiled from: OldAuthProvider.kt */
    static final class e<T, R> implements io.reactivex.b.g<T, R> {
        public static final e bkk = new e();

        e() {
        }

        /* renamed from: fX */
        public final k apply(String str) {
            kotlin.jvm.internal.i.f(str, "it");
            return new k(str);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "it", "Lcom/iqoption/core/microservices/core/register/response/RegisterResponse;", "apply", "com/iqoption/core/manager/OldAuthProvider$register$1$1"})
    /* compiled from: OldAuthProvider.kt */
    static final class f<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ x bkj;
        final /* synthetic */ z bkl;

        f(z zVar, x xVar) {
            this.bkl = zVar;
            this.bkj = xVar;
        }

        /* renamed from: a */
        public final p<? extends l> apply(com.iqoption.core.microservices.core.register.response.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            if (bVar.isSuccessful()) {
                p<? extends l> cI = p.cI(new m());
                kotlin.jvm.internal.i.e(cI, "Single.just(AuthSuccess())");
                return cI;
            } else if (bVar.getCode() == 4) {
                return x.a(this.bkj, this.bkl.getIdentifier(), this.bkl.getPassword(), null, null, 12, null);
            } else {
                p cI2 = p.cI(new d((String) u.bV(bVar.getMessages()), null, 2, null));
                kotlin.jvm.internal.i.e(cI2, "Single.just(AuthError(it.messages.firstOrNull()))");
                return cI2;
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "it", "Lcom/iqoption/core/microservices/core/register/response/RegisterResponse;", "apply", "com/iqoption/core/manager/OldAuthProvider$registerSocial$1$1"})
    /* compiled from: OldAuthProvider.kt */
    static final class g<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ x bkj;
        final /* synthetic */ aa bkm;

        g(aa aaVar, x xVar) {
            this.bkm = aaVar;
            this.bkj = xVar;
        }

        /* renamed from: a */
        public final p<? extends l> apply(com.iqoption.core.microservices.core.register.response.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            if (bVar.isSuccessful()) {
                return this.bkj.a(this.bkm.Yx(), this.bkm.Yy(), this.bkm.YA());
            }
            if (bVar.getCode() == 4) {
                p<? extends l> cI = p.cI(new m());
                kotlin.jvm.internal.i.e(cI, "Single.just(AuthSuccess())");
                return cI;
            }
            p cI2 = p.cI(new d((String) u.bV(bVar.getMessages()), null, 2, null));
            kotlin.jvm.internal.i.e(cI2, "Single.just(AuthError(it.messages.firstOrNull()))");
            return cI2;
        }
    }

    public p<l> a(y yVar) {
        kotlin.jvm.internal.i.f(yVar, "authInfo");
        p t = com.iqoption.core.microservices.auth.a.blA.ga(yVar.getIdentifier()).t(e.bkk);
        kotlin.jvm.internal.i.e(t, "AuthRequests.passwordRec…it)\n                    }");
        return t;
    }

    public p<l> a(z zVar) {
        kotlin.jvm.internal.i.f(zVar, "authInfo");
        p q = com.iqoption.core.microservices.core.register.a.brS.a(zVar.getFirstName(), zVar.getLastName(), zVar.getIdentifier(), zVar.getPassword(), zVar.YD(), zVar.YC(), zVar.YB()).q(new f(zVar, this));
        kotlin.jvm.internal.i.e(q, "RegisterRequests\n       …  }\n                    }");
        return q;
    }

    public p<l> a(p pVar) {
        kotlin.jvm.internal.i.f(pVar, "authInfo");
        p q = com.iqoption.core.microservices.core.register.a.brS.a(pVar.getIdentifier(), pVar.getPassword(), pVar.YD(), pVar.YC(), pVar.YB()).q(new d(pVar, this));
        kotlin.jvm.internal.i.e(q, "RegisterRequests.endTria…  }\n                    }");
        return q;
    }

    public p<l> Yo() {
        p t = com.iqoption.core.microservices.core.register.a.brS.Yo().t(c.bkh);
        kotlin.jvm.internal.i.e(t, "RegisterRequests.anonymR…      }\n                }");
        return t;
    }

    public p<l> a(aa aaVar) {
        kotlin.jvm.internal.i.f(aaVar, "authInfo");
        p q = com.iqoption.core.microservices.core.register.a.brS.a(aaVar.getFirstName(), aaVar.getLastName(), aaVar.getEmail(), aaVar.Yx(), aaVar.Yy(), aaVar.YA(), aaVar.YD(), aaVar.YC(), aaVar.YB()).q(new g(aaVar, this));
        kotlin.jvm.internal.i.e(q, "RegisterRequests.registe…  }\n                    }");
        return q;
    }

    public p<l> a(o oVar) {
        kotlin.jvm.internal.i.f(oVar, "authInfo");
        return a(oVar.Yx(), oVar.Yy(), oVar.YA());
    }

    private final p<l> a(SocialTypeId socialTypeId, String str, String str2) {
        p t = com.iqoption.core.microservices.core.register.a.brS.b(socialTypeId, str, str2).t(b.bkg);
        kotlin.jvm.internal.i.e(t, "RegisterRequests.registe…      }\n                }");
        return t;
    }

    public p<l> a(q qVar) {
        kotlin.jvm.internal.i.f(qVar, "authInfo");
        return a(this, qVar.getIdentifier(), qVar.getPassword(), null, null, 12, null);
    }

    public p<l> b(af afVar) {
        kotlin.jvm.internal.i.f(afVar, "verifyInfo");
        if (afVar.Yf() instanceof q) {
            return a(this, ((q) afVar.Yf()).getIdentifier(), ((q) afVar.Yf()).getPassword(), afVar.getCode(), null, 8, null);
        }
        p cI = p.cI(new d(null, null, 3, null));
        kotlin.jvm.internal.i.e(cI, "Single.just(AuthError())");
        return cI;
    }

    public p<l> a(af afVar) {
        kotlin.jvm.internal.i.f(afVar, "verifyInfo");
        if (afVar.Yf() instanceof q) {
            return a(this, ((q) afVar.Yf()).getIdentifier(), ((q) afVar.Yf()).getPassword(), null, Boolean.valueOf(true), 4, null);
        }
        p cI = p.cI(new d(null, null, 3, null));
        kotlin.jvm.internal.i.e(cI, "Single.just(AuthError())");
        return cI;
    }

    static /* synthetic */ p a(x xVar, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = (String) null;
        }
        if ((i & 8) != 0) {
            bool = (Boolean) null;
        }
        return xVar.a(str, str2, str3, bool);
    }

    private final p<l> a(String str, String str2, String str3, Boolean bool) {
        p t = com.iqoption.core.microservices.auth.a.blA.b(str, str2, str3, bool).t(new a(str, str2));
        kotlin.jvm.internal.i.e(t, "AuthRequests\n           …      }\n                }");
        return t;
    }
}
