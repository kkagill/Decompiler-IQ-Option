package com.iqoption.welcome.register.social;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.iqoption.core.i.k;
import com.iqoption.core.manager.aa;
import com.iqoption.core.manager.g;
import com.iqoption.core.manager.h;
import com.iqoption.core.manager.l;
import com.iqoption.core.manager.m;
import com.iqoption.welcome.d;
import com.iqoption.welcome.o;
import com.iqoption.welcome.register.c;
import io.reactivex.p;
import io.reactivex.t;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/welcome/register/social/SocialRegistrationViewModel;", "Lcom/iqoption/welcome/register/BaseRegistrationViewModel;", "()V", "facebookAuthViewModel", "Lcom/iqoption/welcome/social/FacebookAuthViewModel;", "googleAuthViewModel", "Lcom/iqoption/welcome/social/GoogleAuthViewModel;", "init", "", "fragment", "Landroidx/fragment/app/Fragment;", "registerSingle", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "authInfo", "Lcom/iqoption/core/manager/SocialAuthInfo;", "registerSocial", "socialLogout", "Companion", "welcome_release"})
/* compiled from: SocialRegistrationViewModel.kt */
public class f extends c {
    private static final String TAG = f.class.getSimpleName();
    public static final a emB = new a();
    private com.iqoption.welcome.d.c elA;
    private com.iqoption.welcome.d.b elB;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/welcome/register/social/SocialRegistrationViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "welcome_release"})
    /* compiled from: SocialRegistrationViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: SocialRegistrationViewModel.kt */
    static final class b<T> implements io.reactivex.b.f<l> {
        final /* synthetic */ f emC;

        b(f fVar) {
            this.emC = fVar;
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            boolean z = lVar instanceof m;
            if (!z) {
                this.emC.baI().setValue(Boolean.valueOf(false));
            }
            if (z) {
                this.emC.baF().aZA();
            } else if (lVar instanceof g) {
                com.iqoption.core.ext.a.c(this.emC.baH(), ((g) lVar).getMessage());
                com.iqoption.core.ext.a.c(this.emC.baJ(), d.eke);
            } else if (lVar instanceof h) {
                com.iqoption.core.ext.a.c(this.emC.baH(), com.iqoption.core.d.getString(k.login_limit_exceeded));
                com.iqoption.core.ext.a.c(this.emC.baJ(), d.eke);
            } else if (lVar instanceof com.iqoption.core.manager.b) {
                com.iqoption.core.ext.a.c(this.emC.baH(), com.iqoption.core.d.getString(k.unknown_error_occurred));
            } else if (lVar instanceof com.iqoption.core.manager.d) {
                MutableLiveData c = this.emC.baH();
                com.iqoption.core.manager.d dVar = (com.iqoption.core.manager.d) lVar;
                Object message = dVar.getMessage();
                if (message == null) {
                    message = com.iqoption.core.d.getString(k.unknown_error_occurred);
                }
                com.iqoption.core.ext.a.c(c, message);
                String Yg = dVar.Yg();
            } else {
                com.iqoption.core.ext.a.c(this.emC.baH(), com.iqoption.core.d.getString(k.unknown_error_occurred));
            }
        }
    }

    public final void an(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        FragmentActivity r = com.iqoption.core.ext.a.r(fragment);
        a(o.ekt.N(r));
        this.elB = com.iqoption.welcome.m.ekn.aZw().L(r);
        this.elA = com.iqoption.welcome.m.ekn.aZw().M(r);
    }

    public final void c(aa aaVar) {
        kotlin.jvm.internal.i.f(aaVar, "authInfo");
        baI().setValue(Boolean.valueOf(true));
        io.reactivex.disposables.b e = d(aaVar).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).e((io.reactivex.b.f) new b(this));
        kotlin.jvm.internal.i.e(e, "registerSingle(authInfo)…     }\n                })");
        b(e);
    }

    /* Access modifiers changed, original: protected */
    public p<l> d(aa aaVar) {
        kotlin.jvm.internal.i.f(aaVar, "authInfo");
        p a = com.iqoption.core.d.EC().Cb().a((t) com.iqoption.core.manager.i.bjd.a(aaVar));
        kotlin.jvm.internal.i.e(a, "analytics.checkAppsFlyer…ocial(authInfo)\n        )");
        return a;
    }

    public final void bbl() {
        baF().aZE();
        com.iqoption.welcome.d.b bVar = this.elB;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("facebookAuthViewModel");
        }
        bVar.logout();
        com.iqoption.welcome.d.c cVar = this.elA;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("googleAuthViewModel");
        }
        cVar.logout();
    }
}
