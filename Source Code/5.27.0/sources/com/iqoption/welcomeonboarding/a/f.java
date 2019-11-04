package com.iqoption.welcomeonboarding.a;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.app.d;
import com.iqoption.core.manager.af;
import com.iqoption.core.manager.l;
import com.iqoption.core.manager.m;
import io.reactivex.p;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\t"}, bng = {"Lcom/iqoption/welcomeonboarding/viewmodels/IQTwoStepAuthViewModel;", "Lcom/iqoption/welcome/twostepauth/VerifyAuthViewModel;", "()V", "loginSingle", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "verifyInfo", "Lcom/iqoption/core/manager/VerifyInfo;", "Companion", "app_optionXRelease"})
/* compiled from: IQTwoStepAuthViewModel.kt */
public final class f extends com.iqoption.welcome.twostepauth.b {
    public static final a eoi = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/welcomeonboarding/viewmodels/IQTwoStepAuthViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/welcomeonboarding/viewmodels/IQTwoStepAuthViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "app_optionXRelease"})
    /* compiled from: IQTwoStepAuthViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final f by(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(f.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…uthViewModel::class.java)");
            f fVar = (f) viewModel;
            fVar.O(com.iqoption.core.ext.a.r(fragment));
            return fVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "result", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: IQTwoStepAuthViewModel.kt */
    static final class b<T> implements io.reactivex.b.f<l> {
        public static final b eoj = new b();

        b() {
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            if (lVar instanceof m) {
                d Fa = d.Fa();
                kotlin.jvm.internal.i.e(Fa, "Preferences.instance()");
                Fa.ba(true);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public p<l> f(af afVar) {
        kotlin.jvm.internal.i.f(afVar, "verifyInfo");
        p h = super.f(afVar).h((io.reactivex.b.f) b.eoj);
        kotlin.jvm.internal.i.e(h, "super.loginSingle(verify…      }\n                }");
        return h;
    }
}
