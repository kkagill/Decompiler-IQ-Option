package com.iqoption.welcomeonboarding.a;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.k;
import com.iqoption.core.manager.aa;
import com.iqoption.core.manager.l;
import com.iqoption.core.manager.m;
import com.iqoption.mobbtech.connect.request.h;
import com.iqoption.welcome.register.social.f;
import io.reactivex.p;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\t"}, bng = {"Lcom/iqoption/welcomeonboarding/viewmodels/IQSocialRegistrationViewModel;", "Lcom/iqoption/welcome/register/social/SocialRegistrationViewModel;", "()V", "registerSingle", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "authInfo", "Lcom/iqoption/core/manager/SocialAuthInfo;", "Companion", "app_optionXRelease"})
/* compiled from: IQSocialRegistrationViewModel.kt */
public final class e extends f {
    public static final a eoe = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/welcomeonboarding/viewmodels/IQSocialRegistrationViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/welcomeonboarding/viewmodels/IQSocialRegistrationViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "app_optionXRelease"})
    /* compiled from: IQSocialRegistrationViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final e bx(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(e.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ionViewModel::class.java)");
            e eVar = (e) viewModel;
            eVar.an(fragment);
            return eVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: IQSocialRegistrationViewModel.kt */
    static final class b<T> implements io.reactivex.b.f<io.reactivex.disposables.b> {
        final /* synthetic */ e eog;

        b(e eVar) {
            this.eog = eVar;
        }

        /* renamed from: c */
        public final void accept(io.reactivex.disposables.b bVar) {
            this.eog.baL();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "result", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: IQSocialRegistrationViewModel.kt */
    static final class c<T> implements io.reactivex.b.f<l> {
        final /* synthetic */ e eog;
        final /* synthetic */ aa eoh;

        c(e eVar, aa aaVar) {
            this.eog = eVar;
            this.eoh = aaVar;
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            if (lVar instanceof m) {
                Context Eu = IQApp.Eu();
                com.iqoption.app.b.aK(Eu).Go();
                com.iqoption.app.d Fa = com.iqoption.app.d.Fa();
                Fa.h(Boolean.valueOf(true));
                Fa.dM(0);
                Fa.ac(System.currentTimeMillis());
                com.iqoption.app.b DG = com.iqoption.app.b.DG();
                DG.a(this.eoh.Yx());
                DG.dv(this.eoh.Yy());
                DG.dw(this.eoh.YA());
                DG.aM(Eu);
                if (!com.iqoption.core.data.d.a.bdi.Wh()) {
                    k.f(IQApp.Eu(), 4);
                }
                h.a(Eu, null, false, false);
                this.eog.baM();
                return;
            }
            this.eog.baN();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: IQSocialRegistrationViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ e eog;

        d(e eVar) {
            this.eog = eVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.eog.baN();
        }
    }

    /* Access modifiers changed, original: protected */
    public p<l> d(aa aaVar) {
        kotlin.jvm.internal.i.f(aaVar, "authInfo");
        p i = super.d(aaVar).g((io.reactivex.b.f) new b(this)).h((io.reactivex.b.f) new c(this, aaVar)).i((io.reactivex.b.f) new d(this));
        kotlin.jvm.internal.i.e(i, "super.registerSingle(aut…_ -> reportErrorEvent() }");
        return i;
    }
}
