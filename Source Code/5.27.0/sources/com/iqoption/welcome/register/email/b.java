package com.iqoption.welcome.register.email;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.manager.af;
import com.iqoption.core.manager.g;
import com.iqoption.core.manager.h;
import com.iqoption.core.manager.l;
import com.iqoption.core.manager.m;
import com.iqoption.core.manager.z;
import com.iqoption.core.util.u;
import com.iqoption.welcome.o;
import io.reactivex.b.f;
import io.reactivex.p;
import io.reactivex.t;
import java.util.concurrent.Callable;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0014J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J&\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015J.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0014J\u0006\u0010\u001a\u001a\u00020\u000fJ\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0015H\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001e"}, bng = {"Lcom/iqoption/welcome/register/email/EmailRegistrationViewModel;", "Lcom/iqoption/welcome/register/BaseRegistrationViewModel;", "()V", "<set-?>", "", "isTrialEnding", "()Z", "setTrialEnding", "(Z)V", "isTrialEnding$delegate", "Lkotlin/properties/ReadWriteProperty;", "anonymRegisterSingle", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "init", "", "fragment", "Landroidx/fragment/app/Fragment;", "_isTrialEnding", "register", "identifier", "", "password", "name", "surname", "registerSingle", "registerTrial", "reportErrorWarningShown", "message", "Companion", "welcome_release"})
/* compiled from: EmailRegistrationViewModel.kt */
public class b extends com.iqoption.welcome.register.c {
    private static final String TAG = b.class.getSimpleName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(b.class), "isTrialEnding", "isTrialEnding()Z"))};
    public static final a ems = new a();
    private final kotlin.f.d emr = kotlin.f.a.eWg.bnQ();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/welcome/register/email/EmailRegistrationViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "welcome_release"})
    /* compiled from: EmailRegistrationViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthError;", "call"})
    /* compiled from: EmailRegistrationViewModel.kt */
    static final class c<V> implements Callable<T> {
        final /* synthetic */ String $identifier;
        final /* synthetic */ String $password;
        final /* synthetic */ boolean elS;
        final /* synthetic */ b emt;

        c(b bVar, String str, boolean z, String str2) {
            this.emt = bVar;
            this.$identifier = str;
            this.elS = z;
            this.$password = str2;
        }

        /* renamed from: baf */
        public final com.iqoption.core.manager.d call() {
            Integer valueOf;
            if (com.iqoption.welcome.c.ekd.A(this.$identifier, this.elS)) {
                valueOf = !com.iqoption.welcome.c.ekd.kf(this.$password) ? Integer.valueOf(com.iqoption.core.i.k.newpassword_too_short) : null;
            } else {
                valueOf = Integer.valueOf(this.elS ? com.iqoption.core.i.k.incorrect_email_or_phone : com.iqoption.core.i.k.please_enter_valid_email);
            }
            if (valueOf == null) {
                return null;
            }
            String string = com.iqoption.core.d.getString(valueOf.intValue());
            this.emt.kj(string);
            return new com.iqoption.core.manager.d(string, null, 2, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: EmailRegistrationViewModel.kt */
    static final class b<T> implements f<l> {
        final /* synthetic */ String $identifier;
        final /* synthetic */ b emt;

        b(b bVar, String str) {
            this.emt = bVar;
            this.$identifier = str;
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            boolean z = lVar instanceof m;
            if (!z) {
                this.emt.baI().setValue(Boolean.valueOf(false));
            }
            if (z) {
                com.iqoption.core.data.d.a.bdi.fJ(this.$identifier);
                this.emt.baF().aZA();
            } else if (lVar instanceof g) {
                com.iqoption.core.ext.a.c(this.emt.baH(), ((g) lVar).getMessage());
            } else if (lVar instanceof h) {
                com.iqoption.core.ext.a.c(this.emt.baH(), com.iqoption.core.d.getString(com.iqoption.core.i.k.login_limit_exceeded));
            } else if (lVar instanceof com.iqoption.core.manager.b) {
                com.iqoption.core.manager.b bVar = (com.iqoption.core.manager.b) lVar;
                com.iqoption.core.ext.a.c(this.emt.baJ(), new com.iqoption.welcome.k(new af(bVar.Yf(), bVar.Ye(), bVar.getToken(), bVar.Yd(), null, 16, null)));
            } else if (lVar instanceof com.iqoption.core.manager.d) {
                MutableLiveData c = this.emt.baH();
                com.iqoption.core.manager.d dVar = (com.iqoption.core.manager.d) lVar;
                Object message = dVar.getMessage();
                if (message == null) {
                    message = com.iqoption.core.d.getString(com.iqoption.core.i.k.unknown_error_occurred);
                }
                com.iqoption.core.ext.a.c(c, message);
                String Yg = dVar.Yg();
            } else {
                com.iqoption.core.ext.a.c(this.emt.baH(), com.iqoption.core.d.getString(com.iqoption.core.i.k.unknown_error_occurred));
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: EmailRegistrationViewModel.kt */
    static final class d<T> implements f<l> {
        final /* synthetic */ b emt;

        d(b bVar) {
            this.emt = bVar;
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            boolean z = lVar instanceof m;
            if (!z) {
                this.emt.baI().setValue(Boolean.valueOf(false));
            }
            if (z) {
                this.emt.baF().aZB();
            } else if (lVar instanceof com.iqoption.core.manager.d) {
                com.iqoption.core.ext.a.c(this.emt.baH(), ((com.iqoption.core.manager.d) lVar).getMessage());
            }
        }
    }

    private final boolean baS() {
        return ((Boolean) this.emr.b(this, anY[0])).booleanValue();
    }

    private final void fy(boolean z) {
        this.emr.a(this, anY[0], Boolean.valueOf(z));
    }

    public final void f(Fragment fragment, boolean z) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        a(o.ekt.N(com.iqoption.core.ext.a.r(fragment)));
        fy(z);
    }

    public final void g(String str, String str2, String str3, String str4) {
        kotlin.jvm.internal.i.f(str, "identifier");
        kotlin.jvm.internal.i.f(str2, "password");
        kotlin.jvm.internal.i.f(str3, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str4, "surname");
        baI().setValue(Boolean.valueOf(true));
        Object obj = (Boolean) bae().getValue();
        if (obj == null) {
            obj = Boolean.valueOf(false);
        }
        kotlin.jvm.internal.i.e(obj, "phoneRegState.value ?: false");
        io.reactivex.i g = io.reactivex.i.g(new c(this, str, obj.booleanValue(), str2));
        kotlin.jvm.internal.i.e(g, "Maybe.fromCallable<AuthR…)\n            }\n        }");
        io.reactivex.disposables.b e = g.b((t) com.iqoption.core.d.EC().Cb().a((t) h(str, str2, str3, str4))).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).e((f) new b(this, str));
        kotlin.jvm.internal.i.e(e, "inputValidatorStream.swi…     }\n                })");
        b(e);
    }

    public final void baT() {
        baI().setValue(Boolean.valueOf(true));
        io.reactivex.disposables.b e = baU().h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).e((f) new d(this));
        kotlin.jvm.internal.i.e(e, "anonymRegisterSingle()\n …     }\n                })");
        b(e);
    }

    /* Access modifiers changed, original: protected */
    public p<l> baU() {
        return com.iqoption.core.manager.i.bjd.Yo();
    }

    /* Access modifiers changed, original: protected */
    public p<l> h(String str, String str2, String str3, String str4) {
        String str5 = str;
        kotlin.jvm.internal.i.f(str, "identifier");
        String str6 = str2;
        kotlin.jvm.internal.i.f(str2, "password");
        kotlin.jvm.internal.i.f(str3, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str4, "surname");
        if (baS()) {
            return com.iqoption.core.manager.i.bjd.a(new com.iqoption.core.manager.p(str, str2, false, null, null, null, 60, null));
        }
        return com.iqoption.core.manager.i.bjd.a(new z(str, str2, str3, str4, false, null, null, null, 240, null));
    }

    private final void kj(String str) {
        com.iqoption.core.d.EC().g("registration_error", 0.0d, u.anp().o("error_name", str).anr()).Cc();
    }
}
