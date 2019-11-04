package com.iqoption.core.manager;

import com.google.gson.JsonObject;
import com.iqoption.dto.Event;
import io.reactivex.processors.PublishProcessor;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.PropertyReference1Impl;
import okhttp3.Cookie;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JI\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u000728\b\u0004\u0010(\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\b¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u001b0)H\bJ\u000e\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0016J\u0006\u00101\u001a\u000202J\f\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0016\u00104\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00105\u001a\u000206H\u0016J\u0016\u00107\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00108\u001a\u000209H\u0016J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00105\u001a\u00020;H\u0016J\u0006\u0010<\u001a\u000202J \u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010,\u001a\u00020?2\u0006\u0010-\u001a\u00020?H\u0002J \u0010@\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010,\u001a\u00020?2\u0006\u0010-\u001a\u00020?H\u0002J \u0010A\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010,\u001a\u00020?2\u0006\u0010-\u001a\u00020?H\u0002J \u0010B\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010,\u001a\u00020?2\u0006\u0010-\u001a\u00020?H\u0002J \u0010C\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010,\u001a\u00020?2\u0006\u0010-\u001a\u00020?H\u0002J\u0018\u0010D\u001a\u00020?2\u0006\u0010,\u001a\u00020?2\u0006\u0010-\u001a\u00020?H\u0002J \u0010E\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010,\u001a\u00020?2\u0006\u0010-\u001a\u00020?H\u0002J\u0016\u0010F\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00105\u001a\u00020GH\u0016J\u0016\u0010H\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00105\u001a\u00020IH\u0016J\u0006\u0010J\u001a\u000202J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00105\u001a\u00020LH\u0016J\u0016\u0010M\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00105\u001a\u00020NH\u0016J\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0016\u0010P\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020\u0016H\u0002J\b\u0010T\u001a\u00020\u0016H\u0002J\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0016\u0010Z\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010Q\u001a\u00020RH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00018FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\nR\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00160\u00160\u0019X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\nR\u0011\u0010#\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006["}, bng = {"Lcom/iqoption/core/manager/AuthManager;", "Lcom/iqoption/core/manager/AuthProvider;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "account", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/IQAccount;", "getAccount", "()Lio/reactivex/Flowable;", "accountImmediate", "getAccountImmediate", "()Lcom/iqoption/core/IQAccount;", "accountProcessor", "Lcom/iqoption/core/rx/IQBehaviorProcessor;", "authProvider", "getAuthProvider", "()Lcom/iqoption/core/manager/AuthProvider;", "authProvider$delegate", "Lkotlin/Lazy;", "beforeLogoutEvents", "", "getBeforeLogoutEvents", "beforeLogoutProcessor", "Lio/reactivex/processors/PublishProcessor;", "hasAccount", "", "getHasAccount", "hasAccountPredicate", "Lio/reactivex/functions/Predicate;", "getHasAccountPredicate", "()Lio/reactivex/functions/Predicate;", "hasSession", "getHasSession", "hasSessionImmediate", "getHasSessionImmediate", "()Z", "hasSessionProcessor", "accountChanges", "checkChanged", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "anonymRegister", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "autoLogin", "Lio/reactivex/Completable;", "balanceIdChanges", "endTrial", "authInfo", "Lcom/iqoption/core/manager/EndTrialAuthInfo;", "login", "loginAuthInfo", "Lcom/iqoption/core/manager/LoginAuthInfo;", "loginSocial", "Lcom/iqoption/core/manager/CheckSocialAuthInfo;", "logout", "mergeBooleanIfChanged", "key", "Lcom/google/gson/JsonObject;", "mergeIntIfChanged", "mergeJsonObjectIfChanged", "mergePositiveIntIfChanged", "mergePositiveLongIfChanged", "mergeProfiles", "mergeStringIfChanged", "passwordChange", "Lcom/iqoption/core/manager/ChangePasswordAuthInfo;", "passwordRecovery", "Lcom/iqoption/core/manager/RecoveryAuthInfo;", "refreshAutoLoginToken", "register", "Lcom/iqoption/core/manager/RegisterAuthInfo;", "registerSocial", "Lcom/iqoption/core/manager/SocialAuthInfo;", "regulationAndUserGroupChanges", "resendCode", "verifyInfo", "Lcom/iqoption/core/manager/VerifyInfo;", "tryRefreshAutoLoginToken", "tryUpdateHasSession", "userGroupAndbalanceIdChanges", "userGroupChanges", "userIdAndBalanceIdAndUserGroupChanges", "userIdAndBalanceIdChanges", "userIdChanges", "verify", "core_release"})
/* compiled from: AuthManager.kt */
public final class i implements j {
    private static final String TAG = i.class.getSimpleName();
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(i.class), "authProvider", "getAuthProvider()Lcom/iqoption/core/manager/AuthProvider;"))};
    private static final com.iqoption.core.rx.d<Boolean> biV = com.iqoption.core.rx.d.bER.akd();
    private static final com.iqoption.core.rx.d<com.iqoption.core.e> biW = com.iqoption.core.rx.d.bER.bQ(com.iqoption.core.e.aZu.Ur());
    private static final PublishProcessor<kotlin.l> biX;
    private static final io.reactivex.b.l<com.iqoption.core.e> biY = g.bjp;
    private static final io.reactivex.e<Boolean> biZ;
    private static final io.reactivex.e<com.iqoption.core.e> bja;
    private static final io.reactivex.e<Boolean> bjb;
    private static final kotlin.d bjc = g.c(AuthManager$authProvider$2.bjl);
    public static final i bjd = new i();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "call"})
    /* compiled from: AuthManager.kt */
    static final class l<V> implements Callable<T> {
        public static final l bju = new l();

        l() {
        }

        /* renamed from: iH */
        public final String call() {
            Cookie UL = com.iqoption.core.connect.http.c.baF.UL();
            if (UL != null) {
                String value = UL.value();
                if (value != null) {
                    return value;
                }
            }
            return "";
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthError;", "it", "", "apply"})
    /* compiled from: AuthManager.kt */
    static final class a<T, R> implements io.reactivex.b.g<Throwable, l> {
        public static final a bjj = new a();

        a() {
        }

        /* renamed from: t */
        public final d apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return new d(com.iqoption.core.d.getString(com.iqoption.core.i.k.unknown_error_occurred), th.getMessage());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AuthManager.kt */
    static final class aa<T> implements io.reactivex.b.f<l> {
        public static final aa bjH = new aa();

        aa() {
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            if (lVar instanceof m) {
                com.iqoption.core.d.EC().a("login", null);
            } else {
                com.iqoption.core.d.EC().a("login_failed", null);
            }
            i.bjd.Yl();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AuthManager.kt */
    static final class b<T> implements io.reactivex.b.f<l> {
        public static final b bjk = new b();

        b() {
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            i.bjd.Yl();
            com.iqoption.core.analytics.b W = com.iqoption.core.d.EC().W(Event.CATEGORY_SYSTEM, "registration");
            W.a((Number) Integer.valueOf(lVar instanceof m ? 1 : 0));
            W.f("connection_host", com.iqoption.core.d.EE().Va());
            W.Cc();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "old", "Lcom/iqoption/core/IQAccount;", "new", "test", "com/iqoption/core/manager/AuthManager$accountChanges$1"})
    /* compiled from: AuthManager.kt */
    public static final class c<T1, T2> implements io.reactivex.b.d<com.iqoption.core.e, com.iqoption.core.e> {
        /* renamed from: a */
        public final boolean test(com.iqoption.core.e eVar, com.iqoption.core.e eVar2) {
            kotlin.jvm.internal.i.f(eVar, "old");
            kotlin.jvm.internal.i.f(eVar2, "new");
            return eVar.DH() == eVar2.DH();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthError;", "it", "", "apply"})
    /* compiled from: AuthManager.kt */
    static final class d<T, R> implements io.reactivex.b.g<Throwable, l> {
        public static final d bjm = new d();

        d() {
        }

        /* renamed from: t */
        public final d apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return new d(com.iqoption.core.d.getString(com.iqoption.core.i.k.unknown_error_occurred), th.getMessage());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AuthManager.kt */
    static final class e<T> implements io.reactivex.b.f<l> {
        public static final e bjn = new e();

        e() {
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            if (lVar instanceof m) {
                com.iqoption.core.data.d.e.bdq.cx(true);
                com.iqoption.core.d.EC().a("login", null);
            } else {
                com.iqoption.core.d.EC().a("login_failed", null);
            }
            i.bjd.Yl();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "account", "Lcom/iqoption/core/IQAccount;", "apply"})
    /* compiled from: AuthManager.kt */
    static final class f<T, R> implements io.reactivex.b.g<T, R> {
        public static final f bjo = new f();

        f() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(d((com.iqoption.core.e) obj));
        }

        public final boolean d(com.iqoption.core.e eVar) {
            kotlin.jvm.internal.i.f(eVar, "account");
            return kotlin.jvm.internal.i.y(eVar, com.iqoption.core.e.aZu.Ur()) ^ 1;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/IQAccount;", "test"})
    /* compiled from: AuthManager.kt */
    static final class g<T> implements io.reactivex.b.l<com.iqoption.core.e> {
        public static final g bjp = new g();

        g() {
        }

        /* renamed from: e */
        public final boolean test(com.iqoption.core.e eVar) {
            kotlin.jvm.internal.i.f(eVar, "it");
            return kotlin.jvm.internal.i.y(eVar, com.iqoption.core.e.aZu.Ur()) ^ 1;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthError;", "it", "", "apply"})
    /* compiled from: AuthManager.kt */
    static final class h<T, R> implements io.reactivex.b.g<Throwable, l> {
        public static final h bjq = new h();

        h() {
        }

        /* renamed from: t */
        public final d apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return new d(com.iqoption.core.d.getString(com.iqoption.core.i.k.unknown_error_occurred), th.getMessage());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AuthManager.kt */
    static final class i<T> implements io.reactivex.b.f<l> {
        public static final i bjr = new i();

        i() {
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            if (lVar instanceof m) {
                com.iqoption.core.d.EC().a("login", null);
            } else {
                com.iqoption.core.d.EC().a("login_failed", null);
            }
            i.bjd.Yl();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthError;", "it", "", "apply"})
    /* compiled from: AuthManager.kt */
    static final class j<T, R> implements io.reactivex.b.g<Throwable, l> {
        public static final j bjs = new j();

        j() {
        }

        /* renamed from: t */
        public final d apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return new d(com.iqoption.core.d.getString(com.iqoption.core.i.k.unknown_error_occurred), th.getMessage());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AuthManager.kt */
    static final class k<T> implements io.reactivex.b.f<l> {
        public static final k bjt = new k();

        k() {
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            i.bjd.Yl();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "it", "", "apply"})
    /* compiled from: AuthManager.kt */
    static final class m<T, R> implements io.reactivex.b.g<String, io.reactivex.c> {
        public static final m bjv = new m();

        m() {
        }

        /* renamed from: fW */
        public final io.reactivex.c apply(String str) {
            kotlin.jvm.internal.i.f(str, "it");
            if ((((CharSequence) str).length() > 0 ? 1 : null) != null) {
                return io.reactivex.a.b((io.reactivex.b.a) AnonymousClass1.bjw).b((io.reactivex.c) com.iqoption.core.microservices.auth.a.blA.Yp()).a((io.reactivex.b.g) new com.iqoption.core.rx.f(0, null, null, "Logout", 7, null)).c((io.reactivex.b.a) AnonymousClass2.bjx);
            }
            return io.reactivex.a.bkL();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AuthManager.kt */
    static final class n<T> implements io.reactivex.b.f<String> {
        public static final n bjy = new n();

        n() {
        }

        /* renamed from: fa */
        public final void accept(String str) {
            com.iqoption.core.data.d.e.bdq.dD(str);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthError;", "it", "", "apply"})
    /* compiled from: AuthManager.kt */
    static final class o<T, R> implements io.reactivex.b.g<Throwable, l> {
        public static final o bjz = new o();

        o() {
        }

        /* renamed from: t */
        public final d apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return new d(com.iqoption.core.d.getString(com.iqoption.core.i.k.unknown_error_occurred), th.getMessage());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AuthManager.kt */
    static final class p<T> implements io.reactivex.b.f<l> {
        public static final p bjA = new p();

        p() {
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            boolean z = lVar instanceof m;
            int i = 1;
            if (z) {
                com.iqoption.core.data.d.e.bdq.cx(true);
            }
            i.bjd.Yl();
            com.iqoption.core.analytics.b W = com.iqoption.core.d.EC().W(Event.CATEGORY_SYSTEM, "registration");
            if (!z) {
                i = 0;
            }
            W.a((Number) Integer.valueOf(i));
            W.f("connection_host", com.iqoption.core.d.EE().Va());
            W.Cc();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthError;", "it", "", "apply"})
    /* compiled from: AuthManager.kt */
    static final class q<T, R> implements io.reactivex.b.g<Throwable, l> {
        public static final q bjB = new q();

        q() {
        }

        /* renamed from: t */
        public final d apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return new d(com.iqoption.core.d.getString(com.iqoption.core.i.k.unknown_error_occurred), th.getMessage());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AuthManager.kt */
    static final class r<T> implements io.reactivex.b.f<l> {
        public static final r bjC = new r();

        r() {
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            if (lVar instanceof m) {
                com.iqoption.core.d.EC().a("login", null);
            }
            i.bjd.Yl();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "old", "Lcom/iqoption/core/IQAccount;", "new", "test", "com/iqoption/core/manager/AuthManager$accountChanges$1"})
    /* compiled from: AuthManager.kt */
    public static final class s<T1, T2> implements io.reactivex.b.d<com.iqoption.core.e, com.iqoption.core.e> {
        /* renamed from: a */
        public final boolean test(com.iqoption.core.e eVar, com.iqoption.core.e eVar2) {
            kotlin.jvm.internal.i.f(eVar, "old");
            kotlin.jvm.internal.i.f(eVar2, "new");
            return eVar.Er() == eVar2.Er() && eVar.Et() == eVar2.Et();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthError;", "it", "", "apply"})
    /* compiled from: AuthManager.kt */
    static final class t<T, R> implements io.reactivex.b.g<Throwable, l> {
        public static final t bjD = new t();

        t() {
        }

        /* renamed from: t */
        public final d apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return new d(null, th.getMessage(), 1, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AuthManager.kt */
    static final class u<T> implements io.reactivex.b.f<String> {
        public static final u bjE = new u();

        u() {
        }

        /* renamed from: fa */
        public final void accept(String str) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AuthManager.kt */
    static final class v<T> implements io.reactivex.b.f<Throwable> {
        public static final v bjF = new v();

        v() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "old", "Lcom/iqoption/core/IQAccount;", "new", "test", "com/iqoption/core/manager/AuthManager$accountChanges$1"})
    /* compiled from: AuthManager.kt */
    public static final class w<T1, T2> implements io.reactivex.b.d<com.iqoption.core.e, com.iqoption.core.e> {
        /* renamed from: a */
        public final boolean test(com.iqoption.core.e eVar, com.iqoption.core.e eVar2) {
            kotlin.jvm.internal.i.f(eVar, "old");
            kotlin.jvm.internal.i.f(eVar2, "new");
            return eVar.DH() == eVar2.DH() && eVar.Et() == eVar2.Et();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "old", "Lcom/iqoption/core/IQAccount;", "new", "test", "com/iqoption/core/manager/AuthManager$accountChanges$1"})
    /* compiled from: AuthManager.kt */
    public static final class x<T1, T2> implements io.reactivex.b.d<com.iqoption.core.e, com.iqoption.core.e> {
        /* renamed from: a */
        public final boolean test(com.iqoption.core.e eVar, com.iqoption.core.e eVar2) {
            kotlin.jvm.internal.i.f(eVar, "old");
            kotlin.jvm.internal.i.f(eVar2, "new");
            return eVar.Et() == eVar2.Et();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "old", "Lcom/iqoption/core/IQAccount;", "new", "test", "com/iqoption/core/manager/AuthManager$accountChanges$1"})
    /* compiled from: AuthManager.kt */
    public static final class y<T1, T2> implements io.reactivex.b.d<com.iqoption.core.e, com.iqoption.core.e> {
        /* renamed from: a */
        public final boolean test(com.iqoption.core.e eVar, com.iqoption.core.e eVar2) {
            kotlin.jvm.internal.i.f(eVar, "old");
            kotlin.jvm.internal.i.f(eVar2, "new");
            return eVar.getUserId() == eVar2.getUserId();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthError;", "it", "", "apply"})
    /* compiled from: AuthManager.kt */
    static final class z<T, R> implements io.reactivex.b.g<Throwable, l> {
        public static final z bjG = new z();

        z() {
        }

        /* renamed from: t */
        public final d apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return new d(com.iqoption.core.d.getString(com.iqoption.core.i.k.unknown_error_occurred), th.getMessage());
        }
    }

    public final j Yk() {
        kotlin.d dVar = bjc;
        kotlin.reflect.j jVar = anY[0];
        return (j) dVar.getValue();
    }

    static {
        PublishProcessor bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<Unit>()");
        biX = bmK;
        io.reactivex.e bkT = biV.bkT();
        kotlin.jvm.internal.i.e(bkT, "hasSessionProcessor.distinctUntilChanged()");
        biZ = bkT;
        com.iqoption.core.rx.d dVar = biW;
        bja = dVar;
        bkT = dVar.g(f.bjo);
        kotlin.jvm.internal.i.e(bkT, "accountProcessor.map { a… != IQAccount.EMPTY\n    }");
        bjb = bkT;
        com.iqoption.core.rx.i.aki().m(AnonymousClass1.bje);
        com.iqoption.core.microservices.core.a.brP.acU().a((io.reactivex.b.c) AnonymousClass2.bjf).g(AnonymousClass3.bjg).cF(com.iqoption.core.e.aZu.Ur()).bla().d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) AnonymousClass4.bjh, (io.reactivex.b.f) AnonymousClass5.bji);
    }

    private i() {
    }

    public final io.reactivex.b.l<com.iqoption.core.e> Yh() {
        return biY;
    }

    public final io.reactivex.e<com.iqoption.core.e> Yi() {
        return bja;
    }

    public final com.iqoption.core.e Yj() {
        com.iqoption.core.e eVar = (com.iqoption.core.e) biW.getValue();
        return eVar != null ? eVar : com.iqoption.core.e.aZu.Ur();
    }

    private final JsonObject a(JsonObject jsonObject, JsonObject jsonObject2) {
        String str = "id";
        a(str, jsonObject, jsonObject2);
        long a = com.iqoption.core.ext.d.a(jsonObject, "id", 0, 2, null);
        long a2 = com.iqoption.core.ext.d.a(jsonObject2, "user_id", 0, 2, null);
        if (a2 > 0 && a != a2) {
            jsonObject.addProperty(str, (Number) Long.valueOf(a2));
        }
        a("balance_id", jsonObject, jsonObject2);
        a("birthdate", jsonObject, jsonObject2);
        e("email", jsonObject, jsonObject2);
        e("new_email", jsonObject, jsonObject2);
        e("tin", jsonObject, jsonObject2);
        e("phone", jsonObject, jsonObject2);
        e("city", jsonObject, jsonObject2);
        e("address", jsonObject, jsonObject2);
        e("postal_index", jsonObject, jsonObject2);
        e("gender", jsonObject, jsonObject2);
        e("user_group", jsonObject, jsonObject2);
        b("client_category_id", jsonObject, jsonObject2);
        d("trial", jsonObject, jsonObject2);
        d("is_activated", jsonObject, jsonObject2);
        d("auth_two_factor", jsonObject, jsonObject2);
        e("first_name", jsonObject, jsonObject2);
        e("last_name", jsonObject, jsonObject2);
        e("nickname", jsonObject, jsonObject2);
        e("nationality", jsonObject, jsonObject2);
        c("messages", jsonObject, jsonObject2);
        a("group_id", jsonObject, jsonObject2);
        a("country_id", jsonObject, jsonObject2);
        e("locale", jsonObject, jsonObject2);
        e("flag", jsonObject, jsonObject2);
        c("deposit_count", jsonObject, jsonObject2);
        c("public", jsonObject, jsonObject2);
        f("kyc", jsonObject, jsonObject2);
        f("personal_data_policy", jsonObject, jsonObject2);
        f("forget_status", jsonObject, jsonObject2);
        return jsonObject;
    }

    private final boolean a(String str, JsonObject jsonObject, JsonObject jsonObject2) {
        if (jsonObject2.has(str)) {
            long a = com.iqoption.core.ext.d.a(jsonObject, str, 0, 2, null);
            long a2 = com.iqoption.core.ext.d.a(jsonObject2, str, 0, 2, null);
            if (a2 > 0 && a != a2) {
                jsonObject.addProperty(str, (Number) Long.valueOf(a2));
                return true;
            }
        }
        return false;
    }

    private final boolean b(String str, JsonObject jsonObject, JsonObject jsonObject2) {
        if (jsonObject2.has(str)) {
            int a = com.iqoption.core.ext.d.a(jsonObject, str, 0, 2, null);
            int a2 = com.iqoption.core.ext.d.a(jsonObject2, str, 0, 2, null);
            if (a2 > 0 && a != a2) {
                jsonObject.addProperty(str, (Number) Integer.valueOf(a2));
                return true;
            }
        }
        return false;
    }

    private final boolean c(String str, JsonObject jsonObject, JsonObject jsonObject2) {
        if (jsonObject2.has(str)) {
            int a = com.iqoption.core.ext.d.a(jsonObject, str, 0, 2, null);
            int a2 = com.iqoption.core.ext.d.a(jsonObject2, str, 0, 2, null);
            if (a != a2) {
                jsonObject.addProperty(str, (Number) Integer.valueOf(a2));
                return true;
            }
        }
        return false;
    }

    private final boolean d(String str, JsonObject jsonObject, JsonObject jsonObject2) {
        if (jsonObject2.has(str)) {
            boolean a = com.iqoption.core.ext.d.a(jsonObject, str, false, 2, null);
            boolean a2 = com.iqoption.core.ext.d.a(jsonObject2, str, false, 2, null);
            if (a != a2) {
                jsonObject.addProperty(str, Boolean.valueOf(a2));
                return true;
            }
        }
        return false;
    }

    private final boolean e(String str, JsonObject jsonObject, JsonObject jsonObject2) {
        if (jsonObject2.has(str)) {
            String a = com.iqoption.core.ext.d.a(jsonObject, str, null, 2, null);
            String a2 = com.iqoption.core.ext.d.a(jsonObject2, str, null, 2, null);
            if ((kotlin.jvm.internal.i.y(a, a2) ^ 1) != 0) {
                jsonObject.addProperty(str, a2);
                return true;
            }
        }
        return false;
    }

    private final boolean f(String str, JsonObject jsonObject, JsonObject jsonObject2) {
        if (jsonObject2.has(str)) {
            JsonObject a = com.iqoption.core.ext.d.a(jsonObject, str, null, 2, null);
            jsonObject2 = com.iqoption.core.ext.d.a(jsonObject2, str, null, 2, null);
            if ((kotlin.jvm.internal.i.y(a, jsonObject2) ^ 1) != 0) {
                jsonObject.add(str, jsonObject2);
                return true;
            }
        }
        return false;
    }

    private final void Yl() {
        biV.onNext(Boolean.valueOf(com.iqoption.core.connect.http.c.baF.UL() != null));
    }

    private final void Ym() {
        Cookie UL = com.iqoption.core.connect.http.c.baF.UL();
        if (UL == null) {
            return;
        }
        if (com.iqoption.core.ext.e.f(UL) || com.iqoption.core.data.d.e.bdq.Eh() == null) {
            com.iqoption.core.microservices.auth.a.blA.Zf().h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) u.bjE, (io.reactivex.b.f) v.bjF);
        }
    }

    public final io.reactivex.a Yn() {
        io.reactivex.a blf = com.iqoption.core.microservices.auth.a.blA.Zf().h((io.reactivex.b.f) n.bjy).blf();
        kotlin.jvm.internal.i.e(blf, "AuthRequests.generateAut…         .ignoreElement()");
        return blf;
    }

    public io.reactivex.p<l> a(q qVar) {
        kotlin.jvm.internal.i.f(qVar, "loginAuthInfo");
        io.reactivex.p h = Yk().a(qVar).u(h.bjq).h((io.reactivex.b.f) i.bjr);
        kotlin.jvm.internal.i.e(h, "authProvider.login(login…ssion()\n                }");
        return h;
    }

    public io.reactivex.p<l> a(af afVar) {
        kotlin.jvm.internal.i.f(afVar, "verifyInfo");
        io.reactivex.p u = Yk().a(afVar).u(t.bjD);
        kotlin.jvm.internal.i.e(u, "authProvider.resendCode(…essage)\n                }");
        return u;
    }

    public io.reactivex.p<l> b(af afVar) {
        kotlin.jvm.internal.i.f(afVar, "verifyInfo");
        io.reactivex.p h = Yk().b(afVar).u(z.bjG).h((io.reactivex.b.f) aa.bjH);
        kotlin.jvm.internal.i.e(h, "authProvider.verify(veri…ssion()\n                }");
        return h;
    }

    public io.reactivex.p<l> a(z zVar) {
        z zVar2;
        kotlin.jvm.internal.i.f(zVar, "authInfo");
        long Wk = com.iqoption.core.data.d.a.bdi.Wk();
        if (!com.iqoption.core.d.Un().Ds() || Wk <= 0) {
            zVar2 = zVar;
        } else {
            zVar2 = z.a(zVar, null, null, null, null, false, Long.valueOf(Wk), null, null, 223, null);
        }
        io.reactivex.p h = Yk().a(zVar2).u(o.bjz).h((io.reactivex.b.f) p.bjA);
        kotlin.jvm.internal.i.e(h, "authProvider.register(re…Event()\n                }");
        return h;
    }

    public io.reactivex.p<l> a(p pVar) {
        kotlin.jvm.internal.i.f(pVar, "authInfo");
        long Wk = com.iqoption.core.data.d.a.bdi.Wk();
        if (com.iqoption.core.d.Un().Ds() && Wk > 0) {
            pVar = p.a(pVar, null, null, false, Long.valueOf(Wk), null, null, 55, null);
        }
        io.reactivex.p h = Yk().a(pVar).u(d.bjm).h((io.reactivex.b.f) e.bjn);
        kotlin.jvm.internal.i.e(h, "authProvider.endTrial(en…ssion()\n                }");
        return h;
    }

    public io.reactivex.p<l> Yo() {
        io.reactivex.p h = Yk().Yo().u(a.bjj).h((io.reactivex.b.f) b.bjk);
        kotlin.jvm.internal.i.e(h, "authProvider.anonymRegis…Event()\n                }");
        return h;
    }

    public io.reactivex.p<l> a(aa aaVar) {
        aa aaVar2;
        aa aaVar3 = aaVar;
        kotlin.jvm.internal.i.f(aaVar3, "authInfo");
        long Wk = com.iqoption.core.data.d.a.bdi.Wk();
        if (!com.iqoption.core.d.Un().Ds() || Wk <= 0) {
            aaVar2 = aaVar3;
        } else {
            aaVar2 = aa.a(aaVar, null, null, null, null, null, null, null, null, false, Long.valueOf(Wk), null, null, 3583, null);
        }
        io.reactivex.p h = Yk().a(aaVar2).u(q.bjB).h((io.reactivex.b.f) r.bjC);
        kotlin.jvm.internal.i.e(h, "authProvider.registerSoc…ssion()\n                }");
        return h;
    }

    public io.reactivex.p<l> a(o oVar) {
        kotlin.jvm.internal.i.f(oVar, "authInfo");
        io.reactivex.p h = Yk().a(oVar).u(j.bjs).h((io.reactivex.b.f) k.bjt);
        kotlin.jvm.internal.i.e(h, "authProvider.loginSocial…ssion()\n                }");
        return h;
    }

    public io.reactivex.p<l> a(y yVar) {
        kotlin.jvm.internal.i.f(yVar, "authInfo");
        return Yk().a(yVar);
    }

    public final io.reactivex.a Yp() {
        io.reactivex.a o = io.reactivex.p.j(l.bju).o(m.bjv);
        kotlin.jvm.internal.i.e(o, "Single\n                .…      }\n                }");
        return o;
    }

    public final io.reactivex.e<com.iqoption.core.e> Yq() {
        io.reactivex.e a = bjd.Yi().a((io.reactivex.b.d) new x());
        kotlin.jvm.internal.i.e(a, "AuthManager.account\n    …d, new)\n                }");
        return a;
    }

    public final io.reactivex.e<com.iqoption.core.e> Yr() {
        io.reactivex.e a = bjd.Yi().a((io.reactivex.b.d) new y());
        kotlin.jvm.internal.i.e(a, "AuthManager.account\n    …d, new)\n                }");
        return a;
    }

    public final io.reactivex.e<com.iqoption.core.e> Ys() {
        io.reactivex.e a = bjd.Yi().a((io.reactivex.b.d) new s());
        kotlin.jvm.internal.i.e(a, "AuthManager.account\n    …d, new)\n                }");
        return a;
    }

    public final io.reactivex.e<com.iqoption.core.e> Yt() {
        io.reactivex.e a = bjd.Yi().a((io.reactivex.b.d) new c());
        kotlin.jvm.internal.i.e(a, "AuthManager.account\n    …d, new)\n                }");
        return a;
    }

    public final io.reactivex.e<com.iqoption.core.e> Yu() {
        io.reactivex.e a = bjd.Yi().a((io.reactivex.b.d) new w());
        kotlin.jvm.internal.i.e(a, "AuthManager.account\n    …d, new)\n                }");
        return a;
    }
}
