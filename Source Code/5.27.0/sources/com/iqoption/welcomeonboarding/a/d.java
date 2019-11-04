package com.iqoption.welcomeonboarding.a;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.manager.l;
import com.iqoption.core.manager.m;
import io.reactivex.b.f;
import io.reactivex.p;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014¨\u0006\n"}, bng = {"Lcom/iqoption/welcomeonboarding/viewmodels/IQLoginViewModel;", "Lcom/iqoption/welcome/login/LoginViewModel;", "()V", "loginSingle", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "email", "", "password", "Companion", "app_optionXRelease"})
/* compiled from: IQLoginViewModel.kt */
public final class d extends com.iqoption.welcome.b.d {
    public static final a eoc = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/welcomeonboarding/viewmodels/IQLoginViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/welcomeonboarding/viewmodels/IQLoginViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "app_optionXRelease"})
    /* compiled from: IQLoginViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d bw(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(d.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ginViewModel::class.java)");
            d dVar = (d) viewModel;
            dVar.O(com.iqoption.core.ext.a.r(fragment));
            return dVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "result", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: IQLoginViewModel.kt */
    static final class b<T> implements f<l> {
        public static final b eod = new b();

        b() {
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            if (lVar instanceof m) {
                com.iqoption.app.d Fa = com.iqoption.app.d.Fa();
                kotlin.jvm.internal.i.e(Fa, "Preferences.instance()");
                Fa.ba(true);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public p<l> aH(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "email");
        kotlin.jvm.internal.i.f(str2, "password");
        p h = super.aH(str, str2).h((f) b.eod);
        kotlin.jvm.internal.i.e(h, "super.loginSingle(email,…      }\n                }");
        return h;
    }
}
