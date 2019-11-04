package com.iqoption.welcome.c;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.i.k;
import com.iqoption.core.manager.af;
import com.iqoption.core.manager.g;
import com.iqoption.core.manager.h;
import com.iqoption.core.manager.l;
import com.iqoption.core.manager.m;
import com.iqoption.core.manager.y;
import com.iqoption.core.ui.f.d;
import com.iqoption.welcome.e;
import com.iqoption.welcome.n;
import io.reactivex.b.f;
import io.reactivex.p;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000f\u001a\u00020\u0005H\u0014R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/welcome/recover/PasswordRecoveryViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "passwordRecovery", "Landroidx/lifecycle/LiveData;", "", "getPasswordRecovery", "()Landroidx/lifecycle/LiveData;", "passwordRecoveryResult", "Landroidx/lifecycle/MutableLiveData;", "route", "Lcom/iqoption/welcome/WelcomeScreen;", "getRoute", "routeData", "", "identifier", "recoverySingle", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "Companion", "welcome_release"})
/* compiled from: PasswordRecoveryViewModel.kt */
public final class c extends d {
    private static final String TAG = c.class.getSimpleName();
    public static final a emd = new a();
    private final MutableLiveData<n> elO = new MutableLiveData();
    private final LiveData<n> elP = this.elO;
    private final MutableLiveData<String> emb = new MutableLiveData();
    private final LiveData<String> emc = this.emb;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/welcome/recover/PasswordRecoveryViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "get", "Lcom/iqoption/welcome/recover/PasswordRecoveryViewModel;", "f", "Landroidx/fragment/app/Fragment;", "activity", "Landroidx/fragment/app/FragmentActivity;", "welcome_release"})
    /* compiled from: PasswordRecoveryViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c bp(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "f");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(c.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(f)…eryViewModel::class.java]");
            return (c) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PasswordRecoveryViewModel.kt */
    static final class b<T> implements f<l> {
        final /* synthetic */ c eme;

        b(c cVar) {
            this.eme = cVar;
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            if (lVar instanceof m) {
                this.eme.emb.setValue(com.iqoption.core.d.getString(k.password_recovery_sent));
            } else if (lVar instanceof com.iqoption.core.manager.k) {
                this.eme.emb.setValue(((com.iqoption.core.manager.k) lVar).getMessage());
            } else if (lVar instanceof g) {
                this.eme.emb.setValue(((g) lVar).getMessage());
            } else if (lVar instanceof h) {
                this.eme.emb.setValue(com.iqoption.core.d.getString(k.login_limit_exceeded));
            } else if (lVar instanceof com.iqoption.core.manager.b) {
                com.iqoption.core.manager.b bVar = (com.iqoption.core.manager.b) lVar;
                com.iqoption.core.ext.a.c(this.eme.elO, new e(new af(bVar.Yf(), bVar.Ye(), bVar.getToken(), bVar.Yd(), null, 16, null)));
            } else if (lVar instanceof com.iqoption.core.manager.d) {
                this.eme.emb.setValue(((com.iqoption.core.manager.d) lVar).getMessage());
            } else {
                this.eme.emb.setValue(null);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PasswordRecoveryViewModel.kt */
    static final class c<T> implements f<Throwable> {
        final /* synthetic */ c eme;

        c(c cVar) {
            this.eme = cVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.eme.emb.setValue(null);
        }
    }

    public final LiveData<n> bad() {
        return this.elP;
    }

    public final LiveData<String> bah() {
        return this.emc;
    }

    public final void kh(String str) {
        kotlin.jvm.internal.i.f(str, "identifier");
        io.reactivex.disposables.b a = ki(str).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((f) new b(this), (f) new c(this));
        kotlin.jvm.internal.i.e(a, "recoverySingle(identifie…                       })");
        b(a);
    }

    /* Access modifiers changed, original: protected */
    public p<l> ki(String str) {
        kotlin.jvm.internal.i.f(str, "identifier");
        return com.iqoption.core.manager.i.bjd.a(new y(str, null, 2, null));
    }
}
