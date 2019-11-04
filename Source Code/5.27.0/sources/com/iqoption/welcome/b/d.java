package com.iqoption.welcome.b;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.iqoption.core.i.k;
import com.iqoption.core.manager.af;
import com.iqoption.core.manager.g;
import com.iqoption.core.manager.h;
import com.iqoption.core.manager.l;
import com.iqoption.core.manager.m;
import com.iqoption.core.manager.q;
import com.iqoption.welcome.n;
import com.iqoption.welcome.o;
import io.reactivex.b.f;
import io.reactivex.p;
import io.reactivex.t;
import java.util.concurrent.Callable;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0014R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000¨\u0006\""}, bng = {"Lcom/iqoption/welcome/login/LoginViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "isProgressShown", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "isProgressShownData", "Lcom/iqoption/core/data/livedata/IQMutableLiveData;", "phoneRegState", "getPhoneRegState", "route", "Lcom/iqoption/welcome/WelcomeScreen;", "getRoute", "routeData", "Landroidx/lifecycle/MutableLiveData;", "toastMessage", "", "getToastMessage", "toastMessageData", "welcomeStateViewModel", "Lcom/iqoption/welcome/WelcomeStateViewModel;", "init", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "login", "identifier", "password", "loginSingle", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "email", "Companion", "welcome_release"})
/* compiled from: LoginViewModel.kt */
public class d extends com.iqoption.core.ui.f.d {
    private static final String TAG = d.class.getSimpleName();
    public static final a elQ = new a();
    private o dUI;
    private final com.iqoption.core.data.b.c<Boolean> elK = new com.iqoption.core.data.b.c(Boolean.valueOf(false));
    private final LiveData<Boolean> elL = this.elK;
    private final MutableLiveData<String> elM = new MutableLiveData();
    private final LiveData<String> elN = this.elM;
    private final MutableLiveData<n> elO = new MutableLiveData();
    private final LiveData<n> elP = this.elO;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/welcome/login/LoginViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "welcome_release"})
    /* compiled from: LoginViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/AuthError;", "call"})
    /* compiled from: LoginViewModel.kt */
    static final class c<V> implements Callable<T> {
        final /* synthetic */ String $identifier;
        final /* synthetic */ String $password;
        final /* synthetic */ boolean elS;

        c(String str, boolean z, String str2) {
            this.$identifier = str;
            this.elS = z;
            this.$password = str2;
        }

        /* renamed from: baf */
        public final com.iqoption.core.manager.d call() {
            Integer valueOf;
            if (com.iqoption.welcome.c.ekd.A(this.$identifier, this.elS)) {
                valueOf = !com.iqoption.welcome.c.ekd.kf(this.$password) ? Integer.valueOf(k.newpassword_too_short) : null;
            } else {
                valueOf = Integer.valueOf(this.elS ? k.incorrect_email_or_phone : k.please_enter_valid_email);
            }
            if (valueOf != null) {
                return new com.iqoption.core.manager.d(com.iqoption.core.d.getString(valueOf.intValue()), null, 2, null);
            }
            return null;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LoginViewModel.kt */
    static final class b<T> implements f<l> {
        final /* synthetic */ String $identifier;
        final /* synthetic */ d elR;

        b(d dVar, String str) {
            this.elR = dVar;
            this.$identifier = str;
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            boolean z = lVar instanceof m;
            if (!z) {
                this.elR.elK.setValue(Boolean.valueOf(false));
            }
            if (z) {
                com.iqoption.core.data.d.a.bdi.fJ(this.$identifier);
                d.b(this.elR).aZz();
            } else if (lVar instanceof g) {
                com.iqoption.core.ext.a.c(this.elR.elM, ((g) lVar).getMessage());
            } else if (lVar instanceof h) {
                com.iqoption.core.ext.a.c(this.elR.elM, com.iqoption.core.d.getString(k.login_limit_exceeded));
            } else if (lVar instanceof com.iqoption.core.manager.b) {
                com.iqoption.core.manager.b bVar = (com.iqoption.core.manager.b) lVar;
                com.iqoption.core.ext.a.c(this.elR.elO, new com.iqoption.welcome.k(new af(bVar.Yf(), bVar.Ye(), bVar.getToken(), bVar.Yd(), null, 16, null)));
            } else if (lVar instanceof com.iqoption.core.manager.d) {
                MutableLiveData c = this.elR.elM;
                com.iqoption.core.manager.d dVar = (com.iqoption.core.manager.d) lVar;
                Object message = dVar.getMessage();
                if (message == null) {
                    message = com.iqoption.core.d.getString(k.unknown_error_occurred);
                }
                com.iqoption.core.ext.a.c(c, message);
                String Yg = dVar.Yg();
            } else {
                com.iqoption.core.ext.a.c(this.elR.elM, com.iqoption.core.d.getString(k.unknown_error_occurred));
            }
        }
    }

    public static final /* synthetic */ o b(d dVar) {
        o oVar = dVar.dUI;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG("welcomeStateViewModel");
        }
        return oVar;
    }

    public final void O(FragmentActivity fragmentActivity) {
        kotlin.jvm.internal.i.f(fragmentActivity, "activity");
        this.dUI = o.ekt.N(fragmentActivity);
    }

    public final LiveData<Boolean> bab() {
        return this.elL;
    }

    public final LiveData<String> bac() {
        return this.elN;
    }

    public final LiveData<n> bad() {
        return this.elP;
    }

    public final LiveData<Boolean> bae() {
        o oVar = this.dUI;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG("welcomeStateViewModel");
        }
        return oVar.aZy();
    }

    public final void aG(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "identifier");
        kotlin.jvm.internal.i.f(str2, "password");
        this.elK.setValue(Boolean.valueOf(true));
        Object obj = (Boolean) bae().getValue();
        if (obj == null) {
            obj = Boolean.valueOf(false);
        }
        kotlin.jvm.internal.i.e(obj, "phoneRegState.value ?: false");
        io.reactivex.i g = io.reactivex.i.g(new c(str, obj.booleanValue(), str2));
        kotlin.jvm.internal.i.e(g, "Maybe.fromCallable<AuthR…)\n            }\n        }");
        io.reactivex.disposables.b e = g.b((t) aH(str, str2)).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).e((f) new b(this, str));
        kotlin.jvm.internal.i.e(e, "inputValidatorStream.swi…     }\n                })");
        b(e);
    }

    /* Access modifiers changed, original: protected */
    public p<l> aH(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "email");
        kotlin.jvm.internal.i.f(str2, "password");
        return com.iqoption.core.manager.i.bjd.a(new q(str, str2, null, 4, null));
    }
}
